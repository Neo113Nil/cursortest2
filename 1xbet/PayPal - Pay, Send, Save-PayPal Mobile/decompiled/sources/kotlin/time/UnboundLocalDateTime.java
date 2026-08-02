package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class UnboundLocalDateTime {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.UnboundLocalDateTime.Companion INSTANCE = new kotlin.time.UnboundLocalDateTime.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final int getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final int getInputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    final int getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    final int getHighResolutionOutputSizeshNQ4ISI;

    public UnboundLocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getHighSpeedVideoFpsRanges = i4;
        this.getHighSpeedVideoSizes = i5;
        this.getOutputFormats = i6;
        this.getInputSizeshNQ4ISI = i7;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UnboundLocalDateTime(");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append('-');
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append('-');
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(' ');
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(this.getOutputFormats);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "Lkotlin/time/Instant;", "instant", "Lkotlin/time/UnboundLocalDateTime;", "fromInstant", "(Lkotlin/time/Instant;)Lkotlin/time/UnboundLocalDateTime;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.time.UnboundLocalDateTime fromInstant(kotlin.time.Instant instant) {
            long j;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
            long epochSeconds = instant.getEpochSeconds();
            long j2 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j2 * 86400 != epochSeconds) {
                j2--;
            }
            long j3 = epochSeconds % 86400;
            int i = (int) (j3 + (86400 & (((j3 ^ 86400) & ((-j3) | j3)) >> 63)));
            long j4 = 719468 + j2;
            if (j4 < 0) {
                long j5 = ((j2 + 719469) / 146097) - 1;
                j = j5 * 400;
                j4 += (-j5) * 146097;
            } else {
                j = 0;
            }
            long j6 = ((j4 * 400) + 591) / 146097;
            long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            if (j7 < 0) {
                j6--;
                j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
            }
            int i2 = (int) j7;
            int i3 = ((i2 * 5) + 2) / 153;
            int i4 = i / 3600;
            int i5 = i - (i4 * 3600);
            int i6 = i5 / 60;
            return new kotlin.time.UnboundLocalDateTime((int) (j6 + j + (i3 / 10)), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1, i4, i6, i5 - (i6 * 60), instant.getNanosecondsOfSecond());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
