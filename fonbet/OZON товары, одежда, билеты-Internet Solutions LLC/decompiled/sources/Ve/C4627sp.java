package Ve;

import retrofit2.Retrofit;

/* renamed from: Ve.sp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4627sp implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final C4135bn f32068a;

    public C4627sp(C4135bn c4135bn) {
        this.f32068a = c4135bn;
    }

    @Override // Pc.a
    public final Object get() {
        npi.spay.Kq kq2 = (npi.spay.Kq) C4598rp.b((Retrofit) this.f32068a.get(), "retrofit", npi.spay.Kq.class, "retrofit.create(SdkFlowSPayApi::class.java)");
        Jb.j.d(kq2);
        return kq2;
    }
}
