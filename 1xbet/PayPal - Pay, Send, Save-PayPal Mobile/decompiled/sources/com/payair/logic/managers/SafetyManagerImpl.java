package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/payair/logic/managers/SafetyManagerImpl;", "Lcom/payair/logic/managers/SafetyManager;", "Lcom/payair/db/Database;", "database", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "<init>", "(Lcom/payair/db/Database;Lcom/payair/logic/implementation/HceSDKInterface;)V", "Lcom/payair/logic/managers/SdkState;", "checkSdkState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SafetyManagerImpl implements com.payair.logic.managers.SafetyManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.db.Database f4449a;
    public final com.payair.logic.implementation.HceSDKInterface b;

    public SafetyManagerImpl(com.payair.db.Database database, com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4449a = database;
        this.b = hceSDKInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.SafetyManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkSdkState(kotlin.coroutines.Continuation<? super com.payair.logic.managers.SdkState> continuation) {
        com.payair.csdk.f2 f2Var;
        int i;
        com.payair.logic.managers.SafetyManagerImpl safetyManagerImpl;
        if (continuation instanceof com.payair.csdk.f2) {
            f2Var = (com.payair.csdk.f2) continuation;
            int i2 = f2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f2Var.d = i2 - 2147483648;
                java.lang.Object obj = f2Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f2Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao = this.f4449a.getDatabaseSettingsDao();
                    f2Var.f4249a = this;
                    f2Var.d = 1;
                    obj = databaseSettingsDao.getValue("initialized", f2Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    safetyManagerImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safetyManagerImpl = f2Var.f4249a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(obj, "true");
                boolean checkSdkState = safetyManagerImpl.b.checkSdkState();
                return (areEqual || !checkSdkState) ? (!areEqual || checkSdkState) ? (areEqual || checkSdkState) ? com.payair.logic.managers.SdkState.Unknown : com.payair.logic.managers.SdkState.Wiped : com.payair.logic.managers.SdkState.Uninitialized : com.payair.logic.managers.SdkState.Initialized;
            }
        }
        f2Var = new com.payair.csdk.f2(this, continuation);
        java.lang.Object obj2 = f2Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f2Var.d;
        if (i != 0) {
        }
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(obj2, "true");
        boolean checkSdkState2 = safetyManagerImpl.b.checkSdkState();
        if (areEqual2) {
        }
    }
}
