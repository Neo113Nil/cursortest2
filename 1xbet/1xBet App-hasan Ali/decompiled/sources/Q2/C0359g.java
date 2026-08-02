package Q2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import s3.BinderC2361b;

/* renamed from: Q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359g extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f5015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0624Ka f5017e;
    public final /* synthetic */ C0375o f;

    public C0359g(C0375o c0375o, Context context, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka) {
        this.f5014b = context;
        this.f5015c = a1Var;
        this.f5016d = str;
        this.f5017e = interfaceC0624Ka;
        this.f = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5014b, "banner");
        return new M0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.A2(new BinderC2361b(this.f5014b), this.f5015c, this.f5016d, this.f5017e, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object c() {
        return ((J0) this.f.f5042l).q(this.f5014b, this.f5015c, this.f5016d, this.f5017e, 1);
    }
}
