package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997ft {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13522a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f13523b;

    public C0997ft(Context context, Looper looper) {
        this.f13522a = context;
        this.f13523b = looper;
    }

    public final void a(String str) {
        C1310mt w5 = C1355nt.w();
        String packageName = this.f13522a.getPackageName();
        w5.e();
        C1355nt.x((C1355nt) w5.f10141l, packageName);
        w5.e();
        C1355nt.z((C1355nt) w5.f10141l);
        C1220kt w6 = C1265lt.w();
        w6.e();
        C1265lt.x((C1265lt) w6.f10141l, str);
        w6.e();
        C1265lt.y((C1265lt) w6.f10141l);
        w5.e();
        C1355nt.y((C1355nt) w5.f10141l, (C1265lt) w6.b());
        R1.b bVar = new R1.b(this.f13522a, this.f13523b, (C1355nt) w5.b());
        synchronized (bVar.f5130o) {
            try {
                if (!bVar.f5126k) {
                    bVar.f5126k = true;
                    ((C1579st) bVar.f5128m).n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
