package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class PlayGamesAppShortcutsActivity extends android.app.Activity {
    private android.content.Intent zza;

    public static /* synthetic */ void zza(com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity) {
        playGamesAppShortcutsActivity.startActivityForResult(playGamesAppShortcutsActivity.zza, 1005000001);
        playGamesAppShortcutsActivity.finish();
        java.lang.System.exit(0);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1005000000) {
            return;
        }
        if (i2 != -1) {
            finish();
        } else {
            new com.google.android.gms.internal.games_v2.zzfs(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzaa
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.zza(com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.this);
                }
            }, 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051 A[SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent;
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT < 25) {
            finish();
            return;
        }
        final com.google.android.gms.games.internal.v2.appshortcuts.zzs zza = com.google.android.gms.games.internal.v2.appshortcuts.zzu.zza(this, com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.class);
        if (zza == null) {
            finish();
            return;
        }
        java.lang.String zzb = zza.zzb();
        if (zzb == null || zzb.isEmpty()) {
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(getPackageName()), 795136);
            com.google.android.gms.internal.games_v2.zzgd zzgdVar = new com.google.android.gms.internal.games_v2.zzgd();
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    int componentEnabledSetting = getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
                    if (componentEnabledSetting == 0) {
                        if (activityInfo.enabled) {
                            if (!resolveInfo.activityInfo.exported) {
                                zzgdVar.zza(resolveInfo);
                            }
                        }
                    } else if (componentEnabledSetting == 1) {
                        if (!resolveInfo.activityInfo.exported) {
                        }
                    }
                }
            }
            com.google.android.gms.internal.games_v2.zzgg zzb2 = zzgdVar.zzb();
            int size = zzb2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    zzb = null;
                    break;
                }
                android.content.pm.ActivityInfo activityInfo2 = ((android.content.pm.ResolveInfo) zzb2.get(i)).activityInfo;
                i++;
                if (activityInfo2 != null) {
                    zzb = activityInfo2.name;
                    break;
                }
            }
        }
        if (zzb == null || zzb.isEmpty()) {
            intent = null;
        } else {
            java.lang.String packageName = getPackageName();
            intent = new android.content.Intent().setComponent(new android.content.ComponentName(packageName, zzb)).setPackage(packageName).addFlags(335577088);
        }
        if (intent == null) {
            finish();
            return;
        }
        this.zza = intent;
        final com.google.android.gms.games.internal.v2.appshortcuts.zzr zzrVar = new com.google.android.gms.games.internal.v2.appshortcuts.zzr((android.app.Activity) this);
        android.content.Intent intent2 = getIntent();
        final com.google.android.gms.games.internal.v2.appshortcuts.zzj zzjVar = new com.google.android.gms.games.internal.v2.appshortcuts.zzj(intent2.getStringExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_ID"), (android.os.PersistableBundle) intent2.getParcelableExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_EXTRAS"), null, true);
        zzrVar.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(6745).setFeatures(com.google.android.gms.games.zzd.zzg).setAutoResolveMissingFeatures(false).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.games.internal.v2.appshortcuts.zzw) ((com.google.android.gms.games.internal.v2.appshortcuts.zzv) obj).getService()).zze(new com.google.android.gms.games.internal.v2.appshortcuts.zzp(com.google.android.gms.games.internal.v2.appshortcuts.zzr.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), zza, zzjVar);
            }
        }).build()).addOnCompleteListener(this, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.games.internal.v2.appshortcuts.zzz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.this;
                if (task.isSuccessful()) {
                    playGamesAppShortcutsActivity.startActivityForResult((android.content.Intent) task.getResult(), 1005000000);
                } else {
                    android.util.Log.e("PGShortcutsActivity", "Failed to access intent.", task.getException());
                    playGamesAppShortcutsActivity.finish();
                }
            }
        });
    }
}
