package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0938 implements InterfaceC1010 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f2637;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2638;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2639;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2640;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2641;

    public C0938(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f2637 = c0900;
        this.f2641 = c0623;
        this.f2640 = c1074;
        this.f2639 = c1226;
        this.f2638 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1010
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5777(C1003 c1003, MediaPlayer mediaPlayer) {
        this.f2641.m5583(this.f2640, this.f2639, C0900.m5707(this.f2637, this.f2638, new Object[]{this, c1003, mediaPlayer}));
    }
}
