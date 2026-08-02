package Rd;

import C.o0;
import I0.C3173b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f25008a = C7714v.V(C7714v.b0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f25009b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List b02 = C7714v.b0("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int b11 = S8.b.b(0, b02.size() - 1, 2);
        if (b11 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f25008a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) b02.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb2.toString(), b02.get(i12));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(o0.c(sb3, (String) b02.get(i11), "Array"), "[" + ((String) b02.get(i12)));
                if (i11 == b11) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(f25008a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : C7714v.b0("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, Nk.a.b("java/lang/", str2), linkedHashMap);
        }
        for (String str3 : C7714v.b0("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(Nk.a.b("collections/", str3), Nk.a.b("java/util/", str3), linkedHashMap);
            a(Nk.a.b("collections/Mutable", str3), Nk.a.b("java/util/", str3), linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i13 = 0; i13 < 23; i13++) {
            String a11 = Ej.b.a(i13, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f25008a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i13);
            a(a11, sb4.toString(), linkedHashMap);
            a(Ej.b.a(i13, "reflect/KFunction"), U7.d.e(str4, "/reflect/KFunction"), linkedHashMap);
        }
        for (String str5 : C7714v.b0("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(U7.d.e(str5, ".Companion"), C3173b.c(new StringBuilder(), f25008a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f25009b = linkedHashMap;
    }

    private static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f25008a + '/' + str, "L" + str2 + ';');
    }

    @NotNull
    public static final String b(@NotNull String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = (String) f25009b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + kotlin.text.h.Y(classId, '.', '$') + ';';
    }
}
