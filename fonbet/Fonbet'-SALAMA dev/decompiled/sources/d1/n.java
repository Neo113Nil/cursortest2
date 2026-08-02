package d1;

import android.content.Context;
import android.util.Log;
import android.view.KeyCharacterMap;
import java.io.InputStream;
import java.io.OutputStream;
import p3.InterfaceC1536b;
import w1.C1738q0;
import w1.D;
import w1.E;
import w1.Y0;

/* loaded from: classes.dex */
public final class n implements InterfaceC1536b, Y0 {

    /* renamed from: b, reason: collision with root package name */
    public static n f12364b;

    /* renamed from: a, reason: collision with root package name */
    public int f12365a;

    public /* synthetic */ n(int i7) {
        this.f12365a = i7;
    }

    public static synchronized n d() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f12364b == null) {
                    f12364b = new n(3);
                }
                nVar = f12364b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public Character a(int i7) {
        char c3 = (char) i7;
        if ((Integer.MIN_VALUE & i7) != 0) {
            int i8 = i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            int i9 = this.f12365a;
            if (i9 != 0) {
                this.f12365a = KeyCharacterMap.getDeadChar(i9, i8);
            } else {
                this.f12365a = i8;
            }
        } else {
            int i10 = this.f12365a;
            if (i10 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f12365a = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f12365a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f12365a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f12365a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // p3.InterfaceC1536b
    public int f(Context context, String str, boolean z4) {
        return 0;
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        E e7 = new E(inputStream, 1);
        C1738q0 c1738q0 = new C1738q0();
        c1738q0.f17831a = null;
        c1738q0.f17832b = null;
        int readShort = this.f12365a == 1 ? e7.readShort() : e7.readInt();
        if (readShort == 0) {
            return null;
        }
        byte[] bArr = new byte[readShort];
        c1738q0.f17832b = bArr;
        e7.readFully(bArr);
        e7.readUnsignedShort();
        return c1738q0;
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f12365a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // p3.InterfaceC1536b
    public int k(Context context, String str) {
        return this.f12365a;
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        C1738q0 c1738q0 = (C1738q0) obj;
        if (c1738q0 == null) {
            return;
        }
        D d7 = new D(outputStream, 1);
        int length = c1738q0.f17832b.length;
        if (this.f12365a == 1) {
            d7.writeShort(length);
        } else {
            d7.writeInt(length);
        }
        d7.write(c1738q0.f17832b);
        d7.writeShort(0);
        d7.flush();
    }

    public n() {
        this.f12365a = 0;
    }

    public n(int i7, int i8) {
        p3.f.O("Generator ID %d contains more than %d reserved bits", (i7 & 1) == i7, Integer.valueOf(i7), 1);
        p3.f.O("Cannot supply target ID from different generator ID", (i8 & 1) == i7, new Object[0]);
        this.f12365a = i8;
    }
}
