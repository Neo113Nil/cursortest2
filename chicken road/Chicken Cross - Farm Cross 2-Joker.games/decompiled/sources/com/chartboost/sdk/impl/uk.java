package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uk {
    public static final uk d;
    public static final uk e;
    public static final uk f;
    public static final uk g;
    public static final uk h;
    public static final uk i;
    public static final uk j;
    public static final uk k;
    public static final /* synthetic */ uk[] l;
    public static final /* synthetic */ EnumEntries m;
    public final FriendlyObstructionPurpose b;
    public final String c;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        d = new uk("VIDEO_CONTROLS", 0, friendlyObstructionPurpose, "Video Controls");
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        e = new uk("CTA_BUTTON", 1, friendlyObstructionPurpose2, "CTA Button");
        f = new uk("INDUSTRY_ICON", 2, friendlyObstructionPurpose2, "Industry Icon");
        g = new uk("BLUR", 3, friendlyObstructionPurpose2, "Blur");
        h = new uk("LOADING_INDICATOR", 4, friendlyObstructionPurpose2, "Loading Indicator");
        i = new uk("MUTE_BUTTON", 5, friendlyObstructionPurpose, "Mute Button");
        j = new uk("REWARD_CHIP", 6, friendlyObstructionPurpose2, "Reward Chip");
        k = new uk("CONTROLS_CONTAINER", 7, friendlyObstructionPurpose2, "Controls Container");
        uk[] a2 = a();
        l = a2;
        m = EnumEntriesKt.enumEntries(a2);
    }

    public uk(String str, int i2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.b = friendlyObstructionPurpose;
        this.c = str2;
    }

    public static final /* synthetic */ uk[] a() {
        return new uk[]{d, e, f, g, h, i, j, k};
    }

    public static uk valueOf(String str) {
        return (uk) Enum.valueOf(uk.class, str);
    }

    public static uk[] values() {
        return (uk[]) l.clone();
    }

    public final String b() {
        return this.c;
    }

    public final FriendlyObstructionPurpose c() {
        return this.b;
    }
}
