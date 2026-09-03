package defpackage;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.db.entity.TasteMarkEntity;
import com.door.brass.knob.data.db.entity.TipEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class K6HLhdE38aTVLa implements Function1 {
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ K6HLhdE38aTVLa(int i, long j) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        SQLiteStatement rw91HsWWsh17Nm;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        long j = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                float f = AndroidCursorHandle_androidKt.yzPsTade5rL7D3;
                float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.oyjLVtGms9eZwJ0.b41X89IqSbKt() >> 32)) / 2.0f;
                return cacheDrawScope.gmXBnHsR2YSm(new Gx4wlvRzB4Xo5(intBitsToFloat, AndroidSelectionHandles_androidKt.oyjLVtGms9eZwJ0(cacheDrawScope, intBitsToFloat), ColorFilter.Companion.yzPsTade5rL7D3(j), r9));
            case 1:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT * FROM challenges WHERE id = ?");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    int ra306ClFT3HT = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT2 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "title");
                    int ra306ClFT3HT3 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "description");
                    int ra306ClFT3HT4 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT5 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "target_count");
                    int ra306ClFT3HT6 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "current_progress");
                    int ra306ClFT3HT7 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_completed");
                    int ra306ClFT3HT8 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "completed_at");
                    if (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        r6 = new ChallengeEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT2), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT3), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT4), (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT5), (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT6), ((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT7)) != 0, rw91HsWWsh17Nm.isNull(ra306ClFT3HT8) ? null : Long.valueOf(rw91HsWWsh17Nm.getLong(ra306ClFT3HT8)));
                    }
                    return r6;
                } finally {
                }
            case 2:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                rw91HsWWsh17Nm = sQLiteConnection2.rw91HsWWsh17Nm("SELECT COUNT(DISTINCT event_key) FROM challenge_progress_events WHERE challenge_id = ?");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    r9 = rw91HsWWsh17Nm.ainHcH9lkbxnI() ? (int) rw91HsWWsh17Nm.getLong(0) : 0;
                    rw91HsWWsh17Nm.close();
                    return Integer.valueOf(r9);
                } finally {
                }
            case 3:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                rw91HsWWsh17Nm = sQLiteConnection3.rw91HsWWsh17Nm("SELECT COUNT(*) FROM challenge_progress_events WHERE challenge_id = ?");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    r9 = rw91HsWWsh17Nm.ainHcH9lkbxnI() ? (int) rw91HsWWsh17Nm.getLong(0) : 0;
                    rw91HsWWsh17Nm.close();
                    return Integer.valueOf(r9);
                } finally {
                }
            case 4:
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SelectionHandlesKt.yzPsTade5rL7D3, new SelectionHandleInfo(Handle.oyjLVtGms9eZwJ0, this.b41X89IqSbKt, SelectionHandleAnchor.b41X89IqSbKt, true));
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                rw91HsWWsh17Nm = sQLiteConnection4.rw91HsWWsh17Nm("SELECT * FROM menu_items WHERE id = ?");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    int ra306ClFT3HT9 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT10 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "name");
                    int ra306ClFT3HT11 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT12 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "description");
                    int ra306ClFT3HT13 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "ingredients");
                    int ra306ClFT3HT14 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "sweetness");
                    int ra306ClFT3HT15 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "texture");
                    int ra306ClFT3HT16 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "tags");
                    if (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        r6 = new MenuItemEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT9), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT10), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT11), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT12), rw91HsWWsh17Nm.isNull(ra306ClFT3HT13) ? null : rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT13), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT14), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT15), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT16));
                    }
                    return r6;
                } finally {
                }
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                DrawScope drawScope = (DrawScope) obj;
                CubicBezierEasing cubicBezierEasing = ProgressIndicatorKt.yzPsTade5rL7D3;
                float min = Math.min(drawScope.rw91HsWWsh17Nm(4.0f), Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() & 4294967295L)));
                float rw91HsWWsh17Nm2 = drawScope.rw91HsWWsh17Nm(6.0f);
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.b41X89IqSbKt() & 4294967295L)) - min) / 2.0f;
                if (intBitsToFloat2 <= rw91HsWWsh17Nm2) {
                    rw91HsWWsh17Nm2 = intBitsToFloat2;
                }
                if (drawScope.getLayoutDirection() == LayoutDirection.b41X89IqSbKt) {
                    long a2 = drawScope.a();
                    CanvasDrawScope$drawContext$1 b41X89IqSbKt = drawScope.getB41X89IqSbKt();
                    long oyjLVtGms9eZwJ0 = b41X89IqSbKt.oyjLVtGms9eZwJ0();
                    b41X89IqSbKt.yzPsTade5rL7D3().yRx9jbDCTnXb3();
                    try {
                        b41X89IqSbKt.yzPsTade5rL7D3.b41X89IqSbKt(-1.0f, 1.0f, a2);
                        ProgressIndicatorDefaults.yzPsTade5rL7D3(drawScope, j, min, rw91HsWWsh17Nm2);
                    } finally {
                        OcGJUxcOVecQiKb.pu0JZhzR2Or6(b41X89IqSbKt, oyjLVtGms9eZwJ0);
                    }
                } else {
                    ProgressIndicatorDefaults.yzPsTade5rL7D3(drawScope, j, min, rw91HsWWsh17Nm2);
                }
                return unit;
            case 7:
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                rw91HsWWsh17Nm = sQLiteConnection5.rw91HsWWsh17Nm("SELECT * FROM taste_marks WHERE menu_item_id = ? ORDER BY timestamp DESC");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    int ra306ClFT3HT17 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT18 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "menu_item_id");
                    int ra306ClFT3HT19 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "value");
                    int ra306ClFT3HT20 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "label");
                    int ra306ClFT3HT21 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        arrayList.add(new TasteMarkEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT17), rw91HsWWsh17Nm.getLong(ra306ClFT3HT18), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT19), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT20), rw91HsWWsh17Nm.getLong(ra306ClFT3HT21)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                rw91HsWWsh17Nm = sQLiteConnection6.rw91HsWWsh17Nm("SELECT * FROM tips WHERE id = ?");
                try {
                    rw91HsWWsh17Nm.i7xAcZoXXiIt(1, j);
                    int ra306ClFT3HT22 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT23 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "title");
                    int ra306ClFT3HT24 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "content");
                    int ra306ClFT3HT25 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT26 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_favorite");
                    if (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        r6 = new TipEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT22), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT23), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT24), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT25), ((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT26)) != 0);
                    }
                    return r6;
                } finally {
                }
        }
    }
}
