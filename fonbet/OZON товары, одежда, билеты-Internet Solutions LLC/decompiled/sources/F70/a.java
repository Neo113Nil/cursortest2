package F70;

import Oe.N;
import kotlin.jvm.functions.Function0;
import l80.f;
import ru.ozon.fintech.features.camera.scanners.mlkit.MlkitCameraScanner;
import ru.ozon.fintech.features.operations.presentation.OperationInfoFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9109b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9108a = i11;
        this.f9109b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        W8.a scanner_delegate$lambda$4;
        switch (this.f9108a) {
            case 0:
                return ((OperationInfoFragment) this.f9109b).getFactory();
            case 1:
                return N.i((N) this.f9109b);
            case 2:
                return f.R((f) this.f9109b);
            default:
                scanner_delegate$lambda$4 = MlkitCameraScanner.scanner_delegate$lambda$4((MlkitCameraScanner) this.f9109b);
                return scanner_delegate$lambda$4;
        }
    }
}
