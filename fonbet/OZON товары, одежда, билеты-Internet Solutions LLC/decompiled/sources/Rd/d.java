package Rd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25011a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String name, @NotNull String desc) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f25011a = name;
            this.f25012b = desc;
        }

        @Override // Rd.d
        @NotNull
        public final String a() {
            return this.f25011a + ':' + this.f25012b;
        }

        @NotNull
        public final String b() {
            return this.f25011a;
        }

        @NotNull
        public final String c() {
            return this.f25012b;
        }

        @NotNull
        public final String d() {
            return this.f25012b;
        }

        @NotNull
        public final String e() {
            return this.f25011a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f25011a, aVar.f25011a) && Intrinsics.d(this.f25012b, aVar.f25012b);
        }

        public final int hashCode() {
            return this.f25012b.hashCode() + (this.f25011a.hashCode() * 31);
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f25013a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String name, @NotNull String desc) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f25013a = name;
            this.f25014b = desc;
        }

        public static b b(b bVar, String desc) {
            String name = bVar.f25013a;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new b(name, desc);
        }

        @Override // Rd.d
        @NotNull
        public final String a() {
            return this.f25013a + this.f25014b;
        }

        @NotNull
        public final String c() {
            return this.f25014b;
        }

        @NotNull
        public final String d() {
            return this.f25013a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f25013a, bVar.f25013a) && Intrinsics.d(this.f25014b, bVar.f25014b);
        }

        public final int hashCode() {
            return this.f25014b.hashCode() + (this.f25013a.hashCode() * 31);
        }
    }

    public d(int i11) {
    }

    @NotNull
    public abstract String a();

    @NotNull
    public final String toString() {
        return a();
    }
}
