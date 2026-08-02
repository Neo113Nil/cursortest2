package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7ChallengeDetailsResponseModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/entity/challenges/V7ChallengeUserModel;", "", "photoUrl", "", "id", "", "name", "country", "Lorg/betup/model/remote/entity/challenges/V7ChallengeCountryModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLjava/lang/String;Lorg/betup/model/remote/entity/challenges/V7ChallengeCountryModel;)V", "getPhotoUrl", "()Ljava/lang/String;", "getId", "()J", "getName", "getCountry", "()Lorg/betup/model/remote/entity/challenges/V7ChallengeCountryModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7ChallengeUserModel {
    public static final int $stable = 0;

    @SerializedName("country")
    private final V7ChallengeCountryModel country;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ V7ChallengeUserModel copy$default(V7ChallengeUserModel v7ChallengeUserModel, String str, long j, String str2, V7ChallengeCountryModel v7ChallengeCountryModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v7ChallengeUserModel.photoUrl;
        }
        if ((i & 2) != 0) {
            j = v7ChallengeUserModel.id;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = v7ChallengeUserModel.name;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            v7ChallengeCountryModel = v7ChallengeUserModel.country;
        }
        return v7ChallengeUserModel.copy(str, j2, str3, v7ChallengeCountryModel);
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
    public final V7ChallengeCountryModel getCountry() {
        return this.country;
    }

    public final V7ChallengeUserModel copy(String photoUrl, long id, String name, V7ChallengeCountryModel country) {
        return new V7ChallengeUserModel(photoUrl, id, name, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7ChallengeUserModel)) {
            return false;
        }
        V7ChallengeUserModel v7ChallengeUserModel = (V7ChallengeUserModel) other;
        return Intrinsics.areEqual(this.photoUrl, v7ChallengeUserModel.photoUrl) && this.id == v7ChallengeUserModel.id && Intrinsics.areEqual(this.name, v7ChallengeUserModel.name) && Intrinsics.areEqual(this.country, v7ChallengeUserModel.country);
    }

    public int hashCode() {
        String str = this.photoUrl;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.id)) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        V7ChallengeCountryModel v7ChallengeCountryModel = this.country;
        return hashCode2 + (v7ChallengeCountryModel != null ? v7ChallengeCountryModel.hashCode() : 0);
    }

    public String toString() {
        return "V7ChallengeUserModel(photoUrl=" + this.photoUrl + ", id=" + this.id + ", name=" + this.name + ", country=" + this.country + ")";
    }

    public V7ChallengeUserModel(String str, long j, String str2, V7ChallengeCountryModel v7ChallengeCountryModel) {
        this.photoUrl = str;
        this.id = j;
        this.name = str2;
        this.country = v7ChallengeCountryModel;
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

    public final V7ChallengeCountryModel getCountry() {
        return this.country;
    }
}
