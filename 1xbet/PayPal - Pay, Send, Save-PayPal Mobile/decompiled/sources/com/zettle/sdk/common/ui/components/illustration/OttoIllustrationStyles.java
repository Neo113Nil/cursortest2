package com.zettle.sdk.common.ui.components.illustration;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;III)V", "styleRes", com.visa.cbp.getEncExpo.warmup, "getStyleRes", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "Companion", "DEFAULT", "LILAC"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum OttoIllustrationStyles {
    DEFAULT(0, com.zettle.sdk.common.ui.R.style.OttoIllustrationImageColorKeysStyle_Default),
    LILAC(2, com.zettle.sdk.common.ui.R.style.OttoIllustrationImageColorKeysStyle_Lilac);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.Companion INSTANCE = new com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.Companion(null);
    private final int styleRes;
    private final int value;

    OttoIllustrationStyles(int i, int i2) {
        this.value = i;
        this.styleRes = i2;
    }

    public final int getStyleRes() {
        return this.styleRes;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;", "findByValue", "(I)Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationStyles;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles findByValue(int value) {
            com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles ottoIllustrationStyles;
            com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles[] values = com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ottoIllustrationStyles = null;
                    break;
                }
                ottoIllustrationStyles = values[i];
                if (ottoIllustrationStyles.getValue() == value) {
                    break;
                }
                i++;
            }
            return ottoIllustrationStyles == null ? com.zettle.sdk.common.ui.components.illustration.OttoIllustrationStyles.DEFAULT : ottoIllustrationStyles;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
