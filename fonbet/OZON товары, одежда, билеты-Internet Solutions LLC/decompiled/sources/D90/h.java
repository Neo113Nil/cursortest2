package D90;

import androidx.lifecycle.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6203b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f6202a = i11;
        this.f6203b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6202a) {
            case 0:
                return j.d0((j) this.f6203b);
            case 1:
                z0.b bVar = ((FintechScannerSettingsFragment) this.f6203b).f96912a;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 2:
                return H90.b.d0((H90.b) this.f6203b);
            case 3:
                return Boolean.valueOf(f50.b.t((f50.b) this.f6203b));
            default:
                l80.f fVar = (l80.f) this.f6203b;
                fVar.l0(false);
                d70.d dVar = fVar.f73005x;
                if (dVar == null) {
                    Intrinsics.n("offlineManager");
                    throw null;
                }
                dVar.c(true);
                fVar.f0().z0();
                return Unit.f71690a;
        }
    }
}
