package com.paypal.oslo.feature.bnplservicing.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/repository/DocumentRepository;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;", "request", "Landroid/net/Uri;", "getStaticDocument", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDynamicDocument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DocumentRepository {
    java.lang.Object getDynamicDocument(com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super android.net.Uri> continuation);

    java.lang.Object getStaticDocument(com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super android.net.Uri> continuation);
}
