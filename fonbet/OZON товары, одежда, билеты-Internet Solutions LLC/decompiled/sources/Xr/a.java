package Xr;

import kotlin.jvm.functions.Function0;
import ru.ozon.android.messenger.blocks.snackbar.view.SnackbarContainer;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f34497b;

    public /* synthetic */ a(Function0 function0, int i11) {
        this.f34496a = i11;
        this.f34497b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Function0 function0 = this.f34497b;
        switch (this.f34496a) {
            case 0:
                function0.invoke();
                break;
            default:
                int i11 = SnackbarContainer.f86441e;
                function0.invoke();
                break;
        }
    }
}
