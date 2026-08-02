package com.google.android.gms.wallet;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes4.dex */
public class WalletObjectsClient extends g<Wallet.WalletOptions> {
    public static final /* synthetic */ int zza = 0;

    public WalletObjectsClient(@NonNull Activity activity, @Nullable Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, g.a.c);
    }

    @NonNull
    public Task<AutoResolvableVoidResult> createWalletObjects(@NonNull final CreateWalletObjectsRequest createWalletObjectsRequest) {
        AbstractC0847v.a a = AbstractC0847v.a();
        a.d = 23708;
        a.a = new r() { // from class: com.google.android.gms.wallet.zzat
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.internal.wallet.zzy) obj).zzq(CreateWalletObjectsRequest.this, (TaskCompletionSource) obj2);
            }
        };
        return doWrite(a.a());
    }
}
