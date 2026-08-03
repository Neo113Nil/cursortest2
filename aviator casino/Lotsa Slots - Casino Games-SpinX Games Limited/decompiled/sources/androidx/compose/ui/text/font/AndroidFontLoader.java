package androidx.compose.ui.text.font;

/* compiled from: AndroidFontLoader.android.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontLoader implements androidx.compose.ui.text.font.PlatformFontLoader {
    public static final int $stable = 8;
    private final java.lang.Object cacheKey;
    private final android.content.Context context;

    public AndroidFontLoader(android.content.Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(androidx.compose.ui.text.font.Font font) {
        java.lang.Object m10798constructorimpl;
        android.graphics.Typeface typeface;
        android.graphics.Typeface load;
        if (font instanceof androidx.compose.ui.text.font.AndroidFont) {
            androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof androidx.compose.ui.text.font.ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ())) {
            typeface = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.load((androidx.compose.ui.text.font.ResourceFont) font, this.context);
        } else if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4069getOptionalLocalPKNRLFQ())) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.compose.ui.text.font.AndroidFontLoader androidFontLoader = this;
                load = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.load((androidx.compose.ui.text.font.ResourceFont) font, this.context);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(load);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            typeface = (android.graphics.Typeface) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
        } else {
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(loadingStrategy, androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4067getAsyncPKNRLFQ())) {
                throw new java.lang.UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new java.lang.IllegalArgumentException("Unknown loading type " + ((java.lang.Object) androidx.compose.ui.text.font.FontLoadingStrategy.m4065toStringimpl(font.getLoadingStrategy())));
        }
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(typeface, ((androidx.compose.ui.text.font.ResourceFont) font).getVariationSettings(), this.context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<? super android.graphics.Typeface> continuation) {
        androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        int i;
        androidx.compose.ui.text.font.AndroidFontLoader androidFontLoader;
        if (continuation instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) continuation;
            if ((androidFontLoader$awaitLoad$1.label & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidFontLoader$awaitLoad$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidFontLoader$awaitLoad$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    font = (androidx.compose.ui.text.font.Font) androidFontLoader$awaitLoad$1.L$1;
                    androidFontLoader = (androidx.compose.ui.text.font.AndroidFontLoader) androidFontLoader$awaitLoad$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj, ((androidx.compose.ui.text.font.ResourceFont) font).getVariationSettings(), androidFontLoader.context);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (font instanceof androidx.compose.ui.text.font.AndroidFont) {
                    androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
                    androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
                    android.content.Context context = this.context;
                    androidFontLoader$awaitLoad$1.label = 1;
                    obj = typefaceLoader.awaitLoad(context, androidFont, androidFontLoader$awaitLoad$1);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
                    android.content.Context context2 = this.context;
                    androidFontLoader$awaitLoad$1.L$0 = this;
                    androidFontLoader$awaitLoad$1.L$1 = font;
                    androidFontLoader$awaitLoad$1.label = 2;
                    obj = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.loadAsync((androidx.compose.ui.text.font.ResourceFont) font, context2, androidFontLoader$awaitLoad$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidFontLoader = this;
                    return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings((android.graphics.Typeface) obj, ((androidx.compose.ui.text.font.ResourceFont) font).getVariationSettings(), androidFontLoader.context);
                }
                throw new java.lang.IllegalArgumentException("Unknown font type: " + font);
            }
        }
        androidFontLoader$awaitLoad$1 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1(this, continuation);
        java.lang.Object obj2 = androidFontLoader$awaitLoad$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidFontLoader$awaitLoad$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public java.lang.Object getCacheKey() {
        return this.cacheKey;
    }
}
