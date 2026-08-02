package org.betup.ui.fragment.matches.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SportsList.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "", "id", "", "name", "", "photoUrl", "matchCount", "matchLiveCount", "isFavorite", "", "onClickItem", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPhotoUrl", "getMatchCount", "getMatchLiveCount", "()Z", "getOnClickItem", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SportListItemUiModel {
    public static final int $stable = 0;
    private final int id;
    private final boolean isFavorite;
    private final int matchCount;
    private final int matchLiveCount;
    private final String name;
    private final Function0<Unit> onClickItem;
    private final String photoUrl;

    public static /* synthetic */ SportListItemUiModel copy$default(SportListItemUiModel sportListItemUiModel, int i, String str, String str2, int i2, int i3, boolean z, Function0 function0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sportListItemUiModel.id;
        }
        if ((i4 & 2) != 0) {
            str = sportListItemUiModel.name;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = sportListItemUiModel.photoUrl;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i2 = sportListItemUiModel.matchCount;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = sportListItemUiModel.matchLiveCount;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z = sportListItemUiModel.isFavorite;
        }
        boolean z2 = z;
        if ((i4 & 64) != 0) {
            function0 = sportListItemUiModel.onClickItem;
        }
        return sportListItemUiModel.copy(i, str3, str4, i5, i6, z2, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMatchCount() {
        return this.matchCount;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMatchLiveCount() {
        return this.matchLiveCount;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    public final Function0<Unit> component7() {
        return this.onClickItem;
    }

    public final SportListItemUiModel copy(int id, String name, String photoUrl, int matchCount, int matchLiveCount, boolean isFavorite, Function0<Unit> onClickItem) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        return new SportListItemUiModel(id, name, photoUrl, matchCount, matchLiveCount, isFavorite, onClickItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportListItemUiModel)) {
            return false;
        }
        SportListItemUiModel sportListItemUiModel = (SportListItemUiModel) other;
        return this.id == sportListItemUiModel.id && Intrinsics.areEqual(this.name, sportListItemUiModel.name) && Intrinsics.areEqual(this.photoUrl, sportListItemUiModel.photoUrl) && this.matchCount == sportListItemUiModel.matchCount && this.matchLiveCount == sportListItemUiModel.matchLiveCount && this.isFavorite == sportListItemUiModel.isFavorite && Intrinsics.areEqual(this.onClickItem, sportListItemUiModel.onClickItem);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.matchCount)) * 31) + Integer.hashCode(this.matchLiveCount)) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + this.onClickItem.hashCode();
    }

    public String toString() {
        return "SportListItemUiModel(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", matchCount=" + this.matchCount + ", matchLiveCount=" + this.matchLiveCount + ", isFavorite=" + this.isFavorite + ", onClickItem=" + this.onClickItem + ")";
    }

    public SportListItemUiModel(int i, String name, String photoUrl, int i2, int i3, boolean z, Function0<Unit> onClickItem) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        this.id = i;
        this.name = name;
        this.photoUrl = photoUrl;
        this.matchCount = i2;
        this.matchLiveCount = i3;
        this.isFavorite = z;
        this.onClickItem = onClickItem;
    }

    public /* synthetic */ SportListItemUiModel(int i, String str, String str2, int i2, int i3, boolean z, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, z, function0);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getMatchCount() {
        return this.matchCount;
    }

    public final int getMatchLiveCount() {
        return this.matchLiveCount;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final Function0<Unit> getOnClickItem() {
        return this.onClickItem;
    }
}
