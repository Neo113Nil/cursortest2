package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0226v f4398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4399b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4401d;

    public U(AbstractC0226v abstractC0226v, String str, Object[] objArr) {
        this.f4398a = abstractC0226v;
        this.f4399b = str;
        this.f4400c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4401d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f4401d = i2 | (charAt2 << i6);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i3 = i7;
            }
        }
    }

    public final AbstractC0206a a() {
        return this.f4398a;
    }

    public final Object[] b() {
        return this.f4400c;
    }

    public final String c() {
        return this.f4399b;
    }

    public final int d() {
        int i2 = this.f4401d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
