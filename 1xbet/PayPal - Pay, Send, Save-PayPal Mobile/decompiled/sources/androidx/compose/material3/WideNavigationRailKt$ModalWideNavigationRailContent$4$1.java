package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1", f = "WideNavigationRail.kt", i = {}, l = {org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class WideNavigationRailKt$ModalWideNavigationRailContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (function2.invoke(boxFloat, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1 wideNavigationRailKt$ModalWideNavigationRailContent$4$1 = new androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1(this.getHighSpeedVideoFpsRanges, continuation);
        wideNavigationRailKt$ModalWideNavigationRailContent$4$1.Camera2StreamConfigurationMap = floatValue;
        return wideNavigationRailKt$ModalWideNavigationRailContent$4$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$ModalWideNavigationRailContent$4$1(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
