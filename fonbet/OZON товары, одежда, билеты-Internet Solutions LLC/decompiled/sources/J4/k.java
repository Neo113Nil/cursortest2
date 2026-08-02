package J4;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class k<T> extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull s database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(@NotNull O4.f fVar, T t2);

    public final int handle(T t2) {
        O4.f acquire = acquire();
        try {
            bind(acquire, t2);
            return acquire.C();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        O4.f acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i11 += acquire.C();
            }
            return i11;
        } finally {
            release(acquire);
        }
    }
}
