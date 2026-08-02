package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-JdDtMQo$ui_text", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getLinearity-4e0Vf04$ui_text", "Z", "getSubpixelTextPositioning$ui_text", "()Z", "Companion", "Linearity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final androidx.compose.ui.text.style.TextMotion Animated;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextMotion.Companion INSTANCE;
    private static final androidx.compose.ui.text.style.TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name and from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* renamed from: getSubpixelTextPositioning$ui_text, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextMotion;", "Static", "Landroidx/compose/ui/text/style/TextMotion;", "getStatic", "()Landroidx/compose/ui/text/style/TextMotion;", "Animated", "getAnimated"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.style.TextMotion getStatic() {
            return androidx.compose.ui.text.style.TextMotion.Static;
        }

        public final androidx.compose.ui.text.style.TextMotion getAnimated() {
            return androidx.compose.ui.text.style.TextMotion.Animated;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new androidx.compose.ui.text.style.TextMotion.Companion(defaultConstructorMarker);
        Static = new androidx.compose.ui.text.style.TextMotion(androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m8485getFontHinting4e0Vf04(), false, defaultConstructorMarker);
        Animated = new androidx.compose.ui.text.style.TextMotion(androidx.compose.ui.text.style.TextMotion.Linearity.INSTANCE.m8486getLinear4e0Vf04(), true, defaultConstructorMarker);
    }

    /* renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.style.TextMotion m8475copyJdDtMQo$ui_text$default(androidx.compose.ui.text.style.TextMotion textMotion, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m8476copyJdDtMQo$ui_text(i, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final androidx.compose.ui.text.style.TextMotion m8476copyJdDtMQo$ui_text(int linearity, boolean subpixelTextPositioning) {
        return new androidx.compose.ui.text.style.TextMotion(linearity, subpixelTextPositioning, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.style.TextMotion)) {
            return false;
        }
        androidx.compose.ui.text.style.TextMotion textMotion = (androidx.compose.ui.text.style.TextMotion) other;
        return androidx.compose.ui.text.style.TextMotion.Linearity.m8481equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    public final int hashCode() {
        return (androidx.compose.ui.text.style.TextMotion.Linearity.m8482hashCodeimpl(this.linearity) * 31) + java.lang.Boolean.hashCode(this.subpixelTextPositioning);
    }

    public final java.lang.String toString() {
        return kotlin.jvm.internal.Intrinsics.areEqual(this, Static) ? "TextMotion.Static" : kotlin.jvm.internal.Intrinsics.areEqual(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class Linearity {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.compose.ui.text.style.TextMotion.Linearity.Companion INSTANCE = new androidx.compose.ui.text.style.TextMotion.Linearity.Companion(null);
        private static final int Linear = m8479constructorimpl(1);
        private static final int FontHinting = m8479constructorimpl(2);
        private static final int None = m8479constructorimpl(3);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m8479constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8481equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "Linear", com.visa.cbp.getEncExpo.warmup, "getLinear-4e0Vf04", "()I", "FontHinting", "getFontHinting-4e0Vf04", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-4e0Vf04"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m8486getLinear4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.Linear;
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m8485getFontHinting4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.FontHinting;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m8487getNone4e0Vf04() {
                return androidx.compose.ui.text.style.TextMotion.Linearity.None;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final java.lang.String toString() {
            return m8483toStringimpl(this.Camera2StreamConfigurationMap);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m8483toStringimpl(int i) {
            return m8481equalsimpl0(i, Linear) ? "Linearity.Linear" : m8481equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m8481equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int hashCode() {
            return m8482hashCodeimpl(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object obj) {
            return m8480equalsimpl(this.Camera2StreamConfigurationMap, obj);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8482hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8480equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.ui.text.style.TextMotion.Linearity) && i == ((androidx.compose.ui.text.style.TextMotion.Linearity) obj).getCamera2StreamConfigurationMap();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.ui.text.style.TextMotion.Linearity m8478boximpl(int i) {
            return new androidx.compose.ui.text.style.TextMotion.Linearity(i);
        }
    }

    public /* synthetic */ TextMotion(int i, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }
}
