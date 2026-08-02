package org.betup.ui.fragment.competitions.compose.items;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewCompetitionUiItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/items/NewCompetitionSportUiItem;", "", "id", "", "photoUrl", "", "name", TypedValues.CycleType.S_WAVE_PERIOD, "photoBackground", "backgroundUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getPhotoUrl", "()Ljava/lang/String;", "getName", "getPeriod", "getPhotoBackground", "getBackgroundUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NewCompetitionSportUiItem {
    public static final int $stable = 0;
    private final String backgroundUrl;
    private final long id;
    private final String name;
    private final String period;
    private final String photoBackground;
    private final String photoUrl;

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

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final NewCompetitionSportUiItem copy(long id, String photoUrl, String name, String period, String photoBackground, String backgroundUrl) {
        return new NewCompetitionSportUiItem(id, photoUrl, name, period, photoBackground, backgroundUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCompetitionSportUiItem)) {
            return false;
        }
        NewCompetitionSportUiItem newCompetitionSportUiItem = (NewCompetitionSportUiItem) other;
        return this.id == newCompetitionSportUiItem.id && Intrinsics.areEqual(this.photoUrl, newCompetitionSportUiItem.photoUrl) && Intrinsics.areEqual(this.name, newCompetitionSportUiItem.name) && Intrinsics.areEqual(this.period, newCompetitionSportUiItem.period) && Intrinsics.areEqual(this.photoBackground, newCompetitionSportUiItem.photoBackground) && Intrinsics.areEqual(this.backgroundUrl, newCompetitionSportUiItem.backgroundUrl);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBackground;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundUrl;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "NewCompetitionSportUiItem(id=" + this.id + ", photoUrl=" + this.photoUrl + ", name=" + this.name + ", period=" + this.period + ", photoBackground=" + this.photoBackground + ", backgroundUrl=" + this.backgroundUrl + ")";
    }

    public NewCompetitionSportUiItem(long j, String str, String str2, String str3, String str4, String str5) {
        this.id = j;
        this.photoUrl = str;
        this.name = str2;
        this.period = str3;
        this.photoBackground = str4;
        this.backgroundUrl = str5;
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

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }
}
