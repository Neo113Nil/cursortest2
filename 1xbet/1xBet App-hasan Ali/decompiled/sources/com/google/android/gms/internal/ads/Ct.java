package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import s3.BinderC2361b;
import t3.C2424c;

/* loaded from: classes.dex */
public final class Ct {

    /* renamed from: a, reason: collision with root package name */
    public final Et f8100a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8101b = true;

    public Ct(Et et) {
        this.f8100a = et;
    }

    public static Ct a(Context context, String str) {
        Et dt;
        try {
            try {
                try {
                    IBinder b3 = C2424c.c(context, C2424c.f19570b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b3 == null) {
                        dt = null;
                    } else {
                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        dt = queryLocalInterface instanceof Et ? (Et) queryLocalInterface : new Dt(b3, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 0);
                    }
                    dt.y2(new BinderC2361b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new Ct(dt);
                } catch (Exception e3) {
                    throw new C1490qt(e3);
                }
            } catch (RemoteException | C1490qt | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new Ct(new Ft());
            }
        } catch (Exception e5) {
            throw new C1490qt(e5);
        }
    }
}
