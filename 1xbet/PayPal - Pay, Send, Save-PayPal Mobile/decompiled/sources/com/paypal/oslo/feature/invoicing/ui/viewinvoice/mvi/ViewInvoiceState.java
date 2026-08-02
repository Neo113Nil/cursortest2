package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ViewInvoiceState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ViewInvoiceState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState$Ready;", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "webViewConfiguration", "", "shouldRefreshOnResume", "", "refreshKey", "<init>", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;ZI)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "component2", "()Z", "component3", "()I", "copy", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;ZI)Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "getWebViewConfiguration", "Z", "getShouldRefreshOnResume", com.visa.cbp.getEncExpo.warmup, "getRefreshKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState {
        public static final int $stable = com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable;
        private final int refreshKey;
        private final boolean shouldRefreshOnResume;
        private final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration webViewConfiguration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, boolean z, int i) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewConfiguration, "");
            this.webViewConfiguration = secureWebViewConfiguration;
            this.shouldRefreshOnResume = z;
            this.refreshKey = i;
        }

        public /* synthetic */ Ready(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(secureWebViewConfiguration, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration getWebViewConfiguration() {
            return this.webViewConfiguration;
        }

        public final boolean getShouldRefreshOnResume() {
            return this.shouldRefreshOnResume;
        }

        public final int getRefreshKey() {
            return this.refreshKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = this.webViewConfiguration;
            boolean z = this.shouldRefreshOnResume;
            int i = this.refreshKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(webViewConfiguration=");
            sb.append(secureWebViewConfiguration);
            sb.append(", shouldRefreshOnResume=");
            sb.append(z);
            sb.append(", refreshKey=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.webViewConfiguration.hashCode() * 31) + java.lang.Boolean.hashCode(this.shouldRefreshOnResume)) * 31) + java.lang.Integer.hashCode(this.refreshKey);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready ready = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.webViewConfiguration, ready.webViewConfiguration) && this.shouldRefreshOnResume == ready.shouldRefreshOnResume && this.refreshKey == ready.refreshKey;
        }

        public final com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready copy(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration webViewConfiguration, boolean shouldRefreshOnResume, int refreshKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewConfiguration, "");
            return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready(webViewConfiguration, shouldRefreshOnResume, refreshKey);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRefreshKey() {
            return this.refreshKey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldRefreshOnResume() {
            return this.shouldRefreshOnResume;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration getWebViewConfiguration() {
            return this.webViewConfiguration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready copy$default(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready ready, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                secureWebViewConfiguration = ready.webViewConfiguration;
            }
            if ((i2 & 2) != 0) {
                z = ready.shouldRefreshOnResume;
            }
            if ((i2 & 4) != 0) {
                i = ready.refreshKey;
            }
            return ready.copy(secureWebViewConfiguration, z, i);
        }
    }

    public /* synthetic */ ViewInvoiceState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
