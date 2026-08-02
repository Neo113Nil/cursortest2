package kotlinx.coroutines.selects;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {34}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class WhileSelectKt$whileSelect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return kotlinx.coroutines.selects.WhileSelectKt.whileSelect(null, this);
    }

    WhileSelectKt$whileSelect$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1> continuation) {
        super(continuation);
    }
}
