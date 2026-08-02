package org.betup.model.remote.entity.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PurchaseType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/analytics/PurchaseType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "UNLOCK_BET_AMOUNT", "UNLOCK_BET_TYPES", "PACKS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchaseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseType[] $VALUES;
    public static final PurchaseType UNLOCK_BET_AMOUNT = new PurchaseType("UNLOCK_BET_AMOUNT", 0);
    public static final PurchaseType UNLOCK_BET_TYPES = new PurchaseType("UNLOCK_BET_TYPES", 1);
    public static final PurchaseType PACKS = new PurchaseType("PACKS", 2);

    private static final /* synthetic */ PurchaseType[] $values() {
        return new PurchaseType[]{UNLOCK_BET_AMOUNT, UNLOCK_BET_TYPES, PACKS};
    }

    public static EnumEntries<PurchaseType> getEntries() {
        return $ENTRIES;
    }

    private PurchaseType(String str, int i) {
    }

    static {
        PurchaseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PurchaseType valueOf(String str) {
        return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
    }

    public static PurchaseType[] values() {
        return (PurchaseType[]) $VALUES.clone();
    }
}
