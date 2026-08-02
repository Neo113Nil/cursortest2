package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.collection.LLRBNode;
import java.util.List;

/* loaded from: classes.dex */
final class zzek extends LLRBNode.NodeVisitor<zzid, zzgj<zzed>> {
    private final /* synthetic */ List zzip;
    private final /* synthetic */ zzee zzlb;
    private final /* synthetic */ zzja zzlg;
    private final /* synthetic */ zzfg zzlh;
    private final /* synthetic */ zzfl zzli;

    zzek(zzee zzeeVar, zzja zzjaVar, zzfg zzfgVar, zzfl zzflVar, List list) {
        this.zzlb = zzeeVar;
        this.zzlg = zzjaVar;
        this.zzlh = zzfgVar;
        this.zzli = zzflVar;
        this.zzip = list;
    }

    @Override // com.google.firebase.database.collection.LLRBNode.NodeVisitor
    public final /* synthetic */ void visitEntry(zzid zzidVar, zzgj<zzed> zzgjVar) {
        List zzb;
        zzid zzidVar2 = zzidVar;
        zzgj<zzed> zzgjVar2 = zzgjVar;
        zzja zzjaVar = this.zzlg;
        zzja zzm = zzjaVar != null ? zzjaVar.zzm(zzidVar2) : null;
        zzfg zzb2 = this.zzlh.zzb(zzidVar2);
        zzfl zzc = this.zzli.zzc(zzidVar2);
        if (zzc != null) {
            List list = this.zzip;
            zzb = this.zzlb.zzb(zzc, zzgjVar2, zzm, zzb2);
            list.addAll(zzb);
        }
    }
}
