package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent;", "", "<init>", "()V", "Title", "PayPalLogo", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$None;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$PayPalLogo;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$Title;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InAppCheckoutHeaderCenterContent {
    public static final int $stable = 0;

    private InAppCheckoutHeaderCenterContent() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$Title;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent;", "", "text", "Lcom/paypal/pds/core/Typography;", "typography", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/Typography;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/Typography;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/Typography;)Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$Title;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/pds/core/Typography;", "getTypography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Title extends com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent {
        public static final int $stable = 0;
        private final java.lang.String text;
        private final com.paypal.pds.core.Typography typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Title(java.lang.String str, com.paypal.pds.core.Typography typography) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
            this.text = str;
            this.typography = typography;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public /* synthetic */ Title(java.lang.String str, com.paypal.pds.core.Typography.TitleMedium titleMedium, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? com.paypal.pds.core.Typography.TitleMedium.INSTANCE : titleMedium);
        }

        public final com.paypal.pds.core.Typography getTypography() {
            return this.typography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            com.paypal.pds.core.Typography typography = this.typography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Title(text=");
            sb.append(str);
            sb.append(", typography=");
            sb.append(typography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + this.typography.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title title = (com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, title.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.typography, title.typography);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title copy(java.lang.String text, com.paypal.pds.core.Typography typography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title(text, typography);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.core.Typography getTypography() {
            return this.typography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title copy$default(com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title title, java.lang.String str, com.paypal.pds.core.Typography typography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = title.text;
            }
            if ((i & 2) != 0) {
                typography = title.typography;
            }
            return title.copy(str, typography);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$PayPalLogo;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayPalLogo extends com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.PayPalLogo INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.PayPalLogo();

        public final int hashCode() {
            return 1751696081;
        }

        private PayPalLogo() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PayPalLogo";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.PayPalLogo)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent$None;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterContent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.None INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.None();

        public final int hashCode() {
            return -902990549;
        }

        private None() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.None)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ InAppCheckoutHeaderCenterContent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
