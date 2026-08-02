package Ve;

/* loaded from: classes10.dex */
public enum Yl implements InterfaceC4443me {
    TOUCH_TOP_BUTTON("TouchTopButton"),
    TOUCH_BOTTOM_BUTTON("TouchBottomButton"),
    LC_STATUS_SUCCESS_VIEW_APPEARED("LCStatusSuccessViewAppeared"),
    LC_STATUS_IN_PROGRESS_VIEW_APPEARED("LCStatusInProgressViewAppeared"),
    LC_STATUS_ERROR_VIEW_APPEARED("LCStatusErrorViewAppeared"),
    LC_STATUS_VIEW_DISAPPEARED("LCStatusViewDisappeared");


    /* renamed from: a, reason: collision with root package name */
    public final String f30506a;

    Yl(String str) {
        this.f30506a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f30506a;
    }
}
