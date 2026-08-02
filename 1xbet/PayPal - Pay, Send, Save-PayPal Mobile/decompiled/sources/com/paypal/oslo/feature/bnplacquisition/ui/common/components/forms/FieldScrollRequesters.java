package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldScrollRequesters;", "", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/focus/FocusRequester;)V", "component1", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "component2", "()Landroidx/compose/ui/focus/FocusRequester;", "copy", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/focus/FocusRequester;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldScrollRequesters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "getBringIntoViewRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FieldScrollRequesters {
    public static final int $stable = 8;
    private final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester;
    private final androidx.compose.ui.focus.FocusRequester focusRequester;

    public FieldScrollRequesters(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.focus.FocusRequester focusRequester) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bringIntoViewRequester, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester, "");
        this.bringIntoViewRequester = bringIntoViewRequester;
        this.focusRequester = focusRequester;
    }

    public final androidx.compose.foundation.relocation.BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final java.lang.String toString() {
        androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester = this.bringIntoViewRequester;
        androidx.compose.ui.focus.FocusRequester focusRequester = this.focusRequester;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldScrollRequesters(bringIntoViewRequester=");
        sb.append(bringIntoViewRequester);
        sb.append(", focusRequester=");
        sb.append(focusRequester);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.bringIntoViewRequester.hashCode() * 31) + this.focusRequester.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters fieldScrollRequesters = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bringIntoViewRequester, fieldScrollRequesters.bringIntoViewRequester) && kotlin.jvm.internal.Intrinsics.areEqual(this.focusRequester, fieldScrollRequesters.focusRequester);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters copy(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.focus.FocusRequester focusRequester) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bringIntoViewRequester, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusRequester, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters(bringIntoViewRequester, focusRequester);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.ui.focus.FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.foundation.relocation.BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldScrollRequesters fieldScrollRequesters, androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.focus.FocusRequester focusRequester, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bringIntoViewRequester = fieldScrollRequesters.bringIntoViewRequester;
        }
        if ((i & 2) != 0) {
            focusRequester = fieldScrollRequesters.focusRequester;
        }
        return fieldScrollRequesters.copy(bringIntoViewRequester, focusRequester);
    }
}
