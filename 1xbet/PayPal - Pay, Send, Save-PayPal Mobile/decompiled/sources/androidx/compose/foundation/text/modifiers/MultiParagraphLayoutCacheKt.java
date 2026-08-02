package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "p0", "getHighSpeedVideoSizes", "(JJ)J", "Camera2StreamConfigurationMap", "J", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long Camera2StreamConfigurationMap = androidx.compose.ui.unit.TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoSizes(long j, long j2) {
        if (androidx.compose.ui.unit.TextUnit.m8797isEmimpl(j2)) {
            if (androidx.compose.ui.unit.TextUnit.m8797isEmimpl(j)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot convert Em to Px when style.fontSize is Em (");
                sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(j2));
                sb.append("). Please declare the style.fontSize with Sp units instead.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j) == 0) {
                long j3 = Camera2StreamConfigurationMap;
                float m8795getValueimpl = androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j2);
                androidx.compose.ui.unit.TextUnitKt.m8808checkArithmeticR2X_6o(j3);
                return androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j3), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j3) * m8795getValueimpl);
            }
            float m8795getValueimpl2 = androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j2);
            androidx.compose.ui.unit.TextUnitKt.m8808checkArithmeticR2X_6o(j);
            return androidx.compose.ui.unit.TextUnitKt.pack(androidx.compose.ui.unit.TextUnit.m8793getRawTypeimpl(j), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(j) * m8795getValueimpl2);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The multiplier must be in em, but was ");
        sb2.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(j2));
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
