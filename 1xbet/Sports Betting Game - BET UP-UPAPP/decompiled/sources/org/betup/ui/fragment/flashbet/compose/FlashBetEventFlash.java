package org.betup.ui.fragment.flashbet.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetCardFlashOverlay.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlash;", "", "kind", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;", "label", "", "key", "", "teamLogoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;Ljava/lang/String;ILjava/lang/String;)V", "getKind", "()Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;", "getLabel", "()Ljava/lang/String;", "getKey", "()I", "getTeamLogoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlashBetEventFlash {
    public static final int $stable = 0;
    private final int key;
    private final FlashBetEventFlashKind kind;
    private final String label;
    private final String teamLogoUrl;

    public static /* synthetic */ FlashBetEventFlash copy$default(FlashBetEventFlash flashBetEventFlash, FlashBetEventFlashKind flashBetEventFlashKind, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flashBetEventFlashKind = flashBetEventFlash.kind;
        }
        if ((i2 & 2) != 0) {
            str = flashBetEventFlash.label;
        }
        if ((i2 & 4) != 0) {
            i = flashBetEventFlash.key;
        }
        if ((i2 & 8) != 0) {
            str2 = flashBetEventFlash.teamLogoUrl;
        }
        return flashBetEventFlash.copy(flashBetEventFlashKind, str, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final FlashBetEventFlashKind getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTeamLogoUrl() {
        return this.teamLogoUrl;
    }

    public final FlashBetEventFlash copy(FlashBetEventFlashKind kind, String label, int key, String teamLogoUrl) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        return new FlashBetEventFlash(kind, label, key, teamLogoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetEventFlash)) {
            return false;
        }
        FlashBetEventFlash flashBetEventFlash = (FlashBetEventFlash) other;
        return this.kind == flashBetEventFlash.kind && Intrinsics.areEqual(this.label, flashBetEventFlash.label) && this.key == flashBetEventFlash.key && Intrinsics.areEqual(this.teamLogoUrl, flashBetEventFlash.teamLogoUrl);
    }

    public int hashCode() {
        int hashCode = ((((this.kind.hashCode() * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.key)) * 31;
        String str = this.teamLogoUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FlashBetEventFlash(kind=" + this.kind + ", label=" + this.label + ", key=" + this.key + ", teamLogoUrl=" + this.teamLogoUrl + ")";
    }

    public FlashBetEventFlash(FlashBetEventFlashKind kind, String label, int i, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        this.kind = kind;
        this.label = label;
        this.key = i;
        this.teamLogoUrl = str;
    }

    public /* synthetic */ FlashBetEventFlash(FlashBetEventFlashKind flashBetEventFlashKind, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flashBetEventFlashKind, str, i, (i2 & 8) != 0 ? null : str2);
    }

    public final FlashBetEventFlashKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getKey() {
        return this.key;
    }

    public final String getTeamLogoUrl() {
        return this.teamLogoUrl;
    }
}
