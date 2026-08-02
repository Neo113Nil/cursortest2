package Ea;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long elapsedRealtimeNanos;
        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        return Long.valueOf(elapsedRealtimeNanos);
    }
}
