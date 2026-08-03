package com.facebook.share.model;

/* compiled from: CameraEffectTextures.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0015\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/share/model/CameraEffectTextures;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/share/model/CameraEffectTextures$Builder;", "(Lcom/facebook/share/model/CameraEffectTextures$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "textures", "Landroid/os/Bundle;", "describeContents", "", "get", "", com.ironsource.X3.i.W, "", "getTextureBitmap", "Landroid/graphics/Bitmap;", "getTextureUri", "Landroid/net/Uri;", "keySet", "", "writeToParcel", "", "out", "flags", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraEffectTextures implements com.facebook.share.model.ShareModel {
    private final android.os.Bundle textures;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.CameraEffectTextures> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.CameraEffectTextures>() { // from class: com.facebook.share.model.CameraEffectTextures$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.CameraEffectTextures createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.model.CameraEffectTextures(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.CameraEffectTextures[] newArray(int size) {
            return new com.facebook.share.model.CameraEffectTextures[size];
        }
    };

    public /* synthetic */ CameraEffectTextures(com.facebook.share.model.CameraEffectTextures.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CameraEffectTextures(com.facebook.share.model.CameraEffectTextures.Builder builder) {
        this.textures = builder.getTextures();
    }

    public CameraEffectTextures(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.textures = parcel.readBundle(getClass().getClassLoader());
    }

    public final android.graphics.Bitmap getTextureBitmap(java.lang.String key) {
        android.os.Bundle bundle = this.textures;
        java.lang.Object obj = bundle == null ? null : bundle.get(key);
        if (obj instanceof android.graphics.Bitmap) {
            return (android.graphics.Bitmap) obj;
        }
        return null;
    }

    public final android.net.Uri getTextureUri(java.lang.String key) {
        android.os.Bundle bundle = this.textures;
        java.lang.Object obj = bundle == null ? null : bundle.get(key);
        if (obj instanceof android.net.Uri) {
            return (android.net.Uri) obj;
        }
        return null;
    }

    public final java.lang.Object get(java.lang.String key) {
        android.os.Bundle bundle = this.textures;
        if (bundle == null) {
            return null;
        }
        return bundle.get(key);
    }

    public final java.util.Set<java.lang.String> keySet() {
        android.os.Bundle bundle = this.textures;
        java.util.Set<java.lang.String> keySet = bundle == null ? null : bundle.keySet();
        return keySet == null ? kotlin.collections.SetsKt.emptySet() : keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        out.writeBundle(this.textures);
    }

    /* compiled from: CameraEffectTextures.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0013\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/facebook/share/model/CameraEffectTextures$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/share/model/CameraEffectTextures;", "()V", "textures", "Landroid/os/Bundle;", "getTextures$facebook_common_release", "()Landroid/os/Bundle;", "build", "putParcelableTexture", com.ironsource.X3.i.W, "", "parcelableTexture", "Landroid/os/Parcelable;", "putTexture", "texture", "Landroid/graphics/Bitmap;", "textureUrl", "Landroid/net/Uri;", "readFrom", "parcel", "Landroid/os/Parcel;", "model", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder implements com.facebook.share.model.ShareModelBuilder<com.facebook.share.model.CameraEffectTextures, com.facebook.share.model.CameraEffectTextures.Builder> {
        private final android.os.Bundle textures = new android.os.Bundle();

        /* renamed from: getTextures$facebook_common_release, reason: from getter */
        public final android.os.Bundle getTextures() {
            return this.textures;
        }

        public final com.facebook.share.model.CameraEffectTextures.Builder putTexture(java.lang.String key, android.graphics.Bitmap texture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return putParcelableTexture(key, texture);
        }

        public final com.facebook.share.model.CameraEffectTextures.Builder putTexture(java.lang.String key, android.net.Uri textureUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            return putParcelableTexture(key, textureUrl);
        }

        private final com.facebook.share.model.CameraEffectTextures.Builder putParcelableTexture(java.lang.String key, android.os.Parcelable parcelableTexture) {
            if (key.length() > 0 && parcelableTexture != null) {
                this.textures.putParcelable(key, parcelableTexture);
            }
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.CameraEffectTextures.Builder readFrom(com.facebook.share.model.CameraEffectTextures model) {
            if (model != null) {
                this.textures.putAll(model.textures);
            }
            return this;
        }

        public final com.facebook.share.model.CameraEffectTextures.Builder readFrom(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((com.facebook.share.model.CameraEffectTextures) parcel.readParcelable(com.facebook.share.model.CameraEffectTextures.class.getClassLoader()));
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.CameraEffectTextures build() {
            return new com.facebook.share.model.CameraEffectTextures(this, null);
        }
    }
}
