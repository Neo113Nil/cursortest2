package D3;

import C.I;
import androidx.concurrent.futures.b;
import io.sentry.C2;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.util.l;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final /* synthetic */ class l implements l.a, b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5666a;

    public /* synthetic */ l(Object obj) {
        this.f5666a = obj;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(final b.a aVar) {
        ((AtomicReference) this.f5666a).set(new I.j() { // from class: v.q0
            @Override // C.I.j
            public final void a() {
                C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                b.a.this.c(null);
            }
        });
        return "OnScreenFlashUiApplied";
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        int i11 = SentryPerformanceProvider.f66986f;
        return (C2) this.f5666a;
    }
}
