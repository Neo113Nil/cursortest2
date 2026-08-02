package A90;

import android.content.Context;
import androidx.lifecycle.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.sharing.presentation.photo.PhotoPreviewFragment;
import ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment;
import ru.ozon.fintech.preferences.ui.nativebridge.StatusResultView;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f571b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f570a = i11;
        this.f571b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        Object obj = this.f571b;
        switch (this.f570a) {
            case 0:
                z0.b bVar = ((FintechCbdcFragment) obj).f96682c;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 1:
                int i11 = StatusResultView.f97006n;
                return Integer.valueOf(androidx.core.content.a.getColor((Context) obj, R.color.red_700));
            default:
                factory = ((PhotoPreviewFragment) obj).getFactory();
                return factory;
        }
    }
}
