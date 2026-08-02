package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;", "", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "content", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "settings", "<init>", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "component2", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "copy", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewContent;", "getContent", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "getSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AcquisitionWebViewData {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.webview.ui.config.SecureWebViewContent content;
    private final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings settings;

    public AcquisitionWebViewData(com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewSettings, "");
        this.content = secureWebViewContent;
        this.settings = secureWebViewSettings;
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewContent getContent() {
        return this.content;
    }

    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings getSettings() {
        return this.settings;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent = this.content;
        com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings = this.settings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AcquisitionWebViewData(content=");
        sb.append(secureWebViewContent);
        sb.append(", settings=");
        sb.append(secureWebViewSettings);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.content.hashCode() * 31) + this.settings.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData acquisitionWebViewData = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, acquisitionWebViewData.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.settings, acquisitionWebViewData.settings);
    }

    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData copy(com.paypal.oslo.core.webview.ui.config.SecureWebViewContent content, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings settings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData(content, settings);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings getSettings() {
        return this.settings;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.webview.ui.config.SecureWebViewContent getContent() {
        return this.content;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewData acquisitionWebViewData, com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureWebViewContent = acquisitionWebViewData.content;
        }
        if ((i & 2) != 0) {
            secureWebViewSettings = acquisitionWebViewData.settings;
        }
        return acquisitionWebViewData.copy(secureWebViewContent, secureWebViewSettings);
    }
}
