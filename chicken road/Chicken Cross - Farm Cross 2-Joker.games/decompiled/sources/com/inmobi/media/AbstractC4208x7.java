package com.inmobi.media;

import android.content.pm.PackageManager;
import android.os.Build;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4208x7 {
    public static long a(PackageManager pm, String packageName) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(Long.valueOf(pm.getPackageInfo(packageName, 0).firstInstallTime));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = 0L;
        }
        return ((Number) m8079constructorimpl).longValue();
    }

    public static String b(PackageManager pm, String packageName) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(Build.VERSION.SDK_INT >= 30 ? pm.getInstallSourceInfo(packageName).getInstallingPackageName() : pm.getInstallerPackageName(packageName));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        return (String) m8079constructorimpl;
    }

    public static boolean a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readLine = bufferedReader.readLine();
                String obj = readLine != null ? StringsKt.trim((CharSequence) readLine).toString() : null;
                CloseableKt.closeFinally(bufferedReader, null);
                return !Intrinsics.areEqual(obj, "1");
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(String str, List list) {
        boolean z;
        try {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File(str)), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String next = it.next();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            z = true;
                            if (StringsKt.contains((CharSequence) next, (CharSequence) ("/" + str2), true) || StringsKt.contains((CharSequence) next, (CharSequence) (str2 + ".so"), true)) {
                                break loop0;
                            }
                        }
                    }
                }
                CloseableKt.closeFinally(bufferedReader, null);
                return z;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        String str2;
        boolean z;
        String substringAfter$default;
        String obj;
        Integer intOrNull;
        try {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(new File(str)), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    str2 = it.next();
                    if (StringsKt.startsWith$default(str2, "TracerPid:", false, 2, (Object) null)) {
                        break;
                    }
                }
                String str3 = str2;
                if (str3 != null && (substringAfter$default = StringsKt.substringAfter$default(str3, ServerSentEventKt.COLON, (String) null, 2, (Object) null)) != null && (obj = StringsKt.trim((CharSequence) substringAfter$default).toString()) != null && (intOrNull = StringsKt.toIntOrNull(obj)) != null) {
                    if (intOrNull.intValue() != 0) {
                        z = true;
                        CloseableKt.closeFinally(bufferedReader, null);
                        return z;
                    }
                }
                z = false;
                CloseableKt.closeFinally(bufferedReader, null);
                return z;
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
