package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "", "index", "findPrecedingBreak", "(Ljava/lang/String;I)I", "findFollowingBreak", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/CharSequence;II)I", "ifNotFound", "findCodePointOrEmojiStartBefore", "(Ljava/lang/String;II)I", "Landroidx/emoji2/text/EmojiCompat;", "Camera2StreamConfigurationMap", "()Landroidx/emoji2/text/EmojiCompat;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringHelpers_androidKt {
    public static final int findPrecedingBreak(java.lang.String str, int i) {
        androidx.emoji2.text.EmojiCompat Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        java.lang.Integer num = null;
        if (Camera2StreamConfigurationMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(Camera2StreamConfigurationMap.getEmojiStart(str, java.lang.Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final int findFollowingBreak(java.lang.String str, int i) {
        androidx.emoji2.text.EmojiCompat Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        java.lang.Integer num = null;
        if (Camera2StreamConfigurationMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(Camera2StreamConfigurationMap.getEmojiEnd(str, i));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    private static final int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2) {
        return i <= 0 ? i2 : java.lang.Character.offsetByCodePoints(charSequence, i, -1);
    }

    public static final int findCodePointOrEmojiStartBefore(java.lang.String str, int i, int i2) {
        if (i <= 0) {
            return i2;
        }
        androidx.emoji2.text.EmojiCompat Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            return getHighSpeedVideoFpsRanges(str, i, i2);
        }
        java.lang.String str2 = str;
        int emojiStart = Camera2StreamConfigurationMap.getEmojiStart(str2, i - 1);
        return emojiStart < 0 ? getHighSpeedVideoFpsRanges(str2, i, i2) : emojiStart;
    }

    private static final androidx.emoji2.text.EmojiCompat Camera2StreamConfigurationMap() {
        if (!androidx.emoji2.text.EmojiCompat.isConfigured()) {
            return null;
        }
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        if (emojiCompat.getLoadState() == 1) {
            return emojiCompat;
        }
        return null;
    }
}
