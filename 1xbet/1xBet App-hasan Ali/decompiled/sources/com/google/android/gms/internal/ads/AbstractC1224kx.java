package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1224kx {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f14308a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f14308a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
