package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC0693Tg extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: k, reason: collision with root package name */
    public final Context f11656k;

    /* renamed from: l, reason: collision with root package name */
    public View f11657l;

    public ViewTreeObserverOnScrollChangedListenerC0693Tg(Context context) {
        super(context);
        this.f11656k = context;
    }

    public static ViewTreeObserverOnScrollChangedListenerC0693Tg a(Context context, View view, Lq lq) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ViewTreeObserverOnScrollChangedListenerC0693Tg viewTreeObserverOnScrollChangedListenerC0693Tg = new ViewTreeObserverOnScrollChangedListenerC0693Tg(context);
        List list = lq.f10527u;
        boolean isEmpty = list.isEmpty();
        Context context2 = viewTreeObserverOnScrollChangedListenerC0693Tg.f11656k;
        if (!isEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((Mq) list.get(0)).f10723a;
            float f5 = displayMetrics.density;
            viewTreeObserverOnScrollChangedListenerC0693Tg.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f5), (int) (r5.f10724b * f5)));
        }
        viewTreeObserverOnScrollChangedListenerC0693Tg.f11657l = view;
        viewTreeObserverOnScrollChangedListenerC0693Tg.addView(view);
        V9 v9 = P2.o.f4767B.f4768A;
        ViewTreeObserverOnScrollChangedListenerC0662Pd viewTreeObserverOnScrollChangedListenerC0662Pd = new ViewTreeObserverOnScrollChangedListenerC0662Pd(viewTreeObserverOnScrollChangedListenerC0693Tg, viewTreeObserverOnScrollChangedListenerC0693Tg);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0662Pd.f7794k).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnScrollChangedListenerC0662Pd.p1(viewTreeObserver);
        }
        ViewTreeObserverOnGlobalLayoutListenerC0655Od viewTreeObserverOnGlobalLayoutListenerC0655Od = new ViewTreeObserverOnGlobalLayoutListenerC0655Od(viewTreeObserverOnScrollChangedListenerC0693Tg, viewTreeObserverOnScrollChangedListenerC0693Tg);
        View view3 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0655Od.f7794k).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0655Od.p1(viewTreeObserver3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObject = lq.f10503h0;
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            viewTreeObserverOnScrollChangedListenerC0693Tg.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            viewTreeObserverOnScrollChangedListenerC0693Tg.b(optJSONObject2, relativeLayout, 12);
        }
        viewTreeObserverOnScrollChangedListenerC0693Tg.addView(relativeLayout);
        return viewTreeObserverOnScrollChangedListenerC0693Tg;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f11656k;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        C0379q c0379q = C0379q.f;
        U2.e eVar = c0379q.f5048a;
        int l5 = U2.e.l(context, (int) optDouble);
        textView.setPadding(0, l5, 0, l5);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        U2.e eVar2 = c0379q.f5048a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, U2.e.l(context, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.f11657l.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.f11657l.setY(-r0[1]);
    }
}
