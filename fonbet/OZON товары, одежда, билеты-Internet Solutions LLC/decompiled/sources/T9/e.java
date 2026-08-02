package T9;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class e extends S9.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f26917b;

    public static abstract class a {

        /* renamed from: T9.e$a$a, reason: collision with other inner class name */
        public static final class C0536a extends a {
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final char f26918a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final String f26919b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String characterSet, char c11) {
                super(0);
                Intrinsics.checkNotNullParameter(characterSet, "characterSet");
                this.f26918a = c11;
                this.f26919b = characterSet;
            }

            public final char a() {
                return this.f26918a;
            }

            @NotNull
            public final String b() {
                return this.f26919b;
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final a f26920a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull a inheritedType) {
                super(0);
                Intrinsics.checkNotNullParameter(inheritedType, "inheritedType");
                this.f26920a = inheritedType;
            }

            @NotNull
            public final a a() {
                return this.f26920a;
            }
        }

        public static final class d extends a {
        }

        /* renamed from: T9.e$a$e, reason: collision with other inner class name */
        public static final class C0537e extends a {
        }

        public a(int i11) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull a inheritedType) {
        super(null);
        Intrinsics.checkNotNullParameter(inheritedType, "inheritedType");
        this.f26917b = new a.c(inheritedType);
    }

    @Override // S9.d
    public final S9.b a(char c11) {
        boolean u11;
        a aVar = this.f26917b;
        if (aVar instanceof a.C0537e) {
            u11 = Character.isDigit(c11);
        } else if (aVar instanceof a.d) {
            u11 = Character.isLetter(c11);
        } else if (aVar instanceof a.C0536a) {
            u11 = Character.isLetterOrDigit(c11);
        } else if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            a a11 = cVar.a();
            u11 = a11 instanceof a.C0537e ? Character.isDigit(c11) : a11 instanceof a.d ? Character.isLetter(c11) : a11 instanceof a.C0536a ? Character.isLetterOrDigit(c11) : a11 instanceof a.b ? h.u(((a.b) cVar.a()).b(), c11) : false;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new o();
            }
            u11 = h.u(((a.b) aVar).b(), c11);
        }
        if (u11) {
            return new S9.b(d(), Character.valueOf(c11), true, Character.valueOf(c11));
        }
        return null;
    }

    @Override // S9.d
    @NotNull
    public final S9.d d() {
        return this.f26917b instanceof a.c ? this : super.d();
    }

    @NotNull
    public final a e() {
        return this.f26917b;
    }

    public final boolean f() {
        return this.f26917b instanceof a.c;
    }

    @Override // S9.d
    @NotNull
    public final String toString() {
        a aVar = this.f26917b;
        if (aVar instanceof a.d) {
            StringBuilder sb2 = new StringBuilder("[A] -> ");
            sb2.append(c() != null ? c().toString() : "null");
            return sb2.toString();
        }
        if (aVar instanceof a.C0537e) {
            StringBuilder sb3 = new StringBuilder("[0] -> ");
            sb3.append(c() != null ? c().toString() : "null");
            return sb3.toString();
        }
        if (aVar instanceof a.C0536a) {
            StringBuilder sb4 = new StringBuilder("[_] -> ");
            sb4.append(c() != null ? c().toString() : "null");
            return sb4.toString();
        }
        if (aVar instanceof a.c) {
            StringBuilder sb5 = new StringBuilder("[…] -> ");
            sb5.append(c() != null ? c().toString() : "null");
            return sb5.toString();
        }
        if (!(aVar instanceof a.b)) {
            throw new o();
        }
        StringBuilder sb6 = new StringBuilder("[");
        sb6.append(((a.b) aVar).a());
        sb6.append("] -> ");
        sb6.append(c() != null ? c().toString() : "null");
        return sb6.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(S9.d dVar, @NotNull a type) {
        super(dVar);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f26917b = type;
    }
}
