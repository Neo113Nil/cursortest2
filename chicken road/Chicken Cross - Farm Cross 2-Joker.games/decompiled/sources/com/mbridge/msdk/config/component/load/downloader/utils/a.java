package com.mbridge.msdk.config.component.load.downloader.utils;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;

/* compiled from: Objects.java */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: Objects.java */
    /* renamed from: com.mbridge.msdk.config.component.load.downloader.utils.a$a, reason: collision with other inner class name */
    class C1360a implements FileFilter {
        C1360a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.exists();
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        boolean exists = file.exists();
        return !exists ? a(file) : exists;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static void a(com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void a(a0 a0Var) {
        if (a0Var == null) {
            return;
        }
        try {
            if (a0Var.d() != null) {
                a0Var.d().close();
            }
            a0Var.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    public static void a(b0 b0Var) {
        if (b0Var == null) {
            return;
        }
        try {
            b0Var.close();
        } catch (Exception e) {
            q0.a("closeStream", e.getLocalizedMessage());
        }
    }

    private static boolean a(File file) {
        File[] fileArr;
        try {
            fileArr = file.getParentFile().listFiles(new C1360a());
        } catch (Exception e) {
            q0.a("doubleCheckExists", e.getLocalizedMessage());
            fileArr = null;
        }
        return fileArr != null && file.length() > 0;
    }

    public static boolean a(Object obj) {
        return !b(obj);
    }
}
