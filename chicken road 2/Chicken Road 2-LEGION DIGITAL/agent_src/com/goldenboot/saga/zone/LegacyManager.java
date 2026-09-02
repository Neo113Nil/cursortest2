package com.goldenboot.saga.zone;

import android.text.StaticLayout;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/goldenboot/saga/zone/LegacyManager;", "", "<init>", "()V", "Landroid/text/StaticLayout$Builder;", "builder", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Landroid/text/StaticLayout$Builder;)V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LegacyManager {
    public static final LegacyManager evictLayout = new LegacyManager();

    private LegacyManager() {
    }

    public static final void evictLayout(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }
}
