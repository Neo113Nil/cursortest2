package com.flurry.android.marketing.core;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.flurry.android.marketing.messaging.FCM.FlurryMessageListenerService;
import java.util.ArrayList;
import p145u1.j;
import p155w1.AbstractRunnableC0978d1;
import p155w1.C0993h0;
import p155w1.C1008l;
import p155w1.H2;
import p155w1.P1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10474c;

    public /* synthetic */ b(Object obj, boolean z4, int i7) {
        this.f10472a = i7;
        this.f10474c = obj;
        this.f10473b = z4;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        switch (this.f10472a) {
            case 0:
                int i7 = this.f10473b ? 1 : 2;
                Context context = (Context) this.f10474c;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) FlurryMessageListenerService.class), i7, 1);
                break;
            case 1:
                ((j) this.f10474c).c(this.f10473b);
                break;
            default:
                boolean z4 = this.f10473b;
                if (z4) {
                    C0993h0 c0993h0 = H2.a().f17412k;
                    P1 p5 = (P1) this.f10474c;
                    long j = p5.f17508g;
                    long j3 = p5.f17509h;
                    c0993h0.f17728A.set(j);
                    c0993h0.f17729B.set(j3);
                    ArrayList arrayList = c0993h0.f17733F;
                    if (!arrayList.isEmpty()) {
                        new Handler(Looper.getMainLooper()).post(new C1008l(new ArrayList(arrayList), 3));
                    }
                }
                H2.a().f17412k.f17730C.set(z4);
                break;
        }
    }

    public b(Context context, boolean z4) {
        this.f10472a = 0;
        this.f10473b = z4;
        this.f10474c = context;
    }
}
