package androidx.compose.ui.platform;

/* compiled from: AndroidClipboardManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncodeHelper {
    public static final int $stable = 8;
    private android.os.Parcel parcel = android.os.Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = android.os.Parcel.obtain();
    }

    public final java.lang.String encodedString() {
        return android.util.Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void encode(androidx.compose.ui.text.SpanStyle spanStyle) {
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(spanStyle.m3923getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m3734encode8_81llA(spanStyle.m3923getColor0d7_KjU());
        }
        if (!androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(spanStyle.getFontSize(), androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m3731encodeR2X_6o(spanStyle.getFontSize());
        }
        androidx.compose.ui.text.font.FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        androidx.compose.ui.text.font.FontStyle fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int m4079unboximpl = fontStyle.m4079unboximpl();
            encode((byte) 4);
            m3736encodenzbMABs(m4079unboximpl);
        }
        androidx.compose.ui.text.font.FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value = fontSynthesis.getValue();
            encode((byte) 5);
            m3733encode6p3vJLY(value);
        }
        java.lang.String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!androidx.compose.ui.unit.TextUnit.m4670equalsimpl0(spanStyle.getLetterSpacing(), androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m3731encodeR2X_6o(spanStyle.getLetterSpacing());
        }
        androidx.compose.ui.text.style.BaselineShift baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float m4250unboximpl = baselineShift.m4250unboximpl();
            encode((byte) 8);
            m3732encode4Dl_Bck(m4250unboximpl);
        }
        androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(spanStyle.getBackground(), androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m3734encode8_81llA(spanStyle.getBackground());
        }
        androidx.compose.ui.text.style.TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(com.google.common.base.Ascii.VT);
            encode(textDecoration);
        }
        androidx.compose.ui.graphics.Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(com.google.common.base.Ascii.FF);
            encode(shadow);
        }
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m3734encode8_81llA(long color) {
        m3735encodeVKZWuLQ(color);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m3731encodeR2X_6o(long textUnit) {
        long m4672getTypeUIouoOA = androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(textUnit);
        byte b = 0;
        if (!androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4672getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4707getUnspecifiedUIouoOA())) {
            if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4672getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4706getSpUIouoOA())) {
                b = 1;
            } else if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(m4672getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m4705getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (androidx.compose.ui.unit.TextUnitType.m4701equalsimpl0(androidx.compose.ui.unit.TextUnit.m4672getTypeUIouoOA(textUnit), androidx.compose.ui.unit.TextUnitType.INSTANCE.m4707getUnspecifiedUIouoOA())) {
            return;
        }
        encode(androidx.compose.ui.unit.TextUnit.m4673getValueimpl(textUnit));
    }

    public final void encode(androidx.compose.ui.text.font.FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m3736encodenzbMABs(int fontStyle) {
        byte b = 0;
        if (!androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(fontStyle, androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA()) && androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(fontStyle, androidx.compose.ui.text.font.FontStyle.INSTANCE.m4082getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m3733encode6p3vJLY(int fontSynthesis) {
        byte b = 0;
        if (!androidx.compose.ui.text.font.FontSynthesis.m4087equalsimpl0(fontSynthesis, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4094getNoneGVVA2EU())) {
            if (androidx.compose.ui.text.font.FontSynthesis.m4087equalsimpl0(fontSynthesis, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4093getAllGVVA2EU())) {
                b = 1;
            } else if (androidx.compose.ui.text.font.FontSynthesis.m4087equalsimpl0(fontSynthesis, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4096getWeightGVVA2EU())) {
                b = 2;
            } else if (androidx.compose.ui.text.font.FontSynthesis.m4087equalsimpl0(fontSynthesis, androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m4095getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m3732encode4Dl_Bck(float baselineShift) {
        encode(baselineShift);
    }

    public final void encode(androidx.compose.ui.text.style.TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(androidx.compose.ui.text.style.TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(androidx.compose.ui.graphics.Shadow shadow) {
        m3734encode8_81llA(shadow.getColor());
        encode(androidx.compose.ui.geometry.Offset.m1871getXimpl(shadow.getOffset()));
        encode(androidx.compose.ui.geometry.Offset.m1872getYimpl(shadow.getOffset()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte r2) {
        this.parcel.writeByte(r2);
    }

    public final void encode(int r2) {
        this.parcel.writeInt(r2);
    }

    public final void encode(float r2) {
        this.parcel.writeFloat(r2);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m3735encodeVKZWuLQ(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void encode(java.lang.String string) {
        this.parcel.writeString(string);
    }
}
