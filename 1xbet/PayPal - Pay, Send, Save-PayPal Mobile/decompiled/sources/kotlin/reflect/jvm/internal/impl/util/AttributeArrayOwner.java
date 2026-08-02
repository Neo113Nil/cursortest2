package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class AttributeArrayOwner<K, T> extends kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner<K, T> {
    private kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> getHighSpeedVideoSizes;

    protected AttributeArrayOwner(kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> arrayMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        this.getHighSpeedVideoSizes = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> getArrayMap() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttributeArrayOwner() {
        this(r0);
        kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap emptyArrayMap = kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(emptyArrayMap, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final void registerComponent(java.lang.String str, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        int id = getTypeRegistry().getId(str);
        int size = this.getHighSpeedVideoSizes.getSize();
        if (size == 0) {
            kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> arrayMap = this.getHighSpeedVideoSizes;
            if (!(arrayMap instanceof kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap)) {
                throw new java.lang.IllegalStateException(Camera2StreamConfigurationMap(arrayMap, 0, "EmptyArrayMap"));
            }
            this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap(t, id);
            return;
        }
        if (size == 1) {
            kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> arrayMap2 = this.getHighSpeedVideoSizes;
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(arrayMap2, "");
                kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap oneElementArrayMap = (kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.getIndex() == id) {
                    this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap(t, id);
                    return;
                } else {
                    kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl arrayMapImpl = new kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl();
                    arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                    this.getHighSpeedVideoSizes = arrayMapImpl;
                }
            } catch (java.lang.ClassCastException e) {
                throw new java.lang.IllegalStateException(Camera2StreamConfigurationMap(arrayMap2, 1, "OneElementArrayMap"), e);
            }
        }
        this.getHighSpeedVideoSizes.set(id, t);
    }

    private final java.lang.String Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> arrayMap, int i, java.lang.String str) {
        T t;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Race condition happened, the size of ArrayMap is ");
        sb2.append(i);
        sb2.append(" but it isn't an `");
        sb2.append(str);
        sb2.append('`');
        sb.append(sb2.toString());
        sb.append('\n');
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Type: ");
        sb3.append(arrayMap.getClass());
        sb.append(sb3.toString());
        sb.append('\n');
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[\n");
        java.util.Map<java.lang.String, java.lang.Integer> allValuesThreadUnsafeForRendering = getTypeRegistry().allValuesThreadUnsafeForRendering();
        kotlin.reflect.jvm.internal.impl.util.ArrayMap<T> arrayMap2 = arrayMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayMap2, 10));
        int i2 = 0;
        for (T t2 : arrayMap2) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.util.Iterator<T> it = allValuesThreadUnsafeForRendering.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((java.lang.Number) ((java.util.Map.Entry) t).getValue()).intValue() == i2) {
                    break;
                }
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("  ");
            sb5.append((java.util.Map.Entry) t);
            sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb5.append(i2);
            sb5.append("]: ");
            sb5.append(t2);
            sb4.append(sb5.toString());
            sb4.append('\n');
            arrayList.add(sb4);
            i2++;
        }
        sb4.append("]\n");
        sb.append("Content: ".concat(java.lang.String.valueOf(sb4.toString())));
        sb.append('\n');
        return sb.toString();
    }
}
