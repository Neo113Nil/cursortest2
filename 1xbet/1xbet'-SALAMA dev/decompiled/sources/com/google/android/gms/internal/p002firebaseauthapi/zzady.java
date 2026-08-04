package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0791l;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p034e4.m;
import p042f4.InterfaceC0902k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzady<ResultT, CallbackT> implements zzaek<ResultT> {
    protected final int zza;
    protected i zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected InterfaceC0902k zzf;
    protected zzadw<ResultT> zzg;
    protected Executor zzi;
    protected zzagl zzj;
    protected zzage zzk;
    protected zzafl zzl;
    protected zzagv zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzzl zzq;
    protected zzagm zzr;
    protected zzagh zzs;
    protected zzahh zzt;
    private boolean zzu;
    protected final zzaea zzb = new zzaea(this);
    protected final List<m> zzh = new ArrayList();

    public static class zza extends LifecycleCallback {
        private final List<m> zza;

        private zza(InterfaceC0791l interfaceC0791l, List<m> list) {
            super(interfaceC0791l);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<m> list) {
            InterfaceC0791l fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.b(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzady(int i7) {
        this.zza = i7;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzady<ResultT, CallbackT> zza(CallbackT callbackt) {
        D.j(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(InterfaceC0902k interfaceC0902k) {
        D.j(interfaceC0902k, "external failure callback cannot be null");
        this.zzf = interfaceC0902k;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(i iVar) {
        D.j(iVar, "firebaseApp cannot be null");
        this.zzc = iVar;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        D.j(firebaseUser, "firebaseUser cannot be null");
        this.zzd = firebaseUser;
        return this;
    }

    public final zzady<ResultT, CallbackT> zza(m mVar, Activity activity, Executor executor, String str) {
        m mVarZza = zzaer.zza(str, mVar, this);
        synchronized (this.zzh) {
            List<m> list = this.zzh;
            D.i(mVarZza);
            list.add(mVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        D.i(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzady zzadyVar) {
        zzadyVar.zzb();
        D.k("no success or failure set on method implementation", zzadyVar.zzu);
    }

    public static /* synthetic */ void zza(zzady zzadyVar, Status status) {
        InterfaceC0902k interfaceC0902k = zzadyVar.zzf;
        if (interfaceC0902k != null) {
            interfaceC0902k.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
