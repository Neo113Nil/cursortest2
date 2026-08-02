package coil3.content;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bR-\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00040\u00040\f8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0014\u001a\f\u0012\b\u0012\u0006*\u00020\t0\t0\f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Lcoil3/util/ServiceLoaderComponentRegistry;", "", "<init>", "()V", "Lcoil3/util/FetcherServiceLoaderTarget;", "fetcher", "", "register", "(Lcoil3/util/FetcherServiceLoaderTarget;)V", "Lcoil3/util/DecoderServiceLoaderTarget;", "decoder", "(Lcoil3/util/DecoderServiceLoaderTarget;)V", "", "fetchers$delegate", "Lkotlin/Lazy;", "getFetchers", "()Ljava/util/List;", "fetchers", "decoders$delegate", "getDecoders", "decoders"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceLoaderComponentRegistry {
    public static final coil3.content.ServiceLoaderComponentRegistry INSTANCE = new coil3.content.ServiceLoaderComponentRegistry();

    /* renamed from: fetchers$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy fetchers = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.util.ServiceLoaderComponentRegistry$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.List Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = coil3.content.ServiceLoaderComponentRegistry.Camera2StreamConfigurationMap();
            return Camera2StreamConfigurationMap;
        }
    });

    /* renamed from: decoders$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy decoders = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.util.ServiceLoaderComponentRegistry$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.util.List highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = coil3.content.ServiceLoaderComponentRegistry.getHighSpeedVideoFpsRangesFor();
            return highSpeedVideoFpsRangesFor;
        }
    });

    private ServiceLoaderComponentRegistry() {
    }

    public final java.util.List<coil3.content.FetcherServiceLoaderTarget<?>> getFetchers() {
        return (java.util.List) fetchers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List Camera2StreamConfigurationMap() {
        return coil3.content.Collections_jvmCommonKt.toImmutableList(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(coil3.content.FetcherServiceLoaderTarget.class, coil3.content.FetcherServiceLoaderTarget.class.getClassLoader()).iterator())));
    }

    public final java.util.List<coil3.content.DecoderServiceLoaderTarget> getDecoders() {
        return (java.util.List) decoders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighSpeedVideoFpsRangesFor() {
        return coil3.content.Collections_jvmCommonKt.toImmutableList(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(java.util.ServiceLoader.load(coil3.content.DecoderServiceLoaderTarget.class, coil3.content.DecoderServiceLoaderTarget.class.getClassLoader()).iterator())));
    }

    public final void register(coil3.content.FetcherServiceLoaderTarget<?> fetcher) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void register(coil3.content.DecoderServiceLoaderTarget decoder) {
        throw new java.lang.UnsupportedOperationException();
    }
}
