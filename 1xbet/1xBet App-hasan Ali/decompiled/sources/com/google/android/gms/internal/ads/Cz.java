package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class Cz extends C1806xv {

    /* renamed from: l, reason: collision with root package name */
    public final int f8130l;

    public Cz() {
        this.f8130l = 1;
    }

    public static Cz a(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i5 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0952et.n(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i5 == 2007 ? new C1540rz("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new Cz(i5, i, iOException);
    }

    public Cz(int i, int i5, IOException iOException) {
        super(i == 2000 ? i5 != 1 ? 2000 : 2001 : i, iOException);
        this.f8130l = i5;
    }

    public Cz(int i, int i5, String str) {
        super(str, i == 2000 ? i5 != 1 ? 2000 : 2001 : i);
        this.f8130l = i5;
    }

    public Cz(String str, IOException iOException, int i, int i5) {
        super(str, iOException, i == 2000 ? i5 != 1 ? 2000 : 2001 : i);
        this.f8130l = i5;
    }
}
