package S4;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C0834k;
import com.google.android.gms.common.api.internal.InterfaceC0835l;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f6322c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6323a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Object f6324b = new Object();

    public final void a(Object obj) {
        synchronized (this.f6324b) {
            a aVar = (a) this.f6323a.get(obj);
            if (aVar != null) {
                InterfaceC0835l fragment = LifecycleCallback.getFragment(new C0834k(aVar.f6318a));
                b bVar = (b) fragment.b(b.class, "StorageOnStopCallback");
                if (bVar == null) {
                    bVar = new b(fragment);
                }
                synchronized (bVar.f6321a) {
                    bVar.f6321a.remove(aVar);
                }
            }
        }
    }

    public final void b(K5.a aVar, Activity activity, Object obj) {
        synchronized (this.f6324b) {
            a aVar2 = new a(aVar, activity, obj);
            InterfaceC0835l fragment = LifecycleCallback.getFragment(new C0834k(activity));
            b bVar = (b) fragment.b(b.class, "StorageOnStopCallback");
            if (bVar == null) {
                bVar = new b(fragment);
            }
            synchronized (bVar.f6321a) {
                bVar.f6321a.add(aVar2);
            }
            this.f6323a.put(obj, aVar2);
        }
    }
}
