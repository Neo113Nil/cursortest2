package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkConfigurationManager;", "", "Lcom/payair/logic/managers/ConfigurationManager;", "confManager", "<init>", "(Lcom/payair/logic/managers/ConfigurationManager;)V", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;", "csdkListener", "", "setClientListener", "(Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/CsdkListener;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "updateUnlockKeys", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.android.threeds.utils.NetworkUtil.JWT, "updateJwt", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/ConfigurationManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SdkConfigurationManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.ConfigurationManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SdkConfigurationManager(com.payair.logic.managers.ConfigurationManager configurationManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationManager, "");
        this.getHighSpeedVideoFpsRanges = configurationManager;
    }

    public final void setClientListener(com.paypal.oslo.feature.taptopay.data.payair.csdk.CsdkListener csdkListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(csdkListener, "");
        this.getHighSpeedVideoFpsRanges.setClientListener(csdkListener);
    }

    public final java.lang.Object updateUnlockKeys(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateUnlockKeys = this.getHighSpeedVideoFpsRanges.updateUnlockKeys(str, continuation);
        return updateUnlockKeys == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUnlockKeys : kotlin.Unit.INSTANCE;
    }

    public final void updateJwt(java.lang.String jwt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
        this.getHighSpeedVideoFpsRanges.updateJWT(jwt);
    }
}
