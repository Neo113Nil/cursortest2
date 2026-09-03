package com.door.brass.knob.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.OcGJUxcOVecQiKb;
import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/door/brass/knob/data/remote/dto/DessertProbeRequest;", "", "", "advertisingId", "Ljava/lang/String;", "getAdvertisingId", "()Ljava/lang/String;", "installReferrer", "getInstallReferrer", "androidId", "getAndroidId", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DessertProbeRequest {

    @SerializedName("citrusDessert")
    private final String advertisingId;

    @SerializedName("lemonFilling")
    private final String androidId;

    @SerializedName("meringueTopping")
    private final String installReferrer;

    public DessertProbeRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.advertisingId = str;
        this.installReferrer = str2;
        this.androidId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DessertProbeRequest)) {
            return false;
        }
        DessertProbeRequest dessertProbeRequest = (DessertProbeRequest) obj;
        return Intrinsics.yzPsTade5rL7D3(this.advertisingId, dessertProbeRequest.advertisingId) && Intrinsics.yzPsTade5rL7D3(this.installReferrer, dessertProbeRequest.installReferrer) && Intrinsics.yzPsTade5rL7D3(this.androidId, dessertProbeRequest.androidId);
    }

    public final int hashCode() {
        return this.androidId.hashCode() + j8.hRNgd2zGCE5kj(this.installReferrer, this.advertisingId.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.advertisingId;
        String str2 = this.installReferrer;
        String str3 = this.androidId;
        StringBuilder sb = new StringBuilder("DessertProbeRequest(advertisingId=");
        sb.append(str);
        sb.append(", installReferrer=");
        sb.append(str2);
        sb.append(", androidId=");
        return OcGJUxcOVecQiKb.yRx9jbDCTnXb3(sb, str3, ")");
    }
}
