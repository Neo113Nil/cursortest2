package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class SF implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ WF f11528k;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap hashMap = YF.f12311a;
        WF wf = this.f11528k;
        return wf.k(obj2) - wf.k(obj);
    }
}
