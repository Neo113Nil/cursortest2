package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/payair/logic/managers/RegistrationStatusManagerImpl;", "Lcom/payair/logic/managers/RegistrationStatusManager;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/logic/storage/StorageService;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/storage/StorageService;)V", "Lcom/payair/model/RegistrationStatus;", "checkRegistrationStatus", "()Lcom/payair/model/RegistrationStatus;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegistrationStatusManagerImpl implements com.payair.logic.managers.RegistrationStatusManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4448a;
    public final com.payair.logic.storage.StorageService b;

    public RegistrationStatusManagerImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.storage.StorageService storageService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        this.f4448a = hceSDKInterface;
        this.b = storageService;
    }

    @Override // com.payair.logic.managers.RegistrationStatusManager
    public final com.payair.model.RegistrationStatus checkRegistrationStatus() {
        boolean isRegistrationComplete = this.b.isRegistrationComplete();
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("If user is registered, fingerprint should be completed [");
        sb.append(isRegistrationComplete);
        sb.append("].");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        return isRegistrationComplete ? this.f4448a.hasVersionCheckFailed() ? com.payair.model.RegistrationStatus.UNSUPPORTED_VERSION_DETECTED : com.payair.model.RegistrationStatus.REGISTERED : com.payair.model.RegistrationStatus.LOGOUT;
    }
}
