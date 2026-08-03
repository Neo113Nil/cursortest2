package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzekr extends com.google.android.gms.internal.ads.zzbyt {
    final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdzl zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final com.google.android.gms.internal.ads.zzekg zze;
    private java.lang.String zzf;
    private java.lang.String zzg;

    public zzekr(android.content.Context context, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zzb = context;
        this.zzc = zzdzlVar;
        this.zzd = zzuVar;
        this.zze = zzekgVar;
    }

    public static void zzd(android.content.Context context, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzekg zzekgVar, java.lang.String str, java.lang.String str2) {
        zzk(context, zzdzlVar, zzekgVar, str, str2, new java.util.HashMap());
    }

    public static void zzk(android.content.Context context, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzekg zzekgVar, java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String str3;
        java.lang.String str4 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdzlVar != null) {
            com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
            zza.zzc("gqi", str);
            zza.zzc("action", str2);
            zza.zzc("device_connectivity", str4);
            zza.zzc("event_timestamp", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                zza.zzc((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            str3 = zza.zzg();
        } else {
            str3 = "";
        }
        zzekgVar.zze(new com.google.android.gms.internal.ads.zzeki(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, str3, 2));
    }

    public static final android.app.PendingIntent zzr(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra(com.facebook.share.internal.ShareConstants.MEDIA_URI, str3);
        if (android.os.Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, com.google.android.gms.ads.NotificationHandlerActivity.CLASS_NAME);
            return com.google.android.gms.internal.ads.zzgqj.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, com.google.android.gms.ads.AdService.CLASS_NAME);
        android.content.ClipData clipData = com.google.android.gms.internal.ads.zzgqj.zza;
        return com.google.android.gms.internal.ads.zzgqj.zzb(context, 0, intent, 1140850688, 0);
    }

    private final void zzs(final android.app.Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (androidx.core.app.NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", com.google.android.gms.internal.ads.zzgwp.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity);
            zzN.setTitle(zzx(com.google.android.gms.ads.impl.R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(com.google.android.gms.ads.impl.R.string.notifications_permission_confirm, com.google.common.net.HttpHeaders.ALLOW), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekm
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.google.android.gms.internal.ads.zzekr.this.zzo(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzx(com.google.android.gms.ads.impl.R.string.notifications_permission_decline, "Don't allow"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekn
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i) {
                    com.google.android.gms.internal.ads.zzekr.this.zzp(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeko
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(android.content.DialogInterface dialogInterface) {
                    com.google.android.gms.internal.ads.zzekr.this.zzq(zzmVar, dialogInterface);
                }
            });
            zzN.create().show();
            zzw(this.zzf, "rtsdi", com.google.android.gms.internal.ads.zzgwp.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt() {
        boolean z;
        boolean z2;
        android.content.Context context;
        com.google.android.gms.ads.internal.util.zzbo zzC;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            context = this.zzb;
            zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            com.google.android.gms.dynamic.IObjectWrapper wrap = com.google.android.gms.dynamic.ObjectWrapper.wrap(context);
            java.lang.String str = this.zzg;
            java.lang.String str2 = this.zzf;
            com.google.android.gms.internal.ads.zzejy zzejyVar = (com.google.android.gms.internal.ads.zzejy) this.zza.get(str2);
            z = zzC.zzg(wrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzejyVar == null ? "" : zzejyVar.zzb()));
        } catch (android.os.RemoteException e) {
            e = e;
            z = false;
        }
        if (z) {
            return;
        }
        try {
            z2 = zzC.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzg, this.zzf);
        } catch (android.os.RemoteException e2) {
            e = e2;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
            z2 = z;
            if (z2) {
            }
        }
        if (z2) {
            this.zze.zzd(this.zzf);
            zzw(this.zzf, "offline_notification_worker_not_scheduled", com.google.android.gms.internal.ads.zzgwp.zza());
        }
    }

    private final void zzu(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        android.app.AlertDialog zzv = zzv(activity, zzmVar);
        zzv.show();
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new com.google.android.gms.internal.ads.zzekj(this, zzv, timer, zzmVar), 3000L);
    }

    private final android.app.AlertDialog zzv(android.app.Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzN(activity).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(android.content.DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        android.content.res.XmlResourceParser zzy = zzy(com.google.android.gms.ads.impl.R.layout.offline_ads_dialog);
        if (zzy == null) {
            onCancelListener.setMessage(zzx(com.google.android.gms.ads.impl.R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            android.view.View inflate = activity.getLayoutInflater().inflate(zzy, (android.view.ViewGroup) null);
            onCancelListener.setView(inflate);
            java.lang.String zzz = zzz();
            if (!android.text.TextUtils.isEmpty(zzz)) {
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.google.android.gms.ads.impl.R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzz);
            }
            com.google.android.gms.internal.ads.zzejy zzejyVar = (com.google.android.gms.internal.ads.zzejy) this.zza.get(this.zzf);
            android.graphics.drawable.Drawable zzc = zzejyVar != null ? zzejyVar.zzc() : null;
            if (zzc != null) {
                ((android.widget.ImageView) inflate.findViewById(com.google.android.gms.ads.impl.R.id.offline_dialog_image)).setImageDrawable(zzc);
            }
            android.app.AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            return create;
        } catch (android.content.res.Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(com.google.android.gms.ads.impl.R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(java.lang.String str, java.lang.String str2, java.util.Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static java.lang.String zzx(int i, java.lang.String str) {
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            return str;
        }
        try {
            return zzf.getString(i);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return str;
        }
    }

    private static android.content.res.XmlResourceParser zzy(int i) {
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (zzf == null) {
            return null;
        }
        try {
            return zzf.getLayout(i);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    private final java.lang.String zzz() {
        com.google.android.gms.internal.ads.zzejy zzejyVar = (com.google.android.gms.internal.ads.zzejy) this.zza.get(this.zzf);
        return zzejyVar == null ? "" : zzejyVar.zza();
    }

    public final void zzc(java.lang.String str, com.google.android.gms.internal.ads.zzdpt zzdptVar) {
        java.lang.String zzQ = zzdptVar.zzQ();
        java.lang.String zzB = zzdptVar.zzB();
        java.lang.String str2 = "";
        if (android.text.TextUtils.isEmpty(zzQ)) {
            zzQ = zzB != null ? zzB : "";
        }
        com.google.android.gms.internal.ads.zzbme zzD = zzdptVar.zzD();
        if (zzD != null) {
            try {
                str2 = zzD.zzc().toString();
            } catch (android.os.RemoteException unused) {
            }
        }
        com.google.android.gms.internal.ads.zzbme zzP = zzdptVar.zzP();
        android.graphics.drawable.Drawable drawable = null;
        if (zzP != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper zzb = zzP.zzb();
                if (zzb != null) {
                    drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzb);
                }
            } catch (android.os.RemoteException unused2) {
            }
        }
        this.zza.put(str, new com.google.android.gms.internal.ads.zzejv(zzQ, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zze(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                java.lang.String stringExtra2 = intent.getStringExtra("gws_query_id");
                java.lang.String stringExtra3 = intent.getStringExtra(com.facebook.share.internal.ShareConstants.MEDIA_URI);
                android.content.Context context = this.zzb;
                boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                java.util.HashMap hashMap = new java.util.HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == zzs ? (char) 1 : (char) 2;
                    hashMap.put("obvs", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
                    hashMap.put("olaih", java.lang.String.valueOf(stringExtra3.startsWith(androidx.webkit.ProxyConfig.MATCH_HTTP)));
                    try {
                        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new android.content.Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(android.net.Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (android.content.ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", hashMap);
                try {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (r9 == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        com.google.android.gms.internal.ads.zzekg.zzi(writableDatabase, stringExtra2);
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    java.lang.String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzekg.zzf(com.google.android.gms.ads.internal.util.client.zzu.this, (android.database.sqlite.SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzekt zzektVar = (com.google.android.gms.internal.ads.zzekt) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        final android.app.Activity zza = zzektVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzektVar.zzb();
        this.zzf = zzektVar.zzc();
        this.zzg = zzektVar.zzd();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjK)).booleanValue()) {
            zzs(zza, zzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", com.google.android.gms.internal.ads.zzgwp.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza);
        zzN.setTitle(zzx(com.google.android.gms.ads.impl.R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(com.google.android.gms.ads.impl.R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(com.google.android.gms.ads.impl.R.string.offline_opt_in_confirm, "OK"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.google.android.gms.internal.ads.zzekr.this.zzl(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzx(com.google.android.gms.ads.impl.R.string.offline_opt_in_decline, "No thanks"), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.google.android.gms.internal.ads.zzekr.this.zzm(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(android.content.DialogInterface dialogInterface) {
                com.google.android.gms.internal.ads.zzekr.this.zzn(zzb, dialogInterface);
            }
        });
        zzN.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(java.lang.String[] strArr, int[] iArr, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                com.google.android.gms.internal.ads.zzekt zzektVar = (com.google.android.gms.internal.ads.zzekt) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
                android.app.Activity zza = zzektVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzektVar.zzb();
                java.util.HashMap hashMap = new java.util.HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzt();
                    zzu(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dc, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        android.graphics.Bitmap bitmap;
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        java.lang.String str = zzaVar.zza;
        java.lang.String str2 = zzaVar.zzb;
        java.lang.String str3 = zzaVar.zzc;
        java.lang.String zzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        android.app.PendingIntent zzr = zzr(context, "offline_notification_clicked", str2, str);
        android.app.PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str2, str);
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, "offline_notification_channel");
        if (android.text.TextUtils.isEmpty(zzz)) {
            builder.setContentTitle(zzx(com.google.android.gms.ads.impl.R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(java.lang.String.format(zzx(com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzz));
        }
        builder.setAutoCancel(true).setDeleteIntent(zzr2).setContentIntent(zzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjL)).intValue());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjN)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = android.graphics.BitmapFactory.decodeStream(new java.net.URL(str3).openConnection().getInputStream());
            } catch (java.io.IOException unused) {
            }
            if (bitmap != null) {
                try {
                    builder.setLargeIcon(bitmap).setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((android.graphics.Bitmap) null));
                } catch (android.content.res.Resources.NotFoundException unused2) {
                }
            }
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
            java.util.HashMap hashMap = new java.util.HashMap();
            notificationManager.notify(str2, 54321, builder.build());
            java.lang.String str4 = "offline_notification_impression";
            zzw(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        android.app.NotificationManager notificationManager2 = (android.app.NotificationManager) context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        notificationManager2.notify(str2, 54321, builder.build());
        java.lang.String str42 = "offline_notification_impression";
        zzw(str2, str42, hashMap2);
    }

    final /* synthetic */ void zzl(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", hashMap);
        zzs(activity, zzmVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(android.app.Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, android.content.DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
