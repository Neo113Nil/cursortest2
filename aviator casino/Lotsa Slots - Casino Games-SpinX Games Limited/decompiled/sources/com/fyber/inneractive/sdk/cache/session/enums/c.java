package com.fyber.inneractive.sdk.cache.session.enums;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'REWARDED_VIDEO' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c[] $VALUES;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c BANNER_DISPLAY;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c INTERSTITIAL_DISPLAY;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c INTERSTITIAL_VIDEO;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c NONE;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c RECTANGLE_DISPLAY;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c REWARDED_DISPLAY;
    public static final com.fyber.inneractive.sdk.cache.session.enums.c REWARDED_VIDEO;
    private boolean mShouldCountCompletion;
    private com.fyber.inneractive.sdk.config.enums.UnitDisplayType mType;

    static {
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = new com.fyber.inneractive.sdk.cache.session.enums.c("REWARDED_VIDEO", 0, unitDisplayType, true);
        REWARDED_VIDEO = cVar;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar2 = new com.fyber.inneractive.sdk.cache.session.enums.c("INTERSTITIAL_VIDEO", 1, unitDisplayType2, true);
        INTERSTITIAL_VIDEO = cVar2;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar3 = new com.fyber.inneractive.sdk.cache.session.enums.c("RECTANGLE_DISPLAY", 2, com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT, false);
        RECTANGLE_DISPLAY = cVar3;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar4 = new com.fyber.inneractive.sdk.cache.session.enums.c("REWARDED_DISPLAY", 3, unitDisplayType, true);
        REWARDED_DISPLAY = cVar4;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar5 = new com.fyber.inneractive.sdk.cache.session.enums.c("BANNER_DISPLAY", 4, com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER, false);
        BANNER_DISPLAY = cVar5;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar6 = new com.fyber.inneractive.sdk.cache.session.enums.c("INTERSTITIAL_DISPLAY", 5, unitDisplayType2, false);
        INTERSTITIAL_DISPLAY = cVar6;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar7 = new com.fyber.inneractive.sdk.cache.session.enums.c("NONE", 6, com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT, false);
        NONE = cVar7;
        $VALUES = new com.fyber.inneractive.sdk.cache.session.enums.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    public c(java.lang.String str, int i, com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, boolean z) {
        this.mType = unitDisplayType;
        this.mShouldCountCompletion = z;
    }

    public static com.fyber.inneractive.sdk.cache.session.enums.c a(java.lang.String str, java.lang.String str2) {
        int i = com.fyber.inneractive.sdk.cache.session.enums.b.f3565a[com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(str).ordinal()];
        if (i == 1) {
            return str2.contains("video") ? REWARDED_VIDEO : REWARDED_DISPLAY;
        }
        if (i == 2) {
            return RECTANGLE_DISPLAY;
        }
        if (i == 3) {
            return BANNER_DISPLAY;
        }
        if (i != 4) {
            return null;
        }
        return str2.contains("video") ? INTERSTITIAL_VIDEO : INTERSTITIAL_DISPLAY;
    }

    public static com.fyber.inneractive.sdk.cache.session.enums.c valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.cache.session.enums.c) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.cache.session.enums.c.class, str);
    }

    public static com.fyber.inneractive.sdk.cache.session.enums.c[] values() {
        return (com.fyber.inneractive.sdk.cache.session.enums.c[]) $VALUES.clone();
    }

    public final boolean b() {
        return this.mShouldCountCompletion;
    }

    public final com.fyber.inneractive.sdk.config.enums.UnitDisplayType a() {
        return this.mType;
    }
}
