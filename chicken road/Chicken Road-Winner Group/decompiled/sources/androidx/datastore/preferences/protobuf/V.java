package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0147w f2196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2198c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2199d;

    public V(AbstractC0147w abstractC0147w, String str, Object[] objArr) {
        this.f2196a = abstractC0147w;
        this.f2197b = str;
        this.f2198c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2199d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f2199d = i3 | (charAt2 << i5);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }

    public final int a() {
        int i3 = this.f2199d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
