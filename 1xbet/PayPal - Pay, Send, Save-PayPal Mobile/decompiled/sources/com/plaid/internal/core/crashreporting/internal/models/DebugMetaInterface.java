package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "", "<init>", "()V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lcom/plaid/internal/core/crashreporting/internal/models/DebugImage;", "debugImages", "Ljava/util/ArrayList;", "getDebugImages", "()Ljava/util/ArrayList;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DebugMetaInterface {

    @com.google.gson.annotations.SerializedName(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY)
    private final java.util.ArrayList<com.plaid.internal.core.crashreporting.internal.models.DebugImage> debugImages = new java.util.ArrayList<>();

    public final java.util.ArrayList<com.plaid.internal.core.crashreporting.internal.models.DebugImage> getDebugImages() {
        return this.debugImages;
    }

    public final int hashCode() {
        return this.debugImages.hashCode();
    }

    public final java.lang.String toString() {
        java.util.ArrayList<com.plaid.internal.core.crashreporting.internal.models.DebugImage> arrayList = this.debugImages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebugMetaInterface{debugImages=");
        sb.append(arrayList);
        sb.append("}");
        return sb.toString();
    }
}
