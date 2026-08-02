package Ld;

import Rd.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16738a;

    public static final class a {
        @NotNull
        public static B a(@NotNull Rd.d signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                String name = bVar.d();
                String desc = bVar.c();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(desc, "desc");
                return new B(U7.d.e(name, desc));
            }
            if (!(signature instanceof d.a)) {
                throw new Sc.o();
            }
            d.a aVar = (d.a) signature;
            String name2 = aVar.e();
            String desc2 = aVar.d();
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(desc2, "desc");
            return new B(name2 + '#' + desc2);
        }
    }

    public B(String str) {
        this.f16738a = str;
    }

    @NotNull
    public final String a() {
        return this.f16738a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && Intrinsics.d(this.f16738a, ((B) obj).f16738a);
    }

    public final int hashCode() {
        return this.f16738a.hashCode();
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("MemberSignature(signature="), this.f16738a, ')');
    }
}
