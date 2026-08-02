package kotlinx.serialization.descriptors;

import androidx.compose.runtime.t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.C1175z0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.InterfaceC1151n;

@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,366:1\n37#2,2:367\n37#2,2:369\n1557#3:371\n1628#3,3:372\n16#4:375\n16#4:376\n16#4:377\n21#4:378\n111#5,10:379\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n336#1:367,2\n338#1:369,2\n340#1:371\n340#1:372,3\n344#1:375\n346#1:376\n347#1:377\n348#1:378\n351#1:379,10\n*E\n"})
/* loaded from: classes5.dex */
public final class i implements f, InterfaceC1151n {
    public final String a;
    public final m b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final f[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final f[] k;
    public final Lazy l;

    public i(String serialName, m kind, int i, List<? extends f> typeParameters, a builder) {
        HashSet hashSet;
        boolean[] booleanArray;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.a = serialName;
        this.b = kind;
        this.c = i;
        this.d = builder.b;
        ArrayList arrayList = builder.c;
        hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = C1175z0.b(builder.e);
        this.h = (List[]) builder.f.toArray(new List[0]);
        booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(builder.g);
        this.i = booleanArray;
        Iterable<IndexedValue> withIndex = ArraysKt.withIndex(strArr);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (IndexedValue indexedValue : withIndex) {
            arrayList2.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.j = MapsKt.toMap(arrayList2);
        this.k = C1175z0.b(typeParameters);
        this.l = LazyKt.lazy(new Function0() { // from class: kotlinx.serialization.descriptors.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                i iVar = i.this;
                return Integer.valueOf(E0.a(iVar, iVar.k));
            }
        });
    }

    @Override // kotlinx.serialization.internal.InterfaceC1151n
    public final Set<String> a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int d() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            f fVar = (f) obj;
            if (Intrinsics.areEqual(this.a, fVar.h()) && Arrays.equals(this.k, ((i) obj).k)) {
                int d = fVar.d();
                int i2 = this.c;
                if (i2 == d) {
                    for (0; i < i2; i + 1) {
                        f[] fVarArr = this.g;
                        i = (Intrinsics.areEqual(fVarArr[i].h(), fVar.g(i).h()) && Intrinsics.areEqual(fVarArr[i].getKind(), fVar.g(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final f g(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final m getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", t.b('(', this.a, new StringBuilder()), ")", 0, null, new Function1() { // from class: kotlinx.serialization.descriptors.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int intValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                i iVar = i.this;
                sb.append(iVar.f[intValue]);
                sb.append(": ");
                sb.append(iVar.g[intValue].h());
                return sb.toString();
            }
        }, 24, null);
        return joinToString$default;
    }
}
