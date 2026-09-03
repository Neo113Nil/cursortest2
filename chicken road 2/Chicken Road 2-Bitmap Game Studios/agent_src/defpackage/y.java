package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.navigationevent.DirectNavigationEventInput;
import com.door.brass.knob.Hilt_MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Function0 {
    public final /* synthetic */ Hilt_MainActivity b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ y(Hilt_MainActivity hilt_MainActivity, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = hilt_MainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 0;
        Hilt_MainActivity hilt_MainActivity = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                int i3 = ComponentActivity.XrorSzThrtvJ4A;
                hilt_MainActivity.reportFullyDrawn();
                return Unit.yzPsTade5rL7D3;
            case 1:
                return new FullyDrawnReporter(hilt_MainActivity.FsuUJlzzWhYnMlD, new y(hilt_MainActivity, i2));
            case 2:
                int i4 = ComponentActivity.XrorSzThrtvJ4A;
                DirectNavigationEventInput directNavigationEventInput = new DirectNavigationEventInput();
                hilt_MainActivity.hRNgd2zGCE5kj().hRNgd2zGCE5kj(directNavigationEventInput);
                return directNavigationEventInput;
            case 3:
                int i5 = ComponentActivity.XrorSzThrtvJ4A;
                return new SavedStateViewModelFactory(hilt_MainActivity.getApplication(), hilt_MainActivity, hilt_MainActivity.getIntent() != null ? hilt_MainActivity.getIntent().getExtras() : null);
            default:
                int i6 = ComponentActivity.XrorSzThrtvJ4A;
                OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new w(hilt_MainActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.yzPsTade5rL7D3(Looper.myLooper(), Looper.getMainLooper())) {
                        hilt_MainActivity.oyjLVtGms9eZwJ0.yzPsTade5rL7D3(new z(i2, onBackPressedDispatcher, hilt_MainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new x(i2, hilt_MainActivity, onBackPressedDispatcher));
                    }
                }
                return onBackPressedDispatcher;
        }
    }
}
