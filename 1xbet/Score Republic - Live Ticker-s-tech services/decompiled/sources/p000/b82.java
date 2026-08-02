package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 {

    /* JADX INFO: renamed from: j */
    public static final Object f766j = new Object();

    /* JADX INFO: renamed from: k */
    public static final Object f767k = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f768a;

    /* JADX INFO: renamed from: b */
    public final nb1 f769b;

    /* JADX INFO: renamed from: c */
    public final nb1 f770c;

    /* JADX INFO: renamed from: d */
    public final nb1 f771d;

    /* JADX INFO: renamed from: e */
    public final nb1 f772e;

    /* JADX INFO: renamed from: f */
    public final nb1 f773f;

    /* JADX INFO: renamed from: g */
    public final Uri f774g;

    /* JADX INFO: renamed from: h */
    public volatile t42 f775h;

    /* JADX INFO: renamed from: i */
    public final Uri f776i;

    public b82(Context context, nb1 nb1Var, nb1 nb1Var2, nb1 nb1Var3) {
        this.f768a = context;
        this.f770c = nb1Var;
        this.f769b = nb1Var3;
        this.f771d = nb1Var2;
        Pattern pattern = l82.f4712a;
        C0902y5 c0902y5 = new C0902y5(context);
        c0902y5.m5737t("phenotype_storage_info");
        c0902y5.m5738u("storage-info.pb");
        this.f774g = c0902y5.m5739v();
        C0902y5 c0902y6 = new C0902y5(context);
        c0902y6.m5737t("phenotype_storage_info");
        c0902y6.m5738u("device-encrypted-storage-info.pb");
        Set set = l82.f4715d;
        o80.m3642E(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        c0902y6.f9155b = "directboot-files";
        this.f776i = c0902y6.m5739v();
        this.f772e = a90.m137u(new c32(4, this));
        this.f773f = a90.m137u(new an0(25, nb1Var));
    }

    /* JADX INFO: renamed from: a */
    public final void m603a() {
        if (!j22.m2791J(this.f768a) || m605c().m4684x() + 86400000 >= System.currentTimeMillis()) {
            jc0 jc0Var = jc0.f3900k;
            return;
        }
        mq0 mq0Var = (mq0) this.f770c.get();
        mq0Var.getClass();
        ListenableFuture listenableFutureM2994e = k70.m2994e((ListenableFuture) this.f773f.get());
        int i = b40.f706q;
        k70.m2996g(listenableFutureM2994e instanceof b40 ? (b40) listenableFutureM2994e : new u40(listenableFutureM2994e), new l62(2, this), mq0Var);
    }

    /* JADX INFO: renamed from: b */
    public final t72 m604b() {
        t42 t42VarM605c = m605c();
        return new t72(t42VarM605c.m4682v(), qc0.m4058q(t42VarM605c.m4673A()), t42VarM605c.m4681u(), t42VarM605c.m4683w(), (t42VarM605c.m4674B() && t42VarM605c.m4675C().m5526u() == ((long) Build.VERSION.SDK_INT)) ? t42VarM605c.m4675C().m5525t() : "", qc0.m4058q(t42VarM605c.m4685y()), qc0.m4058q(t42VarM605c.m4686z()), t42VarM605c.m4680t(), t42VarM605c.m4677E(), t42VarM605c.m4676D(), t42VarM605c.m4678F());
    }

    /* JADX INFO: renamed from: c */
    public final t42 m605c() {
        t42 t42VarM4672H;
        t42 t42Var = this.f775h;
        if (t42Var != null) {
            return t42Var;
        }
        synchronized (f766j) {
            t42VarM4672H = this.f775h;
            if (t42VarM4672H == null) {
                t42VarM4672H = t42.m4672H();
                if (j22.m2791J(this.f768a)) {
                    cq1 cq1Var = (cq1) t42VarM4672H.mo14s(7);
                    so1 so1Var = so1.f7176a;
                    int i = fo1.f2465a;
                    so1 so1Var2 = so1.f7177b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamM3875t = p80.m3875t(((g82) this.f771d.get()).m2000b(this.f774g));
                        try {
                            zo1 zo1VarM5821a = ((yo1) cq1Var).m5821a(inputStreamM3875t, so1Var2);
                            if (inputStreamM3875t != null) {
                                inputStreamM3875t.close();
                            }
                            t42 t42Var2 = (t42) zo1VarM5821a;
                            StrictMode.setThreadPolicy(threadPolicy);
                            t42VarM4672H = t42Var2;
                        } catch (Throwable th) {
                            if (inputStreamM3875t != null) {
                                try {
                                    inputStreamM3875t.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                    this.f775h = t42VarM4672H;
                }
            }
        }
        return t42VarM4672H;
    }
}
