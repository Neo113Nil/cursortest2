package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;

@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3,2:192\n1797#4,3:194\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192,2\n160#1:194,3\n*E\n"})
/* renamed from: kotlinx.serialization.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1175z0 {
    public static final kotlinx.serialization.descriptors.f[] a = new kotlinx.serialization.descriptors.f[0];

    public static final Set<String> a(kotlinx.serialization.descriptors.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof InterfaceC1151n) {
            return ((InterfaceC1151n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d = fVar.d();
        for (int i = 0; i < d; i++) {
            hashSet.add(fVar.e(i));
        }
        return hashSet;
    }

    public static final kotlinx.serialization.descriptors.f[] b(List<? extends kotlinx.serialization.descriptors.f> list) {
        kotlinx.serialization.descriptors.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (kotlinx.serialization.descriptors.f[]) list.toArray(new kotlinx.serialization.descriptors.f[0])) == null) ? a : fVarArr;
    }

    public static final KClass<Object> c(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }
}
