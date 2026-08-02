package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0835l;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import e4.AbstractC1039m;
import f4.InterfaceC1099k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzady<ResultT, CallbackT> implements zzaek<ResultT> {
    protected final int zza;
    protected i zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected InterfaceC1099k zzf;
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
    protected final List<AbstractC1039m> zzh = new ArrayList();

    public static class zza extends LifecycleCallback {
        private final List<AbstractC1039m> zza;

        private zza(InterfaceC0835l interfaceC0835l, List<AbstractC1039m> list) {
            super(interfaceC0835l);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<AbstractC1039m> list) {
            InterfaceC0835l fragment = LifecycleCallback.getFragment(activity);
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

    public final zzady<ResultT, CallbackT> zza(InterfaceC1099k interfaceC1099k) {
        D.j(interfaceC1099k, "external failure callback cannot be null");
        this.zzf = interfaceC1099k;
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

    public final zzady<ResultT, CallbackT> zza(AbstractC1039m abstractC1039m, Activity activity, Executor executor, String str) {
        AbstractC1039m zza2 = zzaer.zza(str, abstractC1039m, this);
        synchronized (this.zzh) {
            List<AbstractC1039m> list = this.zzh;
            D.i(zza2);
            list.add(zza2);
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
        InterfaceC1099k interfaceC1099k = zzadyVar.zzf;
        if (interfaceC1099k != null) {
            interfaceC1099k.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
