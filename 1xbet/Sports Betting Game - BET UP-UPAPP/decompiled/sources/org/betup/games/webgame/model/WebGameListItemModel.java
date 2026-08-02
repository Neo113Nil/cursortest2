package org.betup.games.webgame.model;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3664q2;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameApiModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lorg/betup/games/webgame/model/WebGameListItemModel;", "", TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "", "name", "description", "coverImageUrl", "gameUrl", C3664q2.u, "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCode", "()Ljava/lang/String;", "getName", "getDescription", "getCoverImageUrl", "getGameUrl", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WebGameListItemModel {
    public static final int $stable = 0;

    @SerializedName(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE)
    private final String code;

    @SerializedName("coverImageUrl")
    private final String coverImageUrl;

    @SerializedName("description")
    private final String description;

    @SerializedName("gameUrl")
    private final String gameUrl;

    @SerializedName("name")
    private final String name;

    @SerializedName(C3664q2.u)
    private final int order;

    public static /* synthetic */ WebGameListItemModel copy$default(WebGameListItemModel webGameListItemModel, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = webGameListItemModel.code;
        }
        if ((i2 & 2) != 0) {
            str2 = webGameListItemModel.name;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = webGameListItemModel.description;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = webGameListItemModel.coverImageUrl;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = webGameListItemModel.gameUrl;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = webGameListItemModel.order;
        }
        return webGameListItemModel.copy(str, str6, str7, str8, str9, i);
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
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverImageUrl() {
        return this.coverImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGameUrl() {
        return this.gameUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public final WebGameListItemModel copy(String code, String name, String description, String coverImageUrl, String gameUrl, int order) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gameUrl, "gameUrl");
        return new WebGameListItemModel(code, name, description, coverImageUrl, gameUrl, order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebGameListItemModel)) {
            return false;
        }
        WebGameListItemModel webGameListItemModel = (WebGameListItemModel) other;
        return Intrinsics.areEqual(this.code, webGameListItemModel.code) && Intrinsics.areEqual(this.name, webGameListItemModel.name) && Intrinsics.areEqual(this.description, webGameListItemModel.description) && Intrinsics.areEqual(this.coverImageUrl, webGameListItemModel.coverImageUrl) && Intrinsics.areEqual(this.gameUrl, webGameListItemModel.gameUrl) && this.order == webGameListItemModel.order;
    }

    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverImageUrl;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.gameUrl.hashCode()) * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        return "WebGameListItemModel(code=" + this.code + ", name=" + this.name + ", description=" + this.description + ", coverImageUrl=" + this.coverImageUrl + ", gameUrl=" + this.gameUrl + ", order=" + this.order + ")";
    }

    public WebGameListItemModel(String code, String name, String str, String str2, String gameUrl, int i) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gameUrl, "gameUrl");
        this.code = code;
        this.name = name;
        this.description = str;
        this.coverImageUrl = str2;
        this.gameUrl = gameUrl;
        this.order = i;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
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
}
