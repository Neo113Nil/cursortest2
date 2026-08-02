package T7;

import android.content.Context;
import com.google.crypto.tink.internal.x;
import io.sentry.W2;
import io.sentry.android.core.util.a;
import io.sentry.util.l;
import m3.r;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
public final /* synthetic */ class Q implements x.a, l.a, a.InterfaceC1104a, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26754a;

    public /* synthetic */ Q(int i11) {
        this.f26754a = i11;
    }

    @Override // io.sentry.android.core.util.a.InterfaceC1104a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.crypto.tink.internal.x.a
    public S7.q d(com.google.crypto.tink.internal.G g10) {
        switch (this.f26754a) {
            case 0:
                return S.a(g10);
            default:
                return U7.g.b(g10);
        }
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return W2.empty();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    public /* synthetic */ Q(InterfaceC9928b.a aVar, int i11, int i12, boolean z11) {
        this.f26754a = 4;
    }
}
