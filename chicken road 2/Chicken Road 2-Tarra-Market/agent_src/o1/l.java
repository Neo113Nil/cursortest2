package o1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends j1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.e f6306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f6308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Object[] objArr, int i2, s1.e eVar, int i3, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f6308e = rVar;
        this.f6305b = i2;
        this.f6306c = eVar;
        this.f6307d = i3;
    }

    @Override // j1.a
    public final void a() {
        try {
            z zVar = this.f6308e.f6328j;
            s1.e eVar = this.f6306c;
            int i2 = this.f6307d;
            zVar.getClass();
            eVar.q(i2);
            this.f6308e.f6336r.l(this.f6305b, 6);
            synchronized (this.f6308e) {
                this.f6308e.f6338t.remove(Integer.valueOf(this.f6305b));
            }
        } catch (IOException unused) {
        }
    }
}
