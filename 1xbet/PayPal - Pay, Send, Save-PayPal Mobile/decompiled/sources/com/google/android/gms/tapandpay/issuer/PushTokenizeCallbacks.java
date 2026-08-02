package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class PushTokenizeCallbacks extends com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks.Stub {
    private final int[] zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker zzc;
    private final com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator zzd;

    private PushTokenizeCallbacks(int[] iArr, java.util.concurrent.Executor executor, com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker walletAvailabilityChecker, com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator paymentCredentialsGenerator) {
        this.zza = iArr;
        this.zzb = executor;
        this.zzc = walletAvailabilityChecker;
        this.zzd = paymentCredentialsGenerator;
    }

    public static com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks tryCreate(java.util.concurrent.Executor executor, com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker walletAvailabilityChecker, com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator paymentCredentialsGenerator, com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo) {
        if (walletAvailabilityChecker == null && paymentCredentialsGenerator == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (walletAvailabilityChecker != null) {
            arrayList.add(1);
        }
        if (paymentCredentialsGenerator != null) {
            arrayList.add(2);
            if (paymentCredentialsGenerator.getGoogleOpaquePaymentCardSupported()) {
                arrayList.add(3);
            }
            if (cobadgedTokenInfo != null && paymentCredentialsGenerator.getAuxiliaryOpaquePaymentCardSupported()) {
                arrayList.add(4);
            }
        }
        java.lang.Object[] array = arrayList.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((java.lang.Number) array[i]).intValue();
        }
        if (executor == null) {
            executor = java.util.concurrent.Executors.newSingleThreadExecutor();
        }
        return new com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks(iArr, executor, walletAvailabilityChecker, paymentCredentialsGenerator);
    }

    private static void zzc(com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks, int i) {
        try {
            iPushTokenizeResponseCallbacks.onError(i);
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public final void generatePaymentCredentials(final com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, final com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks.this.zzb(generatePaymentCredentialsRequest, iPushTokenizeResponseCallbacks);
            }
        });
    }

    @Override // com.google.android.gms.tapandpay.issuer.IPushTokenizeRequestCallbacks
    public final void isWalletAvailable(final java.lang.String str, final com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.tapandpay.issuer.zzn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks.this.zza(str, iPushTokenizeResponseCallbacks);
            }
        });
    }

    final /* synthetic */ void zza(java.lang.String str, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker walletAvailabilityChecker = this.zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(walletAvailabilityChecker);
        try {
            iPushTokenizeResponseCallbacks.onWalletAvailableResponse(walletAvailabilityChecker.isAvailable(str).get(10L, java.util.concurrent.TimeUnit.SECONDS).booleanValue());
        } catch (java.lang.Exception unused) {
            zzc(iPushTokenizeResponseCallbacks, 0);
        }
    }

    final /* synthetic */ void zzb(com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest, com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks iPushTokenizeResponseCallbacks) {
        com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator paymentCredentialsGenerator = this.zzd;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(paymentCredentialsGenerator);
        try {
            iPushTokenizeResponseCallbacks.onPaymentCredentialsResponse(paymentCredentialsGenerator.generate(generatePaymentCredentialsRequest).get(10L, java.util.concurrent.TimeUnit.SECONDS));
        } catch (java.util.concurrent.ExecutionException e) {
            zzc(iPushTokenizeResponseCallbacks, e.getCause() instanceof com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsException ? ((com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsException) e.getCause()).errorCode : 0);
        } catch (java.lang.Exception unused) {
            zzc(iPushTokenizeResponseCallbacks, 0);
        }
    }

    public final int[] getSupportedCallbackRequestTypes() {
        return this.zza;
    }
}
