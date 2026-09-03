package defpackage;

import androidx.core.content.res.ResourcesCompat;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class OL5dzh3MEyfV implements Runnable {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ OL5dzh3MEyfV(int i, int i2, Object obj) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = this.gmXBnHsR2YSm;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            case 1:
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                ((ResourcesCompat.FontCallback) obj).hRNgd2zGCE5kj(i2);
                break;
        }
    }
}
