package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroid/content/Context;", "p0", "Landroid/graphics/Typeface;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;)Landroid/graphics/Typeface;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/font/ResourceFont;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.font.ResourceFont resourceFont, android.content.Context context) {
        android.graphics.Typeface font = androidx.core.content.res.ResourcesCompat.getFont(context, resourceFont.getResId());
        kotlin.jvm.internal.Intrinsics.checkNotNull(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.text.font.ResourceFont resourceFont, android.content.Context context, kotlin.coroutines.Continuation<? super android.graphics.Typeface> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        androidx.core.content.res.ResourcesCompat.getFont(context, resourceFont.getResId(), new androidx.core.content.res.ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public final void m9060x46c88379(android.graphics.Typeface typeface) {
                kotlinx.coroutines.CancellableContinuation<android.graphics.Typeface> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(typeface));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public final void m9059xb24343b7(int reason) {
                kotlinx.coroutines.CancellableContinuation<android.graphics.Typeface> cancellableContinuation = cancellableContinuationImpl2;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to load font ");
                sb.append(resourceFont);
                sb.append(" (reason=");
                sb.append(reason);
                sb.append(')');
                cancellableContinuation.cancel(new java.lang.IllegalStateException(sb.toString()));
            }
        }, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
