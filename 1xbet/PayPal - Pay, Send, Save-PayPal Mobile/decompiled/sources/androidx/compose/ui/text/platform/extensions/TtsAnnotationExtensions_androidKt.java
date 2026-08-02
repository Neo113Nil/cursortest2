package androidx.compose.ui.text.platform.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"Landroidx/compose/ui/text/TtsAnnotation;", "Landroid/text/style/TtsSpan;", "toSpan", "(Landroidx/compose/ui/text/TtsAnnotation;)Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "(Landroidx/compose/ui/text/VerbatimTtsAnnotation;)Landroid/text/style/TtsSpan;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
