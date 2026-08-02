package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\br\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\b\t"}, d2 = {"Lkotlin/time/InstantParseResult;", "", "Lkotlin/time/Instant;", "toInstant", "()Lkotlin/time/Instant;", "toInstantOrNull", "Success", "Failure", "Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
interface InstantParseResult {
    kotlin.time.Instant toInstant();

    kotlin.time.Instant toInstantOrNull();

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/time/InstantParseResult$Success;", "Lkotlin/time/InstantParseResult;", "", "epochSeconds", "", "nanosecondsOfSecond", "<init>", "(JI)V", "Lkotlin/time/Instant;", "toInstant", "()Lkotlin/time/Instant;", "toInstantOrNull", "J", "getEpochSeconds", "()J", com.visa.cbp.getEncExpo.warmup, "getNanosecondsOfSecond", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Success implements kotlin.time.InstantParseResult {
        private final long epochSeconds;
        private final int nanosecondsOfSecond;

        public Success(long j, int i) {
            this.epochSeconds = j;
            this.nanosecondsOfSecond = i;
        }

        public final long getEpochSeconds() {
            return this.epochSeconds;
        }

        public final int getNanosecondsOfSecond() {
            return this.nanosecondsOfSecond;
        }

        @Override // kotlin.time.InstantParseResult
        public final kotlin.time.Instant toInstant() {
            if (this.epochSeconds < kotlin.time.Instant.INSTANCE.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > kotlin.time.Instant.INSTANCE.getMAX$kotlin_stdlib().getEpochSeconds()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The parsed date is outside the range representable by Instant (Unix epoch second ");
                sb.append(this.epochSeconds);
                sb.append(')');
                throw new kotlin.time.InstantFormatException(sb.toString());
            }
            return kotlin.time.Instant.INSTANCE.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }

        @Override // kotlin.time.InstantParseResult
        public final kotlin.time.Instant toInstantOrNull() {
            if (this.epochSeconds < kotlin.time.Instant.INSTANCE.getMIN$kotlin_stdlib().getEpochSeconds() || this.epochSeconds > kotlin.time.Instant.INSTANCE.getMAX$kotlin_stdlib().getEpochSeconds()) {
                return null;
            }
            return kotlin.time.Instant.INSTANCE.fromEpochSeconds(this.epochSeconds, this.nanosecondsOfSecond);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/time/InstantParseResult$Failure;", "Lkotlin/time/InstantParseResult;", "", "error", "", "input", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Lkotlin/time/Instant;", "toInstant", "()Lkotlin/time/Instant;", "toInstantOrNull", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "getInput", "()Ljava/lang/CharSequence;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Failure implements kotlin.time.InstantParseResult {
        private final java.lang.String error;
        private final java.lang.CharSequence input;

        @Override // kotlin.time.InstantParseResult
        public final kotlin.time.Instant toInstantOrNull() {
            return null;
        }

        public Failure(java.lang.String str, java.lang.CharSequence charSequence) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
            this.error = str;
            this.input = charSequence;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.CharSequence getInput() {
            return this.input;
        }

        @Override // kotlin.time.InstantParseResult
        public final kotlin.time.Instant toInstant() {
            java.lang.String highSpeedVideoFpsRanges;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.error);
            sb.append(" when parsing an Instant from \"");
            highSpeedVideoFpsRanges = kotlin.time.InstantKt.getHighSpeedVideoFpsRanges(this.input, 64);
            sb.append(highSpeedVideoFpsRanges);
            sb.append('\"');
            throw new kotlin.time.InstantFormatException(sb.toString());
        }
    }
}
