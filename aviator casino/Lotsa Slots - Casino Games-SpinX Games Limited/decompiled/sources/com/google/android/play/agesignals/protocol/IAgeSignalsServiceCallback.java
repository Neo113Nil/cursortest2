package com.google.android.play.agesignals.protocol;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public interface IAgeSignalsServiceCallback extends android.os.IInterface {
    void onCompleteCheckAgeSignals(android.os.Bundle bundle) throws android.os.RemoteException;

    void onError(android.os.Bundle bundle) throws android.os.RemoteException;

    /* compiled from: com.google.android.play:age-signals@@0.0.2 */
    public static abstract class Stub extends com.google.android.gms.internal.playcore_age_signals.zzb implements com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback {

        /* compiled from: com.google.android.play:age-signals@@0.0.2 */
        public static class Proxy extends com.google.android.gms.internal.playcore_age_signals.zza implements com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onCompleteCheckAgeSignals(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                com.google.android.gms.internal.playcore_age_signals.zzc.zzc(zza, bundle);
                zzb(1, zza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onError(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                com.google.android.gms.internal.playcore_age_signals.zzc.zzc(zza, bundle);
                zzb(3, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        public static com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            return queryLocalInterface instanceof com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback ? (com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback) queryLocalInterface : new com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.playcore_age_signals.zzc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.playcore_age_signals.zzc.zzb(parcel);
                onCompleteCheckAgeSignals(bundle);
            } else {
                if (i != 3) {
                    return false;
                }
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.playcore_age_signals.zzc.zza(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.playcore_age_signals.zzc.zzb(parcel);
                onError(bundle2);
            }
            return true;
        }
    }
}
