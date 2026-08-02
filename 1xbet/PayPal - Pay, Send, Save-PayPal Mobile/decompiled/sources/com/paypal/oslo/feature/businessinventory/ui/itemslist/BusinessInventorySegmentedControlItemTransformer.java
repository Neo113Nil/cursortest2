package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventorySegmentedControlItemTransformer;", "", "Lkotlin/Function1;", "", "", "stringResourceMapper", "Lcom/paypal/pds/components/SegmentedControlItem;", "toSegmentedControlItem", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/pds/components/SegmentedControlItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BusinessInventorySegmentedControlItemTransformer {
    com.paypal.pds.components.SegmentedControlItem toSegmentedControlItem(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> stringResourceMapper);
}
