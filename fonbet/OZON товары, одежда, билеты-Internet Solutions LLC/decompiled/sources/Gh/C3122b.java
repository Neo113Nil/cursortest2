package Gh;

import a1.C4912a;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.Y1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Gh.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3122b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4912a f10247a = C3121a.f10245a;

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setViewCompositionStrategy(Y1.a.f40785a);
        composeView.setViewCompositionStrategy(Y1.b.f40789a);
        composeView.setViewCompositionStrategy(Y1.c.f40794a);
        composeView.a(this.f10247a);
    }
}
