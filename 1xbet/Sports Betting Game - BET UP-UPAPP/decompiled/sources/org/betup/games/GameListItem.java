package org.betup.games;

import android.graphics.drawable.Drawable;
import com.ironsource.C3664q2;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GameListItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/games/GameListItem;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Native", "Web", "Lorg/betup/games/GameListItem$Native;", "Lorg/betup/games/GameListItem$Web;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GameListItem {
    public static final int $stable = 0;

    public /* synthetic */ GameListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GameListItem() {
    }

    /* compiled from: GameListItem.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/games/GameListItem$Native;", "Lorg/betup/games/GameListItem;", "targetGame", "Lorg/betup/bus/NavigateMessage$TargetGame;", "drawable", "Landroid/graphics/drawable/Drawable;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/bus/NavigateMessage$TargetGame;Landroid/graphics/drawable/Drawable;)V", "getTargetGame", "()Lorg/betup/bus/NavigateMessage$TargetGame;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Native extends GameListItem {
        public static final int $stable = 8;
        private final Drawable drawable;
        private final NavigateMessage.TargetGame targetGame;

        public static /* synthetic */ Native copy$default(Native r0, NavigateMessage.TargetGame targetGame, Drawable drawable, int i, Object obj) {
            if ((i & 1) != 0) {
                targetGame = r0.targetGame;
            }
            if ((i & 2) != 0) {
                drawable = r0.drawable;
            }
            return r0.copy(targetGame, drawable);
        }

        /* renamed from: component1, reason: from getter */
        public final NavigateMessage.TargetGame getTargetGame() {
            return this.targetGame;
        }

        /* renamed from: component2, reason: from getter */
        public final Drawable getDrawable() {
            return this.drawable;
        }

        public final Native copy(NavigateMessage.TargetGame targetGame, Drawable drawable) {
            Intrinsics.checkNotNullParameter(targetGame, "targetGame");
            return new Native(targetGame, drawable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Native)) {
                return false;
            }
            Native r5 = (Native) other;
            return this.targetGame == r5.targetGame && Intrinsics.areEqual(this.drawable, r5.drawable);
        }

        public int hashCode() {
            int hashCode = this.targetGame.hashCode() * 31;
            Drawable drawable = this.drawable;
            return hashCode + (drawable == null ? 0 : drawable.hashCode());
        }

        public String toString() {
            return "Native(targetGame=" + this.targetGame + ", drawable=" + this.drawable + ")";
        }

        public final NavigateMessage.TargetGame getTargetGame() {
            return this.targetGame;
        }

        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Native(NavigateMessage.TargetGame targetGame, Drawable drawable) {
            super(null);
            Intrinsics.checkNotNullParameter(targetGame, "targetGame");
            this.targetGame = targetGame;
            this.drawable = drawable;
        }
    }

    /* compiled from: GameListItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lorg/betup/games/GameListItem$Web;", "Lorg/betup/games/GameListItem;", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "", "name", "coverImageUrl", "gameUrl", C3664q2.u, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getName", "getCoverImageUrl", "getGameUrl", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Web extends GameListItem {
        public static final int $stable = 0;
        private final String code;
        private final String coverImageUrl;
        private final String gameUrl;
        private final String name;
        private final int order;

        public static /* synthetic */ Web copy$default(Web web, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = web.code;
            }
            if ((i2 & 2) != 0) {
                str2 = web.name;
            }
            String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = web.coverImageUrl;
            }
            String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = web.gameUrl;
            }
            String str7 = str4;
            if ((i2 & 16) != 0) {
                i = web.order;
            }
            return web.copy(str, str5, str6, str7, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGameUrl() {
            return this.gameUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final int getOrder() {
            return this.order;
        }

        public final Web copy(String code, String name, String coverImageUrl, String gameUrl, int order) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(gameUrl, "gameUrl");
            return new Web(code, name, coverImageUrl, gameUrl, order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Web)) {
                return false;
            }
            Web web = (Web) other;
            return Intrinsics.areEqual(this.code, web.code) && Intrinsics.areEqual(this.name, web.name) && Intrinsics.areEqual(this.coverImageUrl, web.coverImageUrl) && Intrinsics.areEqual(this.gameUrl, web.gameUrl) && this.order == web.order;
        }

        public int hashCode() {
            int hashCode = ((this.code.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.coverImageUrl;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.gameUrl.hashCode()) * 31) + Integer.hashCode(this.order);
        }

        public String toString() {
            return "Web(code=" + this.code + ", name=" + this.name + ", coverImageUrl=" + this.coverImageUrl + ", gameUrl=" + this.gameUrl + ", order=" + this.order + ")";
        }

        public final String getCode() {
            return this.code;
        }

        public final String getName() {
            return this.name;
        }

        public final String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        public final String getGameUrl() {
            return this.gameUrl;
        }

        public final int getOrder() {
            return this.order;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Web(String code, String name, String str, String gameUrl, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(gameUrl, "gameUrl");
            this.code = code;
            this.name = name;
            this.coverImageUrl = str;
            this.gameUrl = gameUrl;
            this.order = i;
        }
    }
}
