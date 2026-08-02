package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchBetModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewBetGroupInfoModel;", "", "id", "", "level", "", "name", "", "userAvailable", "", "displayColumns", "expToNextLevel", "levelStartExp", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JILjava/lang/String;ZIII)V", "getId", "()J", "getLevel", "()I", "getName", "()Ljava/lang/String;", "getUserAvailable", "()Z", "getDisplayColumns", "getExpToNextLevel", "getLevelStartExp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewBetGroupInfoModel {
    public static final int $stable = 0;

    @SerializedName("displayColumns")
    private final int displayColumns;

    @SerializedName("expToNextLevel")
    private final int expToNextLevel;

    @SerializedName("id")
    private final long id;

    @SerializedName("level")
    private final int level;

    @SerializedName("levelStartExp")
    private final int levelStartExp;

    @SerializedName("name")
    private final String name;

    @SerializedName("user_available")
    private final boolean userAvailable;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
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
    public final boolean getUserAvailable() {
        return this.userAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    /* renamed from: component6, reason: from getter */
    public final int getExpToNextLevel() {
        return this.expToNextLevel;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLevelStartExp() {
        return this.levelStartExp;
    }

    public final NewBetGroupInfoModel copy(long id, int level, String name, boolean userAvailable, int displayColumns, int expToNextLevel, int levelStartExp) {
        return new NewBetGroupInfoModel(id, level, name, userAvailable, displayColumns, expToNextLevel, levelStartExp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewBetGroupInfoModel)) {
            return false;
        }
        NewBetGroupInfoModel newBetGroupInfoModel = (NewBetGroupInfoModel) other;
        return this.id == newBetGroupInfoModel.id && this.level == newBetGroupInfoModel.level && Intrinsics.areEqual(this.name, newBetGroupInfoModel.name) && this.userAvailable == newBetGroupInfoModel.userAvailable && this.displayColumns == newBetGroupInfoModel.displayColumns && this.expToNextLevel == newBetGroupInfoModel.expToNextLevel && this.levelStartExp == newBetGroupInfoModel.levelStartExp;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Integer.hashCode(this.level)) * 31;
        String str = this.name;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.userAvailable)) * 31) + Integer.hashCode(this.displayColumns)) * 31) + Integer.hashCode(this.expToNextLevel)) * 31) + Integer.hashCode(this.levelStartExp);
    }

    public String toString() {
        return "NewBetGroupInfoModel(id=" + this.id + ", level=" + this.level + ", name=" + this.name + ", userAvailable=" + this.userAvailable + ", displayColumns=" + this.displayColumns + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ")";
    }

    public NewBetGroupInfoModel(long j, int i, String str, boolean z, int i2, int i3, int i4) {
        this.id = j;
        this.level = i;
        this.name = str;
        this.userAvailable = z;
        this.displayColumns = i2;
        this.expToNextLevel = i3;
        this.levelStartExp = i4;
    }

    public final long getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getUserAvailable() {
        return this.userAvailable;
    }

    public final int getDisplayColumns() {
        return this.displayColumns;
    }

    public final int getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public final int getLevelStartExp() {
        return this.levelStartExp;
    }
}
