package com.google.android.play.agesignals.protocol;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public interface IAgeSignalsService extends android.os.IInterface {

    /* compiled from: com.google.android.play:age-signals@@0.0.2 */
    public static abstract class Stub extends com.google.android.gms.internal.playcore_age_signals.zzb implements com.google.android.play.agesignals.protocol.IAgeSignalsService {

        /* compiled from: com.google.android.play:age-signals@@0.0.2 */
        public static class Proxy extends com.google.android.gms.internal.playcore_age_signals.zza implements com.google.android.play.agesignals.protocol.IAgeSignalsService {
            Proxy(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
            public void checkAgeRange(java.lang.String str, android.os.Bundle bundle, com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws android.os.RemoteException {
                android.os.Parcel zza = zza();
                zza.writeString(str);
                com.google.android.gms.internal.playcore_age_signals.zzc.zzc(zza, bundle);
                if (iAgeSignalsServiceCallback == null) {
                    zza.writeStrongBinder(null);
                } else {
                    zza.writeStrongBinder(iAgeSignalsServiceCallback.asBinder());
                }
                zzb(1, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsService");
        }

        public static com.google.android.play.agesignals.protocol.IAgeSignalsService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return queryLocalInterface instanceof com.google.android.play.agesignals.protocol.IAgeSignalsService ? (com.google.android.play.agesignals.protocol.IAgeSignalsService) queryLocalInterface : new com.google.android.play.agesignals.protocol.IAgeSignalsService.Stub.Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        protected boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            java.lang.String readString = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.playcore_age_signals.zzc.zza(parcel, android.os.Bundle.CREATOR);
            com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback asInterface = com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.internal.playcore_age_signals.zzc.zzb(parcel);
            checkAgeRange(readString, bundle, asInterface);
            return true;
        }
    }

    void checkAgeRange(java.lang.String str, android.os.Bundle bundle, com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws android.os.RemoteException;
}
