package defpackage;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.os.internal.SavedStateRegistryImpl;
import com.door.brass.knob.Hilt_MainActivity;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class GiTAvmtrM6Bh8SJ implements LifecycleEventObserver {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ GiTAvmtrM6Bh8SJ(int i, Object obj) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void yRx9jbDCTnXb3(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 0;
        Object obj = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Function1) obj).uypNJrpDByoB(event);
                break;
            case 1:
                Hilt_MainActivity hilt_MainActivity = (Hilt_MainActivity) obj;
                int i3 = ComponentActivity.XrorSzThrtvJ4A;
                if (event == Lifecycle.Event.ON_STOP && (window = hilt_MainActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 2:
                NavControllerImpl navControllerImpl = (NavControllerImpl) obj;
                navControllerImpl.MCcLy95b8Awzmw = event.yzPsTade5rL7D3();
                if (navControllerImpl.ra306ClFT3HT != null) {
                    ArrayList NIQ0uGqrgooN = CollectionsKt.NIQ0uGqrgooN(navControllerImpl.gmXBnHsR2YSm);
                    int size = NIQ0uGqrgooN.size();
                    while (i2 < size) {
                        Object obj2 = NIQ0uGqrgooN.get(i2);
                        i2++;
                        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                        navBackStackEntry.getClass();
                        NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.MRfxZSx8l5UG62U;
                        navBackStackEntryImpl.getClass();
                        navBackStackEntryImpl.yzPsTade5rL7D3.i7xAcZoXXiIt = event.yzPsTade5rL7D3();
                        navBackStackEntryImpl.oyjLVtGms9eZwJ0 = event.yzPsTade5rL7D3();
                        navBackStackEntryImpl.ra306ClFT3HT();
                    }
                    break;
                }
                break;
            case 3:
                SavedStateRegistryImpl savedStateRegistryImpl = (SavedStateRegistryImpl) obj;
                if (event != Lifecycle.Event.ON_START) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        savedStateRegistryImpl.Uo5pffGf8LUU = false;
                        break;
                    }
                } else {
                    savedStateRegistryImpl.Uo5pffGf8LUU = true;
                    break;
                }
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.gmXBnHsR2YSm();
                    break;
                }
                break;
        }
    }
}
