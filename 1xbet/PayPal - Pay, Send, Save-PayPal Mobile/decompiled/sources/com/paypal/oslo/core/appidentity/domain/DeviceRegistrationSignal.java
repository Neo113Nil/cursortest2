package com.paypal.oslo.core.appidentity.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "", "", "timeoutMs", "", "awaitDeviceId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceId", "", "notifyRegistered", "(Ljava/lang/String;)V", "reset", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeviceRegistrationSignal {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal.Companion INSTANCE = com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal.Companion.Camera2StreamConfigurationMap;
    public static final long DEFAULT_TIMEOUT_MS = 15000;

    java.lang.Object awaitDeviceId(long j, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    void notifyRegistered(java.lang.String deviceId);

    void reset();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object awaitDeviceId$default(com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitDeviceId");
        }
        if ((i & 1) != 0) {
            j = 15000;
        }
        return deviceRegistrationSignal.awaitDeviceId(j, continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal$Companion;", "", "<init>", "()V", "", "DEFAULT_TIMEOUT_MS", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal.Companion();
        public static final long DEFAULT_TIMEOUT_MS = 15000;

        private Companion() {
        }
    }
}
