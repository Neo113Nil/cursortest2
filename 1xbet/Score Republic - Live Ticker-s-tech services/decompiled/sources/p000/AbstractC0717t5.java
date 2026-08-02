package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0717t5 implements iq0 {

    /* JADX INFO: renamed from: j */
    public Object f7279j;

    /* JADX INFO: renamed from: k */
    public Object f7280k;

    public AbstractC0717t5(Context context, Class cls) {
        this.f7279j = context;
        this.f7280k = cls;
    }

    /* JADX INFO: renamed from: c */
    public void m4687c() {
        C0680s5 c0680s5 = (C0680s5) this.f7279j;
        if (c0680s5 != null) {
            try {
                ((LayoutInflaterFactory2C0828w5) this.f7280k).f8427t.unregisterReceiver(c0680s5);
            } catch (IllegalArgumentException unused) {
            }
            this.f7279j = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IntentFilter mo4245d();

    /* JADX INFO: renamed from: e */
    public abstract int mo4246e();

    /* JADX INFO: renamed from: f */
    public MenuItem m4688f(MenuItem menuItem) {
        if (!(menuItem instanceof wb1)) {
            return menuItem;
        }
        wb1 wb1Var = (wb1) menuItem;
        if (((w71) this.f7280k) == null) {
            this.f7280k = new w71(0);
        }
        MenuItem menuItem2 = (MenuItem) ((w71) this.f7280k).get(wb1Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        vn0 vn0Var = new vn0((Context) this.f7279j, wb1Var);
        ((w71) this.f7280k).put(wb1Var, vn0Var);
        return vn0Var;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4247g();

    /* JADX INFO: renamed from: h */
    public void m4689h() {
        m4687c();
        IntentFilter intentFilterMo4245d = mo4245d();
        if (intentFilterMo4245d.countActions() == 0) {
            return;
        }
        if (((C0680s5) this.f7279j) == null) {
            this.f7279j = new C0680s5(this);
        }
        ((LayoutInflaterFactory2C0828w5) this.f7280k).f8427t.registerReceiver((C0680s5) this.f7279j, intentFilterMo4245d);
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        Context context = (Context) this.f7279j;
        Class cls = (Class) this.f7280k;
        return new zy0(context, f71Var.m1658d(File.class, cls), f71Var.m1658d(Uri.class, cls), cls);
    }

    public AbstractC0717t5(Context context) {
        this.f7279j = context;
    }

    public AbstractC0717t5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5) {
        this.f7280k = layoutInflaterFactory2C0828w5;
    }
}
