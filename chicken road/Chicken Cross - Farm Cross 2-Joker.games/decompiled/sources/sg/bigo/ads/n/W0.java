package sg.bigo.ads.n;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public abstract class W0 extends sg.bigo.ads.H.p {
    public final sg.bigo.ads.T0.q v;

    public W0(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar) {
        super(lVar);
        this.v = qVar;
    }

    @Override // sg.bigo.ads.H.p
    public final void a(Context context, ViewGroup viewGroup) {
    }

    public sg.bigo.ads.K0.E g(ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ViewGroup viewGroup) {
        boolean z;
        sg.bigo.ads.T0.q qVar;
        boolean z2;
        sg.bigo.ads.T0.q qVar2;
        boolean z3;
        sg.bigo.ads.T0.q qVar3;
        int i;
        sg.bigo.ads.T0.q qVar4 = this.v;
        int i2 = 1;
        if (qVar4 != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar4.a("video_play_page.media_view_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) == 1) {
                z = true;
                qVar = this.v;
                if (qVar != null) {
                    Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.ad_component_clickable_switch"));
                    if ((a3 != null ? a3.intValue() : 0) == 1) {
                        z2 = true;
                        qVar2 = this.v;
                        if (qVar2 != null) {
                            Integer a4 = sg.bigo.ads.K0.z.a(qVar2.a("video_play_page.other_space_clickable_switch"));
                            if ((a4 != null ? a4.intValue() : 0) == 1) {
                                z3 = true;
                                qVar3 = this.v;
                                if (qVar3 != null) {
                                    Integer a5 = sg.bigo.ads.K0.z.a(qVar3.a("video_play_page.click_type"));
                                    if (a5 == null) {
                                        i = 0;
                                        a(viewGroup, z, z2, z3, i);
                                    }
                                    i2 = a5.intValue();
                                }
                                i = i2;
                                a(viewGroup, z, z2, z3, i);
                            }
                        }
                        z3 = false;
                        qVar3 = this.v;
                        if (qVar3 != null) {
                        }
                        i = i2;
                        a(viewGroup, z, z2, z3, i);
                    }
                }
                z2 = false;
                qVar2 = this.v;
                if (qVar2 != null) {
                }
                z3 = false;
                qVar3 = this.v;
                if (qVar3 != null) {
                }
                i = i2;
                a(viewGroup, z, z2, z3, i);
            }
        }
        z = false;
        qVar = this.v;
        if (qVar != null) {
        }
        z2 = false;
        qVar2 = this.v;
        if (qVar2 != null) {
        }
        z3 = false;
        qVar3 = this.v;
        if (qVar3 != null) {
        }
        i = i2;
        a(viewGroup, z, z2, z3, i);
    }

    @Override // sg.bigo.ads.H.p
    public final boolean i() {
        sg.bigo.ads.T0.q qVar = this.v;
        return qVar != null && qVar.b("video_play_page.is_widget") == 1;
    }

    public static void a(ViewGroup viewGroup, String str) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_ad_label);
        View findViewById = viewGroup.findViewById(R.id.inter_separator);
        if (textView == null || textView2 == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        textView.setVisibility(!isEmpty ? 0 : 8);
        if (findViewById != null) {
            findViewById.setVisibility(isEmpty ? 8 : 0);
        }
        if (isEmpty) {
            return;
        }
        textView.setText(str);
        textView2.setText(R.string.bigo_ad_tag);
    }

    @Override // sg.bigo.ads.H.p
    public final int g() {
        sg.bigo.ads.T0.q qVar = this.v;
        if (qVar == null) {
            return 1;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("video_play_page.close_button_style"));
        if (a2 != null) {
            return a2.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.H.p
    public final boolean h() {
        sg.bigo.ads.T0.q qVar = this.v;
        return qVar != null && qVar.b("video_play_page.is_cta_show_animation") == 1;
    }
}
