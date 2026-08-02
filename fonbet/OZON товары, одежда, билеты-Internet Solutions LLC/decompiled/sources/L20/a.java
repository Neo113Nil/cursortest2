package L20;

import C.o0;
import G.g;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: L20.a$a, reason: collision with other inner class name */
    public static final class C0310a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f16233a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f16234b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f16235c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f16236d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f16237e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f16238f;

        public C0310a(@NotNull String id2, @NotNull String groupName, @NotNull String artifactName, @NotNull String version, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intrinsics.checkNotNullParameter(artifactName, "artifactName");
            Intrinsics.checkNotNullParameter(version, "version");
            this.f16233a = id2;
            this.f16234b = groupName;
            this.f16235c = artifactName;
            this.f16236d = version;
            this.f16237e = z11;
            this.f16238f = z12;
        }

        public static C0310a a(C0310a c0310a) {
            String id2 = c0310a.f16233a;
            Intrinsics.checkNotNullParameter(id2, "id");
            String groupName = c0310a.f16234b;
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            String artifactName = c0310a.f16235c;
            Intrinsics.checkNotNullParameter(artifactName, "artifactName");
            String version = c0310a.f16236d;
            Intrinsics.checkNotNullParameter(version, "version");
            return new C0310a(id2, groupName, artifactName, version, c0310a.f16237e, true);
        }

        @NotNull
        public final String b() {
            return this.f16235c;
        }

        @NotNull
        public final String c() {
            return this.f16234b;
        }

        @NotNull
        public final String d() {
            return this.f16236d;
        }

        public final boolean e() {
            return this.f16238f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0310a)) {
                return false;
            }
            C0310a c0310a = (C0310a) obj;
            return Intrinsics.d(this.f16233a, c0310a.f16233a) && Intrinsics.d(this.f16234b, c0310a.f16234b) && Intrinsics.d(this.f16235c, c0310a.f16235c) && Intrinsics.d(this.f16236d, c0310a.f16236d) && this.f16237e == c0310a.f16237e && this.f16238f == c0310a.f16238f;
        }

        public final boolean f() {
            return this.f16237e;
        }

        @Override // L20.a
        @NotNull
        public final String getId() {
            return this.f16233a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16238f) + C3532b.a(g.a(g.a(g.a(this.f16233a.hashCode() * 31, 31, this.f16234b), 31, this.f16235c), 31, this.f16236d), 31, this.f16237e);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Dependency(id=");
            sb2.append(this.f16233a);
            sb2.append(", groupName=");
            sb2.append(this.f16234b);
            sb2.append(", artifactName=");
            sb2.append(this.f16235c);
            sb2.append(", version=");
            sb2.append(this.f16236d);
            sb2.append(", isTransitive=");
            sb2.append(this.f16237e);
            sb2.append(", isLast=");
            return Pk0.a.a(")", sb2, this.f16238f);
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f16239a;

        public b(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f16239a = id2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f16239a, ((b) obj).f16239a);
        }

        @Override // L20.a
        @NotNull
        public final String getId() {
            return this.f16239a;
        }

        public final int hashCode() {
            return this.f16239a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Header(id="), this.f16239a, ")");
        }
    }

    @NotNull
    String getId();
}
