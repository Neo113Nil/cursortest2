package L1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final H f16149a = new H();

    @NotNull
    public static StaticLayout a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @NotNull S1.f fVar, @NotNull Layout.Alignment alignment, @NotNull TextDirectionHeuristic textDirectionHeuristic, TextUtils.TruncateAt truncateAt, @NotNull CharSequence charSequence, boolean z11, boolean z12) {
        return f16149a.a(new T(i12, i11, i13, i14, i15, i16, i17, i18, i19, fVar, alignment, textDirectionHeuristic, truncateAt, charSequence, z11, z12));
    }
}
