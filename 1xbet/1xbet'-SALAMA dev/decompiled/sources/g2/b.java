package g2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13114d;

    public b(String str, String str2, int i7, int i8) {
        this.f13111a = str;
        this.f13112b = str2;
        this.f13113c = i7;
        this.f13114d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13113c == bVar.f13113c && this.f13114d == bVar.f13114d && p097n3.a.t(this.f13111a, bVar.f13111a) && p097n3.a.t(this.f13112b, bVar.f13112b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13111a, this.f13112b, Integer.valueOf(this.f13113c), Integer.valueOf(this.f13114d)});
    }
}
