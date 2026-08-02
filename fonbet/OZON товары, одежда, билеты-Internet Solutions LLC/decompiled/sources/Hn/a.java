package Hn;

import androidx.appcompat.widget.Toolbar;
import ru.ozon.app.android.cart.domain.network.CartSyncService;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11216b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f11215a = i11;
        this.f11216b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11215a) {
            case 0:
                ((CartSyncService) this.f11216b).loop();
                break;
            case 1:
                ((Toolbar) this.f11216b).collapseActionView();
                break;
            default:
                io.sentry.android.core.internal.util.a.o((io.sentry.android.core.internal.util.a) this.f11216b);
                break;
        }
    }
}
