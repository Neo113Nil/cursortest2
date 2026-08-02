package ae0;

import android.content.Context;
import android.util.TypedValue;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {
    @NotNull
    public static final String a(@NotNull String str) {
        List<we0.l> b11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        i.f36650a.getClass();
        if (i.c() && (b11 = i.b()) != null) {
            for (we0.l lVar : b11) {
                str = kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(str, ", " + lVar.b(), "", false), lVar.b() + ", ", "", false), lVar.b(), "", false), ", " + lVar.a(), "", false), lVar.a() + ", ", "", false), lVar.a(), "", false);
            }
        }
        return kotlin.text.h.z0(str).toString();
    }

    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue.applyDimension(1, 60, context.getResources().getDisplayMetrics());
    }
}
