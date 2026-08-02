package I20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: I20.a$a, reason: collision with other inner class name */
    public static final class C0230a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0230a f11807a = new C0230a();
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f11808a;

        public b(@NotNull String groupId) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            this.f11808a = groupId;
        }

        @NotNull
        public final String a() {
            return this.f11808a;
        }
    }
}
