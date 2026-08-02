package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n39#2,3:133\n47#2,28:136\n53#2,22:168\n106#2:190\n111#2:191\n116#2,6:192\n133#2,5:198\n143#2:203\n148#2,25:204\n188#2:229\n193#2,11:230\n198#2,6:241\n193#2,11:247\n198#2,6:258\n222#2,41:264\n267#2:305\n281#2:306\n286#2:307\n291#2:308\n296#2:309\n1563#3:164\n1634#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,41\n97#1:305\n104#1:306\n106#1:307\n108#1:308\n110#1:309\n47#1:164\n47#1:165,3\n*E\n"})
/* loaded from: classes5.dex */
public final class C implements Comparable<C> {
    public static final a Companion = new a();

    @JvmField
    public static final String b;
    public final C1193h a;

    public static final class a {
        @JvmStatic
        @JvmOverloads
        @JvmName(name = "get")
        public static C a(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C1193h c1193h = okio.internal.h.a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            C1190e c1190e = new C1190e();
            c1190e.k0(str);
            return okio.internal.h.d(c1190e, z);
        }

        public static C b(a aVar, File file) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(file, "<this>");
            String file2 = file.toString();
            Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
            return a(file2, false);
        }

        public static /* synthetic */ C c(a aVar, String str) {
            aVar.getClass();
            return a(str, false);
        }

        public static C d(a aVar, Path path) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(path, "<this>");
            return a(path.toString(), false);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        b = separator;
    }

    public C(C1193h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a2 = okio.internal.h.a(this);
        C1193h c1193h = this.a;
        if (a2 == -1) {
            a2 = 0;
        } else if (a2 < c1193h.d() && c1193h.i(a2) == 92) {
            a2++;
        }
        int d = c1193h.d();
        int i = a2;
        while (a2 < d) {
            if (c1193h.i(a2) == 47 || c1193h.i(a2) == 92) {
                arrayList.add(c1193h.o(i, a2));
                i = a2 + 1;
            }
            a2++;
        }
        if (i < c1193h.d()) {
            arrayList.add(c1193h.o(i, c1193h.d()));
        }
        return arrayList;
    }

    @JvmName(name = "name")
    public final String b() {
        C1193h c1193h = okio.internal.h.a;
        C1193h c1193h2 = this.a;
        int k = C1193h.k(c1193h2, c1193h);
        if (k == -1) {
            k = C1193h.k(c1193h2, okio.internal.h.b);
        }
        if (k != -1) {
            c1193h2 = C1193h.p(c1193h2, k + 1, 0, 2);
        } else if (g() != null && c1193h2.d() == 2) {
            c1193h2 = C1193h.d;
        }
        return c1193h2.r();
    }

    @JvmName(name = "parent")
    public final C c() {
        C1193h c1193h = okio.internal.h.d;
        C1193h c1193h2 = this.a;
        if (Intrinsics.areEqual(c1193h2, c1193h)) {
            return null;
        }
        C1193h c1193h3 = okio.internal.h.a;
        if (Intrinsics.areEqual(c1193h2, c1193h3)) {
            return null;
        }
        C1193h prefix = okio.internal.h.b;
        if (Intrinsics.areEqual(c1193h2, prefix)) {
            return null;
        }
        C1193h suffix = okio.internal.h.e;
        c1193h2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int d = c1193h2.d();
        byte[] bArr = suffix.a;
        if (c1193h2.l(d - bArr.length, suffix, bArr.length) && (c1193h2.d() == 2 || c1193h2.l(c1193h2.d() - 3, c1193h3, 1) || c1193h2.l(c1193h2.d() - 3, prefix, 1))) {
            return null;
        }
        int k = C1193h.k(c1193h2, c1193h3);
        if (k == -1) {
            k = C1193h.k(c1193h2, prefix);
        }
        if (k == 2 && g() != null) {
            if (c1193h2.d() == 3) {
                return null;
            }
            return new C(C1193h.p(c1193h2, 0, 3, 1));
        }
        if (k == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c1193h2.l(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (k != -1 || g() == null) {
            return k == -1 ? new C(c1193h) : k == 0 ? new C(C1193h.p(c1193h2, 0, 1, 1)) : new C(C1193h.p(c1193h2, 0, k, 1));
        }
        if (c1193h2.d() == 2) {
            return null;
        }
        return new C(C1193h.p(c1193h2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(C c) {
        C other = c;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.a.compareTo(other.a);
    }

    public final C d(C other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int a2 = okio.internal.h.a(this);
        C1193h c1193h = this.a;
        C c = a2 == -1 ? null : new C(c1193h.o(0, a2));
        other.getClass();
        C1193h c1193h2 = other.a;
        int a3 = okio.internal.h.a(other);
        if (!Intrinsics.areEqual(c, a3 != -1 ? new C(c1193h2.o(0, a3)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList a4 = a();
        ArrayList a5 = other.a();
        int min = Math.min(a4.size(), a5.size());
        int i = 0;
        while (i < min && Intrinsics.areEqual(a4.get(i), a5.get(i))) {
            i++;
        }
        if (i == min && c1193h.d() == c1193h2.d()) {
            Companion.getClass();
            return a.a(".", false);
        }
        if (a5.subList(i, a5.size()).indexOf(okio.internal.h.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.areEqual(c1193h2, okio.internal.h.d)) {
            return this;
        }
        C1190e c1190e = new C1190e();
        C1193h c2 = okio.internal.h.c(other);
        if (c2 == null && (c2 = okio.internal.h.c(this)) == null) {
            c2 = okio.internal.h.f(b);
        }
        int size = a5.size();
        for (int i2 = i; i2 < size; i2++) {
            c1190e.b0(okio.internal.h.e);
            c1190e.b0(c2);
        }
        int size2 = a4.size();
        while (i < size2) {
            c1190e.b0((C1193h) a4.get(i));
            c1190e.b0(c2);
            i++;
        }
        return okio.internal.h.d(c1190e, false);
    }

    @JvmName(name = "resolve")
    public final C e(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C1190e c1190e = new C1190e();
        c1190e.k0(child);
        return okio.internal.h.b(this, okio.internal.h.d(c1190e, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C) && Intrinsics.areEqual(((C) obj).a, this.a);
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.a.r(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @JvmName(name = "volumeLetter")
    public final Character g() {
        C1193h c1193h = okio.internal.h.a;
        C1193h c1193h2 = this.a;
        if (C1193h.g(c1193h2, c1193h) != -1 || c1193h2.d() < 2 || c1193h2.i(1) != 58) {
            return null;
        }
        char i = (char) c1193h2.i(0);
        if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
            return null;
        }
        return Character.valueOf(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.r());
    }

    public final String toString() {
        return this.a.r();
    }
}
