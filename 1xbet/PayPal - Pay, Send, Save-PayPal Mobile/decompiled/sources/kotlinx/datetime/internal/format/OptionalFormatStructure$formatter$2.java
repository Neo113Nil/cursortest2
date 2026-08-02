package kotlinx.datetime.internal.format;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class OptionalFormatStructure$formatter$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((kotlinx.datetime.internal.format.Truth) this.receiver).test(obj));
    }

    OptionalFormatStructure$formatter$2(java.lang.Object obj) {
        super(1, obj, kotlinx.datetime.internal.format.Truth.class, "test", "test(Ljava/lang/Object;)Z", 0);
    }
}
