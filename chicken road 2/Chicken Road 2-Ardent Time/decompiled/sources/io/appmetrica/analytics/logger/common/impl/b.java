package io.appmetrica.analytics.logger.common.impl;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.common.impl.e f7273a;

    public b() {
        this(new io.appmetrica.analytics.logger.common.impl.e());
    }

    public final java.util.ArrayList a(java.lang.String str) {
        java.lang.String[] split = str.split("\\n");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : split) {
            int i2 = 0;
            while (str2.length() > i2) {
                int length = str2.length();
                int i3 = i2 + 3800;
                int min = java.lang.Math.min(length, i3);
                if (length > i3) {
                    int a2 = io.appmetrica.analytics.logger.common.impl.e.a(this.f7273a.f7278a.matcher(str2), i2, min);
                    length = a2 == -1 ? min : a2 + 1;
                }
                arrayList.add(str2.substring(i2, length));
                i2 = length;
            }
        }
        return arrayList;
    }

    public b(io.appmetrica.analytics.logger.common.impl.e eVar) {
        this.f7273a = eVar;
    }
}
