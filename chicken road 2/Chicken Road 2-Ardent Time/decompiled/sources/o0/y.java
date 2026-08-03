package o0;

/* loaded from: classes.dex */
public final class y extends android.app.Fragment implements o0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f8201a = java.util.Collections.synchronizedMap(new l.C0924b());

    static {
        new java.util.WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, android.content.Intent intent) {
        super.onActivityResult(i2, i3, intent);
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        for (java.util.Map.Entry entry : this.f8201a.entrySet()) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = (com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle.getBundle((java.lang.String) entry.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (java.util.Map.Entry entry : this.f8201a.entrySet()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).getClass();
            bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        java.util.Iterator it = this.f8201a.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) it.next()).getClass();
        }
    }
}
