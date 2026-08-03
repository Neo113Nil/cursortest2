package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static java.lang.Boolean zzc = null;
    private static java.lang.String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static java.lang.Boolean zzg;
    private static com.google.android.gms.dynamite.zzp zzl;
    private static com.google.android.gms.dynamite.zzq zzm;
    private final android.content.Context zzk;
    private static final java.lang.ThreadLocal zzh = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal zzi = new com.google.android.gms.dynamite.zze();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzj = new com.google.android.gms.dynamite.zzf();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzg();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = new com.google.android.gms.dynamite.zzh();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzi();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzj();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzk();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzl();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = new com.google.android.gms.dynamite.zzm();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zzb = new com.google.android.gms.dynamite.zzc();

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ LoadingException(java.lang.String str, byte[] bArr) {
            super(str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface VersionPolicy {

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;

            int zzb(android.content.Context context, java.lang.String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;
    }

    private DynamiteModule(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzk = context;
    }

    public static int getLocalVersion(android.content.Context context, java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            java.lang.Class<?> loadClass = classLoader.loadClass(sb.toString());
            java.lang.reflect.Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String valueOf = java.lang.String.valueOf(declaredField.get(null));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 50 + java.lang.String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            android.util.Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            android.util.Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            android.util.Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(message)));
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e0 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d7 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        int i;
        com.google.android.gms.dynamite.DynamiteModule zze2;
        int i2;
        java.lang.Boolean bool;
        com.google.android.gms.dynamic.IObjectWrapper zze3;
        com.google.android.gms.dynamite.zzq zzqVar;
        boolean z;
        java.lang.Boolean valueOf;
        com.google.android.gms.dynamic.IObjectWrapper zze4;
        ?? r4 = ":";
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = zzh;
        com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) threadLocal.get();
        com.google.android.gms.dynamite.zzn zznVar2 = new com.google.android.gms.dynamite.zzn(null);
        threadLocal.set(zznVar2);
        java.lang.ThreadLocal threadLocal2 = zzi;
        java.lang.Long l = (java.lang.Long) threadLocal2.get();
        long longValue = l.longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzj);
            int i3 = selectModule.localVersion;
            int i4 = selectModule.remoteVersion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 26 + java.lang.String.valueOf(i3).length() + 19 + java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(i4).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i4);
            android.util.Log.i("DynamiteModule", sb.toString());
            int i5 = selectModule.selection;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (selectModule.localVersion != 0) {
                        i5 = -1;
                    }
                }
                if (i5 != 1 || selectModule.remoteVersion != 0) {
                    if (i5 == -1) {
                        com.google.android.gms.dynamite.DynamiteModule zze5 = zze(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l);
                        }
                        android.database.Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar);
                        return zze5;
                    }
                    if (i5 != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i5).length() + 36);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(i5);
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb2.toString(), null);
                    }
                    try {
                        try {
                            i2 = selectModule.remoteVersion;
                        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                            e = e;
                            java.lang.String message = e.getMessage();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 30);
                            sb3.append("Failed to load remote module: ");
                            sb3.append(message);
                            android.util.Log.w("DynamiteModule", sb3.toString());
                            i = selectModule.localVersion;
                            if (i != 0 || versionPolicy.selectModule(r4, str, new com.google.android.gms.dynamite.zzo(i, 0)).selection != -1) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e, null);
                            }
                            zze2 = zze(applicationContext, str);
                            return zze2;
                        }
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                        e = e2;
                        r4 = context;
                        java.lang.String message2 = e.getMessage();
                        java.lang.StringBuilder sb32 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + 30);
                        sb32.append("Failed to load remote module: ");
                        sb32.append(message2);
                        android.util.Log.w("DynamiteModule", sb32.toString());
                        i = selectModule.localVersion;
                        if (i != 0) {
                        }
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e, null);
                    }
                    try {
                        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                            if (!zzb(context)) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote loading disabled", null);
                            }
                            bool = zzc;
                        }
                        if (bool == null) {
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(i2).length());
                            sb4.append("Selected remote version of ");
                            sb4.append(str);
                            sb4.append(", version >= ");
                            sb4.append(i2);
                            android.util.Log.i("DynamiteModule", sb4.toString());
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                zzqVar = zzm;
                            }
                            if (zzqVar == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", null);
                            }
                            com.google.android.gms.dynamite.zzn zznVar3 = (com.google.android.gms.dynamite.zzn) threadLocal.get();
                            if (zznVar3 == null || zznVar3.zza == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", null);
                            }
                            android.content.Context applicationContext2 = context.getApplicationContext();
                            android.database.Cursor cursor2 = zznVar3.zza;
                            com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                z = zzf >= 2;
                                valueOf = java.lang.Boolean.valueOf(z);
                            }
                            valueOf.getClass();
                            if (z) {
                                android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                zze4 = zzqVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i2, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor2));
                            } else {
                                android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                zze4 = zzqVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i2, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor2));
                            }
                            android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zze4);
                            if (context2 == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", null);
                            }
                            zze2 = new com.google.android.gms.dynamite.DynamiteModule(context2);
                        } else {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(i2).length());
                            sb5.append("Selected remote version of ");
                            sb5.append(str);
                            sb5.append(", version >= ");
                            sb5.append(i2);
                            android.util.Log.i("DynamiteModule", sb5.toString());
                            com.google.android.gms.dynamite.zzp zzg2 = zzg(context);
                            if (zzg2 == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            int zzi2 = zzg2.zzi();
                            if (zzi2 >= 3) {
                                com.google.android.gms.dynamite.zzn zznVar4 = (com.google.android.gms.dynamite.zzn) threadLocal.get();
                                if (zznVar4 == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                }
                                zze3 = zzg2.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i2, com.google.android.gms.dynamic.ObjectWrapper.wrap(zznVar4.zza));
                            } else if (zzi2 == 2) {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                zze3 = zzg2.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i2);
                            } else {
                                android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                zze3 = zzg2.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i2);
                            }
                            java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(zze3);
                            if (unwrap == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                            }
                            zze2 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) unwrap);
                        }
                        return zze2;
                    } catch (android.os.RemoteException e3) {
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e3, null);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e4) {
                        throw e4;
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th);
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th, null);
                    }
                }
            }
            int i6 = selectModule.localVersion;
            int i7 = selectModule.remoteVersion;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 46 + java.lang.String.valueOf(i6).length() + 23 + java.lang.String.valueOf(i7).length() + 1);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i6);
            sb6.append(" and remote version is ");
            sb6.append(i7);
            sb6.append(".");
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb6.toString(), null);
        } finally {
            if (longValue == 0) {
                zzi.remove();
            } else {
                zzi.set(l);
            }
            android.database.Cursor cursor3 = zznVar2.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzh.set(zznVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x016d, code lost:
    
        if (r0 != 0) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.reflect.Field declaredField;
        java.lang.Throwable th;
        android.os.RemoteException e;
        java.lang.String str2;
        java.lang.String str3;
        android.database.Cursor cursor;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = zzc;
                android.database.Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e2) {
                        java.lang.String obj = e2.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        android.util.Log.w("DynamiteModule", sb.toString());
                        bool = java.lang.Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                        if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                            bool = java.lang.Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzf(classLoader);
                            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused) {
                            }
                            bool = java.lang.Boolean.TRUE;
                        } else {
                            if (!zzb(context)) {
                                return 0;
                            }
                            if (zze || java.lang.Boolean.TRUE.equals(null)) {
                                declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                bool = java.lang.Boolean.FALSE;
                            } else {
                                try {
                                    int zzc2 = zzc(context, str, z, true);
                                    java.lang.String str4 = zzd;
                                    if (str4 != null && !str4.isEmpty()) {
                                        java.lang.ClassLoader zza2 = com.google.android.gms.dynamite.zzb.zza();
                                        if (zza2 == null) {
                                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                java.lang.String str5 = zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(str5);
                                                java.lang.String str6 = str5;
                                                zza2 = new dalvik.system.DelegateLastClassLoader(str5, java.lang.ClassLoader.getSystemClassLoader());
                                            } else {
                                                java.lang.String str7 = zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(str7);
                                                java.lang.String str8 = str7;
                                                zza2 = new com.google.android.gms.dynamite.zzd(str7, java.lang.ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        zzf(zza2);
                                        declaredField.set(null, zza2);
                                        zzc = java.lang.Boolean.TRUE;
                                        return zzc2;
                                    }
                                    return zzc2;
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused2) {
                                    declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                    bool = java.lang.Boolean.FALSE;
                                }
                            }
                        }
                        zzc = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z, false);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                        java.lang.String message = e3.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        android.util.Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                java.lang.String str9 = "Failed to retrieve remote module version: ";
                com.google.android.gms.dynamite.zzp zzg2 = zzg(context);
                if (zzg2 != null) {
                    try {
                        try {
                            int zzi2 = zzg2.zzi();
                            if (zzi2 >= 3) {
                                com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) zzh.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    android.database.Cursor cursor3 = (android.database.Cursor) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzg2.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z, ((java.lang.Long) zzi.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                java.lang.String str10 = str9;
                                                if (i2 > 0) {
                                                    boolean zzd2 = zzd(cursor3);
                                                    str3 = zzd2;
                                                    str10 = zzd2;
                                                }
                                                cursor2 = cursor3;
                                                str3 = str10;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                                str9 = str3;
                                            }
                                        } catch (android.os.RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            str2 = str9;
                                            java.lang.String message2 = e.getMessage();
                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + 42);
                                            sb3.append(str2);
                                            sb3.append(message2);
                                            android.util.Log.w("DynamiteModule", sb3.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    str9 = str9;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                        str9 = str9;
                                    }
                                } else {
                                    i = cursor.getInt(0);
                                    str9 = str9;
                                }
                            } else if (zzi2 == 2) {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = zzg2.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                                str9 = str9;
                            } else {
                                android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = zzg2.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                                str9 = str9;
                            }
                        } catch (android.os.RemoteException e5) {
                            e = e5;
                            str2 = str9;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
                return i;
            }
        } catch (java.lang.Throwable th4) {
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    private static boolean zzb(android.content.Context context) {
        if (java.lang.Boolean.TRUE.equals(null) || java.lang.Boolean.TRUE.equals(zzg)) {
            return true;
        }
        boolean z = false;
        if (zzg == null) {
            android.content.pm.ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            zzg = valueOf;
            valueOf.getClass();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zze = true;
            }
        }
        if (!z) {
            android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x017b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:111:0x017b */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzc(android.content.Context context, java.lang.String str, boolean z, boolean z2) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        android.database.Cursor cursor;
        android.database.Cursor query;
        android.database.MatrixCursor matrixCursor;
        android.database.Cursor cursor2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        try {
            try {
                boolean z3 = true;
                android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) zzi.get()).longValue())).build();
                android.content.ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                boolean z4 = false;
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        query = acquireUnstableContentProviderClient.query(build, null, null, null, null);
                    } catch (android.os.RemoteException unused) {
                    } catch (java.lang.Throwable th) {
                        acquireUnstableContentProviderClient.release();
                        throw th;
                    }
                    if (query != null) {
                        try {
                            int count = query.getCount();
                            int columnCount = query.getColumnCount();
                            matrixCursor = new android.database.MatrixCursor(query.getColumnNames(), count);
                            for (int i = 0; i < count; i++) {
                                if (!query.moveToPosition(i)) {
                                    throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                }
                                java.lang.Object[] objArr4 = new java.lang.Object[columnCount];
                                for (int i2 = 0; i2 < columnCount; i2++) {
                                    int type = query.getType(i2);
                                    if (type == 0) {
                                        objArr4[i2] = null;
                                    } else if (type == 1) {
                                        objArr4[i2] = java.lang.Long.valueOf(query.getLong(i2));
                                    } else if (type == 2) {
                                        objArr4[i2] = java.lang.Double.valueOf(query.getDouble(i2));
                                    } else if (type == 3) {
                                        objArr4[i2] = query.getString(i2);
                                    } else {
                                        if (type != 4) {
                                            throw new android.os.RemoteException("Unknown column type");
                                        }
                                        objArr4[i2] = query.getBlob(i2);
                                    }
                                }
                                matrixCursor.addRow(objArr4);
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            if (matrixCursor != null) {
                                try {
                                    if (matrixCursor.moveToFirst()) {
                                        int i3 = matrixCursor.getInt(0);
                                        if (i3 > 0) {
                                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                                zzd = matrixCursor.getString(2);
                                                int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                                if (columnIndex >= 0) {
                                                    zzf = matrixCursor.getInt(columnIndex);
                                                }
                                                int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                                if (columnIndex2 >= 0) {
                                                    if (matrixCursor.getInt(columnIndex2) == 0) {
                                                        z3 = false;
                                                    }
                                                    zze = z3;
                                                    z4 = z3;
                                                }
                                            }
                                            if (zzd(matrixCursor)) {
                                                matrixCursor = null;
                                            }
                                        }
                                        if (z2 && z4) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                                        }
                                        return i3;
                                    }
                                } catch (java.lang.Exception e) {
                                    e = e;
                                    if (e instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException) {
                                        throw e;
                                    }
                                    java.lang.String message = e.getMessage();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 25);
                                    sb.append("V2 version check failed: ");
                                    sb.append(message);
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb.toString(), e, objArr == true ? 1 : 0);
                                }
                            }
                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
                android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private static boolean zzd(android.database.Cursor cursor) {
        com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) zzh.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static com.google.android.gms.dynamite.DynamiteModule zze(android.content.Context context, java.lang.String str) {
        java.lang.String.valueOf(str);
        android.util.Log.i("DynamiteModule", "Selected local version of ".concat(java.lang.String.valueOf(str)));
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    private static void zzf(java.lang.ClassLoader classLoader) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.dynamite.zzq zzqVar;
        byte[] bArr = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzq ? (com.google.android.gms.dynamite.zzq) queryLocalInterface : new com.google.android.gms.dynamite.zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static com.google.android.gms.dynamite.zzp zzg(android.content.Context context) {
        com.google.android.gms.dynamite.zzp zzpVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzp ? (com.google.android.gms.dynamite.zzp) queryLocalInterface : new com.google.android.gms.dynamite.zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (java.lang.Exception e) {
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                android.util.Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public android.content.Context getModuleContext() {
        return this.zzk;
    }

    public android.os.IBinder instantiate(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        try {
            return (android.os.IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e) {
            java.lang.String.valueOf(str);
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e, null);
        }
    }
}
