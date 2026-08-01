package sg.bigo.ads.s0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4962t;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.AbstractC4965w;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;

/* renamed from: sg.bigo.ads.s0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5469i extends AbstractC5503c {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C5470j d;

    public C5469i(C5470j c5470j, Context context, String str) {
        this.d = c5470j;
        this.b = context;
        this.c = str;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final sg.bigo.ads.C0.c a(sg.bigo.ads.C0.a aVar) {
        return aVar;
    }

    @Override // sg.bigo.ads.x0.AbstractC5503c
    public final void a(sg.bigo.ads.B0.c cVar, C5508h c5508h) {
        this.d.e = false;
        C5470j c5470j = this.d;
        C5470j.a(c5470j, this.b, c5508h.f13385a, c5508h.b, new y(1, null, 0L, null, c5470j.f13291a, this.c, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    @Override // sg.bigo.ads.x0.AbstractC5503c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.B0.c cVar, sg.bigo.ads.C0.c cVar2) {
        FileOutputStream fileOutputStream;
        sg.bigo.ads.C0.a aVar = (sg.bigo.ads.C0.a) cVar2;
        this.d.e = false;
        String a2 = aVar.a("Content-Type");
        this.d.f.getClass();
        if (Build.VERSION.SDK_INT == 28 && "image/webp".equalsIgnoreCase(a2)) {
            C5470j c5470j = this.d;
            C5470j.a(c5470j, this.b, 1303, "Not support parsing webp images in Android P.", new y(1, null, 0L, null, c5470j.f13291a, this.c, a2, null));
            return;
        }
        C5470j c5470j2 = this.d;
        String str = c5470j2.f13291a;
        String str2 = c5470j2.b;
        if (TextUtils.isEmpty(str2)) {
            str2 = String.valueOf(str.hashCode());
        }
        k kVar = this.d.f;
        Context context = this.b;
        kVar.getClass();
        InputStream inputStream = aVar.b;
        sg.bigo.ads.U.c cVar3 = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        if (inputStream != null) {
            String b = kVar.b(context);
            AbstractC4964v.a(b, str2);
            File file = new File(b, str2);
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.flush();
                AbstractC4965w.a((Closeable) inputStream);
                AbstractC4965w.a(fileOutputStream);
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                AbstractC4965w.a((Closeable) inputStream);
                AbstractC4965w.a(fileOutputStream2);
                String path = file.getPath();
                if (!(kVar instanceof v)) {
                }
                if (cVar3 == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream3 = fileOutputStream;
                AbstractC4965w.a((Closeable) inputStream);
                AbstractC4965w.a(fileOutputStream3);
                throw th;
            }
            String path2 = file.getPath();
            cVar3 = !(kVar instanceof v) ? AbstractC4962t.a(path2) : AbstractC4962t.a(path2, context);
        }
        if (cVar3 == null) {
            String str3 = cVar3.b;
            this.d.f.getClass();
            if (I.a((CharSequence) cVar3.b)) {
                cVar3.b = a2;
            }
            cVar3.d = this.c;
            cVar3.e = a2;
            cVar3.f = str3;
            this.d.f.a(this.b, str2, cVar3);
            long a3 = AbstractC4964v.a(2, this.d.f.b(str2, this.b));
            C5470j c5470j3 = this.d;
            Context context2 = this.b;
            Bitmap bitmap = cVar3.f12561a;
            y yVar = new y(1, cVar3.b, a3, cVar3.c, c5470j3.f13291a, this.c, a2, str3);
            synchronized (c5470j3.f.f) {
                c5470j3.f.getClass();
                Iterator it = c5470j3.d.iterator();
                while (it.hasNext()) {
                    c5470j3.f.e.post(new RunnableC5468h((z) it.next(), bitmap, yVar));
                }
                c5470j3.f.f13292a.remove(c5470j3.f13291a);
                c5470j3.f.c(context2);
            }
            this.d.f.a(this.b);
            return;
        }
        C5470j c5470j4 = this.d;
        C5470j.a(c5470j4, this.b, 1304, "Failed to parse image.", new y(1, null, 0L, null, c5470j4.f13291a, this.c, a2, null));
    }
}
