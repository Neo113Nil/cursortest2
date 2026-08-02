package com.paypal.oslo.feature.settings.closeaccount.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "name", "CloseScreen", "NavigateToDestination", "OpenWebView", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$CloseScreen;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$NavigateToDestination;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$OpenWebView;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CloseAccountEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;

    private CloseAccountEffect() {
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "CloseAccountEffect" : simpleName;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$CloseScreen;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseScreen extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.CloseScreen INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.CloseScreen();

        public final int hashCode() {
            return -1837067291;
        }

        private CloseScreen() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CloseScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.CloseScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$NavigateToDestination;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$NavigateToDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDestination extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDestination(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDestination(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination) other).destination);
        }

        public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.NavigateToDestination navigateToDestination, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigateToDestination.destination;
            }
            return navigateToDestination.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$OpenWebView;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "", "url", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect$OpenWebView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenWebView extends com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect {
        public static final int $stable = 0;
        private final java.lang.String title;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenWebView(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.title = str2;
        }

        public /* synthetic */ OpenWebView(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenWebView(url=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.title;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView)) {
                return false;
            }
            com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView openWebView = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openWebView.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, openWebView.title);
        }

        public final com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView copy(java.lang.String url, java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView(url, title);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect.OpenWebView openWebView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openWebView.url;
            }
            if ((i & 2) != 0) {
                str2 = openWebView.title;
            }
            return openWebView.copy(str, str2);
        }
    }

    public /* synthetic */ CloseAccountEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
