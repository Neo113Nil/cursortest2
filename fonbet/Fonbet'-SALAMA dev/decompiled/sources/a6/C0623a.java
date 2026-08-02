package a6;

import B1.m;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0623a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7975c;

    public C0623a(m mVar) {
        int i7;
        String str = (String) mVar.f1016d;
        this.f7973a = (String) mVar.f1015c;
        int i8 = mVar.f1014b;
        if (i8 == -1) {
            if (str.equals("http")) {
                i7 = 80;
            } else if (str.equals("https")) {
                i7 = 443;
            } else {
                i8 = -1;
            }
            i8 = i7;
        }
        this.f7974b = i8;
        this.f7975c = mVar.toString();
    }

    public static int a(char c3) {
        if (c3 >= '0' && c3 <= '9') {
            return c3 - '0';
        }
        if (c3 >= 'a' && c3 <= 'f') {
            return c3 - 'W';
        }
        if (c3 < 'A' || c3 > 'F') {
            return -1;
        }
        return c3 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0623a) && ((C0623a) obj).f7975c.equals(this.f7975c);
    }

    public final int hashCode() {
        return this.f7975c.hashCode();
    }

    public final String toString() {
        return this.f7975c;
    }
}
