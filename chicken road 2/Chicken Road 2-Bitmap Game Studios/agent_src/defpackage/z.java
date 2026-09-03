package defpackage;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements LifecycleEventObserver {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ z(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void yRx9jbDCTnXb3(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = this.oyjLVtGms9eZwJ0;
        Object obj = this.gmXBnHsR2YSm;
        Object obj2 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj2;
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.XrorSzThrtvJ4A;
                if (event == Lifecycle.Event.ON_CREATE) {
                    onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    onBackPressedDispatcher.oyjLVtGms9eZwJ0(onBackInvokedDispatcher);
                    break;
                }
                break;
            default:
                MutableState mutableState = (MutableState) obj;
                if (event == ((Lifecycle.Event) obj2)) {
                    ((Function0) mutableState.getOyjLVtGms9eZwJ0()).hRNgd2zGCE5kj();
                    break;
                }
                break;
        }
    }
}
