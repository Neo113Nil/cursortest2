package org.betup.bus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.promo.PromoBanner;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PromoForMatchAvailableMessage.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/bus/PromoForMatchAvailableMessage;", "", "promoBanner", "Lorg/betup/model/remote/entity/promo/PromoBanner;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/promo/PromoBanner;)V", "getPromoBanner", "()Lorg/betup/model/remote/entity/promo/PromoBanner;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoForMatchAvailableMessage {
    public static final int $stable = 0;
    private final PromoBanner promoBanner;

    public static /* synthetic */ PromoForMatchAvailableMessage copy$default(PromoForMatchAvailableMessage promoForMatchAvailableMessage, PromoBanner promoBanner, int i, Object obj) {
        if ((i & 1) != 0) {
            promoBanner = promoForMatchAvailableMessage.promoBanner;
        }
        return promoForMatchAvailableMessage.copy(promoBanner);
    }

    /* renamed from: component1, reason: from getter */
    public final PromoBanner getPromoBanner() {
        return this.promoBanner;
    }

    public final PromoForMatchAvailableMessage copy(PromoBanner promoBanner) {
        Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
        return new PromoForMatchAvailableMessage(promoBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PromoForMatchAvailableMessage) && Intrinsics.areEqual(this.promoBanner, ((PromoForMatchAvailableMessage) other).promoBanner);
    }

    public int hashCode() {
        return this.promoBanner.hashCode();
    }

    public String toString() {
        return "PromoForMatchAvailableMessage(promoBanner=" + this.promoBanner + ")";
    }

    public PromoForMatchAvailableMessage(PromoBanner promoBanner) {
        Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
        this.promoBanner = promoBanner;
    }

    public final PromoBanner getPromoBanner() {
        return this.promoBanner;
    }
}
