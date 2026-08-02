package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/Image;", "", "Lcoil3/Image;", "delegate", "<init>", "(Lcoil3/Image;)V", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/graphics/drawable/Drawable;", "asDrawable", "(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap;", "toBitmap", "()Landroid/graphics/Bitmap;", "Lcoil3/Image;", "getDelegate$common_ui_release", "()Lcoil3/Image;", "", "getWidth", "()I", "width", "getHeight", "height", "", "getSize", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "", "getShareable", "()Z", "shareable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Image {
    public static final int $stable = 8;
    private final coil3.Image delegate;

    public Image(coil3.Image image) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        this.delegate = image;
    }

    /* renamed from: getDelegate$common_ui_release, reason: from getter */
    public final coil3.Image getDelegate() {
        return this.delegate;
    }

    public final int getWidth() {
        return this.delegate.getWidth();
    }

    public final int getHeight() {
        return this.delegate.getHeight();
    }

    public final long getSize() {
        return this.delegate.getSize();
    }

    public final boolean getShareable() {
        return this.delegate.getShareable();
    }

    public final android.graphics.drawable.Drawable asDrawable(android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        return coil3.Image_androidKt.asDrawable(this.delegate, resources);
    }

    public final android.graphics.Bitmap toBitmap() {
        return coil3.Image_androidKt.toBitmap$default(this.delegate, 0, 0, 3, null);
    }
}
