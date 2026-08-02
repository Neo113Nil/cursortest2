package p000;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 implements hd1, mn0, s30, iq0, InterfaceC0277h8, qn0, InterfaceC0847wo, InterfaceC0043az, d11, fi1, tl0 {

    /* JADX INFO: renamed from: l */
    public static volatile nu1 f5547l;

    /* JADX INFO: renamed from: m */
    public static final n70 f5548m = new n70(1);

    /* JADX INFO: renamed from: n */
    public static final String[] f5549n = {"_data"};

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5550j;

    /* JADX INFO: renamed from: k */
    public Object f5551k;

    public nu1(int i) {
        po0 po0Var;
        this.f5550j = i;
        switch (i) {
            case 1:
                fy0 fy0Var = fy0.f2536c;
                try {
                    po0Var = (po0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    po0Var = f5548m;
                }
                po0[] po0VarArr = {n70.f5316b, po0Var};
                wl0 wl0Var = new wl0();
                wl0Var.f8581a = po0VarArr;
                Charset charset = ge0.f2710a;
                this.f5551k = wl0Var;
                break;
            case 8:
                this.f5551k = new AtomicInteger(0);
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                break;
            case 14:
                this.f5551k = new da1(ef1.f2085b);
                break;
            case 24:
                this.f5551k = new jg0(5);
                break;
            default:
                this.f5551k = new CopyOnWriteArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0547ok m3590a() {
        qd0 qd0Var = (qd0) this.f5551k;
        if (qd0Var == null) {
            throw new IllegalStateException(qd0.class.getCanonicalName() + " must be set");
        }
        C0547ok c0547ok = new C0547ok();
        int i = 0;
        c0547ok.f5762a = C0520nu.m3589a(new rd0(qd0Var, i));
        int i2 = 2;
        ly0 ly0VarM3589a = C0520nu.m3589a(new rd0(qd0Var, i2));
        c0547ok.f5763b = ly0VarM3589a;
        int i3 = 1;
        rd0 rd0Var = new rd0(qd0Var, i3);
        c0547ok.f5764c = rd0Var;
        c0547ok.f5765d = C0520nu.m3589a(new C0092cb((ly0) c0547ok.f5762a, ly0VarM3589a, rd0Var, 3));
        c0547ok.f5766e = C0520nu.m3589a(new C0092cb((ly0) c0547ok.f5762a, (ly0) c0547ok.f5763b, (rd0) c0547ok.f5764c, i2));
        c0547ok.f5767f = C0520nu.m3589a(new C0092cb((ly0) c0547ok.f5762a, (ly0) c0547ok.f5763b, (rd0) c0547ok.f5764c, i));
        c0547ok.f5768g = C0520nu.m3589a(new C0092cb((ly0) c0547ok.f5762a, (ly0) c0547ok.f5763b, (rd0) c0547ok.f5764c, i3));
        return c0547ok;
    }

    @Override // p000.s30
    /* JADX INFO: renamed from: b */
    public void mo1170b(n20 n20Var) {
        n80.m3496e("Subscribing to analytics events.");
        C0900y3 c0900y3 = (C0900y3) this.f5551k;
        InterfaceC0826w3 interfaceC0826w3 = c0900y3.f9138a;
        b90 b90Var = new b90(20);
        b90Var.f793k = n20Var;
        c0900y3.f9140c = interfaceC0826w3.mo4426g(b90Var);
    }

    @Override // p000.InterfaceC0043az
    /* JADX INFO: renamed from: c */
    public Object mo155c() {
        C0163e6 c0163e6 = (C0163e6) this.f5551k;
        return new RunnableC0146dq((p90) c0163e6.f1965l, (qd0) c0163e6.f1966m);
    }

    @Override // p000.d11
    /* JADX INFO: renamed from: e */
    public void mo611e() {
        g10 g10Var;
        b10 b10Var = (b10) this.f5551k;
        d10 d10Var = b10Var.f674q;
        if (d10Var.f1516s != null && (g10Var = d10Var.f1517t) != null) {
            ((C0963zt) g10Var).m6036f(e10.f1898k);
        }
        Activity activity = b10Var.f672o;
        m80.m3343j("Dismissing fiam");
        d10Var.m1079c(activity);
        d10Var.f1516s = null;
        d10Var.f1517t = null;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public boolean mo311g(on0 on0Var, MenuItem menuItem) {
        InterfaceC0714t2 interfaceC0714t2 = ((ActionMenuView) this.f5551k).f398I;
        if (interfaceC0714t2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((jg0) interfaceC0714t2).f3922k).f431P.f6472l).iterator();
        while (it.hasNext()) {
            if (((m50) it.next()).f4977a.m4736p()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.qn0
    /* JADX INFO: renamed from: h */
    public void mo980h(on0 on0Var, MenuItem menuItem) {
        ((ViewOnKeyListenerC0431lf) this.f5551k).f4785o.removeCallbacksAndMessages(on0Var);
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: i */
    public void mo313i(on0 on0Var) {
        an0 an0Var = ((ActionMenuView) this.f5551k).f393D;
        if (an0Var != null) {
            an0Var.mo313i(on0Var);
        }
    }

    @Override // p000.qn0
    /* JADX INFO: renamed from: j */
    public void mo981j(on0 on0Var, rn0 rn0Var) {
        ViewOnKeyListenerC0431lf viewOnKeyListenerC0431lf = (ViewOnKeyListenerC0431lf) this.f5551k;
        Handler handler = viewOnKeyListenerC0431lf.f4785o;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0431lf.f4787q;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (on0Var == ((C0394kf) arrayList.get(i)).f4361b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC0452m(this, i2 < arrayList.size() ? (C0394kf) arrayList.get(i2) : null, rn0Var, on0Var, 1), on0Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // p000.InterfaceC0277h8
    /* JADX INFO: renamed from: k */
    public InterfaceC0551oo mo615k(AssetManager assetManager, String str) {
        return new d00(assetManager, str, 1);
    }

    /* JADX INFO: renamed from: l */
    public aa1 m3591l() {
        return (aa1) ((da1) this.f5551k).m1142l0();
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: m */
    public Object mo617m() {
        return this.f5551k;
    }

    @Override // p000.hd1
    /* JADX INFO: renamed from: n */
    public Cursor mo618n(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.f5551k).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f5549n, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    /* JADX INFO: renamed from: o */
    public void m3592o(boolean z) {
        jl0 jl0Var = (jl0) this.f5551k;
        jl0Var.f3996Y.m4577m(jl0Var.f3976E, z);
    }

    @Override // p000.fi1
    /* JADX INFO: renamed from: p */
    public di1 mo1871p(Class cls, yq0 yq0Var) {
        u41 u41Var = null;
        for (ei1 ei1Var : (ei1[]) this.f5551k) {
            if (ei1Var.f2096a.equals(cls)) {
                u41Var = new u41();
            }
        }
        if (u41Var != null) {
            return u41Var;
        }
        C0270h1.m2190f("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX INFO: renamed from: q */
    public void m3593q(aa1 aa1Var) {
        Object objM1142l0;
        Object obj;
        aa1Var.getClass();
        da1 da1Var = (da1) this.f5551k;
        do {
            objM1142l0 = da1Var.m1142l0();
            aa1 aa1Var2 = (aa1) objM1142l0;
            if (aa1Var2 instanceof a01 ? true : af0.m187a(aa1Var2, ef1.f2085b)) {
                obj = aa1Var2;
                obj = aa1Var;
            } else if (aa1Var2 instanceof C0329io) {
                if (aa1Var.f115a > aa1Var2.f115a) {
                    obj = aa1Var2;
                    obj = aa1Var;
                }
            } else if (!(aa1Var2 instanceof r00)) {
                obj = aa1Var2;
                throw new C0694sj(5);
            }
            obj = aa1Var2;
            obj = aa1Var2;
            g72 g72Var = p80.f6019k;
            if (objM1142l0 == null) {
                objM1142l0 = g72Var;
            }
            if (obj == null) {
                obj = g72Var;
            }
        } while (!da1Var.m1143m0(objM1142l0, obj));
    }

    /* JADX INFO: renamed from: r */
    public void m3594r(int i, Object obj, s51 s51Var) {
        C0360ji c0360ji = (C0360ji) this.f5551k;
        c0360ji.m2876B(i, 3);
        s51Var.mo4481g((AbstractC0379k0) obj, c0360ji.f3934a);
        c0360ji.m2876B(i, 4);
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        switch (this.f5550j) {
            case 7:
                return new C0314i8(0, (AssetManager) this.f5551k, this);
            default:
                return new sb0((jg0) this.f5551k);
        }
    }

    public String toString() {
        switch (this.f5550j) {
            case 23:
                StringBuilder sb = new StringBuilder();
                String[] strArr = (String[]) this.f5551k;
                int length = strArr.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String str = null;
                    sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
                    sb.append(": ");
                    int i3 = i2 + 1;
                    if (i3 >= 0 && i3 < strArr.length) {
                        str = strArr[i3];
                    }
                    sb.append(str);
                    sb.append("\n");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0847wo
    /* JADX INFO: renamed from: d */
    public void mo610d() {
    }

    public /* synthetic */ nu1(int i, Object obj) {
        this.f5550j = i;
        this.f5551k = obj;
    }

    public nu1(Context context) {
        this.f5550j = 27;
        this.f5551k = new C0181eo(context, 3);
    }

    public nu1(C0360ji c0360ji) {
        this.f5550j = 11;
        ge0.m2031a(c0360ji, "output");
        this.f5551k = c0360ji;
        c0360ji.f3934a = this;
    }

    public nu1(C0781uw c0781uw) {
        this.f5550j = 23;
        ArrayList arrayList = c0781uw.f7915j;
        this.f5551k = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public nu1(TextView textView) {
        this.f5550j = 18;
        this.f5551k = new C0040aw(textView);
    }

    public nu1(EditText editText) {
        this.f5550j = 17;
        this.f5551k = new C0312i6(editText, 23);
    }
}
