package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 extends yk1 implements kv1 {
    public jv1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // p000.kv1
    /* JADX INFO: renamed from: b */
    public final int mo2967b() {
        Parcel parcelM5809c = m5809c(m5810d(), 2);
        int i = parcelM5809c.readInt();
        parcelM5809c.recycle();
        return i;
    }

    @Override // p000.kv1
    /* JADX INFO: renamed from: h */
    public final void mo2968h(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2702b(parcelM5810d, bundle);
        parcelM5810d.writeLong(j);
        m5806F(parcelM5810d, 1);
    }
}
