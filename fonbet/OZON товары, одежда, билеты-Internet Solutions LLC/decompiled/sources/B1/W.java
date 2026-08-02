package B1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface W {
    int getHeight();

    int getWidth();

    @NotNull
    Map<AbstractC2531a, Integer> s();

    default Function1<Object, Unit> t() {
        return null;
    }

    void u();
}
