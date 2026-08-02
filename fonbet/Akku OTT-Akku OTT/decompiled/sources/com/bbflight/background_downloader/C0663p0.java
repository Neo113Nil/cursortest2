package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.NotificationService", f = "Notifications.kt", i = {0, 0, 0, 1, 1, 1}, l = {923, 926}, m = "processNotificationData", n = {"notificationData", "now", "elapsed", "notificationData", "now", "elapsed"}, nl = {925, 933}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1"}, v = 2)
/* renamed from: com.bbflight.background_downloader.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0663p0 extends ContinuationImpl {
    public Object a;
    public long b;
    public long c;
    public /* synthetic */ Object d;
    public int e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        C0657m0 c0657m0 = C0657m0.a;
        return C0657m0.a(null, this);
    }
}
