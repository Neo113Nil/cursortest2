package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzcq extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcr {
    public zzcq() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static com.google.android.gms.internal.measurement.zzcr asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzcr ? (com.google.android.gms.internal.measurement.zzcr) queryLocalInterface : new com.google.android.gms.internal.measurement.zzcp(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.measurement.zzcu zzcsVar;
        com.google.android.gms.internal.measurement.zzcu zzcuVar = null;
        com.google.android.gms.internal.measurement.zzcx zzcxVar = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar2 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar3 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar4 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar5 = null;
        com.google.android.gms.internal.measurement.zzda zzdaVar = null;
        com.google.android.gms.internal.measurement.zzda zzdaVar2 = null;
        com.google.android.gms.internal.measurement.zzda zzdaVar3 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar6 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar7 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar8 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar9 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar10 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar11 = null;
        com.google.android.gms.internal.measurement.zzdc zzdcVar = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar12 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar13 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar14 = null;
        com.google.android.gms.internal.measurement.zzcu zzcuVar15 = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.zzdd zzddVar = (com.google.android.gms.internal.measurement.zzdd) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdd.CREATOR);
                long readLong = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                initialize(asInterface, zzddVar, readLong);
                break;
            case 2:
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                boolean zza = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                boolean zza2 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                logEvent(readString, readString2, bundle, zza, zza2, readLong2);
                break;
            case 3:
                java.lang.String readString3 = parcel.readString();
                java.lang.String readString4 = parcel.readString();
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcsVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar = queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                logEventAndBundle(readString3, readString4, bundle2, zzcsVar, readLong3);
                break;
            case 4:
                java.lang.String readString5 = parcel.readString();
                java.lang.String readString6 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zza3 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                long readLong4 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setUserProperty(readString5, readString6, asInterface2, zza3, readLong4);
                break;
            case 5:
                java.lang.String readString7 = parcel.readString();
                java.lang.String readString8 = parcel.readString();
                boolean zza4 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar = queryLocalInterface2 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface2 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder2);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getUserProperties(readString7, readString8, zza4, zzcuVar);
                break;
            case 6:
                java.lang.String readString9 = parcel.readString();
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar15 = queryLocalInterface3 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface3 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder3);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getMaxUserProperties(readString9, zzcuVar15);
                break;
            case 7:
                java.lang.String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                java.lang.String readString11 = parcel.readString();
                java.lang.String readString12 = parcel.readString();
                android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                java.lang.String readString13 = parcel.readString();
                java.lang.String readString14 = parcel.readString();
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar14 = queryLocalInterface4 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface4 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder4);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getConditionalUserProperties(readString13, readString14, zzcuVar14);
                break;
            case 11:
                boolean zza5 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                long readLong7 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setMeasurementEnabled(zza5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                com.google.android.gms.dynamic.IObjectWrapper asInterface3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                java.lang.String readString15 = parcel.readString();
                java.lang.String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setCurrentScreen(asInterface3, readString15, readString16, readLong11);
                break;
            case 16:
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar13 = queryLocalInterface5 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface5 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder5);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getCurrentScreenName(zzcuVar13);
                break;
            case 17:
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar12 = queryLocalInterface6 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface6 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder6);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getCurrentScreenClass(zzcuVar12);
                break;
            case 18:
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdcVar = queryLocalInterface7 instanceof com.google.android.gms.internal.measurement.zzdc ? (com.google.android.gms.internal.measurement.zzdc) queryLocalInterface7 : new com.google.android.gms.internal.measurement.zzdb(readStrongBinder7);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setInstanceIdProvider(zzdcVar);
                break;
            case 19:
                android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar11 = queryLocalInterface8 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface8 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder8);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getCachedAppInstanceId(zzcuVar11);
                break;
            case 20:
                android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar10 = queryLocalInterface9 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface9 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder9);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getAppInstanceId(zzcuVar10);
                break;
            case 21:
                android.os.IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    android.os.IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar9 = queryLocalInterface10 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface10 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder10);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getGmpAppId(zzcuVar9);
                break;
            case 22:
                android.os.IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    android.os.IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar8 = queryLocalInterface11 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface11 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder11);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                generateEventId(zzcuVar8);
                break;
            case 23:
                java.lang.String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                java.lang.String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                com.google.android.gms.dynamic.IObjectWrapper asInterface4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityStarted(asInterface4, readLong14);
                break;
            case 26:
                com.google.android.gms.dynamic.IObjectWrapper asInterface5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityStopped(asInterface5, readLong15);
                break;
            case 27:
                com.google.android.gms.dynamic.IObjectWrapper asInterface6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityCreated(asInterface6, bundle5, readLong16);
                break;
            case 28:
                com.google.android.gms.dynamic.IObjectWrapper asInterface7 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityDestroyed(asInterface7, readLong17);
                break;
            case 29:
                com.google.android.gms.dynamic.IObjectWrapper asInterface8 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityPaused(asInterface8, readLong18);
                break;
            case 30:
                com.google.android.gms.dynamic.IObjectWrapper asInterface9 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityResumed(asInterface9, readLong19);
                break;
            case 31:
                com.google.android.gms.dynamic.IObjectWrapper asInterface10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    android.os.IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar7 = queryLocalInterface12 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface12 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivitySaveInstanceState(asInterface10, zzcuVar7, readLong20);
                break;
            case 32:
                android.os.Bundle bundle6 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    android.os.IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar6 = queryLocalInterface13 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface13 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                performAction(bundle6, zzcuVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                java.lang.String readString19 = parcel.readString();
                com.google.android.gms.dynamic.IObjectWrapper asInterface11 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface12 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.dynamic.IObjectWrapper asInterface13 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                logHealthData(readInt, readString19, asInterface11, asInterface12, asInterface13);
                break;
            case 34:
                android.os.IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    android.os.IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar3 = queryLocalInterface14 instanceof com.google.android.gms.internal.measurement.zzda ? (com.google.android.gms.internal.measurement.zzda) queryLocalInterface14 : new com.google.android.gms.internal.measurement.zzcy(readStrongBinder14);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setEventInterceptor(zzdaVar3);
                break;
            case 35:
                android.os.IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    android.os.IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar2 = queryLocalInterface15 instanceof com.google.android.gms.internal.measurement.zzda ? (com.google.android.gms.internal.measurement.zzda) queryLocalInterface15 : new com.google.android.gms.internal.measurement.zzcy(readStrongBinder15);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                registerOnMeasurementEventListener(zzdaVar2);
                break;
            case 36:
                android.os.IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    android.os.IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzdaVar = queryLocalInterface16 instanceof com.google.android.gms.internal.measurement.zzda ? (com.google.android.gms.internal.measurement.zzda) queryLocalInterface16 : new com.google.android.gms.internal.measurement.zzcy(readStrongBinder16);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                unregisterOnMeasurementEventListener(zzdaVar);
                break;
            case 37:
                java.util.HashMap zze = com.google.android.gms.internal.measurement.zzbn.zze(parcel);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                initForTests(zze);
                break;
            case 38:
                android.os.IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    android.os.IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar5 = queryLocalInterface17 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface17 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getTestFlag(zzcuVar5, readInt2);
                break;
            case 39:
                boolean zza6 = com.google.android.gms.internal.measurement.zzbn.zza(parcel);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setDataCollectionEnabled(zza6);
                break;
            case 40:
                android.os.IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    android.os.IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar4 = queryLocalInterface18 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface18 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder18);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                isDataCollectionEnabled(zzcuVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                android.os.Bundle bundle7 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                android.os.Bundle bundle8 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                android.os.Bundle bundle9 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                android.os.IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    android.os.IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar3 = queryLocalInterface19 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface19 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder19);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                getSessionId(zzcuVar3);
                break;
            case 48:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                com.google.android.gms.internal.measurement.zzdf zzdfVar = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                java.lang.String readString20 = parcel.readString();
                java.lang.String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, readString20, readString21, readLong25);
                break;
            case 51:
                com.google.android.gms.internal.measurement.zzdf zzdfVar2 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                long readLong26 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, readLong26);
                break;
            case 52:
                com.google.android.gms.internal.measurement.zzdf zzdfVar3 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                long readLong27 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, readLong27);
                break;
            case 53:
                com.google.android.gms.internal.measurement.zzdf zzdfVar4 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                android.os.Bundle bundle10 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, readLong28);
                break;
            case 54:
                com.google.android.gms.internal.measurement.zzdf zzdfVar5 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                long readLong29 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, readLong29);
                break;
            case 55:
                com.google.android.gms.internal.measurement.zzdf zzdfVar6 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                long readLong30 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, readLong30);
                break;
            case 56:
                com.google.android.gms.internal.measurement.zzdf zzdfVar7 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                long readLong31 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, readLong31);
                break;
            case 57:
                com.google.android.gms.internal.measurement.zzdf zzdfVar8 = (com.google.android.gms.internal.measurement.zzdf) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.internal.measurement.zzdf.CREATOR);
                android.os.IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    android.os.IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcuVar2 = queryLocalInterface20 instanceof com.google.android.gms.internal.measurement.zzcu ? (com.google.android.gms.internal.measurement.zzcu) queryLocalInterface20 : new com.google.android.gms.internal.measurement.zzcs(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, zzcuVar2, readLong32);
                break;
            case 58:
                android.os.IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    android.os.IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzcxVar = queryLocalInterface21 instanceof com.google.android.gms.internal.measurement.zzcx ? (com.google.android.gms.internal.measurement.zzcx) queryLocalInterface21 : new com.google.android.gms.internal.measurement.zzcv(readStrongBinder21);
                }
                com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
                retrieveAndUploadBatches(zzcxVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
