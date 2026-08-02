package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/datetime/internal/format/parser/SignParser;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "Lkotlin/Function2;", "", "", "isNegativeSetter", "withPlusSign", "", "whatThisExpects", "<init>", "(Lkotlin/jvm/functions/Function2;ZLjava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignParser<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<Output, java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SignParser(kotlin.jvm.functions.Function2<? super Output, ? super java.lang.Boolean, kotlin.Unit> function2, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, java.lang.CharSequence input, int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (startIndex >= input.length()) {
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex);
        }
        final char charAt = input.charAt(startIndex);
        if (charAt == '-') {
            this.getHighSpeedVideoSizes.invoke(storage, java.lang.Boolean.TRUE);
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex + 1);
        }
        if (charAt == '+' && this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.invoke(storage, java.lang.Boolean.FALSE);
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex + 1);
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.SignParser$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.datetime.internal.format.parser.SignParser.m24194$r8$lambda$mEXSiX8SWhY6I4Lby6R85SFVds(kotlinx.datetime.internal.format.parser.SignParser.this, charAt);
            }
        });
    }

    /* renamed from: toString, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: $r8$lambda$mEXS-iX8SWhY6I4Lby6R85SFVds, reason: not valid java name */
    public static /* synthetic */ java.lang.String m24194$r8$lambda$mEXSiX8SWhY6I4Lby6R85SFVds(kotlinx.datetime.internal.format.parser.SignParser signParser, char c) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(signParser.getHighSpeedVideoFpsRanges);
        sb.append(" but got ");
        sb.append(c);
        return sb.toString();
    }
}
