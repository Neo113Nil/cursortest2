package defpackage;

import android.content.res.Resources;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.emoji2.text.EmojiCompat;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.TipEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    /* JADX WARN: Removed duplicated region for block: B:150:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uypNJrpDByoB(Object obj) {
        int i;
        SQLiteStatement rw91HsWWsh17Nm;
        int i2 = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i2) {
            case 0:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 1:
                ((Float) obj).getClass();
                return unit;
            case 2:
                TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
                String str = textFieldPreparedSelection.i7xAcZoXXiIt.b41X89IqSbKt;
                long j = textFieldPreparedSelection.gmXBnHsR2YSm;
                int i3 = TextRange.ra306ClFT3HT;
                int i4 = (int) (j & 4294967295L);
                if (i4 > 0) {
                    EmojiCompat ra306ClFT3HT = StringHelpers_androidKt.ra306ClFT3HT();
                    if (ra306ClFT3HT != null) {
                        int ra306ClFT3HT2 = ra306ClFT3HT.ra306ClFT3HT(str, i4 - 1);
                        if (ra306ClFT3HT2 >= 0) {
                            i = ra306ClFT3HT2;
                        } else if (i4 > 0) {
                            i = Character.offsetByCodePoints(str, i4, -1);
                        }
                        if (i == -1) {
                        }
                    } else if (i4 > 0) {
                        i = Character.offsetByCodePoints(str, i4, -1);
                        if (i == -1) {
                            return null;
                        }
                        return new DeleteSurroundingTextCommand(((int) (textFieldPreparedSelection.gmXBnHsR2YSm & 4294967295L)) - i, 0);
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case 3:
                TextFieldPreparedSelection textFieldPreparedSelection2 = (TextFieldPreparedSelection) obj;
                String str2 = textFieldPreparedSelection2.i7xAcZoXXiIt.b41X89IqSbKt;
                long j2 = textFieldPreparedSelection2.gmXBnHsR2YSm;
                int i5 = TextRange.ra306ClFT3HT;
                int yzPsTade5rL7D3 = StringHelpers_androidKt.yzPsTade5rL7D3(str2, (int) (j2 & 4294967295L));
                if (yzPsTade5rL7D3 != -1) {
                    return new DeleteSurroundingTextCommand(0, yzPsTade5rL7D3 - ((int) (textFieldPreparedSelection2.gmXBnHsR2YSm & 4294967295L)));
                }
                return null;
            case 4:
                TextFieldPreparedSelection textFieldPreparedSelection3 = (TextFieldPreparedSelection) obj;
                Integer oyjLVtGms9eZwJ0 = textFieldPreparedSelection3.oyjLVtGms9eZwJ0();
                if (oyjLVtGms9eZwJ0 == null) {
                    return null;
                }
                int intValue = oyjLVtGms9eZwJ0.intValue();
                long j3 = textFieldPreparedSelection3.gmXBnHsR2YSm;
                int i6 = TextRange.ra306ClFT3HT;
                return new DeleteSurroundingTextCommand(((int) (j3 & 4294967295L)) - intValue, 0);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                TextFieldPreparedSelection textFieldPreparedSelection4 = (TextFieldPreparedSelection) obj;
                Integer ra306ClFT3HT3 = textFieldPreparedSelection4.ra306ClFT3HT();
                if (ra306ClFT3HT3 == null) {
                    return null;
                }
                int intValue2 = ra306ClFT3HT3.intValue();
                long j4 = textFieldPreparedSelection4.gmXBnHsR2YSm;
                int i7 = TextRange.ra306ClFT3HT;
                return new DeleteSurroundingTextCommand(0, intValue2 - ((int) (j4 & 4294967295L)));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                TextFieldPreparedSelection textFieldPreparedSelection5 = (TextFieldPreparedSelection) obj;
                Integer hRNgd2zGCE5kj = textFieldPreparedSelection5.hRNgd2zGCE5kj();
                if (hRNgd2zGCE5kj == null) {
                    return null;
                }
                int intValue3 = hRNgd2zGCE5kj.intValue();
                long j5 = textFieldPreparedSelection5.gmXBnHsR2YSm;
                int i8 = TextRange.ra306ClFT3HT;
                return new DeleteSurroundingTextCommand(((int) (j5 & 4294967295L)) - intValue3, 0);
            case 7:
                TextFieldPreparedSelection textFieldPreparedSelection6 = (TextFieldPreparedSelection) obj;
                Integer yzPsTade5rL7D32 = textFieldPreparedSelection6.yzPsTade5rL7D3();
                if (yzPsTade5rL7D32 == null) {
                    return null;
                }
                int intValue4 = yzPsTade5rL7D32.intValue();
                long j6 = textFieldPreparedSelection6.gmXBnHsR2YSm;
                int i9 = TextRange.ra306ClFT3HT;
                return new DeleteSurroundingTextCommand(0, intValue4 - ((int) (j6 & 4294967295L)));
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                Orientation orientation = ((Boolean) obj2).booleanValue() ? Orientation.oyjLVtGms9eZwJ0 : Orientation.b41X89IqSbKt;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new TextFieldScrollerPosition(orientation, ((Float) obj3).floatValue());
            case 9:
                return Boolean.valueOf(((Rect) obj) == null);
            case 10:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.yzPsTade5rL7D3;
                Boolean bool = Boolean.FALSE;
                AnnotatedString annotatedString = ((!Intrinsics.yzPsTade5rL7D3(obj4, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj4 != null) ? (AnnotatedString) saverKt$Saver$1.hRNgd2zGCE5kj.uypNJrpDByoB(obj4) : null;
                annotatedString.getClass();
                Object obj5 = list2.get(1);
                int i10 = TextRange.ra306ClFT3HT;
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.GiTAvmtrM6Bh8SJ;
                TextRange textRange = ((!Intrinsics.yzPsTade5rL7D3(obj5, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextRange) saverKt$Saver$12.hRNgd2zGCE5kj.uypNJrpDByoB(obj5) : null;
                textRange.getClass();
                return new TextFieldValue(annotatedString, textRange.yzPsTade5rL7D3, (TextRange) null);
            case 11:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsProperties.b41X89IqSbKt, unit);
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT COUNT(*) FROM tips");
                try {
                    int i11 = rw91HsWWsh17Nm.ainHcH9lkbxnI() ? (int) rw91HsWWsh17Nm.getLong(0) : 0;
                    rw91HsWWsh17Nm.close();
                    return Integer.valueOf(i11);
                } finally {
                }
            case 13:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                rw91HsWWsh17Nm = sQLiteConnection2.rw91HsWWsh17Nm("SELECT * FROM tips ORDER BY title ASC");
                try {
                    int ra306ClFT3HT4 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT5 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "title");
                    int ra306ClFT3HT6 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "content");
                    int ra306ClFT3HT7 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT8 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_favorite");
                    ArrayList arrayList = new ArrayList();
                    while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        arrayList.add(new TipEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT4), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT5), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT6), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT7), ((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT8)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 14:
                TipEntity tipEntity = (TipEntity) obj;
                tipEntity.getClass();
                return Long.valueOf(tipEntity.yzPsTade5rL7D3);
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                List list3 = (List) obj;
                return new TopAppBarState(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue(), ((Number) list3.get(2)).floatValue());
            case 16:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                sQLiteStatement.getClass();
                return Boolean.valueOf(sQLiteStatement.ainHcH9lkbxnI());
            case 17:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                return Boolean.valueOf(pointerInputChange.oyjLVtGms9eZwJ0 && pointerInputChange.Uo5pffGf8LUU);
            case 18:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
                long j7 = seekableTransitionState.gmXBnHsR2YSm;
                SnapshotStateObserver snapshotStateObserver = seekableTransitionState.Uo5pffGf8LUU;
                if (snapshotStateObserver != null) {
                    snapshotStateObserver.b41X89IqSbKt(seekableTransitionState, TransitionKt.yzPsTade5rL7D3, seekableTransitionState.i7xAcZoXXiIt);
                }
                long j8 = seekableTransitionState.gmXBnHsR2YSm;
                if (j7 != j8) {
                    SeekableTransitionState.SeekingAnimationState seekingAnimationState = seekableTransitionState.NIabVTHf6LMJyXq;
                    if (seekingAnimationState != null) {
                        if (seekingAnimationState.yzPsTade5rL7D3 > j8) {
                            seekableTransitionState.kSPEzfraxudm4i();
                        } else {
                            seekingAnimationState.i7xAcZoXXiIt = j8;
                            if (seekingAnimationState.hRNgd2zGCE5kj == null) {
                                seekingAnimationState.Uo5pffGf8LUU = MathKt.ra306ClFT3HT((1.0d - seekingAnimationState.b41X89IqSbKt.yzPsTade5rL7D3(0)) * seekableTransitionState.gmXBnHsR2YSm);
                            }
                        }
                    } else if (j8 != 0) {
                        seekableTransitionState.NIabVTHf6LMJyXq();
                    }
                }
                return unit;
            case 19:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                sQLiteStatement2.getClass();
                SetBuilder setBuilder = new SetBuilder();
                while (sQLiteStatement2.ainHcH9lkbxnI()) {
                    setBuilder.add(Integer.valueOf((int) sQLiteStatement2.getLong(0)));
                }
                return SetsKt.yzPsTade5rL7D3(setBuilder);
            case 20:
                ((KTypeProjection) obj).getClass();
                return "*";
            case 21:
                return new AnimationVector1D(((Float) obj).floatValue());
            case 22:
                return new AnimationVector1D(((Integer) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((AnimationVector1D) obj).yzPsTade5rL7D3);
            case 24:
                return new AnimationVector1D(((Dp) obj).oyjLVtGms9eZwJ0);
            case 25:
                return new Dp(((AnimationVector1D) obj).yzPsTade5rL7D3);
            case 26:
                DpOffset dpOffset = (DpOffset) obj;
                return new AnimationVector2D(DpOffset.yzPsTade5rL7D3(dpOffset.yzPsTade5rL7D3), DpOffset.hRNgd2zGCE5kj(dpOffset.yzPsTade5rL7D3));
            case 27:
                AnimationVector2D animationVector2D = (AnimationVector2D) obj;
                return new DpOffset((Float.floatToRawIntBits(animationVector2D.yzPsTade5rL7D3) << 32) | (Float.floatToRawIntBits(animationVector2D.hRNgd2zGCE5kj) & 4294967295L));
            case 28:
                Size size = (Size) obj;
                return new AnimationVector2D(Float.intBitsToFloat((int) (size.yzPsTade5rL7D3 >> 32)), Float.intBitsToFloat((int) (size.yzPsTade5rL7D3 & 4294967295L)));
            default:
                AnimationVector2D animationVector2D2 = (AnimationVector2D) obj;
                return new Size((Float.floatToRawIntBits(animationVector2D2.yzPsTade5rL7D3) << 32) | (Float.floatToRawIntBits(animationVector2D2.hRNgd2zGCE5kj) & 4294967295L));
        }
    }

    public /* synthetic */ j7(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
