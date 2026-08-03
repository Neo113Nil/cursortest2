package com.inmobi.media;

/* renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2563ld implements com.inmobi.media.Io {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Sg f5314a;
    public final com.inmobi.media.C2278ah b;
    public final com.inmobi.media.Pc c;
    public final com.inmobi.media.Oc d;
    public com.inmobi.media.C2511je e;

    public C2563ld(com.inmobi.ads.InMobiNative inMobiNative, android.content.Context context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.Sg sg = new com.inmobi.media.Sg();
        sg.f4958a = j;
        this.f5314a = sg;
        com.inmobi.media.C2536kd c2536kd = new com.inmobi.media.C2536kd(this);
        com.inmobi.media.C2278ah c2278ah = new com.inmobi.media.C2278ah();
        this.b = c2278ah;
        com.inmobi.media.Pc pc = new com.inmobi.media.Pc(inMobiNative, c2278ah, c2536kd);
        this.c = pc;
        this.d = new com.inmobi.media.Oc(context, sg, pc);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        return this.d.a(d);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        return this.d.a(i, d);
    }
}
