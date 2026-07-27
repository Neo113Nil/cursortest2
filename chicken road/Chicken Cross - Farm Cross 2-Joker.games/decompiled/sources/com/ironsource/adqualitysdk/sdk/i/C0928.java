package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴠ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0928 implements InterfaceC0924 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f2574;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2575;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2576;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2577;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2578;

    public C0928(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f2574 = c0900;
        this.f2578 = c0623;
        this.f2577 = c1074;
        this.f2576 = c1226;
        this.f2575 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0924
    /* renamed from: ﾒ */
    public final void mo5727(C0881 c0881, MediaPlayer mediaPlayer) {
        this.f2578.m5583(this.f2577, this.f2576, C0900.m5707(this.f2574, this.f2575, new Object[]{this, c0881, mediaPlayer}));
    }
}
