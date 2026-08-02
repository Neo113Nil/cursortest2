package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzbc {
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallService");
    private static final android.content.Intent zzc = new android.content.Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    com.google.android.play.core.splitinstall.internal.zzaf zza;
    private final java.lang.String zzd;

    zzbc(android.content.Context context, java.lang.String str) {
        this.zzd = str;
        if (com.google.android.play.core.splitinstall.internal.zzbu.zza(context)) {
            this.zza = new com.google.android.play.core.splitinstall.internal.zzaf(com.google.android.play.core.splitinstall.internal.zzbr.zza(context), zzb, "SplitInstallService", zzc, com.google.android.play.core.splitinstall.zzak.zza, null);
        }
    }

    static /* synthetic */ android.os.Bundle zzb(com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        android.os.Bundle zzo = zzo();
        zzo.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(zznVar.zza()));
        return zzo;
    }

    static /* synthetic */ java.util.ArrayList zzm(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* synthetic */ java.util.ArrayList zzn(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.os.Bundle zzo() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    private static com.google.android.gms.tasks.Task zzp() {
        zzb.zzb("onError(%d)", -14);
        return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.splitinstall.SplitInstallException(-14));
    }

    public final com.google.android.gms.tasks.Task zzc(int i) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("cancelInstall(%d)", java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzas(this, taskCompletionSource, i, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzd(java.util.List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredInstall(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzan(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zze(java.util.List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageInstall(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzao(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzf(java.util.List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredLanguageUninstall(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzap(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzg(java.util.List list) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("deferredUninstall(%s)", list);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzam(this, taskCompletionSource, list, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzh(int i) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionState(%d)", java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzaq(this, taskCompletionSource, i, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzi() {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("getSessionStates", new java.lang.Object[0]);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzar(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zzj(java.util.Collection collection, java.util.Collection collection2, com.google.android.play.core.splitinstall.internal.zzn zznVar) {
        if (this.zza == null) {
            return zzp();
        }
        zzb.zzd("startInstall(%s,%s)", collection, collection2);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.splitinstall.zzal(this, taskCompletionSource, collection, collection2, zznVar, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
