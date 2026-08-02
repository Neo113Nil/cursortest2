package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/DocumentRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/DocumentRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/data/document/StaticDocumentClient;", "staticDocumentClient", "Lcom/paypal/oslo/feature/bnplacquisition/data/document/DynamicDocumentClient;", "dynamicDocumentClient", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/data/document/StaticDocumentClient;Lcom/paypal/oslo/feature/bnplacquisition/data/document/DynamicDocumentClient;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentError;", "Landroid/net/Uri;", "getStaticDocument", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDynamicDocument", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/data/document/StaticDocumentClient;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/data/document/DynamicDocumentClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentRepositoryImpl implements com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DocumentRepositoryImpl(com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient staticDocumentClient, com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient dynamicDocumentClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticDocumentClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDocumentClient, "");
        this.getHighSpeedVideoFpsRangesFor = staticDocumentClient;
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicDocumentClient;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository
    public final java.lang.Object getStaticDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError, ? extends android.net.Uri>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.downloadDocument(documentDownloadRequest, continuation);
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository
    public final java.lang.Object getDynamicDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError, ? extends android.net.Uri>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.downloadDocument(documentDownloadRequest, continuation);
    }
}
