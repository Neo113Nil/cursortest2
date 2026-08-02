package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "p1", "Lkotlinx/coroutines/CoroutineScope;", "p2", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository;Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;Lkotlinx/coroutines/CoroutineScope;)V", "", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Result;", "", "invoke", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CvmLimitsUsecaseImpl implements com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase {
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics getHighSpeedVideoSizes;

    public CvmLimitsUsecaseImpl(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository cvmLimitsRepository, com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmLimitsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(herdAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = cvmLimitsRepository;
        this.getHighSpeedVideoSizes = herdAnalytics;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, ? extends kotlin.Unit> function1) {
        invoke2(str, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(java.lang.String p0, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Result, kotlin.Unit> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(this.getHighResolutionOutputSizeshNQ4ISI, new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl$invoke$1(this, p0, p1, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2.equals("VISA") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r2 = com.zettle.sdk.feature.taptopay.core.models.CardScheme.VISA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r2.equals("VISA_ELECTRON") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (r2.equals("MASTERCARD") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r2.equals("MAESTRO") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007e, code lost:
    
        r2 = com.zettle.sdk.feature.taptopay.core.models.CardScheme.MASTER;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.CvmLimits getHighSpeedVideoFpsRangesFor(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl cvmLimitsUsecaseImpl, com.zettle.sdk.feature.taptopay.core.models.CvmLimitsRemote cvmLimitsRemote) {
        com.zettle.sdk.feature.taptopay.core.models.CardScheme cardScheme;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : cvmLimitsRemote.getLimits().entrySet()) {
            java.lang.String key = entry.getKey();
            switch (key.hashCode()) {
                case -1553624974:
                    break;
                case -780280800:
                    break;
                case 67102:
                    if (key.equals("CUP")) {
                        cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.CUP;
                        break;
                    }
                    cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.ALL;
                    break;
                case 73257:
                    if (key.equals("JCB")) {
                        cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.JCB;
                        break;
                    }
                    cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.ALL;
                    break;
                case 2634817:
                    break;
                case 1055811561:
                    if (key.equals("DISCOVER")) {
                        cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.DISCOVER;
                        break;
                    }
                    cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.ALL;
                    break;
                case 1512044081:
                    if (key.equals("AMERICAN_EXPRESS")) {
                        cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.AMEX;
                        break;
                    }
                    cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.ALL;
                    break;
                case 1545480463:
                    break;
                default:
                    cardScheme = com.zettle.sdk.feature.taptopay.core.models.CardScheme.ALL;
                    break;
            }
            linkedHashMap.put(cardScheme, entry.getValue());
        }
        return new com.zettle.sdk.feature.taptopay.core.models.CvmLimits(linkedHashMap, cvmLimitsRemote.getDefaultLimitValue());
    }
}
