package org.betup.model.remote.entity.challenges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewChallengeDetailsResponseModelP.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewChallengeSportModel;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewChallengeSportModel {
    public static final int $stable = 8;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private final String period;

    @SerializedName("photo_background")
    private final Object photoBackground;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewChallengeSportModel copy$default(NewChallengeSportModel newChallengeSportModel, long j, String str, String str2, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = newChallengeSportModel.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = newChallengeSportModel.photoUrl;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = newChallengeSportModel.name;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = newChallengeSportModel.period;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            obj = newChallengeSportModel.photoBackground;
        }
        return newChallengeSportModel.copy(j2, str4, str5, str6, obj);
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

    /* renamed from: component4, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getPhotoBackground() {
        return this.photoBackground;
    }

    public final NewChallengeSportModel copy(long id, String photoUrl, String name, String period, Object photoBackground) {
        return new NewChallengeSportModel(id, photoUrl, name, period, photoBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewChallengeSportModel)) {
            return false;
        }
        NewChallengeSportModel newChallengeSportModel = (NewChallengeSportModel) other;
        return this.id == newChallengeSportModel.id && Intrinsics.areEqual(this.photoUrl, newChallengeSportModel.photoUrl) && Intrinsics.areEqual(this.name, newChallengeSportModel.name) && Intrinsics.areEqual(this.period, newChallengeSportModel.period) && Intrinsics.areEqual(this.photoBackground, newChallengeSportModel.photoBackground);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.photoBackground;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NewChallengeSportModel(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ")";
    }

    public NewChallengeSportModel(long j, String str, String str2, String str3, Object obj) {
        this.id = j;
        this.photoUrl = str;
        this.name = str2;
        this.period = str3;
        this.photoBackground = obj;
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

    public final String getPeriod() {
        return this.period;
    }

    public final Object getPhotoBackground() {
        return this.photoBackground;
    }
}
