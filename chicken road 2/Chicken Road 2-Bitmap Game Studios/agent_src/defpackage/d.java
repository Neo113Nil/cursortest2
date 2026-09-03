package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ d(LazyLayoutItemAnimation lazyLayoutItemAnimation, long j) {
        this.oyjLVtGms9eZwJ0 = 1;
        this.gmXBnHsR2YSm = lazyLayoutItemAnimation;
        this.b41X89IqSbKt = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        long j = this.b41X89IqSbKt;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj2 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                String str = (String) obj2;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT EXISTS(SELECT 1 FROM challenge_progress_events WHERE challenge_id = ? AND event_key = ?)");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    rw91HsWWsh17Nm.o2t7oodqU1bUMaS(str, 2);
                    boolean z = false;
                    if (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        z = ((int) rw91HsWWsh17Nm.getLong(0)) != 0;
                    }
                    rw91HsWWsh17Nm.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    rw91HsWWsh17Nm.close();
                    throw th;
                }
            case 1:
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) obj2;
                lazyLayoutItemAnimation.Uo5pffGf8LUU(IntOffset.ra306ClFT3HT(((IntOffset) ((Animatable) obj).oyjLVtGms9eZwJ0()).yzPsTade5rL7D3, j));
                lazyLayoutItemAnimation.ra306ClFT3HT.hRNgd2zGCE5kj();
                return unit;
            default:
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                DrawScope.K6HLhdE38aTVLa((DrawScope) obj, this.b41X89IqSbKt, 0L, 0L, RangesKt.hRNgd2zGCE5kj(((Number) ((State) obj2).getOyjLVtGms9eZwJ0()).floatValue(), 0.0f, 1.0f), null, null, 118);
                return unit;
        }
    }

    public /* synthetic */ d(int i, long j, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = j;
        this.gmXBnHsR2YSm = obj;
    }
}
