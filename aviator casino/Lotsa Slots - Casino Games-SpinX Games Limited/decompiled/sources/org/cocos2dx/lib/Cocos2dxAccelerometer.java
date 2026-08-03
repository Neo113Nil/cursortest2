package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxAccelerometer implements android.hardware.SensorEventListener {
    private static final java.lang.String TAG = "Cocos2dxAccelerometer";
    private final android.hardware.Sensor mAccelerometer;
    private final android.content.Context mContext;
    private final int mNaturalOrientation;
    private final android.hardware.SensorManager mSensorManager;

    public static native void onSensorChanged(float f, float f2, float f3, long j);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    public Cocos2dxAccelerometer(android.content.Context context) {
        this.mContext = context;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        this.mNaturalOrientation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public void enable() {
        this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
    }

    public void setInterval(float f) {
        this.mSensorManager.registerListener(this, this.mAccelerometer, (int) (f * 100000.0f));
    }

    public void disable() {
        this.mSensorManager.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2];
        int i = this.mContext.getResources().getConfiguration().orientation;
        if (i == 2 && this.mNaturalOrientation != 0) {
            float f4 = -f2;
            f2 = f;
            f = f4;
        } else if (i == 1 && this.mNaturalOrientation != 0) {
            f2 = -f;
            f = f2;
        }
        org.cocos2dx.lib.Cocos2dxGLSurfaceView.queueAccelerometer(f, f2, f3, sensorEvent.timestamp);
    }
}
