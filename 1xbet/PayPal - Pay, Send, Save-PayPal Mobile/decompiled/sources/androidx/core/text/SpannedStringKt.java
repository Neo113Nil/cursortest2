package androidx.core.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a<\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Landroid/text/Spanned;", "toSpanned", "(Ljava/lang/CharSequence;)Landroid/text/Spanned;", "", "T", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "getSpans", "(Landroid/text/Spanned;II)[Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpannedStringKt {
    public static final android.text.Spanned toSpanned(java.lang.CharSequence charSequence) {
        return android.text.SpannedString.valueOf(charSequence);
    }

    public static /* synthetic */ java.lang.Object[] getSpans$default(android.text.Spanned spanned, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return spanned.getSpans(i, i2, java.lang.Object.class);
    }

    public static final /* synthetic */ <T> T[] getSpans(android.text.Spanned spanned, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T[]) spanned.getSpans(i, i2, java.lang.Object.class);
    }
}
