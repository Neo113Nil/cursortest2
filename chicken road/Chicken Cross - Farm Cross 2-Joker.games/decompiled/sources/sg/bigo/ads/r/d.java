package sg.bigo.ads.r;

import sg.bigo.ads.K0.z;
import sg.bigo.ads.T0.q;

/* loaded from: classes3.dex */
public final class d extends c {
    public final boolean m;

    @Override // sg.bigo.ads.r.c
    public final int a() {
        if (this.m) {
            int i = this.b;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return i;
                default:
                    return 1;
            }
        }
        int i2 = this.b;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return i2;
        }
        return 1;
    }

    @Override // sg.bigo.ads.r.c
    public final int b() {
        int i = this.b;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return i;
            default:
                return 1;
        }
    }

    @Override // sg.bigo.ads.r.c
    public final int c() {
        return 10;
    }

    @Override // sg.bigo.ads.r.c
    public final boolean d() {
        return this.b == 7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(q qVar, boolean z) {
        super(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r0 != null ? r0.intValue() : 0);
        Integer a2 = z.a(qVar.a("icon_ads.is_display_layer"));
        int intValue = a2 != null ? a2.intValue() : 0;
        Integer a3 = z.a(qVar.a("icon_ads.ad_component_layout_layer"));
        int intValue2 = a3 != null ? a3.intValue() : 1;
        Integer a4 = z.a(qVar.a("icon_ads.cta_color_layer"));
        int intValue3 = a4 != null ? a4.intValue() : 1;
        Integer a5 = z.a(qVar.a("icon_ads.icon_color_layer"));
        int intValue4 = a5 != null ? a5.intValue() : 1;
        Integer a6 = z.a(qVar.a("icon_ads.icon_num_layer"));
        int intValue5 = a6 != null ? a6.intValue() : 20;
        Integer a7 = z.a(qVar.a("icon_ads.ad_component_show_time_layer"));
        int intValue6 = a7 != null ? a7.intValue() : 0;
        Integer a8 = z.a(qVar.a("icon_ads.rotate_time_layer"));
        int intValue7 = a8 != null ? a8.intValue() : 2;
        Integer a9 = z.a(qVar.a("icon_ads.click_type_layer"));
        int intValue8 = a9 != null ? a9.intValue() : 3;
        Integer a10 = z.a(qVar.a("icon_ads.auto_click_layer"));
        int intValue9 = a10 != null ? a10.intValue() : -1;
        Integer a11 = z.a(qVar.a("icon_ads.imp_tracking_type_lyr"));
        int intValue10 = a11 != null ? a11.intValue() : 0;
        Integer a12 = z.a(qVar.a("icon_ads.early_tracker_value_lyr"));
        this.m = z;
    }
}
