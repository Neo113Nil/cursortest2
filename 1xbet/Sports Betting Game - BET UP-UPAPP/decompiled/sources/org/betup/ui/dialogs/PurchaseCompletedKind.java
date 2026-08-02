package org.betup.ui.dialogs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PurchaseCompletedUiModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/dialogs/PurchaseCompletedKind;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "INSTANT", "DAILY_PACKAGE", "HYBRID", "EFFECT", "DAILY_CLAIM", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseCompletedKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseCompletedKind[] $VALUES;
    public static final PurchaseCompletedKind INSTANT = new PurchaseCompletedKind("INSTANT", 0);
    public static final PurchaseCompletedKind DAILY_PACKAGE = new PurchaseCompletedKind("DAILY_PACKAGE", 1);
    public static final PurchaseCompletedKind HYBRID = new PurchaseCompletedKind("HYBRID", 2);
    public static final PurchaseCompletedKind EFFECT = new PurchaseCompletedKind("EFFECT", 3);
    public static final PurchaseCompletedKind DAILY_CLAIM = new PurchaseCompletedKind("DAILY_CLAIM", 4);

    private static final /* synthetic */ PurchaseCompletedKind[] $values() {
        return new PurchaseCompletedKind[]{INSTANT, DAILY_PACKAGE, HYBRID, EFFECT, DAILY_CLAIM};
    }

    public static EnumEntries<PurchaseCompletedKind> getEntries() {
        return $ENTRIES;
    }

    private PurchaseCompletedKind(String str, int i) {
    }

    static {
        PurchaseCompletedKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PurchaseCompletedKind valueOf(String str) {
        return (PurchaseCompletedKind) Enum.valueOf(PurchaseCompletedKind.class, str);
    }

    public static PurchaseCompletedKind[] values() {
        return (PurchaseCompletedKind[]) $VALUES.clone();
    }
}
