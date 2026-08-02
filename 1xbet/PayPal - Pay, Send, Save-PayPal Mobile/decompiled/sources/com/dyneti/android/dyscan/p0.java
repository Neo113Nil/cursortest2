package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class p0 {
    public static final java.lang.String[] e = {"MM/yy", "MM/dd/yy", "MM.yy", "MM.yyyy"};
    public static final com.dyneti.android.dyscan.n0 f = new com.dyneti.android.dyscan.n0();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Date f3330a;
    public final boolean b;
    public com.dyneti.android.dyscan.l c;
    public final boolean d;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(java.lang.String str, com.dyneti.android.dyscan.l lVar) {
        this.f3330a = null;
        java.lang.String replace = str.replace("-", androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        java.lang.String[] strArr = e;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            java.lang.String str2 = strArr[i];
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str2, java.util.Locale.US);
            if (str2.length() == str.length()) {
                try {
                    int parseInt = java.lang.Integer.parseInt(replace.substring(0, 2));
                    if (parseInt <= 12 && parseInt > 0) {
                        java.util.Date parse = simpleDateFormat.parse(replace);
                        this.f3330a = parse;
                        try {
                            if (!str2.contains("d")) {
                                break;
                            }
                            this.d = true;
                            java.util.Calendar calendar = java.util.Calendar.getInstance();
                            calendar.setTime(parse);
                            int i2 = calendar.get(2);
                            calendar.add(5, 1);
                            if (i2 == calendar.get(2)) {
                                z2 = false;
                            }
                        } catch (java.lang.NumberFormatException | java.text.ParseException unused) {
                            z2 = true;
                        }
                    }
                } catch (java.lang.NumberFormatException | java.text.ParseException unused2) {
                    continue;
                }
            }
            i++;
        }
        if (z2) {
            java.util.Date date = new java.util.Date();
            java.util.Date date2 = this.f3330a;
            if (!this.d) {
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                calendar2.setTime(this.f3330a);
                calendar2.add(2, 1);
                date2 = calendar2.getTime();
            }
            long time = date2.getTime() - date.getTime();
            if (time >= 0 && time <= 252288000000L) {
                z = true;
            }
        }
        this.b = z;
        this.c = lVar;
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(this.f3330a);
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = i % 100;
        java.lang.StringBuilder sb2 = i3 < 10 ? new java.lang.StringBuilder("0") : new java.lang.StringBuilder("");
        sb2.append(i3);
        java.lang.String obj = sb2.toString();
        if (i2 < 10) {
            sb = new java.lang.StringBuilder("0");
            sb.append(i2);
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("");
            sb3.append(i2);
            sb = sb3;
        }
        java.lang.String obj2 = sb.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj2);
        sb4.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb4.append(obj);
        return sb4.toString();
    }

    public p0() {
        this.f3330a = null;
    }
}
