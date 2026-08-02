package org.betup.model.remote.entity.betslip;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7CreateBetlistRequestModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7CreateBetlistRequestModel;", "", "moneyPlaced", "", "grabbedBetIds", "", "", "grabbedBetCoefs", AppLovinEventTypes.USER_COMPLETED_TUTORIAL, "", "forceAccept", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(DLjava/util/List;Ljava/util/List;ZZ)V", "getMoneyPlaced", "()D", "getGrabbedBetIds", "()Ljava/util/List;", "getGrabbedBetCoefs", "getTutorial", "()Z", "getForceAccept", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7CreateBetlistRequestModel {
    public static final int $stable = 8;

    @SerializedName("forceAccept")
    private final boolean forceAccept;

    @SerializedName("grabbedBetCoefs")
    private final List<Double> grabbedBetCoefs;

    @SerializedName("grabbedBetIds")
    private final List<Long> grabbedBetIds;

    @SerializedName("moneyPlaced")
    private final double moneyPlaced;

    @SerializedName(AppLovinEventTypes.USER_COMPLETED_TUTORIAL)
    private final boolean tutorial;

    public V7CreateBetlistRequestModel() {
        this(0.0d, null, null, false, false, 31, null);
    }

    public static /* synthetic */ V7CreateBetlistRequestModel copy$default(V7CreateBetlistRequestModel v7CreateBetlistRequestModel, double d, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = v7CreateBetlistRequestModel.moneyPlaced;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            list = v7CreateBetlistRequestModel.grabbedBetIds;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = v7CreateBetlistRequestModel.grabbedBetCoefs;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            z = v7CreateBetlistRequestModel.tutorial;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = v7CreateBetlistRequestModel.forceAccept;
        }
        return v7CreateBetlistRequestModel.copy(d2, list3, list4, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final List<Long> component2() {
        return this.grabbedBetIds;
    }

    public final List<Double> component3() {
        return this.grabbedBetCoefs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTutorial() {
        return this.tutorial;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getForceAccept() {
        return this.forceAccept;
    }

    public final V7CreateBetlistRequestModel copy(double moneyPlaced, List<Long> grabbedBetIds, List<Double> grabbedBetCoefs, boolean tutorial, boolean forceAccept) {
        Intrinsics.checkNotNullParameter(grabbedBetIds, "grabbedBetIds");
        Intrinsics.checkNotNullParameter(grabbedBetCoefs, "grabbedBetCoefs");
        return new V7CreateBetlistRequestModel(moneyPlaced, grabbedBetIds, grabbedBetCoefs, tutorial, forceAccept);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7CreateBetlistRequestModel)) {
            return false;
        }
        V7CreateBetlistRequestModel v7CreateBetlistRequestModel = (V7CreateBetlistRequestModel) other;
        return Double.compare(this.moneyPlaced, v7CreateBetlistRequestModel.moneyPlaced) == 0 && Intrinsics.areEqual(this.grabbedBetIds, v7CreateBetlistRequestModel.grabbedBetIds) && Intrinsics.areEqual(this.grabbedBetCoefs, v7CreateBetlistRequestModel.grabbedBetCoefs) && this.tutorial == v7CreateBetlistRequestModel.tutorial && this.forceAccept == v7CreateBetlistRequestModel.forceAccept;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.moneyPlaced) * 31) + this.grabbedBetIds.hashCode()) * 31) + this.grabbedBetCoefs.hashCode()) * 31) + Boolean.hashCode(this.tutorial)) * 31) + Boolean.hashCode(this.forceAccept);
    }

    public String toString() {
        return "V7CreateBetlistRequestModel(moneyPlaced=" + this.moneyPlaced + ", grabbedBetIds=" + this.grabbedBetIds + ", grabbedBetCoefs=" + this.grabbedBetCoefs + ", tutorial=" + this.tutorial + ", forceAccept=" + this.forceAccept + ")";
    }

    public V7CreateBetlistRequestModel(double d, List<Long> grabbedBetIds, List<Double> grabbedBetCoefs, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(grabbedBetIds, "grabbedBetIds");
        Intrinsics.checkNotNullParameter(grabbedBetCoefs, "grabbedBetCoefs");
        this.moneyPlaced = d;
        this.grabbedBetIds = grabbedBetIds;
        this.grabbedBetCoefs = grabbedBetCoefs;
        this.tutorial = z;
        this.forceAccept = z2;
    }

    public final double getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final List<Long> getGrabbedBetIds() {
        return this.grabbedBetIds;
    }

    public /* synthetic */ V7CreateBetlistRequestModel(double d, List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public final List<Double> getGrabbedBetCoefs() {
        return this.grabbedBetCoefs;
    }

    public final boolean getTutorial() {
        return this.tutorial;
    }

    public final boolean getForceAccept() {
        return this.forceAccept;
    }
}
