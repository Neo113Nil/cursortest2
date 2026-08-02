package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import n.AbstractC2107A;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033gk {

    /* renamed from: a, reason: collision with root package name */
    public final T2.v f13639a;

    /* renamed from: b, reason: collision with root package name */
    public final C2308a f13640b;

    /* renamed from: c, reason: collision with root package name */
    public final Qw f13641c;

    public C1033gk(T2.v vVar, C2308a c2308a, Qw qw) {
        this.f13639a = vVar;
        this.f13640b = c2308a;
        this.f13641c = qw;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        C2308a c2308a = this.f13640b;
        c2308a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        c2308a.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j5 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z3 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder w5 = AbstractC2107A.w("Decoded image w: ", width, " h:", height, " bytes: ");
            w5.append(allocationByteCount);
            w5.append(" time: ");
            w5.append(j5);
            w5.append(" on ui thread: ");
            w5.append(z3);
            T2.G.m(w5.toString());
        }
        return decodeByteArray;
    }
}
