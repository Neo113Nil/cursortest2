package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzddn extends zzcpw {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdbt zze;
    private final zzdez zzf;
    private final zzcqr zzg;
    private final zzfmn zzh;
    private final zzcvd zzi;
    private final zzbyu zzj;
    private boolean zzk;

    public zzddn(zzcpv zzcpvVar, Context context, zzceb zzcebVar, zzdbt zzdbtVar, zzdez zzdezVar, zzcqr zzcqrVar, zzfmn zzfmnVar, zzcvd zzcvdVar, zzbyu zzbyuVar) {
        super(zzcpvVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcebVar);
        this.zze = zzdbtVar;
        this.zzf = zzdezVar;
        this.zzg = zzcqrVar;
        this.zzh = zzfmnVar;
        this.zzi = zzcvdVar;
        this.zzj = zzbyuVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzceb zzcebVar = (zzceb) this.zzd.get();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgF)).booleanValue()) {
                if (!this.zzk && zzcebVar != null) {
                    zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddm
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x004f  */
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
    public final boolean zzc(boolean z4, Activity activity) {
        Context context;
        zzfaf zzfafVarZzD;
        this.zze.zzb();
        zzbbp zzbbpVar = zzbby.zzaP;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p5 = o.f1952C.f1957c;
            if (P.f(this.zzc)) {
                int i7 = J.f3546b;
                j.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzaQ)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
            } else {
                zzceb zzcebVar = (zzceb) this.zzd.get();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlS)).booleanValue() || zzcebVar == null || (zzfafVarZzD = zzcebVar.zzD()) == null || !zzfafVarZzD.zzar || zzfafVarZzD.zzas == this.zzj.zzb()) {
                    if (this.zzk) {
                        int i8 = J.f3546b;
                        j.g("The interstitial ad has been shown.");
                        this.zzi.zza(zzfcb.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzk) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        try {
                            this.zzf.zza(z4, context, this.zzi);
                            this.zze.zza();
                            this.zzk = true;
                            return true;
                        } catch (zzdey e7) {
                            this.zzi.zzc(e7);
                        }
                    }
                } else {
                    int i9 = J.f3546b;
                    j.g("The interstitial consent form has been shown.");
                    this.zzi.zza(zzfcb.zzd(12, "The consent form has already been shown.", null));
                }
            }
        } else {
            zzceb zzcebVar2 = (zzceb) this.zzd.get();
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlS)).booleanValue()) {
                if (this.zzk) {
                    int i10 = J.f3546b;
                    j.g("The interstitial ad has been shown.");
                    this.zzi.zza(zzfcb.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z4, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            } else {
                if (this.zzk) {
                    int i11 = J.f3546b;
                    j.g("The interstitial ad has been shown.");
                    this.zzi.zza(zzfcb.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzk) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    this.zzf.zza(z4, context, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                }
            }
        }
        return false;
    }
}
