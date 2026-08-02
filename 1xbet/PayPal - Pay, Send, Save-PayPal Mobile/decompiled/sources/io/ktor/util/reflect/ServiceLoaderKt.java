package io.ktor.util.reflect;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "T", "Lkotlin/sequences/Sequence;", "loadServicesAsSequence", "()Lkotlin/sequences/Sequence;", "", "loadServices", "()Ljava/util/List;", "loadServiceOrNull", "()Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServiceLoaderKt {
    public static final /* synthetic */ <T> kotlin.sequences.Sequence<T> loadServicesAsSequence() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.Iterator it = java.util.ServiceLoader.load(java.lang.Object.class, java.lang.Object.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        return kotlin.sequences.SequencesKt.asSequence(it);
    }

    public static final /* synthetic */ <T> java.util.List<T> loadServices() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.Iterator it = java.util.ServiceLoader.load(java.lang.Object.class, java.lang.Object.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(it));
    }

    public static final /* synthetic */ <T> T loadServiceOrNull() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.util.Iterator it = java.util.ServiceLoader.load(java.lang.Object.class, java.lang.Object.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        return (T) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.asSequence(it));
    }
}
