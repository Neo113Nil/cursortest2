package com.unity3d.services.ads.offerwall;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OfferwallEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "", "<init>", "(Ljava/lang/String;I)V", "REQUEST_SUCCESS", "REQUEST_FAILED", "ON_CONTENT_READY", "ON_CONTENT_SHOW", "ON_CONTENT_DISMISS", "SHOW_FAILED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferwallEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OfferwallEvent[] $VALUES;
    public static final OfferwallEvent REQUEST_SUCCESS = new OfferwallEvent("REQUEST_SUCCESS", 0);
    public static final OfferwallEvent REQUEST_FAILED = new OfferwallEvent("REQUEST_FAILED", 1);
    public static final OfferwallEvent ON_CONTENT_READY = new OfferwallEvent("ON_CONTENT_READY", 2);
    public static final OfferwallEvent ON_CONTENT_SHOW = new OfferwallEvent("ON_CONTENT_SHOW", 3);
    public static final OfferwallEvent ON_CONTENT_DISMISS = new OfferwallEvent("ON_CONTENT_DISMISS", 4);
    public static final OfferwallEvent SHOW_FAILED = new OfferwallEvent("SHOW_FAILED", 5);

    private static final /* synthetic */ OfferwallEvent[] $values() {
        return new OfferwallEvent[]{REQUEST_SUCCESS, REQUEST_FAILED, ON_CONTENT_READY, ON_CONTENT_SHOW, ON_CONTENT_DISMISS, SHOW_FAILED};
    }

    public static EnumEntries<OfferwallEvent> getEntries() {
        return $ENTRIES;
    }

    private OfferwallEvent(String str, int i) {
    }

    static {
        OfferwallEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OfferwallEvent valueOf(String str) {
        return (OfferwallEvent) Enum.valueOf(OfferwallEvent.class, str);
    }

    public static OfferwallEvent[] values() {
        return (OfferwallEvent[]) $VALUES.clone();
    }
}
