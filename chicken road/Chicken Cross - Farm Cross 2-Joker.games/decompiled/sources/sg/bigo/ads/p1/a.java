package sg.bigo.ads.p1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.P.c;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.s1.b;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f13237a;
    public final RandomAccessFile b;
    public final C5115b c;

    public a(C5115b c5115b) {
        try {
            this.c = c5115b;
            File file = new File(c5115b.a());
            this.f13237a = file;
            if (!file.exists()) {
                file = new File(file.getParentFile(), file.getName() + ".tmp");
            }
            this.f13237a = file;
            this.b = new RandomAccessFile(file, "r");
        } catch (IOException e) {
            AbstractC5496a.a("ProxyCache", "Error using file " + this.f13237a + " as disc cache, error message is : " + e.toString());
        }
    }

    public final synchronized long a() {
        long j;
        try {
            j = this.b.length();
        } catch (IOException e) {
            b.a(3005, 10112, e.toString(), (c) null);
            AbstractC5496a.a("ProxyCache", "Error reading length of file " + this.f13237a + ", error message is : " + e.toString());
            j = 0;
        }
        return j;
    }

    public final synchronized void b() {
        try {
            this.b.close();
        } catch (IOException e) {
            AbstractC5496a.a("ProxyCache", "Error closing file " + this.f13237a + ", error message is : " + e.toString());
        }
    }

    public final synchronized int a(byte[] bArr, long j) {
        int i;
        i = 0;
        try {
            this.b.seek(j);
            i = this.b.read(bArr, 0, 8192);
        } catch (IOException e) {
            AbstractC5496a.a("ProxyCache", "Error reading 8192 bytes with offset " + j + " from file[" + a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e.toString());
        }
        return i;
    }
}
