package androidx.compose.ui.text.font;

/* compiled from: FontFamilyResolver.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements androidx.compose.ui.text.font.FontFamily.Resolver {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceRequest, java.lang.Object> createDefaultTypeface;
    private final androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader;
    private final androidx.compose.ui.text.font.PlatformResolveInterceptor platformResolveInterceptor;
    private final androidx.compose.ui.text.font.TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, androidx.compose.ui.text.font.PlatformResolveInterceptor platformResolveInterceptor, androidx.compose.ui.text.font.TypefaceRequestCache typefaceRequestCache, androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceRequest, java.lang.Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
                androidx.compose.runtime.State resolve;
                resolve = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.resolve(androidx.compose.ui.text.font.TypefaceRequest.m4117copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null));
                return resolve.getValue();
            }
        };
    }

    /* renamed from: getPlatformFontLoader$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.font.PlatformFontLoader getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, androidx.compose.ui.text.font.PlatformResolveInterceptor platformResolveInterceptor, androidx.compose.ui.text.font.TypefaceRequestCache typefaceRequestCache, androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i & 2) != 0 ? androidx.compose.ui.text.font.PlatformResolveInterceptor.INSTANCE.getDefault$ui_text_release() : platformResolveInterceptor, (i & 4) != 0 ? androidx.compose.ui.text.font.FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[LOOP:0: B:11:0x0071->B:12:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object preload(androidx.compose.ui.text.font.FontFamily fontFamily, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        int i;
        final androidx.compose.ui.text.font.FontFamilyResolverImpl fontFamilyResolverImpl;
        int size;
        int i2;
        androidx.compose.ui.text.font.FontFamily fontFamily2 = fontFamily;
        if (continuation instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) continuation;
            if ((fontFamilyResolverImpl$preload$1.label & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = fontFamilyResolverImpl$preload$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fontFamilyResolverImpl$preload$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(fontFamily2 instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
                    androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader = this.platformFontLoader;
                    fontFamilyResolverImpl$preload$1.L$0 = this;
                    fontFamilyResolverImpl$preload$1.L$1 = fontFamily2;
                    fontFamilyResolverImpl$preload$1.label = 1;
                    if (fontListFontFamilyTypefaceAdapter.preload(fontFamily2, platformFontLoader, fontFamilyResolverImpl$preload$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fontFamilyResolverImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fontFamily2 = (androidx.compose.ui.text.font.FontFamily) fontFamilyResolverImpl$preload$1.L$1;
                    fontFamilyResolverImpl = (androidx.compose.ui.text.font.FontFamilyResolverImpl) fontFamilyResolverImpl$preload$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List<androidx.compose.ui.text.font.Font> fonts = ((androidx.compose.ui.text.font.FontListFontFamily) fontFamily2).getFonts();
                java.util.ArrayList arrayList = new java.util.ArrayList(fonts.size());
                size = fonts.size();
                for (i2 = 0; i2 < size; i2++) {
                    androidx.compose.ui.text.font.Font font = fonts.get(i2);
                    arrayList.add(new androidx.compose.ui.text.font.TypefaceRequest(fontFamilyResolverImpl.platformResolveInterceptor.interceptFontFamily(fontFamily2), fontFamilyResolverImpl.platformResolveInterceptor.interceptFontWeight(font.getWeight()), fontFamilyResolverImpl.platformResolveInterceptor.mo4027interceptFontStyleT2F_aPo(font.getStyle()), androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
                }
                fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.compose.ui.text.font.TypefaceResult invoke(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
                        androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2;
                        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function1;
                        androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function12;
                        fontListFontFamilyTypefaceAdapter2 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                        androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader2 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                        androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                                invoke2(immutable);
                                return kotlin.Unit.INSTANCE;
                            }
                        };
                        function1 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                        androidx.compose.ui.text.font.TypefaceResult resolve = fontListFontFamilyTypefaceAdapter2.resolve(typefaceRequest, platformFontLoader2, anonymousClass1, function1);
                        if (resolve == null) {
                            platformFontFamilyTypefaceAdapter = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                            androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader3 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                                    invoke2(immutable);
                                    return kotlin.Unit.INSTANCE;
                                }
                            };
                            function12 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader3, anonymousClass2, function12);
                            if (resolve == null) {
                                throw new java.lang.IllegalStateException("Could not load font");
                            }
                        }
                        return resolve;
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }
        fontFamilyResolverImpl$preload$1 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1(this, continuation);
        java.lang.Object obj2 = fontFamilyResolverImpl$preload$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fontFamilyResolverImpl$preload$1.label;
        if (i != 0) {
        }
        java.util.List<androidx.compose.ui.text.font.Font> fonts2 = ((androidx.compose.ui.text.font.FontListFontFamily) fontFamily2).getFonts();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(fonts2.size());
        size = fonts2.size();
        while (i2 < size) {
        }
        fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList2, new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceRequest, androidx.compose.ui.text.font.TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.ui.text.font.TypefaceResult invoke(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
                androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function1;
                androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function12;
                fontListFontFamilyTypefaceAdapter2 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader2 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                        invoke2(immutable);
                        return kotlin.Unit.INSTANCE;
                    }
                };
                function1 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                androidx.compose.ui.text.font.TypefaceResult resolve = fontListFontFamilyTypefaceAdapter2.resolve(typefaceRequest, platformFontLoader2, anonymousClass1, function1);
                if (resolve == null) {
                    platformFontFamilyTypefaceAdapter = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                    androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader3 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                    androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.AnonymousClass2 anonymousClass2 = new kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.font.TypefaceResult.Immutable immutable) {
                            invoke2(immutable);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    function12 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                    resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader3, anonymousClass2, function12);
                    if (resolve == null) {
                        throw new java.lang.IllegalStateException("Could not load font");
                    }
                }
                return resolve;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public androidx.compose.runtime.State<java.lang.Object> mo4050resolveDPcqOEQ(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return resolve(new androidx.compose.ui.text.font.TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.mo4027interceptFontStyleT2F_aPo(fontStyle), this.platformResolveInterceptor.mo4028interceptFontSynthesisMscr08Y(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.runtime.State<java.lang.Object> resolve(final androidx.compose.ui.text.font.TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult, ? extends kotlin.Unit>, androidx.compose.ui.text.font.TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.text.font.TypefaceResult invoke(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult, ? extends kotlin.Unit> function1) {
                return invoke2((kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult, kotlin.Unit>) function1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final androidx.compose.ui.text.font.TypefaceResult invoke2(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult, kotlin.Unit> function1) {
                androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function12;
                androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function13;
                fontListFontFamilyTypefaceAdapter = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                androidx.compose.ui.text.font.TypefaceRequest typefaceRequest2 = typefaceRequest;
                androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                function12 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                androidx.compose.ui.text.font.TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader, function1, function12);
                if (resolve == null) {
                    platformFontFamilyTypefaceAdapter = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                    androidx.compose.ui.text.font.TypefaceRequest typefaceRequest3 = typefaceRequest;
                    androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader2 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.getPlatformFontLoader();
                    function13 = androidx.compose.ui.text.font.FontFamilyResolverImpl.this.createDefaultTypeface;
                    resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest3, platformFontLoader2, function1, function13);
                    if (resolve == null) {
                        throw new java.lang.IllegalStateException("Could not load font");
                    }
                }
                return resolve;
            }
        });
    }
}
