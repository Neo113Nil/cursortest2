package Kj;

import Jj.b;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonuikitcore.OzonGradient;

/* loaded from: classes10.dex */
public final class d {
    @NotNull
    public static final Jj.b a(@NotNull TypedArray typedArray, @NotNull Context context, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = typedArray.getString(i11);
        if (string != null) {
            OzonGradient a11 = c.a(string);
            b.a b11 = a11 != null ? c.b(a11, context) : null;
            if (b11 != null) {
                return b11;
            }
        }
        return new b.C0283b(typedArray.getColor(i12, i13));
    }
}
