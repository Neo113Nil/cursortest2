package kotlin;

import f4.C0427d;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final C0427d Companion = new C0427d();
    public static final KotlinVersion CURRENT = new KotlinVersion(2, 2, 20);

    public KotlinVersion(int i2, int i3, int i6) {
        this.major = i2;
        this.minor = i3;
        this.patch = i6;
        this.version = versionOf(i2, i3, i6);
    }

    private final int versionOf(int i2, int i3, int i6) {
        if (i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256 && i6 >= 0 && i6 < 256) {
            return (i2 << 16) + (i3 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i6).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
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
        int i6 = this.major;
        return i6 > i2 || (i6 == i2 && this.minor >= i3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        i.e(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int i2, int i3, int i6) {
        int i7;
        int i8 = this.major;
        return i8 > i2 || (i8 == i2 && ((i7 = this.minor) > i3 || (i7 == i3 && this.patch >= i6)));
    }

    public KotlinVersion(int i2, int i3) {
        this(i2, i3, 0);
    }
}
