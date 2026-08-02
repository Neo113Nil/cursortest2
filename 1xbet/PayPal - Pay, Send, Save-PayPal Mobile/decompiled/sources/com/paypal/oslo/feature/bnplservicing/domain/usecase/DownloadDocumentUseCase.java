package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/DownloadDocumentUseCase;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;)V", "", "staticUrl", "relativePath", "fileName", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Landroid/net/Uri;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DownloadDocumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DownloadDocumentUseCase(com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository documentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentRepository, "");
        this.getHighSpeedVideoSizes = documentRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super android.net.Uri> continuation) {
        if (str != null) {
            return this.getHighSpeedVideoSizes.getStaticDocument(new com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest(str, str3, str4, creditProductIdentifier), continuation);
        }
        if (str2 != null) {
            return this.getHighSpeedVideoSizes.getDynamicDocument(new com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest(str2, str3, str4, creditProductIdentifier), continuation);
        }
        return null;
    }
}
