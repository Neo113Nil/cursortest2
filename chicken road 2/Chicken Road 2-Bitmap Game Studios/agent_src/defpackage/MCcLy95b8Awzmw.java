package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.ContentObserver;
import android.provider.Settings;
import android.util.Log;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ContentResolverForSecureTextField;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.data.repository.ChallengeProgressTracker;
import com.door.brass.knob.ui.navigation.BottomNavItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class MCcLy95b8Awzmw implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ MCcLy95b8Awzmw(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        SQLiteStatement rw91HsWWsh17Nm;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                Modifier modifier = AccessibilityUtilKt.yzPsTade5rL7D3;
                return unit;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                TweenSpec tweenSpec = AnchoredDraggableDefaults.yzPsTade5rL7D3;
                return Float.valueOf(floatValue / 2.0f);
            case 3:
                MCcLy95b8Awzmw mCcLy95b8Awzmw = AnchoredDraggableKt.yzPsTade5rL7D3;
                return Boolean.TRUE;
            case 4:
                ((Integer) obj).getClass();
                MCcLy95b8Awzmw mCcLy95b8Awzmw2 = AnchoredDraggableKt.yzPsTade5rL7D3;
                return Float.valueOf(Float.NaN);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                AnnotatedString annotatedString = AnnotatedStringKt.yzPsTade5rL7D3;
                return Boolean.valueOf(!(((AnnotatedString.Annotation) obj) instanceof ParagraphStyle));
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                navOptionsBuilder.yzPsTade5rL7D3(BottomNavItem.i7xAcZoXXiIt.oyjLVtGms9eZwJ0);
                navOptionsBuilder.oyjLVtGms9eZwJ0 = -1;
                PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
                popUpToBuilder.hRNgd2zGCE5kj = true;
                navOptionsBuilder.gmXBnHsR2YSm = popUpToBuilder.yzPsTade5rL7D3;
                navOptionsBuilder.i7xAcZoXXiIt = true;
                navOptionsBuilder.hRNgd2zGCE5kj = true;
                navOptionsBuilder.ra306ClFT3HT = true;
                return unit;
            case 7:
                NavOptionsBuilder navOptionsBuilder2 = (NavOptionsBuilder) obj;
                navOptionsBuilder2.getClass();
                navOptionsBuilder2.yzPsTade5rL7D3("menu_detail/{id}");
                navOptionsBuilder2.oyjLVtGms9eZwJ0 = -1;
                PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
                popUpToBuilder2.yzPsTade5rL7D3 = true;
                navOptionsBuilder2.gmXBnHsR2YSm = true;
                navOptionsBuilder2.i7xAcZoXXiIt = popUpToBuilder2.hRNgd2zGCE5kj;
                return unit;
            case 8:
                NavOptionsBuilder navOptionsBuilder3 = (NavOptionsBuilder) obj;
                navOptionsBuilder3.getClass();
                navOptionsBuilder3.yzPsTade5rL7D3("splash");
                navOptionsBuilder3.oyjLVtGms9eZwJ0 = -1;
                PopUpToBuilder popUpToBuilder3 = new PopUpToBuilder();
                popUpToBuilder3.yzPsTade5rL7D3 = true;
                navOptionsBuilder3.gmXBnHsR2YSm = true;
                navOptionsBuilder3.i7xAcZoXXiIt = popUpToBuilder3.hRNgd2zGCE5kj;
                navOptionsBuilder3.hRNgd2zGCE5kj = true;
                return unit;
            case 9:
                RulerScope rulerScope = (RulerScope) obj;
                rulerScope.s(BadgeKt.hRNgd2zGCE5kj, (int) (rulerScope.FDldM9f5nIw0kSj().ra306ClFT3HT() >> 32));
                rulerScope.s(BadgeKt.yzPsTade5rL7D3, 0.0f);
                return unit;
            case 10:
                final ContentResolver contentResolver = ((Context) obj).getContentResolver();
                return new ContentResolverForSecureTextField() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1
                    @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
                    public final void unregisterContentObserver(ContentObserver contentObserver) {
                        contentResolver.unregisterContentObserver(contentObserver);
                    }

                    @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
                    public final boolean yzPsTade5rL7D3() {
                        try {
                            return Settings.System.getInt(contentResolver, "show_password") > 0;
                        } catch (Exception e) {
                            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
                            return true;
                        }
                    }
                };
            case 11:
                TextFieldDecorator textFieldDecorator = BasicTextFieldKt.yzPsTade5rL7D3;
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 13:
                ((ContentDrawScope) obj).N();
                return unit;
            case 14:
                ComputedProvidableCompositionLocal computedProvidableCompositionLocal = BringIntoViewSpec_androidKt.yzPsTade5rL7D3;
                if (((Context) ((CompositionLocalAccessorScope) obj).pu0JZhzR2Or6(AndroidCompositionLocals_androidKt.hRNgd2zGCE5kj)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return BringIntoViewSpec_androidKt.hRNgd2zGCE5kj;
                }
                BringIntoViewSpec.yzPsTade5rL7D3.getClass();
                return BringIntoViewSpec.Companion.ra306ClFT3HT;
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                SemanticsPropertiesKt.MRfxZSx8l5UG62U((SemanticsPropertyReceiver) obj, 0);
                return unit;
            case 16:
                ((ContentDrawScope) obj).N();
                return unit;
            case 17:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new CarouselPagerState(intValue, ((Float) obj3).floatValue(), new c(0, list));
            case 18:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                obj4.getClass();
                int intValue2 = ((Integer) obj4).intValue();
                Object obj5 = list2.get(1);
                obj5.getClass();
                float floatValue2 = ((Float) obj5).floatValue();
                c cVar = new c(1, list2);
                CarouselState carouselState = new CarouselState();
                carouselState.yzPsTade5rL7D3 = new CarouselPagerState(intValue2, floatValue2, cVar);
                return carouselState;
            case 19:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT * FROM challenges ORDER BY title ASC");
                try {
                    int ra306ClFT3HT = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT2 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "title");
                    int ra306ClFT3HT3 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "description");
                    int ra306ClFT3HT4 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT5 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "target_count");
                    int ra306ClFT3HT6 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "current_progress");
                    int ra306ClFT3HT7 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_completed");
                    int ra306ClFT3HT8 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "completed_at");
                    ArrayList arrayList = new ArrayList();
                    while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        long j = rw91HsWWsh17Nm.getLong(ra306ClFT3HT);
                        String MCcLy95b8Awzmw = rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT2);
                        String MCcLy95b8Awzmw2 = rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT3);
                        String MCcLy95b8Awzmw3 = rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT4);
                        int i2 = ra306ClFT3HT5;
                        int i3 = ra306ClFT3HT4;
                        int i4 = ra306ClFT3HT6;
                        arrayList.add(new ChallengeEntity(j, MCcLy95b8Awzmw, MCcLy95b8Awzmw2, MCcLy95b8Awzmw3, (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT5), (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT6), ((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT7)) != 0, rw91HsWWsh17Nm.isNull(ra306ClFT3HT8) ? null : Long.valueOf(rw91HsWWsh17Nm.getLong(ra306ClFT3HT8))));
                        ra306ClFT3HT6 = i4;
                        ra306ClFT3HT5 = i2;
                        ra306ClFT3HT4 = i3;
                    }
                    return arrayList;
                } finally {
                }
            case 20:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                rw91HsWWsh17Nm = sQLiteConnection2.rw91HsWWsh17Nm("SELECT * FROM challenges WHERE is_completed = 0 ORDER BY title ASC");
                try {
                    int ra306ClFT3HT9 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT10 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "title");
                    int ra306ClFT3HT11 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "description");
                    int ra306ClFT3HT12 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT13 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "target_count");
                    int ra306ClFT3HT14 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "current_progress");
                    int ra306ClFT3HT15 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "is_completed");
                    int ra306ClFT3HT16 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "completed_at");
                    ArrayList arrayList2 = new ArrayList();
                    while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        arrayList2.add(new ChallengeEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT9), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT10), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT11), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT12), (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT13), (int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT14), ((int) rw91HsWWsh17Nm.getLong(ra306ClFT3HT15)) != 0, rw91HsWWsh17Nm.isNull(ra306ClFT3HT16) ? null : Long.valueOf(rw91HsWWsh17Nm.getLong(ra306ClFT3HT16))));
                    }
                    return arrayList2;
                } finally {
                }
            case 21:
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                rw91HsWWsh17Nm = sQLiteConnection3.rw91HsWWsh17Nm("SELECT COUNT(*) FROM challenges");
                try {
                    int i5 = rw91HsWWsh17Nm.ainHcH9lkbxnI() ? (int) rw91HsWWsh17Nm.getLong(0) : 0;
                    rw91HsWWsh17Nm.close();
                    return Integer.valueOf(i5);
                } finally {
                }
            case 22:
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                Map map = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity.ra306ClFT3HT, "Tarts"));
            case 23:
                MenuItemEntity menuItemEntity2 = (MenuItemEntity) obj;
                Map map2 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity2.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity2.ra306ClFT3HT, "Cakes"));
            case 24:
                MenuItemEntity menuItemEntity3 = (MenuItemEntity) obj;
                Map map3 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity3.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity3.ra306ClFT3HT, "Pastries"));
            case 25:
                MenuItemEntity menuItemEntity4 = (MenuItemEntity) obj;
                Map map4 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity4.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity4.ra306ClFT3HT, "Cookies"));
            case 26:
                MenuItemEntity menuItemEntity5 = (MenuItemEntity) obj;
                Map map5 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity5.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity5.hRNgd2zGCE5kj, "Classic Lemon Meringue Tart"));
            case 27:
                MenuItemEntity menuItemEntity6 = (MenuItemEntity) obj;
                Map map6 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity6.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity6.hRNgd2zGCE5kj, "Opera Meringue Cake"));
            case 28:
                MenuItemEntity menuItemEntity7 = (MenuItemEntity) obj;
                Map map7 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity7.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity7.hRNgd2zGCE5kj, "Mille-Feuille Meringue"));
            default:
                MenuItemEntity menuItemEntity8 = (MenuItemEntity) obj;
                Map map8 = ChallengeProgressTracker.ra306ClFT3HT;
                menuItemEntity8.getClass();
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3(menuItemEntity8.ra306ClFT3HT, "Beverages"));
        }
    }
}
