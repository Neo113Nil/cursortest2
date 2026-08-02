package Od0;

import Ld0.e;
import Sc.InterfaceC3999a;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes7.dex */
public abstract class e<Plugin extends Ld0.e> extends d<Plugin> {

    @InterfaceC3999a
    public interface a {

        @InterfaceC3999a
        /* renamed from: Od0.e$a$a, reason: collision with other inner class name */
        public static final class C0409a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return C0409a.class.equals(obj != null ? obj.getClass() : null);
            }

            public final int hashCode() {
                return C0409a.class.hashCode();
            }

            @NotNull
            public final String toString() {
                String simpleName = C0409a.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            }
        }

        @InterfaceC3999a
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f20231a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f20232b;

            public b(@NotNull String description, Throwable th2) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.f20231a = description;
                this.f20232b = th2;
            }

            @NotNull
            public final String a() {
                return this.f20231a;
            }

            public final Throwable b() {
                return this.f20232b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.limb.external.providers.OzonLimbPluginProviderWithDeeplinks.DeeplinkHandleResult.HandledWithError");
                b bVar = (b) obj;
                return Intrinsics.d(this.f20231a, bVar.f20231a) && Intrinsics.d(this.f20232b, bVar.f20232b);
            }

            public final int hashCode() {
                int hashCode = this.f20231a.hashCode() * 31;
                Throwable th2 = this.f20232b;
                return hashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return b.class.getSimpleName() + "(description=" + this.f20231a + ", throwable=" + this.f20232b + ")";
            }
        }

        @InterfaceC3999a
        public static final class c implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return c.class.equals(obj != null ? obj.getClass() : null);
            }

            public final int hashCode() {
                return c.class.hashCode();
            }

            @NotNull
            public final String toString() {
                String simpleName = c.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            }
        }
    }

    @InterfaceC3999a
    public interface b {

        @InterfaceC3999a
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final Intent f20233a;

            public a(@NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f20233a = intent;
            }

            @Override // Od0.e.b
            public final Uri a() {
                return this.f20233a.getData();
            }

            @NotNull
            public final Intent b() {
                return this.f20233a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                return Intrinsics.d(this.f20233a, ((a) obj).f20233a);
            }

            public final int hashCode() {
                return this.f20233a.hashCode();
            }

            @NotNull
            public final String toString() {
                return a.class.getSimpleName() + "(intent=" + this.f20233a + ")";
            }
        }

        @InterfaceC3999a
        /* renamed from: Od0.e$b$b, reason: collision with other inner class name */
        public static final class C0410b implements b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final Uri f20234a;

            public C0410b(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.f20234a = uri;
            }

            @Override // Od0.e.b
            @NotNull
            public final Uri a() {
                return this.f20234a;
            }

            @NotNull
            public final Uri b() {
                return this.f20234a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0410b)) {
                    return false;
                }
                return Intrinsics.d(this.f20234a, ((C0410b) obj).f20234a);
            }

            public final int hashCode() {
                return this.f20234a.hashCode();
            }

            @NotNull
            public final String toString() {
                return C0410b.class.getSimpleName() + "(uri=" + this.f20234a + ")";
            }
        }

        Uri a();
    }

    public void beforeHandleDeeplink(@NotNull Ld0.c store, @NotNull b deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @NotNull
    public abstract a handleDeeplink(@NotNull Ld0.c cVar, @NotNull b bVar);
}
