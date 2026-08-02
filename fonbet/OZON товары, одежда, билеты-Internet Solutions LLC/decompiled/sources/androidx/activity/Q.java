package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class Q {

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<View, View> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f36947b = new a(1);

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

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<View, M> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f36948b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final M invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof M) {
                return (M) tag;
            }
            return null;
        }
    }

    public static final M a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (M) kotlin.sequences.l.l(kotlin.sequences.l.w(kotlin.sequences.l.q(view, a.f36947b), b.f36948b));
    }

    public static final void b(@NotNull View view, @NotNull M onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
