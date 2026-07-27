package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ql, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4028ql implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7333a;
    public final String b;

    public C4028ql(String location, byte[] imageBytes) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f7333a = imageBytes;
        this.b = location;
    }

    @Override // com.inmobi.media.O0
    public final Object a() {
        byte[] bArr = this.f7333a;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.checkNotNull(decodeByteArray);
        return a(decodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String str = uuid + ".jpg";
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.b + "/" + str)));
        return this.b + "/" + str;
    }
}
