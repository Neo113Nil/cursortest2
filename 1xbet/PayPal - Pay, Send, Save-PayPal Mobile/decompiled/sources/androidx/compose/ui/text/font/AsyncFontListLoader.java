package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028W@SX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010*\u001a\u00020)8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull$ui_text", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/font/TypefaceRequest;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "cacheable", "Z", "getCacheable$ui_text", "()Z", "setCacheable$ui_text", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AsyncFontListLoader implements androidx.compose.runtime.State<java.lang.Object> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.TypefaceRequest getHighSpeedVideoFpsRanges;
    private boolean cacheable = true;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.AsyncTypefaceCache getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.text.font.Font> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.PlatformFontLoader Camera2StreamConfigurationMap;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(java.util.List<? extends androidx.compose.ui.text.font.Font> list, java.lang.Object obj, androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> function1, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader) {
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = typefaceRequest;
        this.getHighSpeedVideoFpsRangesFor = asyncTypefaceCache;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = platformFontLoader;
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(java.lang.Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    public final java.lang.Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: getCacheable$ui_text, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text(boolean z) {
        this.cacheable = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        if (kotlinx.coroutines.YieldKt.yield(r2) == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[Catch: all -> 0x00f3, TryCatch #0 {all -> 0x00f3, blocks: (B:12:0x0037, B:16:0x0068, B:18:0x007f, B:22:0x00a7, B:27:0x00db, B:35:0x0050, B:38:0x005c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x00f3, TRY_LEAVE, TryCatch #0 {all -> 0x00f3, blocks: (B:12:0x0037, B:16:0x0068, B:18:0x007f, B:22:0x00a7, B:27:0x00db, B:35:0x0050, B:38:0x005c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db A[Catch: all -> 0x00f3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f3, blocks: (B:12:0x0037, B:16:0x0068, B:18:0x007f, B:22:0x00a7, B:27:0x00db, B:35:0x0050, B:38:0x005c), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:14:0x00f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00e9 -> B:13:0x00ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object load(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.text.font.AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        java.util.List<androidx.compose.ui.text.font.Font> list;
        int size;
        int i2;
        androidx.compose.ui.text.font.Font font;
        java.util.List<androidx.compose.ui.text.font.Font> list2;
        int i3;
        try {
            if (continuation instanceof androidx.compose.ui.text.font.AsyncFontListLoader$load$1) {
                asyncFontListLoader$load$1 = (androidx.compose.ui.text.font.AsyncFontListLoader$load$1) continuation;
                if ((asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = asyncFontListLoader$load$1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        list = this.getHighSpeedVideoSizes;
                        size = list.size();
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } else if (i == 1) {
                        size = asyncFontListLoader$load$1.getHighSpeedVideoFpsRangesFor;
                        i3 = asyncFontListLoader$load$1.Camera2StreamConfigurationMap;
                        androidx.compose.ui.text.font.Font font2 = (androidx.compose.ui.text.font.Font) asyncFontListLoader$load$1.getHighSpeedVideoSizes;
                        java.util.List<androidx.compose.ui.text.font.Font> list3 = (java.util.List) asyncFontListLoader$load$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        font = font2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        size = asyncFontListLoader$load$1.getHighSpeedVideoFpsRangesFor;
                        i3 = asyncFontListLoader$load$1.Camera2StreamConfigurationMap;
                        list2 = (java.util.List) asyncFontListLoader$load$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        list = list2;
                        i2++;
                        if (i2 < size) {
                            androidx.compose.ui.text.font.Font font3 = list.get(i2);
                            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(font3.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8143getAsyncPKNRLFQ())) {
                                androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache = this.getHighSpeedVideoFpsRangesFor;
                                androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader = this.Camera2StreamConfigurationMap;
                                androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1(this, font3, null);
                                asyncFontListLoader$load$1.getHighResolutionOutputSizeshNQ4ISI = list;
                                asyncFontListLoader$load$1.getHighSpeedVideoSizes = font3;
                                asyncFontListLoader$load$1.Camera2StreamConfigurationMap = i2;
                                asyncFontListLoader$load$1.getHighSpeedVideoFpsRangesFor = size;
                                asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges = 1;
                                java.lang.Object runCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$1);
                                if (runCached != coroutine_suspended) {
                                    list2 = list;
                                    obj = runCached;
                                    i3 = i2;
                                    font = font3;
                                    if (obj == null) {
                                        setValue(androidx.compose.ui.text.font.FontSynthesis_androidKt.m8174synthesizeTypefaceFxwP2eA(this.getHighSpeedVideoFpsRanges.m8193getFontSynthesisGVVA2EU(), obj, font, this.getHighSpeedVideoFpsRanges.getFontWeight(), this.getHighSpeedVideoFpsRanges.m8192getFontStyle_LCdwA()));
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    asyncFontListLoader$load$1.getHighResolutionOutputSizeshNQ4ISI = list2;
                                    asyncFontListLoader$load$1.getHighSpeedVideoSizes = null;
                                    asyncFontListLoader$load$1.Camera2StreamConfigurationMap = i3;
                                    asyncFontListLoader$load$1.getHighSpeedVideoFpsRangesFor = size;
                                    asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges = 2;
                                }
                                return coroutine_suspended;
                            }
                            i2++;
                            if (i2 < size) {
                                boolean isActive = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                this.cacheable = false;
                                this.getHighResolutionOutputSizeshNQ4ISI.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(getValue(), isActive));
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
            boolean isActive2 = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.getContext());
            this.cacheable = false;
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(getValue(), isActive2));
        }
        asyncFontListLoader$load$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1(this, continuation);
        java.lang.Object obj2 = asyncFontListLoader$load$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$load$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
                if ((asyncFontListLoader$loadWithTimeoutOrNull$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                    asyncFontListLoader$loadWithTimeoutOrNull$1.getHighSpeedVideoFpsRanges = font;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                    return withTimeoutOrNull == coroutine_suspended ? coroutine_suspended : withTimeoutOrNull;
                }
            }
            if (i == 0) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            if (!kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (java.lang.Exception e2) {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new java.lang.IllegalStateException("Unable to load font ".concat(java.lang.String.valueOf(font)), e2));
            }
            return null;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
        java.lang.Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.Camera2StreamConfigurationMap;
    }
}
