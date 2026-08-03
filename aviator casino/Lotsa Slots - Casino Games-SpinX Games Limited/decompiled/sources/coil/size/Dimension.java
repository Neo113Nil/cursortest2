package coil.size;

/* compiled from: Dimension.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/size/Dimension;", "", "<init>", "()V", "Pixels", "Undefined", "Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension$Undefined;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Dimension {
    public /* synthetic */ Dimension(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Dimension() {
    }

    /* compiled from: Dimension.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcoil/size/Dimension$Pixels;", "Lcoil/size/Dimension;", "px", "", "<init>", "(I)V", "equals", "", "other", "", "hashCode", "toString", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pixels extends coil.size.Dimension {
        public final int px;

        public Pixels(int i) {
            super(null);
            this.px = i;
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof coil.size.Dimension.Pixels) && this.px == ((coil.size.Dimension.Pixels) other).px;
        }

        /* renamed from: hashCode, reason: from getter */
        public int getPx() {
            return this.px;
        }

        public java.lang.String toString() {
            return java.lang.String.valueOf(this.px);
        }
    }

    /* compiled from: Dimension.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcoil/size/Dimension$Undefined;", "Lcoil/size/Dimension;", "<init>", "()V", "toString", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Undefined extends coil.size.Dimension {
        public static final coil.size.Dimension.Undefined INSTANCE = new coil.size.Dimension.Undefined();

        private Undefined() {
            super(null);
        }

        public java.lang.String toString() {
            return "Dimension.Undefined";
        }
    }
}
