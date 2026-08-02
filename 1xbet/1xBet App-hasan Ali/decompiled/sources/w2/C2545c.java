package w2;

import java.io.Closeable;
import o4.C2226d;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2545c implements Closeable, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final C2544b f20502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2548f f20504m;

    public C2545c(C2548f c2548f, C2544b c2544b) {
        this.f20504m = c2548f;
        this.f20502k = c2544b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20503l) {
            return;
        }
        this.f20503l = true;
        C2548f c2548f = this.f20504m;
        synchronized (c2548f) {
            C2544b c2544b = this.f20502k;
            int i = c2544b.f20501h - 1;
            c2544b.f20501h = i;
            if (i == 0 && c2544b.f) {
                C2226d c2226d = C2548f.f20507A;
                c2548f.p(c2544b);
            }
        }
    }
}
