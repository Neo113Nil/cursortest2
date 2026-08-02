package y3;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2666b extends C3.c {

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f21221l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21222m;

    public BinderC2666b() {
        super(2);
        attachInterface(this, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f21221l = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e3) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e3);
            throw e3;
        }
    }

    public final Bundle h1(long j5) {
        Bundle bundle;
        synchronized (this.f21221l) {
            if (!this.f21222m) {
                try {
                    this.f21221l.wait(j5);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f21221l.get();
        }
        return bundle;
    }

    public final void t1(Bundle bundle) {
        synchronized (this.f21221l) {
            try {
                try {
                    this.f21221l.set(bundle);
                    this.f21222m = true;
                } finally {
                    this.f21221l.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
