package R4;

import G0.F;
import G0.P;
import Q4.AbstractC0149c;
import Q4.y;
import g4.AbstractC0476u;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2688a = new n();

    public static final i a(Number number, String str) {
        return new i("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str, -1)), 1);
    }

    public static final i b(int i2, String message, CharSequence input) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(input, "input");
        String message2 = message + "\nJSON input: " + ((Object) i(input, i2));
        kotlin.jvm.internal.i.e(message2, "message");
        if (i2 >= 0) {
            message2 = "Unexpected JSON token at offset " + i2 + ": " + message2;
        }
        return new i(message2, 0);
    }

    public static final void c(LinkedHashMap linkedHashMap, N4.e eVar, String str, int i2) {
        String str2 = kotlin.jvm.internal.i.a(eVar.c(), N4.i.f2189c) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.e(i2) + " is already one of the names for " + str2 + ' ' + eVar.e(((Number) AbstractC0476u.U(linkedHashMap, str)).intValue()) + " in " + eVar;
        kotlin.jvm.internal.i.e(message, "message");
        throw new l(message);
    }

    public static final N4.e d(N4.e eVar, W1.e module) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(module, "module");
        return (!kotlin.jvm.internal.i.a(eVar.c(), N4.i.f2188b) && eVar.isInline()) ? d(eVar.h(0), module) : eVar;
    }

    public static final byte e(char c2) {
        if (c2 < '~') {
            return d.f2679b[c2];
        }
        return (byte) 0;
    }

    public static final void f(AbstractC0149c json, F f3, M4.a aVar, y yVar) {
        kotlin.jvm.internal.i.e(json, "json");
        new s(json.f2501a.f2530e ? new g(f3, json) : new P(f3), json, w.f2727c, new s[w.f2732h.c()]).m(aVar, yVar);
    }

    public static final int g(N4.e eVar, AbstractC0149c json, String name) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(name, "name");
        Q4.j jVar = json.f2501a;
        n nVar = f2688a;
        B1.g gVar = json.f2503c;
        if (jVar.f2538m && kotlin.jvm.internal.i.a(eVar.c(), N4.i.f2189c)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            O.b bVar = new O.b(eVar, 1, json);
            gVar.getClass();
            Object h3 = gVar.h(eVar, nVar);
            if (h3 == null) {
                h3 = bVar.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gVar.f215b;
                Object obj = concurrentHashMap.get(eVar);
                if (obj == null) {
                    obj = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, obj);
                }
                ((Map) obj).put(nVar, h3);
            }
            Integer num = (Integer) ((Map) h3).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        j(eVar, json);
        int a6 = eVar.a(name);
        if (a6 != -3) {
            return a6;
        }
        if (!jVar.f2537l) {
            return a6;
        }
        O.b bVar2 = new O.b(eVar, 1, json);
        gVar.getClass();
        Object h6 = gVar.h(eVar, nVar);
        if (h6 == null) {
            h6 = bVar2.invoke();
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) gVar.f215b;
            Object obj2 = concurrentHashMap2.get(eVar);
            if (obj2 == null) {
                obj2 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(eVar, obj2);
            }
            ((Map) obj2).put(nVar, h6);
        }
        Integer num2 = (Integer) ((Map) h6).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final void h(u uVar, String entity) {
        kotlin.jvm.internal.i.e(entity, "entity");
        uVar.m(uVar.f2720b - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence i(CharSequence charSequence, int i2) {
        kotlin.jvm.internal.i.e(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i6 = i2 + 30;
        String str = i3 <= 0 ? "" : ".....";
        String str2 = i6 >= charSequence.length() ? "" : ".....";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (i6 > length2) {
            i6 = length2;
        }
        sb.append(charSequence.subSequence(i3, i6).toString());
        sb.append(str2);
        return sb.toString();
    }

    public static final void j(N4.e eVar, AbstractC0149c json) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.a(eVar.c(), N4.j.f2190b);
    }

    public static final w k(N4.e desc, AbstractC0149c abstractC0149c) {
        kotlin.jvm.internal.i.e(abstractC0149c, "<this>");
        kotlin.jvm.internal.i.e(desc, "desc");
        AbstractC1341c c2 = desc.c();
        if (c2 instanceof N4.b) {
            return w.f2730f;
        }
        if (kotlin.jvm.internal.i.a(c2, N4.j.f2191c)) {
            return w.f2728d;
        }
        if (!kotlin.jvm.internal.i.a(c2, N4.j.f2192d)) {
            return w.f2727c;
        }
        N4.e d6 = d(desc.h(0), abstractC0149c.f2502b);
        AbstractC1341c c6 = d6.c();
        if ((c6 instanceof N4.d) || kotlin.jvm.internal.i.a(c6, N4.i.f2189c)) {
            return w.f2729e;
        }
        if (abstractC0149c.f2501a.f2529d) {
            return w.f2728d;
        }
        throw new i("Value of type '" + d6.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + d6.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final void l(u uVar, Number number) {
        u.n(uVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String m(byte b6) {
        return b6 == 1 ? "quotation mark '\"'" : b6 == 2 ? "string escape sequence '\\'" : b6 == 4 ? "comma ','" : b6 == 5 ? "colon ':'" : b6 == 6 ? "start of the object '{'" : b6 == 7 ? "end of the object '}'" : b6 == 8 ? "start of the array '['" : b6 == 9 ? "end of the array ']'" : b6 == 10 ? "end of the input" : b6 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
