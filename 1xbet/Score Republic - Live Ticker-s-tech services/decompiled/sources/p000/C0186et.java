package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: et */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0186et implements iq0, InterfaceC0261gt, y80, nb1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2180j;

    /* JADX INFO: renamed from: k */
    public final Context f2181k;

    public C0186et(Context context, int i) {
        this.f2180j = i;
        switch (i) {
            case 10:
                new ConcurrentHashMap();
                o80.m3642E(context != null, "Context cannot be null", new Object[0]);
                this.f2181k = context.getApplicationContext();
                break;
            default:
                p80.m3863h(context);
                Context applicationContext = context.getApplicationContext();
                p80.m3863h(applicationContext);
                this.f2181k = applicationContext;
                break;
        }
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: a */
    public Class mo1476a() {
        switch (this.f2180j) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: b */
    public void mo1477b(Object obj) throws IOException {
        switch (this.f2180j) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // p000.InterfaceC0261gt
    /* JADX INFO: renamed from: c */
    public Object mo1478c(Resources.Theme theme, Resources resources, int i) {
        switch (this.f2180j) {
            case 0:
                return resources.openRawResourceFd(i);
            default:
                return resources.openRawResource(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public ApplicationInfo m1501d(String str, int i) {
        return this.f2181k.getPackageManager().getApplicationInfo(str, i);
    }

    /* JADX INFO: renamed from: e */
    public PackageInfo m1502e(String str, int i) {
        return this.f2181k.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: f */
    public boolean m1503f() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f2181k;
        if (callingUid == iMyUid) {
            return yd0.m5773l(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    @Override // p000.y80
    public Object get() {
        int i = this.f2180j;
        Context context = this.f2181k;
        switch (i) {
            case 5:
                return (ConnectivityManager) context.getSystemService("connectivity");
            case 6:
                Object obj = x22.f8759j;
                C0902y5 c0902y5 = new C0902y5();
                c0902y5.f9154a = context;
                context.getClass();
                if (((nb1) c0902y5.f9155b) == null) {
                    c0902y5.f9155b = x22.f8762m;
                }
                boolean z = false;
                if (((nb1) c0902y5.f9156c) == null) {
                    c0902y5.f9156c = a90.m137u(new C0186et((Context) c0902y5.f9154a, 7, z));
                }
                if (((jg0) c0902y5.f9157d) == null) {
                    c0902y5.f9157d = new jg0(29, c0902y5);
                }
                if (((nb1) c0902y5.f9158e) == null) {
                    Context context2 = (Context) c0902y5.f9154a;
                    ArrayList arrayList = new ArrayList();
                    i82 i82Var = new i82(new C0186et(context2, 10));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, i82Var, new m82());
                    c0902y5.f9158e = a90.m137u(new C0781uw(arrayList));
                }
                if (((an0) c0902y5.f9159f) == null) {
                    c0902y5.f9159f = new an0(21, c0902y5);
                }
                return new x22((Context) c0902y5.f9154a, (nb1) c0902y5.f9155b, (nb1) c0902y5.f9156c, (jg0) c0902y5.f9157d, (nb1) c0902y5.f9158e, (an0) c0902y5.f9159f);
            case 7:
                Object obj2 = x22.f8759j;
                return new b42(new e22(context, v12.f7998a, InterfaceC0420l4.f4668a, f90.f2350c));
            default:
                Object obj3 = h32.f3038a;
                return t22.m4661o(context);
        }
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        int i = this.f2180j;
        Context context = this.f2181k;
        switch (i) {
            case 0:
                return new C0314i8(context, this);
            case 1:
                return new C0314i8(context, this);
            case 2:
                return new jn0(context, 1);
            default:
                return new C0314i8(context, f71Var.m1658d(Integer.class, AssetFileDescriptor.class));
        }
    }

    public /* synthetic */ C0186et(Context context, int i, boolean z) {
        this.f2180j = i;
        this.f2181k = context;
    }
}
