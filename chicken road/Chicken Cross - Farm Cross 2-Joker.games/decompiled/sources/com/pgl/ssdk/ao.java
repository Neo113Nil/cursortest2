package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes7.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f11618a;
    private int b;
    private Object[] c;

    public ao(Context context, int i, Object[] objArr) {
        this.f11618a = context;
        this.b = i;
        this.c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.b == 222) {
                ak.a(this.f11618a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.b, this.f11618a, this.c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f11618a, this.b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
