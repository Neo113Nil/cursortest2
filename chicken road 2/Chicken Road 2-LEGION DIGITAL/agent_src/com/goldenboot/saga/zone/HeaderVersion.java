package com.goldenboot.saga.zone;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class HeaderVersion extends ContentOrganizer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderVersion(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.goldenboot.saga.zone.ContentOrganizer
    public final void compressVersion(IconRing owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.compressVersion(owner);
    }

    @Override // com.goldenboot.saga.zone.ContentOrganizer
    public final void transformCurrency(AlphaThread viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        super.transformCurrency(viewModelStore);
    }
}
