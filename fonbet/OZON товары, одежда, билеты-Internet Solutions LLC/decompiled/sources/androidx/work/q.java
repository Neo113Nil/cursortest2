package androidx.work;

import androidx.work.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q extends x {

    /* loaded from: classes.dex */
    public static final class a extends x.a<a, q> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<? extends n> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            h().f63802d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.x.a
        public final q c() {
            if (d() && h().f63808j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new q(this);
        }

        @Override // androidx.work.x.a
        public final a g() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
