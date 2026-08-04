package F1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2575d;

    public u(int i7, byte[] bArr, int i8, int i9) {
        this.f2572a = i7;
        this.f2573b = bArr;
        this.f2574c = i8;
        this.f2575d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2572a == uVar.f2572a && this.f2574c == uVar.f2574c && this.f2575d == uVar.f2575d && Arrays.equals(this.f2573b, uVar.f2573b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2573b) + (this.f2572a * 31)) * 31) + this.f2574c) * 31) + this.f2575d;
    }
}
