package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638u6 extends PushbackInputStream implements AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0905dr f15794k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638u6(C0905dr c0905dr, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f15794k = c0905dr;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        D3.l.m((D3.l) this.f15794k.f13188n);
        super.close();
    }
}
