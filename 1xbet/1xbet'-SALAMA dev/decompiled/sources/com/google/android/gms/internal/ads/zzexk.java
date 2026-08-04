package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzexk {
    public static void zza(AtomicReference atomicReference, zzexj zzexjVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzexjVar.zza(obj);
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        } catch (NullPointerException e8) {
            int i8 = J.f3546b;
            j.h("NullPointerException occurs when invoking a method from a delegating listener.", e8);
        }
    }
}
