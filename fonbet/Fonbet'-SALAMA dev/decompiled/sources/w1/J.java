package w1;

import android.content.Context;
import com.google.android.instantapps.InstantApps;

/* loaded from: classes.dex */
public final class J extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f17416a;

    public J(K k7) {
        this.f17416a = k7;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        boolean z4;
        K k7 = this.f17416a;
        Context a2 = AbstractC1707i1.a();
        if (a2 == null) {
            return;
        }
        try {
            Class.forName("com.google.android.instantapps.InstantApps");
            k7.f17425B = InstantApps.isInstantApp(a2);
            z4 = k7.f17425B;
            String.valueOf(z4);
        } catch (ClassNotFoundException unused) {
        }
        K.k(k7);
    }
}
