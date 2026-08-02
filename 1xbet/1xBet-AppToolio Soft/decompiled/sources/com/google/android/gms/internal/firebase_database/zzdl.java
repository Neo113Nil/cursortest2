package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.ValueEventListener;

/* loaded from: classes.dex */
final class zzdl implements Comparable<zzdl> {
    private int retryCount;
    private zzch zzap;
    private Transaction.Handler zzjj;
    private ValueEventListener zzjk;
    private int zzjl;
    private long zzjm;
    private boolean zzjn;
    private DatabaseError zzjo;
    private long zzjp;
    private zzja zzjq;
    private zzja zzjr;
    private zzja zzjs;

    private zzdl(zzch zzchVar, Transaction.Handler handler, ValueEventListener valueEventListener, int i, boolean z, long j) {
        this.zzap = zzchVar;
        this.zzjj = handler;
        this.zzjk = valueEventListener;
        this.zzjl = i;
        this.retryCount = 0;
        this.zzjn = z;
        this.zzjm = j;
        this.zzjo = null;
        this.zzjq = null;
        this.zzjr = null;
        this.zzjs = null;
    }

    /* synthetic */ zzdl(zzch zzchVar, Transaction.Handler handler, ValueEventListener valueEventListener, int i, boolean z, long j, zzcl zzclVar) {
        this(zzchVar, handler, valueEventListener, i, z, j);
    }

    static /* synthetic */ int zzd(zzdl zzdlVar) {
        int i = zzdlVar.retryCount;
        zzdlVar.retryCount = i + 1;
        return i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzdl zzdlVar) {
        long j = this.zzjm;
        long j2 = zzdlVar.zzjm;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
