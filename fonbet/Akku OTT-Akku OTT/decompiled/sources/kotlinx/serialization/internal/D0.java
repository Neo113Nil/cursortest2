package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.n;

@PublishedApi
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n111#3,10:139\n11165#4:149\n11500#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
/* loaded from: classes5.dex */
public class D0 implements kotlinx.serialization.descriptors.f, InterfaceC1151n {
    public final String a;
    public final M<?> b;
    public final int c;
    public int d;
    public final String[] e;
    public final List<Annotation>[] f;
    public final boolean[] g;
    public Map<String, Integer> h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;

    public D0(String serialName, M<?> m, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.a = serialName;
        this.b = m;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.B0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                kotlinx.serialization.b<?>[] childSerializers;
                M<?> m2 = D0.this.b;
                return (m2 == null || (childSerializers = m2.childSerializers()) == null) ? F0.a : childSerializers;
            }
        });
        this.j = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                kotlinx.serialization.b<?>[] typeParametersSerializers;
                M<?> m2 = D0.this.b;
                if (m2 == null || (typeParametersSerializers = m2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (kotlinx.serialization.b<?> bVar : typeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                }
                return C1175z0.b(arrayList);
            }
        });
        this.k = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new androidx.work.impl.h(this, 1));
    }

    @Override // kotlinx.serialization.internal.InterfaceC1151n
    public final Set<String> a() {
        return this.h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.h.get(name);
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
        return this.e[i];
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof D0) {
            kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
            if (Intrinsics.areEqual(this.a, fVar.h()) && Arrays.equals((kotlinx.serialization.descriptors.f[]) this.j.getValue(), (kotlinx.serialization.descriptors.f[]) ((D0) obj).j.getValue())) {
                int d = fVar.d();
                int i2 = this.c;
                if (i2 == d) {
                    for (0; i < i2; i + 1) {
                        i = (Intrinsics.areEqual(g(i).h(), fVar.g(i).h()) && Intrinsics.areEqual(g(i).getKind(), fVar.g(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> f(int i) {
        List<Annotation> list = this.f[i];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i) {
        return ((kotlinx.serialization.b[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.m getKind() {
        return n.a.a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.f
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return false;
    }

    public final void j(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", androidx.compose.runtime.t.b('(', this.a, new StringBuilder()), ")", 0, null, new io.flutter.plugins.firebase.analytics.b(this, 1), 24, null);
        return joinToString$default;
    }
}
