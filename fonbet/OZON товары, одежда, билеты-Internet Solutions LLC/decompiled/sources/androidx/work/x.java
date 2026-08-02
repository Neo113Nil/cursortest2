package androidx.work;

import g5.C6627B;
import h5.C6806d;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final UUID f45559a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6627B f45560b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f45561c;

    public static abstract class a<B extends a<B, ?>, W extends x> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f45562a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private UUID f45563b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private C6627B f45564c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final LinkedHashSet f45565d;

        public a(@NotNull Class<? extends n> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f45563b = randomUUID;
            String id2 = this.f45563b.toString();
            Intrinsics.checkNotNullExpressionValue(id2, "id.toString()");
            String workerClassName_ = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
            this.f45564c = new C6627B(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f45565d = e0.e(name);
        }

        @NotNull
        public final B a(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f45565d.add(tag);
            return g();
        }

        @NotNull
        public final W b() {
            W c11 = c();
            d dVar = this.f45564c.f63808j;
            boolean z11 = dVar.e() || dVar.f() || dVar.g() || dVar.h();
            C6627B c6627b = this.f45564c;
            if (c6627b.f63815q) {
                if (z11) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c6627b.f63805g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID id2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(id2, "randomUUID()");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f45563b = id2;
            String uuid = id2.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.f45564c = new C6627B(uuid, this.f45564c);
            return c11;
        }

        @NotNull
        public abstract W c();

        public final boolean d() {
            return this.f45562a;
        }

        @NotNull
        public final UUID e() {
            return this.f45563b;
        }

        @NotNull
        public final LinkedHashSet f() {
            return this.f45565d;
        }

        @NotNull
        public abstract B g();

        @NotNull
        public final C6627B h() {
            return this.f45564c;
        }

        @NotNull
        public final B i(@NotNull androidx.work.a backoffPolicy, long j11, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f45562a = true;
            C6627B c6627b = this.f45564c;
            c6627b.f63810l = backoffPolicy;
            c6627b.g(timeUnit.toMillis(j11));
            return g();
        }

        @NotNull
        public final B j(@NotNull d constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.f45564c.f63808j = constraints;
            return g();
        }

        @NotNull
        public final B k(long j11, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f45564c.f63805g = timeUnit.toMillis(j11);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f45564c.f63805g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NotNull
        public final void l(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f45564c.f63805g = C6806d.a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= this.f45564c.f63805g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
        }

        @NotNull
        public final B m(@NotNull e inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f45564c.f63803e = inputData;
            return g();
        }
    }

    public x(@NotNull UUID id2, @NotNull C6627B workSpec, @NotNull LinkedHashSet tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f45559a = id2;
        this.f45560b = workSpec;
        this.f45561c = tags;
    }

    @NotNull
    public final String a() {
        String uuid = this.f45559a.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    @NotNull
    public final Set<String> b() {
        return this.f45561c;
    }

    @NotNull
    public final C6627B c() {
        return this.f45560b;
    }
}
