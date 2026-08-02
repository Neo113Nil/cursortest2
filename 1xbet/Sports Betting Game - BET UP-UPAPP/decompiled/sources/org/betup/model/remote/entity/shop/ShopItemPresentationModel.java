package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopItemPresentationModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopItemPresentationModel;", "", X3.a.t, "Lorg/betup/model/remote/entity/shop/ShopPresentationMode;", "htmlContent", "", "htmlTemplateUrl", "columnsInRow", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/shop/ShopPresentationMode;Ljava/lang/String;Ljava/lang/String;I)V", "getMode", "()Lorg/betup/model/remote/entity/shop/ShopPresentationMode;", "getHtmlContent", "()Ljava/lang/String;", "getHtmlTemplateUrl", "getColumnsInRow", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShopItemPresentationModel {
    public static final int $stable = 0;

    @SerializedName("columns_in_row")
    private final int columnsInRow;

    @SerializedName("html_content")
    private final String htmlContent;

    @SerializedName("html_template_url")
    private final String htmlTemplateUrl;

    @SerializedName(X3.a.t)
    private final ShopPresentationMode mode;

    public ShopItemPresentationModel() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ ShopItemPresentationModel copy$default(ShopItemPresentationModel shopItemPresentationModel, ShopPresentationMode shopPresentationMode, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shopPresentationMode = shopItemPresentationModel.mode;
        }
        if ((i2 & 2) != 0) {
            str = shopItemPresentationModel.htmlContent;
        }
        if ((i2 & 4) != 0) {
            str2 = shopItemPresentationModel.htmlTemplateUrl;
        }
        if ((i2 & 8) != 0) {
            i = shopItemPresentationModel.columnsInRow;
        }
        return shopItemPresentationModel.copy(shopPresentationMode, str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final ShopPresentationMode getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHtmlTemplateUrl() {
        return this.htmlTemplateUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getColumnsInRow() {
        return this.columnsInRow;
    }

    public final ShopItemPresentationModel copy(ShopPresentationMode mode, String htmlContent, String htmlTemplateUrl, int columnsInRow) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new ShopItemPresentationModel(mode, htmlContent, htmlTemplateUrl, columnsInRow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopItemPresentationModel)) {
            return false;
        }
        ShopItemPresentationModel shopItemPresentationModel = (ShopItemPresentationModel) other;
        return this.mode == shopItemPresentationModel.mode && Intrinsics.areEqual(this.htmlContent, shopItemPresentationModel.htmlContent) && Intrinsics.areEqual(this.htmlTemplateUrl, shopItemPresentationModel.htmlTemplateUrl) && this.columnsInRow == shopItemPresentationModel.columnsInRow;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.htmlContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.htmlTemplateUrl;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.columnsInRow);
    }

    public String toString() {
        return "ShopItemPresentationModel(mode=" + this.mode + ", htmlContent=" + this.htmlContent + ", htmlTemplateUrl=" + this.htmlTemplateUrl + ", columnsInRow=" + this.columnsInRow + ")";
    }

    public ShopItemPresentationModel(ShopPresentationMode mode, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.htmlContent = str;
        this.htmlTemplateUrl = str2;
        this.columnsInRow = i;
    }

    public final ShopPresentationMode getMode() {
        return this.mode;
    }

    public /* synthetic */ ShopItemPresentationModel(ShopPresentationMode shopPresentationMode, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ShopPresentationMode.NATIVE : shopPresentationMode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 1 : i);
    }

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final String getHtmlTemplateUrl() {
        return this.htmlTemplateUrl;
    }

    public final int getColumnsInRow() {
        return this.columnsInRow;
    }
}
