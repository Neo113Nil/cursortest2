package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ItemStreamer extends PaletteComposer {
    public final boolean notifyMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemStreamer(androidx.fragment.app.LayerUseCase fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.notifyMessage = z;
    }
}
