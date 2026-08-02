package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;", "", "id", "", "iso", "", "niceName", "photo", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIso", "()Ljava/lang/String;", "getNiceName", "getPhoto", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/challenges/NewChallengeCreatedCountryModel;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeCreatedCountryModel {
    public static final int $stable = 0;

    @SerializedName("id")
    private final Long id;

    @SerializedName("iso")
    private final String iso;

    @SerializedName("nice_name")
    private final String niceName;

    @SerializedName("photo")
    private final String photo;

    public static /* synthetic */ NewChallengeCreatedCountryModel copy$default(NewChallengeCreatedCountryModel newChallengeCreatedCountryModel, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = newChallengeCreatedCountryModel.id;
        }
        if ((i & 2) != 0) {
            str = newChallengeCreatedCountryModel.iso;
        }
        if ((i & 4) != 0) {
            str2 = newChallengeCreatedCountryModel.niceName;
        }
        if ((i & 8) != 0) {
            str3 = newChallengeCreatedCountryModel.photo;
        }
        return newChallengeCreatedCountryModel.copy(l, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNiceName() {
        return this.niceName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    public final NewChallengeCreatedCountryModel copy(Long id, String iso, String niceName, String photo) {
        return new NewChallengeCreatedCountryModel(id, iso, niceName, photo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeCreatedCountryModel)) {
            return false;
        }
        NewChallengeCreatedCountryModel newChallengeCreatedCountryModel = (NewChallengeCreatedCountryModel) other;
        return Intrinsics.areEqual(this.id, newChallengeCreatedCountryModel.id) && Intrinsics.areEqual(this.iso, newChallengeCreatedCountryModel.iso) && Intrinsics.areEqual(this.niceName, newChallengeCreatedCountryModel.niceName) && Intrinsics.areEqual(this.photo, newChallengeCreatedCountryModel.photo);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.iso;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.niceName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeCreatedCountryModel(id=" + this.id + ", iso=" + this.iso + ", niceName=" + this.niceName + ", photo=" + this.photo + ")";
    }

    public NewChallengeCreatedCountryModel(Long l, String str, String str2, String str3) {
        this.id = l;
        this.iso = str;
        this.niceName = str2;
        this.photo = str3;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getNiceName() {
        return this.niceName;
    }

    public final String getPhoto() {
        return this.photo;
    }
}
