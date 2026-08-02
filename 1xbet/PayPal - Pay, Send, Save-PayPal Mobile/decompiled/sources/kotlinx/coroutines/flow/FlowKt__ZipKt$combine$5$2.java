package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class FlowKt__ZipKt$combine$5$2<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = flowCollector2;
            this.Camera2StreamConfigurationMap = 1;
            obj = function2.invoke(objArr, this);
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
        }
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        ((kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes).emit(this.getHighResolutionOutputSizeshNQ4ISI.invoke((java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor, this), this);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2 flowKt__ZipKt$combine$5$2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        flowKt__ZipKt$combine$5$2.getHighSpeedVideoSizes = flowCollector;
        flowKt__ZipKt$combine$5$2.getHighSpeedVideoFpsRangesFor = tArr;
        return flowKt__ZipKt$combine$5$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$2(kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
