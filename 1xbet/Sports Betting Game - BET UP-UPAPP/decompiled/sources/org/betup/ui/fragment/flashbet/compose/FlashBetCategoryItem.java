package org.betup.ui.fragment.flashbet.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetCategoryItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetCategoryItem;", "", "id", "", "name", "photoUrl", "currentMatches", "", "totalMatches", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function0;)V", "getId", "()Ljava/lang/String;", "getName", "getPhotoUrl", "getCurrentMatches", "()I", "getTotalMatches", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FlashBetCategoryItem {
    public static final int $stable = 0;
    private final int currentMatches;
    private final String id;
    private final String name;
    private final Function0<Unit> onClick;
    private final String photoUrl;
    private final int totalMatches;

    public static /* synthetic */ FlashBetCategoryItem copy$default(FlashBetCategoryItem flashBetCategoryItem, String str, String str2, String str3, int i, int i2, Function0 function0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = flashBetCategoryItem.id;
        }
        if ((i3 & 2) != 0) {
            str2 = flashBetCategoryItem.name;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = flashBetCategoryItem.photoUrl;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = flashBetCategoryItem.currentMatches;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = flashBetCategoryItem.totalMatches;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            function0 = flashBetCategoryItem.onClick;
        }
        return flashBetCategoryItem.copy(str, str4, str5, i4, i5, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
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
    public final int getCurrentMatches() {
        return this.currentMatches;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public final Function0<Unit> component6() {
        return this.onClick;
    }

    public final FlashBetCategoryItem copy(String id, String name, String photoUrl, int currentMatches, int totalMatches, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new FlashBetCategoryItem(id, name, photoUrl, currentMatches, totalMatches, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetCategoryItem)) {
            return false;
        }
        FlashBetCategoryItem flashBetCategoryItem = (FlashBetCategoryItem) other;
        return Intrinsics.areEqual(this.id, flashBetCategoryItem.id) && Intrinsics.areEqual(this.name, flashBetCategoryItem.name) && Intrinsics.areEqual(this.photoUrl, flashBetCategoryItem.photoUrl) && this.currentMatches == flashBetCategoryItem.currentMatches && this.totalMatches == flashBetCategoryItem.totalMatches && Intrinsics.areEqual(this.onClick, flashBetCategoryItem.onClick);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.currentMatches)) * 31) + Integer.hashCode(this.totalMatches)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "FlashBetCategoryItem(id=" + this.id + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", currentMatches=" + this.currentMatches + ", totalMatches=" + this.totalMatches + ", onClick=" + this.onClick + ")";
    }

    public FlashBetCategoryItem(String id, String name, String photoUrl, int i, int i2, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id;
        this.name = name;
        this.photoUrl = photoUrl;
        this.currentMatches = i;
        this.totalMatches = i2;
        this.onClick = onClick;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getCurrentMatches() {
        return this.currentMatches;
    }

    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public /* synthetic */ FlashBetCategoryItem(String str, String str2, String str3, int i, int i2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, i2, (i3 & 32) != 0 ? new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItem$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
