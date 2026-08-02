package p;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15658a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final c.d f15659b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC1519f f15660c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f15661d;

    public C1530q(c.d dVar, BinderC1519f binderC1519f, ComponentName componentName) {
        this.f15659b = dVar;
        this.f15660c = binderC1519f;
        this.f15661d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b(Bundle bundle) {
        Bundle a2 = a(bundle);
        try {
            return ((c.b) this.f15659b).Z(this.f15660c, a2);
        } catch (SecurityException e7) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e7);
        }
    }

    public final int c(String str, Bundle bundle) {
        int v02;
        Bundle a2 = a(bundle);
        synchronized (this.f15658a) {
            try {
                try {
                    v02 = ((c.b) this.f15659b).v0(this.f15660c, str, a2);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v02;
    }

    public final boolean d(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            if (uri2 != null) {
                bundle2.putParcelable("target_origin", uri2);
            }
            if (bundle2.isEmpty()) {
                bundle2 = null;
            }
            BinderC1519f binderC1519f = this.f15660c;
            c.d dVar = this.f15659b;
            if (bundle2 == null) {
                return ((c.b) dVar).w0(binderC1519f, uri);
            }
            bundle.putAll(bundle2);
            return ((c.b) dVar).x0(binderC1519f, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
