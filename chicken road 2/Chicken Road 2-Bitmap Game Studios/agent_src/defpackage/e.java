package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.internal.ParentSemanticsNode;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.HostDefaultProvider;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.DessertConfigEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ e(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.door.brass.knob.data.db.entity.DessertConfigEntity] */
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                Map map = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Pastries"));
            case 1:
                ChallengeEntity challengeEntity = (ChallengeEntity) obj;
                challengeEntity.getClass();
                return Long.valueOf(challengeEntity.yzPsTade5rL7D3);
            case 2:
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                ParentSemanticsNode parentSemanticsNode = (ParentSemanticsNode) traversableNode;
                parentSemanticsNode.FTJ2XS7ULgY8 = false;
                DelegatableNodeKt.i7xAcZoXXiIt(parentSemanticsNode).sb2TpovOJ8wNlST();
                return Boolean.FALSE;
            case 3:
                PaddingValuesImpl paddingValuesImpl = ChipKt.yzPsTade5rL7D3;
                SemanticsPropertiesKt.MRfxZSx8l5UG62U((SemanticsPropertyReceiver) obj, 1);
                return Unit.yzPsTade5rL7D3;
            case 4:
                PaddingValuesImpl paddingValuesImpl2 = ChipKt.yzPsTade5rL7D3;
                SemanticsPropertiesKt.MRfxZSx8l5UG62U((SemanticsPropertyReceiver) obj, 0);
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.yzPsTade5rL7D3(0.0f);
                graphicsLayerScope.n8dpKKeaNB4O0(null);
                graphicsLayerScope.ZvpnNpCMEWSR3(true);
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                throw null;
            case 7:
                return ((HostDefaultProvider) ((CompositionLocalAccessorScope) obj).pu0JZhzR2Or6(HostDefaultProviderKt.yzPsTade5rL7D3)).yzPsTade5rL7D3();
            case 8:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 9:
                return Unit.yzPsTade5rL7D3;
            case 10:
                ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new pu0JZhzR2Or6(14), new pu0JZhzR2Or6(14));
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.pu0JZhzR2Or6;
                KProperty kProperty = SemanticsPropertiesKt.yzPsTade5rL7D3[12];
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(semanticsPropertyKey, scrollAxisRange);
                return Unit.yzPsTade5rL7D3;
            case 11:
                SemanticsPropertiesKt.yRx9jbDCTnXb3((SemanticsPropertyReceiver) obj);
                return Unit.yzPsTade5rL7D3;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                SQLiteStatement rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT * FROM dessert_config LIMIT 1");
                try {
                    int ra306ClFT3HT = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT2 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "offer_url");
                    return rw91HsWWsh17Nm.ainHcH9lkbxnI() ? new DessertConfigEntity((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT), rw91HsWWsh17Nm.isNull(ra306ClFT3HT2) ? null : rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT2), ((int) rw91HsWWsh17Nm.getLong(SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "shows_offer"))) != 0, ((int) rw91HsWWsh17Nm.getLong(SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_zesty"))) != 0, ((int) rw91HsWWsh17Nm.getLong(SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "has_meringue"))) != 0, ((int) rw91HsWWsh17Nm.getLong(SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_seasonal"))) != 0) : null;
                } finally {
                    rw91HsWWsh17Nm.close();
                }
            case 13:
                return Unit.yzPsTade5rL7D3;
            case 14:
                float f = DragGestureDetectorKt.yzPsTade5rL7D3;
                return Unit.yzPsTade5rL7D3;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                return Boolean.TRUE;
            case 16:
                return Boolean.TRUE;
            case 17:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element2;
                }
                return null;
            case 18:
                synchronized (SnapshotKt.ra306ClFT3HT) {
                    List list = SnapshotKt.FsuUJlzzWhYnMlD;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) list.get(i)).uypNJrpDByoB(obj);
                    }
                }
                return Unit.yzPsTade5rL7D3;
            case 19:
                return Unit.yzPsTade5rL7D3;
            case 20:
                ((TextFieldBuffer) obj).oyjLVtGms9eZwJ0(null);
                return Unit.yzPsTade5rL7D3;
            case 21:
                throw null;
            case 22:
                List list2 = (List) obj;
                return new LazyGridState(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 23:
                ((Integer) obj).getClass();
                LazyGridMeasureResult lazyGridMeasureResult = LazyGridStateKt.yzPsTade5rL7D3;
                return EmptyList.oyjLVtGms9eZwJ0;
            case 24:
                ((Integer) obj).getClass();
                LazyGridMeasureResult lazyGridMeasureResult2 = LazyGridStateKt.yzPsTade5rL7D3;
                return -1;
            case 25:
                List list3 = (List) obj;
                return new LazyListState(((Number) list3.get(0)).intValue(), ((Number) list3.get(1)).intValue());
            case 26:
                List list4 = (List) obj;
                return new LazyStaggeredGridState((int[]) list4.get(0), (int[]) list4.get(1));
            case 27:
                return Unit.yzPsTade5rL7D3;
            case 28:
                return Unit.yzPsTade5rL7D3;
            default:
                return Unit.yzPsTade5rL7D3;
        }
    }
}
