package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewShopEffectModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/shop/NewShopEffectModel;", "", "name", "", "desc", "photoUrl", "effectGroup", "", "coef", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ID)V", "getName", "()Ljava/lang/String;", "getDesc", "getPhotoUrl", "getEffectGroup", "()I", "getCoef", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewShopEffectModel {
    public static final int $stable = 0;

    @SerializedName("coef")
    private final double coef;

    @SerializedName("descr")
    private final String desc;

    @SerializedName("effect_group")
    private final int effectGroup;

    @SerializedName("name")
    private final String name;

    @SerializedName("photo_url")
    private final String photoUrl;

    public NewShopEffectModel() {
        this(null, null, null, 0, 0.0d, 31, null);
    }

    public static /* synthetic */ NewShopEffectModel copy$default(NewShopEffectModel newShopEffectModel, String str, String str2, String str3, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newShopEffectModel.name;
        }
        if ((i2 & 2) != 0) {
            str2 = newShopEffectModel.desc;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = newShopEffectModel.photoUrl;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = newShopEffectModel.effectGroup;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            d = newShopEffectModel.coef;
        }
        return newShopEffectModel.copy(str, str4, str5, i3, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEffectGroup() {
        return this.effectGroup;
    }

    /* renamed from: component5, reason: from getter */
    public final double getCoef() {
        return this.coef;
    }

    public final NewShopEffectModel copy(String name, String desc, String photoUrl, int effectGroup, double coef) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        return new NewShopEffectModel(name, desc, photoUrl, effectGroup, coef);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewShopEffectModel)) {
            return false;
        }
        NewShopEffectModel newShopEffectModel = (NewShopEffectModel) other;
        return Intrinsics.areEqual(this.name, newShopEffectModel.name) && Intrinsics.areEqual(this.desc, newShopEffectModel.desc) && Intrinsics.areEqual(this.photoUrl, newShopEffectModel.photoUrl) && this.effectGroup == newShopEffectModel.effectGroup && Double.compare(this.coef, newShopEffectModel.coef) == 0;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.desc.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + Integer.hashCode(this.effectGroup)) * 31) + Double.hashCode(this.coef);
    }

    public String toString() {
        return "NewShopEffectModel(name=" + this.name + ", desc=" + this.desc + ", photoUrl=" + this.photoUrl + ", effectGroup=" + this.effectGroup + ", coef=" + this.coef + ")";
    }

    public NewShopEffectModel(String name, String desc, String photoUrl, int i, double d) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        this.name = name;
        this.desc = desc;
        this.photoUrl = photoUrl;
        this.effectGroup = i;
        this.coef = d;
    }

    public /* synthetic */ NewShopEffectModel(String str, String str2, String str3, int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0.0d : d);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getEffectGroup() {
        return this.effectGroup;
    }

    public final double getCoef() {
        return this.coef;
    }
}
