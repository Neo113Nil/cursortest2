package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/DocumentRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "Lcom/paypal/oslo/feature/bnplservicing/data/document/StaticDocumentClient;", "staticDocumentClient", "Lcom/paypal/oslo/feature/bnplservicing/data/document/DynamicDocumentClient;", "dynamicDocumentClient", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/data/document/StaticDocumentClient;Lcom/paypal/oslo/feature/bnplservicing/data/document/DynamicDocumentClient;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;", "request", "Landroid/net/Uri;", "getStaticDocument", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDynamicDocument", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/data/document/StaticDocumentClient;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplservicing/data/document/DynamicDocumentClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentRepositoryImpl extends com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DocumentRepositoryImpl(com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient staticDocumentClient, com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient dynamicDocumentClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticDocumentClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDocumentClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = staticDocumentClient;
        this.getHighSpeedVideoFpsRangesFor = dynamicDocumentClient;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository
    public final java.lang.Object getStaticDocument(com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super android.net.Uri> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.downloadDocument(documentDownloadRequest, continuation);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository
    public final java.lang.Object getDynamicDocument(com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super android.net.Uri> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.downloadDocument(documentDownloadRequest, continuation);
    }
}
