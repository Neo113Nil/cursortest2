package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdpz {
    public static final zzfwh zza;
    public static final zzfwh zzb;
    private final String zzc;
    private final zzdpy zzd;
    private final zzdpy zze;

    static {
        zzdpy zzdpyVar = zzdpy.PUBLIC_API_CALL;
        zzdpy zzdpyVar2 = zzdpy.PUBLIC_API_CALLBACK;
        zzdpz zzdpzVar = new zzdpz("tqgt", zzdpyVar, zzdpyVar2);
        zzdpy zzdpyVar3 = zzdpy.DYNAMITE_ENTER;
        zzdpz zzdpzVar2 = new zzdpz("l.dl", zzdpyVar, zzdpyVar3);
        zzdpy zzdpyVar4 = zzdpy.READ_FROM_DISK_START;
        zzdpz zzdpzVar3 = new zzdpz("l.rccde", zzdpyVar3, zzdpyVar4);
        zzdpz zzdpzVar4 = new zzdpz("l.rfd", zzdpyVar4, zzdpy.READ_FROM_DISK_END);
        zzdpy zzdpyVar5 = zzdpy.CLIENT_SIGNALS_START;
        zzdpz zzdpzVar5 = new zzdpz("l.rcc", zzdpyVar3, zzdpyVar5);
        zzdpy zzdpyVar6 = zzdpy.CLIENT_SIGNALS_END;
        zzdpz zzdpzVar6 = new zzdpz("l.cs", zzdpyVar5, zzdpyVar6);
        zzdpy zzdpyVar7 = zzdpy.SERVICE_CONNECTED;
        zzdpz zzdpzVar7 = new zzdpz("l.cts", zzdpyVar6, zzdpyVar7);
        zzdpy zzdpyVar8 = zzdpy.GMS_SIGNALS_START;
        zzdpy zzdpyVar9 = zzdpy.GMS_SIGNALS_END;
        zzdpz zzdpzVar8 = new zzdpz("l.gs", zzdpyVar8, zzdpyVar9);
        zzdpy zzdpyVar10 = zzdpy.GET_SIGNALS_SDKCORE_START;
        zzdpz zzdpzVar9 = new zzdpz("l.jse", zzdpyVar9, zzdpyVar10);
        zzdpy zzdpyVar11 = zzdpy.GET_SIGNALS_SDKCORE_END;
        zzdpz zzdpzVar10 = new zzdpz("l.gs-sdkcore", zzdpyVar10, zzdpyVar11);
        zzdpz zzdpzVar11 = new zzdpz("l.gs-pp", zzdpyVar11, zzdpyVar2);
        zzdpy zzdpyVar12 = zzdpy.RENDERING_START;
        zzdpz zzdpzVar12 = new zzdpz("l.render", zzdpyVar12, zzdpyVar2);
        zzdpy zzdpyVar13 = zzdpy.RENDERING_WEBVIEW_CREATION_START;
        zzdpz zzdpzVar13 = new zzdpz("l.render.pre", zzdpyVar12, zzdpyVar13);
        zzdpy zzdpyVar14 = zzdpy.RENDERING_WEBVIEW_CREATION_END;
        zzdpz zzdpzVar14 = new zzdpz("l.render.wvc", zzdpyVar13, zzdpyVar14);
        zzdpy zzdpyVar15 = zzdpy.RENDERING_AD_COMPONENT_CREATION_END;
        zzdpz zzdpzVar15 = new zzdpz("l.render.acc", zzdpyVar14, zzdpyVar15);
        zzdpy zzdpyVar16 = zzdpy.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdpy zzdpyVar17 = zzdpy.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdpz zzdpzVar16 = new zzdpz("l.render.cfg-wv", zzdpyVar16, zzdpyVar17);
        zzdpy zzdpyVar18 = zzdpy.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdpy zzdpyVar19 = zzdpy.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzfwh.zzt(zzdpzVar, zzdpzVar2, zzdpzVar3, zzdpzVar4, zzdpzVar5, zzdpzVar6, zzdpzVar7, zzdpzVar8, zzdpzVar9, zzdpzVar10, zzdpzVar11, zzdpzVar12, zzdpzVar13, zzdpzVar14, zzdpzVar15, zzdpzVar16, new zzdpz("l.render.wvlh", zzdpyVar18, zzdpyVar19), new zzdpz("l.render.post", zzdpyVar19, zzdpyVar2), new zzdpz("l.sodv", zzdpy.SIGNAL_ON_DISK_VALIDATION_START, zzdpy.SIGNAL_ON_DISK_VALIDATION_END), new zzdpz("l.sodck", zzdpy.SIGNAL_ON_DISK_CACHE_KEY_START, zzdpy.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdpz("l.sodrar", zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdpy.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdpz("l.soddc", zzdpy.SIGNAL_ON_DISK_DECODE_START, zzdpy.SIGNAL_ON_DISK_DECODE_END));
        zzdpz zzdpzVar17 = new zzdpz("l.al", zzdpyVar, zzdpyVar2);
        zzdpz zzdpzVar18 = new zzdpz("l.al2", zzdpyVar3, zzdpyVar2);
        zzdpz zzdpzVar19 = new zzdpz("l.dl", zzdpyVar, zzdpyVar3);
        zzdpz zzdpzVar20 = new zzdpz("l.rcc", zzdpyVar3, zzdpyVar5);
        zzdpz zzdpzVar21 = new zzdpz("l.cs", zzdpyVar5, zzdpyVar6);
        zzdpz zzdpzVar22 = new zzdpz("l.cts", zzdpyVar6, zzdpyVar7);
        zzdpz zzdpzVar23 = new zzdpz("l.gs", zzdpyVar8, zzdpyVar9);
        zzdpy zzdpyVar20 = zzdpy.GET_AD_DICTIONARY_SDKCORE_START;
        zzdpz zzdpzVar24 = new zzdpz("l.jse", zzdpyVar9, zzdpyVar20);
        zzdpy zzdpyVar21 = zzdpy.GET_AD_DICTIONARY_SDKCORE_END;
        zzdpz zzdpzVar25 = new zzdpz("l.gad-js", zzdpyVar20, zzdpyVar21);
        zzdpy zzdpyVar22 = zzdpy.HTTP_RESPONSE_READY;
        zzdpz zzdpzVar26 = new zzdpz("l.http", zzdpyVar21, zzdpyVar22);
        zzdpy zzdpyVar23 = zzdpy.NORMALIZATION_AD_RESPONSE_START;
        zzdpz zzdpzVar27 = new zzdpz("l.jse-nml", zzdpyVar22, zzdpyVar23);
        zzdpy zzdpyVar24 = zzdpy.NORMALIZATION_AD_RESPONSE_END;
        zzdpz zzdpzVar28 = new zzdpz("l.nml-js", zzdpyVar23, zzdpyVar24);
        zzdpy zzdpyVar25 = zzdpy.BINDER_CALL_START;
        zzdpz zzdpzVar29 = new zzdpz("l.nml-gmsg", zzdpyVar24, zzdpyVar25);
        zzdpy zzdpyVar26 = zzdpy.SERVER_RESPONSE_PARSE_START;
        zzb = zzfwh.zzt(zzdpzVar17, zzdpzVar18, zzdpzVar19, zzdpzVar20, zzdpzVar21, zzdpzVar22, zzdpzVar23, zzdpzVar24, zzdpzVar25, zzdpzVar26, zzdpzVar27, zzdpzVar28, zzdpzVar29, new zzdpz("l.binder", zzdpyVar25, zzdpyVar26), new zzdpz("l.sr", zzdpyVar26, zzdpyVar12), new zzdpz("l.render", zzdpyVar12, zzdpyVar2), new zzdpz("l.t2", zzdpy.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdpy.RENDERING_ADSTRING_TYPE2_FETCH_END), new zzdpz("l.render.wvc", zzdpyVar13, zzdpyVar14), new zzdpz("l.render.acc", zzdpyVar14, zzdpyVar15), new zzdpz("l.render.cfg-wv", zzdpyVar16, zzdpyVar17), new zzdpz("l.render.pre", zzdpyVar12, zzdpyVar13), new zzdpz("l.render.post", zzdpyVar19, zzdpyVar2), new zzdpz("l.render.wvlh", zzdpyVar18, zzdpyVar19));
    }

    public zzdpz(String str, zzdpy zzdpyVar, zzdpy zzdpyVar2) {
        this.zzc = str;
        this.zzd = zzdpyVar;
        this.zze = zzdpyVar2;
    }

    public final zzdpy zza() {
        return this.zzd;
    }

    public final zzdpy zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
