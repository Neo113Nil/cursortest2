package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroid/graphics/Typeface;", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFontLoader implements androidx.compose.ui.text.font.PlatformFontLoader {
    public static final int $stable = 8;
    private final java.lang.Object cacheKey;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    public AndroidFontLoader(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final android.graphics.Typeface loadBlocking(androidx.compose.ui.text.font.Font font) {
        java.lang.Object m23436constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface highResolutionOutputSizeshNQ4ISI;
        if (font instanceof androidx.compose.ui.text.font.AndroidFont) {
            androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.getHighSpeedVideoFpsRanges, androidFont);
        }
        if (!(font instanceof androidx.compose.ui.text.font.ResourceFont)) {
            return null;
        }
        androidx.compose.ui.text.font.ResourceFont resourceFont = (androidx.compose.ui.text.font.ResourceFont) font;
        int loadingStrategy = resourceFont.getLoadingStrategy();
        if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ())) {
            typeface = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.getHighResolutionOutputSizeshNQ4ISI(resourceFont, this.getHighSpeedVideoFpsRanges);
        } else if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8145getOptionalLocalPKNRLFQ())) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.compose.ui.text.font.AndroidFontLoader androidFontLoader = this;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.text.font.ResourceFont) font, this.getHighSpeedVideoFpsRanges);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(highResolutionOutputSizeshNQ4ISI);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            typeface = (android.graphics.Typeface) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        } else {
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8143getAsyncPKNRLFQ())) {
                throw new java.lang.UnsupportedOperationException("Unsupported Async font load path");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown loading type ");
            sb.append((java.lang.Object) androidx.compose.ui.text.font.FontLoadingStrategy.m8141toStringimpl(resourceFont.getLoadingStrategy()));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(typeface, resourceFont.getVariationSettings(), this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<? super android.graphics.Typeface> continuation) {
        androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        if (continuation instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) continuation;
            if ((androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = androidFontLoader$awaitLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (font instanceof androidx.compose.ui.text.font.AndroidFont) {
                        androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
                        androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                        android.content.Context context = this.getHighSpeedVideoFpsRanges;
                        androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor = 1;
                        java.lang.Object awaitLoad = typefaceLoader.awaitLoad(context, androidFont, androidFontLoader$awaitLoad$1);
                        if (awaitLoad != coroutine_suspended) {
                            return awaitLoad;
                        }
                    } else if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
                        android.content.Context context2 = this.getHighSpeedVideoFpsRanges;
                        androidFontLoader$awaitLoad$1.Camera2StreamConfigurationMap = font;
                        androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor = 2;
                        obj = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.text.font.ResourceFont) font, context2, androidFontLoader$awaitLoad$1);
                    } else {
                        throw new java.lang.IllegalArgumentException("Unknown font type: ".concat(java.lang.String.valueOf(font)));
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                font = (androidx.compose.ui.text.font.Font) androidFontLoader$awaitLoad$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj, ((androidx.compose.ui.text.font.ResourceFont) font).getVariationSettings(), this.getHighSpeedVideoFpsRanges);
            }
        }
        androidFontLoader$awaitLoad$1 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1(this, continuation);
        java.lang.Object obj2 = androidFontLoader$awaitLoad$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFontLoader$awaitLoad$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj2, ((androidx.compose.ui.text.font.ResourceFont) font).getVariationSettings(), this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final java.lang.Object getCacheKey() {
        return this.cacheKey;
    }
}
