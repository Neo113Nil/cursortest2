package J4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class l<T> extends A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull s database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(@NotNull O4.f fVar, T t2);

    public final void insert(T t2) {
        O4.f acquire = acquire();
        try {
            bind(acquire, t2);
            acquire.s1();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t2) {
        O4.f acquire = acquire();
        try {
            bind(acquire, t2);
            return acquire.s1();
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        O4.f acquire = acquire();
        try {
            Tc.b builder = C7714v.B();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                builder.add(Long.valueOf(acquire.s1()));
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            release(acquire);
            return B11;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final void insert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        O4.f acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.s1();
            }
        } finally {
            release(acquire);
        }
    }
}
