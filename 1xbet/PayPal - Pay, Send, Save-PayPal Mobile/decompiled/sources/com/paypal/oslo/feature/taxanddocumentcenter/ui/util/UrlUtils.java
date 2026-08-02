package com.paypal.oslo.feature.taxanddocumentcenter.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/util/UrlUtils;", "", "<init>", "()V", "", "fileName", "buildCustomStatementDownloadPath$tax_and_document_center_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "articleId", "buildHelpCenterArticlePath$tax_and_document_center_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.util.UrlUtils INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.util.UrlUtils();

    private UrlUtils() {
    }

    public final java.lang.String buildCustomStatementDownloadPath$tax_and_document_center_prodRelease(java.lang.String fileName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        return "/v1/customer/transaction-statements?id=".concat(java.lang.String.valueOf(fileName));
    }

    public final java.lang.String buildHelpCenterArticlePath$tax_and_document_center_prodRelease(java.lang.String articleId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(articleId, "");
        return "/helpcenter/showArticle?articleId=".concat(java.lang.String.valueOf(articleId));
    }
}
