package com.onesignal.user.internal.operations.impl.listeners;

import B4.r;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.DeleteTagOperation;
import com.onesignal.user.internal.operations.SetPropertyOperation;
import com.onesignal.user.internal.operations.SetTagOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PropertiesModelStoreListener extends SingletonModelStoreListener<PropertiesModel> {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesModelStoreListener(PropertiesModelStore store, IOperationRepo opRepo, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getReplaceOperation(PropertiesModel model) {
        i.e(model, "model");
        return null;
    }

    @Override // com.onesignal.core.internal.operations.listeners.SingletonModelStoreListener
    public Operation getUpdateOperation(PropertiesModel model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        if (r.O(path, "locationTimestamp", false) || r.O(path, "locationBackground", false) || r.O(path, "locationType", false) || r.O(path, "locationAccuracy", false)) {
            return null;
        }
        String externalId = this._identityModelStore.getModel().getExternalId();
        return r.O(path, "tags", false) ? (obj2 == null || !(obj2 instanceof String)) ? new DeleteTagOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property) : new SetTagOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property, (String) obj2) : new SetPropertyOperation(this._configModelStore.getModel().getAppId(), model.getOnesignalId(), externalId, property, obj2);
    }
}
