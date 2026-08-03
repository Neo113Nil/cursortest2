package androidx.compose.ui.platform;

/* compiled from: AndroidClipboardManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0015\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0013\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J\n\u0010#\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\u0013\u0010(\u001a\u00020)ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u0012J\u0015\u0010+\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "string", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "dataAvailable", "", "decodeBaselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "decodeBaselineShift-y9eOQZs", "()F", "decodeByte", "", "decodeColor", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeFloat", "", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "decodeInt", "decodeShadow", "Landroidx/compose/ui/graphics/Shadow;", "decodeSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "decodeString", "decodeTextDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "decodeTextGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "decodeTextUnit", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeULong", "Lkotlin/ULong;", "decodeULong-s-VKNKU", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;
    private final android.os.Parcel parcel;

    public DecodeHelper(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = android.util.Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final androidx.compose.ui.text.SpanStyle decodeSpanStyle() {
        androidx.compose.ui.platform.MutableSpanStyle mutableSpanStyle;
        androidx.compose.ui.platform.MutableSpanStyle mutableSpanStyle2 = r15;
        androidx.compose.ui.platform.MutableSpanStyle mutableSpanStyle3 = new androidx.compose.ui.platform.MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte != 1) {
                mutableSpanStyle = mutableSpanStyle2;
                if (decodeByte == 2) {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m3751setFontSizeR2X_6o(m3723decodeTextUnitXSAIIZE());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 3) {
                    if (dataAvailable() < 4) {
                        break;
                    }
                    mutableSpanStyle.setFontWeight(decodeFontWeight());
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte == 4) {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m3752setFontStylemLjRB2g(androidx.compose.ui.text.font.FontStyle.m4073boximpl(m3721decodeFontStyle_LCdwA()));
                    mutableSpanStyle2 = mutableSpanStyle;
                } else if (decodeByte != 5) {
                    if (decodeByte != 6) {
                        if (decodeByte != 7) {
                            if (decodeByte != 8) {
                                if (decodeByte != 9) {
                                    if (decodeByte != 10) {
                                        if (decodeByte != 11) {
                                            if (decodeByte == 12) {
                                                if (dataAvailable() < 20) {
                                                    break;
                                                }
                                                mutableSpanStyle.setShadow(decodeShadow());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                        }
                                    } else {
                                        if (dataAvailable() < 8) {
                                            break;
                                        }
                                        mutableSpanStyle.m3748setBackground8_81llA(m3720decodeColor0d7_KjU());
                                    }
                                } else {
                                    if (dataAvailable() < 8) {
                                        break;
                                    }
                                    mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                }
                            } else {
                                if (dataAvailable() < 4) {
                                    break;
                                }
                                mutableSpanStyle.m3749setBaselineShift_isdbwI(androidx.compose.ui.text.style.BaselineShift.m4244boximpl(m3718decodeBaselineShifty9eOQZs()));
                            }
                        } else {
                            if (dataAvailable() < 5) {
                                break;
                            }
                            mutableSpanStyle.m3754setLetterSpacingR2X_6o(m3723decodeTextUnitXSAIIZE());
                        }
                    } else {
                        mutableSpanStyle.setFontFeatureSettings(decodeString());
                    }
                    mutableSpanStyle2 = mutableSpanStyle;
                } else {
                    if (dataAvailable() < 1) {
                        break;
                    }
                    mutableSpanStyle.m3753setFontSynthesistDdu0R4(androidx.compose.ui.text.font.FontSynthesis.m4084boximpl(m3722decodeFontSynthesisGVVA2EU()));
                    mutableSpanStyle2 = mutableSpanStyle;
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle2.m3750setColor8_81llA(m3720decodeColor0d7_KjU());
            }
        }
        mutableSpanStyle = mutableSpanStyle2;
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m3720decodeColor0d7_KjU() {
        return androidx.compose.ui.graphics.Color.m2109constructorimpl(m3719decodeULongsVKNKU());
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m3723decodeTextUnitXSAIIZE() {
        long m4707getUnspecifiedUIouoOA;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            m4707getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA();
        } else if (decodeByte == 2) {
            m4707getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m4705getEmUIouoOA();
        } else {
            m4707getUnspecifiedUIouoOA = androidx.compose.ui.unit.TextUnitType.INSTANCE.m4707getUnspecifiedUIouoOA();
        }
        if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4707getUnspecifiedUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4707getUnspecifiedUIouoOA())) {
            return androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE();
        }
        return androidx.compose.ui.unit.TextUnitKt.m4685TextUnitanM5pPY(decodeFloat(), m4707getUnspecifiedUIouoOA);
    }

    public final androidx.compose.ui.text.font.FontWeight decodeFontWeight() {
        return new androidx.compose.ui.text.font.FontWeight(decodeInt());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m3721decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return androidx.compose.ui.text.font.FontStyle.INSTANCE.m4082getItalic_LCdwA();
        }
        return androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m3722decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4094getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4095getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4096getWeightGVVA2EU();
        }
        return androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4094getNoneGVVA2EU();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m3718decodeBaselineShifty9eOQZs() {
        return androidx.compose.ui.text.style.BaselineShift.m4245constructorimpl(decodeFloat());
    }

    private final androidx.compose.ui.text.style.TextGeometricTransform decodeTextGeometricTransform() {
        return new androidx.compose.ui.text.style.TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    private final androidx.compose.ui.text.style.TextDecoration decodeTextDecoration() {
        int decodeInt = decodeInt();
        boolean z = (androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough().getMask() & decodeInt) != 0;
        boolean z2 = (decodeInt & androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline().getMask()) != 0;
        if (z && z2) {
            return androidx.compose.ui.text.style.TextDecoration.INSTANCE.combine(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.style.TextDecoration[]{androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough(), androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline()}));
        }
        if (z) {
            return androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough();
        }
        if (z2) {
            return androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline();
        }
        return androidx.compose.ui.text.style.TextDecoration.INSTANCE.getNone();
    }

    private final androidx.compose.ui.graphics.Shadow decodeShadow() {
        return new androidx.compose.ui.graphics.Shadow(m3720decodeColor0d7_KjU(), androidx.compose.ui.geometry.OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m3719decodeULongsVKNKU() {
        return kotlin.ULong.m10975constructorimpl(this.parcel.readLong());
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final java.lang.String decodeString() {
        return this.parcel.readString();
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }
}
