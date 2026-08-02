package com.paypal.oslo.feature.bnplservicing.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000b2\u00020\u0001:\b\f\r\u000e\u000f\u0010\u0011\u0012\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "Companion", "Unknown", "PayLaterHub", "PayLaterHubApply", "PayLaterHubUnusedVC", "PlansList", "PlanDetails", "DeepLink", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$DeepLink;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHub;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHubApply;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHubUnusedVC;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PlansList;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PayLaterSource {
    public static final java.lang.String PLHUB_SOURCE_APPLY = "paylaterhub_appl";
    public static final java.lang.String PLHUB_SOURCE_UNUSED_VC = "paylaterhub_unused_vc";
    public static final java.lang.String VALUE_PAYLATER_HUB = "paylaterhub";
    public static final java.lang.String VALUE_PLANS_LIST = "planslist";
    public static final java.lang.String VALUE_PLAN_DETAILS = "plandetails";
    public static final java.lang.String VALUE_UNKNOWN = "UNKNOWN";
    private java.lang.String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Companion INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Companion(null);
    public static final int $stable = 8;

    private PayLaterSource(java.lang.String str) {
        this.value = str;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$Unknown;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unknown extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown();
        public static final int $stable = 8;

        private Unknown() {
            super("UNKNOWN", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHub;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayLaterHub extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub();
        public static final int $stable = 8;

        private PayLaterHub() {
            super(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PAYLATER_HUB, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHubApply;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayLaterHubApply extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubApply INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubApply();
        public static final int $stable = 8;

        private PayLaterHubApply() {
            super(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PLHUB_SOURCE_APPLY, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PayLaterHubUnusedVC;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PayLaterHubUnusedVC extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubUnusedVC INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubUnusedVC();
        public static final int $stable = 8;

        private PayLaterHubUnusedVC() {
            super(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PLHUB_SOURCE_UNUSED_VC, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PlansList;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlansList extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlansList INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlansList();
        public static final int $stable = 8;

        private PlansList() {
            super(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PLANS_LIST, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlanDetails extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlanDetails INSTANCE = new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlanDetails();
        public static final int $stable = 8;

        private PlanDetails() {
            super(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PLAN_DETAILS, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$DeepLink;", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$DeepLink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "setValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeepLink extends com.paypal.oslo.feature.bnplservicing.common.PayLaterSource {
        public static final int $stable = 8;
        private java.lang.String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeepLink(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.common.PayLaterSource
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.common.PayLaterSource
        public final void setValue(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.value = str;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeepLink(value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink) other).value);
        }

        public final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink copy(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink(value);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink copy$default(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink deepLink, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deepLink.value;
            }
            return deepLink.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$Unknown;", "defaultSource", "()Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource$Unknown;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/common/PayLaterSource;", "VALUE_UNKNOWN", "Ljava/lang/String;", "VALUE_PAYLATER_HUB", "PLHUB_SOURCE_APPLY", "PLHUB_SOURCE_UNUSED_VC", "VALUE_PLAN_DETAILS", "VALUE_PLANS_LIST"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown defaultSource() {
            return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown.INSTANCE;
        }

        public final com.paypal.oslo.feature.bnplservicing.common.PayLaterSource from(java.lang.String value) {
            if (kotlin.text.StringsKt.equals(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PAYLATER_HUB, value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub.INSTANCE;
            }
            if (kotlin.text.StringsKt.equals(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PLHUB_SOURCE_APPLY, value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubApply.INSTANCE;
            }
            if (kotlin.text.StringsKt.equals(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PLHUB_SOURCE_UNUSED_VC, value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHubUnusedVC.INSTANCE;
            }
            if (kotlin.text.StringsKt.equals(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PLAN_DETAILS, value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlanDetails.INSTANCE;
            }
            if (kotlin.text.StringsKt.equals(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.VALUE_PLANS_LIST, value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlansList.INSTANCE;
            }
            if (kotlin.text.StringsKt.equals("UNKNOWN", value, true)) {
                return com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.Unknown.INSTANCE;
            }
            java.lang.String str = value;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return defaultSource();
            }
            return new com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.DeepLink(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PayLaterSource(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
