package sg.bigo.ads.f0;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public String f12790a = "";
    public boolean b = false;
    public int c = 0;
    public boolean d = false;

    public abstract String a();

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        Throwable th2;
        File file = new File(b(context) + File.separator + b());
        BufferedReader bufferedReader2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        String sb2 = sb.toString();
                        try {
                            bufferedReader.close();
                        } catch (Exception unused) {
                        }
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                        return sb2;
                    } catch (Exception e2) {
                        e = e2;
                        AbstractC5496a.a(d(), "get JS from file error: " + e.getMessage());
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    bufferedReader2 = bufferedReader;
                    th2 = th4;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (fileInputStream == null) {
                        throw th2;
                    }
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Exception unused6) {
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
            } catch (Throwable th5) {
                th2 = th5;
                if (bufferedReader2 != null) {
                }
                if (fileInputStream == null) {
                }
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
            bufferedReader = null;
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileInputStream = null;
            Throwable th42 = th;
            bufferedReader2 = bufferedReader;
            th2 = th42;
            if (bufferedReader2 != null) {
            }
            if (fileInputStream == null) {
            }
        }
    }

    public abstract boolean a(String str);

    public abstract String b();

    public abstract String b(Context context);

    public abstract void b(String str);

    public abstract String c();

    public final void c(Context context) {
        if (this.b) {
            return;
        }
        int i = this.c;
        if (i < 2) {
            this.c = i + 1;
            a(a(), context);
            return;
        }
        AbstractC5496a.b(d(), "the retry times has reached the limit");
        if (this.d) {
            return;
        }
        this.d = true;
        if (TextUtils.isEmpty(c())) {
            return;
        }
        a(c(), context);
    }

    public abstract String d();

    public final void a(String str, Context context) {
        int i;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(sg.bigo.ads.G0.a.f12309a.incrementAndGet(), new sg.bigo.ads.B0.d(str), context);
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.g;
            z = jVar.a(12);
        } else {
            i = 5;
            z = false;
        }
        aVar.c = AbstractRunnableC5522h.a("CreativeNet", i, z);
        AbstractC5507g.a(aVar, new k(this, context, str));
    }

    public void a(Context context, String str, String str2) {
        File file = new File(b(context));
        if (file.exists() || file.mkdir()) {
            try {
                FileWriter fileWriter = new FileWriter(new File(file, b()));
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
                b(str2);
            } catch (Exception e) {
                AbstractC5496a.a(d(), "write JS file error: " + e.getMessage());
            }
        }
    }
}
