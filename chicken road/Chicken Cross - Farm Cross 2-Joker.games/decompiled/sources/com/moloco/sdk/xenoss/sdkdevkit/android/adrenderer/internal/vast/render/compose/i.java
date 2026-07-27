package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements C.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11409a;
    public final boolean b;
    public final Q c;

    public i(Context context, boolean z, Q viewVisibilityTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.f11409a = context;
        this.b = z;
        this.c = viewVisibilityTracker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C.b
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f a(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d(this.f11409a, this.b, a.g.f10872a.a(), lifecycle, MetricsRecorder.INSTANCE.withNoMediation()), this.c);
    }
}
