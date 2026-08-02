package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class e0 implements O {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5376w f42513a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42514b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f42515c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42516d;

    e0(AbstractC5376w abstractC5376w, String str, Object[] objArr) {
        this.f42513a = abstractC5376w;
        this.f42514b = str;
        this.f42515c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f42516d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f42516d = i11 | (charAt2 << i13);
                return;
            } else {
                i11 |= (charAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    final Object[] a() {
        return this.f42515c;
    }

    final String b() {
        return this.f42514b;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final Q getDefaultInstance() {
        return this.f42513a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final b0 getSyntax() {
        int i11 = this.f42516d;
        return (i11 & 1) != 0 ? b0.PROTO2 : (i11 & 4) == 4 ? b0.EDITIONS : b0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean isMessageSetWireFormat() {
        return (this.f42516d & 2) == 2;
    }
}
