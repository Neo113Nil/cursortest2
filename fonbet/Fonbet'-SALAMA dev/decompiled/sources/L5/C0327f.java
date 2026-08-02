package L5;

import com.google.android.gms.ads.internal.client.zzv;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import y2.C1797a;

/* renamed from: L5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0327f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4463a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4464b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4465c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4466d;

    /* renamed from: e, reason: collision with root package name */
    public final C0326e f4467e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4468f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4469g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4470h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4471i;

    public C0327f(y2.k kVar) {
        zzv zzvVar = kVar.f18172a;
        this.f4463a = zzvVar.f10784a;
        this.f4464b = zzvVar.f10785b;
        this.f4465c = kVar.toString();
        zzv zzvVar2 = kVar.f18172a;
        if (zzvVar2.f10787d != null) {
            this.f4466d = new HashMap();
            for (String str : zzvVar2.f10787d.keySet()) {
                this.f4466d.put(str, zzvVar2.f10787d.getString(str));
            }
        } else {
            this.f4466d = new HashMap();
        }
        C1797a c1797a = kVar.f18173b;
        if (c1797a != null) {
            this.f4467e = new C0326e(c1797a);
        }
        this.f4468f = zzvVar2.f10788e;
        this.f4469g = zzvVar2.f10789f;
        this.f4470h = zzvVar2.f10790x;
        this.f4471i = zzvVar2.f10791y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0327f)) {
            return false;
        }
        C0327f c0327f = (C0327f) obj;
        return Objects.equals(this.f4463a, c0327f.f4463a) && this.f4464b == c0327f.f4464b && Objects.equals(this.f4465c, c0327f.f4465c) && Objects.equals(this.f4467e, c0327f.f4467e) && Objects.equals(this.f4466d, c0327f.f4466d) && Objects.equals(this.f4468f, c0327f.f4468f) && Objects.equals(this.f4469g, c0327f.f4469g) && Objects.equals(this.f4470h, c0327f.f4470h) && Objects.equals(this.f4471i, c0327f.f4471i);
    }

    public final int hashCode() {
        return Objects.hash(this.f4463a, Long.valueOf(this.f4464b), this.f4465c, this.f4467e, this.f4468f, this.f4469g, this.f4470h, this.f4471i);
    }

    public C0327f(String str, long j, String str2, Map map, C0326e c0326e, String str3, String str4, String str5, String str6) {
        this.f4463a = str;
        this.f4464b = j;
        this.f4465c = str2;
        this.f4466d = map;
        this.f4467e = c0326e;
        this.f4468f = str3;
        this.f4469g = str4;
        this.f4470h = str5;
        this.f4471i = str6;
    }
}
