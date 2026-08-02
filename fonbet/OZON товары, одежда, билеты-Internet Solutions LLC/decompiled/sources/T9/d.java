package T9;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d extends S9.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f26916b;

    public static abstract class a {

        /* renamed from: T9.d$a$a, reason: collision with other inner class name */
        public static final class C0534a extends a {
        }

        public static final class b extends a {
            public final char a() {
                return (char) 0;
            }
        }

        public static final class c extends a {
        }

        /* renamed from: T9.d$a$d, reason: collision with other inner class name */
        public static final class C0535d extends a {
        }

        public a(int i11) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull S9.d child, @NotNull a type) {
        super(child);
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f26916b = type;
    }

    @Override // S9.d
    public final S9.b a(char c11) {
        boolean u11;
        a aVar = this.f26916b;
        if (aVar instanceof a.C0535d) {
            u11 = Character.isDigit(c11);
        } else if (aVar instanceof a.c) {
            u11 = Character.isLetter(c11);
        } else if (aVar instanceof a.C0534a) {
            u11 = Character.isLetterOrDigit(c11);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new o();
            }
            ((a.b) aVar).getClass();
            u11 = h.u(null, c11);
        }
        return u11 ? new S9.b(d(), Character.valueOf(c11), true, Character.valueOf(c11)) : new S9.b(d(), null, false, null);
    }

    @NotNull
    public final a e() {
        return this.f26916b;
    }

    @Override // S9.d
    @NotNull
    public final String toString() {
        a aVar = this.f26916b;
        if (aVar instanceof a.c) {
            StringBuilder sb2 = new StringBuilder("[a] -> ");
            sb2.append(c() != null ? c().toString() : "null");
            return sb2.toString();
        }
        if (aVar instanceof a.C0535d) {
            StringBuilder sb3 = new StringBuilder("[9] -> ");
            sb3.append(c() != null ? c().toString() : "null");
            return sb3.toString();
        }
        if (aVar instanceof a.C0534a) {
            StringBuilder sb4 = new StringBuilder("[-] -> ");
            sb4.append(c() != null ? c().toString() : "null");
            return sb4.toString();
        }
        if (!(aVar instanceof a.b)) {
            throw new o();
        }
        StringBuilder sb5 = new StringBuilder("[");
        sb5.append(((a.b) aVar).a());
        sb5.append("] -> ");
        sb5.append(c() != null ? c().toString() : "null");
        return sb5.toString();
    }
}
