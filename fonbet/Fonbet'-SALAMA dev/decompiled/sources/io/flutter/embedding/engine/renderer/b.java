package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0745t;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14070a;

    public b(k kVar) {
        this.f14070a = kVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0745t interfaceC0745t) {
        Iterator it = this.f14070a.f14112g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }
}
