package Rd;

import Qd.C3856a;
import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class g implements Pd.c {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<String> f25018d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f25019a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f25020b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f25021c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25022a;

        static {
            int[] iArr = new int[C3856a.d.c.EnumC0468c.values().length];
            try {
                iArr[C3856a.d.c.EnumC0468c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3856a.d.c.EnumC0468c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3856a.d.c.EnumC0468c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25022a = iArr;
        }
    }

    static {
        String V11 = C7714v.V(C7714v.b0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> b02 = C7714v.b0(U7.d.e(V11, "/Any"), U7.d.e(V11, "/Nothing"), U7.d.e(V11, "/Unit"), U7.d.e(V11, "/Throwable"), U7.d.e(V11, "/Number"), U7.d.e(V11, "/Byte"), U7.d.e(V11, "/Double"), U7.d.e(V11, "/Float"), U7.d.e(V11, "/Int"), U7.d.e(V11, "/Long"), U7.d.e(V11, "/Short"), U7.d.e(V11, "/Boolean"), U7.d.e(V11, "/Char"), U7.d.e(V11, "/CharSequence"), U7.d.e(V11, "/String"), U7.d.e(V11, "/Comparable"), U7.d.e(V11, "/Enum"), U7.d.e(V11, "/Array"), U7.d.e(V11, "/ByteArray"), U7.d.e(V11, "/DoubleArray"), U7.d.e(V11, "/FloatArray"), U7.d.e(V11, "/IntArray"), U7.d.e(V11, "/LongArray"), U7.d.e(V11, "/ShortArray"), U7.d.e(V11, "/BooleanArray"), U7.d.e(V11, "/CharArray"), U7.d.e(V11, "/Cloneable"), U7.d.e(V11, "/Annotation"), U7.d.e(V11, "/collections/Iterable"), U7.d.e(V11, "/collections/MutableIterable"), U7.d.e(V11, "/collections/Collection"), U7.d.e(V11, "/collections/MutableCollection"), U7.d.e(V11, "/collections/List"), U7.d.e(V11, "/collections/MutableList"), U7.d.e(V11, "/collections/Set"), U7.d.e(V11, "/collections/MutableSet"), U7.d.e(V11, "/collections/Map"), U7.d.e(V11, "/collections/MutableMap"), U7.d.e(V11, "/collections/Map.Entry"), U7.d.e(V11, "/collections/MutableMap.MutableEntry"), U7.d.e(V11, "/collections/Iterator"), U7.d.e(V11, "/collections/MutableIterator"), U7.d.e(V11, "/collections/ListIterator"), U7.d.e(V11, "/collections/MutableListIterator"));
        f25018d = b02;
        O a12 = C7714v.a1(b02);
        int h11 = U.h(C7714v.z(a12, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = a12.iterator();
        while (true) {
            P p11 = (P) it;
            if (!p11.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) p11.next();
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
    }

    public g(@NotNull String[] strings, @NotNull Set localNameIndices, @NotNull ArrayList records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.f25019a = strings;
        this.f25020b = localNameIndices;
        this.f25021c = records;
    }

    @Override // Pd.c
    @NotNull
    public final String a(int i11) {
        return getString(i11);
    }

    @Override // Pd.c
    public final boolean b(int i11) {
        return this.f25020b.contains(Integer.valueOf(i11));
    }

    @Override // Pd.c
    @NotNull
    public final String getString(int i11) {
        String str;
        C3856a.d.c cVar = (C3856a.d.c) this.f25021c.get(i11);
        if (cVar.J()) {
            str = cVar.D();
        } else {
            if (cVar.H()) {
                List<String> list = f25018d;
                int size = list.size();
                int y11 = cVar.y();
                if (y11 >= 0 && y11 < size) {
                    str = list.get(cVar.y());
                }
            }
            str = this.f25019a[i11];
        }
        if (cVar.E() >= 2) {
            List<Integer> F11 = cVar.F();
            Intrinsics.f(F11);
            Integer num = F11.get(0);
            Integer num2 = F11.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= str.length()) {
                str = str.substring(num.intValue(), num2.intValue());
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
        }
        if (cVar.B() >= 2) {
            List<Integer> C11 = cVar.C();
            Intrinsics.f(C11);
            Integer num3 = C11.get(0);
            Integer num4 = C11.get(1);
            Intrinsics.f(str);
            str = kotlin.text.h.Y(str, (char) num3.intValue(), (char) num4.intValue());
        }
        C3856a.d.c.EnumC0468c v11 = cVar.v();
        if (v11 == null) {
            v11 = C3856a.d.c.EnumC0468c.NONE;
        }
        int i12 = a.f25022a[v11.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                Intrinsics.f(str);
                str = kotlin.text.h.Y(str, '$', '.');
            } else {
                if (i12 != 3) {
                    throw new o();
                }
                if (str.length() >= 2) {
                    str = str.substring(1, str.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                Intrinsics.f(str);
                str = kotlin.text.h.Y(str, '$', '.');
            }
        }
        Intrinsics.f(str);
        return str;
    }
}
