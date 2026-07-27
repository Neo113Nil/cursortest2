package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0003¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTextApi
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object loadBlocking;
        Object m8079constructorimpl;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int loadingStrategy = font.getLoadingStrategy();
            if (!FontLoadingStrategy.m3552equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m3557getBlockingPKNRLFQ())) {
                if (!FontLoadingStrategy.m3552equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m3558getOptionalLocalPKNRLFQ())) {
                    if (FontLoadingStrategy.m3552equalsimpl0(loadingStrategy, FontLoadingStrategy.INSTANCE.m3556getAsyncPKNRLFQ())) {
                        AsyncTypefaceCache.AsyncTypefaceResult m3524get1ASDuI8 = asyncTypefaceCache.m3524get1ASDuI8(font, platformFontLoader);
                        if (m3524get1ASDuI8 == null) {
                            if (list2 == null) {
                                list2 = CollectionsKt.mutableListOf(font);
                            } else {
                                list2.add(font);
                            }
                        } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m3530isPermanentFailureimpl(m3524get1ASDuI8.m3532unboximpl()) && m3524get1ASDuI8.m3532unboximpl() != null) {
                            return TuplesKt.to(list2, FontSynthesis_androidKt.m3584synthesizeTypefaceFxwP2eA(typefaceRequest.m3606getFontSynthesisGVVA2EU(), m3524get1ASDuI8.m3532unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m3605getFontStyle_LCdwA()));
                        }
                    } else {
                        throw new IllegalStateException("Unknown font type " + font);
                    }
                } else {
                    synchronized (asyncTypefaceCache.cacheLock) {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            m8079constructorimpl = asyncTypefaceResult.m3532unboximpl();
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                            }
                            if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                                m8079constructorimpl = null;
                            }
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, m8079constructorimpl, false, 8, null);
                        }
                    }
                    if (m8079constructorimpl != null) {
                        return TuplesKt.to(list2, FontSynthesis_androidKt.m3584synthesizeTypefaceFxwP2eA(typefaceRequest.m3606getFontSynthesisGVVA2EU(), m8079constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m3605getFontStyle_LCdwA()));
                    }
                }
            } else {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        loadBlocking = asyncTypefaceResult2.m3532unboximpl();
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            loadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, loadBlocking, false, 8, null);
                        } catch (Exception e) {
                            throw new IllegalStateException("Unable to load font " + font, e);
                        }
                    }
                }
                if (loadBlocking == null) {
                    throw new IllegalStateException("Unable to load font " + font);
                }
                return TuplesKt.to(list2, FontSynthesis_androidKt.m3584synthesizeTypefaceFxwP2eA(typefaceRequest.m3606getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m3605getFontStyle_LCdwA()));
            }
        }
        return TuplesKt.to(list2, function1.invoke(typefaceRequest));
    }
}
