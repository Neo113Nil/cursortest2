package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3877ld {

    /* renamed from: a, reason: collision with root package name */
    public final Z9 f7224a;
    public G2 b;
    public final MediaView c;
    public final Y6 d;
    public final MutableSharedFlow e;

    public C3877ld(Context context, CoroutineScope coroutineScope, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f7224a = z9;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = new MediaView(context);
        this.d = new Y6(context, coroutineScope, MutableSharedFlow$default, z9);
        this.e = MutableSharedFlow$default;
    }

    public final Object a(Z6 z6, ContinuationImpl continuationImpl) {
        Z9 z9 = this.f7224a;
        if (z9 != null) {
            z9.a("MediaViewManager", "load called - experienceModel: " + z6);
        }
        return this.b != null ? this.c : BuildersKt.withContext(Dispatchers.getIO(), new C3849kd(this, z6, null), continuationImpl);
    }
}
