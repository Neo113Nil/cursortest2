package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ty {

    /* renamed from: b, reason: collision with root package name */
    public static final Ty f11706b = new Ty();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11707a = new HashMap();

    public final synchronized void a(String str, AbstractC1314mx abstractC1314mx) {
        try {
            if (!this.f11707a.containsKey(str)) {
                this.f11707a.put(str, abstractC1314mx);
                return;
            }
            if (((AbstractC1314mx) this.f11707a.get(str)).equals(abstractC1314mx)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f11707a.get(str)) + "), cannot insert " + String.valueOf(abstractC1314mx));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (AbstractC1314mx) entry.getValue());
        }
    }
}
