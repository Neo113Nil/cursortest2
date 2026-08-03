package com.inmobi.media;

/* loaded from: classes5.dex */
public final class C1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4634a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
        this.f4634a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 1001 && this.f4634a) {
            this.f4634a = false;
            com.inmobi.media.E1.a(false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("E1", "access$getTAG$p(...)");
        } else {
            if (i != 1002 || this.f4634a) {
                return;
            }
            this.f4634a = true;
            com.inmobi.media.E1.a(true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("E1", "access$getTAG$p(...)");
        }
    }
}
