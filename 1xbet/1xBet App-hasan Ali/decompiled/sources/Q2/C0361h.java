package Q2;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import s3.BinderC2361b;

/* renamed from: Q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361h extends AbstractC0377p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f5019c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0624Ka f5021e;
    public final /* synthetic */ C0375o f;

    public C0361h(C0375o c0375o, Context context, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka) {
        this.f5018b = context;
        this.f5019c = a1Var;
        this.f5020d = str;
        this.f5021e = interfaceC0624Ka;
        this.f = c0375o;
    }

    @Override // Q2.AbstractC0377p
    public final Object a() {
        C0375o.U(this.f5018b, "app_open");
        return new M0();
    }

    @Override // Q2.AbstractC0377p
    public final Object b(T t5) {
        return t5.J2(new BinderC2361b(this.f5018b), this.f5019c, this.f5020d, this.f5021e, 244410000);
    }

    @Override // Q2.AbstractC0377p
    public final /* bridge */ /* synthetic */ Object c() {
        return ((J0) this.f.f5042l).q(this.f5018b, this.f5019c, this.f5020d, this.f5021e, 4);
    }
}
