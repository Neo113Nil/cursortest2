package sg.bigo.ads.k1;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.K0.C4966x;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x0.C5504d;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class M extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13019a;
    public final J b;

    public M(Context context, J j) {
        this.f13019a = context.getApplicationContext();
        this.b = j;
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
            AbstractC5496a.a("MraidBridge", "Unable to close stream. Ignoring.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.FileOutputStream, java.io.OutputStream] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        Throwable th;
        Boolean bool;
        C5504d a2;
        sg.bigo.ads.C0.c cVar;
        InputStream inputStream;
        File file;
        ?? fileOutputStream;
        String[] strArr = (String[]) objArr;
        if (strArr == null || strArr.length == 0 || strArr[0] == null) {
            return Boolean.FALSE;
        }
        File file2 = new File(Environment.getExternalStorageDirectory(), "Pictures");
        file2.mkdirs();
        String str = strArr[0];
        BufferedInputStream bufferedInputStream3 = null;
        try {
            sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(new sg.bigo.ads.B0.d(str), this.f13019a);
            aVar.c = AbstractRunnableC5522h.b();
            a2 = AbstractC5507g.a(aVar);
            cVar = a2.f13382a;
        } catch (Exception unused) {
            bufferedInputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
            bufferedInputStream2 = bufferedInputStream3;
            bufferedInputStream3 = bufferedInputStream;
            th = th;
            a(bufferedInputStream2);
            a(bufferedInputStream3);
            throw th;
        }
        if (cVar != null && (inputStream = ((sg.bigo.ads.C0.a) cVar).b) != null) {
            bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                try {
                    try {
                        file = new File(file2, a(str, ((sg.bigo.ads.C0.a) a2.f13382a).c));
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                a(bufferedInputStream2);
                a(bufferedInputStream3);
                throw th;
            }
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                N n = new N(file.toString());
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.f13019a, n);
                n.b = mediaScannerConnection;
                mediaScannerConnection.connect();
                bufferedInputStream3 = fileOutputStream;
                bool = Boolean.TRUE;
            } catch (Exception unused3) {
                bufferedInputStream3 = fileOutputStream;
                try {
                    bool = Boolean.FALSE;
                    a(bufferedInputStream2);
                    a(bufferedInputStream3);
                    return bool;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream = bufferedInputStream3;
                    bufferedInputStream3 = bufferedInputStream2;
                    bufferedInputStream2 = bufferedInputStream3;
                    bufferedInputStream3 = bufferedInputStream;
                    th = th;
                    a(bufferedInputStream2);
                    a(bufferedInputStream3);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedInputStream3 = fileOutputStream;
                a(bufferedInputStream2);
                a(bufferedInputStream3);
                throw th;
            }
            a(bufferedInputStream2);
            a(bufferedInputStream3);
            return bool;
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            this.b.getClass();
            return;
        }
        J j = this.b;
        Toast.makeText(j.f13016a, "Image failed to download.", 0).show();
        AbstractC5496a.a("MraidBridge", "Error downloading and saving image file.");
        C5266g c5266g = j.b;
        c5266g.b.a(c5266g.f13036a, new C5272m("Error downloading and saving image file.").getMessage());
    }

    public static String a(String str, C4966x c4966x) {
        if (c4966x == null) {
            return null;
        }
        String name = new File(String.valueOf(str.hashCode())).getName();
        List list = (List) c4966x.f12365a.get("content-type".toLowerCase());
        if (list == null || list.isEmpty()) {
            return name;
        }
        if (list.get(0) == null) {
            return name;
        }
        for (String str2 : ((String) list.get(0)).split(";")) {
            if (str2.contains("image/")) {
                String str3 = "." + str2.split("/")[1];
                return !name.endsWith(str3) ? name + str3 : name;
            }
        }
        return name;
    }
}
