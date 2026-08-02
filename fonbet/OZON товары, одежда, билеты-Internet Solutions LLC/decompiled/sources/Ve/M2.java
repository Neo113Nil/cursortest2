package Ve;

/* loaded from: classes10.dex */
public enum M2 implements InterfaceC4443me {
    TOUCH_CARD("TouchCard"),
    TOUCH_PAY("TouchPay"),
    TOUCH_CANCEL("TouchCancel"),
    TOUCH_APPROVE_BNPL("TouchApproveBNPL"),
    TOUCH_CONTRACT_VIEW("TouchContractView"),
    TOUCH_AGREEMENT_VIEW("TouchAgreementView");


    /* renamed from: a, reason: collision with root package name */
    public final String f29453a;

    M2(String str) {
        this.f29453a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f29453a;
    }
}
