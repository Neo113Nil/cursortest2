package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/datetime/internal/format/parser/UnconditionalModification;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "Lkotlin/Function1;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "<init>", "(Lkotlin/jvm/functions/Function1;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnconditionalModification<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<Output, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public UnconditionalModification(kotlin.jvm.functions.Function1<? super Output, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, java.lang.CharSequence input, int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        this.getHighSpeedVideoFpsRanges.invoke(storage);
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex);
    }
}
