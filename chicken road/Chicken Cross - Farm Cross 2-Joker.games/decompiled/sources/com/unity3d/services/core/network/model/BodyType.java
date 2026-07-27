package com.unity3d.services.core.network.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/core/network/model/BodyType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "STRING", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BodyType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BodyType[] $VALUES;
    public static final BodyType UNKNOWN = new BodyType("UNKNOWN", 0);
    public static final BodyType STRING = new BodyType("STRING", 1);

    private static final /* synthetic */ BodyType[] $values() {
        return new BodyType[]{UNKNOWN, STRING};
    }

    public static EnumEntries<BodyType> getEntries() {
        return $ENTRIES;
    }

    private BodyType(String str, int i) {
    }

    static {
        BodyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BodyType valueOf(String str) {
        return (BodyType) Enum.valueOf(BodyType.class, str);
    }

    public static BodyType[] values() {
        return (BodyType[]) $VALUES.clone();
    }
}
