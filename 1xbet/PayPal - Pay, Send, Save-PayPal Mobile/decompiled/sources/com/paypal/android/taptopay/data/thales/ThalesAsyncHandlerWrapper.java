package com.paypal.android.taptopay.data.thales;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/ThalesAsyncHandlerWrapper;", "T", "Lcom/gemalto/mfs/mwsdk/utils/async/AbstractAsyncHandler;", "Lkotlin/Function1;", "Lcom/gemalto/mfs/mwsdk/utils/async/AsyncResult;", "Lkotlin/ParameterName;", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "result", "onComplete", "(Lcom/gemalto/mfs/mwsdk/utils/async/AsyncResult;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesAsyncHandlerWrapper<T> extends com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T>, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ThalesAsyncHandlerWrapper(kotlin.jvm.functions.Function1<? super com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // com.gemalto.mfs.mwsdk.utils.async.AbstractAsyncHandler
    public final void onComplete(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getHighSpeedVideoSizes.invoke(result);
    }
}
