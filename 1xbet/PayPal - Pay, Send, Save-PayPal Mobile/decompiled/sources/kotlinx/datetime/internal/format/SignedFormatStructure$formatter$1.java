package kotlinx.datetime.internal.format;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class SignedFormatStructure$formatter$1<T> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<T, java.lang.Boolean> {
    final /* synthetic */ kotlinx.datetime.internal.format.SignedFormatStructure<T> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(kotlinx.datetime.internal.format.SignedFormatStructure.access$formatter$checkIfAllNegative(this.getHighSpeedVideoSizes, obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SignedFormatStructure$formatter$1(kotlinx.datetime.internal.format.SignedFormatStructure<? super T> signedFormatStructure) {
        super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
        this.getHighSpeedVideoSizes = signedFormatStructure;
    }
}
