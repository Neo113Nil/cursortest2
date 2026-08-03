package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class AccountPicker {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class AccountChooserOptions {
        private android.accounts.Account zza;
        private java.util.ArrayList zzb;
        private java.util.ArrayList zzc;
        private boolean zzd;
        private java.lang.String zze;
        private android.os.Bundle zzf;

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
        public static class Builder {
            private android.accounts.Account zza;
            private java.util.ArrayList zzb;
            private java.util.ArrayList zzc;
            private boolean zzd = false;
            private java.lang.String zze;
            private android.os.Bundle zzf;

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions build() {
                com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions = new com.google.android.gms.common.AccountPicker.AccountChooserOptions();
                accountChooserOptions.zzf(this.zzc);
                accountChooserOptions.zzd(this.zzb);
                accountChooserOptions.zzh(this.zzd);
                accountChooserOptions.zzl(this.zzf);
                accountChooserOptions.zzb(this.zza);
                accountChooserOptions.zzj(this.zze);
                return accountChooserOptions;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(java.util.List<android.accounts.Account> list) {
                this.zzb = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(java.util.List<java.lang.String> list) {
                this.zzc = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setOptionsForAddingAccount(android.os.Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setSelectedAccount(android.accounts.Account account) {
                this.zza = account;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setTitleOverrideText(java.lang.String str) {
                this.zze = str;
                return this;
            }
        }

        final /* synthetic */ android.accounts.Account zza() {
            return this.zza;
        }

        final /* synthetic */ void zzb(android.accounts.Account account) {
            this.zza = account;
        }

        final /* synthetic */ java.util.ArrayList zzc() {
            return this.zzb;
        }

        final /* synthetic */ void zzd(java.util.ArrayList arrayList) {
            this.zzb = arrayList;
        }

        final /* synthetic */ java.util.ArrayList zze() {
            return this.zzc;
        }

        final /* synthetic */ void zzf(java.util.ArrayList arrayList) {
            this.zzc = arrayList;
        }

        final /* synthetic */ boolean zzg() {
            return this.zzd;
        }

        final /* synthetic */ void zzh(boolean z) {
            this.zzd = z;
        }

        final /* synthetic */ java.lang.String zzi() {
            return this.zze;
        }

        final /* synthetic */ void zzj(java.lang.String str) {
            this.zze = str;
        }

        final /* synthetic */ android.os.Bundle zzk() {
            return this.zzf;
        }

        final /* synthetic */ void zzl(android.os.Bundle bundle) {
            this.zzf = bundle;
        }
    }

    private AccountPicker() {
    }

    @java.lang.Deprecated
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account account, java.util.ArrayList<android.accounts.Account> arrayList, java.lang.String[] strArr, boolean z, java.lang.String str, java.lang.String str2, java.lang.String[] strArr2, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        return intent;
    }

    public static android.content.Intent newChooseAccountIntent(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
        android.content.Intent intent = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc());
        if (accountChooserOptions.zze() != null) {
            intent.putExtra("allowableAccountTypes", (java.lang.String[]) accountChooserOptions.zze().toArray(new java.lang.String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzk());
        intent.putExtra("selectedAccount", accountChooserOptions.zza());
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zzg());
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzi());
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("realClientPackage", (java.lang.String) null);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        android.os.Bundle bundle = new android.os.Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
