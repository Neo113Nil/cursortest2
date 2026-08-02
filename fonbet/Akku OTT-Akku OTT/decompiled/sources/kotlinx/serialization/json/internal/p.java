package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.m;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Function0 {
    public final /* synthetic */ kotlinx.serialization.descriptors.f a;
    public final /* synthetic */ kotlinx.serialization.json.b b;

    public /* synthetic */ p(kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.json.b bVar) {
        this.a = fVar;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlinx.serialization.json.b bVar = this.b;
        kotlinx.serialization.json.f fVar = bVar.a;
        kotlinx.serialization.descriptors.f fVar2 = this.a;
        q.c(fVar2, bVar);
        int d = fVar2.d();
        for (int i = 0; i < d; i++) {
            List<Annotation> f = fVar2.f(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj : f) {
                if (obj instanceof kotlinx.serialization.json.t) {
                    arrayList.add(obj);
                }
            }
            kotlinx.serialization.json.t tVar = (kotlinx.serialization.json.t) CollectionsKt.singleOrNull((List) arrayList);
            if (tVar != null && (names = tVar.names()) != null) {
                for (String str : names) {
                    String str2 = Intrinsics.areEqual(fVar2.getKind(), m.b.a) ? "enum value" : "property";
                    if (linkedHashMap.containsKey(str)) {
                        throw new n("The suggested name '" + str + "' for " + str2 + ' ' + fVar2.e(i) + " is already one of the names for " + str2 + ' ' + fVar2.e(((Number) MapsKt.getValue(linkedHashMap, str)).intValue()) + " in " + fVar2);
                    }
                    linkedHashMap.put(str, Integer.valueOf(i));
                }
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }
}
