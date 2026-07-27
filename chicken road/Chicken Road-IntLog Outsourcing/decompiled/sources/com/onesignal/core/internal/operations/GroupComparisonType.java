package com.onesignal.core.internal.operations;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class GroupComparisonType {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ GroupComparisonType[] $VALUES;
    public static final GroupComparisonType CREATE = new GroupComparisonType("CREATE", 0);
    public static final GroupComparisonType ALTER = new GroupComparisonType("ALTER", 1);
    public static final GroupComparisonType NONE = new GroupComparisonType("NONE", 2);

    private static final /* synthetic */ GroupComparisonType[] $values() {
        return new GroupComparisonType[]{CREATE, ALTER, NONE};
    }

    static {
        GroupComparisonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private GroupComparisonType(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static GroupComparisonType valueOf(String str) {
        return (GroupComparisonType) Enum.valueOf(GroupComparisonType.class, str);
    }

    public static GroupComparisonType[] values() {
        return (GroupComparisonType[]) $VALUES.clone();
    }
}
