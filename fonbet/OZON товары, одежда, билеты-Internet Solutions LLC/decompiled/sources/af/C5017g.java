package af;

import bf.AbstractC5657a;
import java.io.IOException;
import sf.z;

/* renamed from: af.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5017g extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5015e f36756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5017g(C5015e c5015e, String str) {
        super(str, true);
        this.f36756e = c5015e;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        boolean z11;
        boolean I11;
        synchronized (this.f36756e) {
            z11 = this.f36756e.f36725k;
            if (!z11 || this.f36756e.w()) {
                return -1L;
            }
            try {
                this.f36756e.b0();
            } catch (IOException unused) {
                this.f36756e.f36727m = true;
            }
            try {
                I11 = this.f36756e.I();
                if (I11) {
                    this.f36756e.R();
                    this.f36756e.f36722h = 0;
                }
            } catch (IOException unused2) {
                this.f36756e.f36728n = true;
                this.f36756e.f36720f = z.c(z.b());
            }
            return -1L;
        }
    }
}
