package Ag0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTime;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderTrackingInfo;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function1<PikazonImagePainter.State, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<PlaceholderInfo> f1210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Cg0.c f1211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(M<PlaceholderInfo> m11, Cg0.c cVar) {
        super(1);
        this.f1210b = m11;
        this.f1211c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PikazonImagePainter.State state) {
        PikazonImagePainter.State it = state;
        Intrinsics.checkNotNullParameter(it, "it");
        Object model = it instanceof PikazonImagePainter.State.Success ? ((PikazonImagePainter.State.Success) it).b().getModel() : it instanceof PikazonImagePainter.State.Fail ? ((PikazonImagePainter.State.Fail) it).getF97651a().getModel() : null;
        if (model instanceof PikazonUrl) {
            String uuid = ((PikazonUrl) model).getUuid();
            PlaceholderInfo placeholderInfo = this.f1210b.f71787a;
            Pikazon.INSTANCE.getInstance().getPlaceholderTracker().storePlaceholderTrackingInfo(uuid, new PlaceholderTrackingInfo(this.f1211c.a(), placeholderInfo != null ? Cg0.b.a(placeholderInfo) : PlaceholderTime.m902constructorimpl(0L), null));
        }
        return Unit.f71690a;
    }
}
