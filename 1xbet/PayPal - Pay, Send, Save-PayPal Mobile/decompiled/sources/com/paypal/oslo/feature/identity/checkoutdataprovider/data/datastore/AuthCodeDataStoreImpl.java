package com.paypal.oslo.feature.identity.checkoutdataprovider.data.datastore;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/data/datastore/AuthCodeDataStoreImpl;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "Ljava/util/concurrent/atomic/AtomicReference;", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "getAuthCode", "()Ljava/lang/String;", "", "setAuthCode", "(Ljava/lang/String;)V", "clearAuthCode", "()V", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthCodeDataStoreImpl implements com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AuthCodeDataStoreImpl(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        this.getHighSpeedVideoFpsRanges = atomicReference;
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore
    public final java.lang.String getAuthCode() {
        return this.getHighSpeedVideoFpsRanges.get();
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore
    public final void setAuthCode(java.lang.String authCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCode, "");
        this.getHighSpeedVideoFpsRanges.set(authCode);
    }

    @Override // com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore
    public final void clearAuthCode() {
        this.getHighSpeedVideoFpsRanges.set(null);
    }
}
