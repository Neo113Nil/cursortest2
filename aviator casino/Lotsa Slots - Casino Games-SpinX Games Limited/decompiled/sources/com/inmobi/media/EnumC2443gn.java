package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.gn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2443gn {
    public static final /* synthetic */ com.inmobi.media.EnumC2443gn[] b;
    public static final /* synthetic */ kotlin.enums.EnumEntries c;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5227a;

    static {
        com.inmobi.media.EnumC2443gn[] enumC2443gnArr = {new com.inmobi.media.EnumC2443gn("SHOW_VIDEO", 0, com.ironsource.C3232q2.v), new com.inmobi.media.EnumC2443gn("HIDE_VIDEO", 1, "hide"), new com.inmobi.media.EnumC2443gn("PLAY_VIDEO", 2, "resume"), new com.inmobi.media.EnumC2443gn("PAUSE_VIDEO", 3, "pause"), new com.inmobi.media.EnumC2443gn("MUTE_VIDEO", 4, "mute"), new com.inmobi.media.EnumC2443gn("UNMUTE_VIDEO", 5, "unmute"), new com.inmobi.media.EnumC2443gn("SKIP_VIDEO", 6, "skip")};
        b = enumC2443gnArr;
        c = kotlin.enums.EnumEntriesKt.enumEntries(enumC2443gnArr);
    }

    public EnumC2443gn(java.lang.String str, int i, java.lang.String str2) {
        this.f5227a = str2;
    }

    public static com.inmobi.media.EnumC2443gn valueOf(java.lang.String str) {
        return (com.inmobi.media.EnumC2443gn) java.lang.Enum.valueOf(com.inmobi.media.EnumC2443gn.class, str);
    }

    public static com.inmobi.media.EnumC2443gn[] values() {
        return (com.inmobi.media.EnumC2443gn[]) b.clone();
    }
}
