package com.door.brass.knob.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.OcGJUxcOVecQiKb;
import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u001a\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lcom/door/brass/knob/data/remote/dto/DessertMenuResponse;", "", "", "dessertName", "Ljava/lang/String;", "getDessertName", "()Ljava/lang/String;", "", "sweetnessLevel", "I", "getSweetnessLevel", "()I", "", "isZesty", "Z", "oyjLVtGms9eZwJ0", "()Z", "pastryTexture", "getPastryTexture", "", "servingTemperature", "D", "getServingTemperature", "()D", "hasMeringue", "yzPsTade5rL7D3", "categoryType", "getCategoryType", "tasteMark", "getTasteMark", "bakingTimeMinutes", "getBakingTimeMinutes", "isSeasonal", "ra306ClFT3HT", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DessertMenuResponse {

    @SerializedName("dessertName")
    private final String dessertName = null;

    @SerializedName("sweetnessLevel")
    private final int sweetnessLevel = 0;

    @SerializedName("isZesty")
    private final boolean isZesty = false;

    @SerializedName("pastryTexture")
    private final String pastryTexture = null;

    @SerializedName("servingTemperature")
    private final double servingTemperature = 0.0d;

    @SerializedName("hasMeringue")
    private final boolean hasMeringue = false;

    @SerializedName("categoryType")
    private final String categoryType = null;

    @SerializedName("tasteMark")
    private final String tasteMark = null;

    @SerializedName("bakingTimeMinutes")
    private final int bakingTimeMinutes = 0;

    @SerializedName("isSeasonal")
    private final boolean isSeasonal = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DessertMenuResponse)) {
            return false;
        }
        DessertMenuResponse dessertMenuResponse = (DessertMenuResponse) obj;
        return Intrinsics.yzPsTade5rL7D3(this.dessertName, dessertMenuResponse.dessertName) && this.sweetnessLevel == dessertMenuResponse.sweetnessLevel && this.isZesty == dessertMenuResponse.isZesty && Intrinsics.yzPsTade5rL7D3(this.pastryTexture, dessertMenuResponse.pastryTexture) && Double.compare(this.servingTemperature, dessertMenuResponse.servingTemperature) == 0 && this.hasMeringue == dessertMenuResponse.hasMeringue && Intrinsics.yzPsTade5rL7D3(this.categoryType, dessertMenuResponse.categoryType) && Intrinsics.yzPsTade5rL7D3(this.tasteMark, dessertMenuResponse.tasteMark) && this.bakingTimeMinutes == dessertMenuResponse.bakingTimeMinutes && this.isSeasonal == dessertMenuResponse.isSeasonal;
    }

    public final String hRNgd2zGCE5kj() {
        String str = this.dessertName;
        String obj = str != null ? StringsKt.vAthhQhzH5WQr3(str).toString() : null;
        if (obj == null) {
            obj = "";
        }
        boolean z = true;
        if (!StringsKt.o4ticBN7g1K8jE(obj, "http://", true) && !StringsKt.o4ticBN7g1K8jE(obj, "https://", true)) {
            z = false;
        }
        if (!this.isSeasonal || this.isZesty || this.hasMeringue || !z) {
            return null;
        }
        return obj;
    }

    public final int hashCode() {
        String str = this.dessertName;
        int yzPsTade5rL7D3 = j8.yzPsTade5rL7D3(OcGJUxcOVecQiKb.hRNgd2zGCE5kj(this.sweetnessLevel, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.isZesty);
        String str2 = this.pastryTexture;
        int yzPsTade5rL7D32 = j8.yzPsTade5rL7D3((Double.hashCode(this.servingTemperature) + ((yzPsTade5rL7D3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.hasMeringue);
        String str3 = this.categoryType;
        int hashCode = (yzPsTade5rL7D32 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tasteMark;
        return Boolean.hashCode(this.isSeasonal) + OcGJUxcOVecQiKb.hRNgd2zGCE5kj(this.bakingTimeMinutes, (hashCode + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    /* renamed from: oyjLVtGms9eZwJ0, reason: from getter */
    public final boolean getIsZesty() {
        return this.isZesty;
    }

    /* renamed from: ra306ClFT3HT, reason: from getter */
    public final boolean getIsSeasonal() {
        return this.isSeasonal;
    }

    public final String toString() {
        return "DessertMenuResponse(dessertName=" + this.dessertName + ", sweetnessLevel=" + this.sweetnessLevel + ", isZesty=" + this.isZesty + ", pastryTexture=" + this.pastryTexture + ", servingTemperature=" + this.servingTemperature + ", hasMeringue=" + this.hasMeringue + ", categoryType=" + this.categoryType + ", tasteMark=" + this.tasteMark + ", bakingTimeMinutes=" + this.bakingTimeMinutes + ", isSeasonal=" + this.isSeasonal + ")";
    }

    /* renamed from: yzPsTade5rL7D3, reason: from getter */
    public final boolean getHasMeringue() {
        return this.hasMeringue;
    }
}
