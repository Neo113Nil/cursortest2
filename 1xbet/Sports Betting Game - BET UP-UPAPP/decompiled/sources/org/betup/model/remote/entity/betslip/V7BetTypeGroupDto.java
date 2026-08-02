package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7GrabbedBetsResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7BetTypeGroupDto;", "", "id", "", "displayColumns", "", "userAvailable", "", "name", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIZLjava/lang/String;)V", "getId", "()J", "getDisplayColumns", "()I", "getUserAvailable", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7BetTypeGroupDto {
    public static final int $stable = 0;

    @SerializedName("displayColumns")
    private final int displayColumns;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("user_available")
    private final boolean userAvailable;

    public static /* synthetic */ V7BetTypeGroupDto copy$default(V7BetTypeGroupDto v7BetTypeGroupDto, long j, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = v7BetTypeGroupDto.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = v7BetTypeGroupDto.displayColumns;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = v7BetTypeGroupDto.userAvailable;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str = v7BetTypeGroupDto.name;
        }
        return v7BetTypeGroupDto.copy(j2, i3, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUserAvailable() {
        return this.userAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final V7BetTypeGroupDto copy(long id, int displayColumns, boolean userAvailable, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new V7BetTypeGroupDto(id, displayColumns, userAvailable, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7BetTypeGroupDto)) {
            return false;
        }
        V7BetTypeGroupDto v7BetTypeGroupDto = (V7BetTypeGroupDto) other;
        return this.id == v7BetTypeGroupDto.id && this.displayColumns == v7BetTypeGroupDto.displayColumns && this.userAvailable == v7BetTypeGroupDto.userAvailable && Intrinsics.areEqual(this.name, v7BetTypeGroupDto.name);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.displayColumns)) * 31) + Boolean.hashCode(this.userAvailable)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "V7BetTypeGroupDto(id=" + this.id + ", displayColumns=" + this.displayColumns + ", userAvailable=" + this.userAvailable + ", name=" + this.name + ")";
    }

    public V7BetTypeGroupDto(long j, int i, boolean z, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.displayColumns = i;
        this.userAvailable = z;
        this.name = name;
    }

    public final long getId() {
        return this.id;
    }

    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    public final boolean getUserAvailable() {
        return this.userAvailable;
    }

    public final String getName() {
        return this.name;
    }
}
