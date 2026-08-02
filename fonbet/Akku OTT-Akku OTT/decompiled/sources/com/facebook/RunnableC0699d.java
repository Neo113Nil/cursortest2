package com.facebook;

import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0699d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0699d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0717k this$0 = (C0717k) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.a();
                break;
            default:
                ((DefaultAnalyticsCollector) this.b).releaseInternal();
                break;
        }
    }
}
