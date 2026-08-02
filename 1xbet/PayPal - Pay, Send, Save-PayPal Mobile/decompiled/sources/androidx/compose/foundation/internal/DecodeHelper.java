package androidx.compose.foundation.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/internal/DecodeHelper;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroid/os/Parcel;", "Camera2StreamConfigurationMap", "Landroid/os/Parcel;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodeHelper {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.os.Parcel getHighSpeedVideoSizes;

    public DecodeHelper(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.getHighSpeedVideoSizes = obtain;
        byte[] decode = android.util.Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final androidx.compose.ui.text.SpanStyle decodeSpanStyle() {
        androidx.compose.foundation.internal.MutableSpanStyle mutableSpanStyle;
        androidx.compose.ui.text.style.TextDecoration none;
        androidx.compose.foundation.internal.MutableSpanStyle mutableSpanStyle2 = r15;
        androidx.compose.foundation.internal.MutableSpanStyle mutableSpanStyle3 = new androidx.compose.foundation.internal.MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null);
        while (this.getHighSpeedVideoSizes.dataAvail() > 1) {
            byte readByte = this.getHighSpeedVideoSizes.readByte();
            if (readByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (readByte == 2) {
                    if (this.getHighSpeedVideoSizes.dataAvail() < 5) {
                        break;
                    }
                    mutableSpanStyle.getHighSpeedVideoSizes = m1572decodeTextUnitXSAIIZE();
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (readByte == 3) {
                    if (this.getHighSpeedVideoSizes.dataAvail() < 4) {
                        break;
                    }
                    mutableSpanStyle.getHighSpeedVideoFpsRanges = decodeFontWeight();
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (readByte == 4) {
                    if (this.getHighSpeedVideoSizes.dataAvail() <= 0) {
                        break;
                    }
                    mutableSpanStyle.Camera2StreamConfigurationMap = androidx.compose.ui.text.font.FontStyle.m8149boximpl(m1570decodeFontStyle_LCdwA());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (readByte != 5) {
                    if (readByte != 6) {
                        if (readByte != 7) {
                            if (readByte != 8) {
                                if (readByte != 9) {
                                    if (readByte != 10) {
                                        if (readByte != 11) {
                                            if (readByte == 12) {
                                                if (this.getHighSpeedVideoSizes.dataAvail() < 20) {
                                                    break;
                                                }
                                                mutableSpanStyle.getOutputSizeshNQ4ISI = new androidx.compose.ui.graphics.Shadow(m1569decodeColor0d7_KjU(), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(this.getHighSpeedVideoSizes.readFloat()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(this.getHighSpeedVideoSizes.readFloat()) << 32)), this.getHighSpeedVideoSizes.readFloat(), null);
                                            }
                                        } else {
                                            if (this.getHighSpeedVideoSizes.dataAvail() < 4) {
                                                break;
                                            }
                                            int readInt = this.getHighSpeedVideoSizes.readInt();
                                            boolean z = (androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough().getMask() & readInt) != 0;
                                            boolean z2 = (readInt & androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline().getMask()) != 0;
                                            if (z && z2) {
                                                none = androidx.compose.ui.text.style.TextDecoration.INSTANCE.combine(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.style.TextDecoration[]{androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough(), androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline()}));
                                            } else if (z) {
                                                none = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough();
                                            } else if (z2) {
                                                none = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline();
                                            } else {
                                                none = androidx.compose.ui.text.style.TextDecoration.INSTANCE.getNone();
                                            }
                                            mutableSpanStyle.getOutputStallDuration = none;
                                        }
                                    } else {
                                        if (this.getHighSpeedVideoSizes.dataAvail() < 8) {
                                            break;
                                        }
                                        mutableSpanStyle.getOutputMinFrameDurationlomOqCM = m1569decodeColor0d7_KjU();
                                    }
                                } else {
                                    if (this.getHighSpeedVideoSizes.dataAvail() < 8) {
                                        break;
                                    }
                                    mutableSpanStyle.getOutputMinFrameDuration = new androidx.compose.ui.text.style.TextGeometricTransform(this.getHighSpeedVideoSizes.readFloat(), this.getHighSpeedVideoSizes.readFloat());
                                }
                            } else {
                                if (this.getHighSpeedVideoSizes.dataAvail() < 4) {
                                    break;
                                }
                                mutableSpanStyle.getInputSizeshNQ4ISI = androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(this.getHighSpeedVideoSizes.readFloat()));
                            }
                        } else {
                            if (this.getHighSpeedVideoSizes.dataAvail() < 5) {
                                break;
                            }
                            mutableSpanStyle.getHighSpeedVideoSizesFor = m1572decodeTextUnitXSAIIZE();
                        }
                    } else {
                        mutableSpanStyle.getOutputFormats = this.getHighSpeedVideoSizes.readString();
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (this.getHighSpeedVideoSizes.dataAvail() <= 0) {
                        break;
                    }
                    mutableSpanStyle.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.text.font.FontSynthesis.m8160boximpl(m1571decodeFontSynthesisGVVA2EU());
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            } else {
                if (this.getHighSpeedVideoSizes.dataAvail() < 8) {
                    break;
                }
                mutableSpanStyle2.getHighResolutionOutputSizeshNQ4ISI = m1569decodeColor0d7_KjU();
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return new androidx.compose.ui.text.SpanStyle(mutableSpanStyle.getHighResolutionOutputSizeshNQ4ISI, mutableSpanStyle.getHighSpeedVideoSizes, mutableSpanStyle.getHighSpeedVideoFpsRanges, mutableSpanStyle.Camera2StreamConfigurationMap, mutableSpanStyle.getHighSpeedVideoFpsRangesFor, mutableSpanStyle.getInputFormats, mutableSpanStyle.getOutputFormats, mutableSpanStyle.getHighSpeedVideoSizesFor, mutableSpanStyle.getInputSizeshNQ4ISI, mutableSpanStyle.getOutputMinFrameDuration, mutableSpanStyle.getOutputSizes, mutableSpanStyle.getOutputMinFrameDurationlomOqCM, mutableSpanStyle.getOutputStallDuration, mutableSpanStyle.getOutputSizeshNQ4ISI, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 49152, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m1569decodeColor0d7_KjU() {
        return androidx.compose.ui.graphics.AndroidColor_androidKt.fromColorLong(androidx.compose.ui.graphics.Color.INSTANCE, this.getHighSpeedVideoSizes.readLong());
    }

    public final androidx.compose.ui.text.font.FontWeight decodeFontWeight() {
        return new androidx.compose.ui.text.font.FontWeight(this.getHighSpeedVideoSizes.readInt());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m1570decodeFontStyle_LCdwA() {
        byte readByte = this.getHighSpeedVideoSizes.readByte();
        if (readByte == 0) {
            return androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if (readByte == 1) {
            return androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA();
        }
        return androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m1571decodeFontSynthesisGVVA2EU() {
        byte readByte = this.getHighSpeedVideoSizes.readByte();
        if (readByte == 0) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8170getNoneGVVA2EU();
        }
        if (readByte == 1) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU();
        }
        if (readByte == 3) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8171getStyleGVVA2EU();
        }
        if (readByte == 2) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8172getWeightGVVA2EU();
        }
        return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8170getNoneGVVA2EU();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m1572decodeTextUnitXSAIIZE() {
        long m8829getUnspecifiedUIouoOA;
        byte readByte = this.getHighSpeedVideoSizes.readByte();
        if (readByte == 1) {
            m8829getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA();
        } else if (readByte == 2) {
            m8829getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m8827getEmUIouoOA();
        } else {
            m8829getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m8829getUnspecifiedUIouoOA();
        }
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(m8829getUnspecifiedUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m8829getUnspecifiedUIouoOA())) {
            return androidx.compose.ui.unit.TextUnit.INSTANCE.m8806getUnspecifiedXSAIIZE();
        }
        return androidx.compose.ui.unit.TextUnitKt.m8807TextUnitanM5pPY(this.getHighSpeedVideoSizes.readFloat(), m8829getUnspecifiedUIouoOA);
    }
}
