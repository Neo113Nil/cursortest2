package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Bp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final E4.a f7888a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.a f7889b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7890c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7891d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7892e = false;
    public final boolean f;

    public Bp(E4.a aVar, E4.a aVar2, boolean z3, boolean z5, boolean z6) {
        this.f7888a = aVar;
        this.f7889b = aVar2;
        this.f7890c = z3;
        this.f7891d = z5;
        this.f = z6;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r7 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8779W2)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        r4 = r9.f7889b;
        r5 = (java.lang.String) r4.f1486l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r6 = r4.f1485k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.f7890c);
        r1.putBoolean("paidv2_user_option_android", r9.f7891d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8789Y2)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8784X2)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8774V2)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        r5 = r9.f7888a;
        r6 = (java.lang.String) r5.f1486l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r7 = r5.f1485k;
     */
    @Override // com.google.android.gms.internal.ads.Lp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Object obj) {
        Bundle bundle = ((C0572Ch) obj).f8049a;
        if (this.f7892e) {
            return;
        }
        Bundle e3 = AbstractC1803xs.e("pii", bundle);
        boolean z3 = this.f;
        if (!z3) {
        }
        if (z3) {
        }
        if (!z3) {
        }
        if (z3) {
        }
        if (e3.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", e3);
    }

    public Bp(boolean z3) {
        this.f = z3;
    }
}
