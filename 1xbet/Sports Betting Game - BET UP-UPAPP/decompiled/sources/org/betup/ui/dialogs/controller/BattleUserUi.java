package org.betup.ui.dialogs.controller;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetSelectionController.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/dialogs/controller/BattleUserUi;", "", "profileImg", "", "name", "amount", "prize", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProfileImg", "()Ljava/lang/String;", "getName", "getAmount", "getPrize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleUserUi {
    public static final int $stable = 0;
    private final String amount;
    private final String name;
    private final String prize;
    private final String profileImg;

    public static /* synthetic */ BattleUserUi copy$default(BattleUserUi battleUserUi, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = battleUserUi.profileImg;
        }
        if ((i & 2) != 0) {
            str2 = battleUserUi.name;
        }
        if ((i & 4) != 0) {
            str3 = battleUserUi.amount;
        }
        if ((i & 8) != 0) {
            str4 = battleUserUi.prize;
        }
        return battleUserUi.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProfileImg() {
        return this.profileImg;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrize() {
        return this.prize;
    }

    public final BattleUserUi copy(String profileImg, String name, String amount, String prize) {
        Intrinsics.checkNotNullParameter(profileImg, "profileImg");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(prize, "prize");
        return new BattleUserUi(profileImg, name, amount, prize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleUserUi)) {
            return false;
        }
        BattleUserUi battleUserUi = (BattleUserUi) other;
        return Intrinsics.areEqual(this.profileImg, battleUserUi.profileImg) && Intrinsics.areEqual(this.name, battleUserUi.name) && Intrinsics.areEqual(this.amount, battleUserUi.amount) && Intrinsics.areEqual(this.prize, battleUserUi.prize);
    }

    public int hashCode() {
        return (((((this.profileImg.hashCode() * 31) + this.name.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.prize.hashCode();
    }

    public String toString() {
        return "BattleUserUi(profileImg=" + this.profileImg + ", name=" + this.name + ", amount=" + this.amount + ", prize=" + this.prize + ")";
    }

    public BattleUserUi(String profileImg, String name, String amount, String prize) {
        Intrinsics.checkNotNullParameter(profileImg, "profileImg");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(prize, "prize");
        this.profileImg = profileImg;
        this.name = name;
        this.amount = amount;
        this.prize = prize;
    }

    public final String getProfileImg() {
        return this.profileImg;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPrize() {
        return this.prize;
    }
}
