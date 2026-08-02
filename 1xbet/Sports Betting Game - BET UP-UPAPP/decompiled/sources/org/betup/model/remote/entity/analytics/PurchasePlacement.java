package org.betup.model.remote.entity.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PurchasePlacement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "QUICK_BET_DIALOG", "CHALLENGE_BET_DIALOG", "BETSLIP", "BET_ARENA", "CHALLENGE_BET_ARENA", "SHOP", "MINI_GAMES", "OFFER_PUSH", "OFFER_HOME", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PurchasePlacement {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchasePlacement[] $VALUES;
    public static final PurchasePlacement QUICK_BET_DIALOG = new PurchasePlacement("QUICK_BET_DIALOG", 0);
    public static final PurchasePlacement CHALLENGE_BET_DIALOG = new PurchasePlacement("CHALLENGE_BET_DIALOG", 1);
    public static final PurchasePlacement BETSLIP = new PurchasePlacement("BETSLIP", 2);
    public static final PurchasePlacement BET_ARENA = new PurchasePlacement("BET_ARENA", 3);
    public static final PurchasePlacement CHALLENGE_BET_ARENA = new PurchasePlacement("CHALLENGE_BET_ARENA", 4);
    public static final PurchasePlacement SHOP = new PurchasePlacement("SHOP", 5);
    public static final PurchasePlacement MINI_GAMES = new PurchasePlacement("MINI_GAMES", 6);
    public static final PurchasePlacement OFFER_PUSH = new PurchasePlacement("OFFER_PUSH", 7);
    public static final PurchasePlacement OFFER_HOME = new PurchasePlacement("OFFER_HOME", 8);

    private static final /* synthetic */ PurchasePlacement[] $values() {
        return new PurchasePlacement[]{QUICK_BET_DIALOG, CHALLENGE_BET_DIALOG, BETSLIP, BET_ARENA, CHALLENGE_BET_ARENA, SHOP, MINI_GAMES, OFFER_PUSH, OFFER_HOME};
    }

    public static EnumEntries<PurchasePlacement> getEntries() {
        return $ENTRIES;
    }

    private PurchasePlacement(String str, int i) {
    }

    static {
        PurchasePlacement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PurchasePlacement valueOf(String str) {
        return (PurchasePlacement) Enum.valueOf(PurchasePlacement.class, str);
    }

    public static PurchasePlacement[] values() {
        return (PurchasePlacement[]) $VALUES.clone();
    }
}
