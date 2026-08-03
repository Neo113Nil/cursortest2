package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0884Mp extends java.lang.Thread {
    public final /* synthetic */ android.os.ConditionVariable A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1845kM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0884Mp(com.facebook.ads.redexgen.core.C1845kM c1845kM, java.lang.String str, android.os.ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1845kM;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A05();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (java.lang.Throwable th) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            com.facebook.ads.redexgen.core.WU.A00(th2, this);
        }
    }
}
