package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "ShowError", "LinkingComplete", "UserCancelledLinking", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$LinkingComplete;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$ShowError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$UserCancelledLinking;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PartnerLinkingUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private PartnerLinkingUiEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$ShowError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "ShowError";
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError) other).message);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.ShowError showError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.message;
            }
            return showError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$LinkingComplete;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$LinkingComplete;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRedirectUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkingComplete extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String redirectUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkingComplete(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.redirectUrl = str;
            this.name = "LinkingComplete";
        }

        public final java.lang.String getRedirectUrl() {
            return this.redirectUrl;
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.redirectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkingComplete(redirectUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redirectUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUrl, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete) other).redirectUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete copy(java.lang.String redirectUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete(redirectUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRedirectUrl() {
            return this.redirectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.LinkingComplete linkingComplete, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = linkingComplete.redirectUrl;
            }
            return linkingComplete.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect$UserCancelledLinking;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserCancelledLinking extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.UserCancelledLinking INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.UserCancelledLinking();
        private static final java.lang.String name = "UserCancelledLinking";

        public final int hashCode() {
            return 2059947740;
        }

        private UserCancelledLinking() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "UserCancelledLinking";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiEffect.UserCancelledLinking)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PartnerLinkingUiEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
