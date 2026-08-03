package kotlin;

/* loaded from: classes.dex */
public final class KotlinVersion implements java.lang.Comparable<kotlin.KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final h1.C0170b Companion = new h1.C0170b();
    public static final kotlin.KotlinVersion CURRENT = new kotlin.KotlinVersion(2, 2, 0);

    public KotlinVersion(int i2, int i3, int i4) {
        this.major = i2;
        this.minor = i3;
        this.patch = i4;
        this.version = versionOf(i2, i3, i4);
    }

    private final int versionOf(int i2, int i3, int i4) {
        if (i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256 && i4 >= 0 && i4 < 256) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new java.lang.IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        kotlin.KotlinVersion kotlinVersion = obj instanceof kotlin.KotlinVersion ? (kotlin.KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
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

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i2, int i3) {
        int i4 = this.major;
        return i4 > i2 || (i4 == i2 && this.minor >= i3);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(kotlin.KotlinVersion other) {
        kotlin.jvm.internal.i.e(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i2, int i3) {
        this(i2, i3, 0);
    }

    public final boolean isAtLeast(int i2, int i3, int i4) {
        int i5;
        int i6 = this.major;
        return i6 > i2 || (i6 == i2 && ((i5 = this.minor) > i3 || (i5 == i3 && this.patch >= i4)));
    }
}
