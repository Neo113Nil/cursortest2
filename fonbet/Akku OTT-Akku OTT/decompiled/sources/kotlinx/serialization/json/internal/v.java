package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.C1175z0;
import kotlinx.serialization.json.internal.C1185i;

@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n+ 2 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 3 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 6 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,334:1\n125#2,22:335\n147#2,4:358\n131#3:357\n1#4:362\n74#5:363\n271#6,8:364\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonTreeDecoder\n*L\n200#1:335,22\n200#1:358,4\n200#1:357\n262#1:363\n262#1:364,8\n*E\n"})
/* loaded from: classes5.dex */
public class v extends AbstractC1177a {
    public final kotlinx.serialization.json.x f;
    public final kotlinx.serialization.descriptors.f g;
    public int h;
    public boolean i;

    public /* synthetic */ v(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.x xVar, String str, int i) {
        this(bVar, xVar, (i & 4) != 0 ? null : str, (kotlinx.serialization.descriptors.f) null);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a, kotlinx.serialization.encoding.e
    public final kotlinx.serialization.encoding.c beginStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.descriptors.f fVar = this.g;
        if (descriptor != fVar) {
            return super.beginStructure(descriptor);
        }
        kotlinx.serialization.json.h s = s();
        String h = fVar.h();
        if (s instanceof kotlinx.serialization.json.x) {
            return new v(this.c, (kotlinx.serialization.json.x) s, this.d, fVar);
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.x.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(s.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + q(), s.toString(), -1);
    }

    @Override // kotlinx.serialization.encoding.c
    public int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.h < descriptor.d()) {
            int i = this.h;
            this.h = i + 1;
            String n = n(descriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!t().containsKey(n)) {
                boolean z = (this.c.a.a || descriptor.i(i2) || !descriptor.g(i2).b()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a, kotlinx.serialization.encoding.e
    public final boolean decodeNotNullMark() {
        return !this.i && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a, kotlinx.serialization.encoding.c
    public void endStructure(kotlinx.serialization.descriptors.f descriptor) {
        Set<String> plus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.f fVar = this.e;
        fVar.getClass();
        if (descriptor.getKind() instanceof kotlinx.serialization.descriptors.d) {
            return;
        }
        kotlinx.serialization.json.b bVar = this.c;
        q.c(descriptor, bVar);
        if (fVar.d) {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            Set<String> a = C1175z0.a(descriptor);
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Map map = (Map) bVar.c.a(descriptor, q.a);
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = SetsKt.emptySet();
            }
            plus = SetsKt.plus((Set) a, (Iterable) keySet);
        } else {
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            plus = C1175z0.a(descriptor);
        }
        for (String key : t().a.keySet()) {
            if (!plus.contains(key) && !Intrinsics.areEqual(key, this.d)) {
                String input = t().toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(input, "input");
                StringBuilder a2 = androidx.appcompat.view.a.a("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                a2.append((Object) o.g(input, -1));
                throw o.d(-1, a2.toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public String m(kotlinx.serialization.descriptors.f descriptor, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.c;
        q.c(descriptor, bVar);
        String e = descriptor.e(i);
        if (this.e.d && !t().a.keySet().contains(e)) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            C1185i c1185i = bVar.c;
            p defaultValue = new p(descriptor, bVar);
            c1185i.getClass();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            C1185i.a<Map<String, Integer>> key = q.a;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Object value = c1185i.a(descriptor, key);
            if (value == null) {
                value = defaultValue.invoke();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ConcurrentHashMap concurrentHashMap = c1185i.a;
                Object obj2 = concurrentHashMap.get(descriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, obj2);
                }
                ((Map) obj2).put(key, value);
            }
            Map map = (Map) value;
            Iterator<T> it = t().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return e;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    public kotlinx.serialization.json.h r(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (kotlinx.serialization.json.h) MapsKt.getValue(t(), tag);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.x t() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlinx.serialization.json.b json, kotlinx.serialization.json.x value, String str, kotlinx.serialization.descriptors.f fVar) {
        super(json, value, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.g = fVar;
    }
}
