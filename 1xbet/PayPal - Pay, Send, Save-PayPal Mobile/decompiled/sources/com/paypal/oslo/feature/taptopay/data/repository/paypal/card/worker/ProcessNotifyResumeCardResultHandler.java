package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessNotifyResumeCardResultHandler;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessWorkerResultHandler;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;", "writeStore", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessNotifyResumeCardResultHandler extends com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessWorkerResultHandler<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId, java.lang.Object> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public ProcessNotifyResumeCardResultHandler(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ResumeCardStore resumeCardStore) {
        super(context, resumeCardStore, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resumeCardStore, "");
    }
}
