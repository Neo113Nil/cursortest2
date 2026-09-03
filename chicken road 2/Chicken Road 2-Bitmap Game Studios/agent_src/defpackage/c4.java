package defpackage;

import android.content.Context;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavController$onBackPressedCallback$1;
import androidx.navigation.NavGraph;
import androidx.navigation.NavInflater;
import androidx.navigation.NavigatorProvider;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements Function0 {
    public final /* synthetic */ NavController b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ c4(NavController navController, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = navController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i;
        int i2 = this.oyjLVtGms9eZwJ0;
        NavController navController = this.b41X89IqSbKt;
        switch (i2) {
            case 0:
                NavController$onBackPressedCallback$1 navController$onBackPressedCallback$1 = navController.gmXBnHsR2YSm;
                boolean z = false;
                if (navController.i7xAcZoXXiIt) {
                    ArrayDeque arrayDeque = navController.hRNgd2zGCE5kj.gmXBnHsR2YSm;
                    if (arrayDeque == null || !arrayDeque.isEmpty()) {
                        Iterator<E> it = arrayDeque.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((NavBackStackEntry) it.next()).b41X89IqSbKt instanceof NavGraph) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                navController$onBackPressedCallback$1.b41X89IqSbKt(z);
                return Unit.yzPsTade5rL7D3;
            default:
                Context context = navController.yzPsTade5rL7D3;
                NavigatorProvider navigatorProvider = navController.hRNgd2zGCE5kj.exVmIuryuB8HeQ;
                context.getClass();
                navigatorProvider.getClass();
                return new NavInflater();
        }
    }
}
