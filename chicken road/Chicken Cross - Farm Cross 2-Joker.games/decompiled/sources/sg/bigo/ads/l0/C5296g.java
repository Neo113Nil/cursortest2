package sg.bigo.ads.l0;

import android.widget.RelativeLayout;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;
import sg.bigo.ads.m0.C5353f;

/* renamed from: sg.bigo.ads.l0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5296g {

    /* renamed from: a, reason: collision with root package name */
    public final C5353f f13058a;
    public final RelativeLayout b;
    public final ViewFlow c;
    public final Indicator d;

    public C5296g(RelativeLayout relativeLayout, C5353f c5353f) {
        this.b = relativeLayout;
        this.f13058a = c5353f;
        this.c = (ViewFlow) relativeLayout.findViewById(R.id.inter_image_view_flow);
        this.d = (Indicator) relativeLayout.findViewById(R.id.inter_image_indicator);
    }
}
