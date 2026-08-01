package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final File f5738a;
    public final j b;
    public final i d;
    public a f;
    public final HashMap c = new HashMap();
    public final HashMap e = new HashMap();

    public l(File file, j jVar) {
        this.f5738a = file;
        this.b = jVar;
        this.d = new i(file);
        ConditionVariable conditionVariable = new ConditionVariable();
        new k(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized m a(String str, long j) {
        m a2;
        m mVar;
        a aVar = this.f;
        if (aVar != null) {
            throw aVar;
        }
        h hVar = (h) this.d.f5735a.get(str);
        if (hVar == null) {
            mVar = new m(str, j, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                a2 = hVar.a(j);
                if (!a2.d || a2.e.length() == a2.c) {
                    break;
                }
                a();
            }
            mVar = a2;
        }
        if (!mVar.d) {
            if (this.c.containsKey(str)) {
                return null;
            }
            this.c.put(str, mVar);
            return mVar;
        }
        h hVar2 = (h) this.d.f5735a.get(str);
        if (!hVar2.c.remove(mVar)) {
            throw new IllegalStateException();
        }
        int i = hVar2.f5734a;
        if (!mVar.d) {
            throw new IllegalStateException();
        }
        long currentTimeMillis = System.currentTimeMillis();
        File parentFile = mVar.e.getParentFile();
        long j2 = mVar.b;
        Pattern pattern = m.g;
        File file = new File(parentFile, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
        m mVar2 = new m(mVar.f5733a, mVar.b, mVar.c, currentTimeMillis, file);
        if (!mVar.e.renameTo(file)) {
            throw new a("Renaming of " + mVar.e + " to " + file + " failed.");
        }
        hVar2.c.add(mVar2);
        ArrayList arrayList = (ArrayList) this.e.get(mVar.f5733a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f5736a.remove(mVar);
                jVar.b -= mVar.c;
                jVar.f5736a.add(mVar2);
                jVar.b += mVar2.c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.b;
        jVar2.f5736a.remove(mVar);
        jVar2.b -= mVar.c;
        jVar2.f5736a.add(mVar2);
        jVar2.b += mVar2.c;
        jVar2.a(this, 0L);
        return mVar2;
    }

    public final synchronized void b(m mVar) {
        if (mVar != this.c.remove(mVar.f5733a)) {
            throw new IllegalStateException();
        }
        notifyAll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        if (r4 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(l lVar) {
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2;
        File[] listFiles;
        BufferedInputStream bufferedInputStream;
        if (!lVar.f5738a.exists()) {
            lVar.f5738a.mkdirs();
            return;
        }
        i iVar = lVar.d;
        if (!iVar.f) {
            DataInputStream dataInputStream3 = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(iVar.c.a());
                    dataInputStream = new DataInputStream(bufferedInputStream);
                    try {
                    } catch (FileNotFoundException unused) {
                    } catch (IOException e) {
                        e = e;
                        Log.e("CachedContentIndex", "Error reading cache content index file.", e);
                        if (dataInputStream != null) {
                            z.a(dataInputStream);
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = iVar.c;
                        cVar.f5757a.delete();
                        cVar.b.delete();
                        iVar.f5735a.clear();
                        iVar.b.clear();
                        listFiles = lVar.f5738a.listFiles();
                        if (listFiles != null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (dataInputStream2 != null) {
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                dataInputStream = null;
            } catch (IOException e2) {
                e = e2;
                dataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (dataInputStream.readInt() == 1) {
                if ((dataInputStream.readInt() & 1) != 0) {
                    if (iVar.d != null) {
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            iVar.d.init(2, iVar.e, new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, iVar.d));
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e4) {
                            e = e4;
                            throw new IllegalStateException(e);
                        }
                    }
                } else if (iVar.d != null) {
                    iVar.f = true;
                }
                try {
                    int readInt = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt; i2++) {
                        int readInt2 = dataInputStream.readInt();
                        String readUTF = dataInputStream.readUTF();
                        h hVar = new h(readInt2, readUTF, dataInputStream.readLong());
                        iVar.f5735a.put(readUTF, hVar);
                        iVar.b.put(readInt2, readUTF);
                        int hashCode = readUTF.hashCode();
                        long j = hVar.d;
                        i += ((hashCode + (readInt2 * 31)) * 31) + ((int) (j ^ (j >>> 32)));
                    }
                    if (dataInputStream.readInt() == i) {
                        z.a(dataInputStream);
                        listFiles = lVar.f5738a.listFiles();
                        if (listFiles != null) {
                            return;
                        }
                        for (File file : listFiles) {
                            if (!file.getName().equals(CachedContentIndex.FILE_NAME)) {
                                m a2 = file.length() > 0 ? m.a(file, lVar.d) : null;
                                if (a2 != null) {
                                    lVar.a(a2);
                                } else {
                                    file.delete();
                                }
                            }
                        }
                        lVar.d.a();
                        lVar.d.b();
                        return;
                    }
                    z.a(dataInputStream);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar2 = iVar.c;
                    cVar2.f5757a.delete();
                    cVar2.b.delete();
                    iVar.f5735a.clear();
                    iVar.b.clear();
                    listFiles = lVar.f5738a.listFiles();
                    if (listFiles != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream3 = dataInputStream;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        z.a(dataInputStream2);
                    }
                    throw th;
                }
            }
            z.a(dataInputStream);
            com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar22 = iVar.c;
            cVar22.f5757a.delete();
            cVar22.b.delete();
            iVar.f5735a.clear();
            iVar.b.clear();
            listFiles = lVar.f5738a.listFiles();
            if (listFiles != null) {
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final void a(m mVar) {
        i iVar = this.d;
        String str = mVar.f5733a;
        h hVar = (h) iVar.f5735a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        hVar.c.add(mVar);
        ArrayList arrayList = (ArrayList) this.e.get(mVar.f5733a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f5736a.add(mVar);
                jVar.b += mVar.c;
                jVar.a(this, 0L);
            }
        }
        j jVar2 = this.b;
        jVar2.f5736a.add(mVar);
        jVar2.b += mVar.c;
        jVar2.a(this, 0L);
    }

    public final void a(g gVar, boolean z) {
        h hVar = (h) this.d.f5735a.get(gVar.f5733a);
        if (hVar == null || !hVar.c.remove(gVar)) {
            return;
        }
        gVar.e.delete();
        if (z && hVar.c.isEmpty()) {
            i iVar = this.d;
            h hVar2 = (h) iVar.f5735a.remove(hVar.b);
            if (hVar2 != null) {
                if (hVar2.c.isEmpty()) {
                    iVar.b.remove(hVar2.f5734a);
                    iVar.f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
            this.d.b();
        }
        ArrayList arrayList = (ArrayList) this.e.get(gVar.f5733a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j jVar = (j) arrayList.get(size);
                jVar.f5736a.remove(gVar);
                jVar.b -= gVar.c;
            }
        }
        j jVar2 = this.b;
        jVar2.f5736a.remove(gVar);
        jVar2.b -= gVar.c;
    }

    public final void a() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.d.f5735a.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((h) it.next()).c.iterator();
            while (it2.hasNext()) {
                g gVar = (g) it2.next();
                if (gVar.e.length() != gVar.c) {
                    linkedList.add(gVar);
                }
            }
        }
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            a((g) it3.next(), false);
        }
        this.d.a();
        this.d.b();
    }

    public final synchronized long a(String str) {
        h hVar;
        hVar = (h) this.d.f5735a.get(str);
        return hVar == null ? -1L : hVar.d;
    }
}
