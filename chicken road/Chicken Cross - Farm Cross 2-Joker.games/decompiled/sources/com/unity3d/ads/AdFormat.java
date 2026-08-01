package com.unity3d.ads;

import com.ironsource.mediationsdk.j;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdFormat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/AdFormat;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "INTERSTITIAL", "REWARDED", j.f8411a, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdFormat[] $VALUES;
    public static final AdFormat UNSPECIFIED = new AdFormat("UNSPECIFIED", 0);
    public static final AdFormat INTERSTITIAL = new AdFormat("INTERSTITIAL", 1);
    public static final AdFormat REWARDED = new AdFormat("REWARDED", 2);
    public static final AdFormat BANNER = new AdFormat(j.f8411a, 3);

    private static final /* synthetic */ AdFormat[] $values() {
        return new AdFormat[]{UNSPECIFIED, INTERSTITIAL, REWARDED, BANNER};
    }

    public static EnumEntries<AdFormat> getEntries() {
        return $ENTRIES;
    }

    private AdFormat(String str, int i) {
    }

    static {
        AdFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AdFormat valueOf(String str) {
        return (AdFormat) Enum.valueOf(AdFormat.class, str);
    }

    public static AdFormat[] values() {
        return (AdFormat[]) $VALUES.clone();
    }
}
