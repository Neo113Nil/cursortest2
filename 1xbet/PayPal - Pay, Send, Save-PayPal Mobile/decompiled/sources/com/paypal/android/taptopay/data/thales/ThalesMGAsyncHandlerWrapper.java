package com.paypal.android.taptopay.data.thales;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/ThalesMGAsyncHandlerWrapper;", "T", "Lcom/gemalto/mfs/mwsdk/mobilegateway/utils/MGAbstractAsyncHandler;", "Lkotlin/Function1;", "Lcom/gemalto/mfs/mwsdk/mobilegateway/utils/MGAsyncResult;", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "result", "onComplete", "(Lcom/gemalto/mfs/mwsdk/mobilegateway/utils/MGAsyncResult;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThalesMGAsyncHandlerWrapper<T> extends com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAbstractAsyncHandler<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<T>, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ThalesMGAsyncHandlerWrapper(kotlin.jvm.functions.Function1<? super com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<T>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAbstractAsyncHandler
    public final void onComplete(com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<T> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoSizes.invoke(result);
    }
}
