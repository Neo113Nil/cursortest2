package org.betup.ui.dialogs.fav;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FavItemUI.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lorg/betup/ui/dialogs/fav/FavItem;", "", "id", "", "favName", "", "favImage", "isFav", "", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getId", "()I", "getFavName", "()Ljava/lang/String;", "getFavImage", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FavItem {
    public static final int $stable = 0;
    private final String favImage;
    private final String favName;
    private final int id;
    private final boolean isFav;
    private final Function0<Unit> onClick;

    public static /* synthetic */ FavItem copy$default(FavItem favItem, int i, String str, String str2, boolean z, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = favItem.id;
        }
        if ((i2 & 2) != 0) {
            str = favItem.favName;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = favItem.favImage;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = favItem.isFav;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            function0 = favItem.onClick;
        }
        return favItem.copy(i, str3, str4, z2, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFavName() {
        return this.favName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFavImage() {
        return this.favImage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFav() {
        return this.isFav;
    }

    public final Function0<Unit> component5() {
        return this.onClick;
    }

    public final FavItem copy(int id, String favName, String favImage, boolean isFav, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(favName, "favName");
        Intrinsics.checkNotNullParameter(favImage, "favImage");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new FavItem(id, favName, favImage, isFav, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavItem)) {
            return false;
        }
        FavItem favItem = (FavItem) other;
        return this.id == favItem.id && Intrinsics.areEqual(this.favName, favItem.favName) && Intrinsics.areEqual(this.favImage, favItem.favImage) && this.isFav == favItem.isFav && Intrinsics.areEqual(this.onClick, favItem.onClick);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.favName.hashCode()) * 31) + this.favImage.hashCode()) * 31) + Boolean.hashCode(this.isFav)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "FavItem(id=" + this.id + ", favName=" + this.favName + ", favImage=" + this.favImage + ", isFav=" + this.isFav + ", onClick=" + this.onClick + ")";
    }

    public FavItem(int i, String favName, String favImage, boolean z, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(favName, "favName");
        Intrinsics.checkNotNullParameter(favImage, "favImage");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = i;
        this.favName = favName;
        this.favImage = favImage;
        this.isFav = z;
        this.onClick = onClick;
    }

    public final int getId() {
        return this.id;
    }

    public final String getFavName() {
        return this.favName;
    }

    public final String getFavImage() {
        return this.favImage;
    }

    public final boolean isFav() {
        return this.isFav;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
