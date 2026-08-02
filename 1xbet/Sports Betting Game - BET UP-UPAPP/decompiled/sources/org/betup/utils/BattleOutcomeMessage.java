package org.betup.utils;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/utils/BattleOutcomeMessage;", "", "messageResId", "", "formatArgs", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I[Ljava/lang/Object;)V", "getMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "equals", "", "other", "hashCode", "component1", "component2", "copy", "(I[Ljava/lang/Object;)Lorg/betup/utils/BattleOutcomeMessage;", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BattleOutcomeMessage {
    public static final int $stable = 8;
    private final Object[] formatArgs;
    private final int messageResId;

    public static /* synthetic */ BattleOutcomeMessage copy$default(BattleOutcomeMessage battleOutcomeMessage, int i, Object[] objArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = battleOutcomeMessage.messageResId;
        }
        if ((i2 & 2) != 0) {
            objArr = battleOutcomeMessage.formatArgs;
        }
        return battleOutcomeMessage.copy(i, objArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMessageResId() {
        return this.messageResId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public final BattleOutcomeMessage copy(int messageResId, Object[] formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new BattleOutcomeMessage(messageResId, formatArgs);
    }

    public String toString() {
        return "BattleOutcomeMessage(messageResId=" + this.messageResId + ", formatArgs=" + Arrays.toString(this.formatArgs) + ")";
    }

    public BattleOutcomeMessage(int i, Object[] formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.messageResId = i;
        this.formatArgs = formatArgs;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public /* synthetic */ BattleOutcomeMessage(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new Object[0] : objArr);
    }

    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type org.betup.utils.BattleOutcomeMessage");
        BattleOutcomeMessage battleOutcomeMessage = (BattleOutcomeMessage) other;
        return this.messageResId == battleOutcomeMessage.messageResId && Arrays.equals(this.formatArgs, battleOutcomeMessage.formatArgs);
    }

    public int hashCode() {
        return (this.messageResId * 31) + Arrays.hashCode(this.formatArgs);
    }
}
