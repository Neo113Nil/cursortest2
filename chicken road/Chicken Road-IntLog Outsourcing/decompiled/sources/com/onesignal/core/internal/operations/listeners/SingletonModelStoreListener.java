package com.onesignal.core.internal.operations.listeners;

import com.onesignal.common.modeling.ISingletonModelStore;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.startup.IBootstrapService;
import java.io.Closeable;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class SingletonModelStoreListener<TModel extends Model> implements ISingletonModelStoreChangeHandler<TModel>, IBootstrapService, Closeable {
    private final IOperationRepo opRepo;
    private final ISingletonModelStore<TModel> store;

    public SingletonModelStoreListener(ISingletonModelStore<TModel> store, IOperationRepo opRepo) {
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        this.store = store;
        this.opRepo = opRepo;
    }

    @Override // com.onesignal.core.internal.startup.IBootstrapService
    public void bootstrap() {
        this.store.subscribe(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.store.unsubscribe(this);
    }

    public abstract Operation getReplaceOperation(TModel tmodel);

    public abstract Operation getUpdateOperation(TModel tmodel, String str, String str2, Object obj, Object obj2);

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(TModel model, String tag) {
        Operation replaceOperation;
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals(ModelChangeTags.NORMAL) && (replaceOperation = getReplaceOperation(model)) != null) {
            IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, replaceOperation, false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (tag.equals(ModelChangeTags.NORMAL)) {
            Model model = args.getModel();
            i.c(model, "null cannot be cast to non-null type TModel of com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener");
            Operation updateOperation = getUpdateOperation(model, args.getPath(), args.getProperty(), args.getOldValue(), args.getNewValue());
            if (updateOperation != null) {
                IOperationRepo.DefaultImpls.enqueue$default(this.opRepo, updateOperation, false, 2, null);
            }
        }
    }
}
