package E70;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"LE70/c;", "", "<init>", "(Ljava/lang/String;I)V", "OPERATION_AUTHORIZATION", "OPERATION_BALZAC", "OPERATION_C2A", "OPERATION_C2B_PARTNER", "OPERATION_CANCEL_AUTHORIZATION", "OPERATION_LOYALTY_CASHBACK", "OPERATION_MIGRATE_CLIENT_BALANCE", "OPERATION_OVERLIMIT_REPAYMENT", "OPERATION_OZON", "OPERATION_OZON_MKK_LOAN", "OPERATION_OZON_MKK_PURCHASE", "OPERATION_OZON_MKK_REFUND", "OPERATION_OZON_MKK_REPLENISHMENT", "OPERATION_SBP", "OPERATION_SBP_INCOMING", "OPERATION_SBP_OUTGOING", "OPERATION_SMS_COMMISSION", "OPERATION_TRANSFER", "OPERATION_UNKNOWN", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @i(name = "OPERATION_AUTHORIZATION")
    public static final c OPERATION_AUTHORIZATION = new c("OPERATION_AUTHORIZATION", 0);

    @i(name = "OPERATION_BALZAC")
    public static final c OPERATION_BALZAC = new c("OPERATION_BALZAC", 1);

    @i(name = "OPERATION_C2A")
    public static final c OPERATION_C2A = new c("OPERATION_C2A", 2);

    @i(name = "OPERATION_C2B_PARTNER")
    public static final c OPERATION_C2B_PARTNER = new c("OPERATION_C2B_PARTNER", 3);

    @i(name = "OPERATION_CANCEL_AUTHORIZATION")
    public static final c OPERATION_CANCEL_AUTHORIZATION = new c("OPERATION_CANCEL_AUTHORIZATION", 4);

    @i(name = "OPERATION_LOYALTY_CASHBACK")
    public static final c OPERATION_LOYALTY_CASHBACK = new c("OPERATION_LOYALTY_CASHBACK", 5);

    @i(name = "OPERATION_MIGRATE_CLIENT_BALANCE")
    public static final c OPERATION_MIGRATE_CLIENT_BALANCE = new c("OPERATION_MIGRATE_CLIENT_BALANCE", 6);

    @i(name = "OPERATION_OVERLIMIT_REPAYMENT")
    public static final c OPERATION_OVERLIMIT_REPAYMENT = new c("OPERATION_OVERLIMIT_REPAYMENT", 7);

    @i(name = "OPERATION_OZON")
    public static final c OPERATION_OZON = new c("OPERATION_OZON", 8);

    @i(name = "OPERATION_OZON_MKK_LOAN")
    public static final c OPERATION_OZON_MKK_LOAN = new c("OPERATION_OZON_MKK_LOAN", 9);

    @i(name = "OPERATION_OZON_MKK_PURCHASE")
    public static final c OPERATION_OZON_MKK_PURCHASE = new c("OPERATION_OZON_MKK_PURCHASE", 10);

    @i(name = "OPERATION_OZON_MKK_REFUND")
    public static final c OPERATION_OZON_MKK_REFUND = new c("OPERATION_OZON_MKK_REFUND", 11);

    @i(name = "OPERATION_OZON_MKK_REPLENISHMENT")
    public static final c OPERATION_OZON_MKK_REPLENISHMENT = new c("OPERATION_OZON_MKK_REPLENISHMENT", 12);

    @i(name = "OPERATION_SBP")
    public static final c OPERATION_SBP = new c("OPERATION_SBP", 13);

    @i(name = "OPERATION_SBP_INCOMING")
    public static final c OPERATION_SBP_INCOMING = new c("OPERATION_SBP_INCOMING", 14);

    @i(name = "OPERATION_SBP_OUTGOING")
    public static final c OPERATION_SBP_OUTGOING = new c("OPERATION_SBP_OUTGOING", 15);

    @i(name = "OPERATION_SMS_COMMISSION")
    public static final c OPERATION_SMS_COMMISSION = new c("OPERATION_SMS_COMMISSION", 16);

    @i(name = "OPERATION_TRANSFER")
    public static final c OPERATION_TRANSFER = new c("OPERATION_TRANSFER", 17);

    @i(name = "OPERATION_UNKNOWN")
    public static final c OPERATION_UNKNOWN = new c("OPERATION_UNKNOWN", 18);

    private static final /* synthetic */ c[] $values() {
        return new c[]{OPERATION_AUTHORIZATION, OPERATION_BALZAC, OPERATION_C2A, OPERATION_C2B_PARTNER, OPERATION_CANCEL_AUTHORIZATION, OPERATION_LOYALTY_CASHBACK, OPERATION_MIGRATE_CLIENT_BALANCE, OPERATION_OVERLIMIT_REPAYMENT, OPERATION_OZON, OPERATION_OZON_MKK_LOAN, OPERATION_OZON_MKK_PURCHASE, OPERATION_OZON_MKK_REFUND, OPERATION_OZON_MKK_REPLENISHMENT, OPERATION_SBP, OPERATION_SBP_INCOMING, OPERATION_SBP_OUTGOING, OPERATION_SMS_COMMISSION, OPERATION_TRANSFER, OPERATION_UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private c(String str, int i11) {
    }

    @NotNull
    public static Xc.a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
