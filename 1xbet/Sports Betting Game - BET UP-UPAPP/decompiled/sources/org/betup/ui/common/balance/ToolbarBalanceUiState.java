package org.betup.ui.common.balance;

import com.ironsource.X3;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ToolbarBalanceComposeHost.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lorg/betup/ui/common/balance/ToolbarBalanceUiState;", "", "balance", "", "animationPrevious", X3.a.t, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJI)V", "getBalance", "()J", "getAnimationPrevious", "getMode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ToolbarBalanceUiState {
    private final long animationPrevious;
    private final long balance;
    private final int mode;

    public static /* synthetic */ ToolbarBalanceUiState copy$default(ToolbarBalanceUiState toolbarBalanceUiState, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = toolbarBalanceUiState.balance;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = toolbarBalanceUiState.animationPrevious;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = toolbarBalanceUiState.mode;
        }
        return toolbarBalanceUiState.copy(j3, j4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAnimationPrevious() {
        return this.animationPrevious;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public final ToolbarBalanceUiState copy(long balance, long animationPrevious, int mode) {
        return new ToolbarBalanceUiState(balance, animationPrevious, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarBalanceUiState)) {
            return false;
        }
        ToolbarBalanceUiState toolbarBalanceUiState = (ToolbarBalanceUiState) other;
        return this.balance == toolbarBalanceUiState.balance && this.animationPrevious == toolbarBalanceUiState.animationPrevious && this.mode == toolbarBalanceUiState.mode;
    }

    public int hashCode() {
        return (((Long.hashCode(this.balance) * 31) + Long.hashCode(this.animationPrevious)) * 31) + Integer.hashCode(this.mode);
    }

    public String toString() {
        return "ToolbarBalanceUiState(balance=" + this.balance + ", animationPrevious=" + this.animationPrevious + ", mode=" + this.mode + ")";
    }

    public ToolbarBalanceUiState(long j, long j2, int i) {
        this.balance = j;
        this.animationPrevious = j2;
        this.mode = i;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final long getAnimationPrevious() {
        return this.animationPrevious;
    }

    public final int getMode() {
        return this.mode;
    }
}
