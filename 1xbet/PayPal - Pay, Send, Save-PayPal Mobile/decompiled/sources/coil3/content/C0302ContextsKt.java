package coil3.content;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\n\u001a\u00020\t*\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\fH\u0000¢\u0006\u0004\b\n\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0018\u001a\u00020\u0000*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroid/content/Context;", "", "defaultMemoryCacheSizePercent", "(Landroid/content/Context;)D", "", "totalAvailableMemoryBytes", "(Landroid/content/Context;)J", "", "resId", "Landroid/graphics/drawable/Drawable;", "getDrawableCompat", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "getXmlDrawableCompat", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "(Landroid/content/Context;)Landroidx/lifecycle/Lifecycle;", "getApplication", "(Landroid/content/Context;)Landroid/content/Context;", "application"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.util.ContextsKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302ContextsKt {
    public static final android.content.Context getApplication(android.content.Context context) {
        return context.getApplicationContext();
    }

    public static final android.graphics.drawable.Drawable getDrawableCompat(android.content.Context context, int i) {
        android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i);
        if (drawable != null) {
            return drawable;
        }
        throw new java.lang.IllegalStateException("Invalid resource ID: ".concat(java.lang.String.valueOf(i)).toString());
    }

    public static final android.graphics.drawable.Drawable getDrawableCompat(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = androidx.core.content.res.ResourcesCompat.getDrawable(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new java.lang.IllegalStateException("Invalid resource ID: ".concat(java.lang.String.valueOf(i)).toString());
    }

    public static final android.graphics.drawable.Drawable getXmlDrawableCompat(android.content.Context context, android.content.res.Resources resources, int i) {
        android.content.res.XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found.");
        }
        return getDrawableCompat(resources, i, context.getTheme());
    }

    public static final androidx.view.Lifecycle getLifecycle(android.content.Context context) {
        java.lang.Object obj = context;
        while (!(obj instanceof androidx.view.LifecycleOwner)) {
            if (!(obj instanceof android.content.ContextWrapper)) {
                return null;
            }
            obj = ((android.content.ContextWrapper) obj).getBaseContext();
        }
        return ((androidx.view.LifecycleOwner) obj).getLifecycle();
    }

    public static final double defaultMemoryCacheSizePercent(android.content.Context context) {
        java.lang.Object systemService;
        try {
            systemService = androidx.core.content.ContextCompat.getSystemService(context, android.app.ActivityManager.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService);
        } catch (java.lang.Exception unused) {
        }
        return ((android.app.ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
    }

    public static final long totalAvailableMemoryBytes(android.content.Context context) {
        int i;
        try {
            java.lang.Object systemService = androidx.core.content.ContextCompat.getSystemService(context, android.app.ActivityManager.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService);
            android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (java.lang.Exception unused) {
            i = 256;
        }
        return i * com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
    }
}
