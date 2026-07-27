package sg.bigo.ads.U;

import android.content.Context;
import android.os.Parcel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import sg.bigo.ads.K0.AbstractC4965w;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12563a;
    public final d d = new d(this);
    public boolean b = false;
    public boolean c = false;

    public e(Context context) {
        this.f12563a = context;
    }

    public abstract String a();

    public final synchronized void a(Context context) {
        Throwable th;
        ByteArrayInputStream byteArrayInputStream;
        File file;
        byte[] a2;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                try {
                    file = new File(q.a(context), a());
                    this.c = file.exists();
                    a2 = AbstractC4965w.a(file);
                } catch (Exception unused) {
                }
            } catch (IOException unused2) {
                AbstractC5496a.b(b(), "close data input stream failed");
            }
            if (a2 == null) {
                b(context);
                return;
            }
            byte[] a3 = F.a(a2, F.b, null);
            if (a3 == null) {
                AbstractC5496a.a(b(), "data decrypt failed length=" + a2.length);
                file.delete();
                b(context);
                return;
            }
            byteArrayInputStream = new ByteArrayInputStream(a3);
            try {
                int available = byteArrayInputStream.available();
                byte[] bArr = new byte[available];
                byteArrayInputStream.read(bArr);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, available);
                obtain.setDataPosition(0);
                a(obtain);
                byteArrayInputStream.close();
            } catch (Exception unused3) {
                byteArrayInputStream2 = byteArrayInputStream;
                AbstractC5496a.b(b(), "DataFile load failed");
                if (byteArrayInputStream2 != null) {
                    byteArrayInputStream2.close();
                }
                b(context);
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused4) {
                        AbstractC5496a.b(b(), "close data input stream failed");
                    }
                }
                b(context);
                throw th;
            }
            b(context);
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
        }
    }

    public abstract String b();

    public void b(Context context) {
        this.b = true;
        toString();
    }

    public final synchronized void c(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        Parcel obtain;
        byte[] a2;
        AbstractC5446j.a(this.d);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                obtain = Parcel.obtain();
                b(obtain);
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        try {
            byteArrayOutputStream.write(obtain.marshall());
            byteArrayOutputStream.flush();
            a2 = F.a(byteArrayOutputStream.toByteArray(), F.b);
        } catch (Exception unused2) {
            byteArrayOutputStream2 = byteArrayOutputStream;
            AbstractC5496a.b(b(), "data save failed");
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused3) {
                    AbstractC5496a.b(b(), "close output stream failed");
                }
            }
            this.c = true;
            this.b = true;
            toString();
            return;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                    AbstractC5496a.b(b(), "close output stream failed");
                }
            }
            this.c = true;
            this.b = true;
            toString();
            throw th;
        }
        if (a2 == null) {
            AbstractC5496a.a(b(), "## data encrypt failed.");
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused5) {
                AbstractC5496a.b(b(), "close output stream failed");
            }
            this.c = true;
            this.b = true;
            toString();
            return;
        }
        AbstractC4965w.a(new File(q.a(context), a()), a2);
        toString();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused6) {
            AbstractC5496a.b(b(), "close output stream failed");
        }
        this.c = true;
        this.b = true;
        toString();
        return;
    }

    public final void a(long j) {
        AbstractC5446j.a(this.d);
        if (j <= 0) {
            AbstractC5446j.a(1, null, this.d, 0L);
        } else {
            AbstractC5446j.a(1, null, this.d, j);
        }
    }
}
