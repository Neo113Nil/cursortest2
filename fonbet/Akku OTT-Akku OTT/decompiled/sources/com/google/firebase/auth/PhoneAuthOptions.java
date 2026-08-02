package com.google.firebase.auth;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class PhoneAuthOptions {
    private final FirebaseAuth zza;
    private Long zzb;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks zzc;
    private Executor zzd;

    @Nullable
    private String zze;
    private Activity zzf;

    @Nullable
    private PhoneAuthProvider.ForceResendingToken zzg;

    @Nullable
    private MultiFactorSession zzh;

    @Nullable
    private PhoneMultiFactorInfo zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    public static final class Builder {
        private final FirebaseAuth zza;
        private String zzb;
        private Long zzc;
        private PhoneAuthProvider.OnVerificationStateChangedCallbacks zzd;
        private Executor zze;
        private Activity zzf;

        @Nullable
        private PhoneAuthProvider.ForceResendingToken zzg;
        private MultiFactorSession zzh;
        private PhoneMultiFactorInfo zzi;
        private boolean zzj;

        public Builder(@NonNull FirebaseAuth firebaseAuth) {
            C0875q.g(firebaseAuth);
            this.zza = firebaseAuth;
        }

        @NonNull
        public final PhoneAuthOptions build() {
            C0875q.h(this.zza, "FirebaseAuth instance cannot be null");
            C0875q.h(this.zzc, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            C0875q.h(this.zzd, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.zze = this.zza.zze;
            if (this.zzc.longValue() < 0 || this.zzc.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            MultiFactorSession multiFactorSession = this.zzh;
            if (multiFactorSession == null) {
                C0875q.e(this.zzb, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                C0875q.b(!this.zzj, "You cannot require sms validation without setting a multi-factor session.");
                C0875q.b(this.zzi == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (((com.google.firebase.auth.internal.zzam) multiFactorSession).zzd()) {
                C0875q.d(this.zzb);
                C0875q.b(this.zzi == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            } else {
                C0875q.b(this.zzi != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                C0875q.b(this.zzb == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            }
            return new PhoneAuthOptions(this.zza, this.zzc, this.zzd, this.zze, this.zzb, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
        }

        @NonNull
        public final Builder requireSmsValidation(boolean z) {
            this.zzj = z;
            return this;
        }

        @NonNull
        public final Builder setActivity(@NonNull Activity activity) {
            this.zzf = activity;
            return this;
        }

        @NonNull
        public final Builder setCallbacks(@NonNull PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
            this.zzd = onVerificationStateChangedCallbacks;
            return this;
        }

        @NonNull
        public final Builder setForceResendingToken(@NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.zzg = forceResendingToken;
            return this;
        }

        @NonNull
        public final Builder setMultiFactorHint(@NonNull PhoneMultiFactorInfo phoneMultiFactorInfo) {
            this.zzi = phoneMultiFactorInfo;
            return this;
        }

        @NonNull
        public final Builder setMultiFactorSession(@NonNull MultiFactorSession multiFactorSession) {
            this.zzh = multiFactorSession;
            return this;
        }

        @NonNull
        public final Builder setPhoneNumber(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public final Builder setTimeout(@NonNull Long l, @NonNull TimeUnit timeUnit) {
            this.zzc = Long.valueOf(TimeUnit.SECONDS.convert(l.longValue(), timeUnit));
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(FirebaseAuth.getInstance());
    }

    @Nullable
    public final Activity zza() {
        return this.zzf;
    }

    @NonNull
    public final FirebaseAuth zzb() {
        return this.zza;
    }

    @Nullable
    public final MultiFactorSession zzc() {
        return this.zzh;
    }

    @Nullable
    public final PhoneAuthProvider.ForceResendingToken zzd() {
        return this.zzg;
    }

    @NonNull
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zze() {
        return this.zzc;
    }

    @Nullable
    public final PhoneMultiFactorInfo zzf() {
        return this.zzi;
    }

    @NonNull
    public final Long zzg() {
        return this.zzb;
    }

    @Nullable
    public final String zzh() {
        return this.zze;
    }

    @NonNull
    public final Executor zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzk;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzh != null;
    }

    private PhoneAuthOptions(FirebaseAuth firebaseAuth, Long l, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, @Nullable String str, @NonNull Activity activity, @Nullable PhoneAuthProvider.ForceResendingToken forceResendingToken, @Nullable MultiFactorSession multiFactorSession, @Nullable PhoneMultiFactorInfo phoneMultiFactorInfo, boolean z) {
        this.zza = firebaseAuth;
        this.zze = str;
        this.zzb = l;
        this.zzc = onVerificationStateChangedCallbacks;
        this.zzf = activity;
        this.zzd = executor;
        this.zzg = forceResendingToken;
        this.zzh = multiFactorSession;
        this.zzi = phoneMultiFactorInfo;
        this.zzj = z;
    }

    @NonNull
    public static Builder newBuilder(@NonNull FirebaseAuth firebaseAuth) {
        return new Builder(firebaseAuth);
    }

    public final void zza(boolean z) {
        this.zzk = true;
    }

    public final void zzb(boolean z) {
        this.zzl = true;
    }
}
