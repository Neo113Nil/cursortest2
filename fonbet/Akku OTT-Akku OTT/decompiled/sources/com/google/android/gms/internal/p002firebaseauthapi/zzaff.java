package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0836j;
import com.google.android.gms.common.api.internal.InterfaceC0837k;
import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzau;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected FirebaseApp zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected zzau zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;

    @VisibleForTesting
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzh = new ArrayList();

    public static class zza extends C0836j {
        private final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zza;

        private zza(InterfaceC0837k interfaceC0837k, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            super(interfaceC0837k);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
            InterfaceC0837k fragment = C0836j.getFragment(activity);
            if (((zza) fragment.b(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.C0836j
        @MainThread
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i) {
        this.zza = i;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        C0875q.h(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(zzau zzauVar) {
        C0875q.h(zzauVar, "external failure callback cannot be null");
        this.zzf = zzauVar;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(FirebaseApp firebaseApp) {
        C0875q.h(firebaseApp, "firebaseApp cannot be null");
        this.zzc = firebaseApp;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        C0875q.h(firebaseUser, "firebaseUser cannot be null");
        this.zzd = firebaseUser;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, @Nullable Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzagb.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list = this.zzh;
            C0875q.g(zza2);
            list.add(zza2);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        C0875q.g(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        C0875q.i(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        zzau zzauVar = zzaffVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
