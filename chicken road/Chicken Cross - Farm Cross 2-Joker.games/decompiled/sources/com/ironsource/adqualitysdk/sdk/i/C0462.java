package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ί, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0462 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0455 f860;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f861;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Intent f862;

    public C0462(C0455 c0455, Intent intent, Context context) {
        this.f860 = c0455;
        this.f862 = intent;
        this.f861 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        try {
            if (this.f862.getAction().equals(StringFog.decrypt("wRpqTYrW8wrOEXoRhtD5So43QXGr+tRw6SJHa7zg1GzhOkl6\n", "oHQOP+W/lyQ=\n"))) {
                String str = C0455.f844;
                AbstractC0544.m5509(str, StringFog.decrypt("HAcldILhGmsxDT9tiPAFIiQLJXrN8BkqPAU0\n", "UmJRA+2TcUs=\n"));
                if (this.f862.getBooleanExtra(StringFog.decrypt("gRf2Ltjoy8CbEcMowv8=\n", "73i1QbaGrqM=\n"), false)) {
                    AbstractC0544.m5509(str, StringFog.decrypt("jSXwv/eO2Hy3IrWj993cM6smta79x8U5ujn8u/vd0g==\n", "2U2VzZKpq1w=\n"));
                    AbstractC1145.m5891(new C0503(this));
                } else if (C0455.m5447(this.f860, this.f861)) {
                    AbstractC1145.m5891(new C0497(this));
                } else {
                    AbstractC1145.m5891(new C0496(this));
                }
            }
        } catch (Exception e) {
            AbstractC0480.m5464(C0455.f844, StringFog.decrypt("HHlDDUgTjz15ZF8wX1CDOi9u\n", "WQsxYjoz5lM=\n"), (Throwable) e, false);
        }
    }
}
