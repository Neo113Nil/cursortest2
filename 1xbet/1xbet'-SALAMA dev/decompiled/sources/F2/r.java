package F2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbeh;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0220b0 f2714a;

    static {
        InterfaceC0220b0 c0218a0 = null;
        try {
            Object objNewInstance = C0247p.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c0218a0 = iInterfaceQueryLocalInterface instanceof InterfaceC0220b0 ? (InterfaceC0220b0) iInterfaceQueryLocalInterface : new C0218a0(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
                }
            } else {
                J2.j.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            J2.j.g("Failed to instantiate ClientApi class.");
        }
        f2714a = c0218a0;
    }

    public abstract Object a();

    public abstract Object b(InterfaceC0220b0 interfaceC0220b0);

    public abstract Object c();

    public final Object d(Context context, boolean z4) {
        boolean z7;
        Object objC;
        Object objB;
        if (!z4) {
            J2.d dVar = C0252s.f2717f.f2718a;
            if (com.google.android.gms.common.d.f11217b.d(context, 12451000) != 0) {
                J2.j.b("Google Play Services is not available.");
                z4 = true;
            }
        }
        boolean z8 = false;
        boolean z9 = !(p113p3.d.a(context, ModuleDescriptor.MODULE_ID) <= p113p3.d.d(context, ModuleDescriptor.MODULE_ID, false));
        zzbby.zza(context);
        if (((Boolean) zzbdt.zza.zze()).booleanValue()) {
            z7 = false;
        } else if (((Boolean) zzbdt.zzb.zze()).booleanValue()) {
            z7 = true;
            z8 = true;
        } else {
            z8 = z4 | z9;
            z7 = false;
        }
        InterfaceC0220b0 interfaceC0220b0 = f2714a;
        Object objB2 = null;
        if (z8) {
            if (interfaceC0220b0 != null) {
                try {
                    objB = b(interfaceC0220b0);
                } catch (RemoteException e7) {
                    J2.j.h("Cannot invoke local loader using ClientApi class.", e7);
                    objB = null;
                }
                if (objB == null && !z7) {
                    try {
                        objB2 = c();
                    } catch (RemoteException e8) {
                        J2.j.h("Cannot invoke remote loader.", e8);
                    }
                    objB = objB2;
                }
            } else {
                J2.j.g("ClientApi class cannot be loaded.");
            }
            objB = null;
            if (objB == null) {
                objB2 = c();
                objB = objB2;
            }
        } else {
            try {
                objC = c();
            } catch (RemoteException e9) {
                J2.j.h("Cannot invoke remote loader.", e9);
                objC = null;
            }
            if (objC == null) {
                int iIntValue = ((Long) zzbeh.zza.zze()).intValue();
                C0252s c0252s = C0252s.f2717f;
                if (c0252s.f2722e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c0252s.f2721d.f10834a;
                    J2.d dVar2 = c0252s.f2718a;
                    dVar2.getClass();
                    J2.d.o(context, str, bundle, new B4.V(dVar2));
                }
            }
            if (objC == null) {
                if (interfaceC0220b0 != null) {
                    try {
                        objB2 = b(interfaceC0220b0);
                    } catch (RemoteException e10) {
                        J2.j.h("Cannot invoke local loader using ClientApi class.", e10);
                    }
                } else {
                    J2.j.g("ClientApi class cannot be loaded.");
                }
                objB = objB2;
            } else {
                objB = objC;
            }
        }
        return objB == null ? a() : objB;
    }
}
