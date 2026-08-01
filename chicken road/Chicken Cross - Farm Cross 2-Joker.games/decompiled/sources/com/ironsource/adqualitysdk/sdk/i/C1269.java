package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｒ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1269 extends ThreadPoolExecutor implements InterfaceC0997 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f3643;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0807 f3644;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1269(C1267 c1267, ThreadPoolExecutor threadPoolExecutor, C0807 c0807) {
        super(r1, r2, threadPoolExecutor.getKeepAliveTime(r5), r5, threadPoolExecutor.getQueue());
        this.f3643 = c1267;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3644 = c0807;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3643.m5529(this, this.f3644, StringFog.decrypt("VIcV4+42WoFvtwP++SNGlmXrNePuNlqBZQ==\n", "AMVQm4tVL/U=\n"), runnable);
        super.execute(runnable);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this;
    }
}
