package u2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: u2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1622B extends C1637n {

    /* renamed from: c, reason: collision with root package name */
    public final int f16708c;

    public C1622B() {
        super(2008);
        this.f16708c = 1;
    }

    public static int a(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static C1622B b(IOException iOException, int i7) {
        String message = iOException.getMessage();
        int i8 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Y4.D.a0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i8 == 2007 ? new C1621A("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007) : new C1622B(iOException, i8, i7);
    }

    public C1622B(String str, int i7) {
        super(str, a(i7, 1));
        this.f16708c = 1;
    }

    public C1622B(IOException iOException, int i7, int i8) {
        super(iOException, a(i7, i8));
        this.f16708c = i8;
    }

    public C1622B(String str, IOException iOException, int i7) {
        super(str, iOException, a(i7, 1));
        this.f16708c = 1;
    }
}
