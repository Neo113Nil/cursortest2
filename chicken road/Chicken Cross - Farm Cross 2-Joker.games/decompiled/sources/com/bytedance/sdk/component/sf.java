package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class sf {
    private static ArrayMap<File, sf> hc = null;
    protected static pcc pcc = null;
    private static boolean sf = false;
    private static ArrayMap<String, File> tmg;
    private final Object gm;
    private long kj;
    private final Object oo;
    private final File ork;
    private int qf;
    private final File vh;
    private Properties vj;
    private long vy;
    private volatile boolean wh;

    public interface pcc {
        HandlerThread pcc(String str, int i);

        ExecutorService pcc();
    }

    static /* synthetic */ int vj(sf sfVar) {
        int i = sfVar.qf;
        sfVar.qf = i + 1;
        return i;
    }

    static /* synthetic */ int vy(sf sfVar) {
        int i = sfVar.qf;
        sfVar.qf = i - 1;
        return i;
    }

    static /* synthetic */ long wh(sf sfVar) {
        long j = sfVar.kj;
        sfVar.kj = 1 + j;
        return j;
    }

    public static void pcc(pcc pccVar) {
        pcc = pccVar;
    }

    public static sf pcc(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (sf.class) {
            if (tmg == null) {
                tmg = new ArrayMap<>();
            }
            File file = tmg.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                tmg.put(str, file);
            }
            if (hc == null) {
                hc = new ArrayMap<>();
            }
            sf sfVar = hc.get(file);
            if (sfVar != null) {
                return sfVar;
            }
            sf sfVar2 = new sf(file);
            hc.put(file, sfVar2);
            return sfVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.sdk.component.sf$1] */
    private sf(File file) {
        Object obj = new Object();
        this.gm = obj;
        this.oo = new Object();
        this.vj = new Properties();
        this.wh = false;
        this.qf = 0;
        this.ork = file;
        this.vh = pcc(file);
        synchronized (obj) {
            this.wh = false;
        }
        pcc pccVar = pcc;
        if (pccVar == null || pccVar.pcc() == null) {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.sf.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    sf.this.pcc();
                }
            }.start();
        } else {
            pcc.pcc().execute(new Runnable() { // from class: com.bytedance.sdk.component.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.pcc();
                }
            });
        }
    }

    static File pcc(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00b3 -> B:32:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.gm) {
            if (this.wh) {
                if (sf) {
                    Log.d("TTPropHelper", "reload: already loaded, ignore");
                }
                return;
            }
            if (this.vh.exists()) {
                this.ork.delete();
                this.vh.renameTo(this.ork);
            }
            if (sf) {
                Log.d("TTPropHelper", "reload: " + this.ork.getAbsolutePath() + ", exist? " + this.ork.exists());
            }
            Properties properties = null;
            if (this.ork.exists()) {
                Properties properties2 = new Properties();
                try {
                    try {
                        fileInputStream = new FileInputStream(this.ork);
                    } catch (Throwable th2) {
                        fileInputStream = null;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    Log.w("TTPropHelper", th3.getMessage());
                }
                try {
                    properties2.load(fileInputStream);
                    if (sf) {
                        Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.ork.getAbsolutePath());
                    }
                    fileInputStream.close();
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        Log.e("TTPropHelper", "reload: ", th);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        properties = properties2;
                        synchronized (this.gm) {
                        }
                    } catch (Throwable th5) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th6) {
                                Log.w("TTPropHelper", th6.getMessage());
                            }
                        }
                        throw th5;
                    }
                }
                properties = properties2;
            }
            synchronized (this.gm) {
                if (properties != null) {
                    if (!properties.isEmpty()) {
                        this.vj = properties;
                    }
                }
                this.wh = true;
                this.gm.notifyAll();
            }
        }
    }

    private void oo() {
        while (!this.wh) {
            try {
                this.gm.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public String pcc(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.gm) {
            oo();
            property = this.vj.getProperty(str, str2);
        }
        return property;
    }

    public int pcc(String str, int i) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.gm) {
            try {
                try {
                    oo();
                    parseInt = Integer.parseInt(this.vj.getProperty(str, String.valueOf(i)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseInt;
    }

    public long pcc(String str, long j) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.gm) {
            try {
                try {
                    oo();
                    parseLong = Long.parseLong(this.vj.getProperty(str, String.valueOf(j)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseLong;
    }

    public boolean pcc(String str, boolean z) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.gm) {
            try {
                try {
                    oo();
                    parseBoolean = Boolean.parseBoolean(this.vj.getProperty(str, String.valueOf(z)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseBoolean;
    }

    public gm sf() {
        return new gm();
    }

    /* renamed from: com.bytedance.sdk.component.sf$sf, reason: collision with other inner class name */
    private static class C0129sf {
        final CountDownLatch gm;
        volatile boolean oo;
        final long pcc;
        final Properties sf;
        boolean vj;

        private C0129sf(long j, Properties properties) {
            this.gm = new CountDownLatch(1);
            this.oo = false;
            this.vj = false;
            this.pcc = j;
            this.sf = properties;
        }

        void pcc(boolean z, boolean z2) {
            this.vj = z;
            this.oo = z2;
            this.gm.countDown();
        }
    }

    public class gm implements SharedPreferences.Editor {
        private final Object sf = new Object();
        private final Map<String, Object> gm = new HashMap();
        private boolean oo = false;

        public gm() {
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return pcc(str, (Set<String>) set);
        }

        public gm pcc(String str, Set<String> set) {
            synchronized (this.sf) {
                this.gm.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putInt(String str, int i) {
            synchronized (this.sf) {
                this.gm.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putLong(String str, long j) {
            synchronized (this.sf) {
                this.gm.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putFloat(String str, float f) {
            synchronized (this.sf) {
                this.gm.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putString(String str, String str2) {
            synchronized (this.sf) {
                this.gm.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm putBoolean(String str, boolean z) {
            synchronized (this.sf) {
                this.gm.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm remove(String str) {
            synchronized (this.sf) {
                this.gm.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public gm clear() {
            synchronized (this.sf) {
                this.oo = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long currentTimeMillis = sf.sf ? System.currentTimeMillis() : 0L;
            C0129sf sf = sf();
            sf.this.pcc(sf, true);
            try {
                sf.gm.await();
                if (sf.sf) {
                    Log.d("TTPropHelper", sf.this.ork.getName() + ServerSentEventKt.COLON + sf.pcc + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                return sf.oo;
            } catch (InterruptedException unused) {
                if (!sf.sf) {
                    return false;
                }
                Log.d("TTPropHelper", sf.this.ork.getName() + ServerSentEventKt.COLON + sf.pcc + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return false;
            } catch (Throwable th) {
                if (sf.sf) {
                    Log.d("TTPropHelper", sf.this.ork.getName() + ServerSentEventKt.COLON + sf.pcc + " committed after " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            sf.this.pcc(sf(), false);
        }

        private C0129sf sf() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (sf.this.gm) {
                if (sf.this.qf > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(sf.this.vj);
                    sf.this.vj = properties2;
                }
                properties = sf.this.vj;
                sf.vj(sf.this);
                synchronized (this.sf) {
                    boolean z2 = false;
                    if (this.oo) {
                        if (properties.isEmpty()) {
                            z = false;
                        } else {
                            properties.clear();
                            z = true;
                        }
                        this.oo = false;
                        z2 = z;
                    }
                    for (Map.Entry<String, Object> entry : this.gm.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z2 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z2 = true;
                        }
                    }
                    this.gm.clear();
                    if (z2) {
                        sf.wh(sf.this);
                    }
                    j = sf.this.kj;
                }
            }
            return new C0129sf(j, properties);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final C0129sf c0129sf, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.sf.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (sf.this.oo) {
                    try {
                        sf.this.sf(c0129sf, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (sf.this.gm) {
                    sf.vy(sf.this);
                }
            }
        };
        if (z) {
            synchronized (this.gm) {
                z2 = this.qf == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.gm.pcc(runnable, true ^ z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139 A[Catch: all -> 0x01a5, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #4 {all -> 0x01a5, blocks: (B:38:0x0093, B:39:0x0095, B:56:0x0125, B:58:0x0129, B:59:0x0130, B:61:0x0139, B:62:0x0141, B:64:0x014d, B:103:0x01a3, B:104:0x01a4, B:55:0x0124, B:72:0x00ee, B:73:0x00f4, B:83:0x011d, B:99:0x01a1, B:98:0x0198, B:93:0x0192, B:79:0x0117, B:54:0x00e8), top: B:37:0x0093, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sf(C0129sf c0129sf, boolean z) {
        long j;
        long j2;
        Throwable th;
        long j3;
        String str;
        String message;
        FileOutputStream fileOutputStream;
        boolean z2;
        long currentTimeMillis = sf ? System.currentTimeMillis() : 0L;
        boolean exists = this.ork.exists();
        if (sf) {
            j = System.currentTimeMillis();
            j2 = j;
        } else {
            j = 0;
            j2 = 0;
        }
        if (exists) {
            if (this.vy >= c0129sf.pcc) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.gm) {
                    z2 = this.kj == c0129sf.pcc;
                }
            }
            if (!z2) {
                c0129sf.pcc(false, true);
                return;
            }
            boolean exists2 = this.vh.exists();
            if (sf) {
                j2 = System.currentTimeMillis();
            }
            if (!exists2) {
                if (!this.ork.renameTo(this.vh)) {
                    Log.e("TTPropHelper", "Couldn't rename file " + this.ork + " to backup file " + this.vh);
                    c0129sf.pcc(false, false);
                    return;
                }
            } else {
                this.ork.delete();
            }
        }
        try {
            synchronized (this.oo) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(this.ork);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    try {
                        j3 = sf ? System.currentTimeMillis() : 0L;
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        j3 = 0;
                        Log.e("TTPropHelper", "saveToLocal: ", e);
                        c0129sf.pcc(false, false);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                str = "TTPropHelper";
                                message = th3.getMessage();
                                Log.w(str, message);
                                if (sf) {
                                }
                                this.vh.delete();
                                if (sf) {
                                }
                                this.vy = c0129sf.pcc;
                                c0129sf.pcc(true, true);
                                if (sf) {
                                }
                            }
                        }
                        if (sf) {
                        }
                        this.vh.delete();
                        if (sf) {
                        }
                        this.vy = c0129sf.pcc;
                        c0129sf.pcc(true, true);
                        if (sf) {
                        }
                    }
                    try {
                        c0129sf.sf.store(fileOutputStream, (String) null);
                        if (sf) {
                            Log.d("TTPropHelper", "save: " + c0129sf.sf);
                            Log.d("TTPropHelper", "saveToLocal: save to" + this.ork.getAbsolutePath() + "success");
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        Log.e("TTPropHelper", "saveToLocal: ", e);
                        c0129sf.pcc(false, false);
                        if (fileOutputStream2 != null) {
                        }
                        if (sf) {
                        }
                        this.vh.delete();
                        if (sf) {
                        }
                        this.vy = c0129sf.pcc;
                        c0129sf.pcc(true, true);
                        if (sf) {
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        str = "TTPropHelper";
                        message = th4.getMessage();
                        Log.w(str, message);
                        if (sf) {
                        }
                        this.vh.delete();
                        if (sf) {
                        }
                        this.vy = c0129sf.pcc;
                        c0129sf.pcc(true, true);
                        if (sf) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Throwable th6) {
                            Log.w("TTPropHelper", th6.getMessage());
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            long currentTimeMillis2 = sf ? System.currentTimeMillis() : 0L;
            this.vh.delete();
            long currentTimeMillis3 = sf ? System.currentTimeMillis() : 0L;
            this.vy = c0129sf.pcc;
            c0129sf.pcc(true, true);
            if (sf) {
                Log.d("TTPropHelper", "write: " + (j - currentTimeMillis) + "/" + (j2 - currentTimeMillis) + "/" + (j3 - currentTimeMillis) + "/" + (currentTimeMillis2 - currentTimeMillis) + "/" + (currentTimeMillis3 - currentTimeMillis));
            }
        } catch (Throwable th7) {
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.ork.exists() && !this.ork.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.ork);
            }
            c0129sf.pcc(false, false);
        }
    }
}
