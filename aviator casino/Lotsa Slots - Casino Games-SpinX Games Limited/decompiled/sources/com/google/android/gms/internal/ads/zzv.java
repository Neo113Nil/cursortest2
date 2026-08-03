package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzv {
    public static final /* synthetic */ int zzP = 0;
    public final float zzA;
    public final int zzB;
    public final float zzC;
    public final byte[] zzD;
    public final int zzE;
    public final com.google.android.gms.internal.ads.zzi zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    public final int zzO;
    private int zzQ;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.util.List zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final java.lang.String zzk;
    public final com.google.android.gms.internal.ads.zzap zzl;
    public final java.lang.Object zzm;
    public final java.lang.String zzn;
    public final java.lang.String zzo;
    public final java.lang.String zzp;
    public final int zzq;
    public final int zzr;
    public final java.util.List zzs;
    public final com.google.android.gms.internal.ads.zzq zzt;
    public final long zzu;
    public final boolean zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final int zzz;

    static {
        new com.google.android.gms.internal.ads.zzv(new com.google.android.gms.internal.ads.zzt());
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        java.lang.Integer.toString(4, 36);
        java.lang.Integer.toString(5, 36);
        java.lang.Integer.toString(6, 36);
        java.lang.Integer.toString(7, 36);
        java.lang.Integer.toString(8, 36);
        java.lang.Integer.toString(9, 36);
        java.lang.Integer.toString(10, 36);
        java.lang.Integer.toString(11, 36);
        java.lang.Integer.toString(12, 36);
        java.lang.Integer.toString(13, 36);
        java.lang.Integer.toString(14, 36);
        java.lang.Integer.toString(15, 36);
        java.lang.Integer.toString(16, 36);
        java.lang.Integer.toString(17, 36);
        java.lang.Integer.toString(18, 36);
        java.lang.Integer.toString(19, 36);
        java.lang.Integer.toString(20, 36);
        java.lang.Integer.toString(21, 36);
        java.lang.Integer.toString(22, 36);
        java.lang.Integer.toString(23, 36);
        java.lang.Integer.toString(24, 36);
        java.lang.Integer.toString(25, 36);
        java.lang.Integer.toString(26, 36);
        java.lang.Integer.toString(27, 36);
        java.lang.Integer.toString(28, 36);
        java.lang.Integer.toString(29, 36);
        java.lang.Integer.toString(30, 36);
        java.lang.Integer.toString(31, 36);
        java.lang.Integer.toString(32, 36);
        java.lang.Integer.toString(33, 36);
        java.lang.Integer.toString(34, 36);
        java.lang.Integer.toString(35, 36);
        java.lang.Integer.toString(36, 36);
        java.lang.Integer.toString(37, 36);
    }

    private zzv(com.google.android.gms.internal.ads.zzt zztVar) {
        boolean z;
        java.lang.String str;
        this.zza = zztVar.zzP();
        java.lang.String zzi = com.google.android.gms.internal.ads.zzfl.zzi(zztVar.zzS());
        this.zzd = zzi;
        if (zztVar.zzR().isEmpty() && zztVar.zzQ() != null) {
            this.zzc = com.google.android.gms.internal.ads.zzgwm.zzj(new com.google.android.gms.internal.ads.zzx(zzi, zztVar.zzQ()));
            this.zzb = zztVar.zzQ();
        } else if (zztVar.zzR().isEmpty() || zztVar.zzQ() != null) {
            if (!zztVar.zzR().isEmpty() || zztVar.zzQ() != null) {
                for (int i = 0; i < zztVar.zzR().size(); i++) {
                    if (!((com.google.android.gms.internal.ads.zzx) zztVar.zzR().get(i)).zzb.equals(zztVar.zzQ())) {
                    }
                }
                z = false;
                com.google.android.gms.internal.ads.zzgtj.zzi(z);
                this.zzc = zztVar.zzR();
                this.zzb = zztVar.zzQ();
            }
            z = true;
            com.google.android.gms.internal.ads.zzgtj.zzi(z);
            this.zzc = zztVar.zzR();
            this.zzb = zztVar.zzQ();
        } else {
            this.zzc = zztVar.zzR();
            java.util.List zzR = zztVar.zzR();
            java.util.Iterator it = zzR.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((com.google.android.gms.internal.ads.zzx) zzR.get(0)).zzb;
                    break;
                }
                com.google.android.gms.internal.ads.zzx zzxVar = (com.google.android.gms.internal.ads.zzx) it.next();
                if (android.text.TextUtils.equals(zzxVar.zza, zzi)) {
                    str = zzxVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        }
        this.zze = zztVar.zzT();
        com.google.android.gms.internal.ads.zzgtj.zzj(zztVar.zzV() == 0 || (zztVar.zzU() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zztVar.zzU();
        this.zzg = zztVar.zzV();
        int zzW = zztVar.zzW();
        this.zzh = zzW;
        int zzX = zztVar.zzX();
        this.zzi = zzX;
        this.zzj = zzX != -1 ? zzX : zzW;
        this.zzk = zztVar.zzY();
        this.zzl = zztVar.zzZ();
        this.zzm = null;
        this.zzn = zztVar.zzaa();
        this.zzo = zztVar.zzab();
        this.zzp = zztVar.zzac();
        this.zzq = zztVar.zzad();
        this.zzr = zztVar.zzae();
        this.zzs = zztVar.zzaf() == null ? java.util.Collections.emptyList() : zztVar.zzaf();
        com.google.android.gms.internal.ads.zzq zzag = zztVar.zzag();
        this.zzt = zzag;
        this.zzu = zztVar.zzah();
        this.zzv = zztVar.zzai();
        this.zzw = zztVar.zzaj();
        this.zzx = zztVar.zzak();
        this.zzy = zztVar.zzal();
        this.zzz = zztVar.zzam();
        this.zzA = zztVar.zzan();
        this.zzB = zztVar.zzao() == -1 ? 0 : zztVar.zzao();
        this.zzC = zztVar.zzap() == -1.0f ? 1.0f : zztVar.zzap();
        this.zzD = zztVar.zzaq();
        this.zzE = zztVar.zzar();
        this.zzF = zztVar.zzas();
        this.zzG = zztVar.zzat();
        this.zzH = zztVar.zzau();
        this.zzI = zztVar.zzav();
        this.zzJ = zztVar.zzaw();
        this.zzK = zztVar.zzax() == -1 ? 0 : zztVar.zzax();
        this.zzL = zztVar.zzay() != -1 ? zztVar.zzay() : 0;
        this.zzM = zztVar.zzaz();
        this.zzN = zztVar.zzaA();
        if (zztVar.zzaB() != 0 || zzag == null) {
            this.zzO = zztVar.zzaB();
        } else {
            this.zzO = 1;
        }
    }

    /* synthetic */ zzv(com.google.android.gms.internal.ads.zzt zztVar, byte[] bArr) {
        this(zztVar);
    }

    public static java.lang.String zze(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String str;
        int i;
        int i2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("id=");
        sb.append(zzvVar.zza);
        sb.append(", mimeType=");
        sb.append(zzvVar.zzp);
        java.lang.String str2 = zzvVar.zzo;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        java.lang.String str3 = zzvVar.zzn;
        if (str3 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str3);
        }
        int i3 = zzvVar.zzj;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        java.lang.String str4 = zzvVar.zzk;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        com.google.android.gms.internal.ads.zzq zzqVar = zzvVar.zzt;
        if (zzqVar != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i4 = 0; i4 < zzqVar.zzb; i4++) {
                java.util.UUID uuid = zzqVar.zza(i4).zza;
                if (uuid.equals(com.google.android.gms.internal.ads.zzg.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(com.google.android.gms.internal.ads.zzg.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(com.google.android.gms.internal.ads.zzg.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(com.google.android.gms.internal.ads.zzg.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(com.google.android.gms.internal.ads.zzg.zza)) {
                    linkedHashSet.add(com.unity3d.ads.core.data.model.exception.GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    java.lang.String obj = uuid.toString();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(obj);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            com.google.android.gms.internal.ads.zzgtd.zzb(sb, linkedHashSet, ",");
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        int i5 = zzvVar.zzw;
        if (i5 != -1 && (i2 = zzvVar.zzx) != -1) {
            sb.append(", res=");
            sb.append(i5);
            sb.append("x");
            sb.append(i2);
        }
        int i6 = zzvVar.zzy;
        if (i6 != -1 && (i = zzvVar.zzz) != -1) {
            sb.append(", decRes=");
            sb.append(i6);
            sb.append("x");
            sb.append(i);
        }
        float f = zzvVar.zzC;
        int i7 = com.google.android.gms.internal.ads.zzgzw.zza;
        double d = f;
        if (java.lang.Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!java.lang.Double.isNaN(d) || !java.lang.Double.isNaN(1.0d))) {
            sb.append(", par=");
            java.lang.Object[] objArr = {java.lang.Float.valueOf(f)};
            java.lang.String str5 = com.google.android.gms.internal.ads.zzfl.zza;
            sb.append(java.lang.String.format(java.util.Locale.US, "%.3f", objArr));
        }
        com.google.android.gms.internal.ads.zzi zziVar = zzvVar.zzF;
        if (zziVar != null && (zziVar.zze() || zziVar.zzf())) {
            sb.append(", color=");
            sb.append(zziVar.zzg());
        }
        float f2 = zzvVar.zzA;
        if (f2 != -1.0f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        int i8 = zzvVar.zzG;
        if (i8 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i8);
        }
        int i9 = zzvVar.zzH;
        if (i9 != -1) {
            sb.append(", channels=");
            sb.append(i9);
        }
        int i10 = zzvVar.zzI;
        if (i10 != -1) {
            sb.append(", sample_rate=");
            sb.append(i10);
        }
        java.lang.String str6 = zzvVar.zzd;
        if (str6 != null) {
            sb.append(", language=");
            sb.append(str6);
        }
        java.util.List list = zzvVar.zzc;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            com.google.android.gms.internal.ads.zzgtd.zzb(sb, com.google.android.gms.internal.ads.zzgxm.zzc(list, com.google.android.gms.internal.ads.zzu.zza), ",");
            sb.append(com.ironsource.X3.j.e);
        }
        int i11 = zzvVar.zze;
        if (i11 != 0) {
            sb.append(", selectionFlags=[");
            java.lang.String str7 = com.google.android.gms.internal.ads.zzfl.zza;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if ((i11 & 1) != 0) {
                arrayList.add(com.unity3d.ads.BuildConfig.FLAVOR);
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            com.google.android.gms.internal.ads.zzgtd.zzb(sb, arrayList, ",");
            sb.append(com.ironsource.X3.j.e);
        }
        int i12 = zzvVar.zzf;
        if (i12 != 0) {
            sb.append(", roleFlags=[");
            int i13 = i12 & 32768;
            java.lang.String str8 = com.google.android.gms.internal.ads.zzfl.zza;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add(com.ironsource.X3.i.Z);
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add(com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM);
            }
            if ((i12 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i12 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i12 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i12 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i12 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i12 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i12 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i12 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i13 != 0) {
                arrayList2.add("auxiliary");
            }
            com.google.android.gms.internal.ads.zzgtd.zzb(sb, arrayList2, ",");
            sb.append(com.ironsource.X3.j.e);
        }
        if ((i12 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i14 = zzvVar.zzg;
            java.lang.String str9 = com.google.android.gms.internal.ads.zzfl.zza;
            if (i14 == 0) {
                str = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
            } else if (i14 == 1) {
                str = "original";
            } else if (i14 == 2) {
                str = "depth-linear";
            } else if (i14 == 3) {
                str = "depth-inverse";
            } else {
                if (i14 != 4) {
                    throw new java.lang.IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzv zzvVar = (com.google.android.gms.internal.ads.zzv) obj;
            int i2 = this.zzQ;
            if ((i2 == 0 || (i = zzvVar.zzQ) == 0 || i2 == i) && this.zze == zzvVar.zze && this.zzf == zzvVar.zzf && this.zzg == zzvVar.zzg && this.zzh == zzvVar.zzh && this.zzi == zzvVar.zzi && this.zzq == zzvVar.zzq && this.zzu == zzvVar.zzu && this.zzw == zzvVar.zzw && this.zzx == zzvVar.zzx && this.zzy == zzvVar.zzy && this.zzz == zzvVar.zzz && this.zzB == zzvVar.zzB && this.zzE == zzvVar.zzE && this.zzG == zzvVar.zzG && this.zzH == zzvVar.zzH && this.zzI == zzvVar.zzI && this.zzJ == zzvVar.zzJ && this.zzK == zzvVar.zzK && this.zzL == zzvVar.zzL && this.zzM == zzvVar.zzM && this.zzO == zzvVar.zzO && java.lang.Float.compare(this.zzA, zzvVar.zzA) == 0 && java.lang.Float.compare(this.zzC, zzvVar.zzC) == 0 && java.util.Objects.equals(this.zza, zzvVar.zza) && java.util.Objects.equals(this.zzb, zzvVar.zzb) && this.zzc.equals(zzvVar.zzc) && java.util.Objects.equals(this.zzk, zzvVar.zzk) && java.util.Objects.equals(this.zzn, zzvVar.zzn) && java.util.Objects.equals(this.zzo, zzvVar.zzo) && java.util.Objects.equals(this.zzp, zzvVar.zzp) && java.util.Objects.equals(this.zzd, zzvVar.zzd) && java.util.Arrays.equals(this.zzD, zzvVar.zzD) && java.util.Objects.equals(this.zzl, zzvVar.zzl) && java.util.Objects.equals(this.zzF, zzvVar.zzF) && java.util.Objects.equals(this.zzt, zzvVar.zzt) && zzd(zzvVar)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzF);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzo;
        int length3 = java.lang.String.valueOf(str3).length();
        java.lang.String str4 = this.zzp;
        int length4 = java.lang.String.valueOf(str4).length();
        java.lang.String str5 = this.zzk;
        int length5 = java.lang.String.valueOf(str5).length();
        int i = this.zzj;
        int length6 = java.lang.String.valueOf(i).length();
        java.lang.String str6 = this.zzd;
        int length7 = java.lang.String.valueOf(str6).length();
        int i2 = this.zzw;
        int length8 = java.lang.String.valueOf(i2).length();
        int i3 = this.zzx;
        int length9 = java.lang.String.valueOf(i3).length();
        float f = this.zzA;
        int length10 = java.lang.String.valueOf(f).length();
        int length11 = java.lang.String.valueOf(valueOf).length();
        int i4 = this.zzH;
        int length12 = java.lang.String.valueOf(i4).length();
        int i5 = this.zzI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + java.lang.String.valueOf(i5).length() + 2);
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final com.google.android.gms.internal.ads.zzt zza() {
        return new com.google.android.gms.internal.ads.zzt(this, null);
    }

    public final com.google.android.gms.internal.ads.zzv zzb(int i) {
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt(this, null);
        zztVar.zzN(i);
        return new com.google.android.gms.internal.ads.zzv(zztVar);
    }

    public final int zzc() {
        int i;
        int i2 = this.zzw;
        if (i2 == -1 || (i = this.zzx) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean zzd(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.util.List list = this.zzs;
        int size = list.size();
        java.util.List list2 = zzvVar.zzs;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzQ;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int hashCode2 = ((((hashCode + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.zzc.hashCode();
        java.lang.String str3 = this.zzd;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        java.lang.String str4 = this.zzk;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.google.android.gms.internal.ads.zzap zzapVar = this.zzl;
        int hashCode5 = hashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        java.lang.String str5 = this.zzn;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.zzo;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int hashCode8 = ((((((((((((((((((((((((((((((((((((((((hashCode7 + (this.zzp != null ? r2.hashCode() : 0)) * 31) + this.zzq) * 31) + ((int) this.zzu)) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31) + this.zzz) * 31) + java.lang.Float.floatToIntBits(this.zzA)) * 31) + this.zzB) * 31) + java.lang.Float.floatToIntBits(this.zzC)) * 31) + this.zzE) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) + this.zzM) * 31) - 1) * 31) - 1) * 31) + this.zzO;
        this.zzQ = hashCode8;
        return hashCode8;
    }
}
