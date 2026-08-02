package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokhttp3/internal/LinkedTags;", "", "K", "Lokhttp3/internal/Tags;", "Lkotlin/reflect/KClass;", "p0", "p1", "p2", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KClass;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/Tags;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LinkedTags<K> extends okhttp3.internal.Tags {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.reflect.KClass<K> getHighSpeedVideoFpsRanges;
    private final okhttp3.internal.Tags getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final K getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(kotlin.reflect.KClass<K> kClass, K k, okhttp3.internal.Tags tags) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        this.getHighSpeedVideoFpsRanges = kClass;
        this.getHighResolutionOutputSizeshNQ4ISI = k;
        this.getHighSpeedVideoFpsRangesFor = tags;
    }

    @Override // okhttp3.internal.Tags
    public final <T> okhttp3.internal.Tags plus(kotlin.reflect.KClass<T> p0, T p1) {
        okhttp3.internal.LinkedTags<K> linkedTags;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoFpsRanges)) {
            linkedTags = this.getHighSpeedVideoFpsRangesFor;
        } else {
            okhttp3.internal.Tags plus = this.getHighSpeedVideoFpsRangesFor.plus(p0, null);
            linkedTags = plus == this.getHighSpeedVideoFpsRangesFor ? this : new okhttp3.internal.LinkedTags<>(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, plus);
        }
        return p1 != null ? new okhttp3.internal.LinkedTags(p0, p1, linkedTags) : linkedTags;
    }

    @Override // okhttp3.internal.Tags
    public final <T> T get(kotlin.reflect.KClass<T> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoFpsRanges) ? (T) kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0).cast(this.getHighResolutionOutputSizeshNQ4ISI) : (T) this.getHighSpeedVideoFpsRangesFor.get(p0);
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.reversed(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.generateSequence(this, (kotlin.jvm.functions.Function1<? super okhttp3.internal.LinkedTags<K>, ? extends okhttp3.internal.LinkedTags<K>>) new kotlin.jvm.functions.Function1() { // from class: okhttp3.internal.LinkedTags$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return okhttp3.internal.LinkedTags.getHighResolutionOutputSizeshNQ4ISI((okhttp3.internal.LinkedTags) obj);
            }
        }))), null, "{", "}", 0, null, new kotlin.jvm.functions.Function1() { // from class: okhttp3.internal.LinkedTags$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return okhttp3.internal.LinkedTags.Camera2StreamConfigurationMap((okhttp3.internal.LinkedTags) obj);
            }
        }, 25, null);
    }

    public static /* synthetic */ okhttp3.internal.LinkedTags getHighResolutionOutputSizeshNQ4ISI(okhttp3.internal.LinkedTags linkedTags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedTags, "");
        okhttp3.internal.Tags tags = linkedTags.getHighSpeedVideoFpsRangesFor;
        if (tags instanceof okhttp3.internal.LinkedTags) {
            return (okhttp3.internal.LinkedTags) tags;
        }
        return null;
    }

    public static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(okhttp3.internal.LinkedTags linkedTags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedTags, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(linkedTags.getHighSpeedVideoFpsRanges);
        sb.append('=');
        sb.append(linkedTags.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
