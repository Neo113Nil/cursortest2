package Me;

import Oe.V;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    public static final kotlin.reflect.d<?> a(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof c) {
            ((c) fVar).getClass();
            return null;
        }
        if (fVar instanceof V) {
            return a(((V) fVar).g());
        }
        return null;
    }
}
