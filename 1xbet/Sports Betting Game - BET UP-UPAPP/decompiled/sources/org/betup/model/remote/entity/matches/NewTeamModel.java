package org.betup.model.remote.entity.matches;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewTeamModel;", "", "id", "", "photoUrl", "", "name", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewTeamModel {
    public static final int $stable = 0;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewTeamModel copy$default(NewTeamModel newTeamModel, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newTeamModel.id;
        }
        if ((i & 2) != 0) {
            str = newTeamModel.photoUrl;
        }
        if ((i & 4) != 0) {
            str2 = newTeamModel.name;
        }
        return newTeamModel.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
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

    public final NewTeamModel copy(long id, String photoUrl, String name) {
        return new NewTeamModel(id, photoUrl, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewTeamModel)) {
            return false;
        }
        NewTeamModel newTeamModel = (NewTeamModel) other;
        return this.id == newTeamModel.id && Intrinsics.areEqual(this.photoUrl, newTeamModel.photoUrl) && Intrinsics.areEqual(this.name, newTeamModel.name);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NewTeamModel(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ")";
    }

    public NewTeamModel(long j, String str, String str2) {
        this.id = j;
        this.photoUrl = str;
        this.name = str2;
    }

    public final long getId() {
        return this.id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getName() {
        return this.name;
    }
}
