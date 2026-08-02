package com.paypal.oslo.feature.bnplacquisition.data.document;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/document/DynamicDocumentClient;", "Lcom/paypal/oslo/feature/bnplacquisition/data/document/DocumentClient;", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;)V", "", "url", "buildFullUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicDocumentClient extends com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.graphql.config.GraphQlConfig getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public DynamicDocumentClient(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig) {
        super(downloadManager, urlValidator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQlConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = graphQlConfig;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient
    protected final java.lang.String buildFullUrl(java.lang.String url) {
        java.lang.String dropLast;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl(), (java.lang.CharSequence) "/v2/", false, 2, (java.lang.Object) null)) {
            dropLast = this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl().substring(0, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl(), "/v2/", 0, false, 6, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dropLast, "");
        } else {
            dropLast = kotlin.text.StringsKt.endsWith$default(this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl(), androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.dropLast(this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl(), 1) : this.getHighResolutionOutputSizeshNQ4ISI.getBaseUrl();
        }
        if (!kotlin.text.StringsKt.startsWith$default(url, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            url = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(java.lang.String.valueOf(url));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dropLast);
        sb.append(url);
        return sb.toString();
    }
}
