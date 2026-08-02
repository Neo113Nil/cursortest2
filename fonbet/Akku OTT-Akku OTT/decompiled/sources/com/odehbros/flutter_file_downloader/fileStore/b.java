package com.odehbros.flutter_file_downloader.fileStore;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* loaded from: classes4.dex */
public final class b {
    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (!str.endsWith(DomExceptionUtils.SEPARATOR)) {
            str = str.concat(DomExceptionUtils.SEPARATOR);
        }
        return str.startsWith(DomExceptionUtils.SEPARATOR) ? str.replaceFirst(DomExceptionUtils.SEPARATOR, "") : str;
    }
}
