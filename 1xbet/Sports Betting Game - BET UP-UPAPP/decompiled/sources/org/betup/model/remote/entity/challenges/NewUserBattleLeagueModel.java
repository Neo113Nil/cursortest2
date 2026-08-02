package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleMatchModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;", "", "id", "", "photoUrl", "", "name", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhotoUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/challenges/NewUserBattleLeagueModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleLeagueModel {
    public static final int $stable = 0;

    @SerializedName("id")
    private final Integer id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewUserBattleLeagueModel copy$default(NewUserBattleLeagueModel newUserBattleLeagueModel, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newUserBattleLeagueModel.id;
        }
        if ((i & 2) != 0) {
            str = newUserBattleLeagueModel.photoUrl;
        }
        if ((i & 4) != 0) {
            str2 = newUserBattleLeagueModel.name;
        }
        return newUserBattleLeagueModel.copy(num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final NewUserBattleLeagueModel copy(Integer id, String photoUrl, String name) {
        return new NewUserBattleLeagueModel(id, photoUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleLeagueModel)) {
            return false;
        }
        NewUserBattleLeagueModel newUserBattleLeagueModel = (NewUserBattleLeagueModel) other;
        return Intrinsics.areEqual(this.id, newUserBattleLeagueModel.id) && Intrinsics.areEqual(this.photoUrl, newUserBattleLeagueModel.photoUrl) && Intrinsics.areEqual(this.name, newUserBattleLeagueModel.name);
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleLeagueModel(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ")";
    }

    public NewUserBattleLeagueModel(Integer num, String str, String str2) {
        this.id = num;
        this.photoUrl = str;
        this.name = str2;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }
}
