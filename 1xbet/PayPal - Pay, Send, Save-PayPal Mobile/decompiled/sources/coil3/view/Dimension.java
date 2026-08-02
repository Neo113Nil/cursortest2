package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/size/Dimension;", "", "Pixels", "Undefined", "Lcoil3/size/Dimension$Pixels;", "Lcoil3/size/Dimension$Undefined;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Dimension {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/size/Dimension$Pixels;", "Lcoil3/size/Dimension;", "", "px", "constructor-impl", "(I)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPx"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Pixels implements coil3.view.Dimension {
        private final int px;

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9804equalsimpl0(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ Pixels(int i) {
            this.px = i;
        }

        public final int getPx() {
            return this.px;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m9802constructorimpl(int i) {
            if (i > 0) {
                return i;
            }
            throw new java.lang.IllegalArgumentException("px must be > 0.".toString());
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m9807unboximpl() {
            return this.px;
        }

        public final java.lang.String toString() {
            return m9806toStringimpl(this.px);
        }

        public final int hashCode() {
            return m9805hashCodeimpl(this.px);
        }

        public final boolean equals(java.lang.Object other) {
            return m9803equalsimpl(this.px, other);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9806toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pixels(px=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9805hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9803equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof coil3.size.Dimension.Pixels) && i == ((coil3.size.Dimension.Pixels) obj).m9807unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ coil3.size.Dimension.Pixels m9801boximpl(int i) {
            return new coil3.size.Dimension.Pixels(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/size/Dimension$Undefined;", "Lcoil3/size/Dimension;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Undefined implements coil3.view.Dimension {
        public static final coil3.size.Dimension.Undefined INSTANCE = new coil3.size.Dimension.Undefined();

        public final int hashCode() {
            return -2093724603;
        }

        private Undefined() {
        }

        public final java.lang.String toString() {
            return "Undefined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof coil3.size.Dimension.Undefined)) {
                return false;
            }
            return true;
        }
    }
}
