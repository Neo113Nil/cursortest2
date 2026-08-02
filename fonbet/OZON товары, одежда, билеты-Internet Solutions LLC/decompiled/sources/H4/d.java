package H4;

import android.content.Context;
import androidx.profileinstaller.g;
import io.sentry.K1;
import io.sentry.W2;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10581b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f10580a = i11;
        this.f10581b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10580a) {
            case 0:
                g.b((Context) this.f10581b);
                break;
            default:
                K1.a((W2) this.f10581b);
                break;
        }
    }
}
