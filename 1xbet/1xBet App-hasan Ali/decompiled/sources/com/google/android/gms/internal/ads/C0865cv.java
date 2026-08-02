package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865cv extends Ou implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f13061k;

    /* renamed from: l, reason: collision with root package name */
    public final List f13062l;

    public C0865cv(Object obj, List list) {
        this.f13061k = obj;
        this.f13062l = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13061k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13062l;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
