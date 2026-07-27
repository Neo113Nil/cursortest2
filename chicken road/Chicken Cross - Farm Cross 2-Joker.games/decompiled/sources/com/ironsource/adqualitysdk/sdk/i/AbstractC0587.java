package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ר, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0587 extends RuntimeException {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Throwable f1415;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1255 f1416;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1417;

    public AbstractC0587(String str, AbstractC1255 abstractC1255, Throwable th) {
        this.f1417 = str;
        this.f1416 = abstractC1255;
        this.f1415 = th;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return mo5390() + StringFog.decrypt("aDo=\n", "UhqtHkqL1yg=\n") + this.f1417 + '\n' + this.f1416 + (this.f1415 != null ? StringFog.decrypt("N761lcxAgT9fhO7A\n", "Pf3U4L8l5R8=\n") + Log.getStackTraceString(this.f1415) : "");
    }

    /* renamed from: ﾒ */
    public abstract String mo5390();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5536(String str) {
        AbstractC1086.m5875(str, this.f1417, null, this);
    }
}
