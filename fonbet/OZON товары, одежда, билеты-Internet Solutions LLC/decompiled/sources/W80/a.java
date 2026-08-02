package W80;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: W80.a$a, reason: collision with other inner class name */
    public static final class C0590a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Intent f33320a;

        public C0590a(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f33320a = intent;
        }

        @NotNull
        public final Intent a() {
            return this.f33320a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0590a) && Intrinsics.d(this.f33320a, ((C0590a) obj).f33320a);
        }

        public final int hashCode() {
            return this.f33320a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "FinActivity(intent=" + this.f33320a + ")";
        }
    }
}
