package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W1 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(Looper looper, boolean z) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f6920a = z;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 1001 && this.f6920a) {
            this.f6920a = false;
            Y1.a(false);
            Intrinsics.checkNotNullExpressionValue("Y1", "access$getTAG$p(...)");
        } else {
            if (i != 1002 || this.f6920a) {
                return;
            }
            this.f6920a = true;
            Y1.a(true);
            Intrinsics.checkNotNullExpressionValue("Y1", "access$getTAG$p(...)");
        }
    }
}
