package org.betup.ui.fragment.bets.sheet.compose.items;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QuickBetTabSelector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/bets/sheet/compose/items/QuickBetTab;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "SINGLE", "MULTI", "BATTLE", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuickBetTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuickBetTab[] $VALUES;
    public static final QuickBetTab SINGLE = new QuickBetTab("SINGLE", 0);
    public static final QuickBetTab MULTI = new QuickBetTab("MULTI", 1);
    public static final QuickBetTab BATTLE = new QuickBetTab("BATTLE", 2);

    private static final /* synthetic */ QuickBetTab[] $values() {
        return new QuickBetTab[]{SINGLE, MULTI, BATTLE};
    }

    public static EnumEntries<QuickBetTab> getEntries() {
        return $ENTRIES;
    }

    private QuickBetTab(String str, int i) {
    }

    static {
        QuickBetTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static QuickBetTab valueOf(String str) {
        return (QuickBetTab) Enum.valueOf(QuickBetTab.class, str);
    }

    public static QuickBetTab[] values() {
        return (QuickBetTab[]) $VALUES.clone();
    }
}
