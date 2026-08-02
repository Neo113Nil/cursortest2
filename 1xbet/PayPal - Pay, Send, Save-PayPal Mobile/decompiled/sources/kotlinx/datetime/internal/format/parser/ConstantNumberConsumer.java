package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ConstantNumberConsumer;", "Receiver", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "", "expected", "<init>", "(Ljava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "consume", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConstantNumberConsumer<Receiver> extends kotlinx.datetime.internal.format.parser.NumberConsumer<Receiver> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstantNumberConsumer(java.lang.String str) {
        super(java.lang.Integer.valueOf(str.length()), "the predefined string ".concat(java.lang.String.valueOf(str)), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public final kotlinx.datetime.internal.format.parser.NumberConsumptionError consume(Receiver storage, java.lang.CharSequence input, int start, int end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(input.subSequence(start, end).toString(), this.Camera2StreamConfigurationMap)) {
            return null;
        }
        return new kotlinx.datetime.internal.format.parser.NumberConsumptionError.WrongConstant(this.Camera2StreamConfigurationMap);
    }
}
