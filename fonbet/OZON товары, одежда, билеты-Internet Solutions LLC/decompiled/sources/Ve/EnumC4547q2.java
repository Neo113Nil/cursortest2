package Ve;

/* renamed from: Ve.q2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC4547q2 implements InterfaceC4443me {
    TOUCH_CONFIRMED_BY_USER("TouchConfirmedByUser"),
    TOUCH_DECLINED_BY_USER("TouchDeclinedByUser"),
    TOUCH_APPROVE_BNPL("TouchApproveBNPL"),
    TOUCH_CONTRACT_VIEW("TouchContractView"),
    TOUCH_AGREEMENT_VIEW("TouchAgreementView"),
    LC_BNPL_VIEW_APPEARED("LCBnplViewAppeared"),
    LC_BNPL_VIEW_DISAPPEARED("LCBnplViewDisappeared");


    /* renamed from: a, reason: collision with root package name */
    public final String f31838a;

    EnumC4547q2(String str) {
        this.f31838a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f31838a;
    }
}
