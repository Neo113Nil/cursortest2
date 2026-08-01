package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes7.dex */
public abstract class q {
    public static String a(String stringToConvert) {
        Intrinsics.checkNotNullParameter(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                CloseableKt.closeFinally(gZIPOutputStream, null);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                return encodeToString;
            } finally {
            }
        } finally {
        }
    }
}
