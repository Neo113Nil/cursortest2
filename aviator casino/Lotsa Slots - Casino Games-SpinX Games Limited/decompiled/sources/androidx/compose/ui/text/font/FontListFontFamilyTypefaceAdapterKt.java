package androidx.compose.ui.text.font;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0002¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair<java.util.List<androidx.compose.ui.text.font.Font>, java.lang.Object> firstImmediatelyAvailable(java.util.List<? extends androidx.compose.ui.text.font.Font> list, androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> function1) {
        java.lang.Object loadBlocking;
        java.lang.Object m10798constructorimpl;
        int size = list.size();
        java.util.List list2 = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.Font font = list.get(i);
            int loadingStrategy = font.getLoadingStrategy();
            if (!androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ())) {
                if (!androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4069getOptionalLocalPKNRLFQ())) {
                    if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4067getAsyncPKNRLFQ())) {
                        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult m4031get1ASDuI8 = asyncTypefaceCache.m4031get1ASDuI8(font, platformFontLoader);
                        if (m4031get1ASDuI8 == null) {
                            if (list2 == null) {
                                list2 = kotlin.collections.CollectionsKt.mutableListOf(font);
                            } else {
                                list2.add(font);
                            }
                        } else if (!androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4037isPermanentFailureimpl(m4031get1ASDuI8.m4039unboximpl()) && m4031get1ASDuI8.m4039unboximpl() != null) {
                            return kotlin.TuplesKt.to(list2, androidx.compose.ui.text.font.FontSynthesis_androidKt.m4097synthesizeTypefaceFxwP2eA(typefaceRequest.m4122getFontSynthesisGVVA2EU(), m4031get1ASDuI8.m4039unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA()));
                        }
                    } else {
                        throw new java.lang.IllegalStateException("Unknown font type " + font);
                    }
                } else {
                    synchronized (asyncTypefaceCache.cacheLock) {
                        androidx.compose.ui.text.font.AsyncTypefaceCache.Key key = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            m10798constructorimpl = asyncTypefaceResult.m4039unboximpl();
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            try {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                m10798constructorimpl = kotlin.Result.m10798constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (java.lang.Throwable th) {
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                            }
                            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                                m10798constructorimpl = null;
                            }
                            androidx.compose.ui.text.font.AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, m10798constructorimpl, false, 8, null);
                        }
                    }
                    if (m10798constructorimpl != null) {
                        return kotlin.TuplesKt.to(list2, androidx.compose.ui.text.font.FontSynthesis_androidKt.m4097synthesizeTypefaceFxwP2eA(typefaceRequest.m4122getFontSynthesisGVVA2EU(), m10798constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA()));
                    }
                }
            } else {
                synchronized (asyncTypefaceCache.cacheLock) {
                    androidx.compose.ui.text.font.AsyncTypefaceCache.Key key2 = new androidx.compose.ui.text.font.AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        loadBlocking = asyncTypefaceResult2.m4039unboximpl();
                    } else {
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        try {
                            loadBlocking = platformFontLoader.loadBlocking(font);
                            androidx.compose.ui.text.font.AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, loadBlocking, false, 8, null);
                        } catch (java.lang.Exception e) {
                            throw new java.lang.IllegalStateException("Unable to load font " + font, e);
                        }
                    }
                }
                if (loadBlocking == null) {
                    throw new java.lang.IllegalStateException("Unable to load font " + font);
                }
                return kotlin.TuplesKt.to(list2, androidx.compose.ui.text.font.FontSynthesis_androidKt.m4097synthesizeTypefaceFxwP2eA(typefaceRequest.m4122getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA()));
            }
        }
        return kotlin.TuplesKt.to(list2, function1.invoke(typefaceRequest));
    }
}
