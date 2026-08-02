package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00058\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "", "p0", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "p1", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "", "Camera2StreamConfigurationMap", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RelativeScroller {
    final int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    float getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super java.lang.Float>, ? extends java.lang.Object> function2) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = function2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        int i;
        if (continuation instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) continuation;
            if ((relativeScroller$scrollBy$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = relativeScroller$scrollBy$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = relativeScroller$scrollBy$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
                    relativeScroller$scrollBy$1.Camera2StreamConfigurationMap = 1;
                    obj = function2.invoke(boxFloat, relativeScroller$scrollBy$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRangesFor += ((java.lang.Number) obj).floatValue();
                return kotlin.Unit.INSTANCE;
            }
        }
        relativeScroller$scrollBy$1 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1(this, continuation);
        java.lang.Object obj2 = relativeScroller$scrollBy$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = relativeScroller$scrollBy$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRangesFor += ((java.lang.Number) obj2).floatValue();
        return kotlin.Unit.INSTANCE;
    }
}
