package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.cp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859cp extends AbstractC1665up {

    /* renamed from: c, reason: collision with root package name */
    public final long f13044c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13045d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13046e;

    public C0859cp(int i, long j5) {
        super(i);
        this.f13044c = j5;
        this.f13045d = new ArrayList();
        this.f13046e = new ArrayList();
    }

    public final C0859cp d(int i) {
        ArrayList arrayList = this.f13046e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0859cp c0859cp = (C0859cp) arrayList.get(i5);
            if (c0859cp.f15911b == i) {
                return c0859cp;
            }
        }
        return null;
    }

    public final C1216kp e(int i) {
        ArrayList arrayList = this.f13045d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1216kp c1216kp = (C1216kp) arrayList.get(i5);
            if (c1216kp.f15911b == i) {
                return c1216kp;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1665up
    public final String toString() {
        ArrayList arrayList = this.f13045d;
        return AbstractC1665up.b(this.f15911b) + " leaves: " + Arrays.toString(arrayList.toArray()) + " containers: " + Arrays.toString(this.f13046e.toArray());
    }
}
