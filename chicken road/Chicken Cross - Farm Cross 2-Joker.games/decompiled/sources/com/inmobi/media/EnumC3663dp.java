package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.dp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3663dp {
    public static final /* synthetic */ EnumC3663dp[] b;
    public static final /* synthetic */ EnumEntries c;

    /* renamed from: a, reason: collision with root package name */
    public final String f7075a;

    static {
        EnumC3663dp[] enumC3663dpArr = {new EnumC3663dp("SHOW_VIDEO", 0, "show"), new EnumC3663dp("HIDE_VIDEO", 1, "hide"), new EnumC3663dp("PLAY_VIDEO", 2, CampaignEx.JSON_NATIVE_VIDEO_RESUME), new EnumC3663dp("PAUSE_VIDEO", 3, CampaignEx.JSON_NATIVE_VIDEO_PAUSE), new EnumC3663dp("MUTE_VIDEO", 4, CampaignEx.JSON_NATIVE_VIDEO_MUTE), new EnumC3663dp("UNMUTE_VIDEO", 5, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE), new EnumC3663dp("SKIP_VIDEO", 6, "skip")};
        b = enumC3663dpArr;
        c = EnumEntriesKt.enumEntries(enumC3663dpArr);
    }

    public EnumC3663dp(String str, int i, String str2) {
        this.f7075a = str2;
    }

    public static EnumC3663dp valueOf(String str) {
        return (EnumC3663dp) Enum.valueOf(EnumC3663dp.class, str);
    }

    public static EnumC3663dp[] values() {
        return (EnumC3663dp[]) b.clone();
    }
}
