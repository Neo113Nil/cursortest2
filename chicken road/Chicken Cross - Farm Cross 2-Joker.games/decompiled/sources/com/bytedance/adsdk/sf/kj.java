package com.bytedance.adsdk.sf;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.sf.vj.of;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes4.dex */
public class kj {
    private static final Map<String, hc<qf>> pcc = new HashMap();
    private static final Set<Object> sf = new HashSet();
    private static final byte[] gm = {80, 75, 3, 4};

    public static hc<qf> pcc(Context context, String str) {
        return pcc(context, str, "url_".concat(String.valueOf(str)));
    }

    public static hc<qf> pcc(final Context context, final String str, final String str2) {
        return pcc(str2, new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.kj.1
            @Override // java.util.concurrent.Callable
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public tmg<qf> call() throws Exception {
                tmg<qf> pcc2 = vj.pcc(context).pcc(context, str, str2);
                if (str2 != null && pcc2.pcc() != null) {
                    com.bytedance.adsdk.sf.gm.vj.pcc().pcc(str2, pcc2.pcc());
                }
                return pcc2;
            }
        });
    }

    public static hc<qf> sf(Context context, String str) {
        return sf(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static hc<qf> sf(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return pcc(str2, new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.kj.4
            @Override // java.util.concurrent.Callable
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public tmg<qf> call() throws Exception {
                return kj.gm(applicationContext, str, str2);
            }
        });
    }

    public static tmg<qf> gm(Context context, String str) {
        return gm(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static tmg<qf> gm(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return sf(context.getAssets().open(str), str2);
            }
            return pcc(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new tmg<>((Throwable) e);
        }
    }

    public static hc<qf> pcc(Context context, int i) {
        return pcc(context, i, gm(context, i));
    }

    public static hc<qf> pcc(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return pcc(str, new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.kj.5
            @Override // java.util.concurrent.Callable
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public tmg<qf> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return kj.sf(context2, i, str);
            }
        });
    }

    public static tmg<qf> sf(Context context, int i) {
        return sf(context, i, gm(context, i));
    }

    public static tmg<qf> sf(Context context, int i, String str) {
        try {
            return sf(context.getResources().openRawResource(i), gm(context, i));
        } catch (Resources.NotFoundException e) {
            return new tmg<>((Throwable) e);
        }
    }

    private static String gm(Context context, int i) {
        return "rawRes" + (pcc(context) ? "_night_" : "_day_") + i;
    }

    private static boolean pcc(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static hc<qf> pcc(final InputStream inputStream, final String str) {
        return pcc(str, new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.kj.6
            @Override // java.util.concurrent.Callable
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public tmg<qf> call() throws Exception {
                return kj.sf(inputStream, str);
            }
        });
    }

    public static tmg<qf> sf(InputStream inputStream, String str) {
        return pcc(inputStream, str, true);
    }

    private static tmg<qf> pcc(InputStream inputStream, String str, boolean z) {
        try {
            return pcc(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.sf.wh.wh.pcc(inputStream);
            }
        }
    }

    public static tmg<qf> pcc(JsonReader jsonReader, String str) {
        return pcc(jsonReader, str, true);
    }

    private static tmg<qf> pcc(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                qf pcc2 = of.pcc(jsonReader);
                com.bytedance.adsdk.sf.gm.vj.pcc().pcc(str, pcc2);
                tmg<qf> tmgVar = new tmg<>(pcc2);
                if (z) {
                    pcc(jsonReader);
                }
                return tmgVar;
            } catch (Exception e) {
                tmg<qf> tmgVar2 = new tmg<>(e);
                if (z) {
                    pcc(jsonReader);
                }
                return tmgVar2;
            }
        } catch (Throwable th) {
            if (z) {
                pcc(jsonReader);
            }
            throw th;
        }
    }

    public static void pcc(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static tmg<qf> pcc(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return sf(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.sf.wh.wh.pcc(zipInputStream);
        }
    }

    private static tmg<qf> sf(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            qf qfVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    qfVar = pcc(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).pcc();
                } else {
                    if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                        if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        if (name.contains("../")) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            String[] split = name.split("/");
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } finally {
                                }
                            } catch (Throwable unused) {
                                new StringBuilder("Unable to save font ").append(str3).append(" to the temporary file: ").append(str2);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                new StringBuilder("Failed to delete temp font file ").append(file.getAbsolutePath());
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] split2 = name.split("/");
                        hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (qfVar == null) {
                return new tmg<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ork pcc2 = pcc(qfVar, (String) entry.getKey());
                if (pcc2 != null) {
                    pcc2.pcc(com.bytedance.adsdk.sf.wh.wh.pcc((Bitmap) entry.getValue(), pcc2.pcc(), pcc2.sf()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.sf.gm.gm gmVar : qfVar.jr().values()) {
                    if (gmVar.pcc().equals(entry2.getKey())) {
                        gmVar.pcc((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, ork>> it = qfVar.dax().entrySet().iterator();
                while (it.hasNext()) {
                    ork value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String vy = value.vy();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (vy.startsWith("data:") && vy.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(vy.substring(vy.indexOf(44) + 1), 0);
                            value.pcc(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, ork> entry3 : qfVar.dax().entrySet()) {
                if (entry3.getValue().vh() == null) {
                    return new tmg<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().vy()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.sf.gm.vj.pcc().pcc(str, qfVar);
            }
            return new tmg<>(qfVar);
        } catch (IOException e) {
            return new tmg<>((Throwable) e);
        }
    }

    private static ork pcc(qf qfVar, String str) {
        for (ork orkVar : qfVar.dax().values()) {
            if (orkVar.vy().equals(str)) {
                return orkVar;
            }
        }
        return null;
    }

    private static hc<qf> pcc(final String str, Callable<tmg<qf>> callable) {
        final qf pcc2 = str == null ? null : com.bytedance.adsdk.sf.gm.vj.pcc().pcc(str);
        if (pcc2 != null) {
            return new hc<>(new Callable<tmg<qf>>() { // from class: com.bytedance.adsdk.sf.kj.7
                @Override // java.util.concurrent.Callable
                /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
                public tmg<qf> call() throws Exception {
                    return new tmg<>(qf.this);
                }
            });
        }
        if (str != null) {
            Map<String, hc<qf>> map = pcc;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        hc<qf> hcVar = new hc<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hcVar.pcc(new vh<qf>() { // from class: com.bytedance.adsdk.sf.kj.2
                @Override // com.bytedance.adsdk.sf.vh
                public void pcc(qf qfVar) {
                    kj.pcc.remove(str);
                    atomicBoolean.set(true);
                    if (kj.pcc.size() == 0) {
                        kj.sf(true);
                    }
                }
            });
            hcVar.gm(new vh<Throwable>() { // from class: com.bytedance.adsdk.sf.kj.3
                @Override // com.bytedance.adsdk.sf.vh
                public void pcc(Throwable th) {
                    kj.pcc.remove(str);
                    atomicBoolean.set(true);
                    if (kj.pcc.size() == 0) {
                        kj.sf(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, hc<qf>> map2 = pcc;
                map2.put(str, hcVar);
                if (map2.size() == 1) {
                    sf(false);
                }
            }
        }
        return hcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(boolean z) {
        ArrayList arrayList = new ArrayList(sf);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
