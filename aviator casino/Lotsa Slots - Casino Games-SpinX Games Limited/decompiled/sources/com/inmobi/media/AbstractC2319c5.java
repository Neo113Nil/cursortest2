package com.inmobi.media;

/* renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2319c5 extends com.inmobi.media.AbstractC2366e0 implements com.inmobi.media.InterfaceC2782tj {
    public final com.inmobi.media.C2631o1 h;
    public final com.inmobi.media.Pc i;
    public final com.inmobi.media.Ic j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2319c5(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.Pc publisherCallbacks, com.inmobi.media.Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = adManagerComponent;
        this.i = publisherCallbacks;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
    }

    public final void a(byte[] bArr) {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.a("AUM-CreatedState", "load called: " + (bArr != null ? new java.lang.String(bArr, kotlin.text.Charsets.UTF_8) : null));
        }
        com.inmobi.media.C2313c0 c2313c0 = this.f;
        c2313c0.getClass();
        c2313c0.f5131a = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.C2576m0 c2576m0 = this.g;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2576m0.f5324a, null, null, new com.inmobi.media.C2393f0(c2576m0, null), 3, null);
        if (b()) {
            com.inmobi.media.C2799u9 c2799u92 = this.e;
            if (c2799u92 != null) {
                c2799u92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        com.inmobi.media.C2631o1 adManagerComponent = this.h;
        com.inmobi.media.Ic stateMachine = this.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        com.inmobi.media.C2508jb adUnitTimeout = new com.inmobi.media.C2508jb(adManagerComponent, stateMachine);
        com.inmobi.media.C2300bd c2300bd = (com.inmobi.media.C2300bd) this;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        com.inmobi.media.C2799u9 c2799u93 = c2300bd.e;
        if (c2799u93 != null) {
            c2799u93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        c2300bd.m.a(new com.inmobi.media.C2829vd(bArr, c2300bd.k, adUnitTimeout, c2300bd.l, c2300bd.m), c2300bd);
    }

    public final boolean b() {
        try {
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.squareup.picasso.Picasso.class).getSimpleName();
            try {
                kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.browser.customtabs.CustomTabsClient.class).getSimpleName();
                return false;
            } catch (java.lang.NoClassDefFoundError unused) {
                a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    public final void a(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        com.inmobi.media.C2799u9 c2799u9 = this.e;
        if (c2799u9 != null) {
            c2799u9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.j.a(new com.inmobi.media.C2561lb((short) 2007, inMobiAdRequestStatus, this.h, this.i, this.j), this);
    }
}
