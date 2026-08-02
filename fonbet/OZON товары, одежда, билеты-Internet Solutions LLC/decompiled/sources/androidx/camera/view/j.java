package androidx.camera.view;

import androidx.camera.core.impl.I;
import androidx.camera.view.PreviewView;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreviewView.a f38549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f38550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f38551c;

    public /* synthetic */ j(PreviewView.a aVar, f fVar, I i11) {
        this.f38549a = aVar;
        this.f38550b = fVar;
        this.f38551c = i11;
    }

    public final void a() {
        f fVar;
        AtomicReference<f> atomicReference = PreviewView.this.f38510g;
        while (true) {
            fVar = this.f38550b;
            if (atomicReference.compareAndSet(fVar, null)) {
                fVar.c(PreviewView.e.IDLE);
                break;
            } else if (atomicReference.get() != fVar) {
                break;
            }
        }
        I.d dVar = fVar.f38532e;
        if (dVar != null) {
            dVar.cancel(false);
            fVar.f38532e = null;
        }
        this.f38551c.c().d(fVar);
    }
}
