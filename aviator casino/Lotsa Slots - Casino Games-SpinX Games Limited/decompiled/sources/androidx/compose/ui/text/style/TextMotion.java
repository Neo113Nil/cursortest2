package androidx.compose.ui.text.style;

/* compiled from: TextMotion.android.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "linearity", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "subpixelTextPositioning", "", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinearity-4e0Vf04$ui_text_release", "()I", "I", "getSubpixelTextPositioning$ui_text_release", "()Z", "copy", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "equals", "other", "hashCode", "", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Linearity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final androidx.compose.ui.text.style.TextMotion Animated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextMotion.Companion INSTANCE;
    private static final androidx.compose.ui.text.style.TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    public /* synthetic */ TextMotion(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name and from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* renamed from: getSubpixelTextPositioning$ui_text_release, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    /* compiled from: TextMotion.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "()V", "Animated", "Landroidx/compose/ui/text/style/TextMotion;", "getAnimated", "()Landroidx/compose/ui/text/style/TextMotion;", "Static", "getStatic", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextMotion getStatic() {
            return androidx.compose.ui.text.style.TextMotion.Static;
        }

        public final androidx.compose.ui.text.style.TextMotion getAnimated() {
            return androidx.compose.ui.text.style.TextMotion.Animated;
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new androidx.compose.ui.text.style.TextMotion.Companion(defaultConstructorMarker);
        Static = new androidx.compose.ui.text.style.TextMotion(androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m4396getFontHinting4e0Vf04(), false, defaultConstructorMarker);
        Animated = new androidx.compose.ui.text.style.TextMotion(androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m4397getLinear4e0Vf04(), true, defaultConstructorMarker);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.style.TextMotion m4386copyJdDtMQo$ui_text_release$default(androidx.compose.ui.text.style.TextMotion textMotion, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m4387copyJdDtMQo$ui_text_release(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextMotion m4387copyJdDtMQo$ui_text_release(int linearity, boolean subpixelTextPositioning) {
        return new androidx.compose.ui.text.style.TextMotion(linearity, subpixelTextPositioning, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.style.TextMotion)) {
            return false;
        }
        androidx.compose.ui.text.style.TextMotion textMotion = (androidx.compose.ui.text.style.TextMotion) other;
        return androidx.compose.ui.text.style.TextMotion.Linearity.m4392equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    public int hashCode() {
        return (androidx.compose.ui.text.style.TextMotion.Linearity.m4393hashCodeimpl(this.linearity) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.subpixelTextPositioning);
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this, Static) ? "TextMotion.Static" : kotlin.jvm.internal.Intrinsics.areEqual(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    /* compiled from: TextMotion.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Linearity {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.TextMotion.Linearity.Companion INSTANCE = new androidx.compose.ui.text.style.TextMotion.Linearity.Companion(null);
        private static final int Linear = m4390constructorimpl(1);
        private static final int FontHinting = m4390constructorimpl(2);
        private static final int None = m4390constructorimpl(3);

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.TextMotion.Linearity m4389boximpl(int i) {
            return new androidx.compose.ui.text.style.TextMotion.Linearity(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m4390constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4391equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.TextMotion.Linearity) && i == ((androidx.compose.ui.text.style.TextMotion.Linearity) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4392equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4393hashCodeimpl(int i) {
            return i;
        }

        public boolean equals(java.lang.Object obj) {
            return m4391equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4393hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        /* compiled from: TextMotion.android.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "()V", "FontHinting", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getFontHinting-4e0Vf04", "()I", "I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, "getLinear-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m4397getLinear4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.Linear;
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m4396getFontHinting4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.FontHinting;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m4398getNone4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.None;
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        public java.lang.String toString() {
            return m4394toStringimpl(this.value);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m4394toStringimpl(int i) {
            return m4392equalsimpl0(i, Linear) ? "Linearity.Linear" : m4392equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m4392equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }
    }
}
