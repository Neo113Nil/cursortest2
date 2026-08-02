package com.zettle.sdk.common.ui.components.presentationarea;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/zettle/sdk/common/ui/components/presentationarea/OttoPresentationAreaStyles;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;III)V", "colorRes", com.visa.cbp.getEncExpo.warmup, "getColorRes", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "Companion", "DEFAULT", "INFO", "SUCCESS", "HIGHLIGHT", "WARNING", "ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum OttoPresentationAreaStyles {
    DEFAULT(0, com.zettle.sdk.common.ui.R.color.backgroundGroupedPrimary),
    INFO(1, com.zettle.sdk.common.ui.R.color.backgroundInfo),
    SUCCESS(2, com.zettle.sdk.common.ui.R.color.backgroundSuccess),
    HIGHLIGHT(3, com.zettle.sdk.common.ui.R.color.backgroundHighlight),
    WARNING(4, com.zettle.sdk.common.ui.R.color.backgroundWarning),
    ERROR(5, com.zettle.sdk.common.ui.R.color.backgroundError);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles.Companion INSTANCE = new com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles.Companion(null);
    private final int colorRes;
    private final int value;

    OttoPresentationAreaStyles(int i, int i2) {
        this.value = i;
        this.colorRes = i2;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/presentationarea/OttoPresentationAreaStyles$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/common/ui/components/presentationarea/OttoPresentationAreaStyles;", "findByValue", "(I)Lcom/zettle/sdk/common/ui/components/presentationarea/OttoPresentationAreaStyles;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles findByValue(int value) {
            com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles ottoPresentationAreaStyles;
            com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles[] values = com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ottoPresentationAreaStyles = null;
                    break;
                }
                ottoPresentationAreaStyles = values[i];
                if (ottoPresentationAreaStyles.getValue() == value) {
                    break;
                }
                i++;
            }
            return ottoPresentationAreaStyles == null ? com.zettle.sdk.common.ui.components.presentationarea.OttoPresentationAreaStyles.DEFAULT : ottoPresentationAreaStyles;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
