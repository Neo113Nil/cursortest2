package sg.bigo.ads.G;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12302a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ h d;

    public a(h hVar, View view, ImageView imageView, int i) {
        this.d = hVar;
        this.f12302a = view;
        this.b = imageView;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f12302a;
        if (view != null) {
            h hVar = this.d;
            FrameLayout frameLayout = hVar.b;
            MediaView mediaView = hVar.d;
            ImageView imageView = this.b;
            int i = this.c;
            ArrayList arrayList = new ArrayList();
            TextView textView = (TextView) view.findViewById(R.id.inter_title);
            if (textView != null) {
                textView.setTag(2);
                h.a(textView, ((k) ((InterfaceC5087a) hVar.f12308a.e())).g());
                arrayList.add(textView);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.inter_description);
            if (textView2 != null) {
                textView2.setTag(6);
                h.a(textView2, ((k) ((InterfaceC5087a) hVar.f12308a.e())).c());
                arrayList.add(textView2);
            }
            TextView textView3 = (TextView) view.findViewById(R.id.inter_btn_cta);
            if (textView3 != null) {
                textView3.setTag(7);
                h.a(textView3, hVar.f12308a.getCallToAction());
                arrayList.add(textView3);
            }
            TextView textView4 = (TextView) view.findViewById(R.id.inter_advertiser);
            if (textView4 != null) {
                String advertiser = hVar.f12308a.getAdvertiser();
                if (I.a((CharSequence) advertiser)) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(advertiser);
                }
            }
            if (imageView != null) {
                try {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.rightMargin = hVar.d();
                    }
                    imageView.setLayoutParams(marginLayoutParams);
                } catch (Exception unused) {
                }
                X.a(imageView, (ViewGroup) view.findViewById(R.id.inter_rounded_icon_layout), null, -1);
            }
            AdOptionsView adOptionsView = (AdOptionsView) view.findViewById(R.id.inter_options);
            if (mediaView != null) {
                X.a(mediaView, (ViewGroup) view.findViewById(R.id.inter_media_layout), null, -1);
            }
            l lVar = hVar.f12308a;
            lVar.f0 = i;
            lVar.registerViewForInteraction(frameLayout, mediaView, imageView, adOptionsView, arrayList);
        }
    }
}
