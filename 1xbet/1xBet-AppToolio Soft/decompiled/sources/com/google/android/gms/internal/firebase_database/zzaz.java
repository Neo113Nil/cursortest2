package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzaz {
    private String zzek;
    private zzbb zzel;
    private Map<String, Object> zzeq;
    private boolean zzer;

    private zzaz(String str, Map<String, Object> map, zzbb zzbbVar) {
        this.zzek = str;
        this.zzeq = map;
        this.zzel = zzbbVar;
    }

    /* synthetic */ zzaz(String str, Map map, zzbb zzbbVar, zzam zzamVar) {
        this(str, map, zzbbVar);
    }

    public final String getAction() {
        return this.zzek;
    }

    public final zzbb zzai() {
        return this.zzel;
    }

    public final Map<String, Object> zzam() {
        return this.zzeq;
    }

    public final void zzan() {
        this.zzer = true;
    }

    public final boolean zzao() {
        return this.zzer;
    }
}
