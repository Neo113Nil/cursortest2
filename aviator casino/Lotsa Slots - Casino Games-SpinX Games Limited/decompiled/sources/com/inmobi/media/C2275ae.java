package com.inmobi.media;

/* renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2275ae implements com.inmobi.media.InterfaceC2588mc {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5102a;
    public final com.inmobi.media.C2469hn b;
    public final com.inmobi.media.C2799u9 c;
    public final java.util.ArrayList d;
    public com.inmobi.media.Bg e;
    public final kotlinx.coroutines.flow.MutableSharedFlow f;
    public final android.widget.RelativeLayout g;
    public final android.media.MediaPlayer h;
    public final com.inmobi.media.C2486ie i;
    public final com.inmobi.media.C2865wn j;
    public final com.inmobi.media.Gn k;
    public final com.inmobi.media.Zd l;
    public final kotlinx.coroutines.flow.MutableSharedFlow m;

    public C2275ae(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.C2469hn config, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f5102a = coroutineScope;
        this.b = config;
        this.c = c2799u9;
        this.d = new java.util.ArrayList();
        this.e = com.inmobi.media.Bg.f4624a;
        kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f = MutableSharedFlow$default;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        this.g = relativeLayout;
        android.content.Context context2 = relativeLayout.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        android.media.MediaPlayer a2 = com.inmobi.media.AbstractC2494in.a(context2);
        this.h = a2;
        this.i = new com.inmobi.media.C2486ie(relativeLayout, coroutineScope, a2, config, MutableSharedFlow$default);
        this.j = new com.inmobi.media.C2865wn(a2, coroutineScope, config.c.f, MutableSharedFlow$default);
        this.k = new com.inmobi.media.Gn(coroutineScope, a2, relativeLayout, config, c2799u9);
        this.l = new com.inmobi.media.Zd(this);
        this.m = MutableSharedFlow$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.ArrayList arrayList, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Yd yd;
        int i;
        com.inmobi.media.Tm tm;
        com.inmobi.media.C2799u9 c2799u9;
        if (continuationImpl instanceof com.inmobi.media.Yd) {
            yd = (com.inmobi.media.Yd) continuationImpl;
            int i2 = yd.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yd.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = yd.f5065a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yd.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.e != com.inmobi.media.Bg.f4624a) {
                        throw new com.inmobi.media.C2562lc();
                    }
                    this.e = com.inmobi.media.Bg.b;
                    com.inmobi.media.T4.a(this.f, this.f5102a, com.inmobi.media.Sm.f4962a);
                    com.inmobi.media.C2799u9 c2799u92 = this.c;
                    if (c2799u92 != null) {
                        c2799u92.a("NativeMediaPlayer", "Media Player Load started");
                    }
                    android.media.MediaPlayer mediaPlayer = this.h;
                    com.inmobi.media.C2799u9 c2799u93 = this.c;
                    yd.c = 1;
                    obj = com.inmobi.media.AbstractC2364dn.a(mediaPlayer, arrayList, c2799u93, yd);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                tm = (com.inmobi.media.Tm) obj;
                c2799u9 = this.c;
                if (c2799u9 != null) {
                    c2799u9.a("NativeMediaPlayer", "Media Player Load Status " + tm);
                }
                if (tm instanceof com.inmobi.media.Um) {
                    if (!(tm instanceof com.inmobi.media.Qm)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.e = com.inmobi.media.Bg.g;
                    com.inmobi.media.T4.a(this.f, this.f5102a, new com.inmobi.media.C2468hm());
                    throw new com.inmobi.media.C2562lc();
                }
                com.inmobi.media.T4.a(this.f, this.f5102a, new com.inmobi.media.Vm(((com.inmobi.media.Um) tm).f5003a));
                this.e = com.inmobi.media.Bg.c;
                android.media.MediaPlayer mediaPlayer2 = this.h;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
                try {
                    mediaPlayer2.seekTo(0);
                } catch (java.lang.IllegalStateException unused) {
                }
                com.inmobi.media.Gn gn = this.k;
                com.inmobi.media.Zd surfaceViewabilityListener = this.l;
                gn.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
                com.inmobi.media.T4.a(gn.f4732a, new com.inmobi.media.Cn(gn, surfaceViewabilityListener, null));
                com.inmobi.media.C2486ie c2486ie = this.i;
                com.inmobi.media.T4.a(c2486ie.b, new com.inmobi.media.C2380ee(c2486ie, null));
                return this.g;
            }
        }
        yd = new com.inmobi.media.Yd(this, continuationImpl);
        java.lang.Object obj2 = yd.f5065a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yd.c;
        if (i != 0) {
        }
        tm = (com.inmobi.media.Tm) obj2;
        c2799u9 = this.c;
        if (c2799u9 != null) {
        }
        if (tm instanceof com.inmobi.media.Um) {
        }
    }
}
