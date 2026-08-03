package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC0086w f2265a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2266b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f2267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2268d;

    public V(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, java.lang.String str, java.lang.Object[] objArr) {
        this.f2265a = abstractC0086w;
        this.f2266b = str;
        this.f2267c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2268d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f2268d = i2 | (charAt2 << i4);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    public final androidx.datastore.preferences.protobuf.AbstractC0065a a() {
        return this.f2265a;
    }

    public final java.lang.Object[] b() {
        return this.f2267c;
    }

    public final java.lang.String c() {
        return this.f2266b;
    }

    public final int d() {
        int i2 = this.f2268d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
