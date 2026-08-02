package com.amplitude.android;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.Timeline", f = "Timeline.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 117, 118, 123}, m = "processEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "eventTimestamp", "this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class s extends ContinuationImpl {
    public x a;
    public com.amplitude.core.events.a b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ x e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(null, this);
    }
}
