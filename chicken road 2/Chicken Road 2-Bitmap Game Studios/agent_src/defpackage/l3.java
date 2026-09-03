package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.KeyModifiers;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavControllerViewModelKt;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.internal.NavGraphImpl;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import com.door.brass.knob.ui.menu.MenuViewModel;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class l3 implements Function1 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        SQLiteStatement rw91HsWWsh17Nm;
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = Integer.MAX_VALUE;
        Unit unit = Unit.yzPsTade5rL7D3;
        Context context = null;
        switch (i) {
            case 0:
                int i3 = LocalActivityKt.yzPsTade5rL7D3;
                Context context2 = (Context) ((CompositionLocalAccessorScope) obj).pu0JZhzR2Or6(AndroidCompositionLocals_androidKt.hRNgd2zGCE5kj);
                while (true) {
                    if (context2 instanceof ContextWrapper) {
                        if (context2 instanceof Activity) {
                            context = context2;
                        } else {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            case 1:
                ((Long) obj).getClass();
                return unit;
            case 2:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT COUNT(*) FROM menu_items");
                try {
                    int i4 = rw91HsWWsh17Nm.ainHcH9lkbxnI() ? (int) rw91HsWWsh17Nm.getLong(0) : 0;
                    rw91HsWWsh17Nm.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 3:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                rw91HsWWsh17Nm = sQLiteConnection2.rw91HsWWsh17Nm("SELECT * FROM menu_items ORDER BY name ASC");
                try {
                    int ra306ClFT3HT = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "id");
                    int ra306ClFT3HT2 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "name");
                    int ra306ClFT3HT3 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "category");
                    int ra306ClFT3HT4 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "description");
                    int ra306ClFT3HT5 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "ingredients");
                    int ra306ClFT3HT6 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "sweetness");
                    int ra306ClFT3HT7 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "texture");
                    int ra306ClFT3HT8 = SQLiteStatementUtil.ra306ClFT3HT(rw91HsWWsh17Nm, "tags");
                    ArrayList arrayList = new ArrayList();
                    while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                        arrayList.add(new MenuItemEntity(rw91HsWWsh17Nm.getLong(ra306ClFT3HT), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT2), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT3), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT4), rw91HsWWsh17Nm.isNull(ra306ClFT3HT5) ? null : rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT5), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT6), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT7), rw91HsWWsh17Nm.MCcLy95b8Awzmw(ra306ClFT3HT8)));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
                menuItemEntity.getClass();
                return Long.valueOf(menuItemEntity.yzPsTade5rL7D3);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((String) obj).getClass();
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                MenuItemEntity menuItemEntity2 = (MenuItemEntity) obj;
                menuItemEntity2.getClass();
                String str = menuItemEntity2.gmXBnHsR2YSm;
                switch (str.hashCode()) {
                    case 80297680:
                        if (str.equals("Sweet")) {
                            i2 = 2;
                            break;
                        }
                        break;
                    case 237509510:
                        if (str.equals("Very Sweet")) {
                            i2 = 3;
                            break;
                        }
                        break;
                    case 1523855731:
                        if (str.equals("Lightly Sweet")) {
                            i2 = 1;
                            break;
                        }
                        break;
                    case 1798533923:
                        if (str.equals("Not Sweet")) {
                            i2 = 0;
                            break;
                        }
                        break;
                }
                return Integer.valueOf(i2);
            case 7:
                MenuItemEntity menuItemEntity3 = (MenuItemEntity) obj;
                menuItemEntity3.getClass();
                String lowerCase = menuItemEntity3.hRNgd2zGCE5kj.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 8:
                MenuItemEntity menuItemEntity4 = (MenuItemEntity) obj;
                menuItemEntity4.getClass();
                String str2 = menuItemEntity4.i7xAcZoXXiIt;
                switch (str2.hashCode()) {
                    case 65376663:
                        if (str2.equals("Crisp")) {
                            i2 = 0;
                            break;
                        }
                        break;
                    case 67960553:
                        if (str2.equals("Flaky")) {
                            i2 = 2;
                            break;
                        }
                        break;
                    case 68986715:
                        if (str2.equals("Gooey")) {
                            i2 = 4;
                            break;
                        }
                        break;
                    case 2026540119:
                        if (str2.equals("Creamy")) {
                            i2 = 1;
                            break;
                        }
                        break;
                    case 2107367690:
                        if (str2.equals("Fluffy")) {
                            i2 = 3;
                            break;
                        }
                        break;
                }
                return Integer.valueOf(i2);
            case 9:
                MenuItemEntity menuItemEntity5 = (MenuItemEntity) obj;
                menuItemEntity5.getClass();
                String lowerCase2 = menuItemEntity5.hRNgd2zGCE5kj.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                return lowerCase2;
            case 10:
                int i5 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                return Boolean.TRUE;
            case 11:
                SemanticsPropertiesKt.yRx9jbDCTnXb3((SemanticsPropertyReceiver) obj);
                return unit;
            case KeyModifiers.ra306ClFT3HT /* 12 */:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsProperties.ZvpnNpCMEWSR3, unit);
                return unit;
            case 13:
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(paragraphInfo.hRNgd2zGCE5kj);
                sb.append(", ");
                return OcGJUxcOVecQiKb.kSPEzfraxudm4i(sb, paragraphInfo.ra306ClFT3HT, ')');
            case 14:
                return new BackStackEntryIdViewModel(SavedStateHandleSupport.yzPsTade5rL7D3((CreationExtras) obj));
            case WindowInsetsSides.b41X89IqSbKt /* 15 */:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            case 16:
                NavDestination navDestination = (NavDestination) obj;
                navDestination.getClass();
                NavGraph navGraph = navDestination.gmXBnHsR2YSm;
                if (navGraph == null || navGraph.FsuUJlzzWhYnMlD.ra306ClFT3HT != navDestination.b41X89IqSbKt.oyjLVtGms9eZwJ0) {
                    return null;
                }
                return navGraph;
            case 17:
                NavDestination navDestination2 = (NavDestination) obj;
                navDestination2.getClass();
                NavGraph navGraph2 = navDestination2.gmXBnHsR2YSm;
                if (navGraph2 == null || navGraph2.FsuUJlzzWhYnMlD.ra306ClFT3HT != navDestination2.b41X89IqSbKt.oyjLVtGms9eZwJ0) {
                    return null;
                }
                return navGraph2;
            case 18:
                NavDestination navDestination3 = (NavDestination) obj;
                navDestination3.getClass();
                return Integer.valueOf(navDestination3.b41X89IqSbKt.oyjLVtGms9eZwJ0);
            case 19:
                InitializerViewModelFactory initializerViewModelFactory = NavControllerViewModelKt.yzPsTade5rL7D3;
                ((CreationExtras) obj).getClass();
                return new NavControllerViewModel();
            case 20:
                NavDestination navDestination4 = (NavDestination) obj;
                navDestination4.getClass();
                return navDestination4.gmXBnHsR2YSm;
            case 21:
                NavDestination navDestination5 = (NavDestination) obj;
                navDestination5.getClass();
                if (!(navDestination5 instanceof NavGraph)) {
                    return null;
                }
                NavGraphImpl navGraphImpl = ((NavGraph) navDestination5).FsuUJlzzWhYnMlD;
                return navGraphImpl.yzPsTade5rL7D3(navGraphImpl.ra306ClFT3HT);
            case 22:
                NavDestination navDestination6 = ((NavBackStackEntry) ((AnimatedContentTransitionScope) obj).getHRNgd2zGCE5kj()).b41X89IqSbKt;
                navDestination6.getClass();
                int i6 = NavDestination.Uo5pffGf8LUU;
                for (NavDestination navDestination7 : NavDestination.Companion.hRNgd2zGCE5kj((ComposeNavigator.Destination) navDestination6)) {
                }
                return null;
            case 23:
                return EnterExitTransitionKt.oyjLVtGms9eZwJ0(AnimationSpecKt.oyjLVtGms9eZwJ0(700, 6, null), 2);
            case 24:
                return EnterExitTransitionKt.b41X89IqSbKt(AnimationSpecKt.oyjLVtGms9eZwJ0(700, 6, null), 2);
            case 25:
                return ((NavBackStackEntry) obj).FsuUJlzzWhYnMlD;
            case 26:
                throw null;
            case 27:
                throw null;
            case 28:
                throw null;
            default:
                throw null;
        }
    }

    public /* synthetic */ l3(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    public /* synthetic */ l3(MenuViewModel menuViewModel, int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
