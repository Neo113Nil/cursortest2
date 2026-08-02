package com.amplitude.android;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.Timeline", f = "Timeline.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {172, 173}, m = "startNewSession", n = {"this", "sessionEvents", Constants.TIMESTAMP, "trackingSessionEvents", "this", "sessionEvents", Constants.TIMESTAMP, "trackingSessionEvents"}, s = {"L$0", "L$1", "J$0", "Z$0", "L$0", "L$1", "J$0", "Z$0"})
/* loaded from: classes3.dex */
public final class v extends ContinuationImpl {
    public x a;
    public List b;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.k(0L, this);
    }
}
