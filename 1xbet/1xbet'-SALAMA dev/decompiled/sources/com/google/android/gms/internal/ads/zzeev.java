package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzeev implements zzebr {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(zzfar zzfarVar, zzfaf zzfafVar) {
        String strOptString = zzfafVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfba zzfbaVar = zzfarVar.zza.zza;
        zzfay zzfayVar = new zzfay();
        zzfayVar.zzq(zzfbaVar);
        zzfayVar.zzt(strOptString);
        Bundle bundleZzd = zzd(zzfbaVar.zzd.f10742D);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzfafVar.zzv.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfafVar.zzv.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfafVar.zzD.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfafVar.zzD.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfbaVar.zzd;
        zzfayVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.f10756a, zzmVar.f10757b, bundleZzd2, zzmVar.f10759d, zzmVar.f10760e, zzmVar.f10761f, zzmVar.f10762x, zzmVar.f10763y, zzmVar.f10764z, zzmVar.f10739A, zzmVar.f10740B, zzmVar.f10741C, bundleZzd, zzmVar.f10743E, zzmVar.f10744F, zzmVar.f10745G, zzmVar.f10746H, zzmVar.f10747I, zzmVar.f10748J, zzmVar.f10749K, zzmVar.f10750L, zzmVar.f10751M, zzmVar.f10752N, zzmVar.f10753O, zzmVar.f10754P, zzmVar.f10755Q));
        zzfba zzfbaVarZzJ = zzfayVar.zzJ();
        Bundle bundle = new Bundle();
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfaiVar.zza));
        bundle2.putInt("refresh_interval", zzfaiVar.zzc);
        bundle2.putString("gws_query_id", zzfaiVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzfba zzfbaVar2 = zzfarVar.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzfbaVar2.zzf);
        bundle3.putString("allocation_id", zzfafVar.zzw);
        bundle3.putString("ad_source_name", zzfafVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfafVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfafVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfafVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfafVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfafVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfafVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfafVar.zzi));
        bundle3.putString(ProfilingTraceData.JsonKeys.TRANSACTION_ID, zzfafVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfafVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfafVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfafVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfafVar.zzW);
        if (zzfafVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfafVar.zzl.zzb);
            bundle4.putString("rb_type", zzfafVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfbaVarZzJ, bundle, zzfafVar, zzfarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        return !TextUtils.isEmpty(zzfafVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract I3.b zzc(zzfba zzfbaVar, Bundle bundle, zzfaf zzfafVar, zzfar zzfarVar);
}
