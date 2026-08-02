package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0688Tb extends E5 implements InterfaceC0695Ub {
    public static InterfaceC0695Ub u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC0695Ub ? (InterfaceC0695Ub) queryLocalInterface : new C0681Sb(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 0);
    }
}
