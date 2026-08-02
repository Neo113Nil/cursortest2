package P1;

import android.content.Context;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* renamed from: P1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3814v {
    @NotNull
    public static final C3812t a(@NotNull Context context) {
        return new C3812t(new C3796c(context), new C3798e(Build.VERSION.SDK_INT >= 31 ? G.f21517a.a(context) : 0));
    }
}
