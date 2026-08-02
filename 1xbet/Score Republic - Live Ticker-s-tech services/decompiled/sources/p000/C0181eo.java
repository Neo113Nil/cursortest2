package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0181eo implements iq0, InterfaceC0261gt, InterfaceC0558ov {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2150j;

    /* JADX INFO: renamed from: k */
    public Context f2151k;

    public C0181eo(Context context) {
        this.f2150j = 2;
        this.f2151k = context.getApplicationContext();
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: a */
    public Class mo1476a() {
        return Drawable.class;
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo1477b(Object obj) {
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: c */
    public Object mo1478c(Resources.Theme theme, Resources resources, int i) {
        Context context = this.f2151k;
        return yd0.m5768g(context, context, i, theme);
    }

    @Override // p000.InterfaceC0558ov
    /* JADX INFO: renamed from: d */
    public void mo1479d(d71 d71Var) {
        ThreadFactoryC0022al threadFactoryC0022al = new ThreadFactoryC0022al("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC0022al);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0886xq(this, d71Var, threadPoolExecutor, 2));
    }

    /* JADX INFO: renamed from: e */
    public C0218fo m1480e() {
        Context context = this.f2151k;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C0218fo c0218fo = new C0218fo();
        c0218fo.f2459j = C0557ou.m3795a(vk1.f8208a);
        int i = 1;
        C0735tn c0735tn = new C0735tn(1, context);
        c0218fo.f2460k = c0735tn;
        int i2 = 0;
        c0218fo.f2461l = C0557ou.m3795a(new pp0(c0735tn, new C0735tn(0, c0735tn), i2));
        C0735tn c0735tn2 = c0218fo.f2460k;
        c0218fo.f2462m = new C0523nx(c0735tn2, 1);
        ny0 ny0VarM3795a = C0557ou.m3795a(new pp0(c0218fo.f2462m, C0557ou.m3795a(new C0523nx(c0735tn2, 0)), i));
        c0218fo.f2463n = ny0VarM3795a;
        C0745tx c0745tx = new C0745tx(1);
        C0735tn c0735tn3 = c0218fo.f2460k;
        q51 q51Var = new q51(c0735tn3, ny0VarM3795a, c0745tx, i2);
        ny0 ny0Var = c0218fo.f2459j;
        ny0 ny0Var2 = c0218fo.f2461l;
        c0218fo.f2464o = C0557ou.m3795a(new q51(new C0072br(ny0Var, ny0Var2, q51Var, ny0VarM3795a, ny0VarM3795a), new og1(c0735tn3, ny0Var2, ny0VarM3795a, q51Var, ny0Var, ny0VarM3795a, ny0VarM3795a), new qk1(ny0Var, ny0VarM3795a, q51Var, ny0VarM3795a), i));
        return c0218fo;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f2150j) {
            case 1:
                return new C0314i8(this.f2151k, this);
            case 2:
            case 3:
            default:
                return new C0314i8(this.f2151k, f71Var.m1658d(Integer.class, InputStream.class));
            case 4:
                return new jn0(this.f2151k, 0);
            case 5:
                return new jn0(this.f2151k, 2);
        }
    }

    public /* synthetic */ C0181eo(Context context, int i) {
        this.f2150j = i;
        this.f2151k = context;
    }

    public /* synthetic */ C0181eo() {
        this.f2150j = 0;
    }
}
