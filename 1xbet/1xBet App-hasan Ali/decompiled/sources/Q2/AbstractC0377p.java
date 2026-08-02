package Q2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC0879d8;
import com.google.android.gms.internal.ads.AbstractC1461q8;
import com.google.android.gms.internal.ads.F7;
import t3.C2424c;

/* renamed from: Q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0377p {

    /* renamed from: a, reason: collision with root package name */
    public static final T f5047a;

    static {
        T t5 = null;
        try {
            Object newInstance = C0375o.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    t5 = queryLocalInterface instanceof T ? (T) queryLocalInterface : new S(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 0);
                }
            } else {
                U2.j.i("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            U2.j.i("Failed to instantiate ClientApi class.");
        }
        f5047a = t5;
    }

    public abstract Object a();

    public abstract Object b(T t5);

    public abstract Object c();

    public final Object d(Context context, boolean z3) {
        boolean z5;
        Object obj;
        Object obj2;
        if (!z3) {
            U2.e eVar = C0379q.f.f5048a;
            if (j3.f.f17514b.c(context, 12451000) != 0) {
                U2.j.d("Google Play Services is not available.");
                z3 = true;
            }
        }
        boolean z6 = false;
        boolean z7 = !(C2424c.a(context, ModuleDescriptor.MODULE_ID) <= C2424c.d(context, ModuleDescriptor.MODULE_ID, false));
        F7.a(context);
        if (((Boolean) AbstractC0879d8.f13099a.s()).booleanValue()) {
            z5 = false;
        } else if (((Boolean) AbstractC0879d8.f13100b.s()).booleanValue()) {
            z5 = true;
            z6 = true;
        } else {
            z6 = z3 | z7;
            z5 = false;
        }
        T t5 = f5047a;
        Object obj3 = null;
        if (z6) {
            if (t5 != null) {
                try {
                    obj2 = b(t5);
                } catch (RemoteException e3) {
                    U2.j.j("Cannot invoke local loader using ClientApi class.", e3);
                }
                if (obj2 == null && !z5) {
                    try {
                        obj3 = c();
                    } catch (RemoteException e5) {
                        U2.j.j("Cannot invoke remote loader.", e5);
                    }
                    obj2 = obj3;
                }
            } else {
                U2.j.i("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = c();
                obj2 = obj3;
            }
        } else {
            try {
                obj = c();
            } catch (RemoteException e6) {
                U2.j.j("Cannot invoke remote loader.", e6);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) AbstractC1461q8.f15105a.s()).intValue();
                C0379q c0379q = C0379q.f;
                if (c0379q.f5052e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = c0379q.f5051d.f5852k;
                    U2.e eVar2 = c0379q.f5048a;
                    eVar2.getClass();
                    U2.e.k(context, str, bundle, new Q1.j(eVar2));
                }
            }
            if (obj == null) {
                if (t5 != null) {
                    try {
                        obj3 = b(t5);
                    } catch (RemoteException e7) {
                        U2.j.j("Cannot invoke local loader using ClientApi class.", e7);
                    }
                } else {
                    U2.j.i("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        return obj2 == null ? a() : obj2;
    }
}
