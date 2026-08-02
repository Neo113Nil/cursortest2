package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig;", "", "Companion", "Icon", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Icon;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Image;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface FundingInstrumentFallbackConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Companion INSTANCE = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Icon;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig;", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/pds/core/Color;", "iconTint", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lcom/paypal/pds/core/Color;", "copy", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Icon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/pds/core/Color;", "getIconTint"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Icon implements com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;
        private final com.paypal.pds.core.Color iconTint;

        public Icon(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
            this.icon = icon;
            this.iconTint = color;
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final com.paypal.pds.core.Color getIconTint() {
            return this.iconTint;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            com.paypal.pds.core.Color color = this.iconTint;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(icon=");
            sb.append(icon);
            sb.append(", iconTint=");
            sb.append(color);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.icon.hashCode() * 31) + this.iconTint.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon icon = (com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, icon.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconTint, icon.iconTint);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon copy(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color iconTint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconTint, "");
            return new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon(icon, iconTint);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.pds.core.Color getIconTint() {
            return this.iconTint;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon icon, com.paypal.pds.core.Icon icon2, com.paypal.pds.core.Color color, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon2 = icon.icon;
            }
            if ((i & 2) != 0) {
                color = icon.iconTint;
            }
            return icon.copy(icon2, color);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Image;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Image;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Image implements com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig {
        public static final int $stable = 0;
        private final java.lang.String url;

        public Image(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image) other).url);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image image, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = image.url;
            }
            return image.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;", "type", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig;", "getFundingInstrumentFallbackConfig", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentTypeUiModel;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/FundingInstrumentFallbackConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Companion();

        private Companion() {
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig getFundingInstrumentFallbackConfig(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            if (type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Bank) {
                return new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon(com.paypal.pds.core.Icon.Bank.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE);
            }
            if ((type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Card) || kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.Unknown.INSTANCE)) {
                return new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image("https://www.paypalobjects.com/subscriptions/Fallback%203x.png");
            }
            if (!(type instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal) && !kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, com.paypal.pds.core.Color.Unspecified.INSTANCE);
        }
    }
}
