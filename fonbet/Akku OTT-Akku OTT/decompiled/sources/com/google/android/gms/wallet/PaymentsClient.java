package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes4.dex */
public class PaymentsClient extends g<Wallet.WalletOptions> {
    public static final /* synthetic */ int zza = 0;

    public PaymentsClient(@NonNull Activity activity, @NonNull Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, g.a.c);
    }

    @NonNull
    public Task<PaymentCardRecognitionIntentResponse> getPaymentCardRecognitionIntent(@NonNull final PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.wallet.zzai
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzy) obj).zzr(PaymentCardRecognitionIntentRequest.this, (TaskCompletionSource) obj2);
            }
        };
        a.c = new C0854d[]{zzk.zzg};
        a.b = true;
        a.d = 23716;
        return doRead(a.a());
    }

    @NonNull
    public Task<Boolean> isReadyToPay(@NonNull final IsReadyToPayRequest isReadyToPayRequest) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.d = 23705;
        a.a = new r() { // from class: com.google.android.gms.wallet.zzag
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzy) obj).zzs(IsReadyToPayRequest.this, (TaskCompletionSource) obj2);
            }
        };
        return doRead(a.a());
    }

    @NonNull
    public Task<PaymentData> loadPaymentData(@NonNull final PaymentDataRequest paymentDataRequest) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.a = new r() { // from class: com.google.android.gms.wallet.zzah
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzy) obj).zzt(PaymentDataRequest.this, (TaskCompletionSource) obj2);
            }
        };
        a.c = new C0854d[]{zzk.zzc};
        a.b = true;
        a.d = 23707;
        return doWrite(a.a());
    }

    public PaymentsClient(@NonNull Context context, @NonNull Wallet.WalletOptions walletOptions) {
        super(context, Wallet.API, walletOptions, g.a.c);
    }
}
