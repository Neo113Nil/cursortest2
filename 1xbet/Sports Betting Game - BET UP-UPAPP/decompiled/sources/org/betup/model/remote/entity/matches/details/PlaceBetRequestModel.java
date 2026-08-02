package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PlaceBetRequestModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/PlaceBetRequestModel;", "", "id", "", "coefficient", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JD)V", "getId", "()J", "getCoefficient", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlaceBetRequestModel {
    public static final int $stable = 0;

    @SerializedName("coefficient")
    private final double coefficient;

    @SerializedName("id")
    private final long id;

    public static /* synthetic */ PlaceBetRequestModel copy$default(PlaceBetRequestModel placeBetRequestModel, long j, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            j = placeBetRequestModel.id;
        }
        if ((i & 2) != 0) {
            d = placeBetRequestModel.coefficient;
        }
        return placeBetRequestModel.copy(j, d);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCoefficient() {
        return this.coefficient;
    }

    public final PlaceBetRequestModel copy(long id, double coefficient) {
        return new PlaceBetRequestModel(id, coefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequestModel)) {
            return false;
        }
        PlaceBetRequestModel placeBetRequestModel = (PlaceBetRequestModel) other;
        return this.id == placeBetRequestModel.id && Double.compare(this.coefficient, placeBetRequestModel.coefficient) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + Double.hashCode(this.coefficient);
    }

    public String toString() {
        return "PlaceBetRequestModel(id=" + this.id + ", coefficient=" + this.coefficient + ")";
    }

    public PlaceBetRequestModel(long j, double d) {
        this.id = j;
        this.coefficient = d;
    }

    public final double getCoefficient() {
        return this.coefficient;
    }

    public final long getId() {
        return this.id;
    }
}
