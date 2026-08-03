package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zze extends com.google.android.gms.games.internal.v2.appshortcuts.zzg {
    private final android.content.Context zza;

    public zze(android.content.Context context) {
        super(null);
        this.zza = context.getApplicationContext();
    }

    static /* synthetic */ com.google.android.gms.games.internal.v2.appshortcuts.zzh zza(com.google.android.gms.internal.games_v2.zzgg zzggVar, com.google.android.gms.internal.games_v2.zzgg zzggVar2, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return task.isSuccessful() ? (com.google.android.gms.games.internal.v2.appshortcuts.zzh) task.getResult() : zze(zzggVar, zzggVar2);
    }

    public static /* synthetic */ void zzb(com.google.android.gms.games.internal.v2.appshortcuts.zze zzeVar) {
        com.google.android.gms.tasks.Task forResult;
        android.content.Context context = zzeVar.zza;
        final com.google.android.gms.games.internal.v2.appshortcuts.zzs zza = com.google.android.gms.games.internal.v2.appshortcuts.zzu.zza(context, com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.class);
        final android.content.pm.ShortcutManager shortcutManager = (android.content.pm.ShortcutManager) context.getSystemService(android.content.pm.ShortcutManager.class);
        final com.google.android.gms.internal.games_v2.zzgg zzg = zzg(shortcutManager.getDynamicShortcuts());
        final com.google.android.gms.internal.games_v2.zzgg zzg2 = zzg(shortcutManager.getPinnedShortcuts());
        if (zza == null || zza.zza() <= 0) {
            forResult = com.google.android.gms.tasks.Tasks.forResult(zze(zzg, zzg2));
        } else {
            final com.google.android.gms.games.internal.v2.appshortcuts.zzr zzrVar = new com.google.android.gms.games.internal.v2.appshortcuts.zzr(zzeVar.zza);
            forResult = zzrVar.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(6744).setFeatures(com.google.android.gms.games.zzd.zzg).setAutoResolveMissingFeatures(false).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    ((com.google.android.gms.games.internal.v2.appshortcuts.zzw) ((com.google.android.gms.games.internal.v2.appshortcuts.zzv) obj).getService()).zzd(new com.google.android.gms.games.internal.v2.appshortcuts.zzo(com.google.android.gms.games.internal.v2.appshortcuts.zzr.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), zza, zzg, zzg2);
                }
            }).build()).continueWith(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzb
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return com.google.android.gms.games.internal.v2.appshortcuts.zze.zza(com.google.android.gms.internal.games_v2.zzgg.this, zzg2, task);
                }
            });
        }
        forResult.addOnSuccessListener(com.google.android.gms.internal.games_v2.zzgl.zza(), new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzc
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.android.gms.games.internal.v2.appshortcuts.zzh zzhVar = (com.google.android.gms.games.internal.v2.appshortcuts.zzh) obj;
                java.util.List<java.lang.String> zzd = zzhVar.zzd();
                android.content.pm.ShortcutManager shortcutManager2 = shortcutManager;
                if (zzd != null && !zzd.isEmpty()) {
                    shortcutManager2.removeDynamicShortcuts(zzd);
                }
                java.util.List<android.content.pm.ShortcutInfo> zza2 = zzhVar.zza();
                if (zza2 != null && !zza2.isEmpty()) {
                    shortcutManager2.addDynamicShortcuts(zza2);
                }
                java.util.List<java.lang.String> zzb = zzhVar.zzb();
                if (zzb != null && !zzb.isEmpty()) {
                    shortcutManager2.disableShortcuts(zzb);
                }
                java.util.List<java.lang.String> zzc = zzhVar.zzc();
                if (zzc == null || zzc.isEmpty()) {
                    return;
                }
                shortcutManager2.enableShortcuts(zzc);
            }
        });
    }

    private static com.google.android.gms.games.internal.v2.appshortcuts.zzh zze(com.google.android.gms.internal.games_v2.zzgg zzggVar, com.google.android.gms.internal.games_v2.zzgg zzggVar2) {
        return new com.google.android.gms.games.internal.v2.appshortcuts.zzh(zzf(zzggVar), com.google.android.gms.internal.games_v2.zzgg.zzg(), zzf(zzggVar2), com.google.android.gms.internal.games_v2.zzgg.zzg());
    }

    private static com.google.android.gms.internal.games_v2.zzgg zzf(com.google.android.gms.internal.games_v2.zzgg zzggVar) {
        com.google.android.gms.internal.games_v2.zzgd zzgdVar = new com.google.android.gms.internal.games_v2.zzgd();
        int size = zzggVar.size();
        for (int i = 0; i < size; i++) {
            java.lang.String zza = ((com.google.android.gms.games.internal.v2.appshortcuts.zzj) zzggVar.get(i)).zza();
            if (zza != null) {
                zzgdVar.zza(zza);
            }
        }
        return zzgdVar.zzb();
    }

    private static com.google.android.gms.internal.games_v2.zzgg zzg(java.util.List list) {
        com.google.android.gms.internal.games_v2.zzgd zzgdVar = new com.google.android.gms.internal.games_v2.zzgd();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.content.pm.ShortcutInfo shortcutInfo = (android.content.pm.ShortcutInfo) it.next();
            if (!shortcutInfo.isImmutable() && shortcutInfo.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                zzgdVar.zza(new com.google.android.gms.games.internal.v2.appshortcuts.zzj(shortcutInfo.getId(), shortcutInfo.getExtras(), java.lang.Boolean.valueOf(shortcutInfo.isPinned()), java.lang.Boolean.valueOf(shortcutInfo.isEnabled())));
            }
        }
        return zzgdVar.zzb();
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.zzg
    public final void zzc() {
        com.google.android.gms.internal.games_v2.zzfr.zza();
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzd
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.games.internal.v2.appshortcuts.zze.zzb(com.google.android.gms.games.internal.v2.appshortcuts.zze.this);
            }
        }, "initialize-shortcuts").start();
    }
}
