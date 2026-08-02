package L3;

import F3.y;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class d extends y {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3035b = new c();

    /* renamed from: a, reason: collision with root package name */
    public final y f3036a;

    public d(y yVar) {
        this.f3036a = yVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        Date date = (Date) this.f3036a.a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        this.f3036a.b(bVar, (Timestamp) obj);
    }
}
