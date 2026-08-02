package q;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2289d implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18844k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f18845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f18846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f18847n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BinderC2290e f18848o;

    public RunnableC2289d(BinderC2290e binderC2290e, int i, Uri uri, boolean z3, Bundle bundle) {
        this.f18848o = binderC2290e;
        this.f18844k = i;
        this.f18845l = uri;
        this.f18846m = z3;
        this.f18847n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18848o.f18850l.g(this.f18844k, this.f18845l, this.f18846m, this.f18847n);
    }
}
