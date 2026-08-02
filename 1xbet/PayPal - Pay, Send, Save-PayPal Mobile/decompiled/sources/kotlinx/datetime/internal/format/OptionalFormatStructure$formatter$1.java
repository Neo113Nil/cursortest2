package kotlinx.datetime.internal.format;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class OptionalFormatStructure$formatter$1<T> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<T, java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(T t) {
        return java.lang.Boolean.valueOf(((kotlinx.datetime.internal.format.Predicate) this.receiver).test(t));
    }

    OptionalFormatStructure$formatter$1(java.lang.Object obj) {
        super(1, obj, kotlinx.datetime.internal.format.Predicate.class, "test", "test(Ljava/lang/Object;)Z", 0);
    }
}
