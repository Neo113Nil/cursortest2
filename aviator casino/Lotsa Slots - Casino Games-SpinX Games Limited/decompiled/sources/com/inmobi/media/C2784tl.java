package com.inmobi.media;

/* renamed from: com.inmobi.media.tl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2784tl implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ okhttp3.Call f5471a;

    public C2784tl(okhttp3.Call call) {
        this.f5471a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        this.f5471a.cancel();
        return kotlin.Unit.INSTANCE;
    }
}
