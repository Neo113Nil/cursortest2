package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3801a;
    public final java.lang.String b;
    public int c;
    public final int d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(java.lang.String str, java.lang.String str2) {
        int i;
        java.lang.String str3;
        int parseInt;
        this.f3801a = str;
        this.b = str2;
        int i2 = -1;
        if (!android.text.TextUtils.isEmpty(str2) && !str2.startsWith("-")) {
            if (str2.endsWith("%") && str2.endsWith("%")) {
                try {
                    parseInt = android.text.TextUtils.isEmpty(str2) ? -1 : java.lang.Integer.parseInt(str2.substring(0, str2.length() - 1));
                } catch (java.lang.NumberFormatException e) {
                    com.fyber.inneractive.sdk.util.IAlog.f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e.getMessage());
                }
                if (parseInt >= 0 && parseInt <= 100) {
                    i = 1;
                    this.d = i;
                    if (i == 2 && (str3 = this.b) != null) {
                        java.util.ArrayList a2 = a(str3);
                        i2 = ((java.lang.Integer) a2.get(3)).intValue() + ((((java.lang.Integer) a2.get(2)).intValue() + (((java.lang.Integer) a2.get(1)).intValue() * 60) + (((java.lang.Integer) a2.get(0)).intValue() * 3600)) * 1000);
                    }
                    this.c = i2;
                }
            }
            if (str2.contains(":")) {
                java.util.ArrayList a3 = a(str2);
                if (!a3.isEmpty() && ((java.lang.Integer) a3.get(0)).intValue() >= 0 && ((java.lang.Integer) a3.get(1)).intValue() >= 0 && ((java.lang.Integer) a3.get(2)).intValue() >= 0 && ((java.lang.Integer) a3.get(3)).intValue() >= 0) {
                    i = 2;
                    this.d = i;
                    if (i == 2) {
                        java.util.ArrayList a22 = a(str3);
                        i2 = ((java.lang.Integer) a22.get(3)).intValue() + ((((java.lang.Integer) a22.get(2)).intValue() + (((java.lang.Integer) a22.get(1)).intValue() * 60) + (((java.lang.Integer) a22.get(0)).intValue() * 3600)) * 1000);
                    }
                    this.c = i2;
                }
            }
        }
        i = 0;
        this.d = i;
        if (i == 2) {
        }
        this.c = i2;
    }

    public static java.util.ArrayList a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str == null) {
            return arrayList;
        }
        java.lang.String[] split = str.split(":");
        if (split.length != 3) {
            return arrayList;
        }
        java.lang.String str2 = split[0];
        java.lang.String str3 = split[1];
        java.lang.String[] split2 = split[2].split("\\.");
        java.lang.String str4 = split2[0];
        java.lang.String str5 = split2.length > 1 ? split2[1] : "000";
        try {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str4)));
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str5)));
            return arrayList;
        } catch (java.lang.NumberFormatException e) {
            com.fyber.inneractive.sdk.util.IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e.getMessage());
            return new java.util.ArrayList();
        }
    }
}
