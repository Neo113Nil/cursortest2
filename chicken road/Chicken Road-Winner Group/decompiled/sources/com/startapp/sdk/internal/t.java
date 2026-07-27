package com.startapp.sdk.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f4350d = new t();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4351a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4352b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4353c = new HashMap();

    public final synchronized void a(s sVar) {
        try {
            this.f4351a.add(0, sVar);
            List list = (List) this.f4352b.get(sVar.f4308b);
            if (list == null) {
                list = new ArrayList();
                this.f4352b.put(sVar.f4308b, list);
            }
            list.add(0, sVar);
            List list2 = (List) this.f4353c.get(sVar.f4309c);
            if (list2 == null) {
                list2 = new ArrayList();
                this.f4353c.put(sVar.f4309c, list2);
            }
            list2.add(0, sVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
