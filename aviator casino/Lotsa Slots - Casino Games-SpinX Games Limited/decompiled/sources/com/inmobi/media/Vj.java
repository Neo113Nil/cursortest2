package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vj implements com.inmobi.media.M0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5018a;
    public final java.lang.String b;

    public Vj(java.lang.String location, byte[] imageBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        this.f5018a = imageBytes;
        this.b = location;
    }

    @Override // com.inmobi.media.M0
    public final java.lang.Object a() {
        byte[] bArr = this.f5018a;
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeByteArray);
        return a(decodeByteArray);
    }

    public final java.lang.String a(android.graphics.Bitmap bitmap) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        java.lang.String str = uuid + ".jpg";
        java.io.File file = new java.io.File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, new java.io.FileOutputStream(new java.io.File(this.b + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str)));
        return this.b + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str;
    }
}
