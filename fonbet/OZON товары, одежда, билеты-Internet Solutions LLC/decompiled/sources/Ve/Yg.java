package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* loaded from: classes10.dex */
public final class Yg {

    /* renamed from: a, reason: collision with root package name */
    public final String f30461a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f30462b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f30463c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30464d;

    /* renamed from: e, reason: collision with root package name */
    public final ButtonBnpl f30465e;

    public Yg(String str, Long l11, Boolean bool, ButtonBnpl buttonBnpl, int i11) {
        str = (i11 & 1) != 0 ? null : str;
        l11 = (i11 & 2) != 0 ? null : l11;
        bool = (i11 & 4) != 0 ? null : bool;
        boolean z11 = (i11 & 8) != 0;
        buttonBnpl = (i11 & 16) != 0 ? null : buttonBnpl;
        this.f30461a = str;
        this.f30462b = l11;
        this.f30463c = bool;
        this.f30464d = z11;
        this.f30465e = buttonBnpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yg)) {
            return false;
        }
        Yg yg2 = (Yg) obj;
        return Intrinsics.d(this.f30461a, yg2.f30461a) && Intrinsics.d(this.f30462b, yg2.f30462b) && Intrinsics.d(this.f30463c, yg2.f30463c) && this.f30464d == yg2.f30464d && Intrinsics.d(this.f30465e, yg2.f30465e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f30461a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.f30462b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f30463c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z11 = this.f30464d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        ButtonBnpl buttonBnpl = this.f30465e;
        return i12 + (buttonBnpl != null ? buttonBnpl.hashCode() : 0);
    }

    public final String toString() {
        return "BnplButtonData(numOfPayments=" + this.f30461a + ", payment=" + this.f30462b + ", isButtonEnable=" + this.f30463c + ", isButtonVisible=" + this.f30464d + ", bnplButton=" + this.f30465e + ")";
    }
}
