package p109p;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import p017c.b;
import p017c.d;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15664a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f15667d;

    public q(d dVar, f fVar, ComponentName componentName) {
        this.f15665b = dVar;
        this.f15666c = fVar;
        this.f15667d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b(Bundle bundle) {
        Bundle bundleA = a(bundle);
        try {
            return ((b) this.f15665b).Z(this.f15666c, bundleA);
        } catch (SecurityException e7) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e7);
        }
    }

    public final int c(String str, Bundle bundle) {
        int iV0;
        Bundle bundleA = a(bundle);
        synchronized (this.f15664a) {
            try {
                try {
                    iV0 = ((b) this.f15665b).v0(this.f15666c, str, bundleA);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iV0;
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
            f fVar = this.f15666c;
            d dVar = this.f15665b;
            if (bundle2 == null) {
                return ((b) dVar).w0(fVar, uri);
            }
            bundle.putAll(bundle2);
            return ((b) dVar).x0(fVar, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
