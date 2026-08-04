package p155w1;

import android.content.Context;
import com.google.android.instantapps.InstantApps;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f17422a;

    public J(K k7) {
        this.f17422a = k7;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        K k7 = this.f17422a;
        Context contextA = AbstractC0998i1.a();
        if (contextA == null) {
            return;
        }
        try {
            Class.forName("com.google.android.instantapps.InstantApps");
            k7.f17431B = InstantApps.isInstantApp(contextA);
            String.valueOf(k7.f17431B);
        } catch (ClassNotFoundException unused) {
        }
        K.k(k7);
    }
}
