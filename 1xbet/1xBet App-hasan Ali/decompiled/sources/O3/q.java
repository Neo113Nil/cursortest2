package O3;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f4094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4095b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4096c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4097d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4098e;

    public q(String str, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.l.f("title_par_Text", str);
        kotlin.jvm.internal.l.f("description_par_Text", str2);
        kotlin.jvm.internal.l.f("badge_par_Text", str3);
        kotlin.jvm.internal.l.f("media_par_Text", str4);
        kotlin.jvm.internal.l.f("action_par_Text", str5);
        this.f4094a = str;
        this.f4095b = str2;
        this.f4096c = str3;
        this.f4097d = str4;
        this.f4098e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.a(this.f4094a, qVar.f4094a) && kotlin.jvm.internal.l.a(this.f4095b, qVar.f4095b) && kotlin.jvm.internal.l.a(this.f4096c, qVar.f4096c) && kotlin.jvm.internal.l.a(this.f4097d, qVar.f4097d) && kotlin.jvm.internal.l.a(this.f4098e, qVar.f4098e);
    }

    public final int hashCode() {
        return this.f4098e.hashCode() + L1.a.i(L1.a.i(L1.a.i(this.f4094a.hashCode() * 31, 31, this.f4095b), 31, this.f4096c), 31, this.f4097d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AquaStaticCreativeCopy(title_par_Text=");
        sb.append(this.f4094a);
        sb.append(", description_par_Text=");
        sb.append(this.f4095b);
        sb.append(", badge_par_Text=");
        sb.append(this.f4096c);
        sb.append(", media_par_Text=");
        sb.append(this.f4097d);
        sb.append(", action_par_Text=");
        return AbstractC2107A.u(sb, this.f4098e, ")");
    }
}
