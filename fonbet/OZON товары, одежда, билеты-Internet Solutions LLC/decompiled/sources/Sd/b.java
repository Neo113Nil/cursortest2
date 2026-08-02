package Sd;

import E0.C2942q;
import I0.C3173b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f26126a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f26127b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26128c;

    public static final class a {
        @NotNull
        public static b a(@NotNull String string, boolean z11) {
            String X9;
            Intrinsics.checkNotNullParameter(string, "string");
            int I11 = kotlin.text.h.I('`', 0, 6, string);
            if (I11 == -1) {
                I11 = string.length();
            }
            int f7 = kotlin.text.h.f(string, "/", I11, 4);
            String str = "";
            if (f7 == -1) {
                X9 = kotlin.text.h.X(string, "`", "", false);
            } else {
                String substring = string.substring(0, f7);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                String Y11 = kotlin.text.h.Y(substring, '/', '.');
                String substring2 = string.substring(f7 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                X9 = kotlin.text.h.X(substring2, "`", "", false);
                str = Y11;
            }
            return new b(new c(str), new c(X9), z11);
        }

        @NotNull
        public static b b(@NotNull c topLevelFqName) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            c e11 = topLevelFqName.e();
            return new b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
        }
    }

    public b(@NotNull c packageFqName, @NotNull c relativeClassName, boolean z11) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.f26126a = packageFqName;
        this.f26127b = relativeClassName;
        this.f26128c = z11;
        relativeClassName.d();
    }

    private static final String c(c cVar) {
        String b11 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return kotlin.text.h.u(b11, '/') ? C3173b.a('`', "`", b11) : b11;
    }

    @NotNull
    public final c a() {
        c cVar = this.f26126a;
        boolean d11 = cVar.d();
        c cVar2 = this.f26127b;
        if (d11) {
            return cVar2;
        }
        return new c(cVar.b() + '.' + cVar2.b());
    }

    @NotNull
    public final String b() {
        c cVar = this.f26126a;
        boolean d11 = cVar.d();
        c cVar2 = this.f26127b;
        if (d11) {
            return c(cVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        String b11 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        sb2.append(kotlin.text.h.Y(b11, '.', '/'));
        sb2.append("/");
        return C2942q.c(sb2, c(cVar2), "toString(...)");
    }

    @NotNull
    public final b d(@NotNull f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        c c11 = this.f26127b.c(name);
        Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
        return new b(this.f26126a, c11, this.f26128c);
    }

    public final b e() {
        c e11 = this.f26127b.e();
        Intrinsics.checkNotNullExpressionValue(e11, "parent(...)");
        if (e11.d()) {
            return null;
        }
        return new b(this.f26126a, e11, this.f26128c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f26126a, bVar.f26126a) && Intrinsics.d(this.f26127b, bVar.f26127b) && this.f26128c == bVar.f26128c;
    }

    @NotNull
    public final c f() {
        return this.f26126a;
    }

    @NotNull
    public final c g() {
        return this.f26127b;
    }

    @NotNull
    public final f h() {
        f g10 = this.f26127b.g();
        Intrinsics.checkNotNullExpressionValue(g10, "shortName(...)");
        return g10;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26128c) + ((this.f26127b.hashCode() + (this.f26126a.hashCode() * 31)) * 31);
    }

    public final boolean i() {
        return this.f26128c;
    }

    public final boolean j() {
        return !this.f26127b.e().d();
    }

    @NotNull
    public final String toString() {
        if (!this.f26126a.d()) {
            return b();
        }
        return "/" + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NotNull c packageFqName, @NotNull f topLevelName) {
        this(packageFqName, r3, false);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
        c k11 = c.k(topLevelName);
        Intrinsics.checkNotNullExpressionValue(k11, "topLevel(...)");
    }
}
