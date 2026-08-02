package g0;

import android.os.Trace;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13035a;

    public /* synthetic */ m(int i7) {
        this.f13035a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13035a) {
            case 0:
                try {
                    int i7 = L.l.f4188a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.j != null) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = L.l.f4188a;
                    Trace.endSection();
                    throw th;
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
