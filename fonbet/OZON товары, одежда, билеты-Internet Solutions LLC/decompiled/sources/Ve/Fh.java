package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes6.dex */
public final class Fh {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4245fi f29004a;

    /* renamed from: b, reason: collision with root package name */
    public final ListOfCardsResponseBody.PaymentToolInfo.Tool f29005b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29006c;

    public /* synthetic */ Fh(AbstractC4245fi abstractC4245fi, int i11) {
        this(abstractC4245fi, null, (i11 & 4) == 0);
    }

    public static Fh a(Fh fh2, AbstractC4245fi state, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            state = fh2.f29004a;
        }
        if ((i11 & 2) != 0) {
            tool = fh2.f29005b;
        }
        if ((i11 & 4) != 0) {
            z11 = fh2.f29006c;
        }
        fh2.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new Fh(state, tool, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fh)) {
            return false;
        }
        Fh fh2 = (Fh) obj;
        return Intrinsics.d(this.f29004a, fh2.f29004a) && Intrinsics.d(this.f29005b, fh2.f29005b) && this.f29006c == fh2.f29006c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f29004a.hashCode() * 31;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool = this.f29005b;
        int hashCode2 = (hashCode + (tool == null ? 0 : tool.hashCode())) * 31;
        boolean z11 = this.f29006c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Outcome(state=");
        sb2.append(this.f29004a);
        sb2.append(", selectedCard=");
        sb2.append(this.f29005b);
        sb2.append(", isError=");
        return Pk0.a.a(")", sb2, this.f29006c);
    }

    public Fh(AbstractC4245fi state, ListOfCardsResponseBody.PaymentToolInfo.Tool tool, boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f29004a = state;
        this.f29005b = tool;
        this.f29006c = z11;
    }
}
