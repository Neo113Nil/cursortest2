package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class V8 {
    public static final V8 b;
    public static final V8 c;
    public static final V8 d;
    public static final V8 e;
    public static final V8 f;
    public static final V8 g;
    public static final V8 h;
    public static final V8 i;
    public static final V8 j;
    public static final V8 k;
    public static final V8 l;
    public static final V8 m;
    public static final V8 n;
    public static final V8 o;
    public static final V8 p;
    public static final V8 q;
    public static final /* synthetic */ V8[] r;

    /* renamed from: a, reason: collision with root package name */
    public final String f6910a;

    static {
        V8 v8 = new V8("VIDEO_READY", 0, "VideoReady");
        b = v8;
        V8 v82 = new V8("VIDEO_COMPLETE", 1, "VideoComplete");
        c = v82;
        V8 v83 = new V8("VIDEO_PLAYBACK_ERROR", 2, "VideoPlaybackError");
        d = v83;
        V8 v84 = new V8("VIDEO_COMMAND_ERROR", 3, "VideoCommandError");
        e = v84;
        V8 v85 = new V8("VIDEO_PLAYBACK_STATE", 4, "VideoPlaybackState");
        f = v85;
        V8 v86 = new V8("VIDEO_PLAYBACK_UPDATE", 5, "VideoPlaybackUpdate");
        g = v86;
        V8 v87 = new V8("VIDEO_QUARTILES_EVENT", 6, "VideoQuartilesEvent");
        h = v87;
        V8 v88 = new V8("VIDEO_PLAYER_CREATED", 7, "VideoPlayerCreated");
        i = v88;
        V8 v89 = new V8("VIDEO_PLAYER_POSITION_UPDATED", 8, "VideoPlayerPositionUpdated");
        j = v89;
        V8 v810 = new V8("VIDEO_PLAYER_DESTROYED", 9, "VideoPlayerDestroyed");
        k = v810;
        V8 v811 = new V8("VIDEO_PLAYER_ACTION_EXECUTED", 10, "VideoPlayerActionExecuted");
        l = v811;
        V8 v812 = new V8("VIDEO_PLAYER_POSITION", 11, "VideoPlayerPosition");
        m = v812;
        V8 v813 = new V8("VIDEO_CAN_PLAY_THROUGH", 12, "VideoCanPlayThrough");
        n = v813;
        V8 v814 = new V8("VIDEO_LOADED_METADATA", 13, "VideoLoadedMetadata");
        o = v814;
        V8 v815 = new V8("VIDEO_CONTAINER_POSITION", 14, "VideoContainerPosition");
        p = v815;
        V8 v816 = new V8("VIDEO_VIEW_POSITION", 15, "VideoViewPosition");
        q = v816;
        V8[] v8Arr = {v8, v82, v83, v84, v85, v86, v87, v88, v89, v810, v811, v812, v813, v814, v815, v816};
        r = v8Arr;
        EnumEntriesKt.enumEntries(v8Arr);
    }

    public V8(String str, int i2, String str2) {
        this.f6910a = str2;
    }

    public static V8 valueOf(String str) {
        return (V8) Enum.valueOf(V8.class, str);
    }

    public static V8[] values() {
        return (V8[]) r.clone();
    }
}
