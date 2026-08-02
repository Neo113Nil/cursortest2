package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"", "", "index", "findPrecedingBreak", "(Ljava/lang/String;I)I", "findFollowingBreak"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findPrecedingBreak(java.lang.String str, int i) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final int findFollowingBreak(java.lang.String str, int i) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }
}
