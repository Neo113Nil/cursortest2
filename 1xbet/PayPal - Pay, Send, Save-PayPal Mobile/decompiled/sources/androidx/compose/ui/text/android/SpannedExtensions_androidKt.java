package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\t"}, d2 = {"Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", "hasSpan", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "", "startInclusive", "endExclusive", "(Landroid/text/Spanned;Ljava/lang/Class;II)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpannedExtensions_androidKt {
    public static final boolean hasSpan(android.text.Spanned spanned, java.lang.Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(android.text.Spanned spanned, java.lang.Class<?> cls, int i, int i2) {
        return spanned.nextSpanTransition(i - 1, i2, cls) != i2;
    }
}
