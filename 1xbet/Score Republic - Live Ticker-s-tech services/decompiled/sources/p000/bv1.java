package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 extends hu1 implements gv1 {

    /* JADX INFO: renamed from: b */
    public final AtomicReference f1005b;

    /* JADX INFO: renamed from: c */
    public boolean f1006c;

    public bv1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f1005b = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m783d(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e);
            throw e;
        }
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
        iu1.m2704d(parcel);
        mo785n(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m784c(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f1005b;
        synchronized (atomicReference) {
            if (!this.f1006c) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f1005b.get();
        }
        return bundle;
    }

    @Override // p000.gv1
    /* JADX INFO: renamed from: n */
    public final void mo785n(Bundle bundle) {
        AtomicReference atomicReference = this.f1005b;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f1006c = true;
                    this.f1005b.notify();
                } catch (Throwable th) {
                    this.f1005b.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
