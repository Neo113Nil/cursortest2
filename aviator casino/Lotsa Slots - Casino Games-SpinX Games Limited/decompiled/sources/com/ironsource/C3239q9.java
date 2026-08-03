package com.ironsource;

/* renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3239q9 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6572a = "IntegrationHelper";
    private static final java.lang.String b = "getNetworkSDKVersion";
    private static final java.lang.String c = "getAdapterSDKVersion";
    private static final java.lang.String d = "getAdapterVersion";
    private static final java.lang.String e = "getVersion";

    /* renamed from: com.ironsource.q9$a */
    class a extends java.lang.Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f6573a;

        a(android.content.Context context) {
            this.f6573a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                android.util.Log.w(com.ironsource.C3239q9.f6572a, "--------------- Google Play Services --------------");
                if (this.f6573a.getPackageManager().getApplicationInfo(this.f6573a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    android.util.Log.i(com.ironsource.C3239q9.f6572a, "Google Play Services - VERIFIED");
                    java.lang.String b = com.ironsource.mediationsdk.p.h().b(this.f6573a);
                    if (!android.text.TextUtils.isEmpty(b)) {
                        android.util.Log.i(com.ironsource.C3239q9.f6572a, "GAID is: " + b + " (use this for test devices)");
                    }
                } else {
                    android.util.Log.e(com.ironsource.C3239q9.f6572a, "Google Play Services - MISSING");
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                android.util.Log.e(com.ironsource.C3239q9.f6572a, "Google Play Services - MISSING");
            }
        }
    }

    C3239q9() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(9:38|(1:(1:(1:14)(1:33))(1:34))(1:35)|15|16|17|18|19|20|21)|16|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r0 = r0.getConstructor(null).newInstance(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067 A[Catch: Exception -> 0x00cc, TryCatch #1 {Exception -> 0x00cc, blocks: (B:3:0x0007, B:14:0x0046, B:15:0x006c, B:20:0x00a9, B:31:0x00b1, B:28:0x00bf, B:33:0x005b, B:34:0x0061, B:35:0x0067, B:36:0x0021, B:39:0x002b, B:42:0x0035, B:17:0x0089, B:19:0x008d, B:25:0x00a1), top: B:2:0x0007, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(android.content.Context context, java.lang.String str) {
        char c2;
        try {
            java.lang.String lowerCase = com.ironsource.environment.StringUtils.toLowerCase(str);
            int hashCode = lowerCase.hashCode();
            if (hashCode == -805296079) {
                if (lowerCase.equals("vungle")) {
                    c2 = 2;
                    if (c2 != 0) {
                    }
                    java.lang.Class<?> cls = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    java.lang.Object newInstance = cls.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                    b(newInstance);
                    a(newInstance);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                java.lang.Class<?> cls2 = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                java.lang.Object newInstance2 = cls2.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                b(newInstance2);
                a(newInstance2);
                return true;
            }
            if (hashCode == 92668925) {
                if (lowerCase.equals(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                    java.lang.Class<?> cls22 = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    java.lang.Object newInstance22 = cls22.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                    b(newInstance22);
                    a(newInstance22);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                java.lang.Class<?> cls222 = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                java.lang.Object newInstance222 = cls222.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                b(newInstance222);
                a(newInstance222);
                return true;
            }
            try {
                if (hashCode == 497130182 && lowerCase.equals(com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                    c2 = 0;
                    if (c2 != 0) {
                        android.util.Log.i(f6572a, "--------------- Meta --------------");
                    } else if (c2 == 1) {
                        android.util.Log.i(f6572a, "--------------- Google (AdMob and Ad Manager) --------------");
                    } else if (c2 != 2) {
                        android.util.Log.i(f6572a, "--------------- " + str + " --------------");
                    } else {
                        android.util.Log.i(f6572a, "--------------- Liftoff Monetization --------------");
                    }
                    java.lang.Class<?> cls2222 = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    java.lang.Object newInstance2222 = cls2222.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                    b(newInstance2222);
                    a(newInstance2222);
                    return true;
                }
                java.lang.Class<?> cls22222 = java.lang.Class.forName("com.ironsource.adapters." + com.ironsource.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter");
                java.lang.Object newInstance22222 = cls22222.getDeclaredConstructor(java.lang.String.class).newInstance(str);
                b(newInstance22222);
                a(newInstance22222);
                return true;
            } catch (java.lang.ClassNotFoundException e2) {
                com.ironsource.C3180n4.d().a(e2);
                android.util.Log.e(f6572a, "Adapter - MISSING");
                return false;
            } catch (java.lang.Exception e3) {
                com.ironsource.C3180n4.d().a(e3);
                android.util.Log.e(f6572a, "Failed to instantiate adapter");
                return false;
            }
            c2 = 65535;
            if (c2 != 0) {
            }
        } catch (java.lang.Exception e4) {
            com.ironsource.C3180n4.d().a(e4);
            android.util.Log.e(f6572a, "isAdapterValid " + str, e4);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.equals(com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r6.equals(com.facebook.AccessToken.DEFAULT_GRAPH_DOMAIN) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(android.content.Context context) {
        android.util.Log.i(f6572a, "Verifying Integration:");
        c(context);
        java.lang.String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME, "HyprMX", "InMobi", "IronSource", com.vungle.ads.BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", com.ironsource.M6.J1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            java.lang.String str = strArr[i];
            char c2 = 2;
            if (a(context, str)) {
                java.lang.String lowerCase = com.ironsource.environment.StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -805296079:
                        if (lowerCase.equals("vungle")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 92668925:
                        if (lowerCase.equals(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 497130182:
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        android.util.Log.i(f6572a, ">>>> Liftoff Monetization - VERIFIED");
                        break;
                    case 1:
                        android.util.Log.i(f6572a, ">>>> Google (AdMob and Ad Manager) - VERIFIED");
                        break;
                    case 2:
                        android.util.Log.i(f6572a, ">>>> Meta - VERIFIED");
                        break;
                    default:
                        android.util.Log.i(f6572a, ">>>> " + str + " - VERIFIED");
                        break;
                }
            } else {
                java.lang.String lowerCase2 = com.ironsource.environment.StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 92668925:
                        if (lowerCase2.equals(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 497130182:
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        android.util.Log.i(f6572a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case 1:
                        android.util.Log.i(f6572a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case 2:
                        android.util.Log.i(f6572a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        android.util.Log.e(f6572a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            }
        }
        a(context);
    }

    private static void c(android.content.Context context) {
        android.util.Log.i(f6572a, "*** Permissions ***");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            android.util.Log.i(f6572a, "android.permission.INTERNET - VERIFIED");
        } else {
            android.util.Log.e(f6572a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            android.util.Log.i(f6572a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            android.util.Log.e(f6572a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    private static void a(android.content.Context context) {
        new com.ironsource.C3239q9.a(context).start();
    }

    private static void b(java.lang.Object obj) {
        java.lang.String str;
        try {
            java.lang.Class<?> cls = obj.getClass();
            if (obj instanceof com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter) {
                str = b;
            } else {
                str = c;
            }
            android.util.Log.i(f6572a, "SDK Version - " + ((java.lang.String) cls.getMethod(str, null).invoke(obj, null)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            android.util.Log.w(f6572a, "Unable to get SDK version");
        }
    }

    private static void a(java.lang.Object obj) {
        try {
            android.util.Log.i(f6572a, "Adapter Version - " + ((java.lang.String) obj.getClass().getMethod(obj instanceof com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter ? d : "getVersion", null).invoke(obj, null)));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            android.util.Log.w(f6572a, "Unable to get adapter version");
        }
    }
}
