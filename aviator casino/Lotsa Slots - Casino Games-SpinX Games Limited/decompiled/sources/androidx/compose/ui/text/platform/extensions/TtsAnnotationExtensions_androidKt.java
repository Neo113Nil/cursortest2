package androidx.compose.ui.text.platform.extensions;

/* compiled from: TtsAnnotationExtensions.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toSpan", "Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TtsAnnotationExtensions_androidKt {
    public static final android.text.style.TtsSpan toSpan(androidx.compose.ui.text.TtsAnnotation ttsAnnotation) {
        if (ttsAnnotation instanceof androidx.compose.ui.text.VerbatimTtsAnnotation) {
            return toSpan((androidx.compose.ui.text.VerbatimTtsAnnotation) ttsAnnotation);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final android.text.style.TtsSpan toSpan(androidx.compose.ui.text.VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new android.text.style.TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
