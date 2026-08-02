package O0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.b f4885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4886b;

    public o(p pVar, r.b bVar) {
        this.f4886b = pVar;
        this.f4885a = bVar;
    }

    @Override // O0.l
    public final void e(m mVar) {
        ((ArrayList) this.f4885a.getOrDefault(this.f4886b.f4888b, null)).remove(mVar);
        mVar.v(this);
    }
}
