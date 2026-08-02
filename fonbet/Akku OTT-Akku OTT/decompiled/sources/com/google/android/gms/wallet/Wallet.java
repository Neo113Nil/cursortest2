package com.google.android.gms.wallet;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.wallet.wobs.WalletObjects;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Wallet {

    @NonNull
    public static final a<WalletOptions> API;

    @NonNull
    public static final WalletObjects zza;

    @Deprecated
    public static final com.google.android.gms.internal.wallet.zzr zzb;
    public static final com.google.android.gms.internal.wallet.zzz zzc;
    private static final a.g zzd;
    private static final a.AbstractC0110a zze;

    static {
        a.g gVar = new a.g();
        zzd = gVar;
        zzap zzapVar = new zzap();
        zze = zzapVar;
        API = new a<>("Wallet.API", zzapVar, gVar);
        zzb = new com.google.android.gms.internal.wallet.zzr();
        zza = new com.google.android.gms.internal.wallet.zzab();
        zzc = new com.google.android.gms.internal.wallet.zzz();
    }

    private Wallet() {
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Activity activity, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(activity, walletOptions);
    }

    @NonNull
    public static WalletObjectsClient getWalletObjectsClient(@NonNull Activity activity, @Nullable WalletOptions walletOptions) {
        return new WalletObjectsClient(activity, walletOptions);
    }

    public static final class WalletOptions implements a.d.InterfaceC0111a {
        public final int environment;
        public final int theme;

        @NonNull
        public final Account zza;

        @VisibleForTesting
        final boolean zzb;

        public static final class Builder {
            private int zza = 3;
            private int zzb = 1;
            private boolean zzc = true;

            @NonNull
            public WalletOptions build() {
                return new WalletOptions(this);
            }

            @NonNull
            public Builder setEnvironment(int i) {
                if (i != 0) {
                    if (i == 0) {
                        i = 0;
                    } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                        Locale locale = Locale.US;
                        throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid environment value "));
                    }
                }
                this.zza = i;
                return this;
            }

            @NonNull
            public Builder setTheme(int i) {
                if (i == 0 || i == 1 || i == 2 || i == 3) {
                    this.zzb = i;
                    return this;
                }
                Locale locale = Locale.US;
                throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid theme value "));
            }

            @NonNull
            @Deprecated
            public Builder useGoogleWallet() {
                this.zzc = false;
                return this;
            }
        }

        private WalletOptions(Builder builder) {
            this.environment = builder.zza;
            this.theme = builder.zzb;
            this.zzb = builder.zzc;
            this.zza = null;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof WalletOptions) {
                WalletOptions walletOptions = (WalletOptions) obj;
                if (C0874p.a(Integer.valueOf(this.environment), Integer.valueOf(walletOptions.environment)) && C0874p.a(Integer.valueOf(this.theme), Integer.valueOf(walletOptions.theme)) && C0874p.a(null, null) && C0874p.a(Boolean.valueOf(this.zzb), Boolean.valueOf(walletOptions.zzb))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.a.d.InterfaceC0111a
        @NonNull
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.environment), Integer.valueOf(this.theme), null, Boolean.valueOf(this.zzb)});
        }

        private WalletOptions() {
            this(new Builder());
        }
    }

    @NonNull
    public static PaymentsClient getPaymentsClient(@NonNull Context context, @NonNull WalletOptions walletOptions) {
        return new PaymentsClient(context, walletOptions);
    }
}
