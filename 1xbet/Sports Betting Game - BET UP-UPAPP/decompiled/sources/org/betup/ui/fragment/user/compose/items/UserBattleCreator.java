package org.betup.ui.fragment.user.compose.items;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserBattleUiItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/UserBattleCreator;", "", "id", "", "name", "", "email", "photoUrl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getEmail", "getPhotoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserBattleCreator {
    public static final int $stable = 0;
    private final String email;
    private final long id;
    private final String name;
    private final String photoUrl;

    public static /* synthetic */ UserBattleCreator copy$default(UserBattleCreator userBattleCreator, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = userBattleCreator.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = userBattleCreator.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = userBattleCreator.email;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = userBattleCreator.photoUrl;
        }
        return userBattleCreator.copy(j2, str4, str5, str3);
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

    public final UserBattleCreator copy(long id, String name, String email, String photoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new UserBattleCreator(id, name, email, photoUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBattleCreator)) {
            return false;
        }
        UserBattleCreator userBattleCreator = (UserBattleCreator) other;
        return this.id == userBattleCreator.id && Intrinsics.areEqual(this.name, userBattleCreator.name) && Intrinsics.areEqual(this.email, userBattleCreator.email) && Intrinsics.areEqual(this.photoUrl, userBattleCreator.photoUrl);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31) + this.photoUrl.hashCode();
    }

    public String toString() {
        return "UserBattleCreator(id=" + this.id + ", name=" + this.name + ", email=" + this.email + ", photoUrl=" + this.photoUrl + ")";
    }

    public UserBattleCreator(long j, String name, String email, String photoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.id = j;
        this.name = name;
        this.email = email;
        this.photoUrl = photoUrl;
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
