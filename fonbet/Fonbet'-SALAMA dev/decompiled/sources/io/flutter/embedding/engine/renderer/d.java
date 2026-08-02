package io.flutter.embedding.engine.renderer;

import io.flutter.view.o;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14075b;

    public /* synthetic */ d(o oVar, int i7) {
        this.f14074a = i7;
        this.f14075b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14074a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f14075b).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f14075b).getClass();
                break;
        }
    }
}
