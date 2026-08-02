package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ar extends android.os.ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.as f3800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(com.google.android.play.core.integrity.as asVar, android.os.Handler handler) {
        super(handler);
        this.f3800a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, android.os.Bundle bundle) {
        if (i == 1) {
            this.f3800a.f3801a.trySetResult(3);
        } else if (i == 2) {
            this.f3800a.f3801a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f3800a.f3801a.trySetResult(1);
        }
    }
}
