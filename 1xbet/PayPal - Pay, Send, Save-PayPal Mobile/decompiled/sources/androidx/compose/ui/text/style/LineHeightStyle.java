package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001e\u001f !B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "mode", "<init>", "(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-38bxuX8", "(FII)Landroidx/compose/ui/text/style/LineHeightStyle;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlignment-PIaL0Z0", "()F", com.visa.cbp.getEncExpo.warmup, "getTrim-EVpEnUU", "getMode-lzQqcRY", "Companion", "Trim", "Alignment", "Mode"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.LineHeightStyle.Companion INSTANCE;
    private static final androidx.compose.ui.text.style.LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    private LineHeightStyle(float f, int i, int i2) {
        this.alignment = f;
        this.trim = i;
        this.mode = i2;
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name and from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name and from getter */
    public final int getMode() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name and from getter */
    public final int getTrim() {
        return this.trim;
    }

    private LineHeightStyle(float f, int i) {
        this(f, i, androidx.compose.ui.text.style.LineHeightStyle.Mode.INSTANCE.m8420getFixedlzQqcRY(), null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle;", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.style.LineHeightStyle getDefault() {
            return androidx.compose.ui.text.style.LineHeightStyle.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new androidx.compose.ui.text.style.LineHeightStyle.Companion(defaultConstructorMarker);
        Default = new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8432getBothEVpEnUU(), androidx.compose.ui.text.style.LineHeightStyle.Mode.INSTANCE.m8420getFixedlzQqcRY(), defaultConstructorMarker);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.style.LineHeightStyle m8397copy38bxuX8$default(androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, float f, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            f = lineHeightStyle.alignment;
        }
        if ((i3 & 2) != 0) {
            i = lineHeightStyle.trim;
        }
        if ((i3 & 4) != 0) {
            i2 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m8398copy38bxuX8(f, i, i2);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final androidx.compose.ui.text.style.LineHeightStyle m8398copy38bxuX8(float alignment, int trim, int mode) {
        return new androidx.compose.ui.text.style.LineHeightStyle(alignment, trim, mode, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.style.LineHeightStyle)) {
            return false;
        }
        androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = (androidx.compose.ui.text.style.LineHeightStyle) other;
        return androidx.compose.ui.text.style.LineHeightStyle.Alignment.m8405equalsimpl0(this.alignment, lineHeightStyle.alignment) && androidx.compose.ui.text.style.LineHeightStyle.Trim.m8426equalsimpl0(this.trim, lineHeightStyle.trim) && androidx.compose.ui.text.style.LineHeightStyle.Mode.m8416equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.text.style.LineHeightStyle.Alignment.m8406hashCodeimpl(this.alignment) * 31) + androidx.compose.ui.text.style.LineHeightStyle.Trim.m8427hashCodeimpl(this.trim)) * 31) + androidx.compose.ui.text.style.LineHeightStyle.Mode.m8417hashCodeimpl(this.mode);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineHeightStyle.Alignment.m8407toStringimpl(this.alignment));
        sb.append(", trim=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineHeightStyle.Trim.m8430toStringimpl(this.trim));
        sb.append(",mode=");
        sb.append((java.lang.Object) androidx.compose.ui.text.style.LineHeightStyle.Mode.m8418toStringimpl(this.mode));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "isTrimFirstLineTop-impl$ui_text", "(I)Z", "isTrimFirstLineTop", "isTrimLastLineBottom-impl$ui_text", "isTrimLastLineBottom", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Trim {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion INSTANCE = new androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion(null);
        private static final int FirstLineTop = m8424constructorimpl(1);
        private static final int LastLineBottom = m8424constructorimpl(16);
        private static final int Both = m8424constructorimpl(17);
        private static final int None = m8424constructorimpl(0);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8424constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8426equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text, reason: not valid java name */
        public static final boolean m8428isTrimFirstLineTopimpl$ui_text(int i) {
            return (i & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text, reason: not valid java name */
        public static final boolean m8429isTrimLastLineBottomimpl$ui_text(int i) {
            return (i & 16) > 0;
        }

        private /* synthetic */ Trim(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final java.lang.String toString() {
            return m8430toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8430toStringimpl(int i) {
            return i == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i == Both ? "LineHeightStyle.Trim.Both" : i == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "FirstLineTop", com.visa.cbp.getEncExpo.warmup, "getFirstLineTop-EVpEnUU", "()I", "LastLineBottom", "getLastLineBottom-EVpEnUU", "Both", "getBoth-EVpEnUU", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-EVpEnUU"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m8433getFirstLineTopEVpEnUU() {
                return androidx.compose.ui.text.style.LineHeightStyle.Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m8434getLastLineBottomEVpEnUU() {
                return androidx.compose.ui.text.style.LineHeightStyle.Trim.LastLineBottom;
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m8432getBothEVpEnUU() {
                return androidx.compose.ui.text.style.LineHeightStyle.Trim.Both;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m8435getNoneEVpEnUU() {
                return androidx.compose.ui.text.style.LineHeightStyle.Trim.None;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return m8427hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object other) {
            return m8425equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8427hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8425equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineHeightStyle.Trim) && i == ((androidx.compose.ui.text.style.LineHeightStyle.Trim) obj).getGetHighResolutionOutputSizeshNQ4ISI();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineHeightStyle.Trim m8423boximpl(int i) {
            return new androidx.compose.ui.text.style.LineHeightStyle.Trim(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "topRatio", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Alignment {
        private final float getHighSpeedVideoFpsRangesFor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineHeightStyle.Alignment.Companion INSTANCE = new androidx.compose.ui.text.style.LineHeightStyle.Alignment.Companion(null);
        private static final float Top = m8403constructorimpl(0.0f);
        private static final float Center = m8403constructorimpl(0.5f);
        private static final float Proportional = m8403constructorimpl(-1.0f);
        private static final float Bottom = m8403constructorimpl(1.0f);

        private /* synthetic */ Alignment(float f) {
            this.getHighSpeedVideoFpsRangesFor = f;
        }

        public final java.lang.String toString() {
            return m8407toStringimpl(this.getHighSpeedVideoFpsRangesFor);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8407toStringimpl(float f) {
            if (f == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LineHeightStyle.Alignment(topPercentage = ");
            sb.append(f);
            sb.append(')');
            return sb.toString();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "Top", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTop-PIaL0Z0", "()F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Bottom", "getBottom-PIaL0Z0"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m8412getTopPIaL0Z0() {
                return androidx.compose.ui.text.style.LineHeightStyle.Alignment.Top;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m8410getCenterPIaL0Z0() {
                return androidx.compose.ui.text.style.LineHeightStyle.Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m8411getProportionalPIaL0Z0() {
                return androidx.compose.ui.text.style.LineHeightStyle.Alignment.Proportional;
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m8409getBottomPIaL0Z0() {
                return androidx.compose.ui.text.style.LineHeightStyle.Alignment.Bottom;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m8403constructorimpl(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int hashCode() {
            return m8406hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object other) {
            return m8404equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8406hashCodeimpl(float f) {
            return java.lang.Float.hashCode(f);
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8405equalsimpl0(float f, float f2) {
            return java.lang.Float.compare(f, f2) == 0;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8404equalsimpl(float f, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineHeightStyle.Alignment) && java.lang.Float.compare(f, ((androidx.compose.ui.text.style.LineHeightStyle.Alignment) obj).getGetHighSpeedVideoFpsRangesFor()) == 0;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineHeightStyle.Alignment m8402boximpl(float f) {
            return new androidx.compose.ui.text.style.LineHeightStyle.Alignment(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Mode {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.LineHeightStyle.Mode.Companion INSTANCE = new androidx.compose.ui.text.style.LineHeightStyle.Mode.Companion(null);
        private static final int Fixed = m8414constructorimpl(0);
        private static final int Minimum = m8414constructorimpl(1);
        private static final int Tight = m8414constructorimpl(2);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8414constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8416equalsimpl0(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ Mode(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        public final java.lang.String toString() {
            return m8418toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8418toStringimpl(int i) {
            return m8416equalsimpl0(i, Fixed) ? "LineHeightStyle.Mode.Fixed" : m8416equalsimpl0(i, Minimum) ? "LineHeightStyle.Mode.Minimum" : m8416equalsimpl0(i, Tight) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "Fixed", com.visa.cbp.getEncExpo.warmup, "getFixed-lzQqcRY", "()I", "Minimum", "getMinimum-lzQqcRY", "Tight", "getTight-lzQqcRY"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m8420getFixedlzQqcRY() {
                return androidx.compose.ui.text.style.LineHeightStyle.Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m8421getMinimumlzQqcRY() {
                return androidx.compose.ui.text.style.LineHeightStyle.Mode.Minimum;
            }

            /* renamed from: getTight-lzQqcRY, reason: not valid java name */
            public final int m8422getTightlzQqcRY() {
                return androidx.compose.ui.text.style.LineHeightStyle.Mode.Tight;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return m8417hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final boolean equals(java.lang.Object other) {
            return m8415equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8417hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8415equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.LineHeightStyle.Mode) && i == ((androidx.compose.ui.text.style.LineHeightStyle.Mode) obj).getGetHighResolutionOutputSizeshNQ4ISI();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.LineHeightStyle.Mode m8413boximpl(int i) {
            return new androidx.compose.ui.text.style.LineHeightStyle.Mode(i);
        }
    }

    public /* synthetic */ LineHeightStyle(float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    public /* synthetic */ LineHeightStyle(float f, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2);
    }
}
