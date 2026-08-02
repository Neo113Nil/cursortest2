package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/text/font/FontFamily;", "family", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "resourceLoader", "", io.ktor.http.LinkHeader.Rel.PreLoad, "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "(Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/TypefaceResult;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontListFontFamilyTypefaceAdapter implements androidx.compose.ui.text.font.FontFamilyTypefaceAdapter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.AsyncTypefaceCache getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.Companion INSTANCE = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.text.font.FontMatcher fontMatcher = new androidx.compose.ui.text.font.FontMatcher();
    private static final kotlinx.coroutines.CoroutineExceptionHandler DropExceptionHandler = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);

    public FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighSpeedVideoFpsRanges = asyncTypefaceCache;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(DropExceptionHandler.plus(androidx.compose.ui.text.platform.DispatcherKt.getFontCacheManagementDispatcher()).plus(coroutineContext).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.compose.ui.text.font.AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext);
    }

    public final java.lang.Object preload(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.Pair highSpeedVideoSizes;
        if (!(fontFamily instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
            return kotlin.Unit.INSTANCE;
        }
        androidx.compose.ui.text.font.FontListFontFamily fontListFontFamily = (androidx.compose.ui.text.font.FontListFontFamily) fontFamily;
        java.util.List<androidx.compose.ui.text.font.Font> fonts = fontListFontFamily.getFonts();
        java.util.List<androidx.compose.ui.text.font.Font> fonts2 = fontListFontFamily.getFonts();
        java.util.ArrayList arrayList = new java.util.ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.Font font = fonts2.get(i);
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(font.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8143getAsyncPKNRLFQ())) {
                arrayList.add(kotlin.TuplesKt.to(font.getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.text.font.FontStyle.m8149boximpl(font.getGetHighResolutionOutputSizeshNQ4ISI())));
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        androidx.collection.MutableScatterSet mutableScatterSet = new androidx.collection.MutableScatterSet(arrayList2.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            java.lang.Object obj = arrayList2.get(i2);
            if (mutableScatterSet.add((kotlin.Pair) obj)) {
                arrayList3.add(obj);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        int size3 = arrayList4.size();
        for (int i3 = 0; i3 < size3; i3++) {
            kotlin.Pair pair = (kotlin.Pair) arrayList4.get(i3);
            androidx.compose.ui.text.font.FontWeight fontWeight = (androidx.compose.ui.text.font.FontWeight) pair.component1();
            int m8155unboximpl = ((androidx.compose.ui.text.font.FontStyle) pair.component2()).m8155unboximpl();
            highSpeedVideoSizes = androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt.getHighSpeedVideoSizes(fontMatcher.m8148matchFontRetOiIg(fonts, fontWeight, m8155unboximpl), new androidx.compose.ui.text.font.TypefaceRequest(fontFamily, fontWeight, m8155unboximpl, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.getHighSpeedVideoFpsRanges, platformFontLoader, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.Camera2StreamConfigurationMap();
                    return Camera2StreamConfigurationMap;
                }
            });
            java.util.List list = (java.util.List) highSpeedVideoSizes.component1();
            if (list != null) {
                arrayList5.add(kotlin.collections.CollectionsKt.first(list));
            }
        }
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3(arrayList5, this, platformFontLoader, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public final androidx.compose.ui.text.font.TypefaceResult resolve(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> onAsyncCompletion, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> createDefaultTypeface) {
        kotlin.Pair highSpeedVideoSizes;
        if (!(typefaceRequest.getFontFamily() instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
            return null;
        }
        highSpeedVideoSizes = androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt.getHighSpeedVideoSizes(fontMatcher.m8148matchFontRetOiIg(((androidx.compose.ui.text.font.FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA()), typefaceRequest, this.getHighSpeedVideoFpsRanges, platformFontLoader, createDefaultTypeface);
        java.util.List list = (java.util.List) highSpeedVideoSizes.component1();
        java.lang.Object component2 = highSpeedVideoSizes.component2();
        if (list == null) {
            return new androidx.compose.ui.text.font.TypefaceResult.Immutable(component2, false, 2, null);
        }
        androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader = new androidx.compose.ui.text.font.AsyncFontListLoader(list, component2, typefaceRequest, this.getHighSpeedVideoFpsRanges, onAsyncCompletion, platformFontLoader);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new androidx.compose.ui.text.font.TypefaceResult.Async(asyncFontListLoader);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.font.FontMatcher getFontMatcher() {
            return androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        public final kotlinx.coroutines.CoroutineExceptionHandler getDropExceptionHandler() {
            return androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
