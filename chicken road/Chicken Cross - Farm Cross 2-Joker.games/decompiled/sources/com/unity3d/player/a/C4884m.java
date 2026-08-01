package com.unity3d.player.a;

import android.media.Image;
import android.media.ImageReader;
import com.unity3d.player.Camera2Wrapper;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.a.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4884m implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4887p f11769a;

    public C4884m(C4887p c4887p) {
        this.f11769a = c4887p;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore = C4887p.D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.f11769a.f11772a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC4890t.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.f11769a.p;
                if (image != null) {
                    image.close();
                }
                this.f11769a.p = acquireNextImage;
            }
            semaphore.release();
        }
    }
}
