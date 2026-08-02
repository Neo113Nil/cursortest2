package org.betup.ui.dialogs.offer.webview;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebLoadSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebPriceInjection;", "", "oldPriceElementIds", "", "", "newPriceElementIds", "formattedOldPrice", "formattedNewPrice", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getOldPriceElementIds", "()Ljava/util/List;", "getNewPriceElementIds", "getFormattedOldPrice", "()Ljava/lang/String;", "getFormattedNewPrice", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OfferWebPriceInjection {
    public static final int $stable = 8;
    private final String formattedNewPrice;
    private final String formattedOldPrice;
    private final List<String> newPriceElementIds;
    private final List<String> oldPriceElementIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferWebPriceInjection copy$default(OfferWebPriceInjection offerWebPriceInjection, List list, List list2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerWebPriceInjection.oldPriceElementIds;
        }
        if ((i & 2) != 0) {
            list2 = offerWebPriceInjection.newPriceElementIds;
        }
        if ((i & 4) != 0) {
            str = offerWebPriceInjection.formattedOldPrice;
        }
        if ((i & 8) != 0) {
            str2 = offerWebPriceInjection.formattedNewPrice;
        }
        return offerWebPriceInjection.copy(list, list2, str, str2);
    }

    public final List<String> component1() {
        return this.oldPriceElementIds;
    }

    public final List<String> component2() {
        return this.newPriceElementIds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormattedOldPrice() {
        return this.formattedOldPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFormattedNewPrice() {
        return this.formattedNewPrice;
    }

    public final OfferWebPriceInjection copy(List<String> oldPriceElementIds, List<String> newPriceElementIds, String formattedOldPrice, String formattedNewPrice) {
        Intrinsics.checkNotNullParameter(oldPriceElementIds, "oldPriceElementIds");
        Intrinsics.checkNotNullParameter(newPriceElementIds, "newPriceElementIds");
        Intrinsics.checkNotNullParameter(formattedNewPrice, "formattedNewPrice");
        return new OfferWebPriceInjection(oldPriceElementIds, newPriceElementIds, formattedOldPrice, formattedNewPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferWebPriceInjection)) {
            return false;
        }
        OfferWebPriceInjection offerWebPriceInjection = (OfferWebPriceInjection) other;
        return Intrinsics.areEqual(this.oldPriceElementIds, offerWebPriceInjection.oldPriceElementIds) && Intrinsics.areEqual(this.newPriceElementIds, offerWebPriceInjection.newPriceElementIds) && Intrinsics.areEqual(this.formattedOldPrice, offerWebPriceInjection.formattedOldPrice) && Intrinsics.areEqual(this.formattedNewPrice, offerWebPriceInjection.formattedNewPrice);
    }

    public int hashCode() {
        int hashCode = ((this.oldPriceElementIds.hashCode() * 31) + this.newPriceElementIds.hashCode()) * 31;
        String str = this.formattedOldPrice;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.formattedNewPrice.hashCode();
    }

    public String toString() {
        return "OfferWebPriceInjection(oldPriceElementIds=" + this.oldPriceElementIds + ", newPriceElementIds=" + this.newPriceElementIds + ", formattedOldPrice=" + this.formattedOldPrice + ", formattedNewPrice=" + this.formattedNewPrice + ")";
    }

    public OfferWebPriceInjection(List<String> oldPriceElementIds, List<String> newPriceElementIds, String str, String formattedNewPrice) {
        Intrinsics.checkNotNullParameter(oldPriceElementIds, "oldPriceElementIds");
        Intrinsics.checkNotNullParameter(newPriceElementIds, "newPriceElementIds");
        Intrinsics.checkNotNullParameter(formattedNewPrice, "formattedNewPrice");
        this.oldPriceElementIds = oldPriceElementIds;
        this.newPriceElementIds = newPriceElementIds;
        this.formattedOldPrice = str;
        this.formattedNewPrice = formattedNewPrice;
    }

    public final List<String> getOldPriceElementIds() {
        return this.oldPriceElementIds;
    }

    public final List<String> getNewPriceElementIds() {
        return this.newPriceElementIds;
    }

    public final String getFormattedOldPrice() {
        return this.formattedOldPrice;
    }

    public final String getFormattedNewPrice() {
        return this.formattedNewPrice;
    }
}
