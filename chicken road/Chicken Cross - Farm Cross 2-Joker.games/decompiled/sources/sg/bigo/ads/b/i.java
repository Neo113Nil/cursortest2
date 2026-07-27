package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5046l;

/* loaded from: classes3.dex */
public final class i implements g {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005e, code lost:
    
        if (r1 == null) goto L27;
     */
    @Override // sg.bigo.ads.b.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        BufferedReader bufferedReader;
        String readLine;
        String str;
        BufferedReader bufferedReader2;
        String str2;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = {AbstractC5015a.K, AbstractC5015a.J};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            String b = AbstractC5046l.b(str3);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put(str3, b);
            }
        }
        File file = new File(AbstractC5015a.c0);
        BufferedReader bufferedReader3 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Exception unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            str = AbstractC5015a.J;
                        }
                    } catch (Exception unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader3 = bufferedReader;
                        if (bufferedReader3 != null) {
                            try {
                                bufferedReader3.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    break;
                } while (!readLine.contains(str));
                break;
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            jSONObject.put(str, readLine);
        }
        try {
            bufferedReader2 = new BufferedReader(new FileReader(new File(AbstractC5015a.d0)));
            try {
                str2 = bufferedReader2.readLine();
            } catch (Exception unused5) {
                str2 = "";
            } catch (Throwable th3) {
                th = th3;
                bufferedReader3 = bufferedReader2;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            bufferedReader2 = null;
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            bufferedReader2.close();
        } catch (IOException unused8) {
        }
        if (!TextUtils.isEmpty(str2) && str2.contains(AbstractC5015a.m0)) {
            jSONObject.put(AbstractC5015a.J, str2);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.D;
    }
}
