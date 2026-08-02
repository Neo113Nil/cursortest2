package J4;

import androidx.lifecycle.P;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<P<?>> f13891a;

    public o(@NotNull s database) {
        Intrinsics.checkNotNullParameter(database, "database");
        Set<P<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f13891a = newSetFromMap;
    }
}
