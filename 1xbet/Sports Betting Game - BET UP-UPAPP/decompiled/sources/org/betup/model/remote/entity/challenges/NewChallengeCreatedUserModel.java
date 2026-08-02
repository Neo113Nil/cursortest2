package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;", "", "photoUrl", "", "id", "", "name", "country", "Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;)V", "getPhotoUrl", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getCountry", "()Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;)Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedUserModel;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeCreatedUserModel {
    public static final int $stable = 0;

    @SerializedName("country")
    private final NewChallengeCreatedCountryModel country;

    @SerializedName("id")
    private final Long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewChallengeCreatedUserModel copy$default(NewChallengeCreatedUserModel newChallengeCreatedUserModel, String str, Long l, String str2, NewChallengeCreatedCountryModel newChallengeCreatedCountryModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newChallengeCreatedUserModel.photoUrl;
        }
        if ((i & 2) != 0) {
            l = newChallengeCreatedUserModel.id;
        }
        if ((i & 4) != 0) {
            str2 = newChallengeCreatedUserModel.name;
        }
        if ((i & 8) != 0) {
            newChallengeCreatedCountryModel = newChallengeCreatedUserModel.country;
        }
        return newChallengeCreatedUserModel.copy(str, l, str2, newChallengeCreatedCountryModel);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final NewChallengeCreatedCountryModel getCountry() {
        return this.country;
    }

    public final NewChallengeCreatedUserModel copy(String photoUrl, Long id, String name, NewChallengeCreatedCountryModel country) {
        return new NewChallengeCreatedUserModel(photoUrl, id, name, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeCreatedUserModel)) {
            return false;
        }
        NewChallengeCreatedUserModel newChallengeCreatedUserModel = (NewChallengeCreatedUserModel) other;
        return Intrinsics.areEqual(this.photoUrl, newChallengeCreatedUserModel.photoUrl) && Intrinsics.areEqual(this.id, newChallengeCreatedUserModel.id) && Intrinsics.areEqual(this.name, newChallengeCreatedUserModel.name) && Intrinsics.areEqual(this.country, newChallengeCreatedUserModel.country);
    }

    public int hashCode() {
        String str = this.photoUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.id;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NewChallengeCreatedCountryModel newChallengeCreatedCountryModel = this.country;
        return hashCode3 + (newChallengeCreatedCountryModel != null ? newChallengeCreatedCountryModel.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeCreatedUserModel(photoUrl=" + this.photoUrl + ", id=" + this.id + ", name=" + this.name + ", country=" + this.country + ")";
    }

    public NewChallengeCreatedUserModel(String str, Long l, String str2, NewChallengeCreatedCountryModel newChallengeCreatedCountryModel) {
        this.photoUrl = str;
        this.id = l;
        this.name = str2;
        this.country = newChallengeCreatedCountryModel;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final NewChallengeCreatedCountryModel getCountry() {
        return this.country;
    }
}
