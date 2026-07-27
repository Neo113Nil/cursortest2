package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.々, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1093 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1087 f3212;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3213;

    public C1093(C1087 c1087, Activity activity) {
        this.f3212 = c1087;
        this.f3213 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1124 c1124 = this.f3212.f3201.f3118;
        String decrypt = StringFog.decrypt("FMvgXzbVVxkB0OxYIO4=\n", "cqSDKkWKJXw=\n");
        c1124.getClass();
        AbstractC1145.m5892(new C1126(c1124, decrypt));
        this.f3212.f3201.m5831(StringFog.decrypt("JrMhlkjC9dwzqC2RXvk=\n", "QNxC4zudh7k=\n"), C1087.m5876(this.f3212, this.f3213));
    }
}
