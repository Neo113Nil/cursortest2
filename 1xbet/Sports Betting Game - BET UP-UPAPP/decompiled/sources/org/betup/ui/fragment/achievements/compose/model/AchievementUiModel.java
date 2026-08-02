package org.betup.ui.fragment.achievements.compose.model;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AchievementUiModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006("}, d2 = {"Lorg/betup/ui/fragment/achievements/compose/model/AchievementUiModel;", "", "id", "", "name", "", "description", "photoUrl", "price", "progress", "isOpened", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getDescription", "getPhotoUrl", "getPrice", "getProgress", "()Z", "isCompleted", "getProgressPercentage", "", "getMaxProgress", "getDisplayProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AchievementUiModel {
    public static final int $stable = 0;
    private final String description;
    private final int id;
    private final boolean isOpened;
    private final String name;
    private final String photoUrl;
    private final int price;
    private final int progress;

    public static /* synthetic */ AchievementUiModel copy$default(AchievementUiModel achievementUiModel, int i, String str, String str2, String str3, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = achievementUiModel.id;
        }
        if ((i4 & 2) != 0) {
            str = achievementUiModel.name;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = achievementUiModel.description;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            str3 = achievementUiModel.photoUrl;
        }
        String str6 = str3;
        if ((i4 & 16) != 0) {
            i2 = achievementUiModel.price;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            i3 = achievementUiModel.progress;
        }
        int i6 = i3;
        if ((i4 & 64) != 0) {
            z = achievementUiModel.isOpened;
        }
        return achievementUiModel.copy(i, str4, str5, str6, i5, i6, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsOpened() {
        return this.isOpened;
    }

    public final AchievementUiModel copy(int id, String name, String description, String photoUrl, int price, int progress, boolean isOpened) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new AchievementUiModel(id, name, description, photoUrl, price, progress, isOpened);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchievementUiModel)) {
            return false;
        }
        AchievementUiModel achievementUiModel = (AchievementUiModel) other;
        return this.id == achievementUiModel.id && Intrinsics.areEqual(this.name, achievementUiModel.name) && Intrinsics.areEqual(this.description, achievementUiModel.description) && Intrinsics.areEqual(this.photoUrl, achievementUiModel.photoUrl) && this.price == achievementUiModel.price && this.progress == achievementUiModel.progress && this.isOpened == achievementUiModel.isOpened;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.progress)) * 31) + Boolean.hashCode(this.isOpened);
    }

    public String toString() {
        return "AchievementUiModel(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", photoUrl=" + this.photoUrl + ", price=" + this.price + ", progress=" + this.progress + ", isOpened=" + this.isOpened + ")";
    }

    public AchievementUiModel(int i, String name, String description, String photoUrl, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.id = i;
        this.name = name;
        this.description = description;
        this.photoUrl = photoUrl;
        this.price = i2;
        this.progress = i3;
        this.isOpened = z;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean isOpened() {
        return this.isOpened;
    }

    public final boolean isCompleted() {
        return this.isOpened;
    }

    public final float getProgressPercentage() {
        if (isCompleted()) {
            return 1.0f;
        }
        int i = this.progress;
        if (i > 0) {
            return RangesKt.coerceAtMost(i / getMaxProgress(), 1.0f);
        }
        return 0.0f;
    }

    public final int getMaxProgress() {
        int i = this.id;
        if (i == 10) {
            return 7;
        }
        if (i == 11) {
            return AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
        }
        if (i == 14) {
            return 3;
        }
        switch (i) {
        }
        return 3;
    }

    public final int getDisplayProgress() {
        if (isCompleted()) {
            return getMaxProgress();
        }
        int i = this.progress;
        if (i > 0) {
            return i;
        }
        return 0;
    }
}
