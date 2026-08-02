package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class LegendEntry {
    public com.github.mikephil.charting.components.Legend.LegendForm form;
    public int formColor;
    public android.graphics.DashPathEffect formLineDashEffect;
    public float formLineWidth;
    public float formSize;
    public java.lang.String label;

    public LegendEntry() {
        this.form = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT;
        this.formSize = Float.NaN;
        this.formLineWidth = Float.NaN;
        this.formLineDashEffect = null;
        this.formColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE;
    }

    public LegendEntry(java.lang.String str, com.github.mikephil.charting.components.Legend.LegendForm legendForm, float f, float f2, android.graphics.DashPathEffect dashPathEffect, int i) {
        com.github.mikephil.charting.components.Legend.LegendForm legendForm2 = com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT;
        this.label = str;
        this.form = legendForm;
        this.formSize = f;
        this.formLineWidth = f2;
        this.formLineDashEffect = dashPathEffect;
        this.formColor = i;
    }
}
