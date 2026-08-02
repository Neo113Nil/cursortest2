package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/zettle/sdk/meta/AndroidVersion;", "", "Lcom/zettle/sdk/meta/Version;", "", "p0", "<init>", "(Ljava/lang/String;II)V", "code", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "KitKat", "KitKatWatch", "Lollipop", "LollipopMr1", "Marshmallow", "Nougat", "NougatMr1", "Oreo", "OreoMr1", "Pie", "Android10", "Android11", "Android12"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum AndroidVersion implements com.zettle.sdk.meta.Version {
    KitKat(19),
    KitKatWatch(20),
    Lollipop(21),
    LollipopMr1(22),
    Marshmallow(23),
    Nougat(24),
    NougatMr1(25),
    Oreo(26),
    OreoMr1(27),
    Pie(28),
    Android10(29),
    Android11(30),
    Android12(31);

    private final int code;

    AndroidVersion(int i) {
        this.code = i;
    }

    @Override // com.zettle.sdk.meta.Version
    public final int getCode() {
        return this.code;
    }
}
