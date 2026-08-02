package org.betup.bus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FavoritesUpdatedMessage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/bus/FavoritesUpdatedMessage;", "", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "success", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/fav/FavouriteTypeK;Z)V", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FavoritesUpdatedMessage {
    public static final int $stable = 0;
    private final FavouriteTypeK favouriteType;
    private final boolean success;

    public static /* synthetic */ FavoritesUpdatedMessage copy$default(FavoritesUpdatedMessage favoritesUpdatedMessage, FavouriteTypeK favouriteTypeK, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            favouriteTypeK = favoritesUpdatedMessage.favouriteType;
        }
        if ((i & 2) != 0) {
            z = favoritesUpdatedMessage.success;
        }
        return favoritesUpdatedMessage.copy(favouriteTypeK, z);
    }

    /* renamed from: component1, reason: from getter */
    public final FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final FavoritesUpdatedMessage copy(FavouriteTypeK favouriteType, boolean success) {
        Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
        return new FavoritesUpdatedMessage(favouriteType, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesUpdatedMessage)) {
            return false;
        }
        FavoritesUpdatedMessage favoritesUpdatedMessage = (FavoritesUpdatedMessage) other;
        return Intrinsics.areEqual(this.favouriteType, favoritesUpdatedMessage.favouriteType) && this.success == favoritesUpdatedMessage.success;
    }

    public int hashCode() {
        return (this.favouriteType.hashCode() * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "FavoritesUpdatedMessage(favouriteType=" + this.favouriteType + ", success=" + this.success + ")";
    }

    public FavoritesUpdatedMessage(FavouriteTypeK favouriteType, boolean z) {
        Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
        this.favouriteType = favouriteType;
        this.success = z;
    }

    public final FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
