package my.com.softspace.sspog.attest;

/* loaded from: classes17.dex */
public class AttestInfo {
    private final my.com.softspace.sspog.attest.ApplicationInfo Camera2StreamConfigurationMap;
    private final my.com.softspace.sspog.attest.HardwareInfo getHighResolutionOutputSizeshNQ4ISI;
    private final my.com.softspace.sspog.attest.SoftwareInfo getHighSpeedVideoFpsRangesFor;
    private final my.com.softspace.sspog.attest.SensorInfo getHighSpeedVideoSizes;

    private AttestInfo(android.content.Context context, boolean z, boolean z2, byte[] bArr, boolean z3) {
        int i;
        android.nfc.NfcAdapter defaultAdapter;
        this.getHighResolutionOutputSizeshNQ4ISI = new my.com.softspace.sspog.attest.HardwareInfo(context);
        this.getHighSpeedVideoFpsRangesFor = new my.com.softspace.sspog.attest.SoftwareInfo(context, z, z2);
        this.Camera2StreamConfigurationMap = new my.com.softspace.sspog.attest.ApplicationInfo(context, bArr, z, z3);
        my.com.softspace.sspog.attest.SensorInfo sensorInfo = new my.com.softspace.sspog.attest.SensorInfo(context);
        this.getHighSpeedVideoSizes = sensorInfo;
        sensorInfo.Camera2StreamConfigurationMap = 0L;
        sensorInfo.getHighSpeedVideoFpsRangesFor = 0L;
        boolean z4 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI == null;
        if (z4) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        }
        java.util.ArrayList<android.hardware.Sensor> arrayList = new java.util.ArrayList();
        android.hardware.Sensor defaultSensor = sensorInfo.getOutputFormats.getDefaultSensor(1);
        if (defaultSensor != null) {
            arrayList.add(defaultSensor);
        }
        android.hardware.Sensor defaultSensor2 = sensorInfo.getOutputFormats.getDefaultSensor(4);
        if (defaultSensor2 != null) {
            arrayList.add(defaultSensor2);
        }
        android.hardware.Sensor defaultSensor3 = sensorInfo.getOutputFormats.getDefaultSensor(9);
        if (defaultSensor3 != null) {
            arrayList.add(defaultSensor3);
        }
        android.hardware.Sensor defaultSensor4 = sensorInfo.getOutputFormats.getDefaultSensor(13);
        if (defaultSensor4 != null) {
            arrayList.add(defaultSensor4);
        }
        android.hardware.Sensor defaultSensor5 = sensorInfo.getOutputFormats.getDefaultSensor(5);
        if (defaultSensor5 != null) {
            arrayList.add(defaultSensor5);
        }
        android.hardware.Sensor defaultSensor6 = sensorInfo.getOutputFormats.getDefaultSensor(10);
        if (defaultSensor6 != null) {
            arrayList.add(defaultSensor6);
        }
        android.hardware.Sensor defaultSensor7 = sensorInfo.getOutputFormats.getDefaultSensor(2);
        if (defaultSensor7 != null) {
            arrayList.add(defaultSensor7);
        }
        android.hardware.Sensor defaultSensor8 = sensorInfo.getOutputFormats.getDefaultSensor(12);
        if (defaultSensor8 != null) {
            arrayList.add(defaultSensor8);
        }
        android.hardware.Sensor defaultSensor9 = sensorInfo.getOutputFormats.getDefaultSensor(6);
        if (defaultSensor9 != null) {
            arrayList.add(defaultSensor9);
        }
        android.hardware.Sensor defaultSensor10 = sensorInfo.getOutputFormats.getDefaultSensor(8);
        if (defaultSensor10 != null) {
            arrayList.add(defaultSensor10);
        }
        android.hardware.Sensor defaultSensor11 = sensorInfo.getOutputFormats.getDefaultSensor(11);
        if (defaultSensor11 != null) {
            arrayList.add(defaultSensor11);
        }
        for (android.hardware.Sensor sensor : arrayList) {
            sensorInfo.Camera2StreamConfigurationMap += sensor.getType();
            if (sensor.getReportingMode() == 2) {
                sensorInfo.getOutputFormats.requestTriggerSensor(sensorInfo, sensor);
            } else {
                sensorInfo.getOutputFormats.registerListener(sensorInfo, sensor, 3, 0);
            }
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("accelerometer") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("accelerometer", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("gyroscope") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("gyroscope", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("ambientTemperature") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("ambientTemperature", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("gravity") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("gravity", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("lightSensor") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("lightSensor", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("linearAcceleration") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("linearAcceleration", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("magneticField") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("magneticField", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("orientation") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("orientation", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("pressure") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("pressure", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("proximity") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("proximity", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("rotationVector") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("rotationVector", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("humidity") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("humidity", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("location") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("location", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("inclination") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("inclination", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("camera_front") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("camera_front", new my.com.softspace.sspog.attest.SensorValuesCamera());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("camera_back") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("camera_back", new my.com.softspace.sspog.attest.SensorValuesCamera());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("nfc") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("nfc", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("bluetooth") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("bluetooth", new my.com.softspace.sspog.attest.SensorValues());
        }
        if (my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("microphone") == null) {
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("microphone", new my.com.softspace.sspog.attest.SensorValues());
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.CountDownLatch andSet = sensorInfo.getHighSpeedVideoSizes.getAndSet(countDownLatch);
        if (andSet != null) {
            andSet.countDown();
        }
        try {
            try {
                countDownLatch.await(z4 ? 1000 : 500, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e) {
                sspog.SimpleLogger.e("SensorInfo", e.getLocalizedMessage(), new java.lang.Object[0]);
            }
            java.util.concurrent.CountDownLatch andSet2 = sensorInfo.getHighSpeedVideoSizes.getAndSet(null);
            if (andSet2 != null) {
                andSet2.countDown();
            }
            my.com.softspace.sspog.attest.SensorValues sensorValues = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("gravity");
            my.com.softspace.sspog.attest.SensorValues sensorValues2 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("magneticField");
            my.com.softspace.sspog.attest.SensorValues sensorValues3 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("orientation");
            my.com.softspace.sspog.attest.SensorValues sensorValues4 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("inclination");
            if (sensorValues != null && sensorValues.getHighSpeedVideoFpsRanges && sensorValues.getHighSpeedVideoSizes != null && !sensorValues.getHighSpeedVideoSizes.isEmpty() && sensorValues2 != null && sensorValues2.getHighSpeedVideoFpsRanges && sensorValues2.getHighSpeedVideoSizes != null && !sensorValues2.getHighSpeedVideoSizes.isEmpty()) {
                float[] fArr = new float[9];
                if (android.hardware.SensorManager.getRotationMatrix(fArr, new float[9], my.com.softspace.sspog.attest.SensorInfo.Camera2StreamConfigurationMap(sensorValues.getHighSpeedVideoSizes), my.com.softspace.sspog.attest.SensorInfo.Camera2StreamConfigurationMap(sensorValues2.getHighSpeedVideoSizes))) {
                    float[] fArr2 = new float[3];
                    android.hardware.SensorManager.getOrientation(fArr, fArr2);
                    if (sensorValues3 != null) {
                        long time = new java.util.Date().getTime();
                        java.lang.String highSpeedVideoFpsRanges = my.com.softspace.sspog.attest.SensorInfo.getHighSpeedVideoFpsRanges(fArr2);
                        sensorValues3.getHighSpeedVideoFpsRanges = true;
                        sensorValues3.Camera2StreamConfigurationMap = 0;
                        sensorValues3.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(time);
                        sensorValues3.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
                    }
                }
                if (sensorValues4 != null) {
                    long time2 = new java.util.Date().getTime();
                    java.lang.String highSpeedVideoFpsRanges2 = my.com.softspace.sspog.attest.SensorInfo.getHighSpeedVideoFpsRanges(new float[]{android.hardware.SensorManager.getInclination(fArr)});
                    sensorValues4.getHighSpeedVideoFpsRanges = true;
                    sensorValues4.Camera2StreamConfigurationMap = 0;
                    sensorValues4.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(time2);
                    sensorValues4.getHighSpeedVideoSizes = highSpeedVideoFpsRanges2;
                }
            }
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("orientation", sensorValues3);
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("inclination", sensorValues4);
            java.lang.ref.WeakReference<android.content.Context> weakReference = sensorInfo.getHighSpeedVideoFpsRanges;
            android.content.Context context2 = (weakReference == null || weakReference.get() == null) ? null : sensorInfo.getHighSpeedVideoFpsRanges.get();
            my.com.softspace.sspog.attest.SensorValues sensorValues5 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("location");
            if (context2 != null && context2.getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                try {
                    android.location.Location lastKnownLocation = ((android.location.LocationManager) context2.getSystemService("location")).getLastKnownLocation("gps");
                    if (lastKnownLocation != null) {
                        sensorValues5 = new my.com.softspace.sspog.attest.SensorValues(java.lang.Integer.valueOf((int) lastKnownLocation.getAccuracy()), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(lastKnownLocation.getElapsedRealtimeNanos())), my.com.softspace.sspog.attest.SensorInfo.getHighSpeedVideoFpsRanges(new float[]{(float) lastKnownLocation.getLongitude(), (float) lastKnownLocation.getLatitude(), (float) lastKnownLocation.getAltitude()}));
                    }
                } catch (java.lang.NullPointerException | java.lang.SecurityException e2) {
                    my.com.softspace.sspog.attest.SensorValues sensorValues6 = new my.com.softspace.sspog.attest.SensorValues();
                    sspog.SimpleLogger.e("SensorInfo", e2.getLocalizedMessage(), new java.lang.Object[0]);
                    sensorValues5 = sensorValues6;
                }
            }
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("location", sensorValues5);
            my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera = (my.com.softspace.sspog.attest.SensorValuesCamera) my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("camera_front");
            my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera2 = (my.com.softspace.sspog.attest.SensorValuesCamera) my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("camera_back");
            java.lang.String str = "OFF";
            if (context2 != null) {
                android.content.pm.PackageManager packageManager = context2.getPackageManager();
                if (packageManager.hasSystemFeature("android.hardware.camera.any")) {
                    if (packageManager.hasSystemFeature("android.hardware.camera") && sensorValuesCamera2 != null) {
                        sensorValuesCamera2.getHighSpeedVideoSizes(new java.util.Date().getTime(), "OFF");
                    }
                    if (packageManager.hasSystemFeature("android.hardware.camera.front") && sensorValuesCamera != null) {
                        sensorValuesCamera.getHighSpeedVideoSizes(new java.util.Date().getTime(), "OFF");
                    }
                    try {
                        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) context2.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
                        for (java.lang.String str2 : cameraManager.getCameraIdList()) {
                            java.lang.Integer num = (java.lang.Integer) cameraManager.getCameraCharacteristics(str2).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                            if (num != null) {
                                if (num.intValue() == 0) {
                                    if (sensorValuesCamera != null) {
                                        sensorValuesCamera.getHighResolutionOutputSizeshNQ4ISI();
                                    }
                                } else if (num.intValue() == 1 && sensorValuesCamera2 != null) {
                                    sensorValuesCamera2.getHighResolutionOutputSizeshNQ4ISI();
                                }
                            }
                        }
                        cameraManager.registerAvailabilityCallback(new android.hardware.camera2.CameraManager.AvailabilityCallback() { // from class: my.com.softspace.sspog.attest.SensorInfo.1
                            final /* synthetic */ my.com.softspace.sspog.attest.SensorValuesCamera getHighResolutionOutputSizeshNQ4ISI;
                            final /* synthetic */ my.com.softspace.sspog.attest.SensorValuesCamera getHighSpeedVideoFpsRanges;
                            final /* synthetic */ android.hardware.camera2.CameraManager getHighSpeedVideoSizes;

                            AnonymousClass1(android.hardware.camera2.CameraManager cameraManager2, my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera3, my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera22) {
                                r2 = cameraManager2;
                                r3 = sensorValuesCamera3;
                                r4 = sensorValuesCamera22;
                            }

                            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                            public void onCameraAvailable(java.lang.String str3) {
                                super.onCameraAvailable(str3);
                            }

                            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                            public void onCameraUnavailable(java.lang.String str3) {
                                my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera3;
                                super.onCameraUnavailable(str3);
                                try {
                                    java.lang.Integer num2 = (java.lang.Integer) r2.getCameraCharacteristics(str3).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
                                    if (num2 != null) {
                                        if (num2.intValue() == 0) {
                                            my.com.softspace.sspog.attest.SensorValuesCamera sensorValuesCamera4 = r3;
                                            if (sensorValuesCamera4 != null) {
                                                sensorValuesCamera4.Camera2StreamConfigurationMap = 0;
                                                r3.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(new java.util.Date().getTime());
                                                r3.getHighSpeedVideoSizes = "ON";
                                                return;
                                            }
                                            return;
                                        }
                                        if (num2.intValue() != 1 || (sensorValuesCamera3 = r4) == null) {
                                            return;
                                        }
                                        sensorValuesCamera3.Camera2StreamConfigurationMap = 0;
                                        r4.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(new java.util.Date().getTime());
                                        r4.getHighSpeedVideoSizes = "ON";
                                    }
                                } catch (java.lang.Exception e3) {
                                    sspog.SimpleLogger.e("SensorInfo", e3.getLocalizedMessage(), new java.lang.Object[0]);
                                }
                            }
                        }, new android.os.Handler(android.os.Looper.getMainLooper()));
                        java.lang.Thread.sleep(100L);
                    } catch (java.lang.Exception e3) {
                        i = 0;
                        sspog.SimpleLogger.e("SensorInfo", e3.getLocalizedMessage(), new java.lang.Object[0]);
                    }
                }
            }
            i = 0;
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("camera_front", sensorValuesCamera3);
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("camera_back", sensorValuesCamera22);
            my.com.softspace.sspog.attest.SensorValues sensorValues7 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("nfc");
            if (context2 != null && context2.getPackageManager().hasSystemFeature("android.hardware.nfc") && (defaultAdapter = ((android.nfc.NfcManager) context2.getSystemService("nfc")).getDefaultAdapter()) != null && sensorValues7 != null) {
                long time3 = new java.util.Date().getTime();
                java.lang.String str3 = defaultAdapter.isEnabled() ? "ON" : "OFF";
                sensorValues7.getHighSpeedVideoFpsRanges = true;
                sensorValues7.Camera2StreamConfigurationMap = 0;
                sensorValues7.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(time3);
                sensorValues7.getHighSpeedVideoSizes = str3;
            }
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("nfc", sensorValues7);
            my.com.softspace.sspog.attest.SensorValues sensorValues8 = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.get("bluetooth");
            android.bluetooth.BluetoothAdapter defaultAdapter2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter2 != null) {
                if (defaultAdapter2.isEnabled()) {
                    int[] iArr = {2, 1, 7, 8};
                    str = "ON";
                    int i2 = i;
                    while (i2 < 4) {
                        int i3 = iArr[i2];
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            if (context2 != null && androidx.core.app.ActivityCompat.checkSelfPermission(context2, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                if (defaultAdapter2.getProfileConnectionState(i3) != 2) {
                                }
                                str = "CONNECTED";
                            }
                        } else {
                            i2 = defaultAdapter2.getProfileConnectionState(i3) != 2 ? i2 + 1 : i2;
                            str = "CONNECTED";
                        }
                    }
                }
                if (sensorValues8 != null) {
                    long time4 = new java.util.Date().getTime();
                    sensorValues8.getHighSpeedVideoFpsRanges = true;
                    sensorValues8.Camera2StreamConfigurationMap = 0;
                    sensorValues8.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(time4);
                    sensorValues8.getHighSpeedVideoSizes = str;
                }
            }
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("bluetooth", sensorValues8);
            my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI.put("microphone", new my.com.softspace.sspog.attest.SensorValues());
            sensorInfo.getOutputFormats.unregisterListener(sensorInfo);
        } catch (java.lang.Throwable th) {
            java.util.concurrent.CountDownLatch andSet3 = sensorInfo.getHighSpeedVideoSizes.getAndSet(null);
            if (andSet3 != null) {
                andSet3.countDown();
            }
            throw th;
        }
    }

    private org.json.JSONObject Camera2StreamConfigurationMap() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("hardware", this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor());
            jSONObject.put("software", this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap());
            jSONObject.put("application", this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap());
            final my.com.softspace.sspog.attest.SensorInfo sensorInfo = this.getHighSpeedVideoSizes;
            final org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.util.Map<java.lang.String, my.com.softspace.sspog.attest.SensorValues> map = my.com.softspace.sspog.attest.SensorInfo.getHighResolutionOutputSizeshNQ4ISI;
            if (map != null) {
                map.forEach(new java.util.function.BiConsumer() { // from class: my.com.softspace.sspog.attest.SensorInfo$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        my.com.softspace.sspog.attest.SensorInfo.getHighSpeedVideoSizes(jSONObject2, (java.lang.String) obj, (my.com.softspace.sspog.attest.SensorValues) obj2);
                    }
                });
            }
            jSONObject.put("sensor", jSONObject2);
            return jSONObject;
        } catch (org.json.JSONException e) {
            sspog.SimpleLogger.e("AttestInfo", "", e);
            return jSONObject;
        }
    }

    public static java.lang.String getPayload(android.content.Context context, boolean z, boolean z2, byte[] bArr, boolean z3) {
        java.lang.String jSONObject = new my.com.softspace.sspog.attest.AttestInfo(context, z, z2, bArr, z3).Camera2StreamConfigurationMap().toString();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(1024);
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(jSONObject.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                    gZIPOutputStream.close();
                    java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return encodeToString;
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            sspog.SimpleLogger.e("AttestInfo", "", e);
            return null;
        }
    }
}
