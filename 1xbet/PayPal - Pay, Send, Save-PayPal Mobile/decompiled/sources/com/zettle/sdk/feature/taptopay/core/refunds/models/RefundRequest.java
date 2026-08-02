package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "", "", "amount", "(J)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "", "build", "()Ljava/lang/String;", "id", "cardPaymentUuid", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RefundRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest amount(long amount);

    java.lang.String build();

    com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest cardPaymentUuid(java.lang.String id);

    com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest reference(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/PlatformInfo;", "platformInfo", "Lcom/zettle/sdk/core/os/LocationData;", "lastLocation", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;", "create", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundRequest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequest create(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
            return new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundRequestImpl(appInfo, platformInfo, lastLocation);
        }
    }
}
