package androidx.core.content.res;

import android.content.res.TypedArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j {
    public static final int a(@NotNull TypedArray typedArray, int i11) {
        if (typedArray.hasValue(i11)) {
            return typedArray.getColor(i11, 0);
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }

    public static final int b(@NotNull TypedArray typedArray) {
        if (typedArray.hasValue(0)) {
            return typedArray.getDimensionPixelSize(0, 0);
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }
}
