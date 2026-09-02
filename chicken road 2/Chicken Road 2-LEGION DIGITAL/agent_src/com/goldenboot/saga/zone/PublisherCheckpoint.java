package com.goldenboot.saga.zone;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.goldenboot.saga.zone.ThemeCompiler;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u000b*\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/graphics/Bitmap;", "Lcom/goldenboot/saga/zone/ContextStage;", "injectMetric", "(Landroid/graphics/Bitmap;)Lcom/goldenboot/saga/zone/ContextStage;", "", "bytes", "detachStream", "([B)Lcom/goldenboot/saga/zone/ContextStage;", "", "width", "height", "Lcom/goldenboot/saga/zone/ThemeCompiler;", "config", "", "hasAlpha", "Lcom/goldenboot/saga/zone/InternalProvider;", "colorSpace", "evictLayout", "(IIIZLcom/goldenboot/saga/zone/InternalProvider;)Lcom/goldenboot/saga/zone/ContextStage;", "growPayload", "(Lcom/goldenboot/saga/zone/ContextStage;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "releaseHeader", "(I)Landroid/graphics/Bitmap$Config;", "clipOrigin", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublisherCheckpoint {
    public static final int clipOrigin(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ThemeCompiler.INSTANCE.evictLayout() : config == Bitmap.Config.RGB_565 ? ThemeCompiler.INSTANCE.releaseHeader() : config == Bitmap.Config.ARGB_4444 ? ThemeCompiler.INSTANCE.growPayload() : config == Bitmap.Config.RGBA_F16 ? ThemeCompiler.INSTANCE.injectMetric() : config == Bitmap.Config.HARDWARE ? ThemeCompiler.INSTANCE.detachStream() : ThemeCompiler.INSTANCE.growPayload();
    }

    public static final ContextStage detachStream(byte[] bArr) {
        return injectMetric(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static final ContextStage evictLayout(int i, int i2, int i3, boolean z, InternalProvider internalProvider) {
        releaseHeader(i3);
        return new LabelTrigger(ApplicationThread.growPayload(i, i2, i3, z, internalProvider));
    }

    public static final Bitmap growPayload(ContextStage contextStage) {
        if (contextStage instanceof LabelTrigger) {
            return ((LabelTrigger) contextStage).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ContextStage injectMetric(Bitmap bitmap) {
        return new LabelTrigger(bitmap);
    }

    public static final Bitmap.Config releaseHeader(int i) {
        ThemeCompiler.Companion companion = ThemeCompiler.INSTANCE;
        return ThemeCompiler.applyTask(i, companion.growPayload()) ? Bitmap.Config.ARGB_8888 : ThemeCompiler.applyTask(i, companion.evictLayout()) ? Bitmap.Config.ALPHA_8 : ThemeCompiler.applyTask(i, companion.releaseHeader()) ? Bitmap.Config.RGB_565 : ThemeCompiler.applyTask(i, companion.injectMetric()) ? Bitmap.Config.RGBA_F16 : ThemeCompiler.applyTask(i, companion.detachStream()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
