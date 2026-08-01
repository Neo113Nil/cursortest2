package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC4257z2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiBanner f7517a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HandlerC4257z2(InMobiBanner mInmobiBanner) {
        super(looper);
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Looper looper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f7517a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.f7517a.refreshBanner$media_release();
            return;
        }
        Intrinsics.checkNotNullExpressionValue("z2", "TAG");
        String str = "Unhandled msg ( " + msg.what + " ) in the Refresh Handler ";
    }
}
