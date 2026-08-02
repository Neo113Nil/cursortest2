package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends yk1 implements ev1 {
    @Override // p000.ev1
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 23);
    }

    @Override // p000.ev1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2702b(parcelM5810d, bundle);
        m5806F(parcelM5810d, 9);
    }

    @Override // p000.ev1
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 24);
    }

    @Override // p000.ev1
    public final void generateEventId(gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 22);
    }

    @Override // p000.ev1
    public final void getCachedAppInstanceId(gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 19);
    }

    @Override // p000.ev1
    public final void getConditionalUserProperties(String str, String str2, gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 10);
    }

    @Override // p000.ev1
    public final void getCurrentScreenClass(gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 17);
    }

    @Override // p000.ev1
    public final void getCurrentScreenName(gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 16);
    }

    @Override // p000.ev1
    public final void getGmpAppId(gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 21);
    }

    @Override // p000.ev1
    public final void getMaxUserProperties(String str, gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 6);
    }

    @Override // p000.ev1
    public final void getUserProperties(String str, String str2, boolean z, gv1 gv1Var) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        ClassLoader classLoader = iu1.f3667a;
        parcelM5810d.writeInt(z ? 1 : 0);
        iu1.m2703c(parcelM5810d, gv1Var);
        m5806F(parcelM5810d, 5);
    }

    @Override // p000.ev1
    public final void initialize(xb0 xb0Var, wv1 wv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, xb0Var);
        iu1.m2702b(parcelM5810d, wv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 1);
    }

    @Override // p000.ev1
    public final void initializeWithElapsedTime(xb0 xb0Var, wv1 wv1Var, long j, long j2) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, xb0Var);
        iu1.m2702b(parcelM5810d, wv1Var);
        parcelM5810d.writeLong(j);
        parcelM5810d.writeLong(j2);
        m5806F(parcelM5810d, 60);
    }

    @Override // p000.ev1
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2702b(parcelM5810d, bundle);
        parcelM5810d.writeInt(z ? 1 : 0);
        parcelM5810d.writeInt(1);
        parcelM5810d.writeLong(j);
        parcelM5810d.writeLong(j2);
        m5806F(parcelM5810d, 59);
    }

    @Override // p000.ev1
    public final void logHealthData(int i, String str, xb0 xb0Var, xb0 xb0Var2, xb0 xb0Var3) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeInt(5);
        parcelM5810d.writeString("Error with data collection. Data lost.");
        iu1.m2703c(parcelM5810d, xb0Var);
        iu1.m2703c(parcelM5810d, xb0Var2);
        iu1.m2703c(parcelM5810d, xb0Var3);
        m5806F(parcelM5810d, 33);
    }

    @Override // p000.ev1
    public final void onActivityCreatedByScionActivityInfo(xv1 xv1Var, Bundle bundle, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        iu1.m2702b(parcelM5810d, bundle);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 53);
    }

    @Override // p000.ev1
    public final void onActivityDestroyedByScionActivityInfo(xv1 xv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 54);
    }

    @Override // p000.ev1
    public final void onActivityPausedByScionActivityInfo(xv1 xv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 55);
    }

    @Override // p000.ev1
    public final void onActivityResumedByScionActivityInfo(xv1 xv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 56);
    }

    @Override // p000.ev1
    public final void onActivitySaveInstanceStateByScionActivityInfo(xv1 xv1Var, gv1 gv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        iu1.m2703c(parcelM5810d, gv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 57);
    }

    @Override // p000.ev1
    public final void onActivityStartedByScionActivityInfo(xv1 xv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 51);
    }

    @Override // p000.ev1
    public final void onActivityStoppedByScionActivityInfo(xv1 xv1Var, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 52);
    }

    @Override // p000.ev1
    public final void registerOnMeasurementEventListener(kv1 kv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, kv1Var);
        m5806F(parcelM5810d, 35);
    }

    @Override // p000.ev1
    public final void retrieveAndUploadBatches(iv1 iv1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2703c(parcelM5810d, iv1Var);
        m5806F(parcelM5810d, 58);
    }

    @Override // p000.ev1
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, bundle);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 8);
    }

    @Override // p000.ev1
    public final void setCurrentScreenByScionActivityInfo(xv1 xv1Var, String str, String str2, long j) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, xv1Var);
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 50);
    }

    @Override // p000.ev1
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // p000.ev1
    public final void setUserProperty(String str, String str2, xb0 xb0Var, boolean z, long j) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2703c(parcelM5810d, xb0Var);
        parcelM5810d.writeInt(z ? 1 : 0);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 4);
    }
}
