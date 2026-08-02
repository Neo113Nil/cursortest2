package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.collection.LLRBNode;

/* loaded from: classes.dex */
final class zzih extends LLRBNode.NodeVisitor<zzid, zzja> {
    private boolean zzrf = false;
    private final /* synthetic */ zzii zzrg;
    private final /* synthetic */ zzif zzrh;

    zzih(zzif zzifVar, zzii zziiVar) {
        this.zzrh = zzifVar;
        this.zzrg = zziiVar;
    }

    @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
    public final /* synthetic */ void visitEntry(zzid zzidVar, zzja zzjaVar) {
        zzid zzidVar2 = zzidVar;
        zzja zzjaVar2 = zzjaVar;
        if (!this.zzrf && zzidVar2.compareTo(zzid.zzfe()) > 0) {
            this.zzrf = true;
            this.zzrg.visitEntry(zzid.zzfe(), this.zzrh.zzfl());
        }
        this.zzrg.visitEntry(zzidVar2, zzjaVar2);
    }
}
