package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0675u f9142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f9144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9145d;

    public T(AbstractC0675u abstractC0675u, String str, Object[] objArr) {
        this.f9142a = abstractC0675u;
        this.f9143b = str;
        this.f9144c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f9145d = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 55296) {
                this.f9145d = i7 | (cCharAt2 << i9);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    public final AbstractC0656a a() {
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
