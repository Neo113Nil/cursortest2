package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditCommandKt {
    public static final /* synthetic */ boolean access$isSurrogatePair(char c, char c2) {
        return java.lang.Character.isHighSurrogate(c) && java.lang.Character.isLowSurrogate(c2);
    }
}
