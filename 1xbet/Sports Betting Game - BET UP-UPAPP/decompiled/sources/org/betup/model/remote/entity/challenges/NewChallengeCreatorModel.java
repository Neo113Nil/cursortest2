package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeCreatorModel;", "", "id", "", "name", "", "email", "photoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getEmail", "getPhotoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeCreatorModel {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("photoUrl")
    private final String photoUrl;

    public static /* synthetic */ NewChallengeCreatorModel copy$default(NewChallengeCreatorModel newChallengeCreatorModel, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newChallengeCreatorModel.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = newChallengeCreatorModel.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = newChallengeCreatorModel.email;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = newChallengeCreatorModel.photoUrl;
        }
        return newChallengeCreatorModel.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final NewChallengeCreatorModel copy(long id, String name, String email, String photoUrl) {
        return new NewChallengeCreatorModel(id, name, email, photoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeCreatorModel)) {
            return false;
        }
        NewChallengeCreatorModel newChallengeCreatorModel = (NewChallengeCreatorModel) other;
        return this.id == newChallengeCreatorModel.id && Intrinsics.areEqual(this.name, newChallengeCreatorModel.name) && Intrinsics.areEqual(this.email, newChallengeCreatorModel.email) && Intrinsics.areEqual(this.photoUrl, newChallengeCreatorModel.photoUrl);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeCreatorModel(id=" + this.id + ", name=" + this.name + ", email=" + this.email + ", photoUrl=" + this.photoUrl + ")";
    }

    public NewChallengeCreatorModel(long j, String str, String str2, String str3) {
        this.id = j;
        this.name = str;
        this.email = str2;
        this.photoUrl = str3;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }
}
