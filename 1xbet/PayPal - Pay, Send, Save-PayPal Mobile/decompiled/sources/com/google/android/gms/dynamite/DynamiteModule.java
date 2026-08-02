package com.google.android.gms.dynamite;

/* loaded from: classes4.dex */
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

    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    public static class LoadingException extends java.lang.Exception {
        /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ LoadingException(java.lang.String str, byte[] bArr) {
            super(str);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str, boolean z) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException;

            int zzb(android.content.Context context, java.lang.String str);
        }

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
            declaredField.get(null);
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            return 0;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        long j;
        com.google.android.gms.dynamite.DynamiteModule zze2;
        int i;
        java.lang.Boolean bool;
        com.google.android.gms.dynamic.IObjectWrapper zzg2;
        com.google.android.gms.dynamite.zzq zzqVar;
        boolean z;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = zzh;
        com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) threadLocal.get();
        com.google.android.gms.dynamite.zzn zznVar2 = new com.google.android.gms.dynamite.zzn(null);
        threadLocal.set(zznVar2);
        java.lang.ThreadLocal threadLocal2 = zzi;
        long longValue = ((java.lang.Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzj);
            int i2 = selectModule.localVersion;
            int i3 = selectModule.remoteVersion;
            int i4 = selectModule.selection;
            if (i4 != 0) {
                if (i4 == -1) {
                    try {
                        if (selectModule.localVersion != 0) {
                            i4 = -1;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        j = 0;
                        if (longValue == j) {
                            zzi.remove();
                        } else {
                            zzi.set(java.lang.Long.valueOf(longValue));
                        }
                        android.database.Cursor cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzh.set(zznVar);
                        throw th;
                    }
                }
                if (i4 != 1 || selectModule.remoteVersion != 0) {
                    if (i4 == -1) {
                        com.google.android.gms.dynamite.DynamiteModule zze3 = zze(applicationContext, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(java.lang.Long.valueOf(longValue));
                        }
                        android.database.Cursor cursor2 = zznVar2.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar);
                        return zze3;
                    }
                    if (i4 != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 36);
                        sb.append("VersionPolicy returned invalid code:");
                        sb.append(i4);
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb.toString(), null);
                    }
                    try {
                        i = selectModule.remoteVersion;
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e) {
                        e.getMessage();
                        int i5 = selectModule.localVersion;
                        if (i5 == 0 || versionPolicy.selectModule(context, str, new com.google.android.gms.dynamite.zzo(i5, 0)).selection != -1) {
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e, null);
                        }
                        zze2 = zze(applicationContext, str);
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
                            android.database.Cursor cursor3 = zznVar3.zza;
                            com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                z = zzf >= 2;
                            }
                            android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(z ? zzqVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor3)) : zzqVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor3)));
                            if (context2 == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", null);
                            }
                            zze2 = new com.google.android.gms.dynamite.DynamiteModule(context2);
                        } else {
                            com.google.android.gms.dynamite.zzp zzg3 = zzg(context);
                            if (zzg3 == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                            }
                            int zzi2 = zzg3.zzi();
                            if (zzi2 >= 3) {
                                com.google.android.gms.dynamite.zzn zznVar4 = (com.google.android.gms.dynamite.zzn) threadLocal.get();
                                if (zznVar4 == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                }
                                zzg2 = zzg3.zzk(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i, com.google.android.gms.dynamic.ObjectWrapper.wrap(zznVar4.zza));
                            } else {
                                zzg2 = zzi2 == 2 ? zzg3.zzg(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i) : zzg3.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i);
                            }
                            java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzg2);
                            if (unwrap == null) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                            }
                            zze2 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) unwrap);
                        }
                        if (longValue == 0) {
                            zzi.remove();
                        } else {
                            zzi.set(java.lang.Long.valueOf(longValue));
                        }
                        android.database.Cursor cursor4 = zznVar2.zza;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        zzh.set(zznVar);
                        return zze2;
                    } catch (android.os.RemoteException e2) {
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e2, null);
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e3) {
                        throw e3;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th2);
                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th2, null);
                    }
                }
            }
            int i6 = selectModule.localVersion;
            int i7 = selectModule.remoteVersion;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 46 + java.lang.String.valueOf(i6).length() + 23 + java.lang.String.valueOf(i7).length() + 1);
            sb2.append("No acceptable module ");
            sb2.append(str);
            sb2.append(" found. Local version is ");
            sb2.append(i6);
            sb2.append(" and remote version is ");
            sb2.append(i7);
            sb2.append(".");
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException(sb2.toString(), null);
        } catch (java.lang.Throwable th3) {
            th = th3;
            j = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        if (zzd(r11) != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.reflect.Field declaredField;
        java.lang.ClassLoader zzdVar;
        java.lang.Throwable th;
        android.database.Cursor cursor;
        android.os.RemoteException e;
        android.database.Cursor cursor2;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = zzc;
                int i = 0;
                android.database.Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
                        bool = java.lang.Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                        if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                            bool = java.lang.Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzf(classLoader);
                            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused2) {
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
                                    java.lang.String str2 = zzd;
                                    if (str2 != null && !str2.isEmpty()) {
                                        java.lang.ClassLoader zza2 = com.google.android.gms.dynamite.zzb.zza();
                                        if (zza2 == null) {
                                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                java.lang.String str3 = zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
                                                java.lang.String str4 = str3;
                                                zzdVar = new dalvik.system.DelegateLastClassLoader(str3, java.lang.ClassLoader.getSystemClassLoader());
                                            } else {
                                                java.lang.String str5 = zzd;
                                                com.google.android.gms.common.internal.Preconditions.checkNotNull(str5);
                                                java.lang.String str6 = str5;
                                                zzdVar = new com.google.android.gms.dynamite.zzd(str5, java.lang.ClassLoader.getSystemClassLoader());
                                            }
                                            zza2 = zzdVar;
                                        }
                                        zzf(zza2);
                                        declaredField.set(null, zza2);
                                        zzc = java.lang.Boolean.TRUE;
                                        return zzc2;
                                    }
                                    return zzc2;
                                } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException unused3) {
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
                    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
                        e2.getMessage();
                        return 0;
                    }
                }
                com.google.android.gms.dynamite.zzp zzg2 = zzg(context);
                if (zzg2 != null) {
                    try {
                        try {
                            int zzi2 = zzg2.zzi();
                            if (zzi2 >= 3) {
                                com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) zzh.get();
                                if (zznVar == null || (cursor2 = zznVar.zza) == null) {
                                    cursor = (android.database.Cursor) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzg2.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z, ((java.lang.Long) zzi.get()).longValue()));
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                int i2 = cursor.getInt(0);
                                                if (i2 > 0) {
                                                }
                                                cursor3 = cursor;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (android.os.RemoteException e3) {
                                            e = e3;
                                            cursor3 = cursor;
                                            e.getMessage();
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            return i;
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            if (cursor == null) {
                                                throw th;
                                            }
                                            cursor.close();
                                            throw th;
                                        }
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    i = cursor2.getInt(0);
                                }
                            } else {
                                i = zzi2 == 2 ? zzg2.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z) : zzg2.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (android.os.RemoteException e4) {
                            e = e4;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        cursor = cursor3;
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
            if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            zzg = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                zze = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0131, code lost:
    
        r5.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x016e: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:109:0x016e */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzc(android.content.Context context, java.lang.String str, boolean z, boolean z2) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        android.database.Cursor cursor;
        android.database.MatrixCursor matrixCursor;
        android.database.Cursor query;
        android.database.Cursor cursor2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        try {
            try {
                boolean z3 = true;
                android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) zzi.get()).longValue())).build();
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
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
                        } finally {
                        }
                    }
                    acquireUnstableContentProviderClient.release();
                }
                matrixCursor = null;
                if (matrixCursor != null) {
                }
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
                e.getMessage();
            }
            return null;
        }
    }

    public final android.os.IBinder instantiate(java.lang.String str) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        try {
            return (android.os.IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e, null);
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule zze(android.content.Context context, java.lang.String str) {
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    public final android.content.Context getModuleContext() {
        return this.zzk;
    }
}
