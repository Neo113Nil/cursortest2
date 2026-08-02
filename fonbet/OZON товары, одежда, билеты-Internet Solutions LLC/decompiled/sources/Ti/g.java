package Ti;

import Ci.k;
import Ui.C4069c;
import android.os.Bundle;
import androidx.fragment.app.Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<Q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f27189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(k kVar) {
        super(1);
        this.f27189b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Q q11) {
        Q safeNavigate = q11;
        Intrinsics.checkNotNullParameter(safeNavigate, "$this$safeNavigate");
        safeNavigate.w();
        int i11 = C4069c.f27731u;
        k pageConfig = this.f27189b;
        Intrinsics.checkNotNullParameter(pageConfig, "pageConfig");
        C4069c c4069c = new C4069c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("GALLERY_PAGE_CONFIG_ARG", pageConfig);
        c4069c.setArguments(bundle);
        safeNavigate.r(R.id.gallery_fragment_container, c4069c, "GalleryFragment");
        return Unit.f71690a;
    }
}
