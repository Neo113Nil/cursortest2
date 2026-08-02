package Qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h {
    @NotNull
    public static final g a(@NotNull String output, @NotNull Number value) {
        int length;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        StringBuilder sb2 = new StringBuilder("Unexpected special floating-point value ");
        sb2.append(value);
        sb2.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        Intrinsics.checkNotNullParameter(output, "<this>");
        if (output.length() >= 200 && output.length() - 60 > 0) {
            output = "....." + output.subSequence(length, output.length()).toString();
        }
        sb2.append((Object) output);
        return new g(sb2.toString());
    }
}
