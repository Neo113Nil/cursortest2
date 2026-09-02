package com.goldenboot.saga.zone;

import android.content.Context;
import android.graphics.Typeface;
import com.goldenboot.saga.zone.LifecycleBackup;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/goldenboot/saga/zone/SelectionRestore;", "Lcom/goldenboot/saga/zone/LifecycleBackup$ActivityMutator;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/goldenboot/saga/zone/LifecycleBackup;", "font", "Landroid/graphics/Typeface;", "evictLayout", "(Landroid/content/Context;Lcom/goldenboot/saga/zone/LifecycleBackup;)Landroid/graphics/Typeface;", "growPayload", "(Landroid/content/Context;Lcom/goldenboot/saga/zone/LifecycleBackup;Lcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionRestore implements LifecycleBackup.ActivityMutator {
    public static final SelectionRestore evictLayout = new SelectionRestore();

    private SelectionRestore() {
    }

    @Override // com.goldenboot.saga.zone.LifecycleBackup.ActivityMutator
    public Typeface evictLayout(Context context, LifecycleBackup font) {
        Font font2 = font instanceof Font ? (Font) font : null;
        if (font2 != null) {
            return font2.clipOrigin(context);
        }
        return null;
    }

    @Override // com.goldenboot.saga.zone.LifecycleBackup.ActivityMutator
    public Object growPayload(Context context, LifecycleBackup lifecycleBackup, ServiceRegulator serviceRegulator) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}
