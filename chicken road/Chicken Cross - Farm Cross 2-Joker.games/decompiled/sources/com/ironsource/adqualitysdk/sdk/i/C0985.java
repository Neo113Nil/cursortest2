package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵠ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0985 implements InterfaceC0961 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f2900;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2901;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2902;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2903;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2904;

    public C0985(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f2900 = c0900;
        this.f2904 = c0623;
        this.f2903 = c1074;
        this.f2902 = c1226;
        this.f2901 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0961
    /* renamed from: ﾒ */
    public final void mo5785(C0953 c0953, MediaPlayer mediaPlayer) {
        this.f2904.m5583(this.f2903, this.f2902, C0900.m5707(this.f2900, this.f2901, new Object[]{this, c0953, mediaPlayer}));
    }
}
