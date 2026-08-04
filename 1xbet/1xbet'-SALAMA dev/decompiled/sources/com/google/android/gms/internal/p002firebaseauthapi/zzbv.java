package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv {
    private final List<zzby> zza = new ArrayList();
    private zzng zzb = zzng.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        Iterator<zzby> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().zza = false;
        }
    }

    public final zzbv zza(zzby zzbyVar) {
        if (zzbyVar.zze != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzbyVar.zza) {
            zzb();
        }
        zzbyVar.zze = this;
        this.zza.add(zzbyVar);
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzca.<init>(com.google.android.gms.internal.firebase-auth-api.zzbp, com.google.android.gms.internal.firebase-auth-api.zzbr, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzbz):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzbt zza() throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbv.zza():com.google.android.gms.internal.firebase-auth-api.zzbt");
    }
}
