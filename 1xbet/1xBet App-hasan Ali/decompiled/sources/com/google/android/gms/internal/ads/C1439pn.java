package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.pn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439pn {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f15039b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15040a;

    public C1439pn(Handler handler) {
        this.f15040a = handler;
    }

    public static /* bridge */ /* synthetic */ void d(Vm vm) {
        ArrayList arrayList = f15039b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(vm);
            }
        }
    }

    public static Vm e() {
        Vm vm;
        ArrayList arrayList = f15039b;
        synchronized (arrayList) {
            try {
                vm = arrayList.isEmpty() ? new Vm() : (Vm) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vm;
    }

    public final Vm a(int i, Object obj) {
        Vm e3 = e();
        e3.f11938a = this.f15040a.obtainMessage(i, obj);
        return e3;
    }

    public final boolean b(Runnable runnable) {
        return this.f15040a.post(runnable);
    }

    public final boolean c(int i) {
        return this.f15040a.sendEmptyMessage(i);
    }
}
