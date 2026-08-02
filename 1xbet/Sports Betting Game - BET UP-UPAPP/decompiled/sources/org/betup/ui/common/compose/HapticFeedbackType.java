package org.betup.ui.common.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HapticFeedbackType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/common/compose/HapticFeedbackType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "LightTap", "Selection", "BetSelect", "Confirm", "PlaceBetSuccess", "Reject", "Heavy", "Win", "Loss", "Notification", "SpinStop", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HapticFeedbackType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HapticFeedbackType[] $VALUES;
    public static final HapticFeedbackType LightTap = new HapticFeedbackType("LightTap", 0);
    public static final HapticFeedbackType Selection = new HapticFeedbackType("Selection", 1);
    public static final HapticFeedbackType BetSelect = new HapticFeedbackType("BetSelect", 2);
    public static final HapticFeedbackType Confirm = new HapticFeedbackType("Confirm", 3);
    public static final HapticFeedbackType PlaceBetSuccess = new HapticFeedbackType("PlaceBetSuccess", 4);
    public static final HapticFeedbackType Reject = new HapticFeedbackType("Reject", 5);
    public static final HapticFeedbackType Heavy = new HapticFeedbackType("Heavy", 6);
    public static final HapticFeedbackType Win = new HapticFeedbackType("Win", 7);
    public static final HapticFeedbackType Loss = new HapticFeedbackType("Loss", 8);
    public static final HapticFeedbackType Notification = new HapticFeedbackType("Notification", 9);
    public static final HapticFeedbackType SpinStop = new HapticFeedbackType("SpinStop", 10);

    private static final /* synthetic */ HapticFeedbackType[] $values() {
        return new HapticFeedbackType[]{LightTap, Selection, BetSelect, Confirm, PlaceBetSuccess, Reject, Heavy, Win, Loss, Notification, SpinStop};
    }

    public static EnumEntries<HapticFeedbackType> getEntries() {
        return $ENTRIES;
    }

    private HapticFeedbackType(String str, int i) {
    }

    static {
        HapticFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HapticFeedbackType valueOf(String str) {
        return (HapticFeedbackType) Enum.valueOf(HapticFeedbackType.class, str);
    }

    public static HapticFeedbackType[] values() {
        return (HapticFeedbackType[]) $VALUES.clone();
    }
}
