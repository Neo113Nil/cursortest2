package com.google.android.gms.internal.ads;

import Q2.C0379q;

/* renamed from: com.google.android.gms.internal.ads.v9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1686v9 implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1074hg f15968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15969c;

    public /* synthetic */ C1686v9(C1074hg c1074hg, String str, int i) {
        this.f15967a = i;
        this.f15968b = c1074hg;
        this.f15969c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        String str = this.f15969c;
        C1074hg c1074hg = this.f15968b;
        switch (this.f15967a) {
            case 0:
                String str2 = (String) obj;
                C1551s9 c1551s9 = AbstractC1776x9.f16242a;
                return (((Boolean) Q2.r.f5053d.f5056c.a(F7.E9)).booleanValue() && c1074hg != null && C1074hg.b(str)) ? c1074hg.a(str2, C0379q.f.f5052e) : AbstractC1400ot.c0(str2);
            default:
                c1074hg.getClass();
                c1074hg.f13774e.b(new RunnableC0984fg(c1074hg, (Throwable) obj, 1));
                return AbstractC1400ot.c0(str);
        }
    }
}
