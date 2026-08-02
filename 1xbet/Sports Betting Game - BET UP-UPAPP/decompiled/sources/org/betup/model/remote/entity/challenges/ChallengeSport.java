package org.betup.model.remote.entity.challenges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeDataModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeSport;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeSport {
    public static final int $stable = 0;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private final String period;

    @SerializedName("photo_background")
    private final String photoBackground;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ ChallengeSport copy$default(ChallengeSport challengeSport, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = challengeSport.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = challengeSport.photoUrl;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = challengeSport.name;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = challengeSport.period;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = challengeSport.photoBackground;
        }
        return challengeSport.copy(j2, str5, str6, str7, str4);
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
    public final String getPhotoBackground() {
        return this.photoBackground;
    }

    public final ChallengeSport copy(long id, String photoUrl, String name, String period, String photoBackground) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        return new ChallengeSport(id, photoUrl, name, period, photoBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeSport)) {
            return false;
        }
        ChallengeSport challengeSport = (ChallengeSport) other;
        return this.id == challengeSport.id && Intrinsics.areEqual(this.photoUrl, challengeSport.photoUrl) && Intrinsics.areEqual(this.name, challengeSport.name) && Intrinsics.areEqual(this.period, challengeSport.period) && Intrinsics.areEqual(this.photoBackground, challengeSport.photoBackground);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + this.photoUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.period.hashCode()) * 31;
        String str = this.photoBackground;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChallengeSport(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ")";
    }

    public ChallengeSport(long j, String photoUrl, String name, String period, String str) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        this.id = j;
        this.photoUrl = photoUrl;
        this.name = name;
        this.period = period;
        this.photoBackground = str;
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

    public final String getPhotoBackground() {
        return this.photoBackground;
    }
}
