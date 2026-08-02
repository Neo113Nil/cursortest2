package com.odehbros.flutter_file_downloader.fileStore;

import android.support.v4.media.session.f;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a {
    public static String a(String str, String str2, String str3) throws IOException {
        File file;
        String b = f.b(str, DomExceptionUtils.SEPARATOR, str2);
        String[] split = str2.split("\\.");
        String str4 = split[split.length - 1];
        String replaceAll = str2.replaceAll("." + str3, "").replaceAll("." + str4, "");
        File file2 = new File(str);
        if (!(file2.exists() ? true : file2.mkdirs())) {
            return null;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = str4;
        }
        TextUtils.isEmpty(str4);
        int i = 0;
        while (true) {
            file = new File(b);
            if (!file.exists()) {
                break;
            }
            i++;
            Locale locale = Locale.ENGLISH;
            String replaceAll2 = replaceAll.replaceAll("." + str3, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(DomExceptionUtils.SEPARATOR);
            sb.append(replaceAll2);
            sb.append("-");
            sb.append(i);
            b = androidx.concurrent.futures.a.a(sb, ".", str3);
        }
        if (file.createNewFile()) {
            return b;
        }
        return null;
    }
}
