package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "", "multiplier", "constructor-impl", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMultiplier", "()F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.BaselineShift.Companion INSTANCE = new androidx.compose.ui.text.style.BaselineShift.Companion(null);
    private static final float Superscript = m8310constructorimpl(0.5f);
    private static final float Subscript = m8310constructorimpl(-0.5f);
    private static final float None = m8310constructorimpl(0.0f);
    private static final float Unspecified = m8310constructorimpl(Float.NaN);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m8310constructorimpl(float f) {
        return f;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/BaselineShift;", "Superscript", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSuperscript-y9eOQZs", "()F", "getSuperscript-y9eOQZs$annotations", "Subscript", "getSubscript-y9eOQZs", "getSubscript-y9eOQZs$annotations", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "getNone-y9eOQZs", "getNone-y9eOQZs$annotations", "Unspecified", "getUnspecified-y9eOQZs", "getUnspecified-y9eOQZs$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m8316getNoney9eOQZs$annotations() {
        }

        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m8317getSubscripty9eOQZs$annotations() {
        }

        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m8318getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getUnspecified-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m8319getUnspecifiedy9eOQZs$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m8322getSuperscripty9eOQZs() {
            return androidx.compose.ui.text.style.BaselineShift.Superscript;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m8321getSubscripty9eOQZs() {
            return androidx.compose.ui.text.style.BaselineShift.Subscript;
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m8320getNoney9eOQZs() {
            return androidx.compose.ui.text.style.BaselineShift.None;
        }

        /* renamed from: getUnspecified-y9eOQZs, reason: not valid java name */
        public final float m8323getUnspecifiedy9eOQZs() {
            return androidx.compose.ui.text.style.BaselineShift.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ BaselineShift(float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m8315unboximpl() {
        return this.multiplier;
    }

    public final java.lang.String toString() {
        return m8314toStringimpl(this.multiplier);
    }

    public final int hashCode() {
        return m8313hashCodeimpl(this.multiplier);
    }

    public final boolean equals(java.lang.Object other) {
        return m8311equalsimpl(this.multiplier, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8314toStringimpl(float f) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaselineShift(multiplier=");
        sb.append(f);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8313hashCodeimpl(float f) {
        return java.lang.Float.hashCode(f);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8312equalsimpl0(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8311equalsimpl(float f, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.style.BaselineShift) && java.lang.Float.compare(f, ((androidx.compose.ui.text.style.BaselineShift) obj).m8315unboximpl()) == 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.style.BaselineShift m8309boximpl(float f) {
        return new androidx.compose.ui.text.style.BaselineShift(f);
    }
}
