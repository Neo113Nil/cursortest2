package sg.bigo.ads.f0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.f0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5115b {

    /* renamed from: a, reason: collision with root package name */
    public final String f12782a;
    public String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public long g;
    public long h;
    public long i;
    public long n;
    public String r;
    public final boolean s;
    public final i t;
    public int j = 0;
    public int k = 0;
    public long l = 0;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public final C5114a m = new C5114a();

    public C5115b(String str, String str2, String str3, boolean z, boolean z2, boolean z3, i iVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z ? 1 : 0;
        this.f = z3;
        this.s = z2;
        String a2 = a();
        long a3 = AbstractC4964v.a(1, a2);
        this.g = a3 <= 0 ? AbstractC4964v.a(1, a2 + ".tmp") : a3;
        this.f12782a = String.valueOf(str.hashCode());
        this.t = iVar;
        b();
    }

    public final String a() {
        return this.c + File.separator + this.d;
    }

    public final boolean b() {
        i iVar = this.t;
        return iVar != null && iVar.f12788a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|(3:6|7|8)|(2:9|10)|(2:12|(4:14|15|16|(1:18)(1:19)))|23|15|16|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        FileInputStream fileInputStream;
        Throwable th;
        boolean z;
        String str;
        if (this.b.endsWith(".mp4") && this.m.f12781a == -1) {
            File file = new File(a() + ".tmp");
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
            try {
                byte[] bArr = new byte[1024];
                fileInputStream.read(bArr);
                str = new String(bArr);
            } catch (Exception e2) {
                e = e2;
                fileInputStream2 = fileInputStream;
                try {
                    AbstractC5496a.a("FileUtils", "read file " + file.getPath() + " failed" + e.getMessage());
                    if (fileInputStream2 != null) {
                        fileInputStream = fileInputStream2;
                        z = false;
                        fileInputStream.close();
                        if (z) {
                        }
                        if (this.m.f12781a == 1) {
                        }
                    } else {
                        z = false;
                        if (z) {
                        }
                        if (this.m.f12781a == 1) {
                        }
                    }
                } catch (Throwable th3) {
                    fileInputStream = fileInputStream2;
                    th = th3;
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                }
                throw th;
            }
            if (str.contains("ftyp")) {
                if (str.contains("moov")) {
                    z = true;
                    fileInputStream.close();
                    if (z) {
                        this.m.f12781a = 0;
                    } else {
                        this.m.f12781a = 1;
                    }
                }
            }
            z = false;
            fileInputStream.close();
            if (z) {
            }
        }
        return this.m.f12781a == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C5115b.class) {
            return false;
        }
        C5115b c5115b = (C5115b) obj;
        return this.b.equals(c5115b.b) && this.d.equals(c5115b.d) && this.c.equals(c5115b.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" url = ");
        sb.append(this.b).append(", fileName = ");
        sb.append(this.d).append(", filePath = ");
        sb.append(this.c).append(", downloadCount = ");
        sb.append(this.k).append(", totalSize = ");
        sb.append(this.i).append(", loadedSize = ");
        sb.append(this.g).append(", mState = ");
        sb.append(this.j).append(", mLastDownloadEndTime = ");
        sb.append(this.l).append(", mExt = ");
        C5114a c5114a = this.m;
        c5114a.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("support_pd_flag", Integer.valueOf(c5114a.f12781a));
        } catch (JSONException unused) {
        }
        sb.append(jSONObject.toString()).append(", contentType = ");
        sb.append(this.r);
        sb.append(" isSupportFillTime = ").append(b());
        StringBuilder append = sb.append(" adFillTime = ");
        i iVar = this.t;
        append.append(iVar != null ? iVar.c : 0);
        StringBuilder append2 = sb.append(" adCheckProcessTime = ");
        i iVar2 = this.t;
        append2.append(iVar2 != null ? iVar2.d : 5);
        StringBuilder append3 = sb.append(" adCheckMinProcess = ");
        i iVar3 = this.t;
        append3.append(iVar3 != null ? iVar3.e : 20);
        return sb.toString();
    }
}
