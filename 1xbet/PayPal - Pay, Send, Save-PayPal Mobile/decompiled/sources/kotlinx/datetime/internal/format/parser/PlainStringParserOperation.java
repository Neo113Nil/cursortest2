package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Lkotlinx/datetime/internal/format/parser/PlainStringParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "", "string", "<init>", "(Ljava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "consume", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getString"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlainStringParserOperation<Output> implements kotlinx.datetime.internal.format.parser.ParserOperation<Output> {
    private final java.lang.String string;

    public PlainStringParserOperation(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.string = str;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Empty string is not allowed".toString());
        }
        if (kotlinx.datetime.internal.UtilKt.isAsciiDigit(str.charAt(0))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("String '");
            sb.append(str);
            sb.append("' starts with a digit");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (kotlinx.datetime.internal.UtilKt.isAsciiDigit(str.charAt(str.length() - 1))) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("String '");
            sb2.append(str);
            sb2.append("' ends with a digit");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
    }

    public final java.lang.String getString() {
        return this.string;
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    public final java.lang.Object mo24171consumeFANa98k(Output storage, final java.lang.CharSequence input, final int startIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (this.string.length() + startIndex > input.length()) {
            return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kotlinx.datetime.internal.format.parser.PlainStringParserOperation.$r8$lambda$Q4UYwg2tcpEJ_PKZ02_jOVlbTOs(kotlinx.datetime.internal.format.parser.PlainStringParserOperation.this);
                }
            });
        }
        int length = this.string.length();
        for (final int i = 0; i < length; i++) {
            if (input.charAt(startIndex + i) != this.string.charAt(i)) {
                return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24180ErrorRg3Co2E(startIndex, new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return kotlinx.datetime.internal.format.parser.PlainStringParserOperation.$r8$lambda$x8Qc0pBfl9695aREd2ilDuA16bc(kotlinx.datetime.internal.format.parser.PlainStringParserOperation.this, input, startIndex, i);
                    }
                });
            }
        }
        return kotlinx.datetime.internal.format.parser.ParseResult.INSTANCE.m24181OkQi1bsqg(startIndex + this.string.length());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(this.string);
        sb.append('\'');
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Q4UYwg2tcpEJ_PKZ02_jOVlbTOs(kotlinx.datetime.internal.format.parser.PlainStringParserOperation plainStringParserOperation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected end of input: yet to parse '");
        sb.append(plainStringParserOperation.string);
        sb.append('\'');
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$x8Qc0pBfl9695aREd2ilDuA16bc(kotlinx.datetime.internal.format.parser.PlainStringParserOperation plainStringParserOperation, java.lang.CharSequence charSequence, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(plainStringParserOperation.string);
        sb.append(" but got ");
        sb.append(charSequence.subSequence(i, i2 + i + 1).toString());
        return sb.toString();
    }
}
