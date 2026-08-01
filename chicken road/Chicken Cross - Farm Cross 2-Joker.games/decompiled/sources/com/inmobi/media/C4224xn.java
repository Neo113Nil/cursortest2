package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4224xn {

    /* renamed from: a, reason: collision with root package name */
    public final String f7485a;
    public final ArrayList b;

    public C4224xn(String clickThroughUrl, ArrayList vastClickTrackers) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(vastClickTrackers, "vastClickTrackers");
        this.f7485a = clickThroughUrl;
        this.b = vastClickTrackers;
    }
}
