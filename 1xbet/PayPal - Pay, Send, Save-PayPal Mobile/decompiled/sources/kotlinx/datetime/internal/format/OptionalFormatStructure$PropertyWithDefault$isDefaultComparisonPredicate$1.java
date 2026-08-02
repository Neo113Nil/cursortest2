package kotlinx.datetime.internal.format;

/* JADX INFO: Add missing generic type declarations: [T, E] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* synthetic */ class OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1<E, T> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<T, E> {
    @Override // kotlin.jvm.functions.Function1
    public final E invoke(T t) {
        return (E) ((kotlinx.datetime.internal.format.Accessor) this.receiver).getter(t);
    }

    public OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(java.lang.Object obj) {
        super(1, obj, kotlinx.datetime.internal.format.Accessor.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
