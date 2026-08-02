package Kj;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {
    public static final int a(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return C6915b.c(TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics()));
    }

    public static final float b(float f7) {
        return TypedValue.applyDimension(1, f7, Resources.getSystem().getDisplayMetrics());
    }
}
