package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L0 implements Wh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N0 f6684a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C4028ql c;
    public final /* synthetic */ String d;

    public L0(N0 n0, boolean z, C4028ql c4028ql, String str) {
        this.f6684a = n0;
        this.b = z;
        this.c = c4028ql;
        this.d = str;
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.f6684a.a(exc, this.c);
    }

    @Override // com.inmobi.media.Wh
    public final void a(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f6684a.a("file saved - " + result + " , isReporting - " + this.b);
        this.f6684a.a(result, this.c, this.d, this.b);
    }
}
