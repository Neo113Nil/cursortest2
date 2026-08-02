package L1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Layout.Alignment f16200a = Layout.Alignment.ALIGN_NORMAL;

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    @NotNull
    public static Layout.Alignment a() {
        return f16200a;
    }
}
