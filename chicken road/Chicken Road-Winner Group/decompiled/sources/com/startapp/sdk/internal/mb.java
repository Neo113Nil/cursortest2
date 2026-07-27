package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mb extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final String f4047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4048b;

    public mb(List3DActivity list3DActivity, ArrayList arrayList, String str, String str2) {
        super(list3DActivity, 0, arrayList);
        this.f4047a = str;
        this.f4048b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        View view2;
        qb qbVar;
        if (view == null) {
            qbVar = new qb(getContext());
            view2 = qbVar.f4266a;
        } else {
            view2 = view;
            qbVar = (qb) view.getTag();
        }
        ob obVar = (ob) getItem(i3);
        MetaDataStyle a3 = AdsCommonMetaData.k().a(obVar.f4161q);
        if (qbVar.f4271g != a3) {
            qbVar.f4271g = a3;
            qbVar.f4266a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a3.e().intValue(), a3.d().intValue()}));
            qbVar.f4268c.setTextSize(a3.h().intValue());
            qbVar.f4268c.setTextColor(a3.f().intValue());
            ii.a(qbVar.f4268c, a3.g());
            qbVar.f4269d.setTextSize(a3.c().intValue());
            qbVar.f4269d.setTextColor(a3.a().intValue());
            ii.a(qbVar.f4269d, a3.b());
        }
        qbVar.f4268c.setText(obVar.f4151g);
        qbVar.f4269d.setText(obVar.f4152h);
        rb a4 = ((sb) com.startapp.sdk.components.a.a(getContext()).f3351R.a()).a(this.f4048b);
        Bitmap a5 = a4.f4295a.a(obVar.f4146a, i3, obVar.f4153i);
        if (a5 == null) {
            qbVar.f4267b.setImageResource(R.drawable.sym_def_app_icon);
            qbVar.f4267b.setTag("tag_error");
        } else {
            qbVar.f4267b.setImageBitmap(a5);
            qbVar.f4267b.setTag("tag_ok");
        }
        qbVar.f.setRating(obVar.f4154j);
        if (obVar.f4158n != null) {
            qbVar.f4270e.setText("Open");
        } else {
            qbVar.f4270e.setText("Download");
        }
        Context context = getContext();
        String[] strArr = obVar.f4148c;
        TrackingParams trackingParams = new TrackingParams(this.f4047a);
        Long l3 = obVar.f4159o;
        long millis = l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
        a9 a9Var = a4.f4295a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String l4 = strArr != null ? B0.c.l(new StringBuilder(), TextUtils.join("^", strArr), a4.f4297c) : null;
        if (a9Var.f3447c.containsKey(l4)) {
            return view2;
        }
        xf xfVar = new xf(context, placement, strArr, trackingParams, millis, false, null);
        a9Var.f3447c.put(l4, xfVar);
        xfVar.c();
        return view2;
    }
}
