package B1;

import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface Y extends InterfaceC2553w {
    @NotNull
    default W f1(int i11, int i12, @NotNull Map map, @NotNull Function1 function1) {
        if ((i11 & (-16777216)) == 0 && ((-16777216) & i12) == 0) {
            return new X(i11, i12, map, this, function1);
        }
        A1.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @NotNull
    default W z0(int i11, int i12, @NotNull Map<AbstractC2531a, Integer> map, @NotNull Function1<? super m0.a, Unit> function1) {
        return f1(i11, i12, map, function1);
    }
}
