package p046g0;

import L.l;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13041a;

    public /* synthetic */ m(int i7) {
        this.f13041a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13041a) {
            case 0:
                try {
                    int i7 = l.f4188a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.j != null) {
                        j.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i8 = l.f4188a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
