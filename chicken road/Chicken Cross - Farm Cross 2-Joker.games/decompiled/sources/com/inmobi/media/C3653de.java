package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3653de implements Fq {

    /* renamed from: a, reason: collision with root package name */
    public final C3600bi f7067a;
    public final C3882li b;
    public final Hd c;
    public final Gd d;
    public C3626cf e;

    public C3653de(InMobiNative inMobiNative, Context context, long j) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(context, "context");
        C3600bi c3600bi = new C3600bi();
        c3600bi.f7031a = j;
        this.f7067a = c3600bi;
        C3625ce c3625ce = new C3625ce(this);
        C3882li c3882li = new C3882li();
        this.b = c3882li;
        Hd hd = new Hd(inMobiNative, c3882li, c3625ce);
        this.c = hd;
        this.d = new Gd(context, c3600bi, hd);
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        return this.d.a(d);
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        return this.d.a(i, d);
    }
}
