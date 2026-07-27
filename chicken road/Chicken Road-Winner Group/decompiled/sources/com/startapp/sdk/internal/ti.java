package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ti {

    /* renamed from: a, reason: collision with root package name */
    public final int f4394a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4395b;

    /* renamed from: c, reason: collision with root package name */
    public final cj f4396c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4397d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4398e;
    public final ArrayList f;

    public ti(int i3, int i4, cj cjVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f4394a = i3;
        this.f4395b = i4;
        this.f4396c = cjVar;
        this.f4397d = str;
        this.f4398e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && ti.class == obj.getClass()) {
            ti tiVar = (ti) obj;
            if (this.f4394a == tiVar.f4394a && this.f4395b == tiVar.f4395b) {
                cj cjVar = this.f4396c;
                cj cjVar2 = tiVar.f4396c;
                WeakHashMap weakHashMap = si.f4343a;
                if (cjVar.equals(cjVar2) && si.a((Object) this.f4397d, (Object) tiVar.f4397d) && this.f4398e.equals(tiVar.f4398e) && this.f.equals(tiVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f4394a), Integer.valueOf(this.f4395b), this.f4396c, this.f4397d, this.f4398e, this.f};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
