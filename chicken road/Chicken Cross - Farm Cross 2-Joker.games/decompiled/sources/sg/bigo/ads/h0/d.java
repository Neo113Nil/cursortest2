package sg.bigo.ads.h0;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.K0.AbstractC4965w;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.R0.j;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x0.C5504d;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C5228a f12952a;
    public InputStream b;
    public final File c;
    public final Context d;

    public d(Context context, C5228a c5228a) {
        this.d = context;
        this.f12952a = c5228a;
        C5115b c5115b = c5228a.b;
        this.c = new File(c5115b.c, c5115b.d + ".tmp");
    }

    public final void a(String str) {
        AbstractC5496a.a(IDownloadTask.TAG, str + " , " + this.f12952a.f12950a + " has a error ! " + this.f12952a.b.toString());
        C5228a c5228a = this.f12952a;
        c5228a.e = str;
        c5228a.d = 7;
        e.b.a(c5228a.f12950a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:13|(2:15|(19:19|(3:22|23|24)|169|(1:171)|26|(1:28)(1:168)|29|(3:31|(2:34|35)|33)|38|(4:40|(1:42)(1:149)|43|(3:136|(1:148)(1:140)|(2:142|143)(2:144|(2:146|147)))(3:47|48|(2:50|51)(11:52|53|54|55|56|(2:57|(1:128)(2:59|(1:62)(1:61)))|116|(2:118|(1:126)(2:122|(1:124)))(1:127)|125|73|74)))|150|151|152|(1:154)(1:166)|155|(2:(2:158|(1:160))|162)|(2:164|165)|48|(0)(0)))|173|26|(0)(0)|29|(0)|38|(0)|150|151|152|(0)(0)|155|(0)|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f9, code lost:
    
        if (sg.bigo.ads.K0.I.a((java.lang.CharSequence) "") != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0305, code lost:
    
        if (r19.f12952a.b.g <= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0315, code lost:
    
        if (r19.f12952a.d == 4) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0318, code lost:
    
        r2 = "the download stream has not been read completely.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x031d, code lost:
    
        a("Failed to download due to: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031a, code lost:
    
        r2 = "the download file has a invalid size.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x031c, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0324, code lost:
    
        sg.bigo.ads.K0.AbstractC4965w.a(r10);
        sg.bigo.ads.K0.AbstractC4965w.a((java.io.Closeable) r9);
        sg.bigo.ads.K0.AbstractC4965w.a((java.io.Closeable) r19.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0247, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0248, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029d, code lost:
    
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020d, code lost:
    
        if (r10 <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
    
        if (r19.c.length() != r10) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021d, code lost:
    
        if (r19.f12952a.d != 4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021f, code lost:
    
        r0 = r19.c;
        r8 = r19.f12952a.b;
        r0.renameTo(new java.io.File(r8.c, r8.d));
        r0 = r19.f12952a;
        r0.d = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0236, code lost:
    
        sg.bigo.ads.h0.e.b.a(r0.f12950a);
        r0 = r19.f12952a;
        r6 = r0.f12950a;
        r0.b.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a7, code lost:
    
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ab, code lost:
    
        if (r6 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b1, code lost:
    
        if (sg.bigo.ads.K0.I.a((java.lang.CharSequence) r0) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02bd, code lost:
    
        if (r19.f12952a.b.g <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ce, code lost:
    
        if (r19.f12952a.d == 4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d1, code lost:
    
        r2 = "the download stream has not been read completely.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d6, code lost:
    
        a("Failed to download due to: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d3, code lost:
    
        r2 = "the download file has a invalid size.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d5, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e6, code lost:
    
        sg.bigo.ads.K0.AbstractC4965w.a(r10);
        sg.bigo.ads.K0.AbstractC4965w.a((java.io.Closeable) r9);
        sg.bigo.ads.K0.AbstractC4965w.a((java.io.Closeable) r19.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f3, code lost:
    
        if (r6 == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0190 A[Catch: IOException -> 0x01a6, TryCatch #4 {IOException -> 0x01a6, blocks: (B:152:0x0186, B:154:0x0190, B:155:0x0196, B:158:0x019e), top: B:151:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        sg.bigo.ads.C0.b bVar;
        long j;
        File file;
        boolean z2;
        RandomAccessFile randomAccessFile;
        String str = "the download task error and download state is not loading.";
        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(sg.bigo.ads.G0.a.f12309a.incrementAndGet(), new sg.bigo.ads.B0.d(this.f12952a.b.b), this.f12952a.b.s, this.d);
        j jVar = AbstractRunnableC5522h.e;
        boolean z3 = false;
        if (jVar != null) {
            i = jVar.g;
            z = jVar.a(12);
        } else {
            i = 5;
            z = false;
        }
        aVar.c = AbstractRunnableC5522h.a("CreativeNet", i, z);
        aVar.a("Range", "bytes=" + this.f12952a.b.g + "-");
        C5228a c5228a = this.f12952a;
        String str2 = c5228a.f12950a;
        c5228a.b.toString();
        C5504d a2 = AbstractC5507g.a(aVar);
        sg.bigo.ads.C0.c cVar = a2.f13382a;
        if (cVar == null) {
            a(a2.b != null ? "Failed to request url. Error code: " + a2.b.f13385a + ", error msg: " + a2.b.b : "Failed to request url.");
            return;
        }
        String a3 = ((sg.bigo.ads.C0.a) cVar).a(HttpHeaders.CONTENT_RANGE);
        if (!I.a((CharSequence) a3)) {
            int indexOf = a3.indexOf(ServerSentEventKt.SPACE);
            int indexOf2 = a3.indexOf("-");
            int indexOf3 = a3.indexOf("/");
            if (indexOf >= 0 && indexOf3 >= 0 && indexOf < indexOf3) {
                bVar = new sg.bigo.ads.C0.b();
                if (indexOf2 > indexOf && indexOf2 < indexOf3) {
                    try {
                        bVar.f12245a = Long.parseLong(a3.substring(indexOf + 1, indexOf2));
                        Long.parseLong(a3.substring(indexOf2 + 1, indexOf3));
                    } catch (Exception unused) {
                    }
                }
                String substring = a3.substring(indexOf3 + 1);
                if (!"*".equals(substring)) {
                    bVar.b = Long.parseLong(substring);
                }
                j = bVar == null ? bVar.b : 0L;
                if (j <= 0) {
                    String a4 = ((sg.bigo.ads.C0.a) a2.f13382a).a(HttpHeaders.CONTENT_LENGTH);
                    if (!I.a((CharSequence) a4)) {
                        try {
                            j = Long.parseLong(a4);
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    j = -1;
                }
                this.f12952a.b.i = j;
                sg.bigo.ads.C0.a aVar2 = (sg.bigo.ads.C0.a) a2.f13382a;
                this.b = aVar2.b;
                this.f12952a.b.r = aVar2.a("Content-Type");
                if (this.c.exists()) {
                    C5228a c5228a2 = this.f12952a;
                    C5115b c5115b = c5228a2.b;
                    long j2 = c5115b.g;
                    long j3 = bVar != null ? bVar.f12245a : 0L;
                    if (j2 <= 0 || j2 != j3) {
                        String str3 = c5228a2.f12950a;
                        c5115b.toString();
                        File file2 = this.c;
                        if (!((file2 == null || !file2.exists()) ? true : file2.delete())) {
                            a("Failed to delete temp file.");
                            return;
                        }
                        this.f12952a.b.g = 0L;
                        if (j3 > 0) {
                            AbstractC4965w.a((Closeable) this.b);
                            this.b = null;
                            run();
                            return;
                        }
                    } else {
                        c5115b.q = true;
                        C5228a c5228a3 = this.f12952a;
                        c5228a3.d = 3;
                        e eVar = e.b;
                        eVar.a(c5228a3.f12950a);
                        C5228a c5228a4 = this.f12952a;
                        String str4 = c5228a4.f12950a;
                        c5228a4.b.toString();
                        if (this.b == null) {
                            a("downloadStream is null");
                            return;
                        }
                        C5228a c5228a5 = this.f12952a;
                        c5228a5.d = 4;
                        eVar.a(c5228a5.f12950a);
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.b);
                        byte[] bArr = new byte[1048576];
                        try {
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.c, "rwd");
                            try {
                                long j4 = this.f12952a.b.g;
                                randomAccessFile2.seek(j4);
                                String str5 = this.f12952a.f12950a;
                                while (true) {
                                    if (this.f12952a.d != 4) {
                                        break;
                                    }
                                    int read = bufferedInputStream.read(bArr, 0, 1048576);
                                    if (read == -1) {
                                        break;
                                    }
                                    randomAccessFile2.write(bArr, 0, read);
                                    j4 += read;
                                    C5228a c5228a6 = this.f12952a;
                                    c5228a6.b.g = j4;
                                    e.b.a(c5228a6.f12950a);
                                }
                                if (!I.a((CharSequence) "")) {
                                    str = "";
                                } else if (this.f12952a.b.g <= 0 || this.c.length() <= 0) {
                                    str = "the download file has a invalid size.";
                                } else if (this.f12952a.d == 4) {
                                    str = "the download stream has not been read completely.";
                                }
                                a("Failed to download due to: ".concat(str));
                                AbstractC4965w.a(randomAccessFile2);
                                AbstractC4965w.a((Closeable) bufferedInputStream);
                                AbstractC4965w.a((Closeable) this.b);
                                return;
                            } catch (Exception e) {
                                e = e;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            randomAccessFile = null;
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = null;
                        }
                    }
                }
                file = this.c;
                File parentFile = file.getParentFile();
                z2 = parentFile.exists() ? parentFile.mkdirs() : true;
                if (!file.exists()) {
                    if (z2) {
                        if (file.createNewFile()) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    a("Failed to create temp file.");
                    return;
                }
                C5228a c5228a32 = this.f12952a;
                c5228a32.d = 3;
                e eVar2 = e.b;
                eVar2.a(c5228a32.f12950a);
                C5228a c5228a42 = this.f12952a;
                String str42 = c5228a42.f12950a;
                c5228a42.b.toString();
                if (this.b == null) {
                }
            }
        }
        bVar = null;
        if (bVar == null) {
        }
        if (j <= 0) {
        }
        this.f12952a.b.i = j;
        sg.bigo.ads.C0.a aVar22 = (sg.bigo.ads.C0.a) a2.f13382a;
        this.b = aVar22.b;
        this.f12952a.b.r = aVar22.a("Content-Type");
        if (this.c.exists()) {
        }
        file = this.c;
        File parentFile2 = file.getParentFile();
        if (parentFile2.exists()) {
        }
        if (!file.exists()) {
        }
        if (!z2) {
        }
        C5228a c5228a322 = this.f12952a;
        c5228a322.d = 3;
        e eVar22 = e.b;
        eVar22.a(c5228a322.f12950a);
        C5228a c5228a422 = this.f12952a;
        String str422 = c5228a422.f12950a;
        c5228a422.b.toString();
        if (this.b == null) {
        }
    }
}
