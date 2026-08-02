package We;

import gd.InterfaceC6712a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.T;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class z implements Iterable<Pair<? extends String, ? extends String>>, InterfaceC6712a {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33821b = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String[] f33822a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f33823a = new ArrayList(20);

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = z.f33821b;
            b.a(bVar, name);
            b.b(bVar, value, name);
            c(name, value);
        }

        @NotNull
        public final void b(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int I11 = kotlin.text.h.I(':', 1, 4, line);
            if (I11 != -1) {
                String substring = line.substring(0, I11);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(I11 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
                return;
            }
            if (line.charAt(0) != ':') {
                c("", line);
                return;
            }
            String substring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
            c("", substring3);
        }

        @NotNull
        public final void c(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f33823a;
            arrayList.add(name);
            arrayList.add(kotlin.text.h.z0(value).toString());
        }

        @NotNull
        public final void d(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b.a(z.f33821b, name);
            c(name, value);
        }

        @NotNull
        public final z e() {
            Object[] array = this.f33823a.toArray(new String[0]);
            if (array != null) {
                return new z((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final String f(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = this.f33823a;
            kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j(arrayList.size() - 2, 0), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if (f71844c >= 0) {
                if (f71842a > f71843b) {
                    return null;
                }
            } else if (f71842a < f71843b) {
                return null;
            }
            while (!kotlin.text.h.D(name, (String) arrayList.get(f71842a), true)) {
                if (f71842a == f71843b) {
                    return null;
                }
                f71842a += f71844c;
            }
            return (String) arrayList.get(f71842a + 1);
        }

        @NotNull
        public final ArrayList g() {
            return this.f33823a;
        }

        @NotNull
        public final void h(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f33823a;
                if (i11 >= arrayList.size()) {
                    return;
                }
                if (kotlin.text.h.D(name, (String) arrayList.get(i11), true)) {
                    arrayList.remove(i11);
                    arrayList.remove(i11);
                    i11 -= 2;
                }
                i11 += 2;
            }
        }
    }

    public static final class b {
        public static final /* synthetic */ void a(b bVar, String str) {
            bVar.getClass();
            c(str);
        }

        public static final /* synthetic */ void b(b bVar, String str, String str2) {
            bVar.getClass();
            d(str, str2);
        }

        private static void c(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if ('!' > charAt || '~' < charAt) {
                    throw new IllegalArgumentException(Ye.b.k("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str).toString());
                }
            }
        }

        private static void d(String str, String str2) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt != '\t' && (' ' > charAt || '~' < charAt)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Ye.b.k("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i11), str2));
                    sb2.append(Ye.b.s(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        @NotNull
        public static z e(@NotNull LinkedHashMap toHeaders) {
            Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i11 = 0;
            for (Map.Entry entry : toHeaders.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj = kotlin.text.h.z0(str).toString();
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                String obj2 = kotlin.text.h.z0(str2).toString();
                c(obj);
                d(obj2, obj);
                strArr[i11] = obj;
                strArr[i11 + 1] = obj2;
                i11 += 2;
            }
            return new z(strArr);
        }

        @NotNull
        public static z f(@NotNull String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            Object clone = namesAndValues.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) clone;
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i11] = kotlin.text.h.z0(str).toString();
            }
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            Intrinsics.checkNotNullParameter(strArr, "<this>");
            kotlin.ranges.e m11 = kotlin.ranges.h.m(new IntRange(0, strArr.length - 1, 1), 2);
            int f71842a = m11.getF71842a();
            int f71843b = m11.getF71843b();
            int f71844c = m11.getF71844c();
            if (f71844c < 0 ? f71842a >= f71843b : f71842a <= f71843b) {
                while (true) {
                    String str2 = strArr[f71842a];
                    String str3 = strArr[f71842a + 1];
                    c(str2);
                    d(str3, str2);
                    if (f71842a == f71843b) {
                        break;
                    }
                    f71842a += f71844c;
                }
            }
            return new z(strArr);
        }
    }

    public z(String[] strArr) {
        this.f33822a = strArr;
    }

    public final long b() {
        String[] strArr = this.f33822a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        return length;
    }

    public final String c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f33821b.getClass();
        String[] strArr = this.f33822a;
        kotlin.ranges.e m11 = kotlin.ranges.h.m(kotlin.ranges.h.j(strArr.length - 2, 0), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        if (f71844c >= 0) {
            if (f71842a > f71843b) {
                return null;
            }
        } else if (f71842a < f71843b) {
            return null;
        }
        while (!kotlin.text.h.D(name, strArr[f71842a], true)) {
            if (f71842a == f71843b) {
                return null;
            }
            f71842a += f71844c;
        }
        return strArr[f71842a + 1];
    }

    @NotNull
    public final String e(int i11) {
        return this.f33822a[i11 * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return Arrays.equals(this.f33822a, ((z) obj).f33822a);
        }
        return false;
    }

    @NotNull
    public final a h() {
        a aVar = new a();
        C7714v.r(aVar.g(), this.f33822a);
        return aVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33822a);
    }

    @NotNull
    public final TreeMap i() {
        Intrinsics.checkNotNullParameter(T.f71792a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String e11 = e(i11);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            if (e11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = e11.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(k(i11));
        }
        return treeMap;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i11 = 0; i11 < size; i11++) {
            pairArr[i11] = new Pair(e(i11), k(i11));
        }
        return C7721c.a(pairArr);
    }

    @NotNull
    public final String k(int i11) {
        return this.f33822a[(i11 * 2) + 1];
    }

    @NotNull
    public final List<String> l(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            if (kotlin.text.h.D(name, e(i11), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i11));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.K.f71697a;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.f33822a.length / 2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String e11 = e(i11);
            String k11 = k(i11);
            sb2.append(e11);
            sb2.append(": ");
            if (Ye.b.s(e11)) {
                k11 = "██";
            }
            sb2.append(k11);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
