package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4840a;
    public final l8 b;

    public k8(Context context, AtomicReference atomicReference) {
        l8 l8Var = new l8(context.getCacheDir());
        this.b = l8Var;
        this.f4840a = atomicReference;
        try {
            long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(((com.chartboost.sdk.internal.Model.a) atomicReference.get()).p);
            File file = new File(l8Var.f4858a, "templates");
            if (file.exists()) {
                a(file.listFiles(), currentTimeMillis);
                a(l8Var);
            }
        } catch (Exception e) {
            mb.b("Exception while cleaning up templates directory at " + this.b.f.getPath(), e);
            e.printStackTrace();
        }
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public final void b(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.lastModified() < j && !file.delete()) {
                    mb.b("Unable to delete " + file.getPath(), null);
                }
            }
        }
    }

    public File[] c() {
        File b = b();
        if (b != null) {
            return b.listFiles();
        }
        return null;
    }

    public File d() {
        return this.b.i;
    }

    public JSONObject e() {
        String[] list;
        JSONObject jSONObject = new JSONObject();
        try {
            File file = a().f4858a;
            for (String str : ((com.chartboost.sdk.internal.Model.a) this.f4840a.get()).q) {
                if (!str.equals("templates")) {
                    File file2 = new File(file, str);
                    JSONArray jSONArray = new JSONArray();
                    if (file2.exists() && (list = file2.list()) != null) {
                        for (String str2 : list) {
                            if (!str2.equals(".nomedia") && !str2.endsWith(".tmp")) {
                                jSONArray.put(str2);
                            }
                        }
                    }
                    x2.a(jSONObject, str, jSONArray);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            mb.b("getWebViewCacheAssets: " + e, null);
            return jSONObject;
        }
    }

    public void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                int read = randomAccessFile.read();
                randomAccessFile.seek(0L);
                randomAccessFile.write(read);
                randomAccessFile.close();
            } finally {
            }
        } catch (FileNotFoundException e) {
            mb.b("File not found when attempting to touch", e);
        } catch (IOException e2) {
            mb.b("IOException when attempting to touch file", e2);
        }
    }

    public File a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() <= 0) {
            return null;
        }
        return file2;
    }

    public boolean c(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public final void a(File[] fileArr, long j) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (file.isDirectory()) {
                    b(file.listFiles(), j);
                    a(file.listFiles(), file);
                }
            }
        }
    }

    public File b() {
        return this.b.h;
    }

    public long b(File file) {
        long j = 0;
        if (file != null) {
            try {
            } catch (Exception e) {
                mb.b("getFolderSize: " + e, null);
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        j += b(file2);
                    }
                    return j;
                }
                return 0L;
            }
        }
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    public final void a(File[] fileArr, File file) {
        if (fileArr == null || fileArr.length != 0 || file.delete()) {
            return;
        }
        mb.b("Unable to delete " + file.getPath(), null);
    }

    public final void a(l8 l8Var) {
        File file = new File(l8Var.f4858a, ".adId");
        if (!file.exists() || file.delete()) {
            return;
        }
        mb.b("Unable to delete " + file.getPath(), null);
    }

    public l8 a() {
        return this.b;
    }

    public Boolean a(d0 d0Var) {
        Map d = d0Var.d();
        l8 a2 = a();
        if (a2 == null) {
            return Boolean.FALSE;
        }
        File file = a2.f4858a;
        for (t1 t1Var : d.values()) {
            File a3 = t1Var.a(file);
            if (a3 == null) {
                return Boolean.FALSE;
            }
            if (!a3.exists()) {
                mb.b("Asset does not exist: " + t1Var.b, null);
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
