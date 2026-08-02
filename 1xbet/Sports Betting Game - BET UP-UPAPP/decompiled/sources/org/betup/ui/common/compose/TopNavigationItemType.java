package org.betup.ui.common.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TopNavigationButtons.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/common/compose/TopNavigationItemType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "DAILY", "FLASH_BET", "TASKS", "BONUS_OFFER", "ADS", "SCORES", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopNavigationItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopNavigationItemType[] $VALUES;
    public static final TopNavigationItemType DAILY = new TopNavigationItemType("DAILY", 0);
    public static final TopNavigationItemType FLASH_BET = new TopNavigationItemType("FLASH_BET", 1);
    public static final TopNavigationItemType TASKS = new TopNavigationItemType("TASKS", 2);
    public static final TopNavigationItemType BONUS_OFFER = new TopNavigationItemType("BONUS_OFFER", 3);
    public static final TopNavigationItemType ADS = new TopNavigationItemType("ADS", 4);
    public static final TopNavigationItemType SCORES = new TopNavigationItemType("SCORES", 5);

    private static final /* synthetic */ TopNavigationItemType[] $values() {
        return new TopNavigationItemType[]{DAILY, FLASH_BET, TASKS, BONUS_OFFER, ADS, SCORES};
    }

    public static EnumEntries<TopNavigationItemType> getEntries() {
        return $ENTRIES;
    }

    private TopNavigationItemType(String str, int i) {
    }

    static {
        TopNavigationItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TopNavigationItemType valueOf(String str) {
        return (TopNavigationItemType) Enum.valueOf(TopNavigationItemType.class, str);
    }

    public static TopNavigationItemType[] values() {
        return (TopNavigationItemType[]) $VALUES.clone();
    }
}
