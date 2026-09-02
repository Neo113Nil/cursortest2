package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/goldenboot/saga/zone/ClientThrottle;", "", "<init>", "()V", "", "level", "", "evictLayout", "(I)Ljava/lang/String;", "growPayload", "Ljava/lang/String;", "Splash", "injectMetric", "Home", "detachStream", "LevelSelect", "releaseHeader", "Game", "clipOrigin", "Daily", "flushSample", "Achievements", "updateTimer", "Shop", "applyTask", "Settings", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientThrottle {

    /* renamed from: applyTask, reason: from kotlin metadata */
    public static final String Settings = "settings";

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    public static final String Daily = "daily";

    /* renamed from: detachStream, reason: from kotlin metadata */
    public static final String LevelSelect = "level_select";
    public static final ClientThrottle evictLayout = new ClientThrottle();

    /* renamed from: flushSample, reason: from kotlin metadata */
    public static final String Achievements = "achievements";

    /* renamed from: growPayload, reason: from kotlin metadata */
    public static final String Splash = "splash";

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public static final String Home = "home";
    public static final int popBlueprint = 0;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    public static final String Game = "game/{level}";

    /* renamed from: updateTimer, reason: from kotlin metadata */
    public static final String Shop = "shop";

    private ClientThrottle() {
    }

    public final String evictLayout(int level) {
        return "game/" + level;
    }
}
