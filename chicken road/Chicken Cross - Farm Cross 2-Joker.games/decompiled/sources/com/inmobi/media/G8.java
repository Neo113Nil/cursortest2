package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class G8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ G8[] f6577a;

    static {
        G8[] g8Arr = {new G8("CREATE_VIDEO_PLAYER", 0, "createVideoPlayer"), new G8("EXECUTE_VIDEO_PLAYER_ACTION", 1, "executeVideoPlayerActions"), new G8("UPDATE_VIDEO_PLAYER_POSITION", 2, "updateVideoPlayerPosition"), new G8("GET_VIDEO_PLAYER_STATE", 3, "getVideoPlayerState"), new G8("UNKNOWN", 4, "unknown")};
        f6577a = g8Arr;
        EnumEntriesKt.enumEntries(g8Arr);
    }

    public G8(String str, int i, String str2) {
    }

    public static G8 valueOf(String str) {
        return (G8) Enum.valueOf(G8.class, str);
    }

    public static G8[] values() {
        return (G8[]) f6577a.clone();
    }
}
