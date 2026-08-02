package E2;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1477a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1478b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.e f1479c;

    /* renamed from: d, reason: collision with root package name */
    public final C2.b f1480d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1481e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1482g;

    public o(Drawable drawable, i iVar, v2.e eVar, C2.b bVar, String str, boolean z3, boolean z5) {
        this.f1477a = drawable;
        this.f1478b = iVar;
        this.f1479c = eVar;
        this.f1480d = bVar;
        this.f1481e = str;
        this.f = z3;
        this.f1482g = z5;
    }

    @Override // E2.j
    public final Drawable a() {
        return this.f1477a;
    }

    @Override // E2.j
    public final i b() {
        return this.f1478b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.l.a(this.f1477a, oVar.f1477a)) {
            return kotlin.jvm.internal.l.a(this.f1478b, oVar.f1478b) && this.f1479c == oVar.f1479c && kotlin.jvm.internal.l.a(this.f1480d, oVar.f1480d) && kotlin.jvm.internal.l.a(this.f1481e, oVar.f1481e) && this.f == oVar.f && this.f1482g == oVar.f1482g;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1479c.hashCode() + ((this.f1478b.hashCode() + (this.f1477a.hashCode() * 31)) * 31)) * 31;
        C2.b bVar = this.f1480d;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f1481e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.f1482g ? 1231 : 1237);
    }
}
