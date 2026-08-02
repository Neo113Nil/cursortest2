package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0696u f9142a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9143b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9144c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9145d;

    public T(AbstractC0696u abstractC0696u, String str, Object[] objArr) {
        this.f9142a = abstractC0696u;
        this.f9143b = str;
        this.f9144c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9145d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f9145d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0677a a() {
        return this.f9142a;
    }

    public final Object[] b() {
        return this.f9144c;
    }

    public final String c() {
        return this.f9143b;
    }

    public final int d() {
        int i7 = this.f9145d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
