package com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackController;", "", "", "Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "items", "<init>", "(Ljava/util/List;)V", "", "index", "", "isVisible", "(I)Z", "relativePosition", "(I)I", "Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackCardTransform;", "transform", "(I)Lcom/paypal/oslo/feature/home/ui/components/nbacarousel/stackedcarousel/StackCardTransform;", "", "moveToNext", "()V", "moveToPrevious", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<set-?>", "currentIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentIndex", "getCurrentItem", "()Lcom/paypal/oslo/feature/home/domain/model/OfferNBAItem;", "currentItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StackController {
    public static final int $stable = 8;

    /* renamed from: currentIndex$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState currentIndex;
    private final java.util.List<com.paypal.oslo.feature.home.domain.model.OfferNBAItem> items;

    public StackController(java.util.List<com.paypal.oslo.feature.home.domain.model.OfferNBAItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.items = kotlin.collections.CollectionsKt.toList(list);
        this.currentIndex = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.OfferNBAItem> getItems() {
        return this.items;
    }

    private final void setCurrentIndex(int i) {
        this.currentIndex.setIntValue(i);
    }

    public final int getCurrentIndex() {
        return this.currentIndex.getIntValue();
    }

    public final com.paypal.oslo.feature.home.domain.model.OfferNBAItem getCurrentItem() {
        return (com.paypal.oslo.feature.home.domain.model.OfferNBAItem) kotlin.collections.CollectionsKt.getOrNull(this.items, getCurrentIndex());
    }

    public final boolean isVisible(int index) {
        int relativePosition;
        return !this.items.isEmpty() && (relativePosition = relativePosition(index)) >= 0 && relativePosition < 3;
    }

    public final int relativePosition(int index) {
        if (this.items.isEmpty()) {
            return -1;
        }
        int size = this.items.size();
        int currentIndex = index - getCurrentIndex();
        if (currentIndex >= 0 && currentIndex < 3) {
            return currentIndex;
        }
        int i = size + currentIndex;
        if (i < 0 || i >= 3) {
            return -1;
        }
        return i;
    }

    public final com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform transform(int index) {
        int relativePosition = relativePosition(index);
        if (relativePosition < 0) {
            return new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
        float f = relativePosition;
        return new com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackCardTransform(1.0f - (0.05f * f), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.oslo.feature.home.ui.components.nbacarousel.stackedcarousel.StackConfiguration.INSTANCE.m14978getVERTICAL_OFFSETD9Ej5fM() * f), 3.0f - f, relativePosition >= 2 ? 0.7f : 1.0f, 2, null);
    }

    public final void moveToNext() {
        if (this.items.isEmpty()) {
            return;
        }
        setCurrentIndex((getCurrentIndex() + 1) % this.items.size());
    }

    public final void moveToPrevious() {
        if (this.items.isEmpty()) {
            return;
        }
        setCurrentIndex((getCurrentIndex() > 0 ? getCurrentIndex() : this.items.size()) - 1);
    }
}
