package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133iw extends AbstractC0952et {
    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1358nw C(AbstractC1403ow abstractC1403ow) {
        C1358nw c1358nw;
        C1358nw c1358nw2 = C1358nw.f14731c;
        synchronized (abstractC1403ow) {
            c1358nw = abstractC1403ow.f14876m;
            if (c1358nw != c1358nw2) {
                abstractC1403ow.f14876m = c1358nw2;
            }
        }
        return c1358nw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void N(C1358nw c1358nw, C1358nw c1358nw2) {
        c1358nw.f14733b = c1358nw2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void S(C1358nw c1358nw, Thread thread) {
        c1358nw.f14732a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean Y(AbstractC1403ow abstractC1403ow, C1000fw c1000fw, C1000fw c1000fw2) {
        synchronized (abstractC1403ow) {
            try {
                if (abstractC1403ow.f14875l != c1000fw) {
                    return false;
                }
                abstractC1403ow.f14875l = c1000fw2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean b0(AbstractC1403ow abstractC1403ow, Object obj, Object obj2) {
        synchronized (abstractC1403ow) {
            try {
                if (abstractC1403ow.f14874k != obj) {
                    return false;
                }
                abstractC1403ow.f14874k = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean d0(AbstractC1403ow abstractC1403ow, C1358nw c1358nw, C1358nw c1358nw2) {
        synchronized (abstractC1403ow) {
            try {
                if (abstractC1403ow.f14876m != c1358nw) {
                    return false;
                }
                abstractC1403ow.f14876m = c1358nw2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1000fw h(AbstractC1403ow abstractC1403ow) {
        C1000fw c1000fw;
        C1000fw c1000fw2 = C1000fw.f13528d;
        synchronized (abstractC1403ow) {
            c1000fw = abstractC1403ow.f14875l;
            if (c1000fw != c1000fw2) {
                abstractC1403ow.f14875l = c1000fw2;
            }
        }
        return c1000fw;
    }
}
