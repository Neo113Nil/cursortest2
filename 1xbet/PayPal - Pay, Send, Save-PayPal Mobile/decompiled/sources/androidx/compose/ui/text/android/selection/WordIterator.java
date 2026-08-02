package androidx.compose.ui.text.android.selection;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\u001d\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", "charSequence", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "nextBoundary", "(I)I", "prevBoundary", "getPrevWordBeginningOnTwoWordsBoundary", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "", "isAfterPunctuation", "(I)Z", "isOnPunctuation", "p0", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "", "Camera2StreamConfigurationMap", "(I)V", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/CharSequence;", "getCharSequence", "()Ljava/lang/CharSequence;", com.visa.cbp.getEncExpo.warmup, "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WordIterator {
    private final java.lang.CharSequence charSequence;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.text.BreakIterator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.android.selection.WordIterator.Companion INSTANCE = new androidx.compose.ui.text.android.selection.WordIterator.Companion(null);
    public static final int $stable = 8;

    public WordIterator(java.lang.CharSequence charSequence, int i, int i2, java.util.Locale locale) {
        this.charSequence = charSequence;
        if (i < 0 || i > charSequence.length()) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        this.getHighSpeedVideoFpsRangesFor = wordInstance;
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Math.max(0, i - 50);
        this.Camera2StreamConfigurationMap = java.lang.Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new androidx.compose.ui.text.android.CharSequenceCharacterIterator(charSequence, i, i2));
    }

    public final java.lang.CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int nextBoundary(int offset) {
        Camera2StreamConfigurationMap(offset);
        int following = this.getHighSpeedVideoFpsRangesFor.following(offset);
        return (getHighResolutionOutputSizeshNQ4ISI(following + (-1)) && getHighResolutionOutputSizeshNQ4ISI(following) && !getHighSpeedVideoSizes(following)) ? nextBoundary(following) : following;
    }

    public final int prevBoundary(int offset) {
        Camera2StreamConfigurationMap(offset);
        int preceding = this.getHighSpeedVideoFpsRangesFor.preceding(offset);
        return (getHighResolutionOutputSizeshNQ4ISI(preceding) && getHighSpeedVideoFpsRanges(preceding) && !getHighSpeedVideoSizes(preceding)) ? prevBoundary(preceding) : preceding;
    }

    public final int getPunctuationBeginning(int offset) {
        Camera2StreamConfigurationMap(offset);
        while (offset != -1 && (!isOnPunctuation(offset) || isAfterPunctuation(offset))) {
            offset = prevBoundary(offset);
        }
        return offset;
    }

    public final int getPunctuationEnd(int offset) {
        Camera2StreamConfigurationMap(offset);
        while (offset != -1 && (isOnPunctuation(offset) || !isAfterPunctuation(offset))) {
            offset = nextBoundary(offset);
        }
        return offset;
    }

    public final boolean isAfterPunctuation(int offset) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (offset > this.Camera2StreamConfigurationMap || i + 1 > offset) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text(java.lang.Character.codePointBefore(this.charSequence, offset));
    }

    public final boolean isOnPunctuation(int offset) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (offset >= this.Camera2StreamConfigurationMap || i > offset) {
            return false;
        }
        return INSTANCE.isPunctuation$ui_text(java.lang.Character.codePointAt(this.charSequence, offset));
    }

    private final boolean getHighSpeedVideoFpsRanges(int p0) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (p0 > this.Camera2StreamConfigurationMap || i + 1 > p0) {
            return false;
        }
        if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(this.charSequence, p0))) {
            return true;
        }
        int i2 = p0 - 1;
        if (java.lang.Character.isSurrogate(this.charSequence.charAt(i2))) {
            return true;
        }
        if (!androidx.emoji2.text.EmojiCompat.isConfigured()) {
            return false;
        }
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i2) != -1;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (p0 >= this.Camera2StreamConfigurationMap || i > p0) {
            return false;
        }
        if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(this.charSequence, p0)) || java.lang.Character.isSurrogate(this.charSequence.charAt(p0))) {
            return true;
        }
        if (!androidx.emoji2.text.EmojiCompat.isConfigured()) {
            return false;
        }
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, p0) != -1;
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (p0 > this.Camera2StreamConfigurationMap || i > p0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid offset: ");
            sb.append(p0);
            sb.append(". Valid range is [");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" , ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0) {
        Camera2StreamConfigurationMap(p0);
        if (!this.getHighSpeedVideoFpsRangesFor.isBoundary(p0)) {
            return false;
        }
        if (getHighResolutionOutputSizeshNQ4ISI(p0) && getHighResolutionOutputSizeshNQ4ISI(p0 - 1) && getHighResolutionOutputSizeshNQ4ISI(p0 + 1)) {
            return false;
        }
        return p0 <= 0 || p0 >= this.charSequence.length() - 1 || !(getHighSpeedVideoSizes(p0) || getHighSpeedVideoSizes(p0 + 1));
    }

    private final boolean getHighSpeedVideoSizes(int p0) {
        int i = p0 - 1;
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Character.UnicodeBlock.of(this.charSequence.charAt(i)), java.lang.Character.UnicodeBlock.HIRAGANA) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Character.UnicodeBlock.of(this.charSequence.charAt(p0)), java.lang.Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Character.UnicodeBlock.of(this.charSequence.charAt(p0)), java.lang.Character.UnicodeBlock.HIRAGANA) && kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Character.UnicodeBlock.of(this.charSequence.charAt(i)), java.lang.Character.UnicodeBlock.KATAKANA);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "<init>", "()V", "", "cp", "", "isPunctuation$ui_text", "(I)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isPunctuation$ui_text(int cp) {
            int type = java.lang.Character.getType(cp);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getNextWordEndOnTwoWordBoundary(int offset) {
        Camera2StreamConfigurationMap(offset);
        if (getHighSpeedVideoFpsRanges(offset)) {
            return (!getHighSpeedVideoFpsRangesFor(offset) || getHighResolutionOutputSizeshNQ4ISI(offset)) ? nextBoundary(offset) : offset;
        }
        if (getHighResolutionOutputSizeshNQ4ISI(offset)) {
            return nextBoundary(offset);
        }
        return -1;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int offset) {
        Camera2StreamConfigurationMap(offset);
        if (getHighResolutionOutputSizeshNQ4ISI(offset)) {
            return (!getHighSpeedVideoFpsRangesFor(offset) || getHighSpeedVideoFpsRanges(offset)) ? prevBoundary(offset) : offset;
        }
        if (getHighSpeedVideoFpsRanges(offset)) {
            return prevBoundary(offset);
        }
        return -1;
    }
}
