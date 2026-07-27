package com.bytedance.sdk.component.qf.sf;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.sf.pcc.wh;
import com.google.common.net.HttpHeaders;
import com.inmobi.unification.sdk.InitializationStatus;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public class pcc extends gm {
    public File pcc;
    public File sf;
    private volatile boolean vh;

    public pcc(vh vhVar) {
        super(vhVar);
    }

    public void pcc(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.pcc = new File(str, str2);
        this.sf = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void pcc(final com.bytedance.sdk.component.qf.pcc.pcc pccVar) {
        File file = this.pcc;
        if (file == null || this.sf == null) {
            if (pccVar != null) {
                pccVar.pcc(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.pcc.length() != 0 && pccVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.qf.sf sfVar = new com.bytedance.sdk.component.qf.sf(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            sfVar.pcc(this.pcc);
            pccVar.pcc(this, sfVar);
            return;
        }
        long length = this.sf.length();
        final long j = length >= 0 ? length : 0L;
        tmg.pcc pccVar2 = new tmg.pcc();
        pccVar2.pcc((Object) oo());
        pcc(pccVar2);
        sf("Range", "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.kj)) {
            pccVar.pcc(this, new IOException("Url is Empty"));
            return;
        }
        try {
            pccVar2.sf(this.kj);
            if (!TextUtils.isEmpty(this.vj)) {
                pccVar2.pcc(this.vj);
            }
            if (this.wh > 0) {
                pccVar2.pcc(this.wh);
            }
            sf(pccVar2);
            com.bytedance.sdk.component.sf.pcc.sf pcc = this.gm.pcc(pccVar2.pcc().sf());
            if (pcc == null) {
                pccVar.pcc(this, new IOException("new call error"));
            } else {
                pcc.pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bytedance.sdk.component.qf.sf.pcc.1
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar2, IOException iOException) {
                        com.bytedance.sdk.component.qf.pcc.pcc pccVar3 = pccVar;
                        if (pccVar3 != null) {
                            pccVar3.pcc(pcc.this, iOException);
                        }
                        pcc.this.ork();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
                    @Override // com.bytedance.sdk.component.sf.pcc.gm
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar2, gbb gbbVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        byte[] bArr;
                        int i;
                        int read;
                        boolean z;
                        InputStream inputStream;
                        if (pccVar == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (gbbVar == null) {
                            return;
                        }
                        pcc.this.pcc(gbbVar.vy());
                        wh qf = gbbVar.qf();
                        if (qf != null) {
                            for (int i2 = 0; i2 < qf.pcc(); i2++) {
                                hashMap.put(qf.pcc(i2), qf.sf(i2));
                            }
                        }
                        com.bytedance.sdk.component.qf.sf sfVar3 = new com.bytedance.sdk.component.qf.sf(gbbVar.oo(), gbbVar.gm(), gbbVar.vj(), hashMap, null, gbbVar.sf(), gbbVar.pcc());
                        if (gbbVar.oo()) {
                            long pcc2 = gbbVar.wh().pcc();
                            if (pcc2 <= 0) {
                                pcc2 = pcc.wh(hashMap);
                            }
                            boolean vj = pcc.vj(hashMap);
                            int i3 = -1;
                            if (vj) {
                                pcc2 += j;
                                String str = (String) hashMap.get(HttpHeaders.CONTENT_RANGE);
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j + "-" + (pcc2 - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        pcc.this.ork();
                                        pccVar.pcc(pcc.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + pcc.this.sf + "]."));
                                        return;
                                    }
                                }
                            }
                            if (pcc2 > 0 && pcc.this.sf.exists() && pcc.this.sf.length() == pcc2) {
                                if (!pcc.this.sf.renameTo(pcc.this.pcc)) {
                                    pccVar.pcc(pcc.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    sfVar3.pcc(pcc.this.pcc);
                                    pccVar.pcc(pcc.this, sfVar3);
                                    return;
                                }
                            }
                            InputStream inputStream2 = null;
                            try {
                                randomAccessFile = new RandomAccessFile(pcc.this.sf, "rw");
                            } catch (Throwable unused) {
                                randomAccessFile = null;
                            }
                            if (vj) {
                                randomAccessFile.seek(j);
                                j2 = j;
                                try {
                                    inputStream2 = gbbVar.wh().gm();
                                    if (pcc.qf(hashMap) && !(inputStream2 instanceof GZIPInputStream)) {
                                        inputStream2 = new GZIPInputStream(inputStream2);
                                    }
                                    try {
                                        bArr = new byte[16384];
                                        long j3 = 0;
                                        i = 0;
                                        while (true) {
                                            read = inputStream2.read(bArr, i, 16384 - i);
                                            if (read == i3) {
                                                i += read;
                                                inputStream = inputStream2;
                                                j3 += read;
                                                try {
                                                    if (j3 % 16384 == 0 || j3 == pcc2 - j) {
                                                        randomAccessFile.seek(j2);
                                                        randomAccessFile.write(bArr, 0, i);
                                                        j2 += i;
                                                        i = 0;
                                                    }
                                                    if (pcc.this.vh) {
                                                        throw new IOException("net is cancel");
                                                    }
                                                    inputStream2 = inputStream;
                                                    i3 = -1;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream2 = inputStream;
                                                    try {
                                                        pccVar.pcc(pcc.this, new IOException(th.getMessage()));
                                                        if (!vj) {
                                                            pcc.this.ork();
                                                        }
                                                        if (inputStream2 != null) {
                                                            try {
                                                                inputStream2.close();
                                                            } catch (Throwable unused2) {
                                                            }
                                                        }
                                                        try {
                                                            randomAccessFile.close();
                                                            return;
                                                        } catch (Throwable unused3) {
                                                            return;
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else {
                                                InputStream inputStream3 = inputStream2;
                                                if (i != 0) {
                                                    randomAccessFile.seek(j2);
                                                    z = false;
                                                    randomAccessFile.write(bArr, 0, i);
                                                } else {
                                                    z = false;
                                                }
                                                if (!vj) {
                                                    pcc2 = pcc.this.sf.length();
                                                }
                                                if (pcc2 > 0 && pcc.this.sf.exists() && pcc.this.sf.length() == pcc2) {
                                                    if (!pcc.this.sf.renameTo(pcc.this.pcc)) {
                                                        pccVar.pcc(pcc.this, new IOException("Rename fail"));
                                                    } else {
                                                        sfVar3.pcc(pcc.this.pcc);
                                                        pccVar.pcc(pcc.this, sfVar3);
                                                    }
                                                } else {
                                                    pccVar.pcc(pcc.this, new IOException(" tempFile.length() == fileSize is" + (pcc.this.sf.length() == pcc2 ? true : z)));
                                                }
                                                if (inputStream3 != null) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused5) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                randomAccessFile.setLength(0L);
                                j2 = 0;
                                inputStream2 = gbbVar.wh().gm();
                                if (pcc.qf(hashMap)) {
                                    inputStream2 = new GZIPInputStream(inputStream2);
                                }
                                bArr = new byte[16384];
                                long j32 = 0;
                                i = 0;
                                while (true) {
                                    read = inputStream2.read(bArr, i, 16384 - i);
                                    if (read == i3) {
                                    }
                                    inputStream2 = inputStream;
                                    i3 = -1;
                                }
                            }
                        } else {
                            pccVar.pcc(pcc.this, sfVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            pccVar.pcc(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd A[Catch: all -> 0x0263, TryCatch #1 {all -> 0x0263, blocks: (B:72:0x01ae, B:74:0x01b4, B:76:0x01b8, B:77:0x01be, B:78:0x01c5, B:80:0x01cd, B:82:0x01dd, B:86:0x01f0, B:90:0x01f9, B:91:0x0200, B:92:0x01e6, B:96:0x0206, B:103:0x021e, B:105:0x0226, B:107:0x0230, B:109:0x023a, B:131:0x0254, B:143:0x0214), top: B:71:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4 A[LOOP:1: B:78:0x01c5->B:88:0x01f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0201 A[SYNTHETIC] */
    @Override // com.bytedance.sdk.component.qf.sf.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.qf.sf pcc() {
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        InputStream gm;
        byte[] bArr;
        int i;
        int read;
        com.bytedance.sdk.component.qf.sf sfVar;
        File file = this.pcc;
        if (file != null && this.sf != null) {
            long j2 = 0;
            if (file.exists() && this.pcc.length() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.qf.sf sfVar2 = new com.bytedance.sdk.component.qf.sf(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
                sfVar2.pcc(this.pcc);
                return sfVar2;
            }
            long length = this.sf.length();
            if (length < 0) {
                length = 0;
            }
            tmg.pcc pccVar = new tmg.pcc();
            pccVar.pcc((Object) oo());
            pcc(pccVar);
            sf("Range", "bytes=" + length + "-");
            if (TextUtils.isEmpty(this.kj)) {
                Log.e("DownloadExecutor", "execute: Url is Empty");
                return null;
            }
            try {
                pccVar.sf(this.kj);
                sf(pccVar);
                try {
                    com.bytedance.sdk.component.sf.pcc.sf pcc = this.gm.pcc(pccVar.pcc().sf());
                    if (pcc == null) {
                        return null;
                    }
                    gbb sf = pcc.sf();
                    if (sf != null) {
                        pcc(sf.vy());
                    }
                    if (sf == null || !sf.oo()) {
                        return null;
                    }
                    HashMap hashMap = new HashMap();
                    wh qf = sf.qf();
                    if (qf != null) {
                        for (int i2 = 0; i2 < qf.pcc(); i2++) {
                            hashMap.put(qf.pcc(i2), qf.sf(i2));
                        }
                    }
                    com.bytedance.sdk.component.qf.sf sfVar3 = new com.bytedance.sdk.component.qf.sf(sf.oo(), sf.gm(), sf.vj(), hashMap, null, sf.sf(), sf.pcc());
                    long pcc2 = sf.wh().pcc();
                    if (pcc2 <= 0) {
                        pcc2 = wh(hashMap);
                    }
                    long length2 = this.sf.length();
                    boolean vj = vj(hashMap);
                    int i3 = -1;
                    if (vj) {
                        pcc2 += length2;
                        String str = (String) hashMap.get(HttpHeaders.CONTENT_RANGE);
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = "bytes " + length2 + "-" + (pcc2 - 1);
                            if (TextUtils.indexOf(str, str2) == -1) {
                                new StringBuilder("execute: The Content-Range Header is invalid Assume[").append(str2).append("] vs Real[").append(str).append("], please remove the temporary file [").append(this.sf);
                                ork();
                                return null;
                            }
                        }
                        j2 = 0;
                    }
                    if (pcc2 > j2 && this.sf.exists() && this.sf.length() == pcc2) {
                        if (!this.sf.renameTo(this.pcc)) {
                            return null;
                        }
                        sfVar3.pcc(this.pcc);
                        return sfVar3;
                    }
                    com.bytedance.sdk.component.qf.sf sfVar4 = sfVar3;
                    try {
                        randomAccessFile = new RandomAccessFile(this.sf, "rw");
                    } catch (Throwable unused) {
                        randomAccessFile = null;
                    }
                    if (vj) {
                        randomAccessFile.seek(length);
                        j = length;
                        try {
                            gm = sf.wh().gm();
                            try {
                                if (qf(hashMap) && !(gm instanceof GZIPInputStream)) {
                                    gm = new GZIPInputStream(gm);
                                }
                                bArr = new byte[16384];
                                i = 0;
                                long j3 = 0;
                                while (true) {
                                    read = gm.read(bArr, i, 16384 - i);
                                    if (read != i3) {
                                        com.bytedance.sdk.component.qf.sf sfVar5 = sfVar4;
                                        if (read != 0) {
                                            randomAccessFile.seek(j);
                                            randomAccessFile.write(bArr, 0, i);
                                        }
                                        if (!vj || length == 0) {
                                            pcc2 = this.sf.length();
                                        }
                                        if (pcc2 <= 0 || !this.sf.exists() || this.sf.length() != pcc2) {
                                            this.sf.length();
                                            if (gm != null) {
                                                try {
                                                    gm.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            try {
                                                randomAccessFile.close();
                                                return null;
                                            } catch (Throwable unused3) {
                                                return null;
                                            }
                                        }
                                        if (this.sf.renameTo(this.pcc)) {
                                            sfVar5.pcc(this.pcc);
                                            if (gm != null) {
                                                try {
                                                    gm.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused5) {
                                            }
                                            return sfVar5;
                                        }
                                        if (gm != null) {
                                            try {
                                                gm.close();
                                            } catch (Throwable unused6) {
                                            }
                                        }
                                        try {
                                            randomAccessFile.close();
                                            return null;
                                        } catch (Throwable unused7) {
                                            return null;
                                        }
                                    }
                                    i += read;
                                    sfVar = sfVar4;
                                    j3 += read;
                                    if (j3 % 16384 != 0 && j3 != pcc2 - length) {
                                        if (!this.vh) {
                                            throw new IOException("net is cancel");
                                        }
                                        sfVar4 = sfVar;
                                        i3 = -1;
                                    }
                                    randomAccessFile.seek(j);
                                    randomAccessFile.write(bArr, 0, i);
                                    j += i;
                                    i = 0;
                                    if (!this.vh) {
                                    }
                                }
                            } catch (Throwable unused8) {
                                inputStream = gm;
                                if (!vj) {
                                    try {
                                        ork();
                                    } finally {
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused9) {
                                    }
                                }
                                try {
                                    randomAccessFile.close();
                                    return null;
                                } catch (Throwable unused10) {
                                    return null;
                                }
                            }
                        } catch (Throwable unused11) {
                            inputStream = null;
                        }
                    } else {
                        randomAccessFile.setLength(0L);
                        j = 0;
                        gm = sf.wh().gm();
                        if (qf(hashMap)) {
                            gm = new GZIPInputStream(gm);
                        }
                        bArr = new byte[16384];
                        i = 0;
                        long j32 = 0;
                        while (true) {
                            read = gm.read(bArr, i, 16384 - i);
                            if (read != i3) {
                            }
                            sfVar4 = sfVar;
                            i3 = -1;
                        }
                    }
                } catch (IOException unused12) {
                    ork();
                    return null;
                }
            } catch (IllegalArgumentException unused13) {
                Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean vj(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long wh(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey(HttpHeaders.CONTENT_LENGTH) ? map.get(HttpHeaders.CONTENT_LENGTH) : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean qf(Map<String, String> map) {
        return TextUtils.equals(map.get(HttpHeaders.CONTENT_ENCODING), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ork() {
        try {
            this.pcc.delete();
        } catch (Throwable unused) {
        }
        try {
            this.sf.delete();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.qf.sf.gm
    public void sf() {
        this.vh = true;
        super.sf();
    }
}
