package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.bp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3608bp extends Vc {

    /* renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow f7035a;
    public final long b;

    public C3608bp(MutableSharedFlow mediaEventFlow, long j) {
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f7035a = mediaEventFlow;
        this.b = j;
    }
}
