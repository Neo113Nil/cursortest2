package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbda extends p109p.a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) C0254t.f2723d.f2726c.zzb(zzbby.zzjS)).split(","));
    private final zzbdd zzc;
    private final p109p.a zzd;
    private final zzdqv zze;

    public zzbda(zzbdd zzbddVar, p109p.a aVar, zzdqv zzdqvVar) {
        this.zzd = aVar;
        this.zzc = zzbddVar;
        this.zze = zzdqvVar;
    }

    private final void zzb(String str) {
        Q0.a.n0(this.zze, "pact_action", new Pair("pe", str));
    }

    @Override // p109p.a
    public final void extraCallback(String str, Bundle bundle) {
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // p109p.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // p109p.a
    public final void onActivityResized(int i7, int i8, Bundle bundle) {
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onActivityResized(i7, i8, bundle);
        }
    }

    @Override // p109p.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // p109p.a
    public final void onNavigationEvent(int i7, Bundle bundle) {
        List list;
        this.zza.set(false);
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onNavigationEvent(i7, bundle);
        }
        zzbdd zzbddVar = this.zzc;
        o.f1952C.j.getClass();
        zzbddVar.zzi(System.currentTimeMillis());
        if (this.zzc == null || (list = this.zzb) == null || !list.contains(String.valueOf(i7))) {
            return;
        }
        this.zzc.zzf();
        zzb("pact_reqpmc");
    }

    @Override // p109p.a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e7) {
            J.l("Message is not in JSON format: ", e7);
        }
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // p109p.a
    public final void onRelationshipValidationResult(int i7, Uri uri, boolean z4, Bundle bundle) {
        p109p.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i7, uri, z4, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
