package org.betup.games.doubles.ui;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ResultDoubleGameDialog.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014¨\u0006!"}, d2 = {"Lorg/betup/games/doubles/ui/ResultDialogDoubleGameDto;", "Ljava/io/Serializable;", "selectedBetType", "Lorg/betup/games/doubles/model/rest/DoubleBetType;", "betType", "betAmount", "", "prizeAmount", "isWin", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/doubles/model/rest/DoubleBetType;Lorg/betup/games/doubles/model/rest/DoubleBetType;IIZ)V", "getSelectedBetType", "()Lorg/betup/games/doubles/model/rest/DoubleBetType;", "getBetType", "getBetAmount", "()I", "getPrizeAmount", "setPrizeAmount", "(I)V", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ResultDialogDoubleGameDto implements Serializable {
    public static final int $stable = 8;
    private final int betAmount;
    private final DoubleBetType betType;
    private final boolean isWin;
    private int prizeAmount;
    private final DoubleBetType selectedBetType;

    public static /* synthetic */ ResultDialogDoubleGameDto copy$default(ResultDialogDoubleGameDto resultDialogDoubleGameDto, DoubleBetType doubleBetType, DoubleBetType doubleBetType2, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            doubleBetType = resultDialogDoubleGameDto.selectedBetType;
        }
        if ((i3 & 2) != 0) {
            doubleBetType2 = resultDialogDoubleGameDto.betType;
        }
        DoubleBetType doubleBetType3 = doubleBetType2;
        if ((i3 & 4) != 0) {
            i = resultDialogDoubleGameDto.betAmount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = resultDialogDoubleGameDto.prizeAmount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = resultDialogDoubleGameDto.isWin;
        }
        return resultDialogDoubleGameDto.copy(doubleBetType, doubleBetType3, i4, i5, z);
    }

    /* renamed from: component1, reason: from getter */
    public final DoubleBetType getSelectedBetType() {
        return this.selectedBetType;
    }

    /* renamed from: component2, reason: from getter */
    public final DoubleBetType getBetType() {
        return this.betType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBetAmount() {
        return this.betAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPrizeAmount() {
        return this.prizeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
    }

    public final ResultDialogDoubleGameDto copy(DoubleBetType selectedBetType, DoubleBetType betType, int betAmount, int prizeAmount, boolean isWin) {
        Intrinsics.checkNotNullParameter(selectedBetType, "selectedBetType");
        Intrinsics.checkNotNullParameter(betType, "betType");
        return new ResultDialogDoubleGameDto(selectedBetType, betType, betAmount, prizeAmount, isWin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultDialogDoubleGameDto)) {
            return false;
        }
        ResultDialogDoubleGameDto resultDialogDoubleGameDto = (ResultDialogDoubleGameDto) other;
        return this.selectedBetType == resultDialogDoubleGameDto.selectedBetType && this.betType == resultDialogDoubleGameDto.betType && this.betAmount == resultDialogDoubleGameDto.betAmount && this.prizeAmount == resultDialogDoubleGameDto.prizeAmount && this.isWin == resultDialogDoubleGameDto.isWin;
    }

    public int hashCode() {
        return (((((((this.selectedBetType.hashCode() * 31) + this.betType.hashCode()) * 31) + Integer.hashCode(this.betAmount)) * 31) + Integer.hashCode(this.prizeAmount)) * 31) + Boolean.hashCode(this.isWin);
    }

    public String toString() {
        return "ResultDialogDoubleGameDto(selectedBetType=" + this.selectedBetType + ", betType=" + this.betType + ", betAmount=" + this.betAmount + ", prizeAmount=" + this.prizeAmount + ", isWin=" + this.isWin + ")";
    }

    public ResultDialogDoubleGameDto(DoubleBetType selectedBetType, DoubleBetType betType, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(selectedBetType, "selectedBetType");
        Intrinsics.checkNotNullParameter(betType, "betType");
        this.selectedBetType = selectedBetType;
        this.betType = betType;
        this.betAmount = i;
        this.prizeAmount = i2;
        this.isWin = z;
    }

    public final DoubleBetType getSelectedBetType() {
        return this.selectedBetType;
    }

    public final DoubleBetType getBetType() {
        return this.betType;
    }

    public final int getBetAmount() {
        return this.betAmount;
    }

    public final int getPrizeAmount() {
        return this.prizeAmount;
    }

    public final void setPrizeAmount(int i) {
        this.prizeAmount = i;
    }

    public final boolean isWin() {
        return this.isWin;
    }
}
