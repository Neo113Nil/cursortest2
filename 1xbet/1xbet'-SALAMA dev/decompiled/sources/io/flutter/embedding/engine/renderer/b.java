package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0724t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14076a;

    public b(k kVar) {
        this.f14076a = kVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0724t interfaceC0724t) {
        Iterator it = this.f14076a.f14118g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }
}
