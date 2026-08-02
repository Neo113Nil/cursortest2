package com.razorpay.nfc;

import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/razorpay/nfc/CardData;", "", "pan", "", "expiry", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpiry", "()Ljava/lang/String;", "getPan", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CardData {
    private final String __l1_;
    private final String l$1_I$l$;

    public CardData(String pan, String str) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        this.l$1_I$l$ = pan;
        this.__l1_ = str;
    }

    public static /* synthetic */ CardData copy$default(CardData cardData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardData.l$1_I$l$;
        }
        if ((i & 2) != 0) {
            str2 = cardData.__l1_;
        }
        return cardData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getL$1_I$l$() {
        return this.l$1_I$l$;
    }

    /* renamed from: component2, reason: from getter */
    public final String get__l1_() {
        return this.__l1_;
    }

    public final CardData copy(String pan, String expiry) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        return new CardData(pan, expiry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) other;
        return Intrinsics.areEqual(this.l$1_I$l$, cardData.l$1_I$l$) && Intrinsics.areEqual(this.__l1_, cardData.__l1_);
    }

    public final String getExpiry() {
        return this.__l1_;
    }

    public final String getPan() {
        return this.l$1_I$l$;
    }

    public int hashCode() {
        int hashCode = this.l$1_I$l$.hashCode() * 31;
        String str = this.__l1_;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardData(pan=");
        sb.append(this.l$1_I$l$);
        sb.append(", expiry=");
        return t.b(')', this.__l1_, sb);
    }
}
