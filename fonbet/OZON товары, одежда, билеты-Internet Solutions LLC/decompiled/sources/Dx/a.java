package Dx;

import com.google.common.util.concurrent.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsViewHolder;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6784c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f6782a = i11;
        this.f6783b = obj;
        this.f6784c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6782a) {
            case 0:
                PdpAspectsViewHolder.bind$lambda$0((PdpAspectsViewHolder) this.f6783b, (PdpAspectsVO) this.f6784c);
                break;
            case 1:
                M2.a this$0 = (M2.a) this.f6783b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                M exception = (M) this.f6784c;
                Intrinsics.checkNotNullParameter(exception, "$exception");
                this$0.m().a(exception.f71787a);
                break;
            default:
                CameraFragment.setUpCamera$lambda$58((CameraFragment) this.f6783b, (m) this.f6784c);
                break;
        }
    }
}
