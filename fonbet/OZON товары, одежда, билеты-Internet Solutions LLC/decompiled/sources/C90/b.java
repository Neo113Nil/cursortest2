package C90;

import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;
import y70.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4508b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f4507a = i11;
        this.f4508b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Q.b qrResolutionSelector_delegate$lambda$1;
        switch (this.f4507a) {
            case 0:
                return FintechLogCatFragment.v((FintechLogCatFragment) this.f4508b);
            case 1:
                qrResolutionSelector_delegate$lambda$1 = CameraFragment.qrResolutionSelector_delegate$lambda$1((CameraFragment) this.f4508b);
                return qrResolutionSelector_delegate$lambda$1;
            default:
                return f.e0((f) this.f4508b);
        }
    }
}
