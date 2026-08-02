package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "", "errorMessage", "()Ljava/lang/String;", "ExpectedInt", "TooManyDigits", "TooFewDigits", "WrongConstant", "Conflicting"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface NumberConsumptionError {
    java.lang.String errorMessage();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$ExpectedInt;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "<init>", "()V", "", "errorMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpectedInt implements kotlinx.datetime.internal.format.parser.NumberConsumptionError {
        public static final kotlinx.datetime.internal.format.parser.NumberConsumptionError.ExpectedInt INSTANCE = new kotlinx.datetime.internal.format.parser.NumberConsumptionError.ExpectedInt();

        private ExpectedInt() {
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumptionError
        public final java.lang.String errorMessage() {
            return "expected an Int value";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$TooManyDigits;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "maxDigits", "<init>", "(I)V", "", "errorMessage", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMaxDigits", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TooManyDigits implements kotlinx.datetime.internal.format.parser.NumberConsumptionError {
        private final int maxDigits;

        public TooManyDigits(int i) {
            this.maxDigits = i;
        }

        public final int getMaxDigits() {
            return this.maxDigits;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumptionError
        public final java.lang.String errorMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected at most ");
            sb.append(this.maxDigits);
            sb.append(" digits");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$TooFewDigits;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "minDigits", "<init>", "(I)V", "", "errorMessage", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMinDigits", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TooFewDigits implements kotlinx.datetime.internal.format.parser.NumberConsumptionError {
        private final int minDigits;

        public TooFewDigits(int i) {
            this.minDigits = i;
        }

        public final int getMinDigits() {
            return this.minDigits;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumptionError
        public final java.lang.String errorMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected at least ");
            sb.append(this.minDigits);
            sb.append(" digits");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$WrongConstant;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "expected", "<init>", "(Ljava/lang/String;)V", "errorMessage", "()Ljava/lang/String;", "Ljava/lang/String;", "getExpected"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WrongConstant implements kotlinx.datetime.internal.format.parser.NumberConsumptionError {
        private final java.lang.String expected;

        public WrongConstant(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.expected = str;
        }

        public final java.lang.String getExpected() {
            return this.expected;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumptionError
        public final java.lang.String errorMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected '");
            sb.append(this.expected);
            sb.append('\'');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/internal/format/parser/NumberConsumptionError$Conflicting;", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "", "conflicting", "<init>", "(Ljava/lang/Object;)V", "", "errorMessage", "()Ljava/lang/String;", "Ljava/lang/Object;", "getConflicting", "()Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Conflicting implements kotlinx.datetime.internal.format.parser.NumberConsumptionError {
        private final java.lang.Object conflicting;

        public Conflicting(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.conflicting = obj;
        }

        public final java.lang.Object getConflicting() {
            return this.conflicting;
        }

        @Override // kotlinx.datetime.internal.format.parser.NumberConsumptionError
        public final java.lang.String errorMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("attempted to overwrite the existing value '");
            sb.append(this.conflicting);
            sb.append('\'');
            return sb.toString();
        }
    }
}
