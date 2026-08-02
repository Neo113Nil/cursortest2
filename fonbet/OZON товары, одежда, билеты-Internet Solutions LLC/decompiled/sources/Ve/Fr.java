package Ve;

/* loaded from: classes10.dex */
public enum Fr implements InterfaceC4443me {
    TOUCH_BACK("TouchBack"),
    TOUCH_NEXT("TouchNext"),
    RQ_CREATE_OTP("RQCreateOtp"),
    RQ_GOOD_CREATE_OTP("RQGoodCreateOtp"),
    RQ_FAIL_CREATE_OTP("RQFailCreateOtp"),
    RS_GOOD_CREATE_OTP("RSGoodCreateOtp"),
    RS_FAIL_CREATE_OTP("RSFailCreateOtp"),
    RQ_CONFIRM_OTP("RQConfirmOtp"),
    RQ_GOOD_CONFIRM_OTP("RQGoodConfirmOtp"),
    RQ_FAIL_CONFIRM_OTP("RQFailConfirmOtp"),
    RS_GOOD_CONFIRM_OTP("RSGoodConfirmOtp"),
    RS_FAIL_CONFIRM_OTP("RSFailConfirmOtp"),
    LC_OTP_VIEW_APPEARED("LCOtpViewAppeared"),
    LC_OTP_VIEW_DISAPPEARED("LCOtpViewDisappeared");


    /* renamed from: a, reason: collision with root package name */
    public final String f29043a;

    Fr(String str) {
        this.f29043a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f29043a;
    }
}
