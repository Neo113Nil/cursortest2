package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aJ\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000022\u0010\b\u001a.\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withRunningRecomposer", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recomposerKey", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    public static final int recomposerKey = 1000;

    public static final <R> java.lang.Object withRunningRecomposer(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.Recomposer, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2(function3, null), continuation);
    }
}
