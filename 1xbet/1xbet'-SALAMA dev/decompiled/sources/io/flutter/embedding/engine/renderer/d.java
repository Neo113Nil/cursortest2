package io.flutter.embedding.engine.renderer;

import io.flutter.view.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14081b;

    public /* synthetic */ d(o oVar, int i7) {
        this.f14080a = i7;
        this.f14081b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14080a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f14081b).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f14081b).getClass();
                break;
        }
    }
}
