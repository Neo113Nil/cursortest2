package p146u2;

import Y4.D;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class B extends C0955n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16714c;

    public B() {
        super(2008);
        this.f16714c = 1;
    }

    public static int a(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static B b(IOException iOException, int i7) {
        int i8;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else {
            i8 = (message == null || !D.a0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i8 == 2007 ? new A("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new B(iOException, i8, i7);
    }

    public B(String str, int i7) {
        super(str, a(i7, 1));
        this.f16714c = 1;
    }

    public B(IOException iOException, int i7, int i8) {
        super(iOException, a(i7, i8));
        this.f16714c = i8;
    }

    public B(String str, IOException iOException, int i7) {
        super(str, iOException, a(i7, 1));
        this.f16714c = 1;
    }
}
