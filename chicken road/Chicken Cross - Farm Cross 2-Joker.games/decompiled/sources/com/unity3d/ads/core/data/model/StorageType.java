package com.unity3d.ads.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/model/StorageType;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL", "INTERNAL", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StorageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StorageType[] $VALUES;
    public static final StorageType EXTERNAL = new StorageType("EXTERNAL", 0);
    public static final StorageType INTERNAL = new StorageType("INTERNAL", 1);

    private static final /* synthetic */ StorageType[] $values() {
        return new StorageType[]{EXTERNAL, INTERNAL};
    }

    public static EnumEntries<StorageType> getEntries() {
        return $ENTRIES;
    }

    private StorageType(String str, int i) {
    }

    static {
        StorageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static StorageType valueOf(String str) {
        return (StorageType) Enum.valueOf(StorageType.class, str);
    }

    public static StorageType[] values() {
        return (StorageType[]) $VALUES.clone();
    }
}
