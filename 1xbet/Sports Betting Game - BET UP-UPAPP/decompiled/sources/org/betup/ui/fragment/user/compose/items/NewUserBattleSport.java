package org.betup.ui.fragment.user.compose.items;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewUserBattleUiItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/NewUserBattleSport;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NewUserBattleSport {
    public static final int $stable = 0;
    private final int id;
    private final String name;
    private final String period;
    private final String photoBackground;
    private final String photoUrl;

    public static /* synthetic */ NewUserBattleSport copy$default(NewUserBattleSport newUserBattleSport, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newUserBattleSport.id;
        }
        if ((i2 & 2) != 0) {
            str = newUserBattleSport.photoUrl;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = newUserBattleSport.name;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = newUserBattleSport.period;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = newUserBattleSport.photoBackground;
        }
        return newUserBattleSport.copy(i, str5, str6, str7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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

    public final NewUserBattleSport copy(int id, String photoUrl, String name, String period, String photoBackground) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        return new NewUserBattleSport(id, photoUrl, name, period, photoBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUserBattleSport)) {
            return false;
        }
        NewUserBattleSport newUserBattleSport = (NewUserBattleSport) other;
        return this.id == newUserBattleSport.id && Intrinsics.areEqual(this.photoUrl, newUserBattleSport.photoUrl) && Intrinsics.areEqual(this.name, newUserBattleSport.name) && Intrinsics.areEqual(this.period, newUserBattleSport.period) && Intrinsics.areEqual(this.photoBackground, newUserBattleSport.photoBackground);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.id) * 31) + this.photoUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.period.hashCode()) * 31;
        String str = this.photoBackground;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NewUserBattleSport(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ")";
    }

    public NewUserBattleSport(int i, String photoUrl, String name, String period, String str) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        this.id = i;
        this.photoUrl = photoUrl;
        this.name = name;
        this.period = period;
        this.photoBackground = str;
    }

    public final int getId() {
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
