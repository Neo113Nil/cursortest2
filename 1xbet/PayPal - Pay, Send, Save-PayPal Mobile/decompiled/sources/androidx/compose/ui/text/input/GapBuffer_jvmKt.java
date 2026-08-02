package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "", "toCharArray", "(Ljava/lang/String;[CIII)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(java.lang.String str, char[] cArr, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "");
        str.getChars(i2, i3, cArr, i);
    }
}
