package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "<init>", "()V", "TextSegmentIterator", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "WordTextSegmentIterator", "ParagraphTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "", "current", "", "following", "(I)[I", "preceding"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TextSegmentIterator {
        int[] following(int current);

        int[] preceding(int current);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0005@\u0005X\u0084.¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "<init>", "()V", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "getRange", "(II)[I", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "Camera2StreamConfigurationMap", "[I", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractTextSegmentIterator implements androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int[] getHighSpeedVideoFpsRanges = new int[2];
        protected java.lang.String text;

        protected final java.lang.String getText() {
            java.lang.String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        protected final void setText(java.lang.String str) {
            this.text = str;
        }

        public void initialize(java.lang.String text) {
            setText(text);
        }

        protected final int[] getRange(int start, int end) {
            if (start < 0 || end < 0 || start == end) {
                return null;
            }
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            iArr[0] = start;
            iArr[1] = end;
            return iArr;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Ljava/util/Locale;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", "current", "", "following", "(I)[I", "preceding", "Ljava/text/BreakIterator;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/text/BreakIterator;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class CharacterTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.text.BreakIterator getHighSpeedVideoSizes;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.Companion(null);
        public static final int $stable = 8;

        private CharacterTextSegmentIterator(java.util.Locale locale) {
            this.getHighSpeedVideoSizes = java.text.BreakIterator.getCharacterInstance(locale);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getInstance", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator getInstance(java.util.Locale locale) {
                if (androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.getHighSpeedVideoFpsRanges == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.getHighSpeedVideoFpsRanges = new androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator(locale, null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator characterTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(characterTextSegmentIterator, "");
                return characterTextSegmentIterator;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(java.lang.String text) {
            super.initialize(text);
            java.text.BreakIterator breakIterator = this.getHighSpeedVideoSizes;
            if (breakIterator == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int length = getText().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            do {
                java.text.BreakIterator breakIterator = this.getHighSpeedVideoSizes;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(current)) {
                    java.text.BreakIterator breakIterator2 = this.getHighSpeedVideoSizes;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator2 = null;
                    }
                    current = breakIterator2.following(current);
                } else {
                    java.text.BreakIterator breakIterator3 = this.getHighSpeedVideoSizes;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator3 = null;
                    }
                    int following = breakIterator3.following(current);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(current, following);
                }
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            do {
                java.text.BreakIterator breakIterator = this.getHighSpeedVideoSizes;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(current)) {
                    java.text.BreakIterator breakIterator2 = this.getHighSpeedVideoSizes;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator2 = null;
                    }
                    current = breakIterator2.preceding(current);
                } else {
                    java.text.BreakIterator breakIterator3 = this.getHighSpeedVideoSizes;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator3 = null;
                    }
                    int preceding = breakIterator3.preceding(current);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, current);
                }
            } while (current != -1);
            return null;
        }

        public /* synthetic */ CharacterTextSegmentIterator(java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Ljava/util/Locale;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "text", "", "initialize", "(Ljava/lang/String;)V", "", "current", "", "following", "(I)[I", "preceding", "", "getHighResolutionOutputSizeshNQ4ISI", "(I)Z", "Camera2StreamConfigurationMap", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WordTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.text.BreakIterator getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(null);
        public static final int $stable = 8;

        private WordTextSegmentIterator(java.util.Locale locale) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.text.BreakIterator.getWordInstance(locale);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getInstance", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator getInstance(java.util.Locale locale) {
                if (androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.getHighResolutionOutputSizeshNQ4ISI == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator(locale, null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator wordTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(wordTextSegmentIterator, "");
                return wordTextSegmentIterator;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public final void initialize(java.lang.String text) {
            super.initialize(text);
            java.text.BreakIterator breakIterator = this.getHighResolutionOutputSizeshNQ4ISI;
            if (breakIterator == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] following(int current) {
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            do {
                if ((current < 0 || current >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(current))) && !getHighResolutionOutputSizeshNQ4ISI(current)) {
                    java.text.BreakIterator breakIterator = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator = null;
                    }
                    current = breakIterator.following(current);
                } else {
                    java.text.BreakIterator breakIterator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        breakIterator2 = null;
                    }
                    int following = breakIterator2.following(current);
                    if (following == -1 || !Camera2StreamConfigurationMap(following)) {
                        return null;
                    }
                    return getRange(current, following);
                }
            } while (current != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] preceding(int current) {
            int i;
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && ((current - 1 < 0 || i >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(i))) && !Camera2StreamConfigurationMap(current))) {
                java.text.BreakIterator breakIterator = this.getHighResolutionOutputSizeshNQ4ISI;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    breakIterator = null;
                }
                current = breakIterator.preceding(current);
                if (current == -1) {
                    return null;
                }
            }
            java.text.BreakIterator breakIterator2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(current);
            if (preceding == -1 || !getHighResolutionOutputSizeshNQ4ISI(preceding)) {
                return null;
            }
            return getRange(preceding, current);
        }

        private final boolean Camera2StreamConfigurationMap(int p0) {
            int i;
            if (p0 <= 0 || p0 - 1 < 0 || i >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(i))) {
                return false;
            }
            return p0 == getText().length() || p0 < 0 || p0 >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(p0));
        }

        private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
            int i;
            if (p0 < 0 || p0 >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(p0))) {
                return false;
            }
            return p0 == 0 || (i = p0 - 1) < 0 || i >= getText().length() || !java.lang.Character.isLetterOrDigit(getText().codePointAt(i));
        }

        public /* synthetic */ WordTextSegmentIterator(java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "<init>", "()V", "", "current", "", "following", "(I)[I", "preceding", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(I)Z", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParagraphTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator getHighSpeedVideoFpsRangesFor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.getHighSpeedVideoFpsRangesFor == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator paragraphTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(paragraphTextSegmentIterator, "");
                return paragraphTextSegmentIterator;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int[] following(int current) {
            int length = getText().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (current < length && getText().charAt(current) == '\n' && !getHighResolutionOutputSizeshNQ4ISI(current)) {
                current++;
            }
            int i = current + 1;
            while (i < length && !Camera2StreamConfigurationMap(i)) {
                i++;
            }
            return getRange(current, i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && getText().charAt(current - 1) == '\n' && !Camera2StreamConfigurationMap(current)) {
                current--;
            }
            int i = current - 1;
            while (i > 0 && !getHighResolutionOutputSizeshNQ4ISI(i)) {
                i--;
            }
            return getRange(i, current);
        }

        private final boolean getHighResolutionOutputSizeshNQ4ISI(int p0) {
            if (getText().charAt(p0) != '\n') {
                return p0 == 0 || getText().charAt(p0 - 1) == '\n';
            }
            return false;
        }

        private final boolean Camera2StreamConfigurationMap(int p0) {
            if (p0 <= 0 || getText().charAt(p0 - 1) == '\n') {
                return false;
            }
            return p0 == getText().length() || getText().charAt(p0) == '\n';
        }

        public /* synthetic */ ParagraphTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "<init>", "()V", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;)V", "", "current", "", "following", "(I)[I", "preceding", "p0", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "p1", "Camera2StreamConfigurationMap", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/TextLayoutResult;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LineTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.compose.ui.text.TextLayoutResult getHighSpeedVideoFpsRangesFor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(null);
        public static final int $stable = 8;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection Camera2StreamConfigurationMap = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection getHighSpeedVideoFpsRanges = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.getHighSpeedVideoSizes == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.getHighSpeedVideoSizes = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator lineTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lineTextSegmentIterator, "");
                return lineTextSegmentIterator;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private LineTextSegmentIterator() {
        }

        public final void initialize(java.lang.String text, androidx.compose.ui.text.TextLayoutResult layoutResult) {
            setText(text);
            this.getHighSpeedVideoFpsRangesFor = layoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] following(int current) {
            int i;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            if (current < 0) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult = null;
                }
                i = textLayoutResult.getLineForOffset(0);
            } else {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(current);
                i = Camera2StreamConfigurationMap(lineForOffset, Camera2StreamConfigurationMap) == current ? lineForOffset : lineForOffset + 1;
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.getHighSpeedVideoFpsRangesFor;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult3 = null;
            }
            if (i >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(Camera2StreamConfigurationMap(i, Camera2StreamConfigurationMap), Camera2StreamConfigurationMap(i, getHighSpeedVideoFpsRanges) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] preceding(int current) {
            int i;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            if (current > getText().length()) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult = null;
                }
                i = textLayoutResult.getLineForOffset(getText().length());
            } else {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(current);
                i = Camera2StreamConfigurationMap(lineForOffset, getHighSpeedVideoFpsRanges) + 1 == current ? lineForOffset : lineForOffset - 1;
            }
            if (i < 0) {
                return null;
            }
            return getRange(Camera2StreamConfigurationMap(i, Camera2StreamConfigurationMap), Camera2StreamConfigurationMap(i, getHighSpeedVideoFpsRanges) + 1);
        }

        private final int Camera2StreamConfigurationMap(int p0, androidx.compose.ui.text.style.ResolvedTextDirection p1) {
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(p0);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.getHighSpeedVideoFpsRangesFor;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult3 = null;
            }
            if (p1 != textLayoutResult3.getParagraphDirection(lineStart)) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(p0);
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.getHighSpeedVideoFpsRangesFor;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult5 = null;
            }
            return androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(textLayoutResult5, p0, false, 2, null) - 1;
        }

        public /* synthetic */ LineTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0018\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "<init>", "()V", "", "text", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "initialize", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/semantics/SemanticsNode;)V", "", "current", "", "following", "(I)[I", "preceding", "p0", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "p1", "getHighSpeedVideoFpsRanges", "(ILandroidx/compose/ui/text/style/ResolvedTextDirection;)I", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/TextLayoutResult;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroid/graphics/Rect;", "getOutputFormats", "Landroid/graphics/Rect;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PageTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator getHighSpeedVideoFpsRangesFor;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.compose.ui.text.TextLayoutResult getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private androidx.compose.ui.semantics.SemanticsNode getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private android.graphics.Rect Camera2StreamConfigurationMap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(null);
        public static final int $stable = 8;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection getHighSpeedVideoFpsRanges = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection getHighSpeedVideoSizes = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getInstance", "()Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.getHighSpeedVideoFpsRangesFor == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator pageTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(pageTextSegmentIterator, "");
                return pageTextSegmentIterator;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private PageTextSegmentIterator() {
            this.Camera2StreamConfigurationMap = new android.graphics.Rect();
        }

        public final void initialize(java.lang.String text, androidx.compose.ui.text.TextLayoutResult layoutResult, androidx.compose.ui.semantics.SemanticsNode node) {
            setText(text);
            this.getHighSpeedVideoFpsRangesFor = layoutResult;
            this.getHighSpeedVideoFpsRanges = node;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] following(int current) {
            int lineCount;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.getHighSpeedVideoFpsRanges;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = java.lang.Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(0, current);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtLeast);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + round;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult4 = null;
                }
                androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult6 = this.getHighSpeedVideoFpsRangesFor;
                    if (textLayoutResult6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult7 = this.getHighSpeedVideoFpsRangesFor;
                    if (textLayoutResult7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(coerceAtLeast, getHighSpeedVideoFpsRanges(lineCount - 1, getHighSpeedVideoSizes) + 1);
            } catch (java.lang.IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] preceding(int current) {
            int i;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.getHighSpeedVideoFpsRanges;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    semanticsNode = null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = java.lang.Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(getText().length(), current);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtMost);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - round;
                if (lineTop > 0.0f) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.getHighSpeedVideoFpsRangesFor;
                    if (textLayoutResult4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    i = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    i = 0;
                }
                if (coerceAtMost == getText().length() && i < lineForOffset) {
                    i++;
                }
                return getRange(getHighSpeedVideoFpsRanges(i, getHighSpeedVideoFpsRanges), coerceAtMost);
            } catch (java.lang.IllegalStateException unused) {
                return null;
            }
        }

        private final int getHighSpeedVideoFpsRanges(int p0, androidx.compose.ui.text.style.ResolvedTextDirection p1) {
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(p0);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.getHighSpeedVideoFpsRangesFor;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult3 = null;
            }
            if (p1 != textLayoutResult3.getParagraphDirection(lineStart)) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.getHighSpeedVideoFpsRangesFor;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(p0);
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.getHighSpeedVideoFpsRangesFor;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                textLayoutResult5 = null;
            }
            return androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(textLayoutResult5, p0, false, 2, null) - 1;
        }

        public /* synthetic */ PageTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
