package T3;

import J3.f;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6347d;

    public b(f fVar, int i7, String str, String str2) {
        this.f6344a = fVar;
        this.f6345b = i7;
        this.f6346c = str;
        this.f6347d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6344a == bVar.f6344a && this.f6345b == bVar.f6345b && this.f6346c.equals(bVar.f6346c) && this.f6347d.equals(bVar.f6347d);
    }

    public final int hashCode() {
        return Objects.hash(this.f6344a, Integer.valueOf(this.f6345b), this.f6346c, this.f6347d);
    }

    public final String toString() {
        return "(status=" + this.f6344a + ", keyId=" + this.f6345b + ", keyType='" + this.f6346c + "', keyPrefix='" + this.f6347d + "')";
    }
}
