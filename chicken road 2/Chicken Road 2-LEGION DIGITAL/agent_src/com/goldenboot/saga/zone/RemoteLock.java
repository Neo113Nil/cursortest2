package com.goldenboot.saga.zone;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class RemoteLock extends PaletteComposer {
    public final ViewGroup notifyMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteLock(androidx.fragment.app.LayerUseCase fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.notifyMessage = viewGroup;
    }
}
