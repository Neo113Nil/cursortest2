package com.chartboost.sdk.impl;

import com.facebook.login.LoginLogger;
import com.ironsource.C4665u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jd {
    public static final /* synthetic */ jd[] S;
    public static final /* synthetic */ EnumEntries T;
    public static final a c;
    public static final Map d;
    public final String b;
    public static final jd e = new jd("GET_PARAMETERS", 0, "getParameters");
    public static final jd f = new jd("GET_MAX_SIZE", 1, "getMaxSize");
    public static final jd g = new jd("GET_SCREEN_SIZE", 2, "getScreenSize");
    public static final jd h = new jd("GET_CURRENT_POSITION", 3, "getCurrentPosition");
    public static final jd i = new jd("GET_DEFAULT_POSITION", 4, "getDefaultPosition");
    public static final jd j = new jd("GET_ORIENTATION_PROPERTIES", 5, "getOrientationProperties");
    public static final jd k = new jd("CLICK", 6, "click");
    public static final jd l = new jd("CLOSE", 7, "close");
    public static final jd m = new jd("SKIPPED", 8, LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED);
    public static final jd n = new jd("VIDEO_COMPLETED", 9, "videoCompleted");
    public static final jd o = new jd("VIDEO_RESUMED", 10, "videoResumed");
    public static final jd p = new jd("VIDEO_PAUSED", 11, "videoPaused");
    public static final jd q = new jd("VIDEO_REPLAY", 12, "videoReplay");
    public static final jd r = new jd("CURRENT_VIDEO_DURATION", 13, "currentVideoDuration");
    public static final jd s = new jd("TOTAL_VIDEO_DURATION", 14, "totalVideoDuration");
    public static final jd t = new jd("SHOW", 15, "show");
    public static final jd u = new jd("ERROR", 16, "error");
    public static final jd v = new jd("WARNING", 17, "warning");
    public static final jd w = new jd("DEBUG", 18, "debug");
    public static final jd x = new jd("TRACKING", 19, "tracking");
    public static final jd y = new jd("OPEN_URL", 20, "openUrl");
    public static final jd z = new jd("SET_ORIENTATION_PROPERTIES", 21, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h);
    public static final jd A = new jd("REWARD", 22, C4665u.j);
    public static final jd B = new jd("REWARDED_VIDEO_COMPLETED", 23, "rewardedVideoCompleted");
    public static final jd C = new jd("PLAY_VIDEO", 24, "playVideo");
    public static final jd D = new jd("PAUSE_VIDEO", 25, "pauseVideo");
    public static final jd E = new jd("CLOSE_VIDEO", 26, "closeVideo");
    public static final jd F = new jd("MUTE_VIDEO", 27, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    public static final jd G = new jd("UNMUTE_VIDEO", 28, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    public static final jd H = new jd("OM_MEASUREMENT_RESOURCES", 29, "OMMeasurementResources");
    public static final jd I = new jd("START", 30, "start");
    public static final jd J = new jd("BUFFER_START", 31, "bufferStart");
    public static final jd K = new jd("BUFFER_END", 32, "bufferEnd");
    public static final jd L = new jd("VIDEO_FINISHED", 33, "videoFinished");
    public static final jd M = new jd("VIDEO_STARTED", 34, "videoStarted");
    public static final jd N = new jd("VIDEO_ENDED", 35, "videoEnded");
    public static final jd O = new jd("VIDEO_FAILED", 36, "videoFailed");
    public static final jd P = new jd("PLAYBACK_TIME", 37, "playbackTime");
    public static final jd Q = new jd("ON_BACKGROUND", 38, "onBackground");
    public static final jd R = new jd("ON_FOREGROUND", 39, "onForeground");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jd a(String cmdName) {
            Intrinsics.checkNotNullParameter(cmdName, "cmdName");
            return (jd) jd.d.get(cmdName);
        }

        public a() {
        }
    }

    static {
        jd[] a2 = a();
        S = a2;
        T = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
        EnumEntries d2 = d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(d2, 10)), 16));
        for (Object obj : d2) {
            linkedHashMap.put(((jd) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public jd(String str, int i2, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ jd[] a() {
        return new jd[]{e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R};
    }

    public static EnumEntries d() {
        return T;
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) S.clone();
    }

    public final String c() {
        return this.b;
    }
}
