package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzs {
    public static final com.google.android.gms.internal.ads.zzgam zza = new com.google.android.gms.ads.internal.util.zzf(android.os.Looper.getMainLooper());
    private java.lang.String zzh;
    private volatile java.lang.String zzi;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference(null);
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference(new android.os.Bundle());
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean();
    private boolean zzf = true;
    private final java.lang.Object zzg = new java.lang.Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final java.util.concurrent.Executor zzl = java.util.concurrent.Executors.newSingleThreadExecutor();

    public static final int zzA(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof android.widget.ScrollView) {
                return 1;
            }
            if (parent instanceof android.widget.AbsListView) {
                return 2;
            }
            if (parent instanceof android.widget.HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof androidx.core.view.ScrollingView) {
                return 4;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzji)).booleanValue()) {
                java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjj);
                if (android.text.TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (java.lang.String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(java.util.Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final java.lang.String zzB() {
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        return zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public static final com.google.android.gms.ads.internal.util.zzbo zzC(android.content.Context context) {
        try {
            java.lang.Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (!(newInstance instanceof android.os.IBinder)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            android.os.IBinder iBinder = (android.os.IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof com.google.android.gms.ads.internal.util.zzbo ? (com.google.android.gms.ads.internal.util.zzbo) queryLocalInterface : new com.google.android.gms.ads.internal.util.zzbm(iBinder);
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzD(android.content.Context context, java.lang.String str) {
        android.content.Context zza2 = com.google.android.gms.internal.ads.zzcbn.zza(context);
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzE(android.content.Context context) {
        try {
            return com.google.android.gms.common.util.DeviceProperties.isBstar(context);
        } catch (java.lang.NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzF(java.lang.String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return false;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgg)).booleanValue()) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgi);
        if (!str2.isEmpty()) {
            for (java.lang.String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        java.lang.String str4 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgh);
        if (str4.isEmpty()) {
            return true;
        }
        for (java.lang.String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzG(android.content.Context context) {
        android.app.KeyguardManager zzad;
        return (context == null || (zzad = zzad(context)) == null || !zzad.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzH(android.content.Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (java.lang.ClassNotFoundException unused) {
            return true;
        } catch (java.lang.Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzI() {
        int myUid = android.os.Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzJ(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.os.PowerManager powerManager;
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (android.os.Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (android.os.PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static final boolean zzK(android.content.Context context) {
        try {
            android.os.Bundle zzag = zzag(context);
            java.lang.String string = zzag.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (android.text.TextUtils.isEmpty(zzaf(zzag))) {
                if (!android.text.TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (android.os.RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzL(android.content.Context context) {
        android.view.Window window;
        if ((context instanceof android.app.Activity) && (window = ((android.app.Activity) context).getWindow()) != null && window.getDecorView() != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzM(android.view.View view, int i, android.view.MotionEvent motionEvent) {
        java.lang.String str;
        int i2;
        int i3;
        int i4;
        java.lang.String str2;
        com.google.android.gms.internal.ads.zzfkf zzC;
        com.google.android.gms.internal.ads.zzfki zzaC;
        android.view.View view2 = view;
        int[] iArr = new int[2];
        android.graphics.Rect rect = new android.graphics.Rect();
        try {
            java.lang.String packageName = view.getContext().getPackageName();
            if (view2 instanceof com.google.android.gms.internal.ads.zzdwl) {
                view2 = ((com.google.android.gms.internal.ads.zzdwl) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzh) || (view2 instanceof com.google.android.gms.ads.nativead.NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long zzy = zzy(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            java.lang.String str3 = "none";
            if (!(view2 instanceof com.google.android.gms.internal.ads.zzcmb) || (zzaC = ((com.google.android.gms.internal.ads.zzcmb) view2).zzaC()) == null) {
                str2 = "none";
            } else {
                str2 = zzaC.zzb;
                int hashCode = view2.hashCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(hashCode).length());
                sb.append(str2);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if ((view2 instanceof com.google.android.gms.internal.ads.zzckl) && (zzC = ((com.google.android.gms.internal.ads.zzckl) view2).zzC()) != null) {
                str = com.google.android.gms.internal.ads.zzfkf.zza(zzC.zzb);
                i2 = zzC.zze;
                str3 = zzC.zzE;
            }
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", java.lang.Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, java.lang.Integer.valueOf(i2), view2.getClass().getName(), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(view2.getWidth()), java.lang.Integer.valueOf(view2.getHeight()), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i3), java.lang.Long.valueOf(zzy), java.lang.Integer.toString(i, 2));
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(format);
        } catch (java.lang.Exception e) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e);
        }
    }

    public static final android.app.AlertDialog.Builder zzN(android.content.Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new android.app.AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzO(android.content.Context context, java.lang.String str, java.lang.String str2) {
        new com.google.android.gms.ads.internal.util.zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzP(android.content.Context context, java.lang.Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkz.zzb.zze()).booleanValue()) {
                com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final void zzQ(android.content.Context context, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        com.google.android.gms.internal.ads.zzdzk zza2 = zzdzlVar.zza();
        zza2.zzc("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        zza2.zzc("foreground", true != zzJ(context) ? "1" : "0");
        zza2.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
        if (zzfkfVar != null) {
            java.util.List list = zzfkfVar.zzt;
            if (!list.isEmpty()) {
                zza2.zzc("ancn", (java.lang.String) list.get(0));
            }
            zza2.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzfkf.zza(zzfkfVar.zzb));
        }
        zza2.zzd();
    }

    public static final boolean zzR(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoY)).booleanValue() && zzfkfVar != null && zzfkfVar.zze == 4;
    }

    public static final int zzS(java.lang.String str) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException e) {
            java.lang.String concat = "Could not parse value:".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return 0;
        }
    }

    public static final java.util.Map zzT(android.net.Uri uri) {
        java.lang.String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzt)).booleanValue()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str : uri.getQueryParameterNames()) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(android.net.Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : android.net.Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] zzV(android.app.Activity activity) {
        android.view.View findViewById;
        android.view.Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzw() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzW(android.app.Activity activity) {
        android.view.View findViewById;
        android.view.Window window = activity.getWindow();
        int[] zzw = (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzw() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzw[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzw[1])};
    }

    public static final boolean zzX(android.view.View view, android.os.PowerManager powerManager, android.app.KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzc().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzy = zzy(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbX)).booleanValue() || view.getLocalVisibleRect(new android.graphics.Rect()) || view.getGlobalVisibleRect(new android.graphics.Rect())) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlY)).booleanValue()) {
                    return true;
                }
                if (zzy >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzma)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzY(android.content.Context context, android.content.Intent intent) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmv)).booleanValue()) {
            zzaj(context, intent);
            return;
        }
        try {
            zzaj(context, intent);
        } catch (java.lang.SecurityException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzZ(android.content.Context context, android.net.Uri uri) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
            android.os.Bundle bundle = new android.os.Bundle();
            intent.putExtras(bundle);
            zzq(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            java.lang.String uri2 = uri.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        } catch (android.content.ActivityNotFoundException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        java.lang.String sb2 = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        return 60000;
    }

    public static final int[] zzaa(android.app.Activity activity) {
        int[] zzV = zzV(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[1])};
    }

    public static final boolean zzab(android.view.View view, android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return zzX(view, applicationContext != null ? (android.os.PowerManager) applicationContext.getSystemService("power") : null, zzad(context));
    }

    public static final void zzac(android.content.Context context, android.content.Intent intent, com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoD)).booleanValue() || !(context instanceof com.google.android.gms.internal.ads.zzcmw)) {
            zzY(context, intent);
            return;
        }
        try {
            android.net.Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoF))) {
                    ((com.google.android.gms.internal.ads.zzcmw) context).zza(intent, 236);
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoE)).booleanValue() || zzdzlVar == null) {
                        return;
                    }
                    com.google.android.gms.internal.ads.zzdzk zza2 = zzdzlVar.zza();
                    zza2.zzc("action", "hila");
                    zza2.zzc("gqi", com.google.android.gms.internal.ads.zzgua.zza(str));
                    zza2.zzf();
                    return;
                }
            }
            zzY(context, intent);
        } catch (android.content.ActivityNotFoundException e) {
            e = e;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (java.lang.SecurityException e2) {
            e = e2;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzY(context, intent);
        } catch (java.lang.Exception e3) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "AdUtil.startActivityForResult");
            zzY(context, intent);
        }
    }

    private static android.app.KeyguardManager zzad(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof android.app.KeyguardManager)) {
            return null;
        }
        return (android.app.KeyguardManager) systemService;
    }

    private static boolean zzae(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = java.util.regex.Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    private static java.lang.String zzaf(android.os.Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        java.lang.String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !android.text.TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static android.os.Bundle zzag(android.content.Context context) throws android.os.RemoteException {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    private static final void zzah(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzai(androidx.browser.customtabs.CustomTabsIntent.Builder builder, android.os.Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, -1);
        if (i >= 0) {
            builder.setInitialActivityHeightPx(i);
        }
        int i2 = bundle.getInt("cbp", -1);
        if (i2 < 0 || i2 > 2) {
            return;
        }
        builder.setCloseButtonPosition(i2);
    }

    private static final void zzaj(android.content.Context context, android.content.Intent intent) {
        try {
            context.startActivity(intent);
        } catch (java.lang.Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final java.lang.String zzak(final android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        if (str == null) {
            return zzs();
        }
        try {
            com.google.android.gms.ads.internal.util.zzce zza2 = com.google.android.gms.ads.internal.util.zzce.zza();
            if (android.text.TextUtils.isEmpty(zza2.zza)) {
                if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
                    str3 = (java.lang.String) com.google.android.gms.ads.internal.util.zzcb.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzcc
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ java.lang.Object call() {
                            android.content.Context context2 = context;
                            android.content.SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (!android.text.TextUtils.isEmpty(string)) {
                                com.google.android.gms.ads.internal.util.zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            com.google.android.gms.ads.internal.util.zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(context2);
                            com.google.android.gms.common.util.SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
                    str3 = (java.lang.String) com.google.android.gms.ads.internal.util.zzcb.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ java.lang.Object call() {
                            android.content.SharedPreferences sharedPreferences;
                            android.content.Context context2 = remoteContext;
                            android.content.Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                com.google.android.gms.ads.internal.util.zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                com.google.android.gms.ads.internal.util.zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            java.lang.String string = sharedPreferences.getString("user_agent", "");
                            if (android.text.TextUtils.isEmpty(string)) {
                                com.google.android.gms.ads.internal.util.zze.zza("Reading user agent from WebSettings");
                                string = android.webkit.WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    com.google.android.gms.ads.internal.util.zze.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                zza2.zza = str3;
            }
            str2 = zza2.zza;
        } catch (java.lang.Exception unused) {
            str2 = null;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = android.webkit.WebSettings.getDefaultUserAgent(context);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = zzs();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 10 + str.length());
        sb.append(str2);
        sb.append(" (Mobile; ");
        sb.append(str);
        java.lang.String sb2 = sb.toString();
        try {
            if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 4);
                sb3.append(sb2);
                sb3.append(";aia");
                sb2 = sb3.toString();
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getUserAgent");
        }
        return sb2.concat(")");
    }

    public static java.util.List zzj() {
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zza;
        java.util.List zzf = com.google.android.gms.ads.internal.client.zzba.zzb().zzf();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = zzf.iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)).zzd((java.lang.String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(java.lang.Long.valueOf((java.lang.String) it2.next()));
                } catch (java.lang.NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static com.google.android.gms.ads.internal.util.zzq zzk(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                java.util.Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                return new com.google.android.gms.ads.internal.util.zzq(locale.getLanguage(), locale.getCountry());
            }
            java.util.Locale locale2 = context.getResources().getConfiguration().locale;
            return new com.google.android.gms.ads.internal.util.zzq(locale2.getLanguage(), locale2.getCountry());
        }
        com.google.android.gms.ads.internal.util.zzq zzqVar = new com.google.android.gms.ads.internal.util.zzq(java.util.Locale.getDefault().getLanguage(), java.util.Locale.getDefault().getCountry());
        try {
            android.app.LocaleManager localeManager = (android.app.LocaleManager) context.getSystemService(android.app.LocaleManager.class);
            if (localeManager == null || localeManager.getSystemLocales().isEmpty()) {
                return zzqVar;
            }
            java.util.Locale locale3 = localeManager.getSystemLocales().get(0);
            return new com.google.android.gms.ads.internal.util.zzq(locale3.getLanguage(), locale3.getCountry());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdUtil.getSystemDefaultLocale");
            return zzqVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzo(android.view.View view) {
        android.app.Activity activity;
        android.view.View rootView = view.getRootView();
        if (rootView != null) {
            android.content.Context context = rootView.getContext();
            if (context instanceof android.app.Activity) {
                activity = (android.app.Activity) context;
                if (activity != null) {
                    return false;
                }
                android.view.Window window = activity.getWindow();
                android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final boolean zzp(final android.content.Context context, final android.webkit.WebSettings webSettings) {
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                java.lang.String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                android.webkit.WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbw)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return true;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzq(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras() != null ? intent.getExtras() : new android.os.Bundle();
        extras.putBinder(androidx.browser.customtabs.CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final java.lang.String zzr(android.content.Context context) throws android.os.RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaf(zzag(context));
    }

    static final java.lang.String zzs() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (android.os.Build.VERSION.RELEASE != null) {
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            sb.append(android.os.Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(java.util.Locale.getDefault());
        if (android.os.Build.DEVICE != null) {
            sb.append("; ");
            sb.append(android.os.Build.DEVICE);
            if (android.os.Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(android.os.Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final java.lang.String zzt() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length());
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(str2);
        return sb.toString();
    }

    public static final java.lang.Integer zzu(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("display");
        if (systemService instanceof android.hardware.display.DisplayManager) {
            return java.lang.Integer.valueOf(((android.hardware.display.DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final android.util.DisplayMetrics zzv(android.view.WindowManager windowManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzw() {
        return new int[]{0, 0};
    }

    public static final java.util.Map zzx(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.util.HashSet hashSet = new java.util.HashSet();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        java.lang.String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzy(android.view.View view) {
        float f = Float.MAX_VALUE;
        do {
            if (!(view instanceof android.view.View)) {
                break;
            }
            android.view.View view2 = (android.view.View) view;
            f = java.lang.Math.min(f, view2.getAlpha());
            view = view2.getParent();
        } while (f > 0.0f);
        return java.lang.Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.webkit.WebResourceResponse zzz(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.google.common.net.HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            hashMap.put(com.google.common.net.HttpHeaders.CACHE_CONTROL, "max-stale=3600");
            java.lang.String str3 = (java.lang.String) new com.google.android.gms.ads.internal.util.zzbl(context).zzb(0, str2, hashMap, null).get(60L, java.util.concurrent.TimeUnit.SECONDS);
            if (str3 != null) {
                return new android.webkit.WebResourceResponse("application/javascript", "UTF-8", new java.io.ByteArrayInputStream(str3.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public final void zzb(android.content.Context context, java.lang.String str, boolean z, java.net.HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(zza2);
        sb.append(" milliseconds.");
        java.lang.String sb2 = sb.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (android.text.TextUtils.isEmpty(httpURLConnection.getRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT))) {
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzc(android.content.Context context) {
        if (this.zzj) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmu)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzr(this, null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final boolean zzd(android.content.Context context) {
        if (this.zzk) {
            return false;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        byte[] bArr = null;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmu)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzp(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new com.google.android.gms.ads.internal.util.zzp(this, bArr), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final java.lang.String zze(android.content.Context context, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmH)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzak(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            java.lang.String str2 = this.zzh;
            if (str2 != null) {
                return str2;
            }
            java.lang.String zzak = zzak(context, str);
            this.zzh = zzak;
            return zzak;
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(final android.net.Uri uri) {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return com.google.android.gms.ads.internal.util.zzs.zzT(uri);
            }
        }, this.zzl);
    }

    public final void zzg(final android.content.Context context, final java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString("device", zzt());
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zza;
        bundle.putString("eids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().zze()));
        if (bundle.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final java.lang.String str3 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlW);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(com.google.android.gms.ads.internal.util.zzac.zzc(context, str3, new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str4) {
                        com.google.android.gms.ads.internal.util.zzs.this.zzl(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((android.os.Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzD(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(java.lang.String str4) {
                com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzO(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzh(java.lang.String str) {
        return zzae(str, this.zzb, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaQ));
    }

    public final boolean zzi(java.lang.String str) {
        return zzae(str, this.zzc, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaR));
    }

    final /* synthetic */ void zzl(android.content.Context context, java.lang.String str, android.content.SharedPreferences sharedPreferences, java.lang.String str2) {
        this.zzd.set(com.google.android.gms.ads.internal.util.zzac.zzb(context, str));
    }

    final /* synthetic */ void zzm(boolean z) {
        this.zzf = z;
    }

    public final int zzn(android.content.Context context, android.net.Uri uri, android.os.Bundle bundle) {
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof android.app.Activity)) {
            zzah(context, uri);
            return 2;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfA)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfy)).booleanValue()) {
                zzah(context, uri);
                return 9;
            }
            com.google.android.gms.internal.ads.zzbjr zzbjrVar = new com.google.android.gms.internal.ads.zzbjr();
            zzbjrVar.zzd(new com.google.android.gms.ads.internal.util.zzk(this, zzbjrVar, bundle, context, uri));
            zzbjrVar.zze((android.app.Activity) context);
            return 5;
        }
        androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(com.google.android.gms.ads.internal.zzt.zzn().zzb());
        zzai(builder, bundle);
        androidx.browser.customtabs.CustomTabsIntent build = builder.build();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfN)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzy()) {
                return 5;
            }
        }
        build.intent.setPackage(com.google.android.gms.internal.ads.zzink.zza(context));
        build.launchUrl(context, uri);
        return 5;
    }
}
