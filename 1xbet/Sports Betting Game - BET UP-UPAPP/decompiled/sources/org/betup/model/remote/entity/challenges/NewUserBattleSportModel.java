package org.betup.model.remote.entity.challenges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleMatchModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/betup/model/remote/entity/challenges/NewUserBattleSportModel;", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewUserBattleSportModel {
    public static final int $stable = 0;

    @SerializedName("id")
    private final Integer id;

    @SerializedName("name")
    private final String name;

    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    private final String period;

    @SerializedName("photo_background")
    private final String photoBackground;

    @SerializedName("photo_url")
    private final String photoUrl;

    public static /* synthetic */ NewUserBattleSportModel copy$default(NewUserBattleSportModel newUserBattleSportModel, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newUserBattleSportModel.id;
        }
        if ((i & 2) != 0) {
            str = newUserBattleSportModel.photoUrl;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = newUserBattleSportModel.name;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = newUserBattleSportModel.period;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = newUserBattleSportModel.photoBackground;
        }
        return newUserBattleSportModel.copy(num, str5, str6, str7, str4);
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

    /* renamed from: component4, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhotoBackground() {
        return this.photoBackground;
    }

    public final NewUserBattleSportModel copy(Integer id, String photoUrl, String name, String period, String photoBackground) {
        return new NewUserBattleSportModel(id, photoUrl, name, period, photoBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleSportModel)) {
            return false;
        }
        NewUserBattleSportModel newUserBattleSportModel = (NewUserBattleSportModel) other;
        return Intrinsics.areEqual(this.id, newUserBattleSportModel.id) && Intrinsics.areEqual(this.photoUrl, newUserBattleSportModel.photoUrl) && Intrinsics.areEqual(this.name, newUserBattleSportModel.name) && Intrinsics.areEqual(this.period, newUserBattleSportModel.period) && Intrinsics.areEqual(this.photoBackground, newUserBattleSportModel.photoBackground);
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBackground;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "NewUserBattleSportModel(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ")";
    }

    public NewUserBattleSportModel(Integer num, String str, String str2, String str3, String str4) {
        this.id = num;
        this.photoUrl = str;
        this.name = str2;
        this.period = str3;
        this.photoBackground = str4;
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

    public final String getPeriod() {
        return this.period;
    }

    public final String getPhotoBackground() {
        return this.photoBackground;
    }
}
