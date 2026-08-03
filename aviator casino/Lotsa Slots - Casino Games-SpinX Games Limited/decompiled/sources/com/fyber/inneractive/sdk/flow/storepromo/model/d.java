package com.fyber.inneractive.sdk.flow.storepromo.model;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3751a;
    public final java.lang.String b;
    public final java.lang.String c;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        this.c = "";
        this.f3751a = str;
        this.b = str2;
        com.fyber.inneractive.sdk.util.h hVar = new com.fyber.inneractive.sdk.util.h(str3);
        if (hVar.f4293a == null) {
            str4 = "N/A";
        } else {
            double longValue = r11.longValue() / 1024.0d;
            double d = longValue / 1024.0d;
            double d2 = d / 1024.0d;
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#.##");
            java.lang.String str5 = decimalFormat.format(hVar.f4293a) + " bytes";
            if (d > 850.0d) {
                str4 = decimalFormat.format(d2) + " GB";
            } else if (longValue > 850.0d) {
                str4 = decimalFormat.format(d) + " MB";
            } else if (hVar.f4293a.longValue() > 850) {
                str4 = decimalFormat.format(longValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.c = str4;
    }
}
