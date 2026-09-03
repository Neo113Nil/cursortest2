package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import com.door.brass.knob.ui.menu.MenuScreenKt;
import com.door.brass.knob.ui.menudetail.MenuDetailScreenKt;
import com.door.brass.knob.ui.navigation.BottomNavItem;
import com.door.brass.knob.ui.splash.SplashScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class rw91HsWWsh17Nm implements Function4 {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ rw91HsWWsh17Nm(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object o2t7oodqU1bUMaS(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.oyjLVtGms9eZwJ0;
        final int i2 = 1;
        Unit unit = Unit.yzPsTade5rL7D3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.yzPsTade5rL7D3;
        Object obj5 = this.b41X89IqSbKt;
        final int i3 = 0;
        switch (i) {
            case 0:
                final NavHostController navHostController = (NavHostController) obj5;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                boolean NIabVTHf6LMJyXq = composer.NIabVTHf6LMJyXq(navHostController);
                Object UEutaskTsxaI = composer.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq || UEutaskTsxaI == composer$Companion$Empty$1) {
                    UEutaskTsxaI = new Function0() { // from class: gmRuTs2er1bFQ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object hRNgd2zGCE5kj() {
                            int i4 = i2;
                            Unit unit2 = Unit.yzPsTade5rL7D3;
                            NavHostController navHostController2 = navHostController;
                            switch (i4) {
                                case 0:
                                    navHostController2.yzPsTade5rL7D3(BottomNavItem.i7xAcZoXXiIt.oyjLVtGms9eZwJ0, new MCcLy95b8Awzmw(8));
                                    break;
                                default:
                                    navHostController2.hRNgd2zGCE5kj();
                                    break;
                            }
                            return unit2;
                        }
                    };
                    composer.Yey4RyhSyBRHub(UEutaskTsxaI);
                }
                Function0 function0 = (Function0) UEutaskTsxaI;
                boolean NIabVTHf6LMJyXq2 = composer.NIabVTHf6LMJyXq(navHostController);
                Object UEutaskTsxaI2 = composer.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq2 || UEutaskTsxaI2 == composer$Companion$Empty$1) {
                    UEutaskTsxaI2 = new wODz8ZxcAenOnyR(navHostController, i3);
                    composer.Yey4RyhSyBRHub(UEutaskTsxaI2);
                }
                MenuDetailScreenKt.yzPsTade5rL7D3(function0, (Function1) UEutaskTsxaI2, null, composer, 0);
                return unit;
            case 1:
                final NavHostController navHostController2 = (NavHostController) obj5;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                boolean NIabVTHf6LMJyXq3 = composer2.NIabVTHf6LMJyXq(navHostController2);
                Object UEutaskTsxaI3 = composer2.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq3 || UEutaskTsxaI3 == composer$Companion$Empty$1) {
                    UEutaskTsxaI3 = new Function0() { // from class: gmRuTs2er1bFQ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object hRNgd2zGCE5kj() {
                            int i4 = i3;
                            Unit unit2 = Unit.yzPsTade5rL7D3;
                            NavHostController navHostController22 = navHostController2;
                            switch (i4) {
                                case 0:
                                    navHostController22.yzPsTade5rL7D3(BottomNavItem.i7xAcZoXXiIt.oyjLVtGms9eZwJ0, new MCcLy95b8Awzmw(8));
                                    break;
                                default:
                                    navHostController22.hRNgd2zGCE5kj();
                                    break;
                            }
                            return unit2;
                        }
                    };
                    composer2.Yey4RyhSyBRHub(UEutaskTsxaI3);
                }
                SplashScreenKt.ra306ClFT3HT((Function0) UEutaskTsxaI3, null, composer2, 0);
                return unit;
            case 2:
                NavHostController navHostController3 = (NavHostController) obj5;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                boolean NIabVTHf6LMJyXq4 = composer3.NIabVTHf6LMJyXq(navHostController3);
                Object UEutaskTsxaI4 = composer3.UEutaskTsxaI();
                if (NIabVTHf6LMJyXq4 || UEutaskTsxaI4 == composer$Companion$Empty$1) {
                    UEutaskTsxaI4 = new wODz8ZxcAenOnyR(navHostController3, i2);
                    composer3.Yey4RyhSyBRHub(UEutaskTsxaI4);
                }
                MenuScreenKt.hRNgd2zGCE5kj((Function1) UEutaskTsxaI4, null, composer3, 0);
                return unit;
            default:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                String[] strArr = FrameworkSQLiteDatabase.b41X89IqSbKt;
                sQLiteQuery.getClass();
                ((SupportSQLiteQuery) obj5).hRNgd2zGCE5kj(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
        }
    }
}
