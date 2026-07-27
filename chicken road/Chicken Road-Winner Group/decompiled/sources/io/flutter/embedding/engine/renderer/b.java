package io.flutter.embedding.engine.renderer;

import io.flutter.view.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9125b;

    public /* synthetic */ b(p pVar, int i3) {
        this.f9124a = i3;
        this.f9125b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9124a) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f9125b).lambda$dequeueImage$0();
                break;
            default:
                ((g) this.f9125b).getClass();
                break;
        }
    }
}
