package kotlin.jvm.optionals;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a,\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000e\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b9"}, d2 = {"", "T", "Ljava/util/Optional;", "getOrNull", "(Ljava/util/Optional;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Ljava/util/Optional;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "destination", "toCollection", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "", "toList", "(Ljava/util/Optional;)Ljava/util/List;", "", "toSet", "(Ljava/util/Optional;)Ljava/util/Set;", "Lkotlin/sequences/Sequence;", "asSequence", "(Ljava/util/Optional;)Lkotlin/sequences/Sequence;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OptionalsKt {
    public static final <T> T getOrNull(java.util.Optional<T> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional.orElse(null);
    }

    public static final <T> T getOrDefault(java.util.Optional<? extends T> optional, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional.isPresent() ? optional.get() : t;
    }

    public static final <T> T getOrElse(java.util.Optional<? extends T> optional, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return optional.isPresent() ? optional.get() : function0.invoke();
    }

    @kotlin.IgnorableReturnValue
    public static final <T, C extends java.util.Collection<? super T>> C toCollection(java.util.Optional<T> optional, C c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        if (optional.isPresent()) {
            T t = optional.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "");
            c.add(t);
        }
        return c;
    }

    public static final <T> java.util.List<T> toList(java.util.Optional<? extends T> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional.isPresent() ? kotlin.collections.CollectionsKt.listOf(optional.get()) : kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <T> java.util.Set<T> toSet(java.util.Optional<? extends T> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional.isPresent() ? kotlin.collections.SetsKt.setOf(optional.get()) : kotlin.collections.SetsKt.emptySet();
    }

    public static final <T> kotlin.sequences.Sequence<T> asSequence(java.util.Optional<? extends T> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        return optional.isPresent() ? kotlin.sequences.SequencesKt.sequenceOf(optional.get()) : kotlin.sequences.SequencesKt.emptySequence();
    }
}
