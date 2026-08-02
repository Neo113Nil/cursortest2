package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetGroupResponseModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/BetGroupResponseModel;", "", "id", "", "level", "name", "", "displayColumns", "available", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IILjava/lang/String;IZ)V", "getId", "()I", "getLevel", "getName", "()Ljava/lang/String;", "getDisplayColumns", "getAvailable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BetGroupResponseModel {
    public static final int $stable = 0;

    @SerializedName("available")
    private final boolean available;

    @SerializedName("displayColumns")
    private final int displayColumns;

    @SerializedName("id")
    private final int id;

    @SerializedName("level")
    private final int level;

    @SerializedName("name")
    private final String name;

    public static /* synthetic */ BetGroupResponseModel copy$default(BetGroupResponseModel betGroupResponseModel, int i, int i2, String str, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = betGroupResponseModel.id;
        }
        if ((i4 & 2) != 0) {
            i2 = betGroupResponseModel.level;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = betGroupResponseModel.name;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            i3 = betGroupResponseModel.displayColumns;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            z = betGroupResponseModel.available;
        }
        return betGroupResponseModel.copy(i, i5, str2, i6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    public final BetGroupResponseModel copy(int id, int level, String name, int displayColumns, boolean available) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BetGroupResponseModel(id, level, name, displayColumns, available);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetGroupResponseModel)) {
            return false;
        }
        BetGroupResponseModel betGroupResponseModel = (BetGroupResponseModel) other;
        return this.id == betGroupResponseModel.id && this.level == betGroupResponseModel.level && Intrinsics.areEqual(this.name, betGroupResponseModel.name) && this.displayColumns == betGroupResponseModel.displayColumns && this.available == betGroupResponseModel.available;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.level)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.displayColumns)) * 31) + Boolean.hashCode(this.available);
    }

    public String toString() {
        return "BetGroupResponseModel(id=" + this.id + ", level=" + this.level + ", name=" + this.name + ", displayColumns=" + this.displayColumns + ", available=" + this.available + ")";
    }

    public BetGroupResponseModel(int i, int i2, String name, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.level = i2;
        this.name = name;
        this.displayColumns = i3;
        this.available = z;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    public final boolean getAvailable() {
        return this.available;
    }
}
