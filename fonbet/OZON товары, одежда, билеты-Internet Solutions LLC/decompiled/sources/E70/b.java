package E70;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"LE70/b;", "", "<init>", "(Ljava/lang/String;I)V", "AUTHORIZATION", "BALZAC_INCOMING", "BALZAC_INTERNAL", "BALZAC_OUTGOING", "C2A_INCOMING", "C2B_PARTNER_INCOMING", "CANCEL_AUTHORIZATION", "HUGO_INCOMING", "HUGO_INTERNAL", "HUGO_OUTGOING", "INCOMING_PAYMENT", "LOYALTY_CASHBACK", "MIGRATE_CLIENT_BALANCE", "OVERVALUATION_ADJUSTMENT", "OZON_CLEARING", "OZON_HOLD", "OZON_HOLD_DROP", "OZON_REFUND", "REVALUATION_ADJUSTMENT", "SBP_INCOMING", "SBP_OUTGOING", "SBP_OUTGOING_CONFIRM", "SBP_OUTGOING_REFUND", "TRANSFER", "TRANSFER_INCOMING", "TRANSFER_OUTGOING", FraudMonInfo.UNKNOWN, "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @i(name = "AUTHORIZATION")
    public static final b AUTHORIZATION = new b("AUTHORIZATION", 0);

    @i(name = "BALZAC_INCOMING")
    public static final b BALZAC_INCOMING = new b("BALZAC_INCOMING", 1);

    @i(name = "BALZAC_INTERNAL")
    public static final b BALZAC_INTERNAL = new b("BALZAC_INTERNAL", 2);

    @i(name = "BALZAC_OUTGOING")
    public static final b BALZAC_OUTGOING = new b("BALZAC_OUTGOING", 3);

    @i(name = "C2A_INCOMING")
    public static final b C2A_INCOMING = new b("C2A_INCOMING", 4);

    @i(name = "C2B_PARTNER_INCOMING")
    public static final b C2B_PARTNER_INCOMING = new b("C2B_PARTNER_INCOMING", 5);

    @i(name = "CANCEL_AUTHORIZATION")
    public static final b CANCEL_AUTHORIZATION = new b("CANCEL_AUTHORIZATION", 6);

    @i(name = "HUGO_INCOMING")
    public static final b HUGO_INCOMING = new b("HUGO_INCOMING", 7);

    @i(name = "HUGO_INTERNAL")
    public static final b HUGO_INTERNAL = new b("HUGO_INTERNAL", 8);

    @i(name = "HUGO_OUTGOING")
    public static final b HUGO_OUTGOING = new b("HUGO_OUTGOING", 9);

    @i(name = "INCOMING_PAYMENT")
    public static final b INCOMING_PAYMENT = new b("INCOMING_PAYMENT", 10);

    @i(name = "LOYALTY_CASHBACK")
    public static final b LOYALTY_CASHBACK = new b("LOYALTY_CASHBACK", 11);

    @i(name = "MIGRATE_CLIENT_BALANCE")
    public static final b MIGRATE_CLIENT_BALANCE = new b("MIGRATE_CLIENT_BALANCE", 12);

    @i(name = "OVERVALUATION_ADJUSTMENT")
    public static final b OVERVALUATION_ADJUSTMENT = new b("OVERVALUATION_ADJUSTMENT", 13);

    @i(name = "OZON_CLEARING")
    public static final b OZON_CLEARING = new b("OZON_CLEARING", 14);

    @i(name = "OZON_HOLD")
    public static final b OZON_HOLD = new b("OZON_HOLD", 15);

    @i(name = "OZON_HOLD_DROP")
    public static final b OZON_HOLD_DROP = new b("OZON_HOLD_DROP", 16);

    @i(name = "OZON_REFUND")
    public static final b OZON_REFUND = new b("OZON_REFUND", 17);

    @i(name = "REVALUATION_ADJUSTMENT")
    public static final b REVALUATION_ADJUSTMENT = new b("REVALUATION_ADJUSTMENT", 18);

    @i(name = "SBP_INCOMING")
    public static final b SBP_INCOMING = new b("SBP_INCOMING", 19);

    @i(name = "SBP_OUTGOING")
    public static final b SBP_OUTGOING = new b("SBP_OUTGOING", 20);

    @i(name = "SBP_OUTGOING_CONFIRM")
    public static final b SBP_OUTGOING_CONFIRM = new b("SBP_OUTGOING_CONFIRM", 21);

    @i(name = "SBP_OUTGOING_REFUND")
    public static final b SBP_OUTGOING_REFUND = new b("SBP_OUTGOING_REFUND", 22);

    @i(name = "TRANSFER")
    public static final b TRANSFER = new b("TRANSFER", 23);

    @i(name = "TRANSFER_INCOMING")
    public static final b TRANSFER_INCOMING = new b("TRANSFER_INCOMING", 24);

    @i(name = "TRANSFER_OUTGOING")
    public static final b TRANSFER_OUTGOING = new b("TRANSFER_OUTGOING", 25);

    @i(name = FraudMonInfo.UNKNOWN)
    public static final b UNKNOWN = new b(FraudMonInfo.UNKNOWN, 26);

    private static final /* synthetic */ b[] $values() {
        return new b[]{AUTHORIZATION, BALZAC_INCOMING, BALZAC_INTERNAL, BALZAC_OUTGOING, C2A_INCOMING, C2B_PARTNER_INCOMING, CANCEL_AUTHORIZATION, HUGO_INCOMING, HUGO_INTERNAL, HUGO_OUTGOING, INCOMING_PAYMENT, LOYALTY_CASHBACK, MIGRATE_CLIENT_BALANCE, OVERVALUATION_ADJUSTMENT, OZON_CLEARING, OZON_HOLD, OZON_HOLD_DROP, OZON_REFUND, REVALUATION_ADJUSTMENT, SBP_INCOMING, SBP_OUTGOING, SBP_OUTGOING_CONFIRM, SBP_OUTGOING_REFUND, TRANSFER, TRANSFER_INCOMING, TRANSFER_OUTGOING, UNKNOWN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private b(String str, int i11) {
    }

    @NotNull
    public static Xc.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
