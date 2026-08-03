package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Be implements io.appmetrica.analytics.impl.InterfaceC0474k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4119a = 10;

    /* renamed from: b, reason: collision with root package name */
    public final int f4120b = 13;

    /* renamed from: c, reason: collision with root package name */
    public final y1.f f4121c = new y1.f("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC0474k2
    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String sb2 = sb.toString();
        int length2 = sb2.length();
        java.lang.Character N2 = y1.g.N(str);
        java.lang.Character N3 = y1.g.N(sb2);
        if (length2 >= this.f4119a && length2 <= this.f4120b && (N3 == null || N3.charValue() != '0')) {
            y1.f fVar = this.f4121c;
            fVar.getClass();
            if (fVar.f8503a.matcher(str).matches()) {
                if (length2 == 10 && (N2 == null || N2.charValue() != '+')) {
                    return "7".concat(sb2);
                }
                if (length2 == 11) {
                    if (N2 != null && N2.charValue() == '+' && N3 != null && N3.charValue() == '8') {
                        return null;
                    }
                    if (N3 != null && N3.charValue() == '8') {
                        return "7" + sb2.substring(1);
                    }
                }
                if (length2 < 12 || N2 == null || N2.charValue() != '+' || N3 == null || N3.charValue() != '7') {
                    return sb2;
                }
                return null;
            }
        }
        return null;
    }
}
