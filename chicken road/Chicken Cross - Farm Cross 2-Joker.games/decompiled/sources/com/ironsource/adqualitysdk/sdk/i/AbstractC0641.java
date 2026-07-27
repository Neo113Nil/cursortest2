package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۊ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0641 extends AbstractC0411 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f1779;

    public AbstractC0641(Object obj) {
        this.f1779 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1779;
        Object obj3 = ((AbstractC0641) obj).f1779;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public final int hashCode() {
        Object obj = this.f1779;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "" + this.f1779;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0411
    /* renamed from: ﾒ */
    public final C1192 mo5387(C1074 c1074, C1226 c1226) {
        return new C1192(this.f1779);
    }
}
