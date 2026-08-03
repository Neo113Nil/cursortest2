package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Y7 implements com.inmobi.media.Pg {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5060a;

    public Y7(java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        this.f5060a = content;
    }

    @Override // com.inmobi.media.Pg
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Pg
    public final java.lang.Object b() {
        return this.f5060a;
    }

    @Override // com.inmobi.media.Pg
    public final void a() {
        if (this.f5060a.length() != 0) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", (short) 2162);
        throw new com.inmobi.media.Rg(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(hashMap));
    }
}
