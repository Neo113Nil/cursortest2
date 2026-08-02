package Ci;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes6.dex */
final class i extends AbstractC7737t implements Function1<GalleryActivity, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f5099b = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GalleryActivity galleryActivity) {
        GalleryActivity activity = galleryActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getOnBackPressedDispatcher().l();
        return Unit.f71690a;
    }
}
