package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0003)*+B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J!\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010$\u001a\u00020\u0014H\u0016J\u0006\u0010%\u001a\u00020\u0014J\u0014\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(H\u0002R\t\u0010\t\u001a\u00020\nX\u0082\u0004R\u001f\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u00120\rR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\fX\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006,"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "K", "", "V", "Lkotlin/collections/AbstractMutableMap;", "weakRefQueue", "", "<init>", "(Z)V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "core", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "Ljava/lang/ref/ReferenceQueue;", io.ktor.http.ContentDisposition.Parameters.Size, "", "getSize", "()I", "decrementSize", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "putSynchronized", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getKeys", "()Ljava/util/Set;", "entries", "", "getEntries", "clear", "runWeakRefQueueCleaningLoopUntilInterrupted", "cleanWeakRef", "w", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConcurrentWeakMap<K, V> extends kotlin.collections.AbstractMutableMap<K, V> {
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ java.lang.Object core$volatile;
    private final java.lang.ref.ReferenceQueue<K> getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class, "_size$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class, java.lang.Object.class, "core$volatile");

    /* renamed from: $r8$lambda$wWOgz_fafcTKYZPOtb-KQEFpkSE, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m24096$r8$lambda$wWOgz_fafcTKYZPOtbKQEFpkSE(java.lang.Object obj, java.lang.Object obj2) {
        return obj;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core$volatile = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core(16);
        this.getHighResolutionOutputSizeshNQ4ISI = z ? new java.lang.ref.ReferenceQueue<>() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final java.util.Set<K> getKeys() {
        return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.KeyValueSet(new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlinx.coroutines.debug.internal.ConcurrentWeakMap.m24096$r8$lambda$wWOgz_fafcTKYZPOtbKQEFpkSE(obj, obj2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.KeyValueSet(new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return kotlinx.coroutines.debug.internal.ConcurrentWeakMap.$r8$lambda$zDoTVsE8Gqh91DxPQaAcfh1HRiM(obj, obj2);
            }
        });
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                java.lang.ref.Reference<? extends K> remove = this.getHighResolutionOutputSizeshNQ4ISI.remove();
                kotlin.jvm.internal.Intrinsics.checkNotNull(remove, "");
                kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) remove;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) getHighSpeedVideoFpsRanges.get(this);
                int i = (hashedWeakRef.hash * (-1640531527)) >>> core.getHighSpeedVideoSizes;
                while (true) {
                    kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) core.getHighSpeedVideoFpsRangesFor.get(i);
                    if (hashedWeakRef2 == null) {
                        break;
                    }
                    if (hashedWeakRef2 == hashedWeakRef) {
                        core.getHighResolutionOutputSizeshNQ4ISI(i);
                        break;
                    } else {
                        if (i == 0) {
                            i = core.Camera2StreamConfigurationMap;
                        }
                        i--;
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J1\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00142\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\fJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u001e\"\u0004\b\u0002\u0010\u001f2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u001f0!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u0017\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f0\u000bX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bX\u0082\u0004¨\u0006#"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "shift", "threshold", "load", "Lkotlinx/atomicfu/AtomicInt;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "values", "index", "hash", "getImpl", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "removeCleanedAt", "", "putImpl", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "weakKey0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "rehash", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "cleanWeakRef", "weakRef", "keyValueIterator", "", "E", "factory", "Lkotlin/Function2;", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class Core {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getOutputFormats = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.class, "load$volatile");
        final int Camera2StreamConfigurationMap;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        private final int getOutputMinFrameDuration;
        private volatile /* synthetic */ int load$volatile;

        public Core(int i) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoSizes = java.lang.Integer.numberOfLeadingZeros(i) + 1;
            this.getOutputMinFrameDuration = (i * 2) / 3;
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReferenceArray(i);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        }

        public static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core, java.lang.Object obj, java.lang.Object obj2) {
            return core.Camera2StreamConfigurationMap((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) obj, obj2, (kotlinx.coroutines.debug.internal.HashedWeakRef<kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core>) null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        
            r7 = r6.getHighSpeedVideoFpsRanges.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if ((r7 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        
            if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(r6.getHighSpeedVideoFpsRanges, r0, r7, r8) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        
            return r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        
            r7 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        
            return r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object Camera2StreamConfigurationMap(K k, V v, kotlinx.coroutines.debug.internal.HashedWeakRef<K> hashedWeakRef) {
            int i;
            kotlinx.coroutines.internal.Symbol symbol;
            int hashCode = (k.hashCode() * (-1640531527)) >>> this.getHighSpeedVideoSizes;
            boolean z = false;
            while (true) {
                kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef2 = (kotlinx.coroutines.debug.internal.HashedWeakRef) this.getHighSpeedVideoFpsRangesFor.get(hashCode);
                if (hashedWeakRef2 != null) {
                    T t = hashedWeakRef2.get();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(k, t)) {
                        if (t == 0) {
                            getHighResolutionOutputSizeshNQ4ISI(hashCode);
                        }
                        if (hashCode == 0) {
                            hashCode = this.Camera2StreamConfigurationMap;
                        }
                        hashCode--;
                    } else if (z) {
                        getOutputFormats.decrementAndGet(this);
                    }
                } else if (v != null) {
                    if (!z) {
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getOutputFormats;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.getOutputMinFrameDuration) {
                                symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
                                return symbol;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (hashedWeakRef == null) {
                        hashedWeakRef = new kotlinx.coroutines.debug.internal.HashedWeakRef<>(k, ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this).getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, hashCode, null, hashedWeakRef)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "Lkotlin/Function2;", "p0", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", "", "Camera2StreamConfigurationMap", "()V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
        final class KeyValueIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
            private K getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges = -1;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private V Camera2StreamConfigurationMap;
            private final kotlin.jvm.functions.Function2<K, V, E> getHighSpeedVideoSizes;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> function2) {
                this.getHighSpeedVideoSizes = function2;
                Camera2StreamConfigurationMap();
            }

            private final void Camera2StreamConfigurationMap() {
                K k;
                while (true) {
                    int i = this.getHighSpeedVideoFpsRanges + 1;
                    this.getHighSpeedVideoFpsRanges = i;
                    if (i >= kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this.Camera2StreamConfigurationMap) {
                        return;
                    }
                    kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoFpsRanges);
                    if (hashedWeakRef != null && (k = (K) hashedWeakRef.get()) != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = k;
                        java.lang.Object obj = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this.getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoFpsRanges);
                        if (obj instanceof kotlinx.coroutines.debug.internal.Marked) {
                            obj = (V) ((kotlinx.coroutines.debug.internal.Marked) obj).Camera2StreamConfigurationMap;
                        }
                        if (obj != null) {
                            this.Camera2StreamConfigurationMap = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.getHighSpeedVideoFpsRanges < kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this.Camera2StreamConfigurationMap;
            }

            @Override // java.util.Iterator
            public final E next() {
                if (this.getHighSpeedVideoFpsRanges >= kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this.Camera2StreamConfigurationMap) {
                    throw new java.util.NoSuchElementException();
                }
                kotlin.jvm.functions.Function2<K, V, E> function2 = this.getHighSpeedVideoSizes;
                K k = this.getHighResolutionOutputSizeshNQ4ISI;
                if (k == false) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    k = (K) kotlin.Unit.INSTANCE;
                }
                V v = this.Camera2StreamConfigurationMap;
                if (v == false) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    v = (V) kotlin.Unit.INSTANCE;
                }
                E e = (E) function2.invoke(k, v);
                Camera2StreamConfigurationMap();
                return e;
            }

            @Override // java.util.Iterator
            public final /* synthetic */ void remove() {
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl();
                throw new kotlin.KotlinNothingValueException();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            java.lang.Object obj;
            do {
                obj = this.getHighSpeedVideoFpsRanges.get(i);
                if (obj == null || (obj instanceof kotlinx.coroutines.debug.internal.Marked)) {
                    return;
                }
            } while (!com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, i, obj, null));
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$decrementSize(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00028\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00028\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getValue", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Entry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final K getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final V getHighSpeedVideoSizes;

        public Entry(K k, V v) {
            this.getHighResolutionOutputSizeshNQ4ISI = k;
            this.getHighSpeedVideoSizes = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V p0) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl();
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/Function2;", "p0", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor", "", "getSize", "()I", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class KeyValueSet<E> extends kotlin.collections.AbstractMutableSet<E> {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function2<K, V, E> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> function2) {
            this.getHighSpeedVideoFpsRangesFor = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet
        public final int getSize() {
            return kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.size();
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(E p0) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl();
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<E> iterator() {
            return ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.getHighSpeedVideoFpsRanges.get(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this)).new KeyValueIterator(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public static /* synthetic */ java.util.Map.Entry $r8$lambda$zDoTVsE8Gqh91DxPQaAcfh1HRiM(java.lang.Object obj, java.lang.Object obj2) {
        return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Entry(obj, obj2);
    }

    public static final /* synthetic */ void access$decrementSize(kotlinx.coroutines.debug.internal.ConcurrentWeakMap concurrentWeakMap) {
        getHighSpeedVideoSizes.decrementAndGet(concurrentWeakMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final V getHighSpeedVideoFpsRanges(K k, V v) {
        V v2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core;
        java.lang.Object obj;
        kotlinx.coroutines.internal.Symbol symbol2;
        synchronized (this) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core2 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) getHighSpeedVideoFpsRanges.get(this);
            while (true) {
                v2 = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.Camera2StreamConfigurationMap(core2, k, v);
                symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
                if (v2 == symbol) {
                    while (true) {
                        core = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.new Core(java.lang.Integer.highestOneBit(kotlin.ranges.RangesKt.coerceAtLeast(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.size(), 4)) * 4);
                        int i = core2.Camera2StreamConfigurationMap;
                        for (int i2 = 0; i2 < i; i2++) {
                            kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) core2.getHighSpeedVideoFpsRangesFor.get(i2);
                            java.lang.Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                            if (hashedWeakRef != null && obj2 == null) {
                                core2.getHighResolutionOutputSizeshNQ4ISI(i2);
                            }
                            while (true) {
                                obj = core2.getHighSpeedVideoFpsRanges.get(i2);
                                if (obj instanceof kotlinx.coroutines.debug.internal.Marked) {
                                    obj = ((kotlinx.coroutines.debug.internal.Marked) obj).Camera2StreamConfigurationMap;
                                    break;
                                }
                                if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(core2.getHighSpeedVideoFpsRanges, i2, obj, kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$mark(obj))) {
                                    break;
                                }
                            }
                            if (obj2 != null && obj != null) {
                                java.lang.Object Camera2StreamConfigurationMap = core.Camera2StreamConfigurationMap((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) obj2, obj, (kotlinx.coroutines.debug.internal.HashedWeakRef<kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core>) hashedWeakRef);
                                symbol2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
                                if (Camera2StreamConfigurationMap != symbol2) {
                                }
                            }
                        }
                    }
                    getHighSpeedVideoFpsRanges.set(this, core);
                    core2 = core;
                }
            }
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object key) {
        if (key == null) {
            return null;
        }
        kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) getHighSpeedVideoFpsRanges.get(this);
        int hashCode = (key.hashCode() * (-1640531527)) >>> core.getHighSpeedVideoSizes;
        while (true) {
            kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) core.getHighSpeedVideoFpsRangesFor.get(hashCode);
            if (hashedWeakRef == null) {
                return null;
            }
            T t = hashedWeakRef.get();
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, t)) {
                V v = (V) core.getHighSpeedVideoFpsRanges.get(hashCode);
                return v instanceof kotlinx.coroutines.debug.internal.Marked ? (V) ((kotlinx.coroutines.debug.internal.Marked) v).Camera2StreamConfigurationMap : v;
            }
            if (t == 0) {
                core.getHighResolutionOutputSizeshNQ4ISI(hashCode);
            }
            if (hashCode == 0) {
                hashCode = core.Camera2StreamConfigurationMap;
            }
            hashCode--;
        }
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return getHighSpeedVideoSizes.get(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public final V put(K key, V value) {
        kotlinx.coroutines.internal.Symbol symbol;
        V v = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.Camera2StreamConfigurationMap((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) getHighSpeedVideoFpsRanges.get(this), key, value);
        symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
        if (v == symbol) {
            v = getHighSpeedVideoFpsRanges(key, value);
        }
        if (v == null) {
            getHighSpeedVideoSizes.incrementAndGet(this);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object key) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (key == 0) {
            return null;
        }
        V v = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.Camera2StreamConfigurationMap((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) getHighSpeedVideoFpsRanges.get(this), key, (java.lang.Object) null);
        symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.Camera2StreamConfigurationMap;
        if (v == symbol) {
            v = getHighSpeedVideoFpsRanges(key, null);
        }
        if (v != null) {
            getHighSpeedVideoSizes.decrementAndGet(this);
        }
        return v;
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }
}
