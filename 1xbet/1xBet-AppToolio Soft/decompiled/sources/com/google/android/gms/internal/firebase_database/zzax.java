package com.google.android.gms.internal.firebase_database;

import java.util.List;

/* loaded from: classes.dex */
final class zzax {
    private final Object data;
    private final List<String> zzei;
    private final String zzek;
    private final zzbb zzel;

    private zzax(String str, List<String> list, Object obj, zzbb zzbbVar) {
        this.zzek = str;
        this.zzei = list;
        this.data = obj;
        this.zzel = zzbbVar;
    }

    /* synthetic */ zzax(String str, List list, Object obj, zzbb zzbbVar, zzam zzamVar) {
        this(str, list, obj, zzbbVar);
    }

    public final String getAction() {
        return this.zzek;
    }

    public final Object getData() {
        return this.data;
    }

    public final List<String> getPath() {
        return this.zzei;
    }

    public final zzbb zzai() {
        return this.zzel;
    }
}
