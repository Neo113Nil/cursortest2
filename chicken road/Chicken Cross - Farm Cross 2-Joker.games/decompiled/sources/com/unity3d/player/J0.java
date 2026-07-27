package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a.AbstractC4886o;
import com.unity3d.player.a.AbstractC4890t;
import java.util.concurrent.Semaphore;

/* loaded from: classes7.dex */
public final class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f11714a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Semaphore l;
    public final /* synthetic */ UnityPlayerForActivityOrService m;

    public J0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, UnityPlayerForActivityOrService unityPlayerForActivityOrService2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6, Semaphore semaphore) {
        this.m = unityPlayerForActivityOrService;
        this.f11714a = unityPlayerForActivityOrService2;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = i2;
        this.j = z5;
        this.k = z6;
        this.l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4933t abstractC4933t;
        AbstractC4933t c4939y;
        AbstractC4933t abstractC4933t2;
        AbstractC4933t abstractC4933t3;
        try {
            try {
                UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.m;
                abstractC4933t = unityPlayerForActivityOrService.mSoftInput;
                if (abstractC4933t != null) {
                    unityPlayerForActivityOrService.dismissSoftInput();
                }
                UnityPlayerForActivityOrService unityPlayerForActivityOrService2 = this.m;
                int a2 = SoftInputProvider.a();
                Context context = this.m.mContext;
                UnityPlayerForActivityOrService unityPlayerForActivityOrService3 = this.f11714a;
                if (AbstractC4886o.a(a2) == 2) {
                    c4939y = new C4939y(context, unityPlayerForActivityOrService3);
                } else {
                    c4939y = new A(context, unityPlayerForActivityOrService3);
                }
                unityPlayerForActivityOrService2.mSoftInput = c4939y;
                abstractC4933t2 = this.m.mSoftInput;
                abstractC4933t2.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                abstractC4933t3 = this.m.mSoftInput;
                abstractC4933t3.f = new I0(this);
                abstractC4933t3.d();
                this.m.nativeReportKeyboardConfigChanged();
            } catch (Exception e) {
                AbstractC4890t.Log(6, "Exception when opening Softinput " + e);
            }
        } finally {
            this.l.release();
        }
    }
}
