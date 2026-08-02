package k1;

import android.os.Trace;
import e2.C1930k;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2029a implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17552k = 1;

    public /* synthetic */ RunnableC2029a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17552k) {
            case 0:
                return;
            default:
                try {
                    int i = j1.g.f17490a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (v1.k.d()) {
                        v1.k.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i5 = j1.g.f17490a;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public RunnableC2029a(C1930k c1930k, int i) {
    }

    private final void a() {
    }
}
