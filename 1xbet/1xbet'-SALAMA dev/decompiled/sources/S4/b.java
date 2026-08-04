package S4;

import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0791l;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6321a;

    public b(InterfaceC0791l interfaceC0791l) {
        super(interfaceC0791l);
        this.f6321a = new ArrayList();
        this.mLifecycleFragment.a("StorageOnStopCallback", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        ArrayList<a> arrayList;
        synchronized (this.f6321a) {
            arrayList = new ArrayList(this.f6321a);
            this.f6321a.clear();
        }
        for (a aVar : arrayList) {
            if (aVar != null) {
                Log.d("StorageOnStopCallback", "removing subscription from activity.");
                aVar.f6319b.run();
                c.f6322c.a(aVar.f6320c);
            }
        }
    }
}
