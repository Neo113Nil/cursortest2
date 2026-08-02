package R9;

import B0.C2454a;
import B3.D;
import G.g;
import Ij.C3261b;
import S9.a;
import Sc.o;
import T9.d;
import T9.e;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final HashMap f24817c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24818d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<S9.c> f24819a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S9.d f24820b;

    private static final class a extends Stack<S9.b> {
        @Override // java.util.Stack
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S9.b push(S9.b bVar) {
            if (bVar != null) {
                return (S9.b) super.push(bVar);
            }
            removeAllElements();
            return null;
        }

        @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof S9.b) {
                return super.contains((S9.b) obj);
            }
            return false;
        }

        @Override // java.util.Vector, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof S9.b) {
                return super.indexOf((S9.b) obj);
            }
            return -1;
        }

        @Override // java.util.Vector, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof S9.b) {
                return super.lastIndexOf((S9.b) obj);
            }
            return -1;
        }

        @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof S9.b) {
                return super.remove((S9.b) obj);
            }
            return false;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final S9.a f24821a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f24822b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24823c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f24824d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String f24825e;

        public b(@NotNull S9.a formattedText, @NotNull String extractedValue, int i11, boolean z11, @NotNull String tailPlaceholder) {
            Intrinsics.checkNotNullParameter(formattedText, "formattedText");
            Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
            Intrinsics.checkNotNullParameter(tailPlaceholder, "tailPlaceholder");
            this.f24821a = formattedText;
            this.f24822b = extractedValue;
            this.f24823c = i11;
            this.f24824d = z11;
            this.f24825e = tailPlaceholder;
        }

        public final int a() {
            return this.f24823c;
        }

        @NotNull
        public final String b() {
            return this.f24822b;
        }

        @NotNull
        public final S9.a c() {
            return this.f24821a;
        }

        @NotNull
        public final String d() {
            return this.f24825e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f24821a, bVar.f24821a) && Intrinsics.d(this.f24822b, bVar.f24822b) && this.f24823c == bVar.f24823c && this.f24824d == bVar.f24824d && Intrinsics.d(this.f24825e, bVar.f24825e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int a11 = C2454a.a(this.f24823c, g.a(this.f24821a.hashCode() * 31, 31, this.f24822b), 31);
            boolean z11 = this.f24824d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return this.f24825e.hashCode() + ((a11 + i11) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Result(formattedText=");
            sb2.append(this.f24821a);
            sb2.append(", extractedValue=");
            sb2.append(this.f24822b);
            sb2.append(", affinity=");
            sb2.append(this.f24823c);
            sb2.append(", complete=");
            sb2.append(this.f24824d);
            sb2.append(", tailPlaceholder=");
            return D.c(sb2, this.f24825e, ')');
        }
    }

    public d(@NotNull String format, @NotNull List<S9.c> customNotations) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        this.f24819a = customNotations;
        this.f24820b = new c(customNotations).a(format);
    }

    private static String b(S9.d dVar, String str) {
        if (dVar == null || (dVar instanceof T9.a)) {
            return str;
        }
        if (dVar instanceof T9.b) {
            T9.b bVar = (T9.b) dVar;
            S9.d c11 = bVar.c();
            StringBuilder e11 = C3261b.e(str);
            e11.append(bVar.e());
            return b(c11, e11.toString());
        }
        if (dVar instanceof T9.c) {
            T9.c cVar = (T9.c) dVar;
            S9.d c12 = cVar.c();
            StringBuilder e12 = C3261b.e(str);
            e12.append(cVar.e());
            return b(c12, e12.toString());
        }
        if (dVar instanceof T9.d) {
            T9.d dVar2 = (T9.d) dVar;
            d.a e13 = dVar2.e();
            if (e13 instanceof d.a.C0534a) {
                return b(dVar2.c(), str + '-');
            }
            if (e13 instanceof d.a.c) {
                return b(dVar2.c(), str + 'a');
            }
            if (e13 instanceof d.a.C0535d) {
                return b(dVar2.c(), str + '0');
            }
            if (!(e13 instanceof d.a.b)) {
                throw new o();
            }
            S9.d c13 = dVar2.c();
            StringBuilder e14 = C3261b.e(str);
            e14.append(((d.a.b) dVar2.e()).a());
            return b(c13, e14.toString());
        }
        if (dVar instanceof e) {
            e eVar = (e) dVar;
            e.a e15 = eVar.e();
            if (e15 instanceof e.a.C0536a) {
                return b(eVar.c(), str + '-');
            }
            if (e15 instanceof e.a.d) {
                return b(eVar.c(), str + 'a');
            }
            if (e15 instanceof e.a.C0537e) {
                return b(eVar.c(), str + '0');
            }
            if (!(e15 instanceof e.a.c)) {
                if (!(e15 instanceof e.a.b)) {
                    throw new o();
                }
                S9.d c14 = eVar.c();
                StringBuilder e16 = C3261b.e(str);
                e16.append(((e.a.b) eVar.e()).a());
                return b(c14, e16.toString());
            }
        }
        return str;
    }

    private static boolean d(S9.d dVar) {
        if (dVar instanceof T9.a) {
            return true;
        }
        if (dVar instanceof e) {
            return ((e) dVar).f();
        }
        if (dVar instanceof T9.b) {
            return false;
        }
        return d(dVar.d());
    }

    @NotNull
    public b c(@NotNull S9.a text) {
        S9.b b11;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(text, "text");
        R9.b bVar = new R9.b(text);
        int b12 = text.b();
        a aVar = new a();
        boolean b13 = bVar.b();
        boolean a11 = bVar.a();
        Character c11 = bVar.c();
        String str = "";
        S9.d dVar = this.f24820b;
        int i11 = 0;
        String str2 = "";
        String str3 = str2;
        while (c11 != null) {
            S9.b a12 = dVar.a(c11.charValue());
            if (a12 != null) {
                if (a11) {
                    aVar.push(dVar.b());
                }
                dVar = a12.c();
                StringBuilder e11 = C3261b.e(str2);
                Object a13 = a12.a();
                if (a13 == null) {
                    a13 = "";
                }
                e11.append(a13);
                str2 = e11.toString();
                StringBuilder e12 = C3261b.e(str3);
                Object d11 = a12.d();
                if (d11 == null) {
                    d11 = "";
                }
                e12.append(d11);
                str3 = e12.toString();
                if (a12.b()) {
                    b13 = bVar.b();
                    a11 = bVar.a();
                    c11 = bVar.c();
                    i11++;
                } else if (b13 && a12.a() != null) {
                    b12++;
                }
            } else {
                if (a11) {
                    b12--;
                }
                b13 = bVar.b();
                a11 = bVar.a();
                c11 = bVar.c();
            }
            i11--;
        }
        while (true) {
            a.AbstractC0516a a14 = text.a();
            a14.getClass();
            if (!(a14 instanceof a.AbstractC0516a.b ? ((a.AbstractC0516a.b) a14).a() : false) || !b13 || (b11 = dVar.b()) == null) {
                break;
            }
            dVar = b11.c();
            StringBuilder e13 = C3261b.e(str2);
            Object a15 = b11.a();
            if (a15 == null) {
                a15 = "";
            }
            e13.append(a15);
            str2 = e13.toString();
            StringBuilder e14 = C3261b.e(str3);
            Object d12 = b11.d();
            if (d12 == null) {
                d12 = "";
            }
            e14.append(d12);
            str3 = e14.toString();
            if (b11.a() != null) {
                b12++;
            }
        }
        S9.d dVar2 = dVar;
        String str4 = str3;
        while (true) {
            a.AbstractC0516a a16 = text.a();
            a16.getClass();
            if (!(a16 instanceof a.AbstractC0516a.C0517a ? ((a.AbstractC0516a.C0517a) a16).a() : false) || aVar.empty()) {
                break;
            }
            S9.b pop = aVar.pop();
            Intrinsics.checkNotNullExpressionValue(pop, "autocompletionStack.pop()");
            S9.b bVar2 = pop;
            if (str2.length() == b12) {
                if (bVar2.a() != null) {
                    Character a17 = bVar2.a();
                    char M11 = h.M(str2);
                    if (a17 != null && a17.charValue() == M11) {
                        str2 = h.z(str2);
                        b12--;
                    }
                }
                if (bVar2.d() != null) {
                    Character d13 = bVar2.d();
                    char M12 = h.M(str4);
                    if (d13 != null && d13.charValue() == M12) {
                        str4 = h.z(str4);
                    }
                }
            } else if (bVar2.a() != null) {
                b12--;
            }
            S9.d c12 = bVar2.c();
            if (bVar2.a() != null) {
                str = bVar2.a().toString();
            }
            dVar2 = c12;
        }
        return new b(new S9.a(str2, b12, text.a()), str4, i11, d(dVar), b(dVar2, str));
    }

    public final int e() {
        int i11 = 0;
        for (S9.d dVar = this.f24820b; dVar != null && !(dVar instanceof T9.a); dVar = dVar.c()) {
            if ((dVar instanceof T9.b) || (dVar instanceof T9.c) || (dVar instanceof e) || (dVar instanceof T9.d)) {
                i11++;
            }
        }
        return i11;
    }

    public final int f() {
        int i11 = 0;
        for (S9.d dVar = this.f24820b; dVar != null && !(dVar instanceof T9.a); dVar = dVar.c()) {
            if ((dVar instanceof T9.b) || (dVar instanceof e) || (dVar instanceof T9.d)) {
                i11++;
            }
        }
        return i11;
    }
}
