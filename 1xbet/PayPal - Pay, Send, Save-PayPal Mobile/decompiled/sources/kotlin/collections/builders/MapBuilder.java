package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\n\b\u0000\u0018\u0000 x*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006xyz{|}BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010$J\u001a\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001c2\u0014\u0010+\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010(J\u000f\u0010/\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u0010\u0011J\u001a\u00101\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001cH\u0000¢\u0006\u0004\b7\u0010\u0011J\u0017\u00108\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0013J\u0017\u00108\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001fH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0013J\u0017\u0010;\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010=J\u0017\u0010:\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b:\u0010=J\u0017\u0010>\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\b?\u0010$J\u0017\u0010@\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010\u0013J\u0017\u0010A\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u0013J#\u0010D\u001a\u00020\u001f2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010BH\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u00020\u001f2\n\u0010G\u001a\u0006\u0012\u0002\b\u00030FH\u0000¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u00020\u001f2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010BH\u0000¢\u0006\u0004\bJ\u0010EJ\u0017\u0010L\u001a\u00020\u001f2\u0006\u0010K\u001a\u00028\u0001H\u0000¢\u0006\u0004\bL\u0010$J\u001b\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010MH\u0000¢\u0006\u0004\bN\u0010OJ\u001b\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010PH\u0000¢\u0006\u0004\bQ\u0010RJ\u001b\u0010T\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0000¢\u0006\u0004\bT\u0010UR\u001c\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010VR\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010YR\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010X\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010[R\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R$\u0010^\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f8\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u00103R\u001e\u0010W\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010`8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010aR\u001e\u0010]\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010g\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010fR$\u0010h\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010!R\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000k8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00010o8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR&\u0010u\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010s0k8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010mR\u0014\u0010w\u001a\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u00103"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "p0", "p1", "", "p2", "p3", "", "p4", "p5", "<init>", "([Ljava/lang/Object;[I[I)V", "()V", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Map;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isEmpty", "()Z", "key", "containsKey", "(Ljava/lang/Object;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "Camera2StreamConfigurationMap", "(Z)V", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "(I)Z", "(Ljava/lang/Object;)I", "addKey$kotlin_stdlib", "removeKey$kotlin_stdlib", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "", "m", "containsAllEntries$kotlin_stdlib", "(Ljava/util/Collection;)Z", "removeEntry$kotlin_stdlib", "element", "removeValue$kotlin_stdlib", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$KeysItr;", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$ValuesItr;", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$EntriesItr;", "[Ljava/lang/Object;", "getInputFormats", "getOutputMinFrameDuration", "[I", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getOutputFormats", "getInputSizeshNQ4ISI", io.ktor.http.ContentDisposition.Parameters.Size, "getSize", "Lkotlin/collections/builders/MapBuilderKeys;", "Lkotlin/collections/builders/MapBuilderKeys;", "Lkotlin/collections/builders/MapBuilderValues;", "getOutputMinFrameDurationlomOqCM", "Lkotlin/collections/builders/MapBuilderValues;", "Lkotlin/collections/builders/MapBuilderEntries;", "Lkotlin/collections/builders/MapBuilderEntries;", "getOutputStallDurationlomOqCM", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapBuilder<K, V> implements java.util.Map<K, V>, java.io.Serializable, kotlin.jvm.internal.markers.KMutableMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.collections.builders.MapBuilder.Companion INSTANCE = new kotlin.collections.builders.MapBuilder.Companion(null);
    private static final kotlin.collections.builders.MapBuilder Empty;
    private K[] Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.collections.builders.MapBuilderEntries<K, V> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.collections.builders.MapBuilderKeys<K> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private V[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private kotlin.collections.builders.MapBuilderValues<V> getInputSizeshNQ4ISI;
    private boolean isReadOnly;
    private int size;

    private MapBuilder(K[] kArr, int[] iArr, int[] iArr2) {
        this.Camera2StreamConfigurationMap = kArr;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = iArr;
        this.getHighSpeedVideoFpsRanges = iArr2;
        this.getHighSpeedVideoSizes = 2;
        this.getOutputMinFrameDuration = 0;
        this.getOutputFormats = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(INSTANCE, iArr2.length);
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return getValues();
    }

    public final int getSize() {
        return this.size;
    }

    /* renamed from: isReadOnly$kotlin_stdlib, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(i), new int[i], new int[kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(INSTANCE, i)]);
    }

    public final java.util.Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        kotlin.collections.builders.MapBuilder mapBuilder = Empty;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mapBuilder, "");
        return mapBuilder;
    }

    private final java.lang.Object writeReplace() {
        if (this.isReadOnly) {
            return new kotlin.collections.builders.SerializedMap(this);
        }
        throw new java.io.NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        return getHighSpeedVideoFpsRangesFor((kotlin.collections.builders.MapBuilder<K, V>) value) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(java.lang.Object key) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) key);
        if (highSpeedVideoSizes < 0) {
            return null;
        }
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(vArr);
        return vArr[highSpeedVideoSizes];
    }

    @Override // java.util.Map
    public final V put(K key, V value) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(key);
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (vArr == null) {
            vArr = (V[]) kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
            this.getHighResolutionOutputSizeshNQ4ISI = vArr;
        }
        if (addKey$kotlin_stdlib < 0) {
            int i = (-addKey$kotlin_stdlib) - 1;
            V v = vArr[i];
            vArr[i] = value;
            return v;
        }
        vArr[addKey$kotlin_stdlib] = value;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        checkIsMutable$kotlin_stdlib();
        java.util.Set<java.util.Map.Entry<? extends K, ? extends V>> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        Camera2StreamConfigurationMap(entrySet.size());
        for (java.util.Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
            V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (vArr == null) {
                vArr = (V[]) kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(getCapacity$kotlin_stdlib());
                this.getHighResolutionOutputSizeshNQ4ISI = vArr;
            }
            if (addKey$kotlin_stdlib >= 0) {
                vArr[addKey$kotlin_stdlib] = entry.getValue();
            } else {
                int i = (-addKey$kotlin_stdlib) - 1;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(java.lang.Object key) {
        checkIsMutable$kotlin_stdlib();
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) key);
        if (highSpeedVideoSizes < 0) {
            return null;
        }
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(vArr);
        V v = vArr[highSpeedVideoSizes];
        getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        return v;
    }

    @Override // java.util.Map
    public final void clear() {
        checkIsMutable$kotlin_stdlib();
        int i = this.getOutputMinFrameDuration - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.getHighSpeedVideoFpsRangesFor;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.getHighSpeedVideoFpsRanges[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        kotlin.collections.builders.ListBuilderKt.resetRange(this.Camera2StreamConfigurationMap, 0, this.getOutputMinFrameDuration);
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (vArr != null) {
            kotlin.collections.builders.ListBuilderKt.resetRange(vArr, 0, this.getOutputMinFrameDuration);
        }
        this.size = 0;
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoSizesFor++;
    }

    public final java.util.Set<K> getKeys() {
        kotlin.collections.builders.MapBuilderKeys<K> mapBuilderKeys = this.getInputFormats;
        if (mapBuilderKeys == null) {
            kotlin.collections.builders.MapBuilderKeys<K> mapBuilderKeys2 = new kotlin.collections.builders.MapBuilderKeys<>(this);
            this.getInputFormats = mapBuilderKeys2;
            return mapBuilderKeys2;
        }
        return mapBuilderKeys;
    }

    public final java.util.Collection<V> getValues() {
        kotlin.collections.builders.MapBuilderValues<V> mapBuilderValues = this.getInputSizeshNQ4ISI;
        if (mapBuilderValues == null) {
            kotlin.collections.builders.MapBuilderValues<V> mapBuilderValues2 = new kotlin.collections.builders.MapBuilderValues<>(this);
            this.getInputSizeshNQ4ISI = mapBuilderValues2;
            return mapBuilderValues2;
        }
        return mapBuilderValues;
    }

    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.MapBuilderEntries<K, V> mapBuilderEntries = this.getOutputStallDurationlomOqCM;
        if (mapBuilderEntries == null) {
            kotlin.collections.builders.MapBuilderEntries<K, V> mapBuilderEntries2 = new kotlin.collections.builders.MapBuilderEntries<>(this);
            this.getOutputStallDurationlomOqCM = mapBuilderEntries2;
            return mapBuilderEntries2;
        }
        return mapBuilderEntries;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) other;
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    @Override // java.util.Map
    public final int hashCode() {
        kotlin.collections.builders.MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i += entriesIterator$kotlin_stdlib.nextHashCode$kotlin_stdlib();
        }
        return i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((size() * 3) + 2);
        sb.append("{");
        kotlin.collections.builders.MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.nextAppendString(sb);
            i++;
        }
        sb.append("}");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.Camera2StreamConfigurationMap.length;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void Camera2StreamConfigurationMap(boolean p0) {
        int i;
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.getOutputMinFrameDuration;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.Camera2StreamConfigurationMap;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (p0) {
                    iArr[i3] = i4;
                    this.getHighSpeedVideoFpsRanges[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        kotlin.collections.builders.ListBuilderKt.resetRange(this.Camera2StreamConfigurationMap, i3, i);
        if (vArr != null) {
            kotlin.collections.builders.ListBuilderKt.resetRange(vArr, i3, this.getOutputMinFrameDuration);
        }
        this.getOutputMinFrameDuration = i3;
    }

    private final boolean getHighSpeedVideoSizes(int p0) {
        K k = this.Camera2StreamConfigurationMap[p0];
        int hashCode = ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.getOutputFormats;
        int i = this.getHighSpeedVideoSizes;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (iArr[hashCode] == 0) {
                iArr[hashCode] = p0 + 1;
                this.getHighSpeedVideoFpsRangesFor[p0] = hashCode;
                return true;
            }
            i--;
            if (i < 0) {
                return false;
            }
            hashCode = hashCode == 0 ? iArr.length - 1 : hashCode - 1;
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(V p0) {
        int i = this.getOutputMinFrameDuration;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.getHighSpeedVideoFpsRangesFor[i] >= 0) {
                V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(vArr);
                if (kotlin.jvm.internal.Intrinsics.areEqual(vArr[i], p0)) {
                    return i;
                }
            }
        }
    }

    public final int addKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int i = 0;
            int hashCode = ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.getOutputFormats;
            int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(this.getHighSpeedVideoSizes * 2, this.getHighSpeedVideoFpsRanges.length / 2);
            while (true) {
                int i2 = this.getHighSpeedVideoFpsRanges[hashCode];
                if (i2 == 0) {
                    if (this.getOutputMinFrameDuration >= getCapacity$kotlin_stdlib()) {
                        Camera2StreamConfigurationMap(1);
                    } else {
                        int i3 = this.getOutputMinFrameDuration;
                        int i4 = i3 + 1;
                        this.getOutputMinFrameDuration = i4;
                        this.Camera2StreamConfigurationMap[i3] = key;
                        this.getHighSpeedVideoFpsRangesFor[i3] = hashCode;
                        this.getHighSpeedVideoFpsRanges[hashCode] = i4;
                        this.size = size() + 1;
                        this.getHighSpeedVideoSizesFor++;
                        if (i > this.getHighSpeedVideoSizes) {
                            this.getHighSpeedVideoSizes = i;
                        }
                        return i3;
                    }
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap[i2 - 1], key)) {
                        return -i2;
                    }
                    i++;
                    if (i > coerceAtMost) {
                        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges.length * 2);
                        break;
                    }
                    hashCode = hashCode == 0 ? this.getHighSpeedVideoFpsRanges.length - 1 : hashCode - 1;
                }
            }
        }
    }

    public final boolean removeKey$kotlin_stdlib(K key) {
        checkIsMutable$kotlin_stdlib();
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) key);
        if (highSpeedVideoSizes < 0) {
            return false;
        }
        getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(int p0) {
        kotlin.collections.builders.ListBuilderKt.resetAt(this.Camera2StreamConfigurationMap, p0);
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (vArr != null) {
            kotlin.collections.builders.ListBuilderKt.resetAt(vArr, p0);
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor[p0]);
        this.getHighSpeedVideoFpsRangesFor[p0] = -1;
        this.size = size() - 1;
        this.getHighSpeedVideoSizesFor++;
    }

    public final boolean containsEntry$kotlin_stdlib(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) entry.getKey());
        if (highSpeedVideoSizes < 0) {
            return false;
        }
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(vArr);
        return kotlin.jvm.internal.Intrinsics.areEqual(vArr[highSpeedVideoSizes], entry.getValue());
    }

    public final boolean containsAllEntries$kotlin_stdlib(java.util.Collection<?> m) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        for (java.lang.Object obj : m) {
            if (obj == null) {
                return false;
            }
            try {
                if (!containsEntry$kotlin_stdlib((java.util.Map.Entry) obj)) {
                    return false;
                }
            } catch (java.lang.ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeEntry$kotlin_stdlib(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        checkIsMutable$kotlin_stdlib();
        int highSpeedVideoSizes = getHighSpeedVideoSizes((kotlin.collections.builders.MapBuilder<K, V>) entry.getKey());
        if (highSpeedVideoSizes < 0) {
            return false;
        }
        V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(vArr);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(vArr[highSpeedVideoSizes], entry.getValue())) {
            return false;
        }
        getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V element) {
        checkIsMutable$kotlin_stdlib();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((kotlin.collections.builders.MapBuilder<K, V>) element);
        if (highSpeedVideoFpsRangesFor < 0) {
            return false;
        }
        getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor);
        return true;
    }

    public final kotlin.collections.builders.MapBuilder.KeysItr<K, V> keysIterator$kotlin_stdlib() {
        return new kotlin.collections.builders.MapBuilder.KeysItr<>(this);
    }

    public final kotlin.collections.builders.MapBuilder.ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
        return new kotlin.collections.builders.MapBuilder.ValuesItr<>(this);
    }

    public final kotlin.collections.builders.MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
        return new kotlin.collections.builders.MapBuilder.EntriesItr<>(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.collections.builders.MapBuilder getEmpty$kotlin_stdlib() {
            return kotlin.collections.builders.MapBuilder.Empty;
        }

        public static final /* synthetic */ int access$computeHashSize(kotlin.collections.builders.MapBuilder.Companion companion, int i) {
            return java.lang.Integer.highestOneBit(kotlin.ranges.RangesKt.coerceAtLeast(i, 1) * 3);
        }

        public static final /* synthetic */ int access$computeShift(kotlin.collections.builders.MapBuilder.Companion companion, int i) {
            return java.lang.Integer.numberOfLeadingZeros(i) + 1;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.collections.builders.MapBuilder mapBuilder = new kotlin.collections.builders.MapBuilder(0);
        mapBuilder.isReadOnly = true;
        Empty = mapBuilder;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "initNext$kotlin_stdlib", "()V", "", "hasNext", "()Z", "remove", "checkForComodification$kotlin_stdlib", "Lkotlin/collections/builders/MapBuilder;", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "", "index", com.visa.cbp.getEncExpo.warmup, "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class Itr<K, V> {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;
        private int index;
        private int lastIndex;
        private final kotlin.collections.builders.MapBuilder<K, V> map;

        public Itr(kotlin.collections.builders.MapBuilder<K, V> mapBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
            this.map = mapBuilder;
            this.lastIndex = -1;
            this.getHighSpeedVideoSizes = ((kotlin.collections.builders.MapBuilder) mapBuilder).getHighSpeedVideoSizesFor;
            initNext$kotlin_stdlib();
        }

        public final kotlin.collections.builders.MapBuilder<K, V> getMap$kotlin_stdlib() {
            return this.map;
        }

        /* renamed from: getIndex$kotlin_stdlib, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void setIndex$kotlin_stdlib(int i) {
            this.index = i;
        }

        /* renamed from: getLastIndex$kotlin_stdlib, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final void setLastIndex$kotlin_stdlib(int i) {
            this.lastIndex = i;
        }

        public final void initNext$kotlin_stdlib() {
            while (this.index < ((kotlin.collections.builders.MapBuilder) this.map).getOutputMinFrameDuration) {
                int[] iArr = ((kotlin.collections.builders.MapBuilder) this.map).getHighSpeedVideoFpsRangesFor;
                int i = this.index;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.index = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.index < ((kotlin.collections.builders.MapBuilder) this.map).getOutputMinFrameDuration;
        }

        public final void remove() {
            checkForComodification$kotlin_stdlib();
            if (this.lastIndex == -1) {
                throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.map.checkIsMutable$kotlin_stdlib();
            this.map.getHighSpeedVideoFpsRanges(this.lastIndex);
            this.lastIndex = -1;
            this.getHighSpeedVideoSizes = ((kotlin.collections.builders.MapBuilder) this.map).getHighSpeedVideoSizesFor;
        }

        public final void checkForComodification$kotlin_stdlib() {
            if (((kotlin.collections.builders.MapBuilder) this.map).getHighSpeedVideoSizesFor != this.getHighSpeedVideoSizes) {
                throw new java.util.ConcurrentModificationException();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class KeysItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<K>, kotlin.jvm.internal.markers.KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(kotlin.collections.builders.MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
        }

        @Override // java.util.Iterator
        public final K next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getOutputMinFrameDuration) {
                throw new java.util.NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            K k = (K) ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).Camera2StreamConfigurationMap[getLastIndex()];
            initNext$kotlin_stdlib();
            return k;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(kotlin.collections.builders.MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
        }

        @Override // java.util.Iterator
        public final V next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getOutputMinFrameDuration) {
                throw new java.util.NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            java.lang.Object[] objArr = ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            V v = (V) objArr[getLastIndex()];
            initNext$kotlin_stdlib();
            return v;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "Lkotlin/collections/builders/MapBuilder$EntryRef;", io.ktor.http.LinkHeader.Rel.Next, "()Lkotlin/collections/builders/MapBuilder$EntryRef;", "", "nextHashCode$kotlin_stdlib", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "sb", "", "nextAppendString", "(Ljava/lang/StringBuilder;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(kotlin.collections.builders.MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
        }

        @Override // java.util.Iterator
        public final kotlin.collections.builders.MapBuilder.EntryRef<K, V> next() {
            checkForComodification$kotlin_stdlib();
            if (getIndex() >= ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getOutputMinFrameDuration) {
                throw new java.util.NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            kotlin.collections.builders.MapBuilder.EntryRef<K, V> entryRef = new kotlin.collections.builders.MapBuilder.EntryRef<>(getMap$kotlin_stdlib(), getLastIndex());
            initNext$kotlin_stdlib();
            return entryRef;
        }

        public final int nextHashCode$kotlin_stdlib() {
            if (getIndex() >= ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getOutputMinFrameDuration) {
                throw new java.util.NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            java.lang.Object obj = ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).Camera2StreamConfigurationMap[getLastIndex()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            java.lang.Object obj2 = objArr[getLastIndex()];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            initNext$kotlin_stdlib();
            return hashCode ^ hashCode2;
        }

        public final void nextAppendString(java.lang.StringBuilder sb) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
            if (getIndex() >= ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getOutputMinFrameDuration) {
                throw new java.util.NoSuchElementException();
            }
            int index = getIndex();
            setIndex$kotlin_stdlib(index + 1);
            setLastIndex$kotlin_stdlib(index);
            java.lang.Object obj = ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).Camera2StreamConfigurationMap[getLastIndex()];
            if (obj == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = ((kotlin.collections.builders.MapBuilder) getMap$kotlin_stdlib()).getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            java.lang.Object obj2 = objArr[getLastIndex()];
            if (obj2 == getMap$kotlin_stdlib()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            initNext$kotlin_stdlib();
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00032\u0006\u0010\n\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00028\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00028\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlin/collections/builders/MapBuilder;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getKey", "()Ljava/lang/Object;", "key", "getValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EntryRef<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlin.collections.builders.MapBuilder<K, V> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        public EntryRef(kotlin.collections.builders.MapBuilder<K, V> mapBuilder, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
            this.getHighSpeedVideoFpsRangesFor = mapBuilder;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.Camera2StreamConfigurationMap = ((kotlin.collections.builders.MapBuilder) mapBuilder).getHighSpeedVideoSizesFor;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object other) {
            if (!(other instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), getKey()) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (((kotlin.collections.builders.MapBuilder) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizesFor == this.Camera2StreamConfigurationMap) {
                return (K) ((kotlin.collections.builders.MapBuilder) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI];
            }
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (((kotlin.collections.builders.MapBuilder) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizesFor == this.Camera2StreamConfigurationMap) {
                java.lang.Object[] objArr = ((kotlin.collections.builders.MapBuilder) this.getHighSpeedVideoFpsRangesFor).getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
                return (V) objArr[this.getHighResolutionOutputSizeshNQ4ISI];
            }
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }

        @Override // java.util.Map.Entry
        public final V setValue(V newValue) {
            if (((kotlin.collections.builders.MapBuilder) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizesFor == this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRangesFor.checkIsMutable$kotlin_stdlib();
                java.lang.Object[] access$allocateValuesArray = kotlin.collections.builders.MapBuilder.access$allocateValuesArray(this.getHighSpeedVideoFpsRangesFor);
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                V v = (V) access$allocateValuesArray[i];
                access$allocateValuesArray[i] = newValue;
                return v;
            }
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    public static final /* synthetic */ java.lang.Object[] access$allocateValuesArray(kotlin.collections.builders.MapBuilder mapBuilder) {
        V[] vArr = mapBuilder.getHighResolutionOutputSizeshNQ4ISI;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(mapBuilder.getCapacity$kotlin_stdlib());
        mapBuilder.getHighResolutionOutputSizeshNQ4ISI = vArr2;
        return vArr2;
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i = this.getOutputMinFrameDuration;
        int i2 = capacity$kotlin_stdlib - i;
        int size = i - size();
        if (i2 < p0 && i2 + size >= p0 && size >= getCapacity$kotlin_stdlib() / 4) {
            Camera2StreamConfigurationMap(true);
            return;
        }
        int i3 = this.getOutputMinFrameDuration + p0;
        if (i3 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i3 > getCapacity$kotlin_stdlib()) {
            int newCapacity$kotlin_stdlib = kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(getCapacity$kotlin_stdlib(), i3);
            this.Camera2StreamConfigurationMap = (K[]) kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(this.Camera2StreamConfigurationMap, newCapacity$kotlin_stdlib);
            V[] vArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = vArr != null ? (V[]) kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(vArr, newCapacity$kotlin_stdlib) : null;
            int[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, newCapacity$kotlin_stdlib);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighSpeedVideoFpsRangesFor = copyOf;
            int access$computeHashSize = kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(INSTANCE, newCapacity$kotlin_stdlib);
            if (access$computeHashSize > this.getHighSpeedVideoFpsRanges.length) {
                getHighSpeedVideoFpsRangesFor(access$computeHashSize);
            }
        }
    }

    private final int getHighSpeedVideoSizes(K p0) {
        int hashCode = ((p0 != null ? p0.hashCode() : 0) * (-1640531527)) >>> this.getOutputFormats;
        int i = this.getHighSpeedVideoSizes;
        while (true) {
            int i2 = this.getHighSpeedVideoFpsRanges[hashCode];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap[i3], p0)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            hashCode = hashCode == 0 ? this.getHighSpeedVideoFpsRanges.length - 1 : hashCode - 1;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        this.getHighSpeedVideoSizesFor++;
        if (this.getOutputMinFrameDuration > size()) {
            Camera2StreamConfigurationMap(false);
        }
        this.getHighSpeedVideoFpsRanges = new int[p0];
        this.getOutputFormats = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(INSTANCE, p0);
        for (int i = 0; i < this.getOutputMinFrameDuration; i++) {
            if (!getHighSpeedVideoSizes(i)) {
                throw new java.lang.IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0) {
        int i;
        int i2;
        int hashCode;
        int[] iArr;
        while (true) {
            int i3 = p0;
            int i4 = 0;
            do {
                if (i3 == 0) {
                    i3 = this.getHighSpeedVideoFpsRanges.length;
                }
                i3--;
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                i = iArr2[i3];
                i4++;
                if (i4 > this.getHighSpeedVideoSizes) {
                    iArr2[p0] = 0;
                    return;
                } else {
                    if (i == 0) {
                        iArr2[p0] = 0;
                        return;
                    }
                    i2 = i - 1;
                    K k = this.Camera2StreamConfigurationMap[i2];
                    hashCode = (((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.getOutputFormats) - i3;
                    iArr = this.getHighSpeedVideoFpsRanges;
                }
            } while ((hashCode & (iArr.length - 1)) < i4);
            iArr[p0] = i;
            this.getHighSpeedVideoFpsRangesFor[i2] = p0;
            p0 = i3;
        }
    }
}
