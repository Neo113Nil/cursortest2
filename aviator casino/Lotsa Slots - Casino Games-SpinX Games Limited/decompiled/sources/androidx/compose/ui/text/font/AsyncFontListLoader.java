package androidx.compose.ui.text.font;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncFontListLoader implements androidx.compose.runtime.State<java.lang.Object> {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final java.util.List<androidx.compose.ui.text.font.Font> fontList;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> onCompletion;
    private final androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader;
    private final androidx.compose.ui.text.font.TypefaceRequest typefaceRequest;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(java.util.List<? extends androidx.compose.ui.text.font.Font> list, java.lang.Object obj, androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> function1, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader;
        this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(java.lang.Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    public java.lang.Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #2 {all -> 0x010a, blocks: (B:20:0x0076, B:22:0x008d, B:27:0x00be, B:31:0x00f2), top: B:19:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2 A[Catch: all -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x010a, blocks: (B:20:0x0076, B:22:0x008d, B:27:0x00be, B:31:0x00f2), top: B:19:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0105 -> B:13:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010d -> B:14:0x010f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object load(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.text.font.AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader;
        java.util.List<androidx.compose.ui.text.font.Font> list;
        int size;
        androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader2;
        int i2;
        androidx.compose.ui.text.font.Font font;
        java.util.List<androidx.compose.ui.text.font.Font> list2;
        int i3;
        if (continuation instanceof androidx.compose.ui.text.font.AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (androidx.compose.ui.text.font.AsyncFontListLoader$load$1) continuation;
            if ((asyncFontListLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = asyncFontListLoader$load$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncFontListLoader$load$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        list = this.fontList;
                        size = list.size();
                        asyncFontListLoader2 = this;
                        i2 = 0;
                        if (i2 >= size) {
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        asyncFontListLoader = this;
                    }
                } else if (i == 1) {
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    androidx.compose.ui.text.font.Font font2 = (androidx.compose.ui.text.font.Font) asyncFontListLoader$load$1.L$2;
                    java.util.List<androidx.compose.ui.text.font.Font> list3 = (java.util.List) asyncFontListLoader$load$1.L$1;
                    androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader3 = (androidx.compose.ui.text.font.AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        asyncFontListLoader2 = asyncFontListLoader3;
                        font = font2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        asyncFontListLoader = asyncFontListLoader3;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    list2 = (java.util.List) asyncFontListLoader$load$1.L$1;
                    asyncFontListLoader = (androidx.compose.ui.text.font.AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        list = list2;
                        asyncFontListLoader2 = asyncFontListLoader;
                        i2++;
                        if (i2 >= size) {
                            try {
                                androidx.compose.ui.text.font.Font font3 = list.get(i2);
                                if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(font3.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4067getAsyncPKNRLFQ())) {
                                    androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache = asyncFontListLoader2.asyncTypefaceCache;
                                    androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader = asyncFontListLoader2.platformFontLoader;
                                    androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, font3, null);
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list;
                                    asyncFontListLoader$load$1.L$2 = font3;
                                    asyncFontListLoader$load$1.I$0 = i2;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 1;
                                    int i4 = i2;
                                    java.lang.Object runCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$1);
                                    if (runCached == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    list2 = list;
                                    obj = runCached;
                                    i3 = i4;
                                    font = font3;
                                    if (obj == null) {
                                        asyncFontListLoader2.setValue(androidx.compose.ui.text.font.FontSynthesis_androidKt.m4097synthesizeTypefaceFxwP2eA(asyncFontListLoader2.typefaceRequest.m4122getFontSynthesisGVVA2EU(), obj, font, asyncFontListLoader2.typefaceRequest.getFontWeight(), asyncFontListLoader2.typefaceRequest.m4121getFontStyle_LCdwA()));
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        boolean isActive = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.get$context());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive));
                                        return unit;
                                    }
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list2;
                                    asyncFontListLoader$load$1.L$2 = null;
                                    asyncFontListLoader$load$1.I$0 = i3;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 2;
                                    if (kotlinx.coroutines.YieldKt.yield(asyncFontListLoader$load$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    asyncFontListLoader = asyncFontListLoader2;
                                    i2 = i3;
                                    list = list2;
                                    asyncFontListLoader2 = asyncFontListLoader;
                                    i2++;
                                    if (i2 >= size) {
                                        boolean isActive2 = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.get$context());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive2));
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } else {
                                    i2++;
                                    if (i2 >= size) {
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                asyncFontListLoader = asyncFontListLoader2;
                            }
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
                boolean isActive3 = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.get$context());
                asyncFontListLoader.cacheable = false;
                asyncFontListLoader.onCompletion.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive3));
                throw th;
            }
        }
        asyncFontListLoader$load$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1(this, continuation);
        java.lang.Object obj2 = asyncFontListLoader$load$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$load$1.label;
        if (i != 0) {
        }
        boolean isActive32 = kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$load$1.get$context());
        asyncFontListLoader.cacheable = false;
        asyncFontListLoader.onCompletion.invoke(new androidx.compose.ui.text.font.TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive32));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        java.lang.Object obj;
        try {
            if (continuation instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
                if ((asyncFontListLoader$loadWithTimeoutOrNull$1.label & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    obj = null;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                        asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                        asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                        obj2 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        font = (androidx.compose.ui.text.font.Font) asyncFontListLoader$loadWithTimeoutOrNull$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = obj2;
            return obj;
        } catch (java.util.concurrent.CancellationException e) {
            if (kotlinx.coroutines.JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.get$context())) {
                return obj;
            }
            throw e;
        } catch (java.lang.Exception e2) {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.get$context().get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler == null) {
                return obj;
            }
            coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.get$context(), new java.lang.IllegalStateException("Unable to load font " + font, e2));
            return obj;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
        java.lang.Object obj22 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        obj = null;
    }
}
