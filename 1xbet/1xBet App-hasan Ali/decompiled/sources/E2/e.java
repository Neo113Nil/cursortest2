package E2;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1419b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f1420c;

    public e(Drawable drawable, i iVar, Throwable th) {
        this.f1418a = drawable;
        this.f1419b = iVar;
        this.f1420c = th;
    }

    @Override // E2.j
    public final Drawable a() {
        return this.f1418a;
    }

    @Override // E2.j
    public final i b() {
        return this.f1419b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.l.a(this.f1418a, eVar.f1418a)) {
            return kotlin.jvm.internal.l.a(this.f1419b, eVar.f1419b) && kotlin.jvm.internal.l.a(this.f1420c, eVar.f1420c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f1418a;
        return this.f1420c.hashCode() + ((this.f1419b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
