package Q2;

import android.content.Context;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import s3.BinderC2361b;

/* renamed from: Q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365j extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f5027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0610Ia f5029e;
    public final /* synthetic */ C0375o f;

    public C0365j(C0375o c0375o, Context context, a1 a1Var, String str, BinderC0610Ia binderC0610Ia) {
        this.f5026b = context;
        this.f5027c = a1Var;
        this.f5028d = str;
        this.f5029e = binderC0610Ia;
        this.f = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5026b, "interstitial");
        return new M0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.J1(new BinderC2361b(this.f5026b), this.f5027c, this.f5028d, this.f5029e, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object c() {
        J0 j02 = (J0) this.f.f5042l;
        BinderC0610Ia binderC0610Ia = this.f5029e;
        return j02.q(this.f5026b, this.f5027c, this.f5028d, binderC0610Ia, 2);
    }
}
