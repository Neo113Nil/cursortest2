package Ve;

import android.app.Dialog;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.input.CounterView;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class D5 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public Zo f28832a;

    /* renamed from: b, reason: collision with root package name */
    public long f28833b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f28832a != null) {
            float[] fArr = event.values;
            float f7 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f12 * f12) + (f11 * f11) + (f7 * f7))) > 2.7f) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f28833b + CounterView.COUNTER_MAX_DEFAULT > currentTimeMillis) {
                    return;
                }
                this.f28833b = currentTimeMillis;
                Zo zo = this.f28832a;
                Intrinsics.f(zo);
                Mq mq = zo.f30617a;
                Dialog dialog = mq.f29501j;
                if (dialog != null) {
                    if (!dialog.isShowing()) {
                        dialog.show();
                    }
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    Dialog dialog2 = new Dialog(mq.requireContext(), R.style.SpayLoggerDialog);
                    dialog2.requestWindowFeature(1);
                    dialog2.setCancelable(false);
                    dialog2.setContentView(R.layout.spay_layout_logger_dialog);
                    ((CardView) dialog2.findViewById(R.id.show_logger)).setOnClickListener(new Lq(0, mq, dialog2));
                    ((CardView) dialog2.findViewById(R.id.send_logger_file)).setOnClickListener(new IK.a(2, mq, dialog2));
                    dialog2.setCanceledOnTouchOutside(true);
                    dialog2.show();
                    mq.f29501j = dialog2;
                }
                Toast.makeText(mq.requireContext(), "Shake", 0).show();
            }
        }
    }
}
