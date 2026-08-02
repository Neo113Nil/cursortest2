package org.betup.ui.common.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AppTopHeader.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lorg/betup/ui/common/compose/AppTopHeaderState;", "", "displayName", "", "photoUrl", "level", "", "balance", "", "balanceAnimationPrevious", "balanceAnimationMode", "streakCount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;IJJILjava/lang/Integer;)V", "getDisplayName", "()Ljava/lang/String;", "getPhotoUrl", "getLevel", "()I", "getBalance", "()J", "getBalanceAnimationPrevious", "getBalanceAnimationMode", "getStreakCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IJJILjava/lang/Integer;)Lorg/betup/ui/common/compose/AppTopHeaderState;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppTopHeaderState {
    public static final int $stable = 0;
    private final long balance;
    private final int balanceAnimationMode;
    private final long balanceAnimationPrevious;
    private final String displayName;
    private final int level;
    private final String photoUrl;
    private final Integer streakCount;

    public AppTopHeaderState() {
        this(null, null, 0, 0L, 0L, 0, null, 127, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* renamed from: component5, reason: from getter */
    public final long getBalanceAnimationPrevious() {
        return this.balanceAnimationPrevious;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBalanceAnimationMode() {
        return this.balanceAnimationMode;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getStreakCount() {
        return this.streakCount;
    }

    public final AppTopHeaderState copy(String displayName, String photoUrl, int level, long balance, long balanceAnimationPrevious, int balanceAnimationMode, Integer streakCount) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new AppTopHeaderState(displayName, photoUrl, level, balance, balanceAnimationPrevious, balanceAnimationMode, streakCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTopHeaderState)) {
            return false;
        }
        AppTopHeaderState appTopHeaderState = (AppTopHeaderState) other;
        return Intrinsics.areEqual(this.displayName, appTopHeaderState.displayName) && Intrinsics.areEqual(this.photoUrl, appTopHeaderState.photoUrl) && this.level == appTopHeaderState.level && this.balance == appTopHeaderState.balance && this.balanceAnimationPrevious == appTopHeaderState.balanceAnimationPrevious && this.balanceAnimationMode == appTopHeaderState.balanceAnimationMode && Intrinsics.areEqual(this.streakCount, appTopHeaderState.streakCount);
    }

    public int hashCode() {
        int hashCode = this.displayName.hashCode() * 31;
        String str = this.photoUrl;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.level)) * 31) + Long.hashCode(this.balance)) * 31) + Long.hashCode(this.balanceAnimationPrevious)) * 31) + Integer.hashCode(this.balanceAnimationMode)) * 31;
        Integer num = this.streakCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AppTopHeaderState(displayName=" + this.displayName + ", photoUrl=" + this.photoUrl + ", level=" + this.level + ", balance=" + this.balance + ", balanceAnimationPrevious=" + this.balanceAnimationPrevious + ", balanceAnimationMode=" + this.balanceAnimationMode + ", streakCount=" + this.streakCount + ")";
    }

    public AppTopHeaderState(String displayName, String str, int i, long j, long j2, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.displayName = displayName;
        this.photoUrl = str;
        this.level = i;
        this.balance = j;
        this.balanceAnimationPrevious = j2;
        this.balanceAnimationMode = i2;
        this.streakCount = num;
    }

    public /* synthetic */ AppTopHeaderState(String str, String str2, int i, long j, long j2, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? -1L : j, (i3 & 16) == 0 ? j2 : -1L, (i3 & 32) != 0 ? 2 : i2, (i3 & 64) == 0 ? num : null);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final long getBalanceAnimationPrevious() {
        return this.balanceAnimationPrevious;
    }

    public final int getBalanceAnimationMode() {
        return this.balanceAnimationMode;
    }

    public final Integer getStreakCount() {
        return this.streakCount;
    }
}
