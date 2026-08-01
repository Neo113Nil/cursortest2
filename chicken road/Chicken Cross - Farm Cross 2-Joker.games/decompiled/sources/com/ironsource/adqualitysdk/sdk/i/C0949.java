package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0949 implements InterfaceC0984 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0900 f2650;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f2651;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1226 f2652;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f2653;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0623 f2654;

    public C0949(C0900 c0900, C0623 c0623, C1074 c1074, C1226 c1226, List list) {
        this.f2650 = c0900;
        this.f2654 = c0623;
        this.f2653 = c1074;
        this.f2652 = c1226;
        this.f2651 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0984
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean mo5783(C0976 c0976, MediaPlayer mediaPlayer, int i, int i2) {
        return this.f2654.m5583(this.f2653, this.f2652, C0900.m5707(this.f2650, this.f2651, new Object[]{this, c0976, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)})).m5918();
    }
}
