package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.internal.C1173y0;
import kotlinx.serialization.internal.C1175z0;
import kotlinx.serialization.internal.O0;

@SourceDebugExtension({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,421:1\n78#2:422\n78#2:423\n78#2:430\n78#2:431\n1557#3:424\n1628#3,3:425\n1557#3:432\n1628#3,3:433\n1557#3:436\n1628#3,3:437\n78#4:428\n78#4:429\n37#5,2:440\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:422\n54#1:423\n232#1:430\n256#1:431\n190#1:424\n190#1:425,3\n267#1:432\n267#1:433,3\n269#1:436\n269#1:437,3\n223#1:428\n230#1:429\n334#1:440,2\n*E\n"})
/* loaded from: classes5.dex */
public final /* synthetic */ class r {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r6 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        r6 = r5.b(r0, kotlin.collections.CollectionsKt.emptyList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        if (r6 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b<Object> a(kotlinx.serialization.modules.d dVar, KType kType, boolean z) {
        int collectionSizeOrDefault;
        b<? extends Object> bVar;
        b<Object> bVar2;
        f fVar;
        b b;
        KClass<Object> clazz = C1175z0.c(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
        ArrayList types = new ArrayList(collectionSizeOrDefault);
        for (KTypeProjection kTypeProjection : arguments) {
            Intrinsics.checkNotNullParameter(kTypeProjection, "<this>");
            KType type = kTypeProjection.getType();
            if (type == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kTypeProjection.getType()).toString());
            }
            types.add(type);
        }
        if (types.isEmpty()) {
            if (C1173y0.c(clazz)) {
                b = dVar.b(clazz, CollectionsKt.emptyList());
            }
            O0<? extends Object> o0 = o.a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            bVar = !isMarkedNullable ? o.a.a(clazz) : o.b.a(clazz);
            if (bVar != null) {
                return bVar;
            }
            if (types.isEmpty()) {
                bVar2 = p.c(clazz);
                if (bVar2 == null && bVar2 == null) {
                    if (C1173y0.c(clazz)) {
                        fVar = new f(clazz);
                        bVar2 = fVar;
                    }
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    if (isMarkedNullable) {
                        return kotlinx.serialization.builtins.a.c(bVar2);
                    }
                    Intrinsics.checkNotNull(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
                    return bVar2;
                }
            } else {
                ArrayList d = p.d(dVar, types, z);
                if (d != null) {
                    b<Object> a = p.a(clazz, d, new q(types, 0));
                    if (a == null) {
                        bVar2 = dVar.b(clazz, d);
                        if (bVar2 == null) {
                            if (C1173y0.c(clazz)) {
                                fVar = new f(clazz);
                                bVar2 = fVar;
                            }
                            bVar2 = null;
                        }
                    } else {
                        bVar2 = a;
                    }
                    if (bVar2 != null) {
                    }
                }
            }
            return null;
        }
        if (!dVar.d()) {
            O0<? extends Object> o02 = o.a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(types, "types");
            Object a2 = !isMarkedNullable ? o.c.a(clazz, types) : o.d.a(clazz, types);
            if (Result.m1722isFailureimpl(a2)) {
                a2 = null;
            }
            bVar = (b) a2;
            if (bVar != null) {
            }
        }
        bVar = null;
        if (bVar != null) {
        }
    }
}
