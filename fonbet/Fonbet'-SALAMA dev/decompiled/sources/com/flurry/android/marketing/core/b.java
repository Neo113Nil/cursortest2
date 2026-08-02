package com.flurry.android.marketing.core;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.flurry.android.marketing.messaging.FCM.FlurryMessageListenerService;
import java.util.ArrayList;
import u1.j;
import w1.AbstractRunnableC1687d1;
import w1.C1702h0;
import w1.C1717l;
import w1.H2;
import w1.P1;

/* loaded from: classes.dex */
public final class b extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10474c;

    public /* synthetic */ b(Object obj, boolean z4, int i7) {
        this.f10472a = i7;
        this.f10474c = obj;
        this.f10473b = z4;
    }

    @Override // w1.AbstractRunnableC1687d1
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
                    C1702h0 c1702h0 = H2.a().f17406k;
                    P1 p12 = (P1) this.f10474c;
                    long j = p12.f17502g;
                    long j3 = p12.f17503h;
                    c1702h0.f17722A.set(j);
                    c1702h0.f17723B.set(j3);
                    ArrayList arrayList = c1702h0.f17727F;
                    if (!arrayList.isEmpty()) {
                        new Handler(Looper.getMainLooper()).post(new C1717l(new ArrayList(arrayList), 3));
                    }
                }
                H2.a().f17406k.f17724C.set(z4);
                break;
        }
    }

    public b(Context context, boolean z4) {
        this.f10472a = 0;
        this.f10473b = z4;
        this.f10474c = context;
    }
}
