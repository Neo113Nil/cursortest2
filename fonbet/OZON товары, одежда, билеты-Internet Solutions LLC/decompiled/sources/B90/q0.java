package B90;

import android.hardware.camera2.CameraDevice;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.fintech.ui.pinprogress.PinProgressWrapper;

/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3187b;

    public /* synthetic */ q0(Object obj, int i11) {
        this.f3186a = i11;
        this.f3187b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3186a) {
            case 0:
                v0.g0((v0) this.f3187b);
                break;
            case 1:
                YandexSearchSheetFragment.keyboardShowRunnable$lambda$1((YandexSearchSheetFragment) this.f3187b);
                break;
            case 2:
                ((androidx.camera.view.j) this.f3187b).a();
                break;
            case 3:
                ((Function0) this.f3187b).invoke();
                break;
            case 4:
                PinProgressWrapper.bindState$lambda$2((PinProgressWrapper) this.f3187b);
                break;
            default:
                ((CameraDevice) this.f3187b).close();
                break;
        }
    }
}
