package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Q2 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f6793a;

    public Q2(AdConfig.AdQualityConfig adQualityConfig) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f6793a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        double resizedPercentage = (this.f6793a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.f6793a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f6793a.getMaxImageSize()) {
            return createScaledBitmap;
        }
        String str = "  - ";
        String str2 = "resize - original - " + resizedPercentage + "  - " + resizedPercentage2 + " - size - " + length;
        while (length > this.f6793a.getMaxImageSize()) {
            String str3 = str;
            double sqrt = Math.sqrt(this.f6793a.getMaxImageSize() / length);
            resizedPercentage *= sqrt;
            resizedPercentage2 *= sqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return createScaledBitmap;
            }
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream.reset();
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
            str = str3;
        }
        String str4 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        return createScaledBitmap;
    }
}
