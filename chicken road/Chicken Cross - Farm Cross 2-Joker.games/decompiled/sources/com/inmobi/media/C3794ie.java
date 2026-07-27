package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3794ie implements Ji {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3821je f7161a;

    public C3794ie(C3821je c3821je) {
        this.f7161a = c3821je;
    }

    @Override // com.inmobi.media.Ji
    public final boolean a() {
        long userTouchResetTime = this.f7161a.f7181a.b.f6590a.b.getRendering().getUserTouchResetTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7161a.b;
        return j != 0 && elapsedRealtime - j < userTouchResetTime;
    }

    @Override // com.inmobi.media.Ji
    public final boolean c() {
        return !this.f7161a.f7181a.b.f6590a.b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.Ji
    public final long getViewTouchTimestamp() {
        return this.f7161a.b;
    }

    @Override // com.inmobi.media.Ji
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        Map a2 = AbstractC4169vm.a(this.f7161a.f7181a.e.f6512a);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("BlockAutoRedirection", a2, EnumC3944nm.f7271a);
    }
}
