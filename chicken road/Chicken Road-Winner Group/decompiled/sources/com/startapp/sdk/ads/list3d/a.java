package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.kb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.sb;
import com.startapp.sdk.internal.xf;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f3008a;

    public a(List3DActivity list3DActivity) {
        this.f3008a = list3DActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        sb sbVar;
        xf xfVar;
        String str = ((ob) this.f3008a.f2982h.get(i3)).f4147b;
        String[] strArr = ((ob) this.f3008a.f2982h.get(i3)).f4149d;
        String str2 = ((ob) this.f3008a.f2982h.get(i3)).f;
        boolean z3 = ((ob) this.f3008a.f2982h.get(i3)).f4155k;
        boolean z4 = ((ob) this.f3008a.f2982h.get(i3)).f4156l;
        String str3 = ((ob) this.f3008a.f2982h.get(i3)).f4158n;
        String str4 = ((ob) this.f3008a.f2982h.get(i3)).f4157m;
        Boolean bool = ((ob) this.f3008a.f2982h.get(i3)).f4160p;
        sbVar = this.f3008a.f2983i;
        rb a3 = sbVar.a(this.f3008a.f);
        String[] strArr2 = ((ob) this.f3008a.f2982h.get(i3)).f4148c;
        a9 a9Var = a3.f4295a;
        String l3 = strArr2 != null ? B0.c.l(new StringBuilder(), TextUtils.join("^", strArr2), a3.f4297c) : null;
        HashMap hashMap = a9Var.f3447c;
        if (hashMap != null && (xfVar = (xf) hashMap.get(l3)) != null) {
            xfVar.a(null, null);
        }
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            List3DActivity list3DActivity = this.f3008a;
            g0.a(str3, str4, str, list3DActivity, new TrackingParams(list3DActivity.f2981g));
            this.f3008a.finish();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean p3 = MetaData.E().p();
        Context applicationContext = this.f3008a.getApplicationContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean a4 = g0.a(applicationContext);
        if (z3 && !a4) {
            List3DActivity list3DActivity2 = this.f3008a;
            g0.a(list3DActivity2, str, strArr, str2, list3DActivity2.a(), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z4, bool, false, p3 ? new kb(this) : null);
            return;
        }
        List3DActivity list3DActivity3 = this.f3008a;
        g0.a(list3DActivity3, str, strArr, list3DActivity3.a(), z4 && !a4, false);
        if (p3) {
            this.f3008a.finish();
        }
    }
}
