package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5320h0 {

    /* renamed from: androidx.core.view.h0$a */
    /* synthetic */ class a extends C7735q implements Function1<ViewParent, ViewParent> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42296a = new a(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    @NotNull
    public static final kotlin.sequences.m a(@NotNull ConstraintLayout constraintLayout) {
        C5318g0 block = new C5318g0(constraintLayout, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return new kotlin.sequences.m(block);
    }

    @NotNull
    public static final Sequence<ViewParent> b(@NotNull View view) {
        return kotlin.sequences.l.q(view.getParent(), a.f42296a);
    }
}
