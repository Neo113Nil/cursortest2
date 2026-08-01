package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class Ih extends Q2 {
    public final Window b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ih(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.O0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        long currentTimeMillis = System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.inmobi.media.Ih$$ExternalSyntheticLambda0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Ih.a(Ref.BooleanRef.this, this, i);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        String str = "success - " + booleanRef.element + " - time - " + (System.currentTimeMillis() - currentTimeMillis);
        this.b.getDecorView().setLayerType(layerType, null);
        if (booleanRef.element) {
            return a(createBitmap);
        }
        return null;
    }

    public static final void a(Ref.BooleanRef booleanRef, Ih ih, int i) {
        if (i == 0) {
            booleanRef.element = true;
        }
        String str = "capture result - success - " + booleanRef.element;
        ih.c.set(true);
    }
}
