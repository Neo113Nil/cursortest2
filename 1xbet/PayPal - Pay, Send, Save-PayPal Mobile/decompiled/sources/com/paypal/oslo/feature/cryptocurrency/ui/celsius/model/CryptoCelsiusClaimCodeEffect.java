package com.paypal.oslo.feature.cryptocurrency.ui.celsius.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "", "NavigateBack", "OpenUrl", "ShowProvisioningFlow", "NavigateToErrorScreen", "NavigateToSuccessScreen", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$OpenUrl;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$ShowProvisioningFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoCelsiusClaimCodeEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateBack();

        public final int hashCode() {
            return -122759931;
        }

        private NavigateBack() {
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$OpenUrl;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$OpenUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        public OpenUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenUrl(url=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl) other).url);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl copy$default(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl openUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            return openUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$ShowProvisioningFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$ShowProvisioningFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowProvisioningFlow implements com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect {
        public static final int $stable = 0;
        private final java.lang.String intent;

        public ShowProvisioningFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.intent = str;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowProvisioningFlow(intent=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow) other).intent);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow copy(java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow showProvisioningFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showProvisioningFlow.intent;
            }
            return showProvisioningFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen implements com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return 1789892795;
        }

        private NavigateToErrorScreen() {
        }

        public final java.lang.String toString() {
            return "NavigateToErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/celsius/model/CryptoCelsiusClaimCodeEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccessScreen implements com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToSuccessScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToSuccessScreen();

        public final int hashCode() {
            return 10940598;
        }

        private NavigateToSuccessScreen() {
        }

        public final java.lang.String toString() {
            return "NavigateToSuccessScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToSuccessScreen)) {
                return false;
            }
            return true;
        }
    }
}
