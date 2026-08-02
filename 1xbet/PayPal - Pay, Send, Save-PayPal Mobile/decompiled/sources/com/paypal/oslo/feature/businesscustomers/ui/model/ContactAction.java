package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/ContactAction;", "", "Lcom/paypal/pds/core/Icon;", "icon", "Lkotlin/Function0;", "", "onItemClick", "", "testTag", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "trackedElement", "<init>", "(Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;)V", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "Lkotlin/jvm/functions/Function0;", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "getTrackedElement", "()Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ContactAction {
    public static final int $stable = 8;
    private final com.paypal.pds.core.Icon icon;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onItemClick;
    private final java.lang.String testTag;
    private final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement;

    public ContactAction(com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.icon = icon;
        this.onItemClick = function0;
        this.testTag = str;
        this.trackedElement = trackedElement;
    }

    public /* synthetic */ ContactAction(com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, java.lang.String str, com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement trackedElement, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, function0, str, (i & 8) != 0 ? null : trackedElement);
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final java.lang.String getTestTag() {
        return this.testTag;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement getTrackedElement() {
        return this.trackedElement;
    }
}
