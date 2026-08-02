package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116id implements L5 {

    /* renamed from: k, reason: collision with root package name */
    public final Context f13937k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f13938l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13939m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13940n;

    public C1116id(Context context, String str) {
        this.f13937k = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f13939m = str;
        this.f13940n = false;
        this.f13938l = new Object();
    }

    public final void a(boolean z3) {
        P2.o oVar = P2.o.f4767B;
        if (oVar.f4790x.e(this.f13937k)) {
            synchronized (this.f13938l) {
                try {
                    if (this.f13940n == z3) {
                        return;
                    }
                    this.f13940n = z3;
                    if (TextUtils.isEmpty(this.f13939m)) {
                        return;
                    }
                    if (this.f13940n) {
                        C1204kd c1204kd = oVar.f4790x;
                        Context context = this.f13937k;
                        String str = this.f13939m;
                        if (c1204kd.e(context)) {
                            c1204kd.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C1204kd c1204kd2 = oVar.f4790x;
                        Context context2 = this.f13937k;
                        String str2 = this.f13939m;
                        if (c1204kd2.e(context2)) {
                            c1204kd2.j(context2, str2, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        a(k5.f10128j);
    }
}
