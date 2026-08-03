package androidx.compose.ui.platform;

/* compiled from: AccessibilityIterators.android.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators;", "", "()V", "AbstractTextSegmentIterator", "CharacterTextSegmentIterator", "LineTextSegmentIterator", "PageTextSegmentIterator", "ParagraphTextSegmentIterator", "TextSegmentIterator", "WordTextSegmentIterator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "", "following", "", "current", "", "preceding", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TextSegmentIterator {
        int[] following(int current);

        int[] preceding(int current);
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "()V", com.ironsource.D1.i, "", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getRange", "start", "", "end", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AbstractTextSegmentIterator implements androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected java.lang.String text;

        protected final java.lang.String getText() {
            java.lang.String str = this.text;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("text");
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
            int[] iArr = this.segment;
            iArr[0] = start;
            iArr[1] = end;
            return iArr;
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "text", "", "onLocaleChanged", "preceding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class CharacterTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator instance;
        private java.text.BreakIterator impl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ CharacterTextSegmentIterator(java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        /* compiled from: AccessibilityIterators.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator$Companion;", "", "()V", com.ironsource.C3232q2.p, "Landroidx/compose/ui/platform/AccessibilityIterators$CharacterTextSegmentIterator;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator getInstance(java.util.Locale locale) {
                if (androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.instance == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.instance = new androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator(locale, null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator characterTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator.instance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(java.util.Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(java.lang.String text) {
            super.initialize(text);
            java.text.BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
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
                java.text.BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(current)) {
                    java.text.BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    current = breakIterator2.following(current);
                } else {
                    java.text.BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
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
                java.text.BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(current)) {
                    java.text.BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    current = breakIterator2.preceding(current);
                } else {
                    java.text.BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
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

        private final void onLocaleChanged(java.util.Locale locale) {
            this.impl = java.text.BreakIterator.getCharacterInstance(locale);
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "locale", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "impl", "Ljava/text/BreakIterator;", "following", "", "current", "", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "text", "", "isEndBoundary", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "isLetterOrDigit", "isStartBoundary", "onLocaleChanged", "preceding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WordTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator instance;
        private java.text.BreakIterator impl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ WordTextSegmentIterator(java.util.Locale locale, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        /* compiled from: AccessibilityIterators.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator$Companion;", "", "()V", com.ironsource.C3232q2.p, "Landroidx/compose/ui/platform/AccessibilityIterators$WordTextSegmentIterator;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "locale", "Ljava/util/Locale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator getInstance(java.util.Locale locale) {
                if (androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.instance == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.instance = new androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator(locale, null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator wordTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator.instance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(java.util.Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(java.lang.String text) {
            super.initialize(text);
            java.text.BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(text);
        }

        private final void onLocaleChanged(java.util.Locale locale) {
            this.impl = java.text.BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (!isLetterOrDigit(current) && !isStartBoundary(current)) {
                java.text.BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                current = breakIterator.following(current);
                if (current == -1) {
                    return null;
                }
            }
            java.text.BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int following = breakIterator2.following(current);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(current, following);
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
            while (current > 0 && !isLetterOrDigit(current - 1) && !isEndBoundary(current)) {
                java.text.BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                current = breakIterator.preceding(current);
                if (current == -1) {
                    return null;
                }
            }
            java.text.BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int preceding = breakIterator2.preceding(current);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, current);
        }

        private final boolean isStartBoundary(int index) {
            return isLetterOrDigit(index) && (index == 0 || !isLetterOrDigit(index - 1));
        }

        private final boolean isEndBoundary(int index) {
            return index > 0 && isLetterOrDigit(index + (-1)) && (index == getText().length() || !isLetterOrDigit(index));
        }

        private final boolean isLetterOrDigit(int index) {
            if (index < 0 || index >= getText().length()) {
                return false;
            }
            return java.lang.Character.isLetterOrDigit(getText().codePointAt(index));
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "following", "", "current", "", "isEndBoundary", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "isStartBoundary", "preceding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParagraphTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.Companion(null);
        private static androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator instance;

        public /* synthetic */ ParagraphTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AccessibilityIterators.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator$Companion;", "", "()V", com.ironsource.C3232q2.p, "Landroidx/compose/ui/platform/AccessibilityIterators$ParagraphTextSegmentIterator;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.instance == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.instance = new androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator paragraphTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.instance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
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
        public int[] following(int current) {
            int length = getText().length();
            if (length <= 0 || current >= length) {
                return null;
            }
            if (current < 0) {
                current = 0;
            }
            while (current < length && getText().charAt(current) == '\n' && !isStartBoundary(current)) {
                current++;
            }
            int i = current + 1;
            while (i < length && !isEndBoundary(i)) {
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
        public int[] preceding(int current) {
            int length = getText().length();
            if (length <= 0 || current <= 0) {
                return null;
            }
            if (current > length) {
                current = length;
            }
            while (current > 0 && getText().charAt(current - 1) == '\n' && !isEndBoundary(current)) {
                current--;
            }
            int i = current - 1;
            while (i > 0 && !isStartBoundary(i)) {
                i--;
            }
            return getRange(i, current);
        }

        private final boolean isStartBoundary(int index) {
            return getText().charAt(index) != '\n' && (index == 0 || getText().charAt(index - 1) == '\n');
        }

        private final boolean isEndBoundary(int index) {
            return index > 0 && getText().charAt(index + (-1)) != '\n' && (index == getText().length() || getText().charAt(index) == '\n');
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "text", "", "preceding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LineTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator lineInstance;
        private androidx.compose.ui.text.TextLayoutResult layoutResult;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.Companion(null);
        public static final int $stable = 8;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection DirectionStart = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection DirectionEnd = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AccessibilityIterators.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$LineTextSegmentIterator;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.lineInstance == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.lineInstance = new androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator lineTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator.lineInstance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }
        }

        private LineTextSegmentIterator() {
        }

        public final void initialize(java.lang.String text, androidx.compose.ui.text.TextLayoutResult layoutResult) {
            setText(text);
            this.layoutResult = layoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int i;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            if (current < 0) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                i = textLayoutResult.getLineForOffset(0);
            } else {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(current);
                i = getLineEdgeIndex(lineForOffset, DirectionStart) == current ? lineForOffset : lineForOffset + 1;
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (i >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i, DirectionStart), getLineEdgeIndex(i, DirectionEnd) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int i;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            if (current > getText().length()) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                i = textLayoutResult.getLineForOffset(getText().length());
            } else {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(current);
                i = getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == current ? lineForOffset : lineForOffset - 1;
            }
            if (i < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i, DirectionStart), getLineEdgeIndex(i, DirectionEnd) + 1);
        }

        private final int getLineEdgeIndex(int lineNumber, androidx.compose.ui.text.style.ResolvedTextDirection direction) {
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(lineNumber);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (direction != textLayoutResult3.getParagraphDirection(lineStart)) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(lineNumber);
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(textLayoutResult5, lineNumber, false, 2, null) - 1;
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", "Landroidx/compose/ui/platform/AccessibilityIterators$AbstractTextSegmentIterator;", "()V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "tempRect", "Landroid/graphics/Rect;", "following", "", "current", "", "getLineEdgeIndex", "lineNumber", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "text", "", "preceding", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PageTextSegmentIterator extends androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator {
        private static androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator pageInstance;
        private androidx.compose.ui.text.TextLayoutResult layoutResult;
        private androidx.compose.ui.semantics.SemanticsNode node;
        private android.graphics.Rect tempRect;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion INSTANCE = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.Companion(null);
        public static final int $stable = 8;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection DirectionStart = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl;
        private static final androidx.compose.ui.text.style.ResolvedTextDirection DirectionEnd = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr;

        public /* synthetic */ PageTextSegmentIterator(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AccessibilityIterators.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator$Companion;", "", "()V", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/AccessibilityIterators$PageTextSegmentIterator;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator getInstance() {
                if (androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.pageInstance == null) {
                    androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.pageInstance = new androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator(null);
                }
                androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator pageTextSegmentIterator = androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator.pageInstance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new android.graphics.Rect();
        }

        public final void initialize(java.lang.String text, androidx.compose.ui.text.TextLayoutResult layoutResult, androidx.compose.ui.semantics.SemanticsNode node) {
            setText(text);
            this.layoutResult = layoutResult;
            this.node = node;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int current) {
            int lineCount;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current >= getText().length()) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int roundToInt = kotlin.math.MathKt.roundToInt(semanticsNode.getBoundsInRoot().getHeight());
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(0, current);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtLeast);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + roundToInt;
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult4 = null;
                }
                androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(coerceAtLeast, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (java.lang.IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int current) {
            int i;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || current <= 0) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int roundToInt = kotlin.math.MathKt.roundToInt(semanticsNode.getBoundsInRoot().getHeight());
                int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(getText().length(), current);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(coerceAtMost);
                androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - roundToInt;
                if (lineTop > 0.0f) {
                    androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
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
                return getRange(getLineEdgeIndex(i, DirectionStart), coerceAtMost);
            } catch (java.lang.IllegalStateException unused) {
                return null;
            }
        }

        private final int getLineEdgeIndex(int lineNumber, androidx.compose.ui.text.style.ResolvedTextDirection direction) {
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.layoutResult;
            androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(lineNumber);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (direction != textLayoutResult3.getParagraphDirection(lineStart)) {
                androidx.compose.ui.text.TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(lineNumber);
            }
            androidx.compose.ui.text.TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return androidx.compose.ui.text.TextLayoutResult.getLineEnd$default(textLayoutResult5, lineNumber, false, 2, null) - 1;
        }
    }
}
