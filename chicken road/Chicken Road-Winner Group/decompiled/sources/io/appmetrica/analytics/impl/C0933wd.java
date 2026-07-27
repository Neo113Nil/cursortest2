package io.appmetrica.analytics.impl;

import d2.C0274d;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933wd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ck f8563a = C0878ua.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0942wm[] fromModel(Map<String, ? extends Object> map) {
        C0942wm c0942wm;
        Map<String, C0493fd> c3 = this.f8563a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C0493fd c0493fd = c3.get(key);
            if (c0493fd == null || value == null) {
                c0942wm = null;
            } else {
                c0942wm = new C0942wm();
                c0942wm.f8594a = key;
                c0942wm.f8595b = (byte[]) c0493fd.f7289c.fromModel(value);
            }
            if (c0942wm != null) {
                arrayList.add(c0942wm);
            }
        }
        Object[] array = arrayList.toArray(new C0942wm[0]);
        if (array != null) {
            return (C0942wm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C0942wm[] c0942wmArr) {
        Map<String, C0493fd> c3 = this.f8563a.c();
        ArrayList arrayList = new ArrayList();
        for (C0942wm c0942wm : c0942wmArr) {
            C0493fd c0493fd = c3.get(c0942wm.f8594a);
            C0274d c0274d = c0493fd != null ? new C0274d(c0942wm.f8594a, c0493fd.f7289c.toModel(c0942wm.f8595b)) : null;
            if (c0274d != null) {
                arrayList.add(c0274d);
            }
        }
        return e2.r.p0(arrayList);
    }
}
