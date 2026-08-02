package org.betup.ui.fragment.bets.betlist.details;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/bets/betlist/details/BetShareChooserState;", "", "bitmaps", "", "Landroid/graphics/Bitmap;", "shareLink", "", "betId", "", "isSingleLegBetTicket", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/lang/String;JZ)V", "getBitmaps", "()Ljava/util/List;", "getShareLink", "()Ljava/lang/String;", "getBetId", "()J", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class BetShareChooserState {
    private final long betId;
    private final List<Bitmap> bitmaps;
    private final boolean isSingleLegBetTicket;
    private final String shareLink;

    public static /* synthetic */ BetShareChooserState copy$default(BetShareChooserState betShareChooserState, List list, String str, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = betShareChooserState.bitmaps;
        }
        if ((i & 2) != 0) {
            str = betShareChooserState.shareLink;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = betShareChooserState.betId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = betShareChooserState.isSingleLegBetTicket;
        }
        return betShareChooserState.copy(list, str2, j2, z);
    }

    public final List<Bitmap> component1() {
        return this.bitmaps;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSingleLegBetTicket() {
        return this.isSingleLegBetTicket;
    }

    public final BetShareChooserState copy(List<Bitmap> bitmaps, String shareLink, long betId, boolean isSingleLegBetTicket) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(shareLink, "shareLink");
        return new BetShareChooserState(bitmaps, shareLink, betId, isSingleLegBetTicket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetShareChooserState)) {
            return false;
        }
        BetShareChooserState betShareChooserState = (BetShareChooserState) other;
        return Intrinsics.areEqual(this.bitmaps, betShareChooserState.bitmaps) && Intrinsics.areEqual(this.shareLink, betShareChooserState.shareLink) && this.betId == betShareChooserState.betId && this.isSingleLegBetTicket == betShareChooserState.isSingleLegBetTicket;
    }

    public int hashCode() {
        return (((((this.bitmaps.hashCode() * 31) + this.shareLink.hashCode()) * 31) + Long.hashCode(this.betId)) * 31) + Boolean.hashCode(this.isSingleLegBetTicket);
    }

    public String toString() {
        return "BetShareChooserState(bitmaps=" + this.bitmaps + ", shareLink=" + this.shareLink + ", betId=" + this.betId + ", isSingleLegBetTicket=" + this.isSingleLegBetTicket + ")";
    }

    public BetShareChooserState(List<Bitmap> bitmaps, String shareLink, long j, boolean z) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(shareLink, "shareLink");
        this.bitmaps = bitmaps;
        this.shareLink = shareLink;
        this.betId = j;
        this.isSingleLegBetTicket = z;
    }

    public final List<Bitmap> getBitmaps() {
        return this.bitmaps;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final boolean isSingleLegBetTicket() {
        return this.isSingleLegBetTicket;
    }
}
