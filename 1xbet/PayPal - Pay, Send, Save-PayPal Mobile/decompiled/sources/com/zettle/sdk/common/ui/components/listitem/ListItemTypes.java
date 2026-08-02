package com.zettle.sdk.common.ui.components.listitem;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "INTERACTIVE", "STATIC"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum ListItemTypes {
    INTERACTIVE(0),
    STATIC(1);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.listitem.ListItemTypes.Companion INSTANCE = new com.zettle.sdk.common.ui.components.listitem.ListItemTypes.Companion(null);
    private final int value;

    ListItemTypes(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;", "findByValue", "(I)Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.common.ui.components.listitem.ListItemTypes findByValue(int value) {
            com.zettle.sdk.common.ui.components.listitem.ListItemTypes listItemTypes;
            com.zettle.sdk.common.ui.components.listitem.ListItemTypes[] values = com.zettle.sdk.common.ui.components.listitem.ListItemTypes.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    listItemTypes = null;
                    break;
                }
                listItemTypes = values[i];
                if (listItemTypes.getValue() == value) {
                    break;
                }
                i++;
            }
            return listItemTypes == null ? com.zettle.sdk.common.ui.components.listitem.ListItemTypes.STATIC : listItemTypes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
