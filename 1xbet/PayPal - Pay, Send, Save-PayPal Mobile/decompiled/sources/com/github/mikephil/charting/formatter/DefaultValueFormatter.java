package com.github.mikephil.charting.formatter;

/* loaded from: classes8.dex */
public class DefaultValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
    protected int mDecimalDigits;
    protected java.text.DecimalFormat mFormat;

    public DefaultValueFormatter(int i) {
        setup(i);
    }

    public void setup(int i) {
        this.mDecimalDigits = i;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.mFormat = new java.text.DecimalFormat(sb.toString());
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public java.lang.String getFormattedValue(float f) {
        return this.mFormat.format(f);
    }

    public int getDecimalDigits() {
        return this.mDecimalDigits;
    }
}
