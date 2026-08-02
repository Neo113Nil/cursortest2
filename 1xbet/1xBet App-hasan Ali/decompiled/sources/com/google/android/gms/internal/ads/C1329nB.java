package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.nB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329nB extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0901dm f14596a;

    public C1329nB(C0901dm c0901dm) {
        this.f14596a = c0901dm;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C0901dm c0901dm = this.f14596a;
        try {
            C1194kB c1194kB = C1194kB.f14227c;
            Mac mac = (Mac) c1194kB.f14228a.d((String) c0901dm.f13166c);
            mac.init((SecretKeySpec) c0901dm.f13167d);
            return mac;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
