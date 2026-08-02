package Z;

import Z.m;
import android.view.ViewGroup;
import ru.ozon.app.android.messenger.databinding.MBlockSnackbarBinding;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35218c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f35216a = i11;
        this.f35217b = obj;
        this.f35218c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35216a) {
            case 0:
                ((m.a) this.f35217b).onError((Throwable) this.f35218c);
                break;
            default:
                ((ViewGroup) this.f35217b).removeView(((MBlockSnackbarBinding) this.f35218c).getConstraintLayout());
                break;
        }
    }
}
