package B4;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class Y extends AbstractC7737t implements Function1<View, View> {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f2597b = new Y(1);

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
