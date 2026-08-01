package sg.bigo.ads.r;

import sg.bigo.ads.K0.z;
import sg.bigo.ads.T0.q;

/* renamed from: sg.bigo.ads.r.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5448a extends c {
    @Override // sg.bigo.ads.r.c
    public final int c() {
        return 4;
    }

    @Override // sg.bigo.ads.r.c
    public final boolean d() {
        return this.b == 5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5448a(q qVar) {
        super(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r15 != null ? r15.intValue() : 0);
        Integer a2 = z.a(qVar.a("icon_ads.is_display_endpage"));
        int intValue = a2 != null ? a2.intValue() : 0;
        Integer a3 = z.a(qVar.a("icon_ads.ad_component_layout_endpage"));
        int intValue2 = a3 != null ? a3.intValue() : 1;
        Integer a4 = z.a(qVar.a("icon_ads.cta_color_endpage"));
        int intValue3 = a4 != null ? a4.intValue() : 1;
        Integer a5 = z.a(qVar.a("icon_ads.icon_color_endpage"));
        int intValue4 = a5 != null ? a5.intValue() : 1;
        Integer a6 = z.a(qVar.a("icon_ads.icon_num_endpage"));
        int intValue5 = a6 != null ? a6.intValue() : 20;
        Integer a7 = z.a(qVar.a("icon_ads.ad_component_show_time_endpage"));
        int intValue6 = a7 != null ? a7.intValue() : 0;
        Integer a8 = z.a(qVar.a("icon_ads.rotate_time_endpage"));
        int intValue7 = a8 != null ? a8.intValue() : 2;
        Integer a9 = z.a(qVar.a("icon_ads.click_type_endpage"));
        int intValue8 = a9 != null ? a9.intValue() : 3;
        Integer a10 = z.a(qVar.a("icon_ads.auto_click_endpage"));
        int intValue9 = a10 != null ? a10.intValue() : -1;
        Integer a11 = z.a(qVar.a("icon_ads.imp_tracking_type_ep"));
        int intValue10 = a11 != null ? a11.intValue() : 0;
        Integer a12 = z.a(qVar.a("icon_ads.early_tracker_value_ep"));
    }
}
