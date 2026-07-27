package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4197wn {

    /* renamed from: a, reason: collision with root package name */
    public final String f7465a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public C4197wn(String universalAdId, String adServingId, int i, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f7465a = universalAdId;
        this.b = adServingId;
        this.c = i;
        this.d = trackers;
    }
}
