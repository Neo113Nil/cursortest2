package p000;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: renamed from: vn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809vn implements ft0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8222j;

    /* JADX INFO: renamed from: k */
    public boolean f8223k;

    /* JADX INFO: renamed from: l */
    public final Object f8224l;

    /* JADX INFO: renamed from: m */
    public Object f8225m;

    /* JADX INFO: renamed from: n */
    public Object f8226n;

    public C0809vn() {
        this.f8222j = 0;
        this.f8224l = new Intent("android.intent.action.VIEW");
        this.f8225m = new wa0(19);
        this.f8223k = true;
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public void mo172a(InterfaceC0187eu interfaceC0187eu) {
        C0264gw c0264gw = (C0264gw) this.f8226n;
        while (true) {
            InterfaceC0187eu interfaceC0187eu2 = (InterfaceC0187eu) c0264gw.get();
            if (interfaceC0187eu2 == EnumC0262gu.f2872j) {
                if (interfaceC0187eu != null) {
                    interfaceC0187eu.mo480c();
                    return;
                }
                return;
            } else {
                do {
                    if (c0264gw.compareAndSet(interfaceC0187eu2, interfaceC0187eu)) {
                        if (interfaceC0187eu2 != null) {
                            interfaceC0187eu2.mo480c();
                            return;
                        }
                        return;
                    }
                } while (c0264gw.get() == interfaceC0187eu2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5171b() {
        C0556ot.m3753a((C0556ot) this.f8226n, this, false);
    }

    /* JADX INFO: renamed from: c */
    public void m5172c(Object obj, String str) {
        oq0 oq0Var = new oq0(0);
        ((oq0) this.f8226n).f5842m = oq0Var;
        this.f8226n = oq0Var;
        oq0Var.f5841l = obj;
        oq0Var.f5840k = str;
    }

    /* JADX INFO: renamed from: d */
    public void m5173d(String str, long j) {
        m5175f(str, String.valueOf(j));
    }

    /* JADX INFO: renamed from: e */
    public void m5174e(String str, boolean z) {
        m5175f(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public void m5175f(String str, String str2) {
        nq0 nq0Var = new nq0(0);
        ((oq0) this.f8226n).f5842m = nq0Var;
        this.f8226n = nq0Var;
        nq0Var.f5841l = str2;
        nq0Var.f5840k = str;
    }

    /* JADX INFO: renamed from: g */
    public C0312i6 m5176g() {
        Intent intent = (Intent) this.f8224l;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8223k);
        ((wa0) this.f8225m).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.f8226n) == null) {
                this.f8226n = ActivityOptions.makeBasic();
            }
            AbstractC0528o1.m3623l((ActivityOptions) this.f8226n);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f8226n) == null) {
                this.f8226n = ActivityOptions.makeBasic();
            }
            AbstractC0565p1.m3839i((ActivityOptions) this.f8226n, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f8226n;
        return new C0312i6(20, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX INFO: renamed from: h */
    public File m5177h() {
        File file;
        synchronized (((C0556ot) this.f8226n)) {
            try {
                C0519nt c0519nt = (C0519nt) this.f8224l;
                if (c0519nt.f5537f != this) {
                    throw new IllegalStateException();
                }
                if (!c0519nt.f5536e) {
                    ((boolean[]) this.f8225m)[0] = true;
                }
                file = c0519nt.f5535d[0];
                ((C0556ot) this.f8226n).f5854j.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m5178i() {
        try {
            if (this.f8223k) {
                return;
            }
            Boolean boolM5180k = m5180k();
            this.f8225m = boolM5180k;
            if (boolM5180k == null) {
                C0270h1 c0270h1 = new C0270h1(17);
                C0337ix c0337ix = (C0337ix) ((hb1) this.f8224l);
                c0337ix.m2714a(c0337ix.f3690c, c0270h1);
            }
            this.f8223k = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m5179j() {
        Boolean bool;
        try {
            m5178i();
            bool = (Boolean) this.f8225m;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f8226n).f1386a.m5227g();
    }

    /* JADX INFO: renamed from: k */
    public Boolean m5180k() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        w00 w00Var = ((FirebaseMessaging) this.f8226n).f1386a;
        w00Var.m5224a();
        Context context = w00Var.f8318a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public String m5181l() {
        if (!this.f8223k) {
            this.f8223k = true;
            fz1 fz1Var = (fz1) this.f8226n;
            this.f8225m = fz1Var.m1908E().getString((String) this.f8224l, null);
        }
        return (String) this.f8225m;
    }

    /* JADX INFO: renamed from: m */
    public void m5182m(String str) {
        SharedPreferences.Editor editorEdit = ((fz1) this.f8226n).m1908E().edit();
        editorEdit.putString((String) this.f8224l, str);
        editorEdit.apply();
        this.f8225m = str;
    }

    @Override // p000.ft0
    public void onComplete() {
        if (!this.f8223k) {
            ((ft0) this.f8224l).onComplete();
        } else {
            this.f8223k = false;
            ((dt0) this.f8225m).m5993v(this);
        }
    }

    @Override // p000.ft0
    public void onError(Throwable th) {
        ((ft0) this.f8224l).onError(th);
    }

    @Override // p000.ft0
    public void onNext(Object obj) {
        if (this.f8223k) {
            this.f8223k = false;
        }
        ((ft0) this.f8224l).onNext(obj);
    }

    public String toString() {
        switch (this.f8222j) {
            case 3:
                boolean z = this.f8223k;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f8224l);
                sb.append('{');
                String str = "";
                for (oq0 oq0Var = (oq0) ((oq0) this.f8225m).f5842m; oq0Var != null; oq0Var = (oq0) oq0Var.f5842m) {
                    Object obj = oq0Var.f5841l;
                    if ((oq0Var instanceof nq0) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) oq0Var.f5840k;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0809vn(fz1 fz1Var, String str) {
        this.f8222j = 7;
        this.f8226n = fz1Var;
        p80.m3860e(str);
        this.f8224l = str;
    }

    public C0809vn(ft0 ft0Var, dt0 dt0Var) {
        this.f8222j = 4;
        this.f8224l = ft0Var;
        this.f8225m = dt0Var;
        this.f8223k = true;
        this.f8226n = new C0264gw(2);
    }

    public C0809vn(String str) {
        this.f8222j = 3;
        oq0 oq0Var = new oq0(0);
        this.f8225m = oq0Var;
        this.f8226n = oq0Var;
        this.f8223k = false;
        this.f8224l = str;
    }

    public C0809vn(p90 p90Var, k81 k81Var) {
        this.f8222j = 5;
        this.f8226n = new l81(this);
        this.f8225m = p90Var;
        this.f8224l = k81Var;
    }

    public C0809vn(FirebaseMessaging firebaseMessaging, hb1 hb1Var) {
        this.f8222j = 2;
        this.f8226n = firebaseMessaging;
        this.f8224l = hb1Var;
    }

    public C0809vn(C0556ot c0556ot, C0519nt c0519nt) {
        this.f8222j = 1;
        this.f8226n = c0556ot;
        this.f8224l = c0519nt;
        this.f8225m = c0519nt.f5536e ? null : new boolean[c0556ot.f5860p];
    }

    public C0809vn(C0415l c0415l, p90 p90Var, C0451lz[] c0451lzArr, boolean z) {
        this.f8222j = 6;
        this.f8226n = c0415l;
        this.f8224l = p90Var;
        this.f8225m = c0451lzArr;
        this.f8223k = z;
    }
}
