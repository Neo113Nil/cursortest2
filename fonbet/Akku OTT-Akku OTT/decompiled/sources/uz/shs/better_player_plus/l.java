package uz.shs.better_player_plus;

import androidx.media3.common.util.UnstableApi;
import kotlin.jvm.JvmField;

@UnstableApi
/* loaded from: classes5.dex */
public final class l {

    @JvmField
    public final int a;

    @JvmField
    public final int b;

    @JvmField
    public final int c;

    @JvmField
    public final int d;

    public l() {
        this.a = 50000;
        this.b = 50000;
        this.c = 1000;
        this.d = 2000;
    }

    public l(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num != null ? num.intValue() : 50000;
        this.b = num2 != null ? num2.intValue() : 50000;
        this.c = num3 != null ? num3.intValue() : 1000;
        this.d = num4 != null ? num4.intValue() : 2000;
    }
}
