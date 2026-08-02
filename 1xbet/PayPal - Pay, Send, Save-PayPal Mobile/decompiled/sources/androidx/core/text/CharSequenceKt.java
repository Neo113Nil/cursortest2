package androidx.core.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "isDigitsOnly", "(Ljava/lang/CharSequence;)Z", "", "trimmedLength", "(Ljava/lang/CharSequence;)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(java.lang.CharSequence charSequence) {
        return android.text.TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(java.lang.CharSequence charSequence) {
        return android.text.TextUtils.getTrimmedLength(charSequence);
    }
}
