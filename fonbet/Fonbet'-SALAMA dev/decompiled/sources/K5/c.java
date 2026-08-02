package K5;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.storage.A;
import com.google.firebase.storage.z;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseArray f4091l = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public final int f4092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4093b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.firebase.storage.m f4094c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4095d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f4096e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.firebase.storage.j f4097f;
    public com.google.firebase.storage.s j;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4098g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f4099h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Object f4100i = new Object();

    /* renamed from: k, reason: collision with root package name */
    public Boolean f4101k = Boolean.FALSE;

    public c(int i7, int i8, com.google.firebase.storage.m mVar, byte[] bArr, Uri uri, com.google.firebase.storage.j jVar) {
        this.f4092a = i7;
        this.f4093b = i8;
        this.f4094c = mVar;
        this.f4095d = bArr;
        this.f4096e = uri;
        this.f4097f = jVar;
        SparseArray sparseArray = f4091l;
        synchronized (sparseArray) {
            sparseArray.put(i8, this);
        }
    }

    public static void a() {
        synchronized (f4091l) {
            int i7 = 0;
            while (true) {
                try {
                    SparseArray sparseArray = f4091l;
                    if (i7 < sparseArray.size()) {
                        c cVar = (c) sparseArray.valueAt(i7);
                        if (cVar != null) {
                            cVar.b();
                        }
                        i7++;
                    } else {
                        sparseArray.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static c c(int i7) {
        c cVar;
        SparseArray sparseArray = f4091l;
        synchronized (sparseArray) {
            cVar = (c) sparseArray.get(i7);
        }
        return cVar;
    }

    public static HashMap d(Object obj) {
        if (!(obj instanceof com.google.firebase.storage.d)) {
            z zVar = (z) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("path", zVar.f12057b.d().f12044a.getPath());
            hashMap.put("bytesTransferred", Long.valueOf(zVar.f12092c));
            hashMap.put("totalBytes", Long.valueOf(zVar.f12094e.f11984n));
            com.google.firebase.storage.j jVar = zVar.f12093d;
            if (jVar != null) {
                hashMap.put("metadata", b.f(jVar));
            }
            return hashMap;
        }
        com.google.firebase.storage.d dVar = (com.google.firebase.storage.d) obj;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("path", dVar.f12057b.d().f12044a.getPath());
        boolean isSuccessful = dVar.f12057b.isSuccessful();
        com.google.firebase.storage.e eVar = dVar.f12002d;
        if (isSuccessful) {
            hashMap2.put("bytesTransferred", Long.valueOf(eVar.f12007p));
        } else {
            hashMap2.put("bytesTransferred", Long.valueOf(dVar.f12001c));
        }
        hashMap2.put("totalBytes", Long.valueOf(eVar.f12007p));
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0025, code lost:
    
        if (((r5.j.f12066h & 16) != 0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.f4101k.booleanValue()) {
            return;
        }
        this.f4101k = Boolean.TRUE;
        SparseArray sparseArray = f4091l;
        synchronized (sparseArray) {
            try {
                if ((this.j.f12066h & (-465)) == 0) {
                }
                this.j.p(new int[]{256, 32}, true);
                sparseArray.remove(this.f4093b);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4100i) {
            this.f4100i.notifyAll();
        }
        synchronized (this.f4098g) {
            this.f4098g.notifyAll();
        }
        synchronized (this.f4099h) {
            this.f4099h.notifyAll();
        }
    }

    public final G5.b e(String str) {
        byte[] bArr;
        com.google.firebase.storage.m mVar = this.f4094c;
        com.google.firebase.storage.j jVar = this.f4097f;
        int i7 = this.f4092a;
        if (i7 != 2 || (bArr = this.f4095d) == null) {
            Uri uri = this.f4096e;
            if (i7 != 1 || uri == null) {
                if (i7 != 3 || uri == null) {
                    throw new Exception("Unable to start task. Some arguments have no been initialized.");
                }
                com.google.firebase.storage.e eVar = new com.google.firebase.storage.e(mVar, uri);
                eVar.h();
                this.j = eVar;
            } else if (jVar == null) {
                A a2 = new A(mVar, (com.google.firebase.storage.j) null, uri);
                a2.h();
                this.j = a2;
            } else {
                A a4 = new A(mVar, jVar, uri);
                a4.h();
                this.j = a4;
            }
        } else if (jVar == null) {
            A a7 = new A(mVar, (com.google.firebase.storage.j) null, bArr);
            a7.h();
            this.j = a7;
        } else {
            A a8 = new A(mVar, jVar, bArr);
            a8.h();
            this.j = a8;
        }
        return new G5.b(this, mVar.f12045b, this.j, str);
    }
}
