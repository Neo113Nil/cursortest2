package androidx.work;

import androidx.work.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends x {

    public static final class a extends x.a<a, t> {
        public a() {
            throw null;
        }

        @Override // androidx.work.x.a
        public final t c() {
            if (d() && h().f63808j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (h().f63815q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            Intrinsics.checkNotNullParameter(this, "builder");
            return new t(e(), h(), f());
        }

        @Override // androidx.work.x.a
        public final a g() {
            return this;
        }
    }
}
