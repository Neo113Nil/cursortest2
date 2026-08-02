package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class C0 {

    static final class a extends AbstractC7737t implements Function1<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f43191b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View currentView = view;
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends AbstractC7737t implements Function1<View, J> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f43192b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final J invoke(View view) {
            View viewParent = view;
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof J) {
                return (J) tag;
            }
            return null;
        }
    }

    public static final J a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (J) kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.q(view, a.f43191b), b.f43192b));
    }

    public static final void b(@NotNull View view, J j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, j11);
    }
}
