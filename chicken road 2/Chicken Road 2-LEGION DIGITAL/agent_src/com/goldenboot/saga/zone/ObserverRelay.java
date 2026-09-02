package com.goldenboot.saga.zone;

import android.view.WindowManager;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/ObserverRelay;", "", "<init>", "()V", "Landroid/view/WindowManager$LayoutParams;", "attrs", "", "sides", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Landroid/view/WindowManager$LayoutParams;I)V", "types", "growPayload", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ObserverRelay {
    public static final ObserverRelay evictLayout = new ObserverRelay();

    private ObserverRelay() {
    }

    public final void evictLayout(WindowManager.LayoutParams attrs, int sides) {
        attrs.setFitInsetsSides(sides);
    }

    public final void growPayload(WindowManager.LayoutParams attrs, int types) {
        attrs.setFitInsetsTypes(types);
    }
}
