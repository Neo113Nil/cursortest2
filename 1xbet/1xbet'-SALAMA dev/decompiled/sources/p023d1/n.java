package p023d1;

import android.content.Context;
import android.util.Log;
import android.view.KeyCharacterMap;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p113p3.b;
import p155w1.C1029q0;
import p155w1.D;
import p155w1.E;
import p155w1.Y0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements b, Y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n f12370b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12371a;

    public /* synthetic */ n(int i7) {
        this.f12371a = i7;
    }

    public static synchronized n d() {
        try {
            if (f12370b == null) {
                f12370b = new n(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12370b;
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
            int i8 = i7 & f.API_PRIORITY_OTHER;
            int i9 = this.f12371a;
            if (i9 != 0) {
                this.f12371a = KeyCharacterMap.getDeadChar(i9, i8);
            } else {
                this.f12371a = i8;
            }
        } else {
            int i10 = this.f12371a;
            if (i10 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                if (deadChar > 0) {
                    c3 = (char) deadChar;
                }
                this.f12371a = 0;
            }
        }
        return Character.valueOf(c3);
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f12371a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f12371a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f12371a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // p113p3.b
    public int f(Context context, String str, boolean z4) {
        return 0;
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        E e7 = new E(inputStream, 1);
        C1029q0 c1029q0 = new C1029q0();
        c1029q0.f17837a = null;
        c1029q0.f17838b = null;
        int i7 = this.f12371a == 1 ? e7.readShort() : e7.readInt();
        if (i7 == 0) {
            return null;
        }
        byte[] bArr = new byte[i7];
        c1029q0.f17838b = bArr;
        e7.readFully(bArr);
        e7.readUnsignedShort();
        return c1029q0;
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f12371a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // p113p3.b
    public int k(Context context, String str) {
        return this.f12371a;
    }

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) throws IOException {
        C1029q0 c1029q0 = (C1029q0) obj;
        if (c1029q0 == null) {
            return;
        }
        D d7 = new D(outputStream, 1);
        int length = c1029q0.f17838b.length;
        if (this.f12371a == 1) {
            d7.writeShort(length);
        } else {
            d7.writeInt(length);
        }
        d7.write(c1029q0.f17838b);
        d7.writeShort(0);
        d7.flush();
    }

    public n() {
        this.f12371a = 0;
    }

    public n(int i7, int i8) {
        p113p3.f.O("Generator ID %d contains more than %d reserved bits", (i7 & 1) == i7, Integer.valueOf(i7), 1);
        p113p3.f.O("Cannot supply target ID from different generator ID", (i8 & 1) == i7, new Object[0]);
        this.f12371a = i8;
    }
}
