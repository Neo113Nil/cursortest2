package kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018"}, d2 = {"Lkotlin/KotlinVersion;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "compareTo", "(Lkotlin/KotlinVersion;)I", "isAtLeast", "(II)Z", "(III)Z", com.visa.cbp.getEncExpo.warmup, "getMajor", "getMinor", "getPatch", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KotlinVersion implements java.lang.Comparable<kotlin.KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;
    private final int major;
    private final int minor;
    private final int patch;
    public static final kotlin.KotlinVersion CURRENT = kotlin.KotlinVersionCurrentValue.getHighResolutionOutputSizeshNQ4ISI();

    public KotlinVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.getHighSpeedVideoFpsRanges = (i << 16) + (i2 << 8) + i3;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Version components are out of range: ");
        sb.append(i);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(i2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(i3);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.major);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.minor);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.patch);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        kotlin.KotlinVersion kotlinVersion = other instanceof kotlin.KotlinVersion ? (kotlin.KotlinVersion) other : null;
        return kotlinVersion != null && this.getHighSpeedVideoFpsRanges == kotlinVersion.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.KotlinVersion other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.getHighSpeedVideoFpsRanges - other.getHighSpeedVideoFpsRanges;
    }

    public final boolean isAtLeast(int major, int minor) {
        int i = this.major;
        if (i <= major) {
            return i == major && this.minor >= minor;
        }
        return true;
    }

    public final boolean isAtLeast(int major, int minor, int patch) {
        int i = this.major;
        if (i > major) {
            return true;
        }
        if (i != major) {
            return false;
        }
        int i2 = this.minor;
        if (i2 <= minor) {
            return i2 == minor && this.patch >= patch;
        }
        return true;
    }
}
