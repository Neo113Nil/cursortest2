package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b0;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.q;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final AdInformationView f3148b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f3149c;

    /* renamed from: d, reason: collision with root package name */
    public final ConsentData f3150d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3151e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final AdInformationOverrides f3152g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3153h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3154i;

    public a(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2, String str3, String str4) {
        this.f3147a = new WeakReference(context);
        this.f3149c = placement;
        this.f3152g = adInformationOverrides;
        this.f3150d = consentData;
        this.f3151e = str;
        this.f = str2;
        this.f3153h = str3;
        this.f3154i = str4;
        this.f3148b = new AdInformationView(context, imageResourceType, placement, adInformationOverrides, this, (str3 == null && str4 == null) ? false : true);
    }

    public final void a(RelativeLayout relativeLayout) {
        Set a3;
        Context context = relativeLayout.getContext();
        AdInformationConfig a4 = AdInformationMetaData.c().a();
        AdInformationOverrides adInformationOverrides = this.f3152g;
        if ((adInformationOverrides == null || !adInformationOverrides.d()) ? a4.isEnabled(context) : this.f3152g.c()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f3152g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                a4.getPosition(this.f3149c).addRules(layoutParams);
            } else {
                this.f3152g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f3148b, layoutParams);
        }
        q qVar = (q) com.startapp.sdk.components.a.a(context).f3349P.a();
        AdDebuggerMetadata d3 = MetaData.E().d();
        if ((d3 == null || (a3 = d3.a()) == null) ? false : a3.contains(((com.startapp.sdk.common.advertisingid.b) qVar.f4233b.a()).a().f3940a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.f3148b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(Integer.MIN_VALUE);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new b0(this, qVar));
            AdInformationPositions.Position flipHorizontal = this.f3148b.d().flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f3148b.e(), this.f3148b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f3148b.b(), this.f3148b.a());
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = (Context) this.f3147a.get();
        if (context == null) {
            return;
        }
        g6 g6Var = (g6) com.startapp.sdk.components.a.a(context).f3362j.a();
        ConsentData consentData = this.f3150d;
        String c3 = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.f3150d;
        String d3 = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.f3150d;
        g6Var.a(true, c3, d3, consentData3 != null ? consentData3.b() : null, this.f3153h, this.f3154i);
    }
}
