package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDeepLinkMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardDeepLinkLauncher;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardDestination;", "mapToDestination", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardDeepLinkLauncher;)Lcom/paypal/oslo/feature/debitcard/api/navigation/DebitCardDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardDeepLinkMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardDeepLinkMapper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r0 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination mapToDestination(com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher launcher) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(launcher, "");
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(launcher.getProductName());
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow fromValue2 = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.INSTANCE.fromValue(launcher.getFlow());
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent fromValue3 = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent.INSTANCE.fromValue(launcher.getFlowIntent());
        java.lang.String value2 = fromValue3 != null ? fromValue3.getValue() : null;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, fromValue);
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, fromValue2 != null ? fromValue2.name() : null);
        pairArr[2] = kotlin.TuplesKt.to("cardId", launcher.getCardId());
        pairArr[3] = kotlin.TuplesKt.to("intent", value2);
        pairArr[4] = kotlin.TuplesKt.to("entryPoint", launcher.getEntryPoint());
        com.paypal.android.logger.Logger.i$default(logger, "Handling deeplink", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (fromValue2 != null) {
            if (fromValue2 == com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.UNKNOWN) {
                fromValue2 = null;
            }
            if (fromValue2 != null) {
                value = fromValue2.getValue();
            }
        }
        value = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.DISPLAY.getValue();
        return new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDestination(fromValue, value, launcher.getCardId(), value2, launcher.getEntryPoint());
    }
}
