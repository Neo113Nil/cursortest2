package Ti;

import androidx.fragment.app.Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import zi.C11125b;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function1<Q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11125b f27187b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f27188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C11125b c11125b, boolean z11) {
        super(1);
        this.f27187b = c11125b;
        this.f27188c = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Q q11) {
        Q safeNavigate = q11;
        Intrinsics.checkNotNullParameter(safeNavigate, "$this$safeNavigate");
        safeNavigate.w();
        safeNavigate.r(R.id.gallery_fragment_container, this.f27187b, "CameraFragment");
        if (this.f27188c) {
            safeNavigate.g("CameraBackStack");
        }
        return Unit.f71690a;
    }
}
