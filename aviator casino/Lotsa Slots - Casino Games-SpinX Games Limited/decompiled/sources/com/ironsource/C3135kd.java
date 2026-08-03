package com.ironsource;

/* renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3135kd implements com.ironsource.L7, com.ironsource.L7.a {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6346a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final java.lang.String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final java.lang.String c = "CappingManager.IS_PACING_ENABLED";
    private static final java.lang.String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final java.lang.String e = "CappingManager.CAPPING_TYPE";
    private static final java.lang.String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final java.lang.String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final java.lang.String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final java.lang.String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* renamed from: com.ironsource.kd$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6347a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3153ld.values().length];
            f6347a = iArr;
            try {
                iArr[com.ironsource.EnumC3153ld.PER_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6347a[com.ironsource.EnumC3153ld.PER_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.ironsource.kd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.L7
    public synchronized com.ironsource.C3135kd.b a(android.content.Context context, com.ironsource.AbstractC3179n3 abstractC3179n3, com.ironsource.mediationsdk.IronSource.a aVar) {
        if (context == null) {
            return com.ironsource.C3135kd.b.NOT_CAPPED;
        }
        if (abstractC3179n3 == null) {
            return com.ironsource.C3135kd.b.NOT_CAPPED;
        }
        java.lang.String a2 = a(aVar);
        if (abstractC3179n3.c() == null) {
            return com.ironsource.C3135kd.b.NOT_CAPPED;
        }
        if (abstractC3179n3.a() == null) {
            return com.ironsource.C3135kd.b.NOT_CAPPED;
        }
        return b(context, a2, abstractC3179n3.c());
    }

    @Override // com.ironsource.L7.a
    public synchronized void b(android.content.Context context, com.ironsource.AbstractC3179n3 abstractC3179n3, com.ironsource.mediationsdk.IronSource.a aVar) {
        if (context == null || abstractC3179n3 == null) {
            return;
        }
        com.ironsource.C3082hd a2 = abstractC3179n3.a();
        if (a2 == null) {
            return;
        }
        a(context, a(aVar), abstractC3179n3.c(), a2);
    }

    @Override // com.ironsource.L7
    public synchronized boolean c(android.content.Context context, com.ironsource.AbstractC3179n3 abstractC3179n3, com.ironsource.mediationsdk.IronSource.a aVar) {
        return a(context, abstractC3179n3, aVar) != com.ironsource.C3135kd.b.NOT_CAPPED;
    }

    private com.ironsource.C3135kd.b b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, f6346a, str2), true)) {
            return com.ironsource.C3135kd.b.CAPPED_PER_DELIVERY;
        }
        if (com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, c, str2), false)) {
            if (currentTimeMillis - com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, i, str2), 0L) < com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, f, str2), 0) * 1000) {
                return com.ironsource.C3135kd.b.CAPPED_PER_PACE;
            }
        }
        if (com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, b, str2), false)) {
            int a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, d, str2), 0);
            java.lang.String a3 = a(str, g, str2);
            int a4 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a3, 0);
            java.lang.String a5 = a(str, h, str2);
            if (currentTimeMillis >= com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a5, 0L)) {
                com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a3, 0);
                com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a5, 0L);
            } else if (a4 >= a2) {
                return com.ironsource.C3135kd.b.CAPPED_PER_COUNT;
            }
        }
        return com.ironsource.C3135kd.b.NOT_CAPPED;
    }

    @Override // com.ironsource.L7.a
    public synchronized void a(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    private void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.ironsource.EnumC3153ld enumC3153ld;
        int i2 = 0;
        if (com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, c, str2), false)) {
            com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, i, str2), java.lang.System.currentTimeMillis());
        }
        if (com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a(str, b, str2), false)) {
            java.lang.String a2 = a(str, g, str2);
            int a3 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, a2, 0);
            if (a3 == 0) {
                java.lang.String c2 = com.ironsource.mediationsdk.utils.IronSourceUtils.c(context, a(str, e, str2), com.ironsource.EnumC3153ld.PER_DAY.toString());
                com.ironsource.EnumC3153ld[] values = com.ironsource.EnumC3153ld.values();
                int length = values.length;
                while (true) {
                    if (i2 >= length) {
                        enumC3153ld = null;
                        break;
                    }
                    enumC3153ld = values[i2];
                    if (enumC3153ld.f6371a.equals(c2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, h, str2), a(enumC3153ld));
            }
            com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a2, a3 + 1);
        }
    }

    private long a(com.ironsource.EnumC3153ld enumC3153ld) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        int i2 = com.ironsource.C3135kd.a.f6347a[enumC3153ld.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.ironsource.C3082hd c3082hd) {
        boolean e2 = c3082hd.e();
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, f6346a, str2), e2);
        if (e2) {
            boolean d2 = c3082hd.d();
            com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, b, str2), d2);
            if (d2) {
                com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, d, str2), c3082hd.b());
                com.ironsource.mediationsdk.utils.IronSourceUtils.f(context, a(str, e, str2), c3082hd.a().toString());
            }
            boolean f2 = c3082hd.f();
            com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, c, str2), f2);
            if (f2) {
                com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, a(str, f, str2), c3082hd.c());
            }
        }
    }

    private java.lang.String a(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) {
            return com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD) {
            return com.ironsource.mediationsdk.utils.IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
