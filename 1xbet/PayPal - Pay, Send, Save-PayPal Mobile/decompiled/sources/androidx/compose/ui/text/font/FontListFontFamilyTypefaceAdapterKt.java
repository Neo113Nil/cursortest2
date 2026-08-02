package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "p0", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "p1", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "p2", "Lkotlin/Function1;", "", "p3", "Lkotlin/Pair;", "getHighSpeedVideoSizes", "(Ljava/util/List;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Pair<java.util.List<androidx.compose.ui.text.font.Font>, java.lang.Object> getHighSpeedVideoSizes(java.util.List<? extends androidx.compose.ui.text.font.Font> list, androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function1) {
        java.lang.Object invoke;
        androidx.compose.ui.text.font.Font font;
        java.util.List list2;
        java.util.List list3;
        java.lang.Object m23436constructorimpl;
        androidx.compose.ui.text.font.Font font2;
        int size = list.size();
        java.util.List list4 = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.Font font3 = list.get(i);
            int loadingStrategy = font3.getLoadingStrategy();
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.getHighSpeedVideoFpsRangesFor) {
                    androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                    androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.getHighResolutionOutputSizeshNQ4ISI.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.Camera2StreamConfigurationMap.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        invoke = asyncTypefaceResult.m8114unboximpl();
                        font = font3;
                        list2 = list4;
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        try {
                            invoke = platformFontLoader.loadBlocking(font3);
                        } catch (java.lang.Exception unused) {
                            invoke = function1.invoke(typefaceRequest);
                        }
                        font = font3;
                        list2 = list4;
                        androidx.compose.ui.text.font.AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, invoke, false, 8, null);
                    }
                }
                if (invoke == null) {
                    invoke = function1.invoke(typefaceRequest);
                }
                return kotlin.TuplesKt.to(list2, androidx.compose.ui.text.font.FontSynthesis_androidKt.m8174synthesizeTypefaceFxwP2eA(typefaceRequest.m8193getFontSynthesisGVVA2EU(), invoke, font, typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA()));
            }
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8145getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.getHighSpeedVideoFpsRangesFor) {
                    androidx.compose.ui.text.font.AsyncTypefaceCache.Key key2 = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                    androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.getHighResolutionOutputSizeshNQ4ISI.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.Camera2StreamConfigurationMap.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        m23436constructorimpl = asyncTypefaceResult2.m8114unboximpl();
                        font2 = font3;
                        list3 = list4;
                    } else {
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(platformFontLoader.loadBlocking(font3));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            m23436constructorimpl = null;
                        }
                        font2 = font3;
                        list3 = list4;
                        androidx.compose.ui.text.font.AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, m23436constructorimpl, false, 8, null);
                    }
                }
                if (m23436constructorimpl != null) {
                    return kotlin.TuplesKt.to(list3, androidx.compose.ui.text.font.FontSynthesis_androidKt.m8174synthesizeTypefaceFxwP2eA(typefaceRequest.m8193getFontSynthesisGVVA2EU(), m23436constructorimpl, font2, typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA()));
                }
            } else {
                list3 = list4;
                if (!androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8143getAsyncPKNRLFQ())) {
                    throw new java.lang.IllegalStateException("Unknown font type ".concat(java.lang.String.valueOf(font3)));
                }
                androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m8106get1ASDuI8 = asyncTypefaceCache.m8106get1ASDuI8(font3, platformFontLoader);
                if (m8106get1ASDuI8 == null) {
                    if (list3 == null) {
                        list4 = kotlin.collections.CollectionsKt.mutableListOf(font3);
                    } else {
                        list3.add(font3);
                    }
                } else if (!androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m8112isPermanentFailureimpl(m8106get1ASDuI8.m8114unboximpl()) && m8106get1ASDuI8.m8114unboximpl() != null) {
                    return kotlin.TuplesKt.to(list3, androidx.compose.ui.text.font.FontSynthesis_androidKt.m8174synthesizeTypefaceFxwP2eA(typefaceRequest.m8193getFontSynthesisGVVA2EU(), m8106get1ASDuI8.m8114unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA()));
                }
            }
            list4 = list3;
        }
        return kotlin.TuplesKt.to(list4, function1.invoke(typefaceRequest));
    }
}
