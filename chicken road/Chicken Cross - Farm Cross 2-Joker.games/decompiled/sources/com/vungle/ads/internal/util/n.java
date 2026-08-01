package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static m f12186a = new m() { // from class: com.vungle.ads.internal.util.n$$ExternalSyntheticLambda0
        @Override // com.vungle.ads.internal.util.m
        public final ObjectInputStream a(InputStream inputStream) {
            return n.a(inputStream);
        }
    };
    public static final List b = CollectionsKt.listOf((Object[]) new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    public static final ObjectInputStream a(InputStream inputStream) {
        return new x(inputStream, b);
    }

    public static final void b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e) {
            new AssetFailedToDeleteError(com.iab.omid.library.vungle.internal.l.a("Failed to delete ").append(file.getName()).append(" with error :").append(e.getMessage()).toString()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0098: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:48:0x0098 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vungle.ads.internal.util.m] */
    public static final Object c(File file) {
        Closeable closeable;
        Closeable closeable2;
        ObjectInputStream objectInputStream;
        Closeable closeable3;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? exists = file.exists();
        Closeable closeable4 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
                try {
                    objectInputStream = f12186a.a(exists);
                    try {
                        Object readObject = objectInputStream.readObject();
                        a((Closeable) objectInputStream);
                        a((Closeable) exists);
                        return readObject;
                    } catch (IOException e) {
                        e = e;
                        boolean z = u.f12190a;
                        t.b("FileUtility", "IOException: " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        try {
                            a(file, (Set) null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        boolean z2 = u.f12190a;
                        t.b("FileUtility", "ClassNotFoundException: " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        boolean z3 = u.f12190a;
                        t.b("FileUtility", "cannot read serializable " + e.getMessage());
                        closeable3 = exists;
                        a((Closeable) objectInputStream);
                        a(closeable3);
                        a(file, (Set) null);
                        return null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectInputStream = null;
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    objectInputStream = null;
                } catch (Exception e6) {
                    e = e6;
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable4;
                    closeable4 = exists;
                    a(closeable2);
                    a(closeable4);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e9) {
                e = e9;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = null;
                a(closeable2);
                a(closeable4);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable4 = closeable;
        }
    }

    public static String d(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return FilesKt.readText$default(file, null, 1, null);
        } catch (IOException e) {
            boolean z = u.f12190a;
            t.b("FileUtility", com.iab.omid.library.vungle.internal.l.a("IOException: ").append(e.getMessage()).toString());
            return null;
        } catch (Exception e2) {
            boolean z2 = u.f12190a;
            t.b("FileUtility", com.iab.omid.library.vungle.internal.l.a("cannot read string ").append(e2.getMessage()).toString());
            return null;
        }
    }

    public static final void a(File folder, Set set) {
        if (folder != null) {
            try {
                if (folder.exists()) {
                    if (folder.isDirectory()) {
                        if (set != null && set.contains(folder.getName())) {
                            boolean z = u.f12190a;
                            t.a("FileUtility", "Skipping deletion of directory: " + folder.getName());
                            return;
                        }
                        Intrinsics.checkNotNullParameter(folder, "folder");
                        File[] listFiles = folder.listFiles();
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                a(file, set);
                            }
                        }
                    }
                    if (set != null && set.contains(folder.getName())) {
                        boolean z2 = u.f12190a;
                        t.a("FileUtility", "Skipping deletion of file: " + folder.getName());
                    } else {
                        if (folder.delete()) {
                            return;
                        }
                        boolean z3 = u.f12190a;
                        t.a("FileUtility", "Failed to delete file: " + folder);
                    }
                }
            } catch (Exception e) {
                boolean z4 = u.f12190a;
                t.b("FileUtility", com.iab.omid.library.vungle.internal.l.a("Failed to delete file: ").append(e.getLocalizedMessage()).toString());
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void a(File file, Serializable serializable) {
        Throwable th;
        ?? r2;
        IOException e;
        FileOutputStream fileOutputStream;
        Closeable closeable;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            b(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                r2 = new ObjectOutputStream(fileOutputStream);
            } catch (IOException e2) {
                e = e2;
                r2 = 0;
            } catch (Throwable th2) {
                th = th2;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
            try {
                r2.writeObject(serializable);
                r2.reset();
                closeable = r2;
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                r2 = r2;
                try {
                    boolean z = u.f12190a;
                    t.b("FileUtility", String.valueOf(e.getMessage()));
                    fileOutputStream = fileOutputStream2;
                    closeable = r2;
                    a(closeable);
                    a(fileOutputStream);
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream2 = r2;
                    a(fileOutputStream2);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = r2;
                a(fileOutputStream2);
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            r2 = 0;
        } catch (Throwable th5) {
            th = th5;
            r2 = 0;
            fileOutputStream = fileOutputStream2;
            fileOutputStream2 = r2;
            a(fileOutputStream2);
            a(fileOutputStream);
            throw th;
        }
        a(closeable);
        a(fileOutputStream);
    }

    public static void a(File file, String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (str == null) {
            return;
        }
        try {
            FilesKt.writeText(file, str, Charsets.UTF_8);
        } catch (IOException e) {
            boolean z = u.f12190a;
            t.b("FileUtility", String.valueOf(e.getMessage()));
        }
    }

    public static boolean a(String str) {
        if (str != null) {
            try {
                if (!StringsKt.isBlank(str)) {
                    if (HttpUrl.INSTANCE.parse(str) != null) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static String a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String guessFileName = URLUtil.guessFileName(url, null, str);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }
}
