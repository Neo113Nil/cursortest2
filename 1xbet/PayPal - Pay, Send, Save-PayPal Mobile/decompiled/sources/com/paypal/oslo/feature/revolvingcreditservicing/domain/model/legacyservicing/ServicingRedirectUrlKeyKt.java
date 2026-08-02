package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;", "urls", "", "selectUrl", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ServicingRedirectUrlKeyKt {
    public static final java.lang.String selectUrl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls servicingUrls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(servicingRedirectUrlKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(servicingUrls, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKeyKt.WhenMappings.$EnumSwitchMapping$0[servicingRedirectUrlKey.ordinal()]) {
            case 1:
                return servicingUrls.getMakePaymentUrl();
            case 2:
                return servicingUrls.getManageAutopayUrl();
            case 3:
                return servicingUrls.getServicingHomeUrl();
            case 4:
                return servicingUrls.getViewNotificationsUrl();
            case 5:
                return servicingUrls.getViewStatementsUrl();
            case 6:
                return servicingUrls.getManagePaymentsUrl();
            case 7:
                return servicingUrls.getServicingHomeUrl();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.PAYMENTS_ONE_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.PAYMENTS_AUTO_PAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.ACCOUNT_SUMMARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.ALERTS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.STATEMENTS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.PAYMENTS_HISTORY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
