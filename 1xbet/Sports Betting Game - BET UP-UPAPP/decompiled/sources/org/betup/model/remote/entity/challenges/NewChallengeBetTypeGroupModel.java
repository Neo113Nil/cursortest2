package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010Jb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006*"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;", "", "id", "", "level", "", "name", "", "userAvailable", "", "displayColumns", "expToNextLevel", "levelStartExp", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getUserAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayColumns", "getExpToNextLevel", "getLevelStartExp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Lorg/betup/model/remote/entity/challenges/NewChallengeBetTypeGroupModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeBetTypeGroupModel {
    public static final int $stable = 0;

    @SerializedName("displayColumns")
    private final Integer displayColumns;

    @SerializedName("expToNextLevel")
    private final Long expToNextLevel;

    @SerializedName("id")
    private final Long id;

    @SerializedName("level")
    private final Integer level;

    @SerializedName("levelStartExp")
    private final Long levelStartExp;

    @SerializedName("name")
    private final String name;

    @SerializedName("user_available")
    private final Boolean userAvailable;

    public static /* synthetic */ NewChallengeBetTypeGroupModel copy$default(NewChallengeBetTypeGroupModel newChallengeBetTypeGroupModel, Long l, Integer num, String str, Boolean bool, Integer num2, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = newChallengeBetTypeGroupModel.id;
        }
        if ((i & 2) != 0) {
            num = newChallengeBetTypeGroupModel.level;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str = newChallengeBetTypeGroupModel.name;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            bool = newChallengeBetTypeGroupModel.userAvailable;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            num2 = newChallengeBetTypeGroupModel.displayColumns;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            l2 = newChallengeBetTypeGroupModel.expToNextLevel;
        }
        Long l4 = l2;
        if ((i & 64) != 0) {
            l3 = newChallengeBetTypeGroupModel.levelStartExp;
        }
        return newChallengeBetTypeGroupModel.copy(l, num3, str2, bool2, num4, l4, l3);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getUserAvailable() {
        return this.userAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDisplayColumns() {
        return this.displayColumns;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getLevelStartExp() {
        return this.levelStartExp;
    }

    public final NewChallengeBetTypeGroupModel copy(Long id, Integer level, String name, Boolean userAvailable, Integer displayColumns, Long expToNextLevel, Long levelStartExp) {
        return new NewChallengeBetTypeGroupModel(id, level, name, userAvailable, displayColumns, expToNextLevel, levelStartExp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeBetTypeGroupModel)) {
            return false;
        }
        NewChallengeBetTypeGroupModel newChallengeBetTypeGroupModel = (NewChallengeBetTypeGroupModel) other;
        return Intrinsics.areEqual(this.id, newChallengeBetTypeGroupModel.id) && Intrinsics.areEqual(this.level, newChallengeBetTypeGroupModel.level) && Intrinsics.areEqual(this.name, newChallengeBetTypeGroupModel.name) && Intrinsics.areEqual(this.userAvailable, newChallengeBetTypeGroupModel.userAvailable) && Intrinsics.areEqual(this.displayColumns, newChallengeBetTypeGroupModel.displayColumns) && Intrinsics.areEqual(this.expToNextLevel, newChallengeBetTypeGroupModel.expToNextLevel) && Intrinsics.areEqual(this.levelStartExp, newChallengeBetTypeGroupModel.levelStartExp);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.level;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.userAvailable;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.displayColumns;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.expToNextLevel;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.levelStartExp;
        return hashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeBetTypeGroupModel(id=" + this.id + ", level=" + this.level + ", name=" + this.name + ", userAvailable=" + this.userAvailable + ", displayColumns=" + this.displayColumns + ", expToNextLevel=" + this.expToNextLevel + ", levelStartExp=" + this.levelStartExp + ")";
    }

    public NewChallengeBetTypeGroupModel(Long l, Integer num, String str, Boolean bool, Integer num2, Long l2, Long l3) {
        this.id = l;
        this.level = num;
        this.name = str;
        this.userAvailable = bool;
        this.displayColumns = num2;
        this.expToNextLevel = l2;
        this.levelStartExp = l3;
    }

    public final Long getId() {
        return this.id;
    }

    public final Integer getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getUserAvailable() {
        return this.userAvailable;
    }

    public final Integer getDisplayColumns() {
        return this.displayColumns;
    }

    public final Long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public final Long getLevelStartExp() {
        return this.levelStartExp;
    }
}
