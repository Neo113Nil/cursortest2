package A0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* renamed from: A0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0031h0 implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Configuration f508k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F0.a f509l;

    public ComponentCallbacks2C0031h0(Configuration configuration, F0.a aVar) {
        this.f508k = configuration;
        this.f509l = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f508k;
        configuration2.updateFrom(configuration);
        Iterator it = this.f509l.f1519a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                throw new ClassCastException();
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f509l.f1519a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f509l.f1519a.clear();
    }
}
