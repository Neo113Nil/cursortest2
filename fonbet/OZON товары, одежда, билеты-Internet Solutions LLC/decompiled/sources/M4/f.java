package M4;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class f {

    static final class a extends AbstractC7737t implements Function1<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17390b = new a(1);

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

    static final class b extends AbstractC7737t implements Function1<View, e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f17391b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final e invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof e) {
                return (e) tag;
            }
            return null;
        }
    }

    public static final e a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (e) l.l(l.w(l.q(view, a.f17390b), b.f17391b));
    }

    public static final void b(@NotNull View view, e eVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }
}
