package D70;

import C.o0;
import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.operations.presentation.ReceiptFragment;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f6140a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f6141b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReceiptFragment.a f6142c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f6143d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f6144e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f6145f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f6146g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f6147h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f6148i;

    /* renamed from: j, reason: collision with root package name */
    private final String f6149j;

    public a(@NotNull String id2, @NotNull String receiptText, @NotNull ReceiptFragment.a receiptType, @NotNull String time, @NotNull String amount, @NotNull String receiverBank, @NotNull String senderName, @NotNull String senderPhone, @NotNull String senderBank, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(receiptText, "receiptText");
        Intrinsics.checkNotNullParameter(receiptType, "receiptType");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(receiverBank, "receiverBank");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderPhone, "senderPhone");
        Intrinsics.checkNotNullParameter(senderBank, "senderBank");
        this.f6140a = id2;
        this.f6141b = receiptText;
        this.f6142c = receiptType;
        this.f6143d = time;
        this.f6144e = amount;
        this.f6145f = receiverBank;
        this.f6146g = senderName;
        this.f6147h = senderPhone;
        this.f6148i = senderBank;
        this.f6149j = str;
    }

    @NotNull
    public final String a() {
        return this.f6144e;
    }

    @NotNull
    public final String b() {
        return this.f6140a;
    }

    public final String c() {
        return this.f6149j;
    }

    @NotNull
    public final String d() {
        return this.f6141b;
    }

    @NotNull
    public final ReceiptFragment.a e() {
        return this.f6142c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f6140a, aVar.f6140a) && Intrinsics.d(this.f6141b, aVar.f6141b) && this.f6142c == aVar.f6142c && Intrinsics.d(this.f6143d, aVar.f6143d) && Intrinsics.d(this.f6144e, aVar.f6144e) && Intrinsics.d(this.f6145f, aVar.f6145f) && Intrinsics.d(this.f6146g, aVar.f6146g) && Intrinsics.d(this.f6147h, aVar.f6147h) && Intrinsics.d(this.f6148i, aVar.f6148i) && Intrinsics.d(this.f6149j, aVar.f6149j);
    }

    @NotNull
    public final String f() {
        return this.f6145f;
    }

    @NotNull
    public final String g() {
        return this.f6148i;
    }

    @NotNull
    public final String h() {
        return this.f6146g;
    }

    public final int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(g.a(g.a((this.f6142c.hashCode() + g.a(this.f6140a.hashCode() * 31, 31, this.f6141b)) * 31, 31, this.f6143d), 31, this.f6144e), 31, this.f6145f), 31, this.f6146g), 31, this.f6147h), 31, this.f6148i);
        String str = this.f6149j;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String i() {
        return this.f6147h;
    }

    @NotNull
    public final String j() {
        return this.f6143d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReceiptData(id=");
        sb2.append(this.f6140a);
        sb2.append(", receiptText=");
        sb2.append(this.f6141b);
        sb2.append(", receiptType=");
        sb2.append(this.f6142c);
        sb2.append(", time=");
        sb2.append(this.f6143d);
        sb2.append(", amount=");
        sb2.append(this.f6144e);
        sb2.append(", receiverBank=");
        sb2.append(this.f6145f);
        sb2.append(", senderName=");
        sb2.append(this.f6146g);
        sb2.append(", senderPhone=");
        sb2.append(this.f6147h);
        sb2.append(", senderBank=");
        sb2.append(this.f6148i);
        sb2.append(", message=");
        return o0.c(sb2, this.f6149j, ")");
    }
}
