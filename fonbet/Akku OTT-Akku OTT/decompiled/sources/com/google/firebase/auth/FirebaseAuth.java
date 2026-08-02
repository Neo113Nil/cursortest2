package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeu;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzbx;
import com.google.firebase.auth.internal.zzca;
import com.google.firebase.auth.internal.zzcb;
import com.google.firebase.auth.internal.zzcf;
import com.google.firebase.auth.internal.zzcg;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public class FirebaseAuth implements InternalAuthProvider {

    @NonNull
    protected final List<IdTokenListener> zza;
    private final Executor zzaa;
    private String zzab;

    @NonNull
    protected final List<AuthStateListener> zzb;

    @NonNull
    protected final List<com.google.firebase.auth.internal.IdTokenListener> zzc;
    protected final zzacq zzd;

    @NonNull
    protected final Executor zze;
    private final FirebaseApp zzf;

    @Nullable
    private FirebaseUser zzg;
    private final com.google.firebase.auth.internal.zzac zzh;
    private final Object zzi;
    private String zzj;
    private final Object zzk;
    private String zzl;
    private zzbx zzm;
    private final RecaptchaAction zzn;
    private final RecaptchaAction zzo;
    private final RecaptchaAction zzp;
    private final RecaptchaAction zzq;

    @VisibleForTesting
    private final RecaptchaAction zzr;

    @VisibleForTesting
    private final RecaptchaAction zzs;
    private final zzcb zzt;
    private final zzcg zzu;
    private final com.google.firebase.auth.internal.zzb zzv;
    private final Provider<InteropAppCheckTokenProvider> zzw;
    private final Provider<HeartBeatController> zzx;
    private zzca zzy;
    private final Executor zzz;

    public interface AuthStateListener {
        void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth);
    }

    public interface IdTokenListener {
        void onIdTokenChanged(@NonNull FirebaseAuth firebaseAuth);
    }

    @VisibleForTesting
    public class zza implements com.google.firebase.auth.internal.zzl {
        private final /* synthetic */ FirebaseAuth zza;

        public zza(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.zza = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzahv zzahvVar, FirebaseUser firebaseUser) {
            C0875q.g(zzahvVar);
            C0875q.g(firebaseUser);
            firebaseUser.zza(zzahvVar);
            this.zza.zza(firebaseUser, zzahvVar, true);
        }
    }

    public class zzc extends zza implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zzc(FirebaseAuth firebaseAuth) {
            super(firebaseAuth);
            Objects.requireNonNull(firebaseAuth);
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
        }
    }

    public FirebaseAuth(@NonNull FirebaseApp firebaseApp, @NonNull Provider<InteropAppCheckTokenProvider> provider, @NonNull Provider<HeartBeatController> provider2, @NonNull @Background Executor executor, @NonNull @Blocking Executor executor2, @NonNull @Lightweight Executor executor3, @NonNull @Lightweight ScheduledExecutorService scheduledExecutorService, @NonNull @UiThread Executor executor4) {
        this(firebaseApp, new zzacq(firebaseApp, executor2, scheduledExecutorService), new zzcb(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey()), zzcg.zzc(), com.google.firebase.auth.internal.zzb.zza(), provider, provider2, executor, executor2, executor3, executor4);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    private static zzca zzf(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzy == null) {
            FirebaseApp firebaseApp = firebaseAuth.zzf;
            C0875q.g(firebaseApp);
            firebaseAuth.zzy = new zzca(firebaseApp);
        }
        return firebaseAuth.zzy;
    }

    @VisibleForTesting
    private final synchronized zzca zzi() {
        return zzf(this);
    }

    public void addAuthStateListener(@NonNull AuthStateListener authStateListener) {
        this.zzb.add(authStateListener);
        this.zze.execute(new zzu(this, authStateListener));
    }

    public void addIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        this.zza.add(idTokenListener);
        this.zze.execute(new zzh(this, idTokenListener));
    }

    @NonNull
    public Task<Void> applyActionCode(@NonNull String str) {
        C0875q.d(str);
        return this.zzd.zza(this.zzf, str, this.zzl);
    }

    @NonNull
    public Task<ActionCodeResult> checkActionCode(@NonNull String str) {
        C0875q.d(str);
        return this.zzd.zzb(this.zzf, str, this.zzl);
    }

    @NonNull
    public Task<Void> confirmPasswordReset(@NonNull String str, @NonNull String str2) {
        C0875q.d(str);
        C0875q.d(str2);
        return this.zzd.zza(this.zzf, str, str2, this.zzl);
    }

    @NonNull
    public Task<AuthResult> createUserWithEmailAndPassword(@NonNull String str, @NonNull String str2) {
        C0875q.d(str);
        C0875q.d(str2);
        return new zzn(this, str, str2).zza(this, this.zzl, this.zzp, "EMAIL_PASSWORD_PROVIDER");
    }

    @NonNull
    @Deprecated
    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(@NonNull String str) {
        C0875q.d(str);
        return this.zzd.zzc(this.zzf, str, this.zzl);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    @NonNull
    public Task<GetTokenResult> getAccessToken(boolean z) {
        return zza(this.zzg, z);
    }

    @NonNull
    public FirebaseApp getApp() {
        return this.zzf;
    }

    @Nullable
    public FirebaseUser getCurrentUser() {
        return this.zzg;
    }

    @Nullable
    public String getCustomAuthDomain() {
        return this.zzab;
    }

    @NonNull
    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzh;
    }

    @Nullable
    public String getLanguageCode() {
        String str;
        synchronized (this.zzi) {
            str = this.zzj;
        }
        return str;
    }

    @Nullable
    public Task<AuthResult> getPendingAuthResult() {
        return this.zzu.zza();
    }

    @Nullable
    public String getTenantId() {
        String str;
        synchronized (this.zzk) {
            str = this.zzl;
        }
        return str;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    @Nullable
    public String getUid() {
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    @NonNull
    public Task<Void> initializeRecaptchaConfig() {
        if (this.zzm == null) {
            this.zzm = new zzbx(this.zzf, this);
        }
        return this.zzm.zza(this.zzl, Boolean.FALSE).continueWithTask(new zzaa(this));
    }

    public boolean isSignInWithEmailLink(@NonNull String str) {
        return EmailAuthCredential.zza(str);
    }

    public void removeAuthStateListener(@NonNull AuthStateListener authStateListener) {
        this.zzb.remove(authStateListener);
    }

    public void removeIdTokenListener(@NonNull IdTokenListener idTokenListener) {
        this.zza.remove(idTokenListener);
    }

    @NonNull
    public Task<Void> revokeAccessToken(@NonNull String str) {
        C0875q.d(str);
        FirebaseUser currentUser = getCurrentUser();
        C0875q.g(currentUser);
        return currentUser.getIdToken(false).continueWithTask(new zzw(this, str));
    }

    @NonNull
    public Task<Void> sendPasswordResetEmail(@NonNull String str) {
        C0875q.d(str);
        return sendPasswordResetEmail(str, null);
    }

    @NonNull
    public Task<Void> sendSignInLinkToEmail(@NonNull String str, @NonNull ActionCodeSettings actionCodeSettings) {
        C0875q.d(str);
        C0875q.g(actionCodeSettings);
        if (!actionCodeSettings.canHandleCodeInApp()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.zzj;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        return new zzp(this, str, actionCodeSettings).zza(this, this.zzl, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    public void setCustomAuthDomain(@NonNull String str) {
        C0875q.d(str);
        if (str.startsWith("chrome-extension://")) {
            this.zzab = str;
            return;
        }
        try {
            String host = new URI(str.contains("://") ? str : "http://".concat(str)).getHost();
            C0875q.g(host);
            this.zzab = host;
        } catch (URISyntaxException e) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                e.getMessage();
            }
            this.zzab = str;
        }
    }

    @NonNull
    public Task<Void> setFirebaseUIVersion(@Nullable String str) {
        return this.zzd.zza(str);
    }

    public void setLanguageCode(@NonNull String str) {
        C0875q.d(str);
        synchronized (this.zzi) {
            this.zzj = str;
        }
    }

    public void setTenantId(@NonNull String str) {
        C0875q.d(str);
        synchronized (this.zzk) {
            this.zzl = str;
        }
    }

    @NonNull
    public Task<AuthResult> signInAnonymously() {
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser == null || !firebaseUser.isAnonymous()) {
            return this.zzd.zza(this.zzf, new zza(this), this.zzl);
        }
        com.google.firebase.auth.internal.zzaf zzafVar = (com.google.firebase.auth.internal.zzaf) this.zzg;
        zzafVar.zza(false);
        return Tasks.forResult(new com.google.firebase.auth.internal.zzz(zzafVar));
    }

    @NonNull
    public Task<AuthResult> signInWithCredential(@NonNull AuthCredential authCredential) {
        C0875q.g(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (!(zza2 instanceof EmailAuthCredential)) {
            if (zza2 instanceof PhoneAuthCredential) {
                return this.zzd.zza(this.zzf, (PhoneAuthCredential) zza2, this.zzl, (com.google.firebase.auth.internal.zzl) new zza(this));
            }
            return this.zzd.zza(this.zzf, zza2, this.zzl, new zza(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
        if (emailAuthCredential.zzf()) {
            String zze = emailAuthCredential.zze();
            C0875q.d(zze);
            return zzb(zze) ? Tasks.forException(zzaen.zza(new Status(17072, null, null, null))) : zza(emailAuthCredential, (FirebaseUser) null, false);
        }
        String zzc2 = emailAuthCredential.zzc();
        String zzd = emailAuthCredential.zzd();
        C0875q.g(zzd);
        return zza(zzc2, zzd, this.zzl, (FirebaseUser) null, false);
    }

    @NonNull
    public Task<AuthResult> signInWithCustomToken(@NonNull String str) {
        C0875q.d(str);
        return this.zzd.zza(this.zzf, str, this.zzl, new zza(this));
    }

    @NonNull
    public Task<AuthResult> signInWithEmailAndPassword(@NonNull String str, @NonNull String str2) {
        C0875q.d(str);
        C0875q.d(str2);
        return zza(str, str2, this.zzl, (FirebaseUser) null, false);
    }

    @NonNull
    public Task<AuthResult> signInWithEmailLink(@NonNull String str, @NonNull String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public void signOut() {
        zzg();
        zzca zzcaVar = this.zzy;
        if (zzcaVar != null) {
            zzcaVar.zza();
        }
    }

    @NonNull
    public Task<AuthResult> startActivityForSignInWithProvider(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider) {
        C0875q.g(federatedAuthProvider);
        C0875q.g(activity);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzu.zza(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzaen.zza(new Status(17057, null, null, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.auth.FirebaseAuth$zzc, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public Task<Void> updateCurrentUser(@NonNull FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser == null) {
            throw new IllegalArgumentException("Cannot update current user with null user!");
        }
        String tenantId = firebaseUser.getTenantId();
        if ((tenantId != null && !tenantId.equals(this.zzl)) || ((str = this.zzl) != null && !str.equals(tenantId))) {
            return Tasks.forException(zzaen.zza(new Status(17072, null, null, null)));
        }
        String apiKey = firebaseUser.zza().getOptions().getApiKey();
        String apiKey2 = this.zzf.getOptions().getApiKey();
        if (!firebaseUser.zzc().zzg() || !apiKey2.equals(apiKey)) {
            return zza(firebaseUser, (zzcf) new zzc(this));
        }
        zza(com.google.firebase.auth.internal.zzaf.zza(this.zzf, firebaseUser), firebaseUser.zzc(), true);
        return Tasks.forResult(null);
    }

    public void useAppLanguage() {
        synchronized (this.zzi) {
            this.zzj = zzafd.zza();
        }
    }

    public void useEmulator(@NonNull String str, int i) {
        C0875q.d(str);
        C0875q.b(i >= 0 && i <= 65535, "Port number must be in the range 0-65535");
        zzagl.zza(this.zzf, str, i);
    }

    @NonNull
    public Task<String> verifyPasswordResetCode(@NonNull String str) {
        C0875q.d(str);
        return this.zzd.zzd(this.zzf, str, this.zzl);
    }

    public final void zzg() {
        C0875q.g(this.zzt);
        FirebaseUser firebaseUser = this.zzg;
        if (firebaseUser != null) {
            this.zzt.zzb(firebaseUser);
            this.zzg = null;
        }
        this.zzt.zzb();
        zzb(this, (FirebaseUser) null);
        zza(this, (FirebaseUser) null);
    }

    @VisibleForTesting
    public final boolean zzh() {
        return zzaeu.zza(getApp().getApplicationContext());
    }

    @VisibleForTesting
    public class zzb implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        private final /* synthetic */ FirebaseAuth zza;

        public zzb(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.zza = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
            int i = status.a;
            if (i == 17011 || i == 17021 || i == 17005 || i == 17091) {
                this.zza.signOut();
            }
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzahv zzahvVar, FirebaseUser firebaseUser) {
            C0875q.g(zzahvVar);
            C0875q.g(firebaseUser);
            firebaseUser.zza(zzahvVar);
            this.zza.zza(firebaseUser, zzahvVar, true, true);
        }
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void removeIdTokenListener(@NonNull com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        C0875q.g(idTokenListener);
        this.zzc.remove(idTokenListener);
        zzi().zza(this.zzc.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zzb(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        C0875q.g(firebaseUser);
        C0875q.g(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (!(zza2 instanceof EmailAuthCredential)) {
            return zza2 instanceof PhoneAuthCredential ? this.zzd.zza(this.zzf, firebaseUser, (PhoneAuthCredential) zza2, this.zzl, (zzcf) new zzb(this)) : this.zzd.zzb(this.zzf, firebaseUser, zza2, firebaseUser.getTenantId(), (zzcf) new zzb(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
        if ("password".equals(emailAuthCredential.getSignInMethod())) {
            return zza(firebaseUser, emailAuthCredential, false);
        }
        String zze = emailAuthCredential.zze();
        C0875q.d(zze);
        return zzb(zze) ? Tasks.forException(zzaen.zza(new Status(17072, null, null, null))) : zza(firebaseUser, emailAuthCredential, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<AuthResult> zzc(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        C0875q.g(firebaseUser);
        C0875q.g(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (!(zza2 instanceof EmailAuthCredential)) {
            return zza2 instanceof PhoneAuthCredential ? this.zzd.zzb(this.zzf, firebaseUser, (PhoneAuthCredential) zza2, this.zzl, (zzcf) new zzb(this)) : this.zzd.zzc(this.zzf, firebaseUser, zza2, firebaseUser.getTenantId(), new zzb(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
        if (!"password".equals(emailAuthCredential.getSignInMethod())) {
            String zze = emailAuthCredential.zze();
            C0875q.d(zze);
            return zzb(zze) ? Tasks.forException(zzaen.zza(new Status(17072, null, null, null))) : zza(emailAuthCredential, firebaseUser, true);
        }
        String zzc2 = emailAuthCredential.zzc();
        String zzd = emailAuthCredential.zzd();
        C0875q.d(zzd);
        return zza(zzc2, zzd, firebaseUser.getTenantId(), firebaseUser, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zzd(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        C0875q.g(firebaseUser);
        C0875q.d(str);
        return this.zzd.zzd(this.zzf, firebaseUser, str, new zzb(this));
    }

    @NonNull
    public final Executor zze() {
        return this.zzz;
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void addIdTokenListener(@NonNull com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        C0875q.g(idTokenListener);
        this.zzc.add(idTokenListener);
        zzi().zza(this.zzc.size());
    }

    @NonNull
    public Task<Void> sendPasswordResetEmail(@NonNull String str, @Nullable ActionCodeSettings actionCodeSettings) {
        C0875q.d(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzj;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        actionCodeSettings.zza(1);
        return new zzq(this, str, actionCodeSettings).zza(this, this.zzl, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull MultiFactorAssertion multiFactorAssertion, @Nullable String str) {
        C0875q.g(firebaseUser);
        C0875q.g(multiFactorAssertion);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zzd.zza(this.zzf, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new zza(this));
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zzd.zza(this.zzf, (TotpMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, this.zzl, new zza(this));
        }
        return Tasks.forException(zzaen.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR, null, null, null)));
    }

    @NonNull
    public final Provider<HeartBeatController> zzd() {
        return this.zzx;
    }

    @NonNull
    public final Executor zzf() {
        return this.zzaa;
    }

    @VisibleForTesting
    private FirebaseAuth(FirebaseApp firebaseApp, zzacq zzacqVar, zzcb zzcbVar, zzcg zzcgVar, com.google.firebase.auth.internal.zzb zzbVar, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, @Background Executor executor, @Blocking Executor executor2, @Lightweight Executor executor3, @UiThread Executor executor4) {
        zzahv zza2;
        this.zza = new CopyOnWriteArrayList();
        this.zzb = new CopyOnWriteArrayList();
        this.zzc = new CopyOnWriteArrayList();
        this.zzi = new Object();
        this.zzk = new Object();
        this.zzn = RecaptchaAction.custom("getOobCode");
        this.zzo = RecaptchaAction.custom("signInWithPassword");
        this.zzp = RecaptchaAction.custom("signUpPassword");
        this.zzq = RecaptchaAction.custom("sendVerificationCode");
        this.zzr = RecaptchaAction.custom("mfaSmsEnrollment");
        this.zzs = RecaptchaAction.custom("mfaSmsSignIn");
        C0875q.g(firebaseApp);
        this.zzf = firebaseApp;
        C0875q.g(zzacqVar);
        this.zzd = zzacqVar;
        C0875q.g(zzcbVar);
        this.zzt = zzcbVar;
        this.zzh = new com.google.firebase.auth.internal.zzac();
        C0875q.g(zzcgVar);
        this.zzu = zzcgVar;
        C0875q.g(zzbVar);
        this.zzv = zzbVar;
        this.zzw = provider;
        this.zzx = provider2;
        this.zzz = executor2;
        this.zzaa = executor3;
        this.zze = executor4;
        FirebaseUser zza3 = zzcbVar.zza();
        this.zzg = zza3;
        if (zza3 != null && (zza2 = zzcbVar.zza(zza3)) != null) {
            zza(this, this.zzg, zza2, false, false);
        }
        zzcgVar.zza(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcf, com.google.firebase.auth.zzx] */
    @NonNull
    public final Task<GetTokenResult> zza(@Nullable FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(zzaen.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER, null, null, null)));
        }
        zzahv zzc2 = firebaseUser.zzc();
        if (zzc2.zzg() && !z) {
            return Tasks.forResult(zzbi.zza(zzc2.zzc()));
        }
        return this.zzd.zza(this.zzf, firebaseUser, zzc2.zzd(), (zzcf) new zzx(this));
    }

    @NonNull
    public final Task<AuthResult> zzb(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider, @NonNull FirebaseUser firebaseUser) {
        C0875q.g(activity);
        C0875q.g(federatedAuthProvider);
        C0875q.g(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzu.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzaen.zza(new Status(17057, null, null, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final Task<zzahr> zza() {
        return this.zzd.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zzc(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        C0875q.g(firebaseUser);
        C0875q.d(str);
        return this.zzd.zzc(this.zzf, firebaseUser, str, new zzb(this));
    }

    @NonNull
    public final Task<zzahs> zza(@NonNull String str) {
        return this.zzd.zza(this.zzl, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<AuthResult> zza(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        C0875q.g(authCredential);
        C0875q.g(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new zzo(this, firebaseUser, (EmailAuthCredential) authCredential.zza()).zza(this, firebaseUser.getTenantId(), this.zzp, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.zzd.zza(this.zzf, firebaseUser, authCredential.zza(), (String) null, (zzcf) new zzb(this));
    }

    @NonNull
    public final Provider<InteropAppCheckTokenProvider> zzc() {
        return this.zzw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<AuthResult> zzb(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        C0875q.d(str);
        C0875q.g(firebaseUser);
        return this.zzd.zzb(this.zzf, firebaseUser, str, new zzb(this));
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, zzcf zzcfVar) {
        C0875q.g(firebaseUser);
        return this.zzd.zza(this.zzf, firebaseUser, zzcfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser) {
        return zza(firebaseUser, (zzcf) new zzb(this));
    }

    public final synchronized zzbx zzb() {
        return this.zzm;
    }

    private static void zzb(FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            firebaseUser.getUid();
        }
        firebaseAuth.zze.execute(new zzv(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    public final Task<AuthResult> zza(MultiFactorAssertion multiFactorAssertion, com.google.firebase.auth.internal.zzam zzamVar, @Nullable FirebaseUser firebaseUser) {
        C0875q.g(multiFactorAssertion);
        C0875q.g(zzamVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            String zzc2 = zzamVar.zzc();
            C0875q.d(zzc2);
            return this.zzd.zza(this.zzf, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, zzc2, new zza(this));
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            String zzc3 = zzamVar.zzc();
            C0875q.d(zzc3);
            return this.zzd.zza(this.zzf, firebaseUser, (TotpMultiFactorAssertion) multiFactorAssertion, zzc3, this.zzl, new zza(this));
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    private final boolean zzb(String str) {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(str);
        return (parseLink == null || TextUtils.equals(this.zzl, parseLink.zza())) ? false : true;
    }

    @NonNull
    public final Task<Void> zza(@Nullable ActionCodeSettings actionCodeSettings, @NonNull String str) {
        C0875q.d(str);
        if (this.zzj != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zza(this.zzj);
        }
        return this.zzd.zza(this.zzf, actionCodeSettings, str);
    }

    @NonNull
    public final Task<AuthResult> zza(@NonNull Activity activity, @NonNull FederatedAuthProvider federatedAuthProvider, @NonNull FirebaseUser firebaseUser) {
        C0875q.g(activity);
        C0875q.g(federatedAuthProvider);
        C0875q.g(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzu.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzaen.zza(new Status(17057, null, null, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<TotpSecret> zza(com.google.firebase.auth.internal.zzam zzamVar) {
        C0875q.g(zzamVar);
        return this.zzd.zza(zzamVar, this.zzl).continueWithTask(new zzt(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull String str) {
        C0875q.g(firebaseUser);
        C0875q.d(str);
        return this.zzd.zza(this.zzf, firebaseUser, str, this.zzl, (zzcf) new zzb(this)).continueWithTask(new zzs(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull PhoneAuthCredential phoneAuthCredential) {
        C0875q.g(firebaseUser);
        C0875q.g(phoneAuthCredential);
        return this.zzd.zza(this.zzf, firebaseUser, (PhoneAuthCredential) phoneAuthCredential.zza(), (zzcf) new zzb(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @NonNull
    public final Task<Void> zza(@NonNull FirebaseUser firebaseUser, @NonNull UserProfileChangeRequest userProfileChangeRequest) {
        C0875q.g(firebaseUser);
        C0875q.g(userProfileChangeRequest);
        return this.zzd.zza(this.zzf, firebaseUser, userProfileChangeRequest, (zzcf) new zzb(this));
    }

    @NonNull
    public final Task<Void> zza(@NonNull String str, @NonNull String str2, @Nullable ActionCodeSettings actionCodeSettings) {
        C0875q.d(str);
        C0875q.d(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzj;
        if (str3 != null) {
            actionCodeSettings.zza(str3);
        }
        return this.zzd.zza(str, str2, actionCodeSettings);
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z) {
        return new zzab(this, z, firebaseUser, emailAuthCredential).zza(this, this.zzl, z ? this.zzn : this.zzo, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(String str, String str2, @Nullable String str3, @Nullable FirebaseUser firebaseUser, boolean z) {
        return new zzz(this, str, z, firebaseUser, str2, str3).zza(this, str3, this.zzo, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(EmailAuthCredential emailAuthCredential, @Nullable FirebaseUser firebaseUser, boolean z) {
        return new zzac(this, z, firebaseUser, emailAuthCredential).zza(this, this.zzl, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    @VisibleForTesting
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(PhoneAuthOptions phoneAuthOptions, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, com.google.firebase.auth.internal.zzj zzjVar) {
        return phoneAuthOptions.zzj() ? onVerificationStateChangedCallbacks : new zzl(this, phoneAuthOptions, zzjVar, onVerificationStateChangedCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(@Nullable String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (this.zzh.zzd() && str != null && str.equals(this.zzh.zza())) ? new zzm(this, onVerificationStateChangedCallbacks) : onVerificationStateChangedCallbacks;
    }

    public static void zza(@NonNull final FirebaseException firebaseException, @NonNull PhoneAuthOptions phoneAuthOptions, @NonNull String str) {
        final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzagb.zza(str, phoneAuthOptions.zze(), null);
        phoneAuthOptions.zzi().execute(new Runnable() { // from class: com.google.firebase.auth.zzi
            @Override // java.lang.Runnable
            public final void run() {
                PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onVerificationFailed(firebaseException);
            }
        });
    }

    public final synchronized void zza(zzbx zzbxVar) {
        this.zzm = zzbxVar;
    }

    public final void zza(FirebaseUser firebaseUser, zzahv zzahvVar, boolean z) {
        zza(firebaseUser, zzahvVar, true, false);
    }

    @VisibleForTesting
    public final void zza(FirebaseUser firebaseUser, zzahv zzahvVar, boolean z, boolean z2) {
        zza(this, firebaseUser, zzahvVar, true, z2);
    }

    private static void zza(FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            firebaseUser.getUid();
        }
        firebaseAuth.zze.execute(new zzy(firebaseAuth));
    }

    @VisibleForTesting
    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahv zzahvVar, boolean z, boolean z2) {
        boolean z3;
        C0875q.g(firebaseUser);
        C0875q.g(zzahvVar);
        boolean z4 = true;
        boolean z5 = firebaseAuth.zzg != null && firebaseUser.getUid().equals(firebaseAuth.zzg.getUid());
        if (z5 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzg;
            if (firebaseUser2 == null) {
                z3 = true;
            } else {
                boolean z6 = (z5 && firebaseUser2.zzc().zzc().equals(zzahvVar.zzc())) ? false : true;
                z3 = z5 ? false : true;
                z4 = z6;
            }
            if (firebaseAuth.zzg != null && firebaseUser.getUid().equals(firebaseAuth.getUid())) {
                firebaseAuth.zzg.zza(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzg.zzb();
                }
                List<MultiFactorInfo> enrolledFactors = firebaseUser.getMultiFactor().getEnrolledFactors();
                List<zzan> zzf = firebaseUser.zzf();
                firebaseAuth.zzg.zzc(enrolledFactors);
                firebaseAuth.zzg.zzb(zzf);
            } else {
                firebaseAuth.zzg = firebaseUser;
            }
            if (z) {
                firebaseAuth.zzt.zzc(firebaseAuth.zzg);
            }
            if (z4) {
                FirebaseUser firebaseUser3 = firebaseAuth.zzg;
                if (firebaseUser3 != null) {
                    firebaseUser3.zza(zzahvVar);
                }
                zzb(firebaseAuth, firebaseAuth.zzg);
            }
            if (z3) {
                zza(firebaseAuth, firebaseAuth.zzg);
            }
            if (z) {
                firebaseAuth.zzt.zza(firebaseUser, zzahvVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.zzg;
            if (firebaseUser4 != null) {
                zzf(firebaseAuth).zza(firebaseUser4.zzc());
            }
        }
    }

    public static void zza(@NonNull PhoneAuthOptions phoneAuthOptions) {
        String str;
        String phoneNumber;
        if (phoneAuthOptions.zzm()) {
            FirebaseAuth zzb2 = phoneAuthOptions.zzb();
            MultiFactorSession zzc2 = phoneAuthOptions.zzc();
            C0875q.g(zzc2);
            com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) zzc2;
            if (zzamVar.zzd()) {
                String zzh = phoneAuthOptions.zzh();
                C0875q.d(zzh);
                phoneNumber = zzh;
                str = phoneNumber;
            } else {
                PhoneMultiFactorInfo zzf = phoneAuthOptions.zzf();
                C0875q.g(zzf);
                String uid = zzf.getUid();
                C0875q.d(uid);
                str = uid;
                phoneNumber = zzf.getPhoneNumber();
            }
            if (phoneAuthOptions.zzd() == null || !zzagb.zza(str, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
                zzb2.zzv.zza(zzb2, phoneNumber, phoneAuthOptions.zza(), zzb2.zzh(), phoneAuthOptions.zzj(), phoneAuthOptions.zzl(), zzamVar.zzd() ? zzb2.zzr : zzb2.zzs).addOnCompleteListener(new zzj(zzb2, phoneAuthOptions, str));
                return;
            }
            return;
        }
        FirebaseAuth zzb3 = phoneAuthOptions.zzb();
        String zzh2 = phoneAuthOptions.zzh();
        C0875q.d(zzh2);
        if (phoneAuthOptions.zzd() == null && zzagb.zza(zzh2, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
            return;
        }
        zzb3.zzv.zza(zzb3, zzh2, phoneAuthOptions.zza(), zzb3.zzh(), phoneAuthOptions.zzj(), phoneAuthOptions.zzl(), zzb3.zzq).addOnCompleteListener(new zzk(zzb3, phoneAuthOptions, zzh2));
    }

    public final void zza(PhoneAuthOptions phoneAuthOptions, com.google.firebase.auth.internal.zzj zzjVar) {
        PhoneAuthOptions phoneAuthOptions2;
        long longValue = phoneAuthOptions.zzg().longValue();
        if (longValue >= 0 && longValue <= 120) {
            String zzh = phoneAuthOptions.zzh();
            C0875q.d(zzh);
            String zzc2 = zzjVar.zzc();
            String zzb2 = zzjVar.zzb();
            String zzd = zzjVar.zzd();
            if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(zzc2) && zzb() != null && zzb().zza("PHONE_PROVIDER")) {
                zzc2 = "NO_RECAPTCHA";
            }
            String str = zzc2;
            zzaij zzaijVar = new zzaij(zzh, longValue, phoneAuthOptions.zzd() != null, this.zzj, this.zzl, zzd, zzb2, str, zzh());
            PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zza(zzh, phoneAuthOptions.zze());
            if (TextUtils.isEmpty(zzjVar.zzd())) {
                phoneAuthOptions2 = phoneAuthOptions;
                zza2 = zza(phoneAuthOptions2, zza2, com.google.firebase.auth.internal.zzj.zza().zzc(zzd).zzb(str).zza(zzb2).zza());
            } else {
                phoneAuthOptions2 = phoneAuthOptions;
            }
            this.zzd.zza(this.zzf, zzaijVar, zza2, phoneAuthOptions2.zza(), phoneAuthOptions2.zzi());
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }
}
