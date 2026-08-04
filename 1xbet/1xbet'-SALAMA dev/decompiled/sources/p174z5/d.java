package p174z5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.media.session.t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p028d6.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements q {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static k b(Context context, String[] strArr, String str, t tVar) {
        String[] strArrD = d(context);
        int length = strArrD.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = strArrD[i7];
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
                            String string = sb.toString();
                            tVar.getClass();
                            t.q0("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                k kVar = new k(21, false);
                                kVar.f12447b = zipFile;
                                kVar.f12448c = entry;
                                return kVar;
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
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : d(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
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
    public void onMethodCall(o oVar, r rVar) {
        ((p) rVar).success(null);
    }
}
