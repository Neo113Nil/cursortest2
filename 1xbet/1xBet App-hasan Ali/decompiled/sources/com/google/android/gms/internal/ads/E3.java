package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E3 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8456c = F3.f8650a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8457a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f8458b = false;

    public final synchronized void a(String str, long j5) {
        if (this.f8458b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f8457a.add(new D3(j5, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j5;
        this.f8458b = true;
        if (this.f8457a.size() == 0) {
            j5 = 0;
        } else {
            j5 = ((D3) this.f8457a.get(r3.size() - 1)).f8158c - ((D3) this.f8457a.get(0)).f8158c;
        }
        if (j5 > 0) {
            long j6 = ((D3) this.f8457a.get(0)).f8158c;
            F3.a("(%-4d ms) %s", Long.valueOf(j5), str);
            ArrayList arrayList = this.f8457a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                D3 d32 = (D3) obj;
                long j7 = d32.f8158c;
                F3.a("(+%-4d) [%2d] %s", Long.valueOf(j7 - j6), Long.valueOf(d32.f8157b), d32.f8156a);
                j6 = j7;
            }
        }
    }

    public final void finalize() {
        if (this.f8458b) {
            return;
        }
        b("Request on the loose");
        F3.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
