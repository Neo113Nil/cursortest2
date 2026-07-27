package sg.bigo.ads.m0;

import sg.bigo.ads.R;

/* renamed from: sg.bigo.ads.m0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5348a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13109a;

    public static int a(int i) {
        switch (i) {
            case 1:
                return f13109a ? R.layout.bigo_ad_form_content_dark : R.layout.bigo_ad_form_content;
            case 2:
                return f13109a ? R.layout.bigo_ad_form_fill_question_dark : R.layout.bigo_ad_form_fill_question;
            case 3:
                return f13109a ? R.layout.bigo_ad_form_layout_dark : R.layout.bigo_ad_form_layout;
            case 4:
                return f13109a ? R.layout.bigo_ad_form_notice_privacy_dark : R.layout.bigo_ad_form_notice_privacy;
            case 5:
                return f13109a ? R.layout.bigo_ad_form_question_dark : R.layout.bigo_ad_form_question;
            case 6:
                return f13109a ? R.layout.bigo_ad_form_select_question_dark : R.layout.bigo_ad_form_select_question;
            case 7:
                return f13109a ? R.layout.bigo_ad_success_submit_dark : R.layout.bigo_ad_success_submit;
            default:
                return -1;
        }
    }
}
