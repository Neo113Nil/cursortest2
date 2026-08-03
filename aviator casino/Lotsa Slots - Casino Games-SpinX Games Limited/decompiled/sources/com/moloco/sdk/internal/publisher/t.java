package com.moloco.sdk.internal.publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.publisher.t f7171a = new com.moloco.sdk.internal.publisher.t(com.ironsource.mediationsdk.j.f6439a, 0);
    public static final com.moloco.sdk.internal.publisher.t b = new com.moloco.sdk.internal.publisher.t("BANNER_TABLET", 1);
    public static final com.moloco.sdk.internal.publisher.t c = new com.moloco.sdk.internal.publisher.t("MREC", 2);
    public static final com.moloco.sdk.internal.publisher.t d = new com.moloco.sdk.internal.publisher.t("NATIVE_AD_MEDIATION", 3);
    public static final com.moloco.sdk.internal.publisher.t e = new com.moloco.sdk.internal.publisher.t("NATIVE_BANNER", 4);
    public static final com.moloco.sdk.internal.publisher.t f = new com.moloco.sdk.internal.publisher.t("INTERSTITIAL", 5);
    public static final com.moloco.sdk.internal.publisher.t g = new com.moloco.sdk.internal.publisher.t("REWARDED", 6);
    public static final /* synthetic */ com.moloco.sdk.internal.publisher.t[] h;
    public static final /* synthetic */ kotlin.enums.EnumEntries i;

    static {
        com.moloco.sdk.internal.publisher.t[] a2 = a();
        h = a2;
        i = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public t(java.lang.String str, int i2) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.publisher.t[] a() {
        return new com.moloco.sdk.internal.publisher.t[]{f7171a, b, c, d, e, f, g};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.publisher.t> b() {
        return i;
    }

    public static com.moloco.sdk.internal.publisher.t valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.publisher.t) java.lang.Enum.valueOf(com.moloco.sdk.internal.publisher.t.class, str);
    }

    public static com.moloco.sdk.internal.publisher.t[] values() {
        return (com.moloco.sdk.internal.publisher.t[]) h.clone();
    }
}
