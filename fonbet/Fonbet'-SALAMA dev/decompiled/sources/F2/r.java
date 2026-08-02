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

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0220b0 f2714a;

    static {
        InterfaceC0220b0 interfaceC0220b0 = null;
        try {
            Object newInstance = C0247p.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    interfaceC0220b0 = queryLocalInterface instanceof InterfaceC0220b0 ? (InterfaceC0220b0) queryLocalInterface : new C0218a0(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
                }
            } else {
                J2.j.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            J2.j.g("Failed to instantiate ClientApi class.");
        }
        f2714a = interfaceC0220b0;
    }

    public abstract Object a();

    public abstract Object b(InterfaceC0220b0 interfaceC0220b0);

    public abstract Object c();

    public final Object d(Context context, boolean z4) {
        boolean z7;
        Object obj;
        Object obj2;
        if (!z4) {
            J2.d dVar = C0252s.f2717f.f2718a;
            if (com.google.android.gms.common.d.f11217b.d(context, com.google.android.gms.common.g.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
                J2.j.b("Google Play Services is not available.");
                z4 = true;
            }
        }
        boolean z8 = false;
        boolean z9 = !(p3.d.a(context, ModuleDescriptor.MODULE_ID) <= p3.d.d(context, ModuleDescriptor.MODULE_ID, false));
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
        Object obj3 = null;
        if (z8) {
            if (interfaceC0220b0 != null) {
                try {
                    obj2 = b(interfaceC0220b0);
                } catch (RemoteException e7) {
                    J2.j.h("Cannot invoke local loader using ClientApi class.", e7);
                }
                if (obj2 == null && !z7) {
                    try {
                        obj3 = c();
                    } catch (RemoteException e8) {
                        J2.j.h("Cannot invoke remote loader.", e8);
                    }
                    obj2 = obj3;
                }
            } else {
                J2.j.g("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = c();
                obj2 = obj3;
            }
        } else {
            try {
                obj = c();
            } catch (RemoteException e9) {
                J2.j.h("Cannot invoke remote loader.", e9);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) zzbeh.zza.zze()).intValue();
                C0252s c0252s = C0252s.f2717f;
                if (c0252s.f2722e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c0252s.f2721d.f10834a;
                    J2.d dVar2 = c0252s.f2718a;
                    dVar2.getClass();
                    J2.d.o(context, str, bundle, new B4.V(dVar2));
                }
            }
            if (obj == null) {
                if (interfaceC0220b0 != null) {
                    try {
                        obj3 = b(interfaceC0220b0);
                    } catch (RemoteException e10) {
                        J2.j.h("Cannot invoke local loader using ClientApi class.", e10);
                    }
                } else {
                    J2.j.g("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
