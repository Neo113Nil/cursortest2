package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class J8 {

    /* renamed from: a, reason: collision with root package name */
    public final I8 f9866a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f9867b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f9868c;

    /* renamed from: d, reason: collision with root package name */
    public final double f9869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9870e;
    public final int f;

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        U2.j.g("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        U2.j.g("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        U2.j.g("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        U2.j.g("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J8(I8 i8) {
        Drawable drawable;
        InterfaceC2360a c5;
        this.f9866a = i8;
        Uri uri = null;
        try {
            c5 = i8.c();
        } catch (RemoteException e3) {
            U2.j.g("", e3);
        }
        if (c5 != null) {
            drawable = (Drawable) BinderC2361b.t1(c5);
            this.f9867b = drawable;
            uri = this.f9866a.b();
            this.f9868c = uri;
            double d5 = this.f9866a.d();
            this.f9869d = d5;
            int i = -1;
            int i5 = this.f9866a.j();
            this.f9870e = i5;
            i = this.f9866a.i();
            this.f = i;
        }
        drawable = null;
        this.f9867b = drawable;
        uri = this.f9866a.b();
        this.f9868c = uri;
        double d52 = this.f9866a.d();
        this.f9869d = d52;
        int i6 = -1;
        int i52 = this.f9866a.j();
        this.f9870e = i52;
        i6 = this.f9866a.i();
        this.f = i6;
    }
}
