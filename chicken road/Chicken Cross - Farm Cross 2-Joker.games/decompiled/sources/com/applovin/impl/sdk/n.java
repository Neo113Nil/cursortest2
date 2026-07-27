package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.webkit.MimeTypeMap;
import androidx.core.util.AtomicFile;
import com.applovin.impl.c5;
import com.applovin.impl.h2;
import com.applovin.impl.i4;
import com.applovin.impl.i6;
import com.applovin.impl.k2;
import com.applovin.impl.l2;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.x6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class n {
    private final l b;
    private final p c;
    private final boolean f;

    /* renamed from: a, reason: collision with root package name */
    private final String f4483a = "FileManager";
    private final Object d = new Object();
    private final Set e = new HashSet();
    private final k2 g = a();

    n(l lVar) {
        this.b = lVar;
        this.c = lVar.Q();
        this.f = ((Boolean) lVar.a(c5.V0)).booleanValue();
    }

    private k2 a() {
        if (((Boolean) this.b.a(c5.z3)).booleanValue()) {
            try {
                return new i4(this.b);
            } catch (Throwable th) {
                if (p.a()) {
                    this.c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.b.E().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new l2(this.b);
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (this.e.contains(absolutePath)) {
                return false;
            }
            d(file);
            return true;
        }
    }

    private boolean g(File file) {
        if (p.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean delete = file.delete();
            if (!delete) {
                HashMap<String, String> hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                hashMap.put("details", b(file));
                this.b.E().a(h2.c1, "removeFile", hashMap);
            }
            return delete;
        } catch (Throwable th) {
            try {
                if (p.a()) {
                    this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.E().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } finally {
                h(file);
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (!this.e.remove(absolutePath)) {
                this.b.E().a(h2.c1, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.d.notifyAll();
        }
    }

    public void b(Context context) {
        if (this.b.G0()) {
            if (p.a()) {
                this.c.a("FileManager", "Compacting cache...");
            }
            long a2 = a(context);
            boolean a3 = a(a2, context);
            if (((Boolean) this.b.a(c5.b1)).booleanValue()) {
                this.b.x0().d(h2.f, CollectionUtils.hashMap("details", "cache_size_megabytes=" + (a3 ? 0L : a(a2))));
            }
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.s0().a((n5) new x6(this.b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n.this.a(bVar, context);
            }
        }), i6.b.CACHING);
    }

    public byte[] d(String str, Context context) {
        File a2 = a(str, context);
        if (a2 != null && a2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(a2);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read < 0) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            fileInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (p.a()) {
                    this.c.a("FileManager", "Failed to read cached file: " + str, th);
                }
            }
        }
        return null;
    }

    public String f(File file) {
        if (file == null) {
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String a2 = a(fileInputStream);
                            boolean z2 = a2 == null;
                            fileInputStream.close();
                            if (z2 && ((Boolean) this.b.a(c5.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return a2;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        if (p.a()) {
                            this.c.a("FileManager", "Failed to read file: " + file.getName() + e);
                        }
                        this.c.a("FileManager", e);
                        this.b.E().a("FileManager", "readFileIO", e);
                        if (((Boolean) this.b.a(c5.N0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (z && ((Boolean) this.b.a(c5.N0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                if (p.a()) {
                    this.c.d("FileManager", "File not found. " + e2);
                }
                this.c.a("FileManager", e2);
                this.b.E().a("FileManager", "readFileNotFound", e2);
                if (0 != 0 && ((Boolean) this.b.a(c5.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            } catch (Throwable th4) {
                if (p.a()) {
                    this.c.a("FileManager", "Unknown failure to read file.", th4);
                }
                this.c.a("FileManager", th4);
                this.b.E().a("FileManager", "readFile", th4);
                if (((Boolean) this.b.a(c5.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            z = false;
        }
    }

    private boolean c(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            contains = this.e.contains(absolutePath);
        }
        return contains;
    }

    private List c(Context context) {
        File[] listFiles;
        File d = d(context);
        if (d.isDirectory() && (listFiles = d.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (p.a()) {
                this.c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (p.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.E().a(h2.c1, "createNoMediaFile");
        } catch (IOException e) {
            if (p.a()) {
                this.c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.n0() == null) {
            return;
        }
        g(a(bVar.n0().getLastPathSegment(), context));
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File d = d(context);
        File file = new File(d, str);
        if (z) {
            try {
                d.mkdirs();
            } catch (Throwable th) {
                if (p.a()) {
                    this.c.a("FileManager", "Unable to make cache directory at " + d, th);
                }
                this.b.E().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    private String b(File file) {
        try {
            boolean exists = file.exists();
            boolean isDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z = true;
            boolean z2 = isDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z3 = parentFile != null && parentFile.exists();
            if (!z3 || !parentFile.canWrite()) {
                z = false;
            }
            return "fileExists: " + exists + "\nisDirectory: " + isDirectory + "\nisEmptyDirectory: " + z2 + "\nparentDirectoryExists: " + z3 + "\nisParentDirectoryWritable: " + z;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    public boolean c(String str, Context context) {
        if (this.f) {
            return b(str, context);
        }
        boolean z = false;
        File a2 = a(str, false, context);
        if (!e(a2)) {
            return false;
        }
        if (a2.exists() && !a2.isDirectory()) {
            z = true;
        }
        h(a2);
        return z;
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.s0().a((n5) new x6(this.b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                n.this.b(bVar, context);
            }
        }), i6.b.CACHING);
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean add = this.e.add(absolutePath);
            while (!add) {
                try {
                    this.d.wait();
                    add = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (p.a()) {
                        this.c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private long b() {
        long longValue = ((Long) this.b.a(c5.C0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.c.a("FileManager", th);
            this.b.E().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    public boolean a(InputStream inputStream, File file, boolean z) {
        return a(inputStream, file, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x0298 A[Catch: all -> 0x02d1, TRY_LEAVE, TryCatch #16 {all -> 0x02d1, blocks: (B:188:0x0292, B:190:0x0298), top: B:187:0x0292 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d A[Catch: all -> 0x016b, TryCatch #9 {all -> 0x016b, blocks: (B:57:0x0127, B:59:0x012d, B:60:0x0132), top: B:56:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(InputStream inputStream, File file, boolean z, boolean z2) {
        boolean z3;
        AtomicFile atomicFile;
        FileOutputStream fileOutputStream;
        boolean z4;
        Throwable th;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Throwable th2;
        Throwable th3;
        if (p.a()) {
            this.c.a("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        if (!this.f) {
            if (!z2) {
                d(file);
            }
            if (((Boolean) this.b.a(c5.R0)).booleanValue() && !z && file.exists()) {
                if (p.a()) {
                    this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.b.E().a(h2.c1, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap("path", file.getAbsolutePath()));
                return true;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                int i = 8192;
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, i);
                        if (read < 0) {
                            break;
                        }
                        try {
                            fileOutputStream2.write(bArr, 0, read);
                            i = 8192;
                        } catch (Throwable th4) {
                            if (p.a()) {
                                this.c.a("FileManager", "Failed to write next buffer to file", th4);
                            }
                            try {
                                this.b.E().a("FileManager", "writeResourceStream", th4);
                                try {
                                    fileOutputStream2.close();
                                    a(file, "removeFileAfterCacheFail");
                                    if (!z2) {
                                        h(file);
                                    }
                                    try {
                                        inputStream.close();
                                        return false;
                                    } catch (Throwable th5) {
                                        if (p.a()) {
                                            this.c.a("FileManager", "Unable to close resourceStream.", th5);
                                        }
                                        this.b.E().a("FileManager", "closeResourceStream", th5);
                                        return false;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    z7 = true;
                                    try {
                                        if (p.a()) {
                                        }
                                        this.c.a("FileManager", th);
                                        try {
                                            this.b.E().a("FileManager", "writeResource", th);
                                            a(file, "removeFileAfterCacheFail");
                                            if (!z2) {
                                            }
                                            try {
                                                inputStream.close();
                                                return false;
                                            } catch (Throwable th7) {
                                                if (p.a()) {
                                                    this.c.a("FileManager", "Unable to close resourceStream.", th7);
                                                }
                                                this.b.E().a("FileManager", "closeResourceStream", th7);
                                                return false;
                                            }
                                        } catch (Throwable th8) {
                                            th2 = th8;
                                            z8 = true;
                                            if (z8) {
                                                a(file, "removeFileAfterCacheFail");
                                            }
                                            if (!z2) {
                                                h(file);
                                            }
                                            try {
                                                inputStream.close();
                                                throw th2;
                                            } catch (Throwable th9) {
                                                if (p.a()) {
                                                    this.c.a("FileManager", "Unable to close resourceStream.", th9);
                                                }
                                                this.b.E().a("FileManager", "closeResourceStream", th9);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        z8 = z7;
                                        th2 = th10;
                                    }
                                }
                            } catch (Throwable th11) {
                                th3 = th11;
                                z7 = true;
                                try {
                                    try {
                                        fileOutputStream2.close();
                                        throw th3;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        if (p.a()) {
                                            this.c.a("FileManager", "Unknown failure to write file.", th);
                                        }
                                        this.c.a("FileManager", th);
                                        this.b.E().a("FileManager", "writeResource", th);
                                        a(file, "removeFileAfterCacheFail");
                                        if (!z2) {
                                            h(file);
                                        }
                                        inputStream.close();
                                        return false;
                                    }
                                } catch (Throwable th13) {
                                    th3.addSuppressed(th13);
                                    throw th3;
                                }
                            }
                        }
                    }
                    fileOutputStream2.close();
                    if (!z2) {
                        h(file);
                    }
                    try {
                        inputStream.close();
                        return true;
                    } catch (Throwable th14) {
                        if (p.a()) {
                            this.c.a("FileManager", "Unable to close resourceStream.", th14);
                        }
                        this.b.E().a("FileManager", "closeResourceStream", th14);
                        return true;
                    }
                } catch (Throwable th15) {
                    th3 = th15;
                    z7 = false;
                    fileOutputStream2.close();
                    throw th3;
                }
            } catch (Throwable th16) {
                th = th16;
                z7 = false;
            }
        } else {
            if (!z2) {
                try {
                    d(file);
                } catch (Throwable th17) {
                    th = th17;
                    z3 = true;
                    atomicFile = null;
                    fileOutputStream = null;
                    z4 = false;
                    try {
                        if (p.a()) {
                        }
                        try {
                            this.b.E().a("FileManager", "writeResource", th);
                            if (atomicFile != null) {
                            }
                            if (!z2) {
                            }
                            try {
                                inputStream.close();
                                return false;
                            } catch (Throwable th18) {
                                if (p.a()) {
                                    this.c.a("FileManager", "Unable to close resourceStream.", th18);
                                }
                                this.b.E().a("FileManager", "closeResourceStream", th18);
                                return false;
                            }
                        } catch (Throwable th19) {
                            z5 = z3;
                            th = th19;
                            if (atomicFile != null) {
                                if (z5) {
                                    atomicFile.failWrite(fileOutputStream);
                                } else {
                                    atomicFile.finishWrite(fileOutputStream);
                                }
                            }
                            if (!z2) {
                                h(file);
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (Throwable th20) {
                                if (p.a()) {
                                    this.c.a("FileManager", "Unable to close resourceStream.", th20);
                                }
                                this.b.E().a("FileManager", "closeResourceStream", th20);
                                throw th;
                            }
                        }
                    } catch (Throwable th21) {
                        th = th21;
                        z5 = z4;
                    }
                }
            }
            if (((Boolean) this.b.a(c5.R0)).booleanValue() && !z && file.exists()) {
                if (p.a()) {
                    this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.b.E().a(h2.c1, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap("path", file.getAbsolutePath()));
                if (!z2) {
                    h(file);
                }
                try {
                    inputStream.close();
                    return true;
                } catch (Throwable th22) {
                    if (p.a()) {
                        this.c.a("FileManager", "Unable to close resourceStream.", th22);
                    }
                    this.b.E().a("FileManager", "closeResourceStream", th22);
                    return true;
                }
            }
            atomicFile = new AtomicFile(file);
            try {
                fileOutputStream = atomicFile.startWrite();
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read2 = inputStream.read(bArr2, 0, 8192);
                        if (read2 < 0) {
                            break;
                        }
                        try {
                            fileOutputStream.write(bArr2, 0, read2);
                        } catch (Throwable th23) {
                            if (p.a()) {
                                this.c.a("FileManager", "Failed to write next buffer to file", th23);
                            }
                            try {
                                this.b.E().a("FileManager", "writeResourceStream", th23);
                                atomicFile.failWrite(fileOutputStream);
                                if (!z2) {
                                    h(file);
                                }
                                try {
                                    inputStream.close();
                                    return false;
                                } catch (Throwable th24) {
                                    if (p.a()) {
                                        this.c.a("FileManager", "Unable to close resourceStream.", th24);
                                    }
                                    this.b.E().a("FileManager", "closeResourceStream", th24);
                                    return false;
                                }
                            } catch (Throwable th25) {
                                th = th25;
                                z3 = true;
                                z6 = true;
                                z4 = z6;
                                if (p.a()) {
                                }
                                this.b.E().a("FileManager", "writeResource", th);
                                if (atomicFile != null) {
                                }
                                if (!z2) {
                                }
                                inputStream.close();
                                return false;
                            }
                        }
                    }
                    atomicFile.finishWrite(fileOutputStream);
                    if (!z2) {
                        h(file);
                    }
                    try {
                        inputStream.close();
                        return true;
                    } catch (Throwable th26) {
                        if (p.a()) {
                            this.c.a("FileManager", "Unable to close resourceStream.", th26);
                        }
                        this.b.E().a("FileManager", "closeResourceStream", th26);
                        return true;
                    }
                } catch (Throwable th27) {
                    th = th27;
                    z3 = true;
                    z6 = false;
                    z4 = z6;
                    if (p.a()) {
                        this.c.a("FileManager", "Unknown failure to write file.", th);
                    }
                    this.b.E().a("FileManager", "writeResource", th);
                    if (atomicFile != null) {
                        atomicFile.failWrite(fileOutputStream);
                    }
                    if (!z2) {
                        h(file);
                    }
                    inputStream.close();
                    return false;
                }
            } catch (Throwable th28) {
                th = th28;
                z3 = true;
                fileOutputStream = null;
            }
        }
    }

    public boolean a(File file, String str, String str2, List list, int i, String str3, Map map) {
        return a(file, str, str2, list, true, i, str3, map);
    }

    private boolean a(File file, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        CollectionUtils.putStringIfValid("source", str2, hashMap);
        hashMap.putAll(map);
        this.b.g().d(h2.O, hashMap);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = i;
        int i3 = 1;
        while (i3 <= i2) {
            if (a(file, str, str2, list, z, str3, map)) {
                a(true, str, str2, i3, elapsedRealtime, map);
                return true;
            }
            i3++;
            i2 = i;
        }
        a(false, str, str2, i, elapsedRealtime, map);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[Catch: all -> 0x01a1, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x01a1, blocks: (B:28:0x00dd, B:42:0x0182, B:61:0x01a0, B:60:0x019d, B:55:0x0197), top: B:27:0x00dd, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(File file, String str, String str2, List list, boolean z, String str3, Map map) {
        InputStream inputStream;
        Throwable th;
        boolean a2;
        long elapsedRealtime;
        File file2 = StringUtils.isValidString(str2) ? new File(file.getParentFile(), a(file.getName(), str2)) : file;
        Boolean bool = (Boolean) this.b.a(c5.W0);
        if (bool.booleanValue()) {
            d(file2);
        }
        if (a(file2)) {
            if (p.a()) {
                this.c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
            CollectionUtils.putStringIfValid("source", str2, hashMap);
            hashMap.putAll(map);
            this.b.g().d(h2.P, hashMap);
            if (((Boolean) this.b.a(c5.Y0)).booleanValue() && !file2.setLastModified(System.currentTimeMillis())) {
                if (p.a()) {
                    this.c.b("FileManager", "Failed to refresh cache TTL for " + file2.getName());
                }
                this.b.E().a(h2.c1, "setLastModifiedFailed", hashMap);
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            InputStream a3 = a(str, str2, list, z, map);
            try {
                if (p.a()) {
                    try {
                        this.c.a("FileManager", "Caching " + file2.getAbsolutePath() + "...");
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = a3;
                        if (inputStream == null) {
                            try {
                                inputStream.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                a2 = a(a3, file2, false, bool.booleanValue());
                elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                inputStream = a3;
            } catch (Throwable th4) {
                th = th4;
                inputStream = a3;
            }
            try {
                Map a4 = a(file2.getAbsolutePath(), str, str2, elapsedRealtime, map);
                if (a2) {
                    if (p.a()) {
                        this.c.a("FileManager", "Caching completed for " + file2);
                    }
                    a(file2.length(), elapsedRealtime, str, str3, a4);
                } else {
                    if (p.a()) {
                        this.c.b("FileManager", "Unable to cache " + file2.getAbsolutePath());
                    }
                    this.b.g().d(h2.V, a4);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (bool.booleanValue()) {
                    h(file2);
                }
                return a2;
            } catch (Throwable th5) {
                th = th5;
                th = th;
                if (inputStream == null) {
                }
            }
        } catch (Throwable th6) {
            try {
                this.c.a("FileManager", th6);
                this.b.E().a("FileManager", "loadAndCacheResource", th6);
                if (bool.booleanValue()) {
                    h(file2);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file2);
                }
            }
        }
    }

    public byte[] a(String str, List list, String str2, Map map) {
        byte[] byteArray;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream a2 = a(str, (String) null, list, true, map);
            if (a2 != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = a2.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                } finally {
                }
            } else {
                byteArray = null;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            Map a3 = a((String) null, str, (String) null, elapsedRealtime2, map);
            if (byteArray != null) {
                a(byteArray.length, elapsedRealtime2, str, str2, a3);
            } else {
                this.b.g().d(h2.V, a3);
            }
            if (a2 != null) {
                a2.close();
            }
            return byteArray;
        } catch (Throwable th) {
            this.c.a("FileManager", th);
            this.b.E().a("FileManager", "downloadResource", th);
            return null;
        }
    }

    private void a(long j, long j2, String str, String str2, Map map) {
        double d = t7.d(j2);
        double c = t7.c(j);
        long j3 = (long) (c / d);
        CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j3), map);
        CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(c), map);
        this.b.g().d(h2.U, map);
        this.b.f0().b(j3, str, str2);
    }

    private Map a(String str, String str2, String str3, long j, Map map) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str2);
        CollectionUtils.putStringIfValid("path", str, hashMap);
        CollectionUtils.putStringIfValid("source", str3, hashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), hashMap);
        hashMap.putAll(map);
        return hashMap;
    }

    private void a(boolean z, String str, String str2, int i, long j, Map map) {
        h2 h2Var = z ? h2.Q : h2.R;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        HashMap hashMap = new HashMap(3);
        hashMap.put("attempt_number", Integer.toString(i));
        hashMap.put("url", str);
        hashMap.put("duration_ms", String.valueOf(elapsedRealtime));
        CollectionUtils.putStringIfValid("source", str2, hashMap);
        hashMap.putAll(map);
        this.b.g().d(h2Var, hashMap);
    }

    public InputStream a(String str, String str2, List list, boolean z, Map map) {
        if (z && !t7.a(str, list)) {
            if (p.a()) {
                this.c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (p.a()) {
            this.c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", httpsString);
        CollectionUtils.putStringIfValid("source", str2, hashMap);
        hashMap.putAll(map);
        this.b.g().d(h2.S, hashMap);
        try {
            return this.g.a(httpsString, str2, map);
        } catch (Throwable th) {
            if (p.a()) {
                this.c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.b.E().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public String a(String str, String str2) {
        return str + "." + str2;
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List W = bVar.W();
        if (bVar.M0() || W.contains(str)) {
            return bVar.C();
        }
        return 1;
    }

    public String a(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public String a(Context context, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        return a(context, str, str2, list, z, false, i, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z, boolean z2, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.E().a(h2.c1, "cacheResource");
            return null;
        }
        String a2 = t7.a(Uri.parse(str), str2, this.b);
        File a3 = a(a2, context);
        if (!a(a3, str, (String) null, list, z, i, str3, map)) {
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Caching succeeded for file " + a2);
        }
        return z2 ? Uri.fromFile(a3).toString() : a2;
    }

    private long a(Context context) {
        boolean z;
        long b = b();
        boolean z2 = b != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c = this.b.c(c5.H0);
        long j = 0;
        for (File file : c(context)) {
            if (!z2 || c.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= b) {
                z = false;
            } else {
                if (p.a()) {
                    this.c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z = g(file);
            }
            if (!z) {
                j += file.length();
            }
        }
        return j;
    }

    private boolean a(long j, Context context) {
        long intValue = ((Integer) this.b.a(c5.D0)).intValue();
        if (intValue == -1) {
            if (p.a()) {
                this.c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
            return false;
        }
        if (a(j) > intValue) {
            if (p.a()) {
                this.c.a("FileManager", "Cache has exceeded maximum size; dropping...");
            }
            Iterator it = c(context).iterator();
            while (it.hasNext()) {
                g((File) it.next());
            }
            return true;
        }
        if (p.a()) {
            this.c.a("FileManager", "Cache is present but under size limit; not dropping...");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.m().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri n0 = bVar.n0();
        if (n0 != null) {
            g(a(n0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (p.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            hashMap.put("details", b(file));
            this.b.E().a(h2.c1, str, hashMap);
        } catch (Throwable th) {
            if (p.a()) {
                this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.E().a("FileManager", str, th);
        }
    }

    private long a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
