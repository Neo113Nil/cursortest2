package com.goldenboot.saga.zone;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/goldenboot/saga/zone/PlatformVersion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "resourceId", "Landroid/graphics/Typeface;", "evictLayout", "(Landroid/content/Context;I)Landroid/graphics/Typeface;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class PlatformVersion {
    public static final PlatformVersion evictLayout = new PlatformVersion();

    private PlatformVersion() {
    }

    public final Typeface evictLayout(Context context, int resourceId) {
        return context.getResources().getFont(resourceId);
    }
}
