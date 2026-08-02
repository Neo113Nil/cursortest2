package S30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: S30.a$a, reason: collision with other inner class name */
    public static final class C0512a {

        /* renamed from: a, reason: collision with root package name */
        private final String f25755a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25756b;

        public C0512a(String str, String str2) {
            this.f25755a = str;
            this.f25756b = str2;
        }

        public final String a() {
            return this.f25756b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0512a)) {
                return false;
            }
            C0512a c0512a = (C0512a) obj;
            return Intrinsics.d(this.f25755a, c0512a.f25755a) && Intrinsics.d(this.f25756b, c0512a.f25756b);
        }

        public final int hashCode() {
            String str = this.f25755a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25756b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WebViewVersion(major=");
            sb2.append(this.f25755a);
            sb2.append(", full=");
            return o0.c(sb2, this.f25756b, ")");
        }
    }

    @NotNull
    C0512a a();

    Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    String c();

    @NotNull
    String getUniqueApplicationId();
}
