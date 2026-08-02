package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv1 extends hu1 implements ev1 {
    public static ev1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof ev1 ? (ev1) iInterfaceQueryLocalInterface : new cv1(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        gv1 fv1Var = null;
        iv1 hv1Var = null;
        gv1 fv1Var2 = null;
        gv1 fv1Var3 = null;
        gv1 fv1Var4 = null;
        gv1 fv1Var5 = null;
        kv1 jv1Var = null;
        kv1 jv1Var2 = null;
        kv1 jv1Var3 = null;
        gv1 fv1Var6 = null;
        gv1 fv1Var7 = null;
        gv1 fv1Var8 = null;
        gv1 fv1Var9 = null;
        gv1 fv1Var10 = null;
        gv1 fv1Var11 = null;
        vv1 lv1Var = null;
        gv1 fv1Var12 = null;
        gv1 fv1Var13 = null;
        gv1 fv1Var14 = null;
        gv1 fv1Var15 = null;
        gv1 fv1Var16 = null;
        switch (i) {
            case 1:
                xb0 xb0VarM5187G = vs0.m5187G(parcel.readStrongBinder());
                wv1 wv1Var = (wv1) iu1.m2701a(parcel, wv1.CREATOR);
                long j = parcel.readLong();
                iu1.m2704d(parcel);
                initialize(xb0VarM5187G, wv1Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                iu1.m2704d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var = iInterfaceQueryLocalInterface instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface : new fv1(strongBinder);
                }
                gv1 gv1Var = fv1Var;
                long j3 = parcel.readLong();
                iu1.m2704d(parcel);
                logEventAndBundle(string3, string4, bundle2, gv1Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                xb0 xb0VarM5187G2 = vs0.m5187G(parcel.readStrongBinder());
                ClassLoader classLoader = iu1.f3667a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                iu1.m2704d(parcel);
                setUserProperty(string5, string6, xb0VarM5187G2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = iu1.f3667a;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var16 = iInterfaceQueryLocalInterface2 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface2 : new fv1(strongBinder2);
                }
                iu1.m2704d(parcel);
                getUserProperties(string7, string8, z5, fv1Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var15 = iInterfaceQueryLocalInterface3 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface3 : new fv1(strongBinder3);
                }
                iu1.m2704d(parcel);
                getMaxUserProperties(string9, fv1Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                iu1.m2704d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                iu1.m2704d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                iu1.m2704d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var14 = iInterfaceQueryLocalInterface4 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface4 : new fv1(strongBinder4);
                }
                iu1.m2704d(parcel);
                getConditionalUserProperties(string13, string14, fv1Var14);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                ClassLoader classLoader3 = iu1.f3667a;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                iu1.m2704d(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                long j8 = parcel.readLong();
                iu1.m2704d(parcel);
                resetAnalyticsData(j8);
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                long j9 = parcel.readLong();
                iu1.m2704d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                iu1.m2704d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                xb0 xb0VarM5187G3 = vs0.m5187G(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                iu1.m2704d(parcel);
                setCurrentScreen(xb0VarM5187G3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var13 = iInterfaceQueryLocalInterface5 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface5 : new fv1(strongBinder5);
                }
                iu1.m2704d(parcel);
                getCurrentScreenName(fv1Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var12 = iInterfaceQueryLocalInterface6 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface6 : new fv1(strongBinder6);
                }
                iu1.m2704d(parcel);
                getCurrentScreenClass(fv1Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    lv1Var = iInterfaceQueryLocalInterface7 instanceof vv1 ? (vv1) iInterfaceQueryLocalInterface7 : new lv1(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                iu1.m2704d(parcel);
                setInstanceIdProvider(lv1Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var11 = iInterfaceQueryLocalInterface8 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface8 : new fv1(strongBinder8);
                }
                iu1.m2704d(parcel);
                getCachedAppInstanceId(fv1Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var10 = iInterfaceQueryLocalInterface9 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface9 : new fv1(strongBinder9);
                }
                iu1.m2704d(parcel);
                getAppInstanceId(fv1Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var9 = iInterfaceQueryLocalInterface10 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface10 : new fv1(strongBinder10);
                }
                iu1.m2704d(parcel);
                getGmpAppId(fv1Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var8 = iInterfaceQueryLocalInterface11 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface11 : new fv1(strongBinder11);
                }
                iu1.m2704d(parcel);
                generateEventId(fv1Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                iu1.m2704d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                iu1.m2704d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                xb0 xb0VarM5187G4 = vs0.m5187G(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityStarted(xb0VarM5187G4, j14);
                break;
            case 26:
                xb0 xb0VarM5187G5 = vs0.m5187G(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityStopped(xb0VarM5187G5, j15);
                break;
            case 27:
                xb0 xb0VarM5187G6 = vs0.m5187G(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityCreated(xb0VarM5187G6, bundle5, j16);
                break;
            case 28:
                xb0 xb0VarM5187G7 = vs0.m5187G(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityDestroyed(xb0VarM5187G7, j17);
                break;
            case 29:
                xb0 xb0VarM5187G8 = vs0.m5187G(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityPaused(xb0VarM5187G8, j18);
                break;
            case 30:
                xb0 xb0VarM5187G9 = vs0.m5187G(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityResumed(xb0VarM5187G9, j19);
                break;
            case 31:
                xb0 xb0VarM5187G10 = vs0.m5187G(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var7 = iInterfaceQueryLocalInterface12 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface12 : new fv1(strongBinder12);
                }
                long j20 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivitySaveInstanceState(xb0VarM5187G10, fv1Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var6 = iInterfaceQueryLocalInterface13 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface13 : new fv1(strongBinder13);
                }
                long j21 = parcel.readLong();
                iu1.m2704d(parcel);
                performAction(bundle6, fv1Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                xb0 xb0VarM5187G11 = vs0.m5187G(parcel.readStrongBinder());
                xb0 xb0VarM5187G12 = vs0.m5187G(parcel.readStrongBinder());
                xb0 xb0VarM5187G13 = vs0.m5187G(parcel.readStrongBinder());
                iu1.m2704d(parcel);
                logHealthData(i2, string19, xb0VarM5187G11, xb0VarM5187G12, xb0VarM5187G13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jv1Var3 = iInterfaceQueryLocalInterface14 instanceof kv1 ? (kv1) iInterfaceQueryLocalInterface14 : new jv1(strongBinder14);
                }
                iu1.m2704d(parcel);
                setEventInterceptor(jv1Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jv1Var2 = iInterfaceQueryLocalInterface15 instanceof kv1 ? (kv1) iInterfaceQueryLocalInterface15 : new jv1(strongBinder15);
                }
                iu1.m2704d(parcel);
                registerOnMeasurementEventListener(jv1Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jv1Var = iInterfaceQueryLocalInterface16 instanceof kv1 ? (kv1) iInterfaceQueryLocalInterface16 : new jv1(strongBinder16);
                }
                iu1.m2704d(parcel);
                unregisterOnMeasurementEventListener(jv1Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(iu1.f3667a);
                iu1.m2704d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var5 = iInterfaceQueryLocalInterface17 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface17 : new fv1(strongBinder17);
                }
                int i3 = parcel.readInt();
                iu1.m2704d(parcel);
                getTestFlag(fv1Var5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = iu1.f3667a;
                boolean z7 = parcel.readInt() != 0;
                iu1.m2704d(parcel);
                setDataCollectionEnabled(z7);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var4 = iInterfaceQueryLocalInterface18 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface18 : new fv1(strongBinder18);
                }
                iu1.m2704d(parcel);
                isDataCollectionEnabled(fv1Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                iu1.m2704d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                iu1.m2704d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                iu1.m2704d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                iu1.m2704d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var3 = iInterfaceQueryLocalInterface19 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface19 : new fv1(strongBinder19);
                }
                iu1.m2704d(parcel);
                getSessionId(fv1Var3);
                break;
            case 48:
                Intent intent = (Intent) iu1.m2701a(parcel, Intent.CREATOR);
                iu1.m2704d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                xv1 xv1Var = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                iu1.m2704d(parcel);
                setCurrentScreenByScionActivityInfo(xv1Var, string20, string21, j25);
                break;
            case 51:
                xv1 xv1Var2 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                long j26 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityStartedByScionActivityInfo(xv1Var2, j26);
                break;
            case 52:
                xv1 xv1Var3 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                long j27 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityStoppedByScionActivityInfo(xv1Var3, j27);
                break;
            case 53:
                xv1 xv1Var4 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                Bundle bundle10 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityCreatedByScionActivityInfo(xv1Var4, bundle10, j28);
                break;
            case 54:
                xv1 xv1Var5 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                long j29 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityDestroyedByScionActivityInfo(xv1Var5, j29);
                break;
            case 55:
                xv1 xv1Var6 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                long j30 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityPausedByScionActivityInfo(xv1Var6, j30);
                break;
            case 56:
                xv1 xv1Var7 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                long j31 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivityResumedByScionActivityInfo(xv1Var7, j31);
                break;
            case 57:
                xv1 xv1Var8 = (xv1) iu1.m2701a(parcel, xv1.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fv1Var2 = iInterfaceQueryLocalInterface20 instanceof gv1 ? (gv1) iInterfaceQueryLocalInterface20 : new fv1(strongBinder20);
                }
                long j32 = parcel.readLong();
                iu1.m2704d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(xv1Var8, fv1Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    hv1Var = iInterfaceQueryLocalInterface21 instanceof iv1 ? (iv1) iInterfaceQueryLocalInterface21 : new hv1(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                iu1.m2704d(parcel);
                retrieveAndUploadBatches(hv1Var);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                iu1.m2704d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                xb0 xb0VarM5187G14 = vs0.m5187G(parcel.readStrongBinder());
                wv1 wv1Var2 = (wv1) iu1.m2701a(parcel, wv1.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                iu1.m2704d(parcel);
                initializeWithElapsedTime(xb0VarM5187G14, wv1Var2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                iu1.m2704d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
