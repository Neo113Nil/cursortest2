package Z1;

import a2.InterfaceC4921a;
import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    @NotNull
    public static final d a(@NotNull Context context) {
        float f7 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        InterfaceC4921a a11 = a2.b.a(f7);
        if (a11 == null) {
            a11 = new t(f7);
        }
        return new g(f11, f7, a11);
    }
}
