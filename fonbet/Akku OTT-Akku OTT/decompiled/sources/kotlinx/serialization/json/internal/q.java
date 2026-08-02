package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.json.internal.C1185i;

@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n808#2,11:153\n13409#3,2:164\n1#4:166\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:153,11\n35#1:164,2\n*E\n"})
/* loaded from: classes5.dex */
public final class q {
    public static final C1185i.a<Map<String, Integer>> a = new C1185i.a<>();

    public static final int a(kotlinx.serialization.descriptors.f descriptor, kotlinx.serialization.json.b json, String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        kotlinx.serialization.json.f fVar = json.a;
        c(descriptor, json);
        int c = descriptor.c(name);
        if (c != -3 || !json.a.d) {
            return c;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        C1185i c1185i = json.c;
        p defaultValue = new p(descriptor, json);
        c1185i.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        C1185i.a<Map<String, Integer>> key = a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object value = c1185i.a(descriptor, key);
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = c1185i.a;
            Object obj = concurrentHashMap.get(descriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, obj);
            }
            ((Map) obj).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.json.b json, String name, String suffix) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int a2 = a(fVar, json, name);
        if (a2 != -3) {
            return a2;
        }
        throw new kotlinx.serialization.j(fVar.h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void c(kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.json.b json) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(fVar.getKind(), n.a.a)) {
            kotlinx.serialization.json.f fVar2 = json.a;
        }
    }
}
