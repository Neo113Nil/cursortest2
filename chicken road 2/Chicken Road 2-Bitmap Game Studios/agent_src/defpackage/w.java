package defpackage;

import androidx.activity.ComponentActivity;
import com.door.brass.knob.Hilt_MainActivity;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ Hilt_MainActivity b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ w(Hilt_MainActivity hilt_MainActivity, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = hilt_MainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        Hilt_MainActivity hilt_MainActivity = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ComponentActivity.MRfxZSx8l5UG62U(hilt_MainActivity);
                break;
            default:
                int i2 = ComponentActivity.XrorSzThrtvJ4A;
                hilt_MainActivity.invalidateOptionsMenu();
                break;
        }
    }
}
