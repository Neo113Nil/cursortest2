package com.goldenboot.saga.zone;

import android.graphics.Bitmap;
import android.media.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/media/Image;", "Landroid/graphics/Bitmap;", "growPayload", "(Landroid/media/Image;)Landroid/graphics/Bitmap;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ItemUseCase {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap growPayload(Image image) {
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNull(planes);
        Image.Plane plane = planes[0];
        int width = image.getWidth() * image.getHeight();
        int[] iArr = new int[width];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < width; i++) {
            int i2 = iArr[i];
            iArr[i] = BoxSaver.inflateAdapter(BoxSaver.injectMetric(i2 & LayoutMap.flushSample, (i2 >> 8) & LayoutMap.flushSample, (i2 >> 16) & LayoutMap.flushSample, (i2 >> 24) & LayoutMap.flushSample));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
