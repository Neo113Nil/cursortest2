package com.google.android.gms.common.api.internal;

import W5.AbstractC0486a1;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z extends Fragment implements InterfaceC0835l {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f11156d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map f11157a = Collections.synchronizedMap(new r.b());

    /* renamed from: b, reason: collision with root package name */
    public int f11158b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f11159c;

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f11157a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(AbstractC0486a1.h("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f11158b > 0) {
            new zzi(Looper.getMainLooper()).post(new H2.q(13, this, lifecycleCallback, str, false));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final LifecycleCallback b(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f11157a.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0835l
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i7, i8, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11158b = 1;
        this.f11159c = bundle;
        for (Map.Entry entry : this.f11157a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f11158b = 5;
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f11158b = 3;
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f11157a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f11158b = 2;
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f11158b = 4;
        Iterator it = this.f11157a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
