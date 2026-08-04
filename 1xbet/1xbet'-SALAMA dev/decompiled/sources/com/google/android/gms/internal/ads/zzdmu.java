package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzdmu extends zzcpw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdez zze;
    private final zzdbt zzf;
    private final zzcvd zzg;
    private final zzcwk zzh;
    private final zzcqr zzi;
    private final zzbvq zzj;
    private final zzfmn zzk;
    private final zzfat zzl;
    private boolean zzm;

    public zzdmu(zzcpv zzcpvVar, Context context, zzceb zzcebVar, zzdez zzdezVar, zzdbt zzdbtVar, zzcvd zzcvdVar, zzcwk zzcwkVar, zzcqr zzcqrVar, zzfaf zzfafVar, zzfmn zzfmnVar, zzfat zzfatVar) {
        super(zzcpvVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdezVar;
        this.zzd = new WeakReference(zzcebVar);
        this.zzf = zzdbtVar;
        this.zzg = zzcvdVar;
        this.zzh = zzcwkVar;
        this.zzi = zzcqrVar;
        this.zzk = zzfmnVar;
        zzbvm zzbvmVar = zzfafVar.zzl;
        this.zzj = new zzbwk(zzbvmVar != null ? zzbvmVar.zza : "", zzbvmVar != null ? zzbvmVar.zzb : 1);
        this.zzl = zzfatVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzceb zzcebVar = (zzceb) this.zzd.get();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgF)).booleanValue()) {
                if (!this.zzm && zzcebVar != null) {
                    zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcebVar.destroy();
                        }
                    });
                }
            } else if (zzcebVar != null) {
                zzcebVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvq zzc() {
        return this.zzj;
    }

    public final zzfat zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzceb zzcebVar = (zzceb) this.zzd.get();
        return (zzcebVar == null || zzcebVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zzh(boolean z4, Activity activity) {
        Context context;
        zzbbp zzbbpVar = zzbby.zzaP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.f(this.zzc)) {
                int i7 = J.f3546b;
                j.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaQ)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            int i8 = J.f3546b;
            j.g("The rewarded ad have been showed.");
            this.zzg.zza(zzfcb.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z4, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdey e7) {
            this.zzg.zzc(e7);
            return false;
        }
    }
}
