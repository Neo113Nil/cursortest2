package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class FirebaseUser extends a implements UserInfo {
    @NonNull
    public Task<Void> delete() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zza());
        return firebaseAuth.zzd.zza(this, new zzr(firebaseAuth, this));
    }

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getDisplayName();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getEmail();

    @NonNull
    public Task<GetTokenResult> getIdToken(boolean z) {
        return FirebaseAuth.getInstance(zza()).zza(this, z);
    }

    @Nullable
    public abstract FirebaseUserMetadata getMetadata();

    @NonNull
    public abstract MultiFactor getMultiFactor();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract String getPhoneNumber();

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public abstract Uri getPhotoUrl();

    @NonNull
    public abstract List<? extends UserInfo> getProviderData();

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public abstract String getProviderId();

    @Nullable
    public abstract String getTenantId();

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public abstract String getUid();

    public abstract boolean isAnonymous();

    @NonNull
    public Task<AuthResult> linkWithCredential(@NonNull AuthCredential authCredential) {
        C0875q.g(authCredential);
        return FirebaseAuth.getInstance(zza()).zza(this, authCredential);
    }

    @NonNull
    public Task<Void> reauthenticate(@NonNull AuthCredential authCredential) {
        C0875q.g(authCredential);
        return FirebaseAuth.getInstance(zza()).zzb(this, authCredential);
    }

    @NonNull
    public Task<AuthResult> reauthenticateAndRetrieveData(@NonNull AuthCredential authCredential) {
        C0875q.g(authCredential);
        return FirebaseAuth.getInstance(zza()).zzc(this, authCredential);
    }

    @NonNull
    public Task<Void> reload() {
        return FirebaseAuth.getInstance(zza()).zza(this);
    }

    @NonNull
    public Task<Void> sendEmailVerification() {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzah(this));
    }

    @NonNull
    public Task<AuthResult> startActivityForLinkWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        C0875q.g(activity);
        C0875q.g(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zza(activity, federatedAuthProvider, this);
    }

    @NonNull
    public Task<AuthResult> startActivityForReauthenticateWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        C0875q.g(activity);
        C0875q.g(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zzb(activity, federatedAuthProvider, this);
    }

    @NonNull
    public Task<AuthResult> unlink(@NonNull String str) {
        C0875q.d(str);
        return FirebaseAuth.getInstance(zza()).zzb(this, str);
    }

    @NonNull
    @Deprecated
    public Task<Void> updateEmail(@NonNull String str) {
        C0875q.d(str);
        return FirebaseAuth.getInstance(zza()).zzc(this, str);
    }

    @NonNull
    public Task<Void> updatePassword(@NonNull String str) {
        C0875q.d(str);
        return FirebaseAuth.getInstance(zza()).zzd(this, str);
    }

    @NonNull
    public Task<Void> updatePhoneNumber(@NonNull PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(zza()).zza(this, phoneAuthCredential);
    }

    @NonNull
    public Task<Void> updateProfile(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        C0875q.g(userProfileChangeRequest);
        return FirebaseAuth.getInstance(zza()).zza(this, userProfileChangeRequest);
    }

    @NonNull
    public Task<Void> verifyBeforeUpdateEmail(@NonNull String str) {
        return verifyBeforeUpdateEmail(str, null);
    }

    @NonNull
    public abstract FirebaseApp zza();

    @NonNull
    public abstract FirebaseUser zza(@NonNull List<? extends UserInfo> list);

    public abstract void zza(@NonNull zzahv zzahvVar);

    @NonNull
    public abstract FirebaseUser zzb();

    public abstract void zzb(@Nullable List<zzan> list);

    @NonNull
    public abstract zzahv zzc();

    public abstract void zzc(@NonNull List<MultiFactorInfo> list);

    @NonNull
    public abstract String zzd();

    @NonNull
    public abstract String zze();

    @NonNull
    public abstract List<zzan> zzf();

    @Nullable
    public abstract List<String> zzg();

    @NonNull
    public Task<Void> verifyBeforeUpdateEmail(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzai(this, str, actionCodeSettings));
    }

    @NonNull
    public Task<Void> sendEmailVerification(@NonNull ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zza(this, false).continueWithTask(new zzag(this, actionCodeSettings));
    }
}
