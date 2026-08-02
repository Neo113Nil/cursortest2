package J0;

import C1.C0095a;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3770a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3771b;

    public /* synthetic */ a(String str, int i7) {
        this.f3770a = i7;
        this.f3771b = str;
    }

    public static a c(C0095a c0095a) {
        String str;
        c0095a.E(2);
        int t7 = c0095a.t();
        int i7 = t7 >> 1;
        int t8 = ((c0095a.t() >> 3) & 31) | ((t7 & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(t8 >= 10 ? "." : ".0");
        sb.append(t8);
        return new a(sb.toString(), 2);
    }

    @Override // J0.d
    public String a() {
        return this.f3771b;
    }

    public String toString() {
        switch (this.f3770a) {
            case 1:
                return this.f3771b;
            default:
                return super.toString();
        }
    }

    @Override // J0.d
    public void b(K0.b bVar) {
    }
}
