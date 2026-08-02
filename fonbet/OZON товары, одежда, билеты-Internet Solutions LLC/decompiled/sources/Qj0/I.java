package Qj0;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

/* loaded from: classes7.dex */
public abstract class I {
    private I next;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectTypes f23517a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final HashMap f23518b;

        /* renamed from: Qj0.I$a$a, reason: collision with other inner class name */
        public static final class C0475a {

            /* renamed from: a, reason: collision with root package name */
            private final ObjectTypes f23519a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final HashMap<String, Object> f23520b = new HashMap<>();

            public C0475a(String str, ObjectTypes objectTypes) {
                this.f23519a = objectTypes;
            }

            @NotNull
            public final a a() {
                return new a(this.f23519a, this.f23520b);
            }

            @NotNull
            public final void b(@NotNull Map properties) {
                Intrinsics.checkNotNullParameter(properties, "properties");
                HashMap<String, Object> hashMap = this.f23520b;
                hashMap.clear();
                hashMap.putAll(properties);
            }
        }

        public a(ObjectTypes objectTypes, HashMap hashMap) {
            this.f23517a = objectTypes;
            this.f23518b = hashMap;
        }

        public final ObjectTypes a() {
            return this.f23517a;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f23518b;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final b f23521b = new b(kotlin.collections.M.f71699a);

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<String> f23522a;

        public b(@NotNull Set<String> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.f23522a = types;
        }

        @NotNull
        public final Set<String> b() {
            return this.f23522a;
        }
    }

    public final boolean canIntercept$intercepted_performance_tracker_release(@NotNull a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        I i11 = this.next;
        if (intercept(chain)) {
            return true;
        }
        if (i11 != null) {
            return i11.canIntercept$intercepted_performance_tracker_release(chain);
        }
        return false;
    }

    public abstract boolean intercept(@NotNull a aVar);

    @NotNull
    public abstract b pages();

    public final void setNext$intercepted_performance_tracker_release(I i11) {
        this.next = i11;
    }
}
