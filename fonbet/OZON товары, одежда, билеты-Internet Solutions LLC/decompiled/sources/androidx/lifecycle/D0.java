package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class D0 {

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f43195b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object parent = view2.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<View, B0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f43196b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final B0 invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof B0) {
                return (B0) tag;
            }
            return null;
        }
    }

    public static final B0 a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (B0) kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.q(view, a.f43195b), b.f43196b));
    }

    public static final void b(@NotNull View view, B0 b02) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, b02);
    }
}
