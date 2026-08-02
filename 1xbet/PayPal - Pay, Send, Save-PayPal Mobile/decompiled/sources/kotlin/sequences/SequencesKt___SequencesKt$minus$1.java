package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/SequencesKt___SequencesKt$minus$1;", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SequencesKt___SequencesKt$minus$1<T> implements kotlin.sequences.Sequence<T> {
    final /* synthetic */ T Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.sequences.Sequence<T> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    SequencesKt___SequencesKt$minus$1(kotlin.sequences.Sequence<? extends T> sequence, T t) {
        this.getHighSpeedVideoSizes = sequence;
        this.Camera2StreamConfigurationMap = t;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<T> iterator() {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlin.sequences.Sequence<T> sequence = this.getHighSpeedVideoSizes;
        final T t = this.Camera2StreamConfigurationMap;
        return kotlin.sequences.SequencesKt.filter(sequence, new kotlin.jvm.functions.Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.sequences.SequencesKt___SequencesKt$minus$1.m23922$r8$lambda$kfelBx0XPvFF6WPI5Hkv1SiMqI(kotlin.jvm.internal.Ref.BooleanRef.this, t, obj));
            }
        }).iterator();
    }

    /* renamed from: $r8$lambda$kf-elBx0XPvFF6WPI5Hkv1SiMqI, reason: not valid java name */
    public static /* synthetic */ boolean m23922$r8$lambda$kfelBx0XPvFF6WPI5Hkv1SiMqI(kotlin.jvm.internal.Ref.BooleanRef booleanRef, java.lang.Object obj, java.lang.Object obj2) {
        if (booleanRef.element || !kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
            return true;
        }
        booleanRef.element = true;
        return false;
    }
}
