package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x52 implements nb1 {

    /* JADX INFO: renamed from: j */
    public final String f8794j;

    /* JADX INFO: renamed from: k */
    public final p90 f8795k;

    /* JADX INFO: renamed from: l */
    public volatile int f8796l = -1;

    /* JADX INFO: renamed from: m */
    public c32 f8797m;

    public x52(String str, p90 p90Var) {
        this.f8794j = str;
        this.f8795k = p90Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo3176a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo3177b(String str);

    /* JADX INFO: renamed from: c */
    public abstract Object mo3178c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract Object mo3179d();

    /* JADX INFO: renamed from: e */
    public abstract void mo3180e(Object obj);

    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:30:0x0091, B:32:0x0095, B:36:0x00aa, B:38:0x00b6, B:40:0x00c8, B:42:0x00d6, B:50:0x00f7, B:55:0x010b, B:56:0x0111, B:58:0x0121, B:60:0x0129, B:61:0x0144, B:64:0x0157, B:68:0x0168, B:73:0x0172, B:75:0x0178, B:76:0x017d, B:67:0x015d, B:53:0x00fd, B:46:0x00eb, B:43:0x00e3, B:78:0x017f), top: B:98:0x0091, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:30:0x0091, B:32:0x0095, B:36:0x00aa, B:38:0x00b6, B:40:0x00c8, B:42:0x00d6, B:50:0x00f7, B:55:0x010b, B:56:0x0111, B:58:0x0121, B:60:0x0129, B:61:0x0144, B:64:0x0157, B:68:0x0168, B:73:0x0172, B:75:0x0178, B:76:0x017d, B:67:0x015d, B:53:0x00fd, B:46:0x00eb, B:43:0x00e3, B:78:0x017f), top: B:98:0x0091, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:30:0x0091, B:32:0x0095, B:36:0x00aa, B:38:0x00b6, B:40:0x00c8, B:42:0x00d6, B:50:0x00f7, B:55:0x010b, B:56:0x0111, B:58:0x0121, B:60:0x0129, B:61:0x0144, B:64:0x0157, B:68:0x0168, B:73:0x0172, B:75:0x0178, B:76:0x017d, B:67:0x015d, B:53:0x00fd, B:46:0x00eb, B:43:0x00e3, B:78:0x017f), top: B:98:0x0091, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0178 A[Catch: all -> 0x00a6, TryCatch #2 {all -> 0x00a6, blocks: (B:30:0x0091, B:32:0x0095, B:36:0x00aa, B:38:0x00b6, B:40:0x00c8, B:42:0x00d6, B:50:0x00f7, B:55:0x010b, B:56:0x0111, B:58:0x0121, B:60:0x0129, B:61:0x0144, B:64:0x0157, B:68:0x0168, B:73:0x0172, B:75:0x0178, B:76:0x017d, B:67:0x015d, B:53:0x00fd, B:46:0x00eb, B:43:0x00e3, B:78:0x017f), top: B:98:0x0091, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.nb1
    public final Object get() {
        y62 y62VarM3883f;
        Object objMo3176a;
        String str;
        Object obj;
        w71 w71Var;
        x22 x22Var;
        if (m80.f5004o == null) {
            Object obj2 = x22.f8759j;
            m80.f5004o = new p61(1);
        }
        Context context = (Context) x22.f8760k.get();
        Object objMo3178c = null;
        if (context == null) {
            synchronized (m80.f5002m) {
            }
            C0270h1.m2191g("Must call PhenotypeContext.setContext() first");
            return null;
        }
        x22 x22Var2 = x22.f8761l;
        boolean z = false;
        if (x22Var2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (x22.f8759j) {
                    try {
                        if (x22.f8761l != null) {
                            x22Var = x22.f8761l;
                        } else {
                            x22Var = (x22) new C0186et(applicationContext, 6, z).get();
                            x22.f8761l = x22Var;
                            AbstractC0477mo.m3412p(Level.CONFIG, x22Var.m5498a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        x22Var2 = x22Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.f8796l;
        if (i == -1 || i < ((AtomicInteger) this.f8797m.f1083k).get()) {
            synchronized (this) {
                try {
                    int i2 = this.f8796l;
                    if (i2 == -1) {
                        x22.m5497b();
                        x22Var2.getClass();
                        y62VarM3883f = this.f8795k.m3883f(x22Var2);
                        this.f8797m = y62VarM3883f.f9197g;
                    } else {
                        y62VarM3883f = null;
                    }
                    int i3 = ((AtomicInteger) this.f8797m.f1083k).get();
                    if (i2 < i3) {
                        x22.m5497b();
                        x22Var2.getClass();
                        su0 su0VarM4661o = t22.m4661o(x22Var2.f8764b);
                        if (su0VarM4661o.mo1040b()) {
                            s22 s22Var = (s22) su0VarM4661o.mo1039a();
                            Uri uriM4868a = u22.m4868a();
                            String str2 = this.f8794j;
                            if (uriM4868a != null) {
                                w71Var = (w71) s22Var.f7020a.get(uriM4868a.toString());
                            } else {
                                s22Var.getClass();
                                w71Var = null;
                            }
                            String str3 = w71Var == null ? null : (String) w71Var.get(str2);
                            if (str3 == null) {
                                objMo3176a = null;
                                if (y62VarM3883f == null) {
                                    y62VarM3883f = this.f8795k.m3883f(x22Var2);
                                }
                                str = y62VarM3883f.f9193c;
                                if (!x22Var2.f8764b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                    ListenableFuture listenableFutureM3425a = x22Var2.m5498a().m3425a(new f31(x22Var2, str, 29, z));
                                    listenableFutureM3425a.mo995c(new cm1(11, listenableFutureM3425a), EnumC0113ct.f1449j);
                                }
                                obj = ((v01) y62VarM3883f.m5742a().f4616d).get(this.f8794j);
                                if (obj != null) {
                                    try {
                                        objMo3178c = mo3178c(obj);
                                    } catch (IOException | ClassCastException e) {
                                        Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f8794j), e);
                                    }
                                }
                                if (true != su0VarM4661o.mo1040b()) {
                                    objMo3176a = objMo3178c;
                                }
                                if (objMo3176a == null) {
                                    objMo3176a = mo3176a();
                                }
                                if (objMo3176a != null) {
                                    mo3180e(objMo3176a);
                                    this.f8796l = i3;
                                }
                            } else {
                                try {
                                    objMo3176a = mo3177b(str3);
                                } catch (IOException | IllegalArgumentException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f8794j), e2);
                                    objMo3176a = null;
                                }
                                if (y62VarM3883f == null) {
                                    y62VarM3883f = this.f8795k.m3883f(x22Var2);
                                }
                                str = y62VarM3883f.f9193c;
                                if (!x22Var2.f8764b.getPackageName().equals("com.android.vending")) {
                                    ListenableFuture listenableFutureM3425a2 = x22Var2.m5498a().m3425a(new f31(x22Var2, str, 29, z));
                                    listenableFutureM3425a2.mo995c(new cm1(11, listenableFutureM3425a2), EnumC0113ct.f1449j);
                                }
                                obj = ((v01) y62VarM3883f.m5742a().f4616d).get(this.f8794j);
                                if (obj != null) {
                                    objMo3178c = mo3178c(obj);
                                }
                                if (true != su0VarM4661o.mo1040b()) {
                                    objMo3176a = objMo3178c;
                                }
                                if (objMo3176a == null) {
                                    objMo3176a = mo3176a();
                                }
                                if (objMo3176a != null) {
                                    mo3180e(objMo3176a);
                                    this.f8796l = i3;
                                }
                            }
                        } else {
                            objMo3176a = null;
                            if (y62VarM3883f == null) {
                                y62VarM3883f = this.f8795k.m3883f(x22Var2);
                            }
                            str = y62VarM3883f.f9193c;
                            if (!x22Var2.f8764b.getPackageName().equals("com.android.vending")) {
                                ListenableFuture listenableFutureM3425a3 = x22Var2.m5498a().m3425a(new f31(x22Var2, str, 29, z));
                                listenableFutureM3425a3.mo995c(new cm1(11, listenableFutureM3425a3), EnumC0113ct.f1449j);
                            }
                            obj = ((v01) y62VarM3883f.m5742a().f4616d).get(this.f8794j);
                            if (obj != null) {
                                objMo3178c = mo3178c(obj);
                            }
                            if (true != su0VarM4661o.mo1040b()) {
                                objMo3176a = objMo3178c;
                            }
                            if (objMo3176a == null) {
                                objMo3176a = mo3176a();
                            }
                            if (objMo3176a != null) {
                                mo3180e(objMo3176a);
                                this.f8796l = i3;
                            }
                        }
                    } else {
                        objMo3176a = mo3179d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objMo3176a = mo3179d();
        }
        objMo3176a.getClass();
        return objMo3176a;
    }
}
