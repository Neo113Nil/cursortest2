package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\r\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\f\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000e\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u000e\u0010\u0011J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0012\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0013\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(F)F", "other", "plus-5rwHm24", "(FF)F", "plus", "minus-5rwHm24", "minus", "unaryMinus-D9Ej5fM", "unaryMinus", "div-u2uoSUM", "div", "", "(FI)F", "div-0680j_4", "times-u2uoSUM", "times", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue", "()F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Dp implements java.lang.Comparable<androidx.compose.ui.unit.Dp> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.Dp.Companion INSTANCE = new androidx.compose.ui.unit.Dp.Companion(null);
    private static final float Hairline = m8601constructorimpl(0.0f);
    private static final float Infinity = m8601constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m8601constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m8601constructorimpl(float f) {
        return f;
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m8602div0680j_4(float f, float f2) {
        return f / f2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(androidx.compose.ui.unit.Dp dp) {
        return m8614compareTo0680j_4(dp.m8615unboximpl());
    }

    private /* synthetic */ Dp(float f) {
        this.value = f;
    }

    public final float getValue() {
        return this.value;
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m8609plus5rwHm24(float f, float f2) {
        return m8601constructorimpl(f + f2);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m8608minus5rwHm24(float f, float f2) {
        return m8601constructorimpl(f - f2);
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m8613unaryMinusD9Ej5fM(float f) {
        return m8601constructorimpl(-f);
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m8603divu2uoSUM(float f, float f2) {
        return m8601constructorimpl(f / f2);
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m8604divu2uoSUM(float f, int i) {
        return m8601constructorimpl(f / i);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m8610timesu2uoSUM(float f, float f2) {
        return m8601constructorimpl(f * f2);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m8611timesu2uoSUM(float f, int i) {
        return m8601constructorimpl(f * i);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public final int m8614compareTo0680j_4(float f) {
        return m8600compareTo0680j_4(this.value, f);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m8600compareTo0680j_4(float f, float f2) {
        if (androidx.compose.ui.unit.ComposeUiUnitFlags.isDpCompareToChanged) {
            if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
                return 0;
            }
            return java.lang.Float.compare(f, f2);
        }
        return java.lang.Float.compare(f, f2);
    }

    public final java.lang.String toString() {
        return m8612toStringimpl(this.value);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Hairline", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHairline-D9Ej5fM", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "getInfinity-D9Ej5fM", "getInfinity-D9Ej5fM$annotations", "Unspecified", "getUnspecified-D9Ej5fM", "getUnspecified-D9Ej5fM$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8616getHairlineD9Ej5fM$annotations() {
        }

        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8617getInfinityD9Ej5fM$annotations() {
        }

        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m8618getUnspecifiedD9Ej5fM$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m8619getHairlineD9Ej5fM() {
            return androidx.compose.ui.unit.Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m8620getInfinityD9Ej5fM() {
            return androidx.compose.ui.unit.Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m8621getUnspecifiedD9Ej5fM() {
            return androidx.compose.ui.unit.Dp.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8612toStringimpl(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(f);
        sb.append(".dp");
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m8615unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8607hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m8605equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8607hashCodeimpl(float f) {
        return java.lang.Float.hashCode(f);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8606equalsimpl0(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8605equalsimpl(float f, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.Dp) && java.lang.Float.compare(f, ((androidx.compose.ui.unit.Dp) obj).m8615unboximpl()) == 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.Dp m8599boximpl(float f) {
        return new androidx.compose.ui.unit.Dp(f);
    }
}
