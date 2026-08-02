package Bi;

import android.content.Context;
import android.content.Intent;
import h.AbstractC6755a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes6.dex */
public final class g extends AbstractC6755a<Ci.k, Hi.f> {
    @Override // h.AbstractC6755a
    public final Intent a(Context context, Ci.k kVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = GalleryActivity.f83799o;
        return GalleryActivity.a.a(context, kVar);
    }

    @Override // h.AbstractC6755a
    public final Hi.f c(int i11, Intent intent) {
        if (intent == null) {
            return null;
        }
        int i12 = GalleryActivity.f83799o;
        return GalleryActivity.a.b(intent);
    }
}
