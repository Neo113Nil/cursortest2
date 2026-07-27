package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.Model;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class SingletonModelStore<TModel extends Model> implements ISingletonModelStore<TModel>, IModelStoreChangeHandler<TModel> {
    private final EventProducer<ISingletonModelStoreChangeHandler<TModel>> changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final ModelStore<TModel> store;

    public SingletonModelStore(ModelStore<TModel> store) {
        i.e(store, "store");
        this.store = store;
        this.changeSubscription = new EventProducer<>();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        store.subscribe((IModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStore
    public TModel getModel() {
        synchronized (this) {
            TModel tmodel = this.store.get(this.singletonId);
            if (tmodel != null) {
                return tmodel;
            }
            TModel tmodel2 = (TModel) IModelStore.DefaultImpls.create$default(this.store, null, 1, null);
            if (tmodel2 != null) {
                tmodel2.setId(this.singletonId);
                IModelStore.DefaultImpls.add$default(this.store, tmodel2, null, 2, null);
                return tmodel2;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final ModelStore<TModel> getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(TModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(TModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        this.changeSubscription.fire(new SingletonModelStore$onModelUpdated$1(args, tag));
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStore
    public void replace(TModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        synchronized (this.replaceLock) {
            TModel model2 = getModel();
            model2.initializeFromModel(this.singletonId, model);
            this.store.persist();
            this.changeSubscription.fire(new SingletonModelStore$replace$1$1(model2, tag));
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ISingletonModelStoreChangeHandler<TModel> handler) {
        i.e(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ISingletonModelStoreChangeHandler<TModel> handler) {
        i.e(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }
}
