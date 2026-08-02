package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\u000f\u0010"}, d2 = {"Lcom/paypal/pds/components/CheckboxStyle;", "", "Lcom/paypal/pds/core/Icon;", "p0", "p1", "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Icon;)V", "checkedIcon", "Lcom/paypal/pds/core/Icon;", "getCheckedIcon$pds_release", "()Lcom/paypal/pds/core/Icon;", "uncheckedIcon", "getUncheckedIcon$pds_release", "Selected", "Partial", "Lcom/paypal/pds/components/CheckboxStyle$Partial;", "Lcom/paypal/pds/components/CheckboxStyle$Selected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class CheckboxStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon checkedIcon;
    private final com.paypal.pds.core.Icon uncheckedIcon;

    private CheckboxStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Icon icon2) {
        this.checkedIcon = icon;
        this.uncheckedIcon = icon2;
    }

    /* renamed from: getCheckedIcon$pds_release, reason: from getter */
    public final com.paypal.pds.core.Icon getCheckedIcon() {
        return this.checkedIcon;
    }

    public /* synthetic */ CheckboxStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Icon.CheckboxEmpty checkboxEmpty, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, (i & 2) != 0 ? com.paypal.pds.core.Icon.CheckboxEmpty.INSTANCE : checkboxEmpty, null);
    }

    /* renamed from: getUncheckedIcon$pds_release, reason: from getter */
    public final com.paypal.pds.core.Icon getUncheckedIcon() {
        return this.uncheckedIcon;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/CheckboxStyle$Selected;", "Lcom/paypal/pds/components/CheckboxStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Selected extends com.paypal.pds.components.CheckboxStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.CheckboxStyle.Selected INSTANCE = new com.paypal.pds.components.CheckboxStyle.Selected();

        /* JADX WARN: Multi-variable type inference failed */
        private Selected() {
            super(com.paypal.pds.core.Icon.CheckboxSelected.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/CheckboxStyle$Partial;", "Lcom/paypal/pds/components/CheckboxStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Partial extends com.paypal.pds.components.CheckboxStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.CheckboxStyle.Partial INSTANCE = new com.paypal.pds.components.CheckboxStyle.Partial();

        /* JADX WARN: Multi-variable type inference failed */
        private Partial() {
            super(com.paypal.pds.core.Icon.CheckboxPartial.INSTANCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ CheckboxStyle(com.paypal.pds.core.Icon icon, com.paypal.pds.core.Icon icon2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, icon2);
    }
}
