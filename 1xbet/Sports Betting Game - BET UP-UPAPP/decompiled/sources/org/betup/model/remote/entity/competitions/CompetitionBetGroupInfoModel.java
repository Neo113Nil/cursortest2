package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupInfoModel;", "", "id", "", "level", "name", "", "userAvailable", "", "displayColumns", "expToNextLevel", "levelStartExp", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IILjava/lang/String;ZIII)V", "getId", "()I", "getLevel", "getName", "()Ljava/lang/String;", "getUserAvailable", "()Z", "getDisplayColumns", "getExpToNextLevel", "getLevelStartExp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionBetGroupInfoModel {
    public static final int $stable = 0;

    @SerializedName("displayColumns")
    private final int displayColumns;

    @SerializedName("expToNextLevel")
    private final int expToNextLevel;

    @SerializedName("id")
    private final int id;

    @SerializedName("level")
    private final int level;

    @SerializedName("levelStartExp")
    private final int levelStartExp;

    @SerializedName("name")
    private final String name;

    @SerializedName("user_available")
    private final boolean userAvailable;

    public CompetitionBetGroupInfoModel() {
        this(0, 0, null, false, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ CompetitionBetGroupInfoModel copy$default(CompetitionBetGroupInfoModel competitionBetGroupInfoModel, int i, int i2, String str, boolean z, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = competitionBetGroupInfoModel.id;
        }
        if ((i6 & 2) != 0) {
            i2 = competitionBetGroupInfoModel.level;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            str = competitionBetGroupInfoModel.name;
        }
        String str2 = str;
        if ((i6 & 8) != 0) {
            z = competitionBetGroupInfoModel.userAvailable;
        }
        boolean z2 = z;
        if ((i6 & 16) != 0) {
            i3 = competitionBetGroupInfoModel.displayColumns;
        }
        int i8 = i3;
        if ((i6 & 32) != 0) {
            i4 = competitionBetGroupInfoModel.expToNextLevel;
        }
        int i9 = i4;
        if ((i6 & 64) != 0) {
            i5 = competitionBetGroupInfoModel.levelStartExp;
        }
        return competitionBetGroupInfoModel.copy(i, i7, str2, z2, i8, i9, i5);
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

    public final CompetitionBetGroupInfoModel copy(int id, int level, String name, boolean userAvailable, int displayColumns, int expToNextLevel, int levelStartExp) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CompetitionBetGroupInfoModel(id, level, name, userAvailable, displayColumns, expToNextLevel, levelStartExp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionBetGroupInfoModel)) {
            return false;
        }
        CompetitionBetGroupInfoModel competitionBetGroupInfoModel = (CompetitionBetGroupInfoModel) other;
        return this.id == competitionBetGroupInfoModel.id && this.level == competitionBetGroupInfoModel.level && Intrinsics.areEqual(this.name, competitionBetGroupInfoModel.name) && this.userAvailable == competitionBetGroupInfoModel.userAvailable && this.displayColumns == competitionBetGroupInfoModel.displayColumns && this.expToNextLevel == competitionBetGroupInfoModel.expToNextLevel && this.levelStartExp == competitionBetGroupInfoModel.levelStartExp;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.level)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.userAvailable)) * 31) + Integer.hashCode(this.displayColumns)) * 31) + Integer.hashCode(this.expToNextLevel)) * 31) + Integer.hashCode(this.levelStartExp);
    }

    public String toString() {
        return "CompetitionBetGroupInfoModel(id=" + this.id + ", level=" + this.level + ", name=" + this.name + ", userAvailable=" + this.userAvailable + ", displayColumns=" + this.displayColumns + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ")";
    }

    public CompetitionBetGroupInfoModel(int i, int i2, String name, boolean z, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.level = i2;
        this.name = name;
        this.userAvailable = z;
        this.displayColumns = i3;
        this.expToNextLevel = i4;
        this.levelStartExp = i5;
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

    public /* synthetic */ CompetitionBetGroupInfoModel(int i, int i2, String str, boolean z, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? true : z, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5);
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
