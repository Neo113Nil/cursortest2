package com.onesignal.user.internal.migrations;

import com.onesignal.common.IDManager;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public final class RecoverFromDroppedLoginBug implements IStartableService {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;

    public RecoverFromDroppedLoginBug(IOperationRepo _operationRepo, IdentityModelStore _identityModelStore, ConfigModelStore _configModelStore) {
        i.e(_operationRepo, "_operationRepo");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._operationRepo = _operationRepo;
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInBadState() {
        return (this._identityModelStore.getModel().getExternalId() == null || !IDManager.INSTANCE.isLocalId(this._identityModelStore.getModel().getOnesignalId()) || this._operationRepo.containsInstanceOf(t.a(LoginUserOperation.class))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recoverByAddingBackDroppedLoginOperation() {
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new LoginUserOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), null), false, 2, null);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        ThreadUtilsKt.suspendifyOnIO(new RecoverFromDroppedLoginBug$start$1(this, null));
    }
}
