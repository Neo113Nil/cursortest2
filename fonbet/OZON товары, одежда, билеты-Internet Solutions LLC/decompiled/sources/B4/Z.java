package B4;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class Z extends AbstractC7737t implements Function1<View, C2584m> {

    /* renamed from: b, reason: collision with root package name */
    public static final Z f2598b = new Z(1);

    @Override // kotlin.jvm.functions.Function1
    public final C2584m invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C2584m) ((WeakReference) tag).get();
        }
        if (tag instanceof C2584m) {
            return (C2584m) tag;
        }
        return null;
    }
}
