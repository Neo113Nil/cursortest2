package C90;

import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;
import w30.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4506b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4505a = i11;
        this.f4506b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        switch (this.f4505a) {
            case 0:
                z0.b bVar = ((FintechLogCatFragment) this.f4506b).f96771b;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 1:
                factory = ((CameraFragment) this.f4506b).getFactory();
                return factory;
            default:
                return i.a((i) this.f4506b);
        }
    }
}
