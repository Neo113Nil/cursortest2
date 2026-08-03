package androidx.compose.ui.text.font;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJB\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "injectedContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "asyncLoadScope", "Lkotlinx/coroutines/CoroutineScope;", "preload", "", "family", "Landroidx/compose/ui/text/font/FontFamily;", "resourceLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "createDefaultTypeface", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements androidx.compose.ui.text.font.FontFamilyTypefaceAdapter {
    private kotlinx.coroutines.CoroutineScope asyncLoadScope;
    private final androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.Companion INSTANCE = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.text.font.FontMatcher fontMatcher = new androidx.compose.ui.text.font.FontMatcher();
    private static final kotlinx.coroutines.CoroutineExceptionHandler DropExceptionHandler = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(DropExceptionHandler.plus(androidx.compose.ui.text.platform.DispatcherKt.getFontCacheManagementDispatcher()).plus(coroutineContext).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.compose.ui.text.font.AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext);
    }

    public final java.lang.Object preload(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.Pair firstImmediatelyAvailable;
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
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(font.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4067getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.font.Font font2 = (androidx.compose.ui.text.font.Font) arrayList2.get(i2);
            arrayList3.add(kotlin.TuplesKt.to(font2.getWeight(), androidx.compose.ui.text.font.FontStyle.m4073boximpl(font2.getStyle())));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.HashSet hashSet = new java.util.HashSet(arrayList4.size());
        java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList4.size());
        int size3 = arrayList4.size();
        for (int i3 = 0; i3 < size3; i3++) {
            java.lang.Object obj = arrayList4.get(i3);
            if (hashSet.add((kotlin.Pair) obj)) {
                arrayList5.add(obj);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        int size4 = arrayList6.size();
        for (int i4 = 0; i4 < size4; i4++) {
            kotlin.Pair pair = (kotlin.Pair) arrayList6.get(i4);
            androidx.compose.ui.text.font.FontWeight fontWeight = (androidx.compose.ui.text.font.FontWeight) pair.component1();
            int m4079unboximpl = ((androidx.compose.ui.text.font.FontStyle) pair.component2()).m4079unboximpl();
            firstImmediatelyAvailable = androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m4072matchFontRetOiIg(fonts, fontWeight, m4079unboximpl), new androidx.compose.ui.text.font.TypefaceRequest(fontFamily, fontWeight, m4079unboximpl, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceRequest, kotlin.Unit>() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
                    invoke2(typefaceRequest);
                    return kotlin.Unit.INSTANCE;
                }
            });
            java.util.List list = (java.util.List) firstImmediatelyAvailable.component1();
            if (list != null) {
                arrayList7.add(kotlin.collections.CollectionsKt.first(list));
            }
        }
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3(arrayList7, this, platformFontLoader, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public androidx.compose.ui.text.font.TypefaceResult resolve(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> onAsyncCompletion, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> createDefaultTypeface) {
        kotlin.Pair firstImmediatelyAvailable;
        if (!(typefaceRequest.getFontFamily() instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
            return null;
        }
        firstImmediatelyAvailable = androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m4072matchFontRetOiIg(((androidx.compose.ui.text.font.FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        java.util.List list = (java.util.List) firstImmediatelyAvailable.component1();
        java.lang.Object component2 = firstImmediatelyAvailable.component2();
        if (list == null) {
            return new androidx.compose.ui.text.font.TypefaceResult.Immutable(component2, false, 2, null);
        }
        androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader = new androidx.compose.ui.text.font.AsyncFontListLoader(list, component2, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.asyncLoadScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new androidx.compose.ui.text.font.TypefaceResult.Async(asyncFontListLoader);
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "()V", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.font.FontMatcher getFontMatcher() {
            return androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        public final kotlinx.coroutines.CoroutineExceptionHandler getDropExceptionHandler() {
            return androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }
    }
}
