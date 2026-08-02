package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1615tk implements L5 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15712k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0677Re f15713l;

    public /* synthetic */ C1615tk(InterfaceC0677Re interfaceC0677Re, int i) {
        this.f15712k = i;
        this.f15713l = interfaceC0677Re;
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        switch (this.f15712k) {
            case 0:
                C1028gf I5 = this.f15713l.I();
                Rect rect = k5.f10124d;
                I5.L0(rect.left, rect.top);
                break;
            case 1:
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != k5.f10128j ? "0" : "1");
                this.f15713l.a("onAdVisibilityChanged", hashMap);
                break;
            default:
                C1028gf I6 = this.f15713l.I();
                Rect rect2 = k5.f10124d;
                I6.L0(rect2.left, rect2.top);
                break;
        }
    }
}
