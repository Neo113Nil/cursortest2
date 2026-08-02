package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p52 {

    /* JADX INFO: renamed from: a */
    public static final mv1 f5993a;

    /* JADX INFO: renamed from: b */
    public static final mv1 f5994b;

    /* JADX INFO: renamed from: c */
    public static volatile po1 f5995c;

    /* JADX INFO: renamed from: d */
    public static final Object f5996d;

    /* JADX INFO: renamed from: e */
    public static Context f5997e;

    static {
        new mv1(0, x02.m5495I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new mv1(1, x02.m5495I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new mv1(2, x02.m5495I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new mv1(3, x02.m5495I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f5993a = new mv1(4, x02.m5495I("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f5994b = new mv1(5, x02.m5495I("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f5996d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m3851a() {
        po1 in1Var;
        if (f5995c != null) {
            return;
        }
        p80.m3863h(f5997e);
        synchronized (f5996d) {
            try {
                if (f5995c == null) {
                    IBinder iBinderM2712b = C0335iv.m2706c(f5997e, C0335iv.f3670d, "com.google.android.gms.googlecertificates").m2712b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = ao1.f579c;
                    if (iBinderM2712b == null) {
                        in1Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM2712b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        in1Var = iInterfaceQueryLocalInterface instanceof po1 ? (po1) iInterfaceQueryLocalInterface : new in1(iBinderM2712b, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    f5995c = in1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static m81 m3852b(String str, x12 x12Var, boolean z, boolean z2) {
        try {
            m3851a();
            p80.m3863h(f5997e);
            try {
                po1 po1Var = f5995c;
                vs0 vs0Var = new vs0(f5997e.getPackageManager());
                in1 in1Var = (in1) po1Var;
                Parcel parcelM5810d = in1Var.m5810d();
                int i = ru1.f6974a;
                boolean z3 = true;
                parcelM5810d.writeInt(1);
                int iM4663q = t22.m4663q(parcelM5810d, 20293);
                t22.m4658l(parcelM5810d, 1, str);
                t22.m4655i(parcelM5810d, 2, x12Var);
                t22.m4662p(parcelM5810d, 3, 4);
                parcelM5810d.writeInt(z ? 1 : 0);
                t22.m4662p(parcelM5810d, 4, 4);
                parcelM5810d.writeInt(z2 ? 1 : 0);
                t22.m4665s(parcelM5810d, iM4663q);
                ru1.m4408b(parcelM5810d, vs0Var);
                Parcel parcelM5808a = in1Var.m5808a(parcelM5810d, 5);
                if (parcelM5808a.readInt() == 0) {
                    z3 = false;
                }
                parcelM5808a.recycle();
                return z3 ? m81.f5007o : new ia2(new l22(z, str, x12Var));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return m81.m3353q("module call", e);
            }
        } catch (C0188ev e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return m81.m3353q("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
