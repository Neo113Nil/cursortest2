package org.betup.model.remote.entity.teams;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TeamImageUrlModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lorg/betup/model/remote/entity/teams/TeamImageUrlModel;", "", "photoUrl", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getPhotoUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TeamImageUrlModel {
    public static final int $stable = 0;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ TeamImageUrlModel copy$default(TeamImageUrlModel teamImageUrlModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamImageUrlModel.photoUrl;
        }
        return teamImageUrlModel.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final TeamImageUrlModel copy(String photoUrl) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new TeamImageUrlModel(photoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TeamImageUrlModel) && Intrinsics.areEqual(this.photoUrl, ((TeamImageUrlModel) other).photoUrl);
    }

    public int hashCode() {
        return this.photoUrl.hashCode();
    }

    public String toString() {
        return "TeamImageUrlModel(photoUrl=" + this.photoUrl + ")";
    }

    public TeamImageUrlModel(String photoUrl) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.photoUrl = photoUrl;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }
}
