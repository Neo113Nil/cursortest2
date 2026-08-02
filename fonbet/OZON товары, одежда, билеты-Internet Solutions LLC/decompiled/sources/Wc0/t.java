package Wc0;

import Xc0.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.button.ButtonView;
import td0.C9863c;

/* loaded from: classes3.dex */
public final class t {
    public static void a(@NotNull ButtonView button, @NotNull Xc0.b state) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof b.c)) {
            if (Intrinsics.d(state, b.a.f34285a)) {
                button.setSubtitleText("");
                C9863c.a(button, true);
                return;
            } else {
                if (!Intrinsics.d(state, b.C0615b.f34286a)) {
                    throw new Sc.o();
                }
                button.setSubtitleText("");
                return;
            }
        }
        b.c cVar = (b.c) state;
        C9863c.a(button, false);
        int b11 = cVar.b();
        int i11 = b11 / 3600;
        int i12 = (b11 / 60) % 60;
        int i13 = b11 % 60;
        String format = String.format(cVar.a(), Arrays.copyOf(new Object[]{i11 > 0 ? V.e.b(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, 3, "%d:%02d:%02d", "format(...)") : V.e.b(new Object[]{Integer.valueOf(i12), Integer.valueOf(i13)}, 2, "%02d:%02d", "format(...)")}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        button.setSubtitleText(format);
    }
}
