package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.wallet.Wallet;

/* loaded from: classes4.dex */
final class zzap extends a.AbstractC0110a {
    @Override // com.google.android.gms.common.api.a.AbstractC0110a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, C0863e c0863e, Object obj, h.a aVar, h.b bVar) {
        Wallet.WalletOptions walletOptions = (Wallet.WalletOptions) obj;
        if (walletOptions == null) {
            walletOptions = new Wallet.WalletOptions();
        }
        return new com.google.android.gms.internal.wallet.zzy(context, looper, c0863e, aVar, bVar, walletOptions.environment, walletOptions.theme, walletOptions.zzb);
    }
}
