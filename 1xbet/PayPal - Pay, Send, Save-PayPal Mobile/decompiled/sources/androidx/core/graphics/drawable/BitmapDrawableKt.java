package androidx.core.graphics.drawable;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/graphics/drawable/BitmapDrawable;", "toDrawable", "(Landroid/graphics/Bitmap;Landroid/content/res/Resources;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BitmapDrawableKt {
    public static final android.graphics.drawable.BitmapDrawable toDrawable(android.graphics.Bitmap bitmap, android.content.res.Resources resources) {
        return new android.graphics.drawable.BitmapDrawable(resources, bitmap);
    }
}
