package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.internal.C1130c0;
import kotlinx.serialization.internal.C1135f;
import kotlinx.serialization.internal.C1142i0;
import kotlinx.serialization.internal.C1167v0;
import kotlinx.serialization.internal.C1173y0;
import kotlinx.serialization.internal.C1175z0;
import kotlinx.serialization.internal.K0;
import kotlinx.serialization.internal.O;
import kotlinx.serialization.internal.Q;
import kotlinx.serialization.internal.U0;

/* loaded from: classes5.dex */
public final class p {
    public static final b a(KClass rootClass, ArrayList serializers, Function0 elementClassifierIfArray) {
        b c1135f;
        b c1167v0;
        Intrinsics.checkNotNullParameter(rootClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            c1135f = new C1135f((b) serializers.get(0));
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            c1135f = new Q((b) serializers.get(0));
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            c1135f = new C1130c0((b) serializers.get(0));
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            c1135f = new O((b) serializers.get(0), (b) serializers.get(1));
        } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            c1135f = new C1126a0((b) serializers.get(0), (b) serializers.get(1));
        } else {
            if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
                b keySerializer = (b) serializers.get(0);
                b valueSerializer = (b) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                c1167v0 = new C1142i0(keySerializer, valueSerializer);
            } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                b keySerializer2 = (b) serializers.get(0);
                b valueSerializer2 = (b) serializers.get(1);
                Intrinsics.checkNotNullParameter(keySerializer2, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer2, "valueSerializer");
                c1167v0 = new C1167v0(keySerializer2, valueSerializer2);
            } else if (Intrinsics.areEqual(rootClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
                b aSerializer = (b) serializers.get(0);
                b bSerializer = (b) serializers.get(1);
                b cSerializer = (b) serializers.get(2);
                Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
                Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
                Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
                c1135f = new U0(aSerializer, bSerializer, cSerializer);
            } else {
                Intrinsics.checkNotNullParameter(rootClass, "rootClass");
                if (JvmClassMappingKt.getJavaClass(rootClass).isArray()) {
                    Object invoke = elementClassifierIfArray.invoke();
                    Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    c1135f = kotlinx.serialization.builtins.a.a((KClass) invoke, (b) serializers.get(0));
                } else {
                    c1135f = null;
                }
            }
            c1135f = c1167v0;
        }
        if (c1135f != null) {
            return c1135f;
        }
        b[] bVarArr = (b[]) serializers.toArray(new b[0]);
        return C1173y0.a(rootClass, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final b<Object> b(kotlinx.serialization.modules.d dVar, KType type) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        b<Object> a = r.a(dVar, type, true);
        if (a != null) {
            return a;
        }
        KClass<Object> c = C1175z0.c(type);
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(c, "<this>");
        String className = c.getSimpleName();
        if (className == null) {
            className = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(className, "className");
        throw new j("Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final <T> b<T> c(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        b<T> a = C1173y0.a(kClass, new b[0]);
        if (a != null) {
            return a;
        }
        Map<KClass<?>, b<?>> map = K0.a;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (b) K0.a.get(kClass);
    }

    public static final ArrayList d(kotlinx.serialization.modules.d dVar, List typeArguments, boolean z) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeArguments, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(b(dVar, (KType) it.next()));
            }
            return arrayList;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeArguments, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            KType type = (KType) it2.next();
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            b<Object> a = r.a(dVar, type, false);
            if (a == null) {
                return null;
            }
            arrayList2.add(a);
        }
        return arrayList2;
    }
}
