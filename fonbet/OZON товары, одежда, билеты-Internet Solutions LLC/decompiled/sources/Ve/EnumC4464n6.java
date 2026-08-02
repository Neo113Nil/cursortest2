package Ve;

/* renamed from: Ve.n6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC4464n6 implements InterfaceC4443me {
    MA_INIT("MAInit"),
    /* JADX INFO: Fake field, exist only in values array */
    MA_IS_READY_FOR_SPAY("MAIsReadyForSpay"),
    /* JADX INFO: Fake field, exist only in values array */
    MAC_IS_READY_FOR_SPAY("MACIsReadyForSpay"),
    MACPay("MACPay"),
    /* JADX INFO: Fake field, exist only in values array */
    MA_COMPLETE_PAYMENT("MACompletePayment"),
    /* JADX INFO: Fake field, exist only in values array */
    MAC_COMPLETE_PAYMENT("MACCompletePayment"),
    EX_PAY("EXPay"),
    MA_PAY_DEFAULT("MAPayDefault"),
    MA_PAY_WITH_BANK_INVOICE_ID("MAPayWithBankInvoiceId"),
    MA_PAY_WITH_BINDING("MAPayWithBinding"),
    MA_PAY_BINDING("MAPayBinding"),
    MA_PAY_WITH_BONUSES("MAPayWithBonuses"),
    MA_PAY_WITH_PART_PAY("MAPayWithPartPay"),
    MA_PAY_WITH_PHONE_NUMBER("MAPayWithPhoneNumber"),
    MA_PAY_WITHOUT_REFRESH("MAPayWithoutRefresh");


    /* renamed from: a, reason: collision with root package name */
    public final String f31641a;

    EnumC4464n6(String str) {
        this.f31641a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f31641a;
    }
}
