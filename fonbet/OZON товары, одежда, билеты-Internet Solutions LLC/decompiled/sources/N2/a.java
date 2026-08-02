package N2;

import U7.C4056a;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.ui.platform.AbstractC5228a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class a {
    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@NotNull AbstractC5228a abstractC5228a, @NotNull C4056a listener) {
        Intrinsics.checkNotNullParameter(abstractC5228a, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b bVar = (b) abstractC5228a.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar == null) {
            bVar = new b();
            abstractC5228a.setTag(R.id.pooling_container_listener_holder_tag, bVar);
        }
        bVar.a(listener);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void b(@NotNull View view, @NotNull C4056a listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b bVar = (b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar == null) {
            bVar = new b();
            view.setTag(R.id.pooling_container_listener_holder_tag, bVar);
        }
        bVar.b(listener);
    }
}
