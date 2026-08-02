package L4;

import B90.C2618u;
import C.o0;
import G.g;
import J4.n;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f16531a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f16532b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbstractSet f16533c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f16534d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f16535a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f16536b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16537c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16538d;

        /* renamed from: e, reason: collision with root package name */
        public final String f16539e;

        /* renamed from: f, reason: collision with root package name */
        public final int f16540f;

        /* renamed from: g, reason: collision with root package name */
        public final int f16541g;

        /* renamed from: L4.e$a$a, reason: collision with other inner class name */
        public static final class C0313a {
            public static boolean a(@NotNull String current, String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.d(current, str)) {
                    return true;
                }
                if (current.length() != 0) {
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i11 < current.length()) {
                            char charAt = current.charAt(i11);
                            int i14 = i13 + 1;
                            if (i13 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt != '(') {
                                if (charAt == ')' && i12 - 1 == 0 && i13 != current.length() - 1) {
                                    break;
                                }
                            } else {
                                i12++;
                            }
                            i11++;
                            i13 = i14;
                        } else if (i12 == 0) {
                            String substring = current.substring(1, current.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            return Intrinsics.d(h.z0(substring).toString(), str);
                        }
                    }
                }
                return false;
            }
        }

        public a(@NotNull String name, @NotNull String type, int i11, int i12, boolean z11, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f16535a = name;
            this.f16536b = type;
            this.f16537c = z11;
            this.f16538d = i11;
            this.f16539e = str;
            this.f16540f = i12;
            int i13 = 5;
            if (type != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = type.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (h.t(upperCase, "INT", false)) {
                    i13 = 3;
                } else if (h.t(upperCase, "CHAR", false) || h.t(upperCase, "CLOB", false) || h.t(upperCase, "TEXT", false)) {
                    i13 = 2;
                } else if (!h.t(upperCase, "BLOB", false)) {
                    i13 = (h.t(upperCase, "REAL", false) || h.t(upperCase, "FLOA", false) || h.t(upperCase, "DOUB", false)) ? 4 : 1;
                }
            }
            this.f16541g = i13;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (this.f16538d != aVar.f16538d) {
                    return false;
                }
                if (!Intrinsics.d(this.f16535a, aVar.f16535a) || this.f16537c != aVar.f16537c) {
                    return false;
                }
                int i11 = aVar.f16540f;
                String str = aVar.f16539e;
                String str2 = this.f16539e;
                int i12 = this.f16540f;
                if (i12 == 1 && i11 == 2 && str2 != null && !C0313a.a(str2, str)) {
                    return false;
                }
                if (i12 == 2 && i11 == 1 && str != null && !C0313a.a(str, str2)) {
                    return false;
                }
                if (i12 != 0 && i12 == i11) {
                    if (str2 != null) {
                        if (!C0313a.a(str2, str)) {
                            return false;
                        }
                    } else if (str != null) {
                        return false;
                    }
                }
                if (this.f16541g != aVar.f16541g) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f16535a.hashCode() * 31) + this.f16541g) * 31) + (this.f16537c ? 1231 : 1237)) * 31) + this.f16538d;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.f16535a);
            sb2.append("', type='");
            sb2.append(this.f16536b);
            sb2.append("', affinity='");
            sb2.append(this.f16541g);
            sb2.append("', notNull=");
            sb2.append(this.f16537c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f16538d);
            sb2.append(", defaultValue='");
            String str = this.f16539e;
            if (str == null) {
                str = "undefined";
            }
            return o0.c(sb2, str, "'}");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f16542a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f16543b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f16544c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<String> f16545d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        public final List<String> f16546e;

        public b(@NotNull String referenceTable, @NotNull List columnNames, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f16542a = referenceTable;
            this.f16543b = onDelete;
            this.f16544c = onUpdate;
            this.f16545d = columnNames;
            this.f16546e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.d(this.f16542a, bVar.f16542a) && Intrinsics.d(this.f16543b, bVar.f16543b) && Intrinsics.d(this.f16544c, bVar.f16544c) && Intrinsics.d(this.f16545d, bVar.f16545d)) {
                return Intrinsics.d(this.f16546e, bVar.f16546e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16546e.hashCode() + g.b(g.a(g.a(this.f16542a.hashCode() * 31, 31, this.f16543b), 31, this.f16544c), 31, this.f16545d);
        }

        @NotNull
        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f16542a + "', onDelete='" + this.f16543b + " +', onUpdate='" + this.f16544c + "', columnNames=" + this.f16545d + ", referenceColumnNames=" + this.f16546e + '}';
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        private final int f16547a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16548b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f16549c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f16550d;

        public c(int i11, int i12, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.f16547a = i11;
            this.f16548b = i12;
            this.f16549c = from;
            this.f16550d = to;
        }

        @NotNull
        public final String a() {
            return this.f16549c;
        }

        public final int b() {
            return this.f16547a;
        }

        @NotNull
        public final String c() {
            return this.f16550d;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c other = cVar;
            Intrinsics.checkNotNullParameter(other, "other");
            int i11 = this.f16547a - other.f16547a;
            return i11 == 0 ? this.f16548b - other.f16548b : i11;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f16551a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16552b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<String> f16553c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        public List<String> f16554d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public d(@NotNull List columns, boolean z11, @NotNull String name, @NotNull List orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.f16551a = name;
            this.f16552b = z11;
            this.f16553c = columns;
            this.f16554d = orders;
            List list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    list.add(n.ASC.name());
                }
            }
            this.f16554d = (List) list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f16552b == dVar.f16552b && Intrinsics.d(this.f16553c, dVar.f16553c) && Intrinsics.d(this.f16554d, dVar.f16554d)) {
                    String str = this.f16551a;
                    boolean e02 = h.e0(str, "index_", false);
                    String str2 = dVar.f16551a;
                    return e02 ? h.e0(str2, "index_", false) : str.equals(str2);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f16551a;
            return this.f16554d.hashCode() + g.b((((h.e0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f16552b ? 1 : 0)) * 31, 31, this.f16553c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Index{name='");
            sb2.append(this.f16551a);
            sb2.append("', unique=");
            sb2.append(this.f16552b);
            sb2.append(", columns=");
            sb2.append(this.f16553c);
            sb2.append(", orders=");
            return C2618u.h(sb2, this.f16554d, "'}");
        }
    }

    public e(@NotNull String name, @NotNull Map columns, @NotNull AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f16531a = name;
        this.f16532b = columns;
        this.f16533c = foreignKeys;
        this.f16534d = abstractSet;
    }

    @NotNull
    public static final e a(@NotNull O4.b database, @NotNull String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return f.c(database, tableName);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f16531a.equals(eVar.f16531a) || !this.f16532b.equals(eVar.f16532b) || !Intrinsics.d(this.f16533c, eVar.f16533c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f16534d;
        if (abstractSet2 == null || (abstractSet = eVar.f16534d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f16533c.hashCode() + H00.a.c(this.f16531a.hashCode() * 31, 31, this.f16532b);
    }

    @NotNull
    public final String toString() {
        return "TableInfo{name='" + this.f16531a + "', columns=" + this.f16532b + ", foreignKeys=" + this.f16533c + ", indices=" + this.f16534d + '}';
    }
}
