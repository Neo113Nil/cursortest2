package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "", "Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;", "entity", "", "existingBytes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "execute", "(Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;J)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DownloadEngine {
    kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.impl.engine.DownloadResult> execute(com.paypal.oslo.downloads.impl.data.entity.DownloadEntity entity, long existingBytes);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ kotlinx.coroutines.flow.Flow execute$default(com.paypal.oslo.downloads.impl.engine.DownloadEngine downloadEngine, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return downloadEngine.execute(downloadEntity, j);
    }
}
