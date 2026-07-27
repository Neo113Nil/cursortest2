package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4251yn {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7510a;
    public final ArrayList b;
    public final ArrayList c;

    public C4251yn(ArrayList resources, ArrayList inlineTrackers, ArrayList wrapperTrackers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(inlineTrackers, "inlineTrackers");
        Intrinsics.checkNotNullParameter(wrapperTrackers, "wrapperTrackers");
        this.f7510a = resources;
        this.b = inlineTrackers;
        this.c = wrapperTrackers;
    }
}
