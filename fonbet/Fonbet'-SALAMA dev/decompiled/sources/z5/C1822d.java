package z5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.media.session.t;
import d6.C0977k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1822d implements A5.q {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0977k b(Context context, String[] strArr, String str, t tVar) {
        String[] d7 = d(context);
        int length = d7.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = d7[i7];
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i8 = i9;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String sb2 = sb.toString();
                            tVar.getClass();
                            t.q0("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                C0977k c0977k = new C0977k(21, false);
                                c0977k.f12441b = zipFile;
                                c0977k.f12442c = entry;
                                return c0977k;
                            }
                        }
                        i10 = i11;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i7++;
        }
    }

    public static String[] c(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : d(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        ((A5.p) rVar).success(null);
    }
}
