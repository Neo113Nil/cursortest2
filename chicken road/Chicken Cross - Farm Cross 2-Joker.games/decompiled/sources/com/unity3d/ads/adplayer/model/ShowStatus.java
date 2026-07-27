package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShowStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/adplayer/model/ShowStatus;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLETED", "SKIPPED", "ERROR", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShowStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShowStatus[] $VALUES;
    public static final ShowStatus COMPLETED = new ShowStatus("COMPLETED", 0);
    public static final ShowStatus SKIPPED = new ShowStatus("SKIPPED", 1);
    public static final ShowStatus ERROR = new ShowStatus("ERROR", 2);

    private static final /* synthetic */ ShowStatus[] $values() {
        return new ShowStatus[]{COMPLETED, SKIPPED, ERROR};
    }

    public static EnumEntries<ShowStatus> getEntries() {
        return $ENTRIES;
    }

    private ShowStatus(String str, int i) {
    }

    static {
        ShowStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShowStatus valueOf(String str) {
        return (ShowStatus) Enum.valueOf(ShowStatus.class, str);
    }

    public static ShowStatus[] values() {
        return (ShowStatus[]) $VALUES.clone();
    }
}
