package O0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p122r.b f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4886b;

    public o(p pVar, p122r.b bVar) {
        this.f4886b = pVar;
        this.f4885a = bVar;
    }

    @Override // O0.l
    public final void e(m mVar) {
        ((ArrayList) this.f4885a.getOrDefault(this.f4886b.f4888b, null)).remove(mVar);
        mVar.v(this);
    }
}
