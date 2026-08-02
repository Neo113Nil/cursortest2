package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
final class zzim {
    private int zzrn;
    private final zzio zzrr;
    private StringBuilder zzrk = null;
    private Stack<zzid> zzrl = new Stack<>();
    private int zzrm = -1;
    private boolean zzro = true;
    private final List<zzch> zzrp = new ArrayList();
    private final List<String> zzrq = new ArrayList();

    public zzim(zzio zzioVar) {
        this.zzrr = zzioVar;
    }

    private static void zza(StringBuilder sb, zzid zzidVar) {
        sb.append(zzkq.zzz(zzidVar.zzfg()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zziv<?> zzivVar) {
        zzfr();
        this.zzrm = this.zzrn;
        this.zzrk.append(zzivVar.zza(zzjc.V2));
        this.zzro = true;
        if (this.zzrr.zze(this)) {
            zzfu();
        }
    }

    private final zzch zze(int i) {
        zzid[] zzidVarArr = new zzid[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzidVarArr[i2] = this.zzrl.get(i2);
        }
        return new zzch(zzidVarArr);
    }

    private final boolean zzfo() {
        return this.zzrk != null;
    }

    private final void zzfr() {
        if (zzfo()) {
            return;
        }
        this.zzrk = new StringBuilder();
        this.zzrk.append("(");
        Iterator<zzid> it = zze(this.zzrn).iterator();
        while (it.hasNext()) {
            zza(this.zzrk, it.next());
            this.zzrk.append(":(");
        }
        this.zzro = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfs() {
        this.zzrn--;
        if (zzfo()) {
            this.zzrk.append(")");
        }
        this.zzro = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzft() {
        zzkq.zza(this.zzrn == 0, "Can't finish hashing in the middle processing a child");
        if (zzfo()) {
            zzfu();
        }
        this.zzrq.add("");
    }

    private final void zzfu() {
        zzkq.zza(zzfo(), "Can't end range without starting a range!");
        for (int i = 0; i < this.zzrn; i++) {
            this.zzrk.append(")");
        }
        this.zzrk.append(")");
        zzch zze = zze(this.zzrm);
        this.zzrq.add(zzkq.zzy(this.zzrk.toString()));
        this.zzrp.add(zze);
        this.zzrk = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(zzid zzidVar) {
        zzfr();
        if (this.zzro) {
            this.zzrk.append(",");
        }
        zza(this.zzrk, zzidVar);
        this.zzrk.append(":(");
        if (this.zzrn == this.zzrl.size()) {
            this.zzrl.add(zzidVar);
        } else {
            this.zzrl.set(this.zzrn, zzidVar);
        }
        this.zzrn++;
        this.zzro = false;
    }

    public final int zzfp() {
        return this.zzrk.length();
    }

    public final zzch zzfq() {
        return zze(this.zzrn);
    }
}
