package bf;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* renamed from: bf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5658b {
    public static final void a(AbstractC5657a abstractC5657a, c cVar, String str) {
        Logger logger;
        logger = e.f55977i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f());
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(abstractC5657a.b());
        logger.fine(sb2.toString());
    }

    @NotNull
    public static final String b(long j11) {
        String a11;
        if (j11 <= -999500000) {
            a11 = P4.f.a((j11 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j11 <= -999500) {
            a11 = P4.f.a((j11 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j11 <= 0) {
            a11 = P4.f.a((j11 - CounterView.COUNTER_MAX_DEFAULT) / 1000, " µs", new StringBuilder());
        } else if (j11 < 999500) {
            a11 = P4.f.a((j11 + CounterView.COUNTER_MAX_DEFAULT) / 1000, " µs", new StringBuilder());
        } else if (j11 < 999500000) {
            a11 = P4.f.a((j11 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            a11 = P4.f.a((j11 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return V.e.b(new Object[]{a11}, 1, "%6s", "java.lang.String.format(format, *args)");
    }
}
