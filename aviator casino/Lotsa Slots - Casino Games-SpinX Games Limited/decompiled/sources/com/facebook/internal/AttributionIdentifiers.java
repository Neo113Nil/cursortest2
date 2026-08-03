package com.facebook.internal;

/* compiled from: AttributionIdentifiers.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "()V", "androidAdvertiserId", "", "getAndroidAdvertiserId", "()Ljava/lang/String;", "androidAdvertiserIdValue", "<set-?>", "androidInstallerPackage", "getAndroidInstallerPackage", "attributionId", "getAttributionId", "fetchTime", "", "", "isTrackingLimited", "()Z", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "GoogleAdInfo", "GoogleAdServiceConnection", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AttributionIdentifiers {
    private static final java.lang.String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final java.lang.String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final java.lang.String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final java.lang.String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000;
    private static final java.lang.String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    public static com.facebook.internal.AttributionIdentifiers cachedIdentifiers;
    private java.lang.String androidAdvertiserIdValue;
    private java.lang.String androidInstallerPackage;
    private java.lang.String attributionId;
    private long fetchTime;
    private boolean isTrackingLimited;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.AttributionIdentifiers.Companion INSTANCE = new com.facebook.internal.AttributionIdentifiers.Companion(null);
    private static final java.lang.String TAG = com.facebook.internal.AttributionIdentifiers.class.getCanonicalName();

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.AttributionIdentifiers getAttributionIdentifiers(android.content.Context context) {
        return INSTANCE.getAttributionIdentifiers(context);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isTrackingLimited(android.content.Context context) {
        return INSTANCE.isTrackingLimited(context);
    }

    public final java.lang.String getAttributionId() {
        return this.attributionId;
    }

    public final java.lang.String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    /* renamed from: isTrackingLimited, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }

    public final java.lang.String getAndroidAdvertiserId() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.isInitialized()) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getAdvertiserIDCollectionEnabled()) {
                return this.androidAdvertiserIdValue;
            }
        }
        return null;
    }

    /* compiled from: AttributionIdentifiers.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "()V", "ANDROID_ID_COLUMN_NAME", "", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "CONNECTION_RESULT_SUCCESS", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "kotlin.jvm.PlatformType", "cachedIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "getCachedIdentifiers$facebook_core_release$annotations", "cacheAndReturnIdentifiers", "identifiers", "getAndroidId", "context", "Landroid/content/Context;", "getAndroidIdViaReflection", "getAndroidIdViaService", "getAttributionIdentifiers", "getInstallerPackageName", "isGooglePlayServicesAvailable", "", "isTrackingLimited", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations() {
        }

        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        private final com.facebook.internal.AttributionIdentifiers getAndroidId(android.content.Context context) {
            com.facebook.internal.AttributionIdentifiers androidIdViaReflection = getAndroidIdViaReflection(context);
            if (androidIdViaReflection != null) {
                return androidIdViaReflection;
            }
            com.facebook.internal.AttributionIdentifiers androidIdViaService = getAndroidIdViaService(context);
            return androidIdViaService == null ? new com.facebook.internal.AttributionIdentifiers() : androidIdViaService;
        }

        private final com.facebook.internal.AttributionIdentifiers getAndroidIdViaReflection(android.content.Context context) {
            try {
                if (!isGooglePlayServicesAvailable(context)) {
                    return null;
                }
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                boolean z = false;
                java.lang.reflect.Method methodQuietly = com.facebook.internal.Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (java.lang.Class<?>[]) new java.lang.Class[]{android.content.Context.class});
                if (methodQuietly == null) {
                    return null;
                }
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                java.lang.Object invokeMethodQuietly = com.facebook.internal.Utility.invokeMethodQuietly(null, methodQuietly, context);
                if (invokeMethodQuietly == null) {
                    return null;
                }
                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                java.lang.reflect.Method methodQuietly2 = com.facebook.internal.Utility.getMethodQuietly(invokeMethodQuietly.getClass(), "getId", (java.lang.Class<?>[]) new java.lang.Class[0]);
                com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                java.lang.reflect.Method methodQuietly3 = com.facebook.internal.Utility.getMethodQuietly(invokeMethodQuietly.getClass(), com.ironsource.X3.j.M, (java.lang.Class<?>[]) new java.lang.Class[0]);
                if (methodQuietly2 != null && methodQuietly3 != null) {
                    com.facebook.internal.AttributionIdentifiers attributionIdentifiers = new com.facebook.internal.AttributionIdentifiers();
                    com.facebook.internal.Utility utility5 = com.facebook.internal.Utility.INSTANCE;
                    attributionIdentifiers.androidAdvertiserIdValue = (java.lang.String) com.facebook.internal.Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly2, new java.lang.Object[0]);
                    com.facebook.internal.Utility utility6 = com.facebook.internal.Utility.INSTANCE;
                    java.lang.Boolean bool = (java.lang.Boolean) com.facebook.internal.Utility.invokeMethodQuietly(invokeMethodQuietly, methodQuietly3, new java.lang.Object[0]);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    attributionIdentifiers.isTrackingLimited = z;
                    return attributionIdentifiers;
                }
                return null;
            } catch (java.lang.Exception e) {
                com.facebook.internal.Utility utility7 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd("android_id", e);
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final boolean isTrackingLimited(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.internal.AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited();
        }

        private final boolean isGooglePlayServicesAvailable(android.content.Context context) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.lang.reflect.Method methodQuietly = com.facebook.internal.Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (java.lang.Class<?>[]) new java.lang.Class[]{android.content.Context.class});
            if (methodQuietly == null) {
                return false;
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            java.lang.Object invokeMethodQuietly = com.facebook.internal.Utility.invokeMethodQuietly(null, methodQuietly, context);
            return (invokeMethodQuietly instanceof java.lang.Integer) && kotlin.jvm.internal.Intrinsics.areEqual(invokeMethodQuietly, (java.lang.Object) 0);
        }

        private final com.facebook.internal.AttributionIdentifiers getAndroidIdViaService(android.content.Context context) {
            if (!isGooglePlayServicesAvailable(context)) {
                return null;
            }
            com.facebook.internal.AttributionIdentifiers.GoogleAdServiceConnection googleAdServiceConnection = new com.facebook.internal.AttributionIdentifiers.GoogleAdServiceConnection();
            android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, googleAdServiceConnection, 1)) {
                        com.facebook.internal.AttributionIdentifiers.GoogleAdInfo googleAdInfo = new com.facebook.internal.AttributionIdentifiers.GoogleAdInfo(googleAdServiceConnection.getBinder());
                        com.facebook.internal.AttributionIdentifiers attributionIdentifiers = new com.facebook.internal.AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.getAdvertiserId();
                        attributionIdentifiers.isTrackingLimited = googleAdInfo.isTrackingLimited();
                        return attributionIdentifiers;
                    }
                } catch (java.lang.Exception e) {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd("android_id", e);
                } finally {
                    context.unbindService(googleAdServiceConnection);
                }
            } catch (java.lang.SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[Catch: all -> 0x00fd, Exception -> 0x00ff, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0086, B:19:0x008c, B:21:0x0091, B:23:0x0096, B:57:0x006e, B:59:0x007e, B:61:0x00f5, B:62:0x00fc), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: all -> 0x00fd, Exception -> 0x00ff, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0086, B:19:0x008c, B:21:0x0091, B:23:0x0096, B:57:0x006e, B:59:0x007e, B:61:0x00f5, B:62:0x00fc), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: all -> 0x00fd, Exception -> 0x00ff, TRY_LEAVE, TryCatch #4 {Exception -> 0x00ff, all -> 0x00fd, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x0055, B:15:0x0064, B:17:0x0086, B:19:0x008c, B:21:0x0091, B:23:0x0096, B:57:0x006e, B:59:0x007e, B:61:0x00f5, B:62:0x00fc), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.facebook.internal.AttributionIdentifiers getAttributionIdentifiers(android.content.Context context) {
            android.database.Cursor cursor;
            android.net.Uri uri;
            android.net.Uri parse;
            java.lang.String installerPackageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.facebook.internal.AttributionIdentifiers androidId = getAndroidId(context);
            android.database.Cursor cursor2 = null;
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    throw new com.facebook.FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.cachedIdentifiers;
                if (attributionIdentifiers != null && java.lang.System.currentTimeMillis() - attributionIdentifiers.fetchTime < com.facebook.internal.AttributionIdentifiers.IDENTIFIER_REFRESH_INTERVAL_MILLIS) {
                    return attributionIdentifiers;
                }
                java.lang.String[] strArr = {"aid", com.facebook.internal.AttributionIdentifiers.ANDROID_ID_COLUMN_NAME, com.facebook.internal.AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME};
                android.content.pm.ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(com.facebook.internal.AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, 0);
                android.content.pm.ProviderInfo resolveContentProvider2 = context.getPackageManager().resolveContentProvider(com.facebook.internal.AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI, 0);
                if (resolveContentProvider != null) {
                    com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
                    java.lang.String str = resolveContentProvider.packageName;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "contentProviderInfo.packageName");
                    if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, str)) {
                        parse = android.net.Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        uri = parse;
                        installerPackageName = getInstallerPackageName(context);
                        if (installerPackageName != null) {
                            androidId.androidInstallerPackage = installerPackageName;
                        }
                        if (uri == null) {
                            return cacheAndReturnIdentifiers(androidId);
                        }
                        android.database.Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    int columnIndex = query.getColumnIndex("aid");
                                    int columnIndex2 = query.getColumnIndex(com.facebook.internal.AttributionIdentifiers.ANDROID_ID_COLUMN_NAME);
                                    int columnIndex3 = query.getColumnIndex(com.facebook.internal.AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME);
                                    androidId.attributionId = query.getString(columnIndex);
                                    if (columnIndex2 > 0 && columnIndex3 > 0 && androidId.getAndroidAdvertiserId() == null) {
                                        androidId.androidAdvertiserIdValue = query.getString(columnIndex2);
                                        androidId.isTrackingLimited = java.lang.Boolean.parseBoolean(query.getString(columnIndex3));
                                    }
                                    query.close();
                                    return cacheAndReturnIdentifiers(androidId);
                                }
                            } catch (java.lang.Exception e) {
                                cursor = query;
                                e = e;
                                try {
                                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                                    com.facebook.internal.Utility.logd(com.facebook.internal.AttributionIdentifiers.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Caught unexpected exception in getAttributionId(): ", e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return null;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                cursor2 = query;
                                th = th2;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                        com.facebook.internal.AttributionIdentifiers cacheAndReturnIdentifiers = cacheAndReturnIdentifiers(androidId);
                        if (query != null) {
                            query.close();
                        }
                        return cacheAndReturnIdentifiers;
                    }
                }
                if (resolveContentProvider2 != null) {
                    com.facebook.internal.FacebookSignatureValidator facebookSignatureValidator2 = com.facebook.internal.FacebookSignatureValidator.INSTANCE;
                    java.lang.String str2 = resolveContentProvider2.packageName;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "wakizashiProviderInfo.packageName");
                    if (com.facebook.internal.FacebookSignatureValidator.validateSignature(context, str2)) {
                        parse = android.net.Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = parse;
                        installerPackageName = getInstallerPackageName(context);
                        if (installerPackageName != null) {
                        }
                        if (uri == null) {
                        }
                    }
                }
                uri = null;
                installerPackageName = getInstallerPackageName(context);
                if (installerPackageName != null) {
                }
                if (uri == null) {
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                cursor = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        }

        private final com.facebook.internal.AttributionIdentifiers cacheAndReturnIdentifiers(com.facebook.internal.AttributionIdentifiers identifiers) {
            identifiers.fetchTime = java.lang.System.currentTimeMillis();
            com.facebook.internal.AttributionIdentifiers.cachedIdentifiers = identifiers;
            return identifiers;
        }

        private final java.lang.String getInstallerPackageName(android.content.Context context) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "binder", "Landroid/os/IBinder;", "getBinder", "()Landroid/os/IBinder;", "consumed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "queue", "Ljava/util/concurrent/BlockingQueue;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class GoogleAdServiceConnection implements android.content.ServiceConnection {
        private final java.util.concurrent.atomic.AtomicBoolean consumed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final java.util.concurrent.BlockingQueue<android.os.IBinder> queue = new java.util.concurrent.LinkedBlockingDeque();

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName name) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
            if (service != null) {
                try {
                    this.queue.put(service);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }

        public final android.os.IBinder getBinder() throws java.lang.InterruptedException {
            if (!(!this.consumed.compareAndSet(true, true))) {
                throw new java.lang.IllegalStateException("Binder already consumed".toString());
            }
            android.os.IBinder take = this.queue.take();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return take;
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "binder", "Landroid/os/IBinder;", "(Landroid/os/IBinder;)V", "advertiserId", "", "getAdvertiserId", "()Ljava/lang/String;", "isTrackingLimited", "", "()Z", "asBinder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class GoogleAdInfo implements android.os.IInterface {
        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private final android.os.IBinder binder;

        public GoogleAdInfo(android.os.IBinder binder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binder, "binder");
            this.binder = binder;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.binder;
        }

        public final java.lang.String getAdvertiserId() throws android.os.RemoteException {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean isTrackingLimited() throws android.os.RemoteException {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.binder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
