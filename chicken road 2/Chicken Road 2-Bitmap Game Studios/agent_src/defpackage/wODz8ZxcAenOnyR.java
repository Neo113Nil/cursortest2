package defpackage;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavArgument;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.door.brass.knob.ui.navigation.BottomNavItem;
import com.door.brass.knob.ui.navigation.ComposableSingletons$AppNavigationKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class wODz8ZxcAenOnyR implements Function1 {
    public final /* synthetic */ NavHostController b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ wODz8ZxcAenOnyR(NavHostController navHostController, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = navHostController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        NavHostController navHostController = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                navHostController.yzPsTade5rL7D3(OcGJUxcOVecQiKb.FsuUJlzzWhYnMlD("menu_detail/", ((Long) obj).longValue()), new MCcLy95b8Awzmw(7));
                break;
            case 1:
                String str = "menu_detail/" + ((Long) obj).longValue();
                navHostController.getClass();
                navHostController.hRNgd2zGCE5kj.kSPEzfraxudm4i(str, null);
                break;
            default:
                NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                navGraphBuilder.getClass();
                NavGraphBuilderKt.yzPsTade5rL7D3(navGraphBuilder, "splash", null, new ComposableLambdaImpl(1366627730, new rw91HsWWsh17Nm(1, navHostController), true), 254);
                NavGraphBuilderKt.yzPsTade5rL7D3(navGraphBuilder, BottomNavItem.i7xAcZoXXiIt.oyjLVtGms9eZwJ0, null, new ComposableLambdaImpl(-1022587269, new rw91HsWWsh17Nm(2, navHostController), true), 254);
                NavGraphBuilderKt.yzPsTade5rL7D3(navGraphBuilder, BottomNavItem.Uo5pffGf8LUU.oyjLVtGms9eZwJ0, null, ComposableSingletons$AppNavigationKt.yzPsTade5rL7D3, 254);
                NavGraphBuilderKt.yzPsTade5rL7D3(navGraphBuilder, BottomNavItem.FsuUJlzzWhYnMlD.oyjLVtGms9eZwJ0, null, ComposableSingletons$AppNavigationKt.hRNgd2zGCE5kj, 254);
                new NavArgumentBuilder();
                NavGraphBuilderKt.yzPsTade5rL7D3(navGraphBuilder, "menu_detail/{id}", CollectionsKt.o4ticBN7g1K8jE(new NamedNavArgument(new NavArgument(NavType.hRNgd2zGCE5kj))), new ComposableLambdaImpl(-1770856360, new rw91HsWWsh17Nm(0, navHostController), true), 252);
                break;
        }
        return unit;
    }
}
