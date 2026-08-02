package Ni;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    public static void a(ViewGroup viewGroup, Function1 onClick) {
        AtomicLong commonLastClickTime = new AtomicLong(0L);
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(commonLastClickTime, "commonLastClickTime");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        viewGroup.setOnClickListener(new ViewOnClickListenerC3672a(commonLastClickTime, onClick));
    }

    public static final void b(@NotNull View view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(bool.equals(Boolean.TRUE) ? 0 : 8);
    }
}
