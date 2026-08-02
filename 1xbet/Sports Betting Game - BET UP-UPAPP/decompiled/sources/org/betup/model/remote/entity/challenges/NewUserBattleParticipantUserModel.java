package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleParticipantUserModel;", "", "photoUrl", "", "id", "", "name", "country", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Object;)V", "getPhotoUrl", "()Ljava/lang/String;", "getId", "()J", "getName", "getCountry", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleParticipantUserModel {
    public static final int $stable = 8;

    @SerializedName("country")
    private final Object country;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewUserBattleParticipantUserModel copy$default(NewUserBattleParticipantUserModel newUserBattleParticipantUserModel, String str, long j, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = newUserBattleParticipantUserModel.photoUrl;
        }
        if ((i & 2) != 0) {
            j = newUserBattleParticipantUserModel.id;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = newUserBattleParticipantUserModel.name;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            obj = newUserBattleParticipantUserModel.country;
        }
        return newUserBattleParticipantUserModel.copy(str, j2, str3, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getCountry() {
        return this.country;
    }

    public final NewUserBattleParticipantUserModel copy(String photoUrl, long id, String name, Object country) {
        return new NewUserBattleParticipantUserModel(photoUrl, id, name, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleParticipantUserModel)) {
            return false;
        }
        NewUserBattleParticipantUserModel newUserBattleParticipantUserModel = (NewUserBattleParticipantUserModel) other;
        return Intrinsics.areEqual(this.photoUrl, newUserBattleParticipantUserModel.photoUrl) && this.id == newUserBattleParticipantUserModel.id && Intrinsics.areEqual(this.name, newUserBattleParticipantUserModel.name) && Intrinsics.areEqual(this.country, newUserBattleParticipantUserModel.country);
    }

    public int hashCode() {
        String str = this.photoUrl;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.id)) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.country;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleParticipantUserModel(photoUrl=" + this.photoUrl + ", id=" + this.id + ", name=" + this.name + ", country=" + this.country + ")";
    }

    public NewUserBattleParticipantUserModel(String str, long j, String str2, Object obj) {
        this.photoUrl = str;
        this.id = j;
        this.name = str2;
        this.country = obj;
    }

    public /* synthetic */ NewUserBattleParticipantUserModel(String str, long j, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, (i & 8) != 0 ? null : obj);
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getCountry() {
        return this.country;
    }
}
