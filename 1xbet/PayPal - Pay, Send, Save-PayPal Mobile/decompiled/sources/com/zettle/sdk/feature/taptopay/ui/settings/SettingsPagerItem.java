package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/SettingsPagerItem;", "", "", "text", "image", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "illustration", "<init>", "(ILjava/lang/Integer;Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;)V", "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "getIllustration", "()Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/Integer;", com.visa.cbp.getEncExpo.warmup, "getText", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsPagerItem {
    public static final int $stable = 0;
    private final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages illustration;
    private final java.lang.Integer image;
    private final int text;

    public SettingsPagerItem(int i, java.lang.Integer num, com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages ottoIllustrationImages) {
        this.text = i;
        this.image = num;
        this.illustration = ottoIllustrationImages;
    }

    public /* synthetic */ SettingsPagerItem(int i, java.lang.Integer num, com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages ottoIllustrationImages, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : ottoIllustrationImages);
    }

    public final int getText() {
        return this.text;
    }

    public final java.lang.Integer getImage() {
        return this.image;
    }

    public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages getIllustration() {
        return this.illustration;
    }
}
