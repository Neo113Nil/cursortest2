package com.facetec.sdk;

/* loaded from: classes8.dex */
public class aj extends com.facetec.sdk.ai implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.ErrorCallback {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int J;
    private static char[] K;
    private static long L;
    private static /* synthetic */ boolean M;
    private static int N;
    private static final int P = 0;
    private static final byte[] R = null;
    private final java.lang.ref.WeakReference<com.facetec.sdk.bf> q;
    private final android.os.Handler t;
    private int v;
    private android.view.SurfaceHolder w;
    private boolean x;
    private final com.facetec.sdk.j y;
    private com.facetec.sdk.aj.a s = new com.facetec.sdk.aj.a();
    private boolean r = false;
    private android.hardware.Camera p = null;
    private boolean u = false;
    com.facetec.sdk.ao n = null;
    private boolean A = false;
    boolean m = false;
    private boolean C = false;
    private boolean z = false;
    private final android.os.Handler B = new android.os.Handler(android.os.Looper.getMainLooper());
    private java.lang.String D = "";
    private long E = -1;
    private boolean F = false;
    private final java.util.concurrent.atomic.AtomicBoolean I = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final android.hardware.Camera.AutoFocusMoveCallback H = new android.hardware.Camera.AutoFocusMoveCallback() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda11
        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public final void onAutoFocusMoving(boolean z, android.hardware.Camera camera) {
            com.facetec.sdk.aj.this.b(z, camera);
        }
    };
    private final android.hardware.Camera.AutoFocusCallback G = new android.hardware.Camera.AutoFocusCallback() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda12
        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z, android.hardware.Camera camera) {
            com.facetec.sdk.aj.this.c(z, camera);
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = b2 * 3;
        int i4 = 106 - i;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 2);
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = i5 + i6;
            int i10 = i8 + 1;
            i2 = i7;
            i4 = i9;
            i5 = i10;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i3) {
                return new java.lang.String(bArr2, 0);
            }
            int i11 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i7 = i2 + 1;
            i6 = i11;
            int i92 = i5 + i6;
            int i102 = i8 + 1;
            i2 = i7;
            i4 = i92;
            i5 = i102;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == 0 - i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{18, -21, 82, 106};
        $$b = 105;
    }

    @Override // com.facetec.sdk.ai
    final void a() {
    }

    @Override // com.facetec.sdk.ai
    final void e() {
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, android.hardware.Camera camera) {
    }

    static {
        init$0();
        n();
        N = 0;
        J = 1;
        k();
        M = true;
    }

    static /* synthetic */ boolean b(com.facetec.sdk.aj ajVar) {
        ajVar.x = false;
        return false;
    }

    private aj(android.app.Activity activity) {
        this.q = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraHandlerThread");
        handlerThread.start();
        this.t = new android.os.Handler(handlerThread.getLooper());
        this.y = new com.facetec.sdk.j(activity);
    }

    static com.facetec.sdk.aj b(android.app.Activity activity) {
        com.facetec.sdk.aj ajVar = new com.facetec.sdk.aj(activity);
        ajVar.y.getHolder().addCallback(ajVar.s);
        ajVar.x = true;
        return ajVar;
    }

    private static void Q(char c, int i, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(K[i + i3])};
                java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                if (d == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    d = com.facetec.sdk.al.c((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45149), (-16775066) - android.graphics.Color.rgb(0, 0, 0), 24 - (android.os.Process.myTid() >> 22), 1926116241, false, $$c(b, b2, (byte) (b2 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(L), java.lang.Integer.valueOf(c)};
                java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1834 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24, -1880730373, false, $$c(b3, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                if (d3 == null) {
                    char resolveSize = (char) android.view.View.resolveSize(0, 0);
                    int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                    byte length = (byte) $$a.length;
                    d3 = com.facetec.sdk.al.c(resolveSize, 2341 - (fadingEdgeLength >> 16), 25 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), -1839099840, false, $$c((byte) 0, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
            if (d4 == null) {
                char argb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                float length2 = android.graphics.PointF.length(0.0f, 0.0f);
                byte length3 = (byte) $$a.length;
                d4 = com.facetec.sdk.al.c(argb, lastIndexOf + 2342, (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)) + 24, -1839099840, false, $$c((byte) 0, length3, (byte) (length3 - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.facetec.sdk.ai
    void c() {
        if (com.facetec.sdk.ai.f3384a) {
            a(true);
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(byte[] bArr, android.hardware.Camera camera) {
        try {
            java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(this.n.b), java.lang.Integer.valueOf(this.n.c), false};
            java.lang.Object d = com.facetec.sdk.al.d(-524626503);
            if (d == null) {
                d = com.facetec.sdk.al.c((char) (5486 - android.view.View.resolveSizeAndState(0, 0, 0)), android.view.View.combineMeasuredStates(0, 0), 24 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1196797761, false, null, new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Boolean.TYPE});
            }
            a(((java.lang.reflect.Constructor) d).newInstance(objArr));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.facetec.sdk.ai
    final void d(boolean z, final android.view.ViewGroup viewGroup) {
        if (z) {
            this.u = true;
        }
        if (this.z) {
            return;
        }
        if (this.C) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.aj.this.a(viewGroup);
                }
            }, s());
            return;
        }
        c(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.ViewGroup viewGroup) {
        if (s() > 0) {
            return;
        }
        c(viewGroup);
    }

    @Override // com.facetec.sdk.ai
    public final void c(boolean z) {
        o();
    }

    @Override // com.facetec.sdk.ai
    public final android.view.View b() {
        return this.y;
    }

    final class a implements android.view.SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            com.facetec.sdk.aj.this.w = surfaceHolder;
            com.facetec.sdk.aj.c(com.facetec.sdk.aj.this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            com.facetec.sdk.aj.this.o();
            com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) com.facetec.sdk.aj.this.q.get();
            if (blVar == null || !blVar.G || surfaceHolder == null || surfaceHolder.getSurface() == null) {
                return;
            }
            surfaceHolder.removeCallback(this);
            surfaceHolder.getSurface().release();
            com.facetec.sdk.aj.b(com.facetec.sdk.aj.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        try {
            p();
        } catch (java.lang.Exception e) {
            com.facetec.sdk.n.b(e);
            com.facetec.sdk.ay.c(e.getMessage());
            a(e.getMessage());
        }
    }

    final void l() {
        if (this.x) {
            return;
        }
        this.y.getHolder().addCallback(this.s);
        this.x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        synchronized (this) {
            android.hardware.Camera camera = this.p;
            if (camera != null) {
                try {
                    try {
                        camera.cancelAutoFocus();
                        a(true);
                        this.p.setPreviewCallback(null);
                        this.p.release();
                    } catch (java.lang.Exception e) {
                        com.facetec.sdk.ay.c(e.getMessage());
                    }
                    this.p = null;
                } catch (java.lang.Throwable th) {
                    this.p = null;
                    throw th;
                }
            }
            android.os.Handler handler = this.t;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // com.facetec.sdk.ai
    final void d(boolean z) {
        android.hardware.Camera camera = this.p;
        if (camera == null) {
            return;
        }
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        java.util.List<java.lang.String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.size() > 0) {
            if (z && supportedFlashModes.contains("torch")) {
                parameters.setFlashMode("torch");
            } else if (!z && supportedFlashModes.contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                parameters.setFlashMode(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
        }
        this.p.setParameters(parameters);
        a(false);
    }

    @Override // com.facetec.sdk.ai
    final void d(android.view.ViewGroup viewGroup) {
        if (this.q.get() == null || this.p == null || !this.A) {
            return;
        }
        this.z = true;
        this.B.removeCallbacksAndMessages(null);
        this.B.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.aj.this.y();
            }
        }, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
        final android.graphics.Rect d = d(com.facetec.sdk.ai.f, com.facetec.sdk.ai.g, viewGroup);
        this.t.post(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.aj.this.a(d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.graphics.Rect rect) {
        try {
            q();
            d(rect);
        } catch (java.lang.Exception unused) {
            q();
        }
    }

    private long s() {
        if (this.E != -1) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Q((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26770), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Q((char) ((-1) - android.os.Process.getGidForName("")), android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, android.text.TextUtils.getOffsetBefore("", 0) + 8, objArr2);
                long longValue = (((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000) - this.E;
                if (longValue < 8000) {
                    return 8000 - longValue;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return 0L;
    }

    private void c(android.view.ViewGroup viewGroup) {
        if (this.p == null || this.r) {
            return;
        }
        d(d(com.facetec.sdk.ai.f, com.facetec.sdk.ai.g, viewGroup));
    }

    private void d(android.graphics.Rect rect) {
        if (this.r || this.p == null || !this.A) {
            return;
        }
        this.r = true;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Q((char) (26770 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 16 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Q((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionChild(0L) + 17, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 8, objArr2);
            this.E = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000;
            try {
                this.p.cancelAutoFocus();
                android.hardware.Camera.Parameters parameters = this.p.getParameters();
                if (parameters.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    parameters.setFocusMode(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.hardware.Camera.Area(rect, 1000));
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas(arrayList);
                }
                this.p.setParameters(parameters);
                a(false);
                this.p.autoFocus(this.G);
            } catch (java.lang.Exception e) {
                e.getMessage();
                q();
                r();
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static int e(int i) {
        int round = java.lang.Math.round(150.0f);
        return java.lang.Math.abs(i) + round > 1000 ? i > 0 ? 1000 - round : round - 1000 : i - round;
    }

    private static android.graphics.Rect d(float f, float f2, android.view.ViewGroup viewGroup) {
        int e = e(java.lang.Float.valueOf(((f / viewGroup.getWidth()) * 2000.0f) - 1000.0f).intValue());
        int e2 = e(java.lang.Float.valueOf(((f2 / viewGroup.getHeight()) * 2000.0f) - 1000.0f).intValue());
        return new android.graphics.Rect(e, e2, e + 300, e2 + 300);
    }

    private void q() {
        this.r = false;
        android.hardware.Camera camera = this.p;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
        } catch (java.lang.Exception unused) {
        }
    }

    private void r() {
        if (this.p == null || this.D.isEmpty()) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = this.p.getParameters();
            parameters.setFocusMode(this.D);
            if (parameters.getMaxNumFocusAreas() > 0) {
                parameters.setFocusAreas(null);
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(null);
            }
            this.p.setParameters(parameters);
            a(false);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, android.hardware.Camera camera) {
        this.C = !z;
        this.r = z;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Q((char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 26770), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 16, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Q((char) android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, 9 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            this.E = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000;
            boolean z2 = this.C;
            if (this.u && z2) {
                com.facetec.sdk.cq.m(true);
                this.u = false;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z, android.hardware.Camera camera) {
        this.C = z;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Q((char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26770), android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Q((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.Color.rgb(0, 0, 0) + androidx.core.view.InputDeviceCompat.SOURCE_JOYSTICK, 8 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
            this.E = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() / 1000000;
            q();
            if (t()) {
                r();
            }
            if (this.u && z) {
                com.facetec.sdk.cq.m(true);
                this.u = false;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(java.lang.StackTraceElement[] stackTraceElementArr) {
        int i = N;
        boolean z = true;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        int i3 = i2 % 128;
        J = i3;
        int i4 = 2;
        if (i2 % 2 != 0 ? stackTraceElementArr.length < 4 : stackTraceElementArr.length < 5) {
            N = ((i3 & 105) + (i3 | 105)) % 128;
            return;
        }
        if (java.util.Objects.equals(stackTraceElementArr[2].getClassName(), java.lang.reflect.Method.class.getName())) {
            int i5 = J;
            int i6 = ((i5 | 81) << 1) - (i5 ^ 81);
            int i7 = i6 % 128;
            N = i7;
            i4 = i6 % 2 != 0 ? 69 : 3;
            J = ((i7 ^ 113) + ((i7 & 113) << 1)) % 128;
        }
        java.lang.String name2 = ((java.lang.Package) java.util.Objects.requireNonNull(getClass().getPackage())).getName();
        int i8 = N;
        J = ((i8 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i8 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        while (true) {
            if (i4 >= stackTraceElementArr.length) {
                break;
            }
            int i9 = N;
            J = ((i9 & 107) + (i9 | 107)) % 128;
            java.lang.String className = stackTraceElementArr[i4].getClassName();
            if (className.startsWith(name2)) {
                i4++;
            } else if (className.startsWith("android.")) {
                z = false;
            } else {
                int i10 = (J + 19) % 128;
                N = i10;
                J = ((i10 ^ 25) + ((i10 & 25) << 1)) % 128;
            }
        }
        com.facetec.sdk.by.a(com.facetec.sdk.by.a.e, z);
        int i11 = J;
        N = ((i11 & 55) + (i11 | 55)) % 128;
    }

    @Override // com.facetec.sdk.ai
    final void c(android.hardware.Camera.PictureCallback pictureCallback) {
        a(false);
        this.f3385o = false;
        this.p.takePicture(null, null, pictureCallback);
    }

    private static android.hardware.Camera b(android.hardware.Camera.CameraInfo cameraInfo) {
        int i = 0;
        try {
            android.hardware.Camera.getCameraInfo(0, cameraInfo);
        } catch (java.lang.RuntimeException unused) {
            i = 1;
        }
        return android.hardware.Camera.open(i);
    }

    private static android.hardware.Camera d(android.content.Context context, android.hardware.Camera.CameraInfo cameraInfo) throws java.lang.Exception {
        int i;
        try {
            android.hardware.Camera.getCameraInfo(1, cameraInfo);
            i = 1;
        } catch (java.lang.RuntimeException unused) {
            i = 0;
            android.hardware.Camera.getCameraInfo(0, cameraInfo);
        }
        com.facetec.sdk.bc.a("CLOT");
        com.facetec.sdk.bc.a("CLFFT");
        if (cameraInfo.facing == 1) {
            com.facetec.sdk.t.c(context, com.facetec.sdk.c.OPEN_FRONT_CAMERA1, (java.lang.String) null, (java.lang.Throwable) null);
            android.hardware.Camera open = android.hardware.Camera.open(i);
            com.facetec.sdk.bc.c("CLOT");
            return open;
        }
        throw new com.facetec.sdk.av("Front facing camera not available");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7 A[Catch: all -> 0x02e1, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0226 A[Catch: all -> 0x02e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0242 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024b A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0267 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020d A[Catch: all -> 0x02e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0121 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00ad A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174 A[Catch: all -> 0x02e1, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x000e, B:13:0x001a, B:15:0x0023, B:18:0x0028, B:19:0x0035, B:21:0x0040, B:22:0x004c, B:25:0x0053, B:28:0x005b, B:30:0x006d, B:34:0x0080, B:39:0x0083, B:41:0x0086, B:46:0x0092, B:48:0x0097, B:50:0x009b, B:53:0x00a0, B:55:0x00a4, B:56:0x00b5, B:58:0x00b9, B:60:0x00c3, B:63:0x00ce, B:64:0x00d3, B:65:0x00dc, B:73:0x00ff, B:75:0x010e, B:77:0x0128, B:81:0x013c, B:82:0x014f, B:84:0x0156, B:86:0x015a, B:88:0x015e, B:89:0x016e, B:91:0x0174, B:98:0x0194, B:100:0x01c7, B:101:0x01cc, B:106:0x018d, B:107:0x01d3, B:109:0x01f7, B:113:0x0226, B:115:0x022f, B:117:0x0235, B:118:0x023c, B:120:0x0242, B:121:0x0245, B:123:0x024b, B:124:0x024e, B:126:0x0267, B:128:0x026f, B:130:0x0275, B:132:0x027d, B:133:0x0282, B:135:0x0288, B:137:0x0290, B:138:0x0295, B:140:0x0299, B:142:0x029f, B:143:0x02a7, B:149:0x02c7, B:145:0x02cc, B:152:0x0202, B:155:0x020d, B:158:0x0218, B:162:0x0146, B:163:0x0112, B:165:0x0121, B:169:0x00ad, B:170:0x00d4, B:171:0x002f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p() throws java.lang.Exception {
        int rotation;
        int i;
        int i2;
        android.hardware.Camera.Parameters parameters;
        float f;
        int i3;
        java.util.List<java.lang.String> supportedFocusModes;
        java.lang.String str;
        java.util.Iterator<android.hardware.Camera.Size> it;
        android.hardware.Camera.Size size;
        boolean z;
        synchronized (this) {
            com.facetec.sdk.bf bfVar = this.q.get();
            if (bfVar == null) {
                return;
            }
            this.m = false;
            this.u = false;
            this.r = false;
            if (this.p != null) {
                return;
            }
            android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
            if (!d && !com.facetec.sdk.bd.h) {
                this.p = d(bfVar, cameraInfo);
                this.p.setErrorCallback(this);
                if (!f3384a) {
                    java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = this.p.getParameters().getSupportedPreviewSizes();
                    boolean z2 = false;
                    for (int i4 = 0; i4 < supportedPreviewSizes.size(); i4++) {
                        for (int i5 = 0; i5 < supportedPreviewSizes.size(); i5++) {
                            if (i4 != i5 && supportedPreviewSizes.get(i4).width == supportedPreviewSizes.get(i5).width && supportedPreviewSizes.get(i4).height == supportedPreviewSizes.get(i5).height) {
                                z2 = true;
                            }
                        }
                    }
                    if (supportedPreviewSizes.size() >= 2 && !z2) {
                        z = false;
                        com.facetec.sdk.by.a(com.facetec.sdk.by.a.c, z);
                    }
                    z = true;
                    com.facetec.sdk.by.a(com.facetec.sdk.by.a.c, z);
                }
                if (!d && !com.facetec.sdk.bd.h) {
                    if (com.facetec.sdk.bd.e) {
                        this.n = a(this.p);
                    } else {
                        this.n = com.facetec.sdk.br.b(this.p);
                    }
                    if (!M && (b.c != this.n.c || b.b != this.n.b)) {
                        throw new java.lang.AssertionError();
                    }
                    rotation = bfVar.getWindowManager().getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i = 90;
                        } else if (rotation == 2) {
                            i = 180;
                        } else if (rotation == 3) {
                            i = 270;
                        }
                        int i6 = (cameraInfo.orientation + i) % 360;
                        this.v = i6;
                        i2 = (360 - i6) % 360;
                        if (!com.facetec.sdk.ai.d || com.facetec.sdk.bd.h) {
                            i2 = ((cameraInfo.orientation - i) + 360) % 360;
                            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.h)) {
                                this.v = (this.v + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE) % 360;
                            }
                        }
                        j = this.v;
                        this.p.setDisplayOrientation(i2);
                        parameters = this.p.getParameters();
                        if (i2 != 90 && i2 != 270) {
                            f = this.n.c;
                            i3 = this.n.b;
                            float f2 = f / i3;
                            if (d && !com.facetec.sdk.bd.h && com.facetec.sdk.bd.g) {
                                java.util.List<android.hardware.Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                                java.util.Collections.sort(supportedPictureSizes, new java.util.Comparator() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda7
                                    @Override // java.util.Comparator
                                    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                                        int e;
                                        e = com.facetec.sdk.aj.e((android.hardware.Camera.Size) obj, (android.hardware.Camera.Size) obj2);
                                        return e;
                                    }
                                });
                                it = supportedPictureSizes.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        size = it.next();
                                        float f3 = size.width;
                                        if (f3 / size.height == f2 && f3 <= 4096.0f) {
                                            break;
                                        }
                                    } else {
                                        size = supportedPictureSizes.get(0);
                                        break;
                                    }
                                }
                                com.facetec.sdk.c cVar = com.facetec.sdk.c.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_RESOLUTION;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(size.width);
                                sb.append("x");
                                sb.append(size.height);
                                com.facetec.sdk.t.c(bfVar, cVar, sb.toString(), (java.lang.Throwable) null);
                                parameters.setPictureSize(size.width, size.height);
                                com.facetec.sdk.ai.l = new com.facetec.sdk.ao(size.width, size.height);
                                if (cameraInfo.canDisableShutterSound) {
                                    this.p.enableShutterSound(false);
                                }
                                parameters.setPictureSize(size.width, size.height);
                            }
                            parameters.setPreviewSize(this.n.b, this.n.c);
                            parameters.setPreviewFormat(17);
                            parameters.setAutoExposureLock(false);
                            parameters.setAutoWhiteBalanceLock(false);
                            supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                            if (!com.facetec.sdk.ai.d && supportedFocusModes.contains("continuous-picture")) {
                                str = "continuous-picture";
                            } else if (supportedFocusModes.contains("continuous-video")) {
                                str = "continuous-video";
                            } else if (supportedFocusModes.contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                                str = kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                            } else {
                                str = supportedFocusModes.contains("macro") ? "macro" : null;
                            }
                            if (str != null) {
                                this.D = str;
                                parameters.setFocusMode(str);
                                if (f3384a && t()) {
                                    this.p.setAutoFocusMoveCallback(this.H);
                                }
                            }
                            if (parameters.getMaxNumFocusAreas() > 0) {
                                parameters.setFocusAreas(null);
                            }
                            if (parameters.getMaxNumMeteringAreas() > 0) {
                                parameters.setMeteringAreas(null);
                            }
                            bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.aj.this.v();
                                }
                            });
                            int i7 = this.n.c;
                            int i8 = this.n.b;
                            com.facetec.sdk.bc.a("CLCPT");
                            if (!f3384a) {
                                if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.d)) {
                                    java.util.List<java.lang.String> supportedColorEffects = parameters.getSupportedColorEffects();
                                    if (supportedColorEffects != null && supportedColorEffects.contains("none")) {
                                        parameters.setColorEffect("none");
                                    }
                                    java.util.List<java.lang.String> supportedSceneModes = parameters.getSupportedSceneModes();
                                    if (supportedSceneModes != null && supportedSceneModes.contains("steadyphoto")) {
                                        parameters.setSceneMode("steadyphoto");
                                    }
                                }
                                if (!this.F && com.facetec.sdk.bj.c()) {
                                    this.F = true;
                                    com.facetec.sdk.k.d = b(parameters);
                                }
                            }
                            this.p.setParameters(parameters);
                            this.p.setPreviewDisplay(this.w);
                            a(false);
                            this.A = true;
                            com.facetec.sdk.bc.c("CLCPT");
                            if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                                try {
                                    this.p.autoFocus(this);
                                } catch (java.lang.Exception unused) {
                                }
                            }
                            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.aj.this.x();
                                }
                            }, 1000L);
                        }
                        f = this.n.b;
                        i3 = this.n.c;
                        float f22 = f / i3;
                        if (d) {
                            java.util.List<android.hardware.Camera.Size> supportedPictureSizes2 = parameters.getSupportedPictureSizes();
                            java.util.Collections.sort(supportedPictureSizes2, new java.util.Comparator() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda7
                                @Override // java.util.Comparator
                                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                                    int e;
                                    e = com.facetec.sdk.aj.e((android.hardware.Camera.Size) obj, (android.hardware.Camera.Size) obj2);
                                    return e;
                                }
                            });
                            it = supportedPictureSizes2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            com.facetec.sdk.c cVar2 = com.facetec.sdk.c.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_RESOLUTION;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(size.width);
                            sb2.append("x");
                            sb2.append(size.height);
                            com.facetec.sdk.t.c(bfVar, cVar2, sb2.toString(), (java.lang.Throwable) null);
                            parameters.setPictureSize(size.width, size.height);
                            com.facetec.sdk.ai.l = new com.facetec.sdk.ao(size.width, size.height);
                            if (cameraInfo.canDisableShutterSound) {
                            }
                            parameters.setPictureSize(size.width, size.height);
                        }
                        parameters.setPreviewSize(this.n.b, this.n.c);
                        parameters.setPreviewFormat(17);
                        parameters.setAutoExposureLock(false);
                        parameters.setAutoWhiteBalanceLock(false);
                        supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                        if (!com.facetec.sdk.ai.d) {
                        }
                        if (supportedFocusModes.contains("continuous-video")) {
                        }
                        if (str != null) {
                        }
                        if (parameters.getMaxNumFocusAreas() > 0) {
                        }
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                        }
                        bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.aj.this.v();
                            }
                        });
                        int i72 = this.n.c;
                        int i82 = this.n.b;
                        com.facetec.sdk.bc.a("CLCPT");
                        if (!f3384a) {
                        }
                        this.p.setParameters(parameters);
                        this.p.setPreviewDisplay(this.w);
                        a(false);
                        this.A = true;
                        com.facetec.sdk.bc.c("CLCPT");
                        if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                        }
                        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.aj.this.x();
                            }
                        }, 1000L);
                    }
                    i = 0;
                    int i62 = (cameraInfo.orientation + i) % 360;
                    this.v = i62;
                    i2 = (360 - i62) % 360;
                    if (!com.facetec.sdk.ai.d) {
                    }
                    i2 = ((cameraInfo.orientation - i) + 360) % 360;
                    if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.h)) {
                    }
                    j = this.v;
                    this.p.setDisplayOrientation(i2);
                    parameters = this.p.getParameters();
                    if (i2 != 90) {
                        f = this.n.c;
                        i3 = this.n.b;
                        float f222 = f / i3;
                        if (d) {
                        }
                        parameters.setPreviewSize(this.n.b, this.n.c);
                        parameters.setPreviewFormat(17);
                        parameters.setAutoExposureLock(false);
                        parameters.setAutoWhiteBalanceLock(false);
                        supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                        if (!com.facetec.sdk.ai.d) {
                        }
                        if (supportedFocusModes.contains("continuous-video")) {
                        }
                        if (str != null) {
                        }
                        if (parameters.getMaxNumFocusAreas() > 0) {
                        }
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                        }
                        bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.aj.this.v();
                            }
                        });
                        int i722 = this.n.c;
                        int i822 = this.n.b;
                        com.facetec.sdk.bc.a("CLCPT");
                        if (!f3384a) {
                        }
                        this.p.setParameters(parameters);
                        this.p.setPreviewDisplay(this.w);
                        a(false);
                        this.A = true;
                        com.facetec.sdk.bc.c("CLCPT");
                        if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                        }
                        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.aj.this.x();
                            }
                        }, 1000L);
                    }
                    f = this.n.b;
                    i3 = this.n.c;
                    float f2222 = f / i3;
                    if (d) {
                    }
                    parameters.setPreviewSize(this.n.b, this.n.c);
                    parameters.setPreviewFormat(17);
                    parameters.setAutoExposureLock(false);
                    parameters.setAutoWhiteBalanceLock(false);
                    supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                    if (!com.facetec.sdk.ai.d) {
                    }
                    if (supportedFocusModes.contains("continuous-video")) {
                    }
                    if (str != null) {
                    }
                    if (parameters.getMaxNumFocusAreas() > 0) {
                    }
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                    }
                    bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.aj.this.v();
                        }
                    });
                    int i7222 = this.n.c;
                    int i8222 = this.n.b;
                    com.facetec.sdk.bc.a("CLCPT");
                    if (!f3384a) {
                    }
                    this.p.setParameters(parameters);
                    this.p.setPreviewDisplay(this.w);
                    a(false);
                    this.A = true;
                    com.facetec.sdk.bc.c("CLCPT");
                    if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                    }
                    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.aj.this.x();
                        }
                    }, 1000L);
                }
                this.n = e(this.p);
                rotation = bfVar.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0) {
                }
                i = 0;
                int i622 = (cameraInfo.orientation + i) % 360;
                this.v = i622;
                i2 = (360 - i622) % 360;
                if (!com.facetec.sdk.ai.d) {
                }
                i2 = ((cameraInfo.orientation - i) + 360) % 360;
                if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.h)) {
                }
                j = this.v;
                this.p.setDisplayOrientation(i2);
                parameters = this.p.getParameters();
                if (i2 != 90) {
                }
                f = this.n.b;
                i3 = this.n.c;
                float f22222 = f / i3;
                if (d) {
                }
                parameters.setPreviewSize(this.n.b, this.n.c);
                parameters.setPreviewFormat(17);
                parameters.setAutoExposureLock(false);
                parameters.setAutoWhiteBalanceLock(false);
                supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                if (!com.facetec.sdk.ai.d) {
                }
                if (supportedFocusModes.contains("continuous-video")) {
                }
                if (str != null) {
                }
                if (parameters.getMaxNumFocusAreas() > 0) {
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                }
                bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.aj.this.v();
                    }
                });
                int i72222 = this.n.c;
                int i82222 = this.n.b;
                com.facetec.sdk.bc.a("CLCPT");
                if (!f3384a) {
                }
                this.p.setParameters(parameters);
                this.p.setPreviewDisplay(this.w);
                a(false);
                this.A = true;
                com.facetec.sdk.bc.c("CLCPT");
                if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.aj.this.x();
                    }
                }, 1000L);
            }
            this.p = b(cameraInfo);
            this.p.setErrorCallback(this);
            if (!f3384a) {
            }
            if (!d) {
                if (com.facetec.sdk.bd.e) {
                }
                if (!M) {
                    throw new java.lang.AssertionError();
                }
                rotation = bfVar.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0) {
                }
                i = 0;
                int i6222 = (cameraInfo.orientation + i) % 360;
                this.v = i6222;
                i2 = (360 - i6222) % 360;
                if (!com.facetec.sdk.ai.d) {
                }
                i2 = ((cameraInfo.orientation - i) + 360) % 360;
                if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.h)) {
                }
                j = this.v;
                this.p.setDisplayOrientation(i2);
                parameters = this.p.getParameters();
                if (i2 != 90) {
                }
                f = this.n.b;
                i3 = this.n.c;
                float f222222 = f / i3;
                if (d) {
                }
                parameters.setPreviewSize(this.n.b, this.n.c);
                parameters.setPreviewFormat(17);
                parameters.setAutoExposureLock(false);
                parameters.setAutoWhiteBalanceLock(false);
                supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
                if (!com.facetec.sdk.ai.d) {
                }
                if (supportedFocusModes.contains("continuous-video")) {
                }
                if (str != null) {
                }
                if (parameters.getMaxNumFocusAreas() > 0) {
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                }
                bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.aj.this.v();
                    }
                });
                int i722222 = this.n.c;
                int i822222 = this.n.b;
                com.facetec.sdk.bc.a("CLCPT");
                if (!f3384a) {
                }
                this.p.setParameters(parameters);
                this.p.setPreviewDisplay(this.w);
                a(false);
                this.A = true;
                com.facetec.sdk.bc.c("CLCPT");
                if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
                }
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.aj.this.x();
                    }
                }, 1000L);
            }
            this.n = e(this.p);
            rotation = bfVar.getWindowManager().getDefaultDisplay().getRotation();
            if (rotation != 0) {
            }
            i = 0;
            int i62222 = (cameraInfo.orientation + i) % 360;
            this.v = i62222;
            i2 = (360 - i62222) % 360;
            if (!com.facetec.sdk.ai.d) {
            }
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.h)) {
            }
            j = this.v;
            this.p.setDisplayOrientation(i2);
            parameters = this.p.getParameters();
            if (i2 != 90) {
            }
            f = this.n.b;
            i3 = this.n.c;
            float f2222222 = f / i3;
            if (d) {
            }
            parameters.setPreviewSize(this.n.b, this.n.c);
            parameters.setPreviewFormat(17);
            parameters.setAutoExposureLock(false);
            parameters.setAutoWhiteBalanceLock(false);
            supportedFocusModes = this.p.getParameters().getSupportedFocusModes();
            if (!com.facetec.sdk.ai.d) {
            }
            if (supportedFocusModes.contains("continuous-video")) {
            }
            if (str != null) {
            }
            if (parameters.getMaxNumFocusAreas() > 0) {
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
            }
            bfVar.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.aj.this.v();
                }
            });
            int i7222222 = this.n.c;
            int i8222222 = this.n.b;
            com.facetec.sdk.bc.a("CLCPT");
            if (!f3384a) {
            }
            this.p.setParameters(parameters);
            this.p.setPreviewDisplay(this.w);
            a(false);
            this.A = true;
            com.facetec.sdk.bc.c("CLCPT");
            if (!android.os.Build.MANUFACTURER.contains("OnePlus")) {
            }
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.aj.this.x();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.y.setAspectRatio(this.n.c, this.n.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (this.z) {
            this.m = true;
            return;
        }
        q();
        r();
        this.m = true;
    }

    @Override // com.facetec.sdk.ai
    final void d() {
        this.I.set(true);
    }

    private boolean t() {
        java.lang.String str = this.D;
        return str == "continuous-picture" || str == "continuous-video";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(android.hardware.Camera.Size size, android.hardware.Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    static com.facetec.sdk.ao e(android.content.Context context) throws java.lang.Exception {
        com.facetec.sdk.ao a2;
        synchronized (com.facetec.sdk.aj.class) {
            android.hardware.Camera d = d(context, new android.hardware.Camera.CameraInfo());
            a2 = a(d);
            d.stopPreview();
            d.release();
        }
        return a2;
    }

    private static com.facetec.sdk.ao a(android.hardware.Camera camera) {
        android.hardware.Camera.Size preferredPreviewSizeForVideo;
        synchronized (com.facetec.sdk.aj.class) {
            if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.c) && (preferredPreviewSizeForVideo = camera.getParameters().getPreferredPreviewSizeForVideo()) != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(preferredPreviewSizeForVideo.width);
                sb.append("x");
                sb.append(preferredPreviewSizeForVideo.height);
                com.facetec.sdk.k.f = sb.toString();
                return new com.facetec.sdk.ao(preferredPreviewSizeForVideo.width, preferredPreviewSizeForVideo.height);
            }
            float[] fArr = {1.7f, 1.6f, 1.5f, 1.4f, 1.3f};
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            java.util.Collections.sort(supportedPreviewSizes, new java.util.Comparator() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int b;
                    b = com.facetec.sdk.aj.b((android.hardware.Camera.Size) obj, (android.hardware.Camera.Size) obj2);
                    return b;
                }
            });
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(supportedPreviewSizes.get(0).width);
            sb2.append("x");
            sb2.append(supportedPreviewSizes.get(0).height);
            com.facetec.sdk.ai.c = sb2.toString();
            com.facetec.sdk.k.a(supportedPreviewSizes);
            for (int i = 0; i < 5; i++) {
                float f = fArr[i];
                for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                    float f2 = size.width;
                    float f3 = f2 / size.height;
                    if (f3 >= f && f3 <= 1.9f && f2 >= 640.0f && f2 <= 1920.0f) {
                        arrayList.add(size);
                    }
                }
                if (arrayList.size() > 0) {
                    break;
                }
            }
            android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) arrayList.get(0);
            java.util.List<android.hardware.Camera.Size> supportedVideoSizes = camera.getParameters().getSupportedVideoSizes();
            if (supportedVideoSizes != null && !supportedVideoSizes.contains(size2)) {
                com.facetec.sdk.k.h = true;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(((android.hardware.Camera.Size) arrayList.get(0)).width);
            sb3.append("x");
            sb3.append(((android.hardware.Camera.Size) arrayList.get(0)).height);
            com.facetec.sdk.k.f = sb3.toString();
            return new com.facetec.sdk.ao(((android.hardware.Camera.Size) arrayList.get(0)).width, ((android.hardware.Camera.Size) arrayList.get(0)).height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(android.hardware.Camera.Size size, android.hardware.Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    static com.facetec.sdk.ao m() throws java.lang.Exception {
        com.facetec.sdk.ao e;
        synchronized (com.facetec.sdk.aj.class) {
            android.hardware.Camera b = b(new android.hardware.Camera.CameraInfo());
            e = e(b);
            b.stopPreview();
            b.release();
        }
        return e;
    }

    private static com.facetec.sdk.ao e(android.hardware.Camera camera) throws java.lang.Exception {
        com.facetec.sdk.ao aoVar;
        synchronized (com.facetec.sdk.aj.class) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
            float j = j();
            java.util.Collections.sort(supportedPreviewSizes, new java.util.Comparator() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int a2;
                    a2 = com.facetec.sdk.aj.a((android.hardware.Camera.Size) obj, (android.hardware.Camera.Size) obj2);
                    return a2;
                }
            });
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(supportedPreviewSizes.get(0).width);
            sb.append("x");
            sb.append(supportedPreviewSizes.get(0).height);
            com.facetec.sdk.ai.c = sb.toString();
            for (android.hardware.Camera.Size size : supportedPreviewSizes) {
                float f = size.width;
                if (f / size.height == j && f <= 1920.0f) {
                    arrayList.add(size);
                }
            }
            aoVar = new com.facetec.sdk.ao(((android.hardware.Camera.Size) arrayList.get(0)).width, ((android.hardware.Camera.Size) arrayList.get(0)).height);
        }
        return aoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(android.hardware.Camera.Size size, android.hardware.Camera.Size size2) {
        return (size2.width * size2.height) - (size.width * size.height);
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i, android.hardware.Camera camera) {
        if (i == 100) {
            try {
                o();
                p();
                return;
            } catch (java.lang.Exception e) {
                com.facetec.sdk.n.b(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Legacy camera error during cleanup and setup camera: ");
                sb.append(e.getMessage());
                a(sb.toString());
                return;
            }
        }
        com.facetec.sdk.bl blVar = (com.facetec.sdk.bl) this.q.get();
        if (((java.lang.Boolean) com.facetec.sdk.bl.d(new java.lang.Object[]{blVar}, com.facetec.sdk.oh.a.c(), 57224317, -57224293, com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c(), com.facetec.sdk.oh.a.c())).booleanValue() && i == 2) {
            com.facetec.sdk.t.c(blVar, com.facetec.sdk.c.CAMERA_EVICTED_CONTEXT_SWITCH, (java.lang.String) null, (java.lang.Throwable) null);
            return;
        }
        try {
            throw new java.lang.RuntimeException("Legacy camera error: ".concat(java.lang.String.valueOf(i)));
        } catch (java.lang.Exception e2) {
            com.facetec.sdk.n.b(e2);
            a("Legacy camera error with code: ".concat(java.lang.String.valueOf(i)));
        }
    }

    private void a(java.lang.String str) {
        com.facetec.sdk.bf bfVar = this.q.get();
        if (bfVar != null) {
            com.facetec.sdk.t.c(bfVar, com.facetec.sdk.c.CAMERA_LEGACY_ERROR, "CameraLegacy error: ".concat(java.lang.String.valueOf(str)), (java.lang.Throwable) null);
            bfVar.b(str);
        }
    }

    private static org.json.JSONObject b(android.hardware.Camera.Parameters parameters) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("SupportedVideoSizes", e(parameters.getSupportedVideoSizes()));
            jSONObject.put("SupportedPreviewSizes", e(parameters.getSupportedPreviewSizes()));
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    private static java.lang.String e(java.util.List<android.hardware.Camera.Size> list) {
        if (list == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (android.hardware.Camera.Size size : list) {
            sb.append(size.width);
            sb.append("x");
            sb.append(size.height);
            java.lang.Object[] objArr = new java.lang.Object[1];
            O((short) 1019, (short) (P | 688), R[47], objArr);
            sb.append((java.lang.String) objArr[0]);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    static /* synthetic */ void c(final com.facetec.sdk.aj ajVar) {
        ajVar.t.post(new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.aj.this.w();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = R;
        int i3 = 703 - s2;
        int i4 = 1393 - s;
        int i5 = s3 + 44;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            int i9 = i4 + i6;
            int i10 = i8 + 1;
            i = i7;
            i5 = i9;
            i4 = i10;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i2;
            i6 = i11;
            int i92 = i4 + i6;
            int i102 = i8 + 1;
            i = i7;
            i5 = i92;
            i4 = i102;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            if (i2 == i3) {
            }
        }
    }

    static void n() {
        byte[] bArr = new byte[1405];
        java.lang.System.arraycopy("CVËr\u0004û\u0005û\u0001\u0005ú\u0001\u0006ù\u0001\u0007ø\u0001\b÷\u0005û\u0001\tö\fô\u0001\nõ\u0001\u000bô\u0001\fó\ró\u0001\u0004ÿü\u0005ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0001\u0004\u0004÷\fô\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0001\u0004\u0007ô\u0005û\u0001\u0005ú\u0001\u0004\bó\u0005û\u0005ÿü\u0001\u0005þü\u0005û\u0005ÿü\u0001\u0005ÿû\u0001\u0005\u0000ú\u0005û\u0001\u0005ú\u0005û\u0001\u0005\u0001ù\u0001\u0005\u0002ø\u0005û\u0001\u0005ú\u0001\u0005\u0003÷\u0005û\ró\u0001\u0005þü\u0005û\ró\u0001\u0005ÿû\u0001\u0005\u0000ú\u0005\u0003ø\u0001\u0005\u0004ö\u0001\u0005\u0005õ\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0006þû\u0005\u0004÷\u0001\u0006ÿú\u0001\u0006\u0000ù\u0001\u0006\u0001ø\u0005\u0005ö\u0001\u0006\u0002÷\u0001\u0005\u0000ú\u0005\u0006õ\u0005\u0007ô\u0001\u0006\u0003ö\u0005\bó\u0006þü\u0005\u0007ô\u0001\u0006\u0004õ\u0006ÿû\u0006\u0000ú\u0001\u0006\u0004õ\u0006\u0001ù\u0001\u0005\u0000ú\u0001\u0006\u0005ô\u0006\u0002ø\u0006\u0003÷\u0006\u0004ö\u0001\u0006\u0006ó\u0006þü\u0001\u0007üü\u0001\u0007ýû\u0001\u0007þú\u0001\u0007þú\u0001\u0006\u0005ô\u0006\u0002ø\u0006\u0005õ\u0006\u0006ô\u0006\u0007ó\u0001\u0006\u0006ó\u0006þü\u0001\u0007ÿù\u0001\u0007\u0000ø\u0001\u0007\u0001÷\u0001\u0007\u0001÷\u0001\u0007\u0002ö\u0007þû\u0001\u0007\u0003õ\u0007ÿú\u0001\u0007\u0003õ\u0001\u0007\u0004ô\u0005ÿü\u0001\u0007\u0005ó\ró\u0001\u0007\u0005ó\u0001\bûü\u0007\u0000ù\u0001\büû\u0007\u0001ø\u0001\bü÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊ:ù\u0011ò\u0013ê\u0011óÉ\u0015\u001e\fø\rï\u0001û\u0001à\"ó\u0011óü\u0012ò\u000fÜ\"ó\u0011óü\u0012Ì\u001e\u000b\u0000öÿ\u0002\b\rö\u000eýúûÊ:ù\u0011ò\u0013ê\u0011óÉ\u0015\u001e\fø\rïÃ,\"ó\u0011óü\u0012Ì\u001e\u000b\u0000öÿ\u0002\b\u0001í\u0011\u0002Ü\"ó\u0011óü\u0012÷\u0015ëÍ>õ\rùÇDó\u0001È$\u0013\u0001ÿ\ró\tõ\u0002þ\u000f÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùÛ3ô\u0003ø\u0001\r÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÙ\u0018\u000e\u0000î\u0006þ\u000f\u0000õ\tö÷\u0015ëÍ>õ\rùÇ\u00173ë\u0002\u000b\u0004õ\u0006ÿ\u0004û\u0005û\u0001\u0005ú\u0001\u0006ù\u0001\u0007ø\u0001\b÷\u0001\tö\u0001\nõ\u0001\u000bô\u0001\fó\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0007\u0003ö\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0005û\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0001\u0004\u0006õ\u0007\u0004õ\u0001\u0004\u0007ô\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\u0007\u0006ó\u0001\u0005\u0000ú\u0001\u0005\u0001ù\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0001\u0005\u0004ö\u0005û\u0001\u0005\u0005õ\u0005ÿü\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0006þû\u0001\u0006ÿú\u0001\u0006\u0000ù\büü\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0005\u0007ô\u0001\u0006\u0003ö\u0001\tö\u0001\u0006\u0004õ\u0001\u0006\u0005ô\u0001\u0006\u0006ó\u0007\u0006ó\u0001\u0007üü\u0001\u0007ýû\u0001\u0007þú\u0001\u0007ÿù\u0007\u0006ó\u0001\u0007üü\u0001\u0007\u0000ø\u0001\u0007\u0001÷\u0001\u0007\u0002ö\u0001\u0006\u0006ó\u0007\u0006ó\u0001\u0005\u0000ú\u0005\u0004÷\u0001\u0007\u0003õ\u0005û\u0001\u0007\u0004ô\u0001\u0007\u0005ó\u0001\bûü\u0001\tö\u0001\büû\u0001\býú\u0001\bþù\u0007\u0006ó\u0001\u0005\u0000ú\u0005\u0004÷\u0001\u0007\u0003õ\u0005û\u0001\u0007\u0004ô\u0001\u0007\u0005ó\u0001\bþù\u0005û\u0005ÿü\u0001\bÿø\u0001\b\u0000÷\u0005\bó\u0005\bó\u0006\u0000ú\u0001\b\u0001ö\u0006\u0001ù\u0001\u0005\u0004ö\u0006\u0001ù\u0001\u0005\u0004ö\u0005\u0006õ\u0005\u0007ô\u0001\b÷\u0006\u0001ù\u0001\u0005\u0004ö\u0001\b\u0002õ\býû\bþú\bÿù\u0006\u0007ó\u0001\b\u0003ô\u0006þü\u0001\b\u0004ó\u0001\túü\u0001\tûû\u0001\tûû\u0001\tüú\b\u0000ø\b\u0001÷\u0001\týù\u0006þü\u0001\tþø\u0001\tÿ÷\u0001\t\u0000ö\u0001\t\u0001õ\u0005û\u0001\u0005ú\b\u0003õ\u0001\t\u0002ô\u0001\t\u0003ó\u0001\nùü\u0001\b\u0002õ\b\u0004ô\u0006\u0003÷\bÿù\u0006\u0007ó\u0001\b\u0003ô\u0005\bó\u0006\u0007ó\u0001\núû\u0001\nûú\u0001\nüù\u0001\t\u0001õ\u0001\u0006ÿú\u0001\u0006\u0000ù\b\u0005ó\tûü\u0001\nýø\u0001\u0006\u0002÷\u0005\u0007ô\b\u0003õ\u0001\u0006\u0003ö\u0001\tüú\tüû\u0006\u0004ö\u0001\týù\u0005\bó\u0006\u0007ó\u0001\nþ÷\u0001\nÿö\u0001\n\u0000õ\u0001\n\u0000õ\u0001\b\u0002õ\týú\u0006\u0005õ\bþú\bÿù\u0006\u0007ó\u0001\b\u0003ô\u0006þü\u0001\n\u0001ô\u0001\n\u0002ó\u0001\u000bøü\u0001\t\u0001õ\u0006\u0001ù\b\u0003õ\u0001\u0005\u0004ö\u0001\u000bùû\tþù\u0001\u000búú\tÿø\u0001\u000búú\u0001\u000bûù\t\u0000÷\u0001\u000büø\t\u0001ö\u0001\u000büø\u0001\u000bý÷\u0005ÿü\u0001\u000bþö\ró\u0001\u000bþö\u0001\u000bÿõ\t\u0002õ\u0001\u000b\u0000ô\u0007\u0000ù\u0001\u000b\u0000ô\u0001\u000b\u0001ó\t\u0003ô\u0001\f÷ü\t\u0004ó\u0001\f÷ü\u0001\føû\núü\u0001\fùú\nûû\u0001\fù÷\u0015ëÍGÿõ\u0003Â5\fÿõ\u0012ý\u0000ó\t\u0006º3\u0013ûþüúË\u00133ûþüúß-\u0000ýùü\rþ\u000fÍ-öï\u0012\u000f÷\u0015ëÍ>õ\rùÇ&\u0014\nóü\u0003\u0012ý\u0000ó\t\u0006à\u0014\nóü\u0003þ\u000fß!í\u0002\bé\u001eï\u0002\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 1405);
        R = bArr;
        P = 14;
    }

    static void k() {
        K = new char[]{1250, 25103, 51506, 12379, 40766, 1690, 28045, 54444, 13279, 39600, '\'', 28435, 54835, 15698, 42105, 927, 27764, 2717, 41400, 22727, 63446, 28173, 1299, 48181};
        L = 1999702651196672764L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03c4 A[Catch: all -> 0x0691, TryCatch #7 {all -> 0x0691, blocks: (B:38:0x03a2, B:39:0x0651, B:47:0x03be, B:49:0x03c4, B:51:0x03c5, B:95:0x03cf, B:96:0x03ed, B:369:0x03f1, B:371:0x040e, B:378:0x0433, B:380:0x0449, B:386:0x046f, B:387:0x0483, B:388:0x059a, B:390:0x0487, B:396:0x04a2, B:398:0x04b4, B:400:0x04c9, B:402:0x04f4, B:408:0x0519, B:411:0x0535, B:414:0x054d, B:416:0x0557, B:418:0x056b, B:424:0x0590, B:426:0x059f, B:428:0x05b3, B:201:0x05d8, B:202:0x05e7, B:434:0x05e8, B:440:0x060d, B:446:0x0631, B:448:0x0656, B:454:0x067a), top: B:94:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c5 A[Catch: all -> 0x0691, TryCatch #7 {all -> 0x0691, blocks: (B:38:0x03a2, B:39:0x0651, B:47:0x03be, B:49:0x03c4, B:51:0x03c5, B:95:0x03cf, B:96:0x03ed, B:369:0x03f1, B:371:0x040e, B:378:0x0433, B:380:0x0449, B:386:0x046f, B:387:0x0483, B:388:0x059a, B:390:0x0487, B:396:0x04a2, B:398:0x04b4, B:400:0x04c9, B:402:0x04f4, B:408:0x0519, B:411:0x0535, B:414:0x054d, B:416:0x0557, B:418:0x056b, B:424:0x0590, B:426:0x059f, B:428:0x05b3, B:201:0x05d8, B:202:0x05e7, B:434:0x05e8, B:440:0x060d, B:446:0x0631, B:448:0x0656, B:454:0x067a), top: B:94:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07c6 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v92, types: [int] */
    /* JADX WARN: Type inference failed for: r4v95, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(java.lang.Object obj) {
        int i;
        ?? r14;
        java.lang.Object obj2;
        int i2;
        java.lang.Runnable runnable;
        java.lang.Object obj3;
        int i3;
        int i4;
        ?? booleanValue;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Throwable cause;
        com.facetec.sdk.dr drVar = new com.facetec.sdk.dr(this, obj);
        byte[] bArr = R;
        java.lang.Object[] objArr = new java.lang.Object[1];
        O((short) 777, bArr[47], bArr[8], objArr);
        char c = 0;
        java.lang.String str = (java.lang.String) objArr[0];
        short s = (short) 1019;
        int i5 = P;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        O(s, (short) (i5 | 688), bArr[47], objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            short s2 = (short) (i5 | 673);
            char c2 = 378;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            O(s, s2, bArr[378], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            O((short) 1004, (short) 698, bArr[1322], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            O(s, s2, bArr[378], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i6 = 0;
            while (i6 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i6]};
                short s3 = (short) 1000;
                int i7 = P;
                short s4 = (short) (i7 | 672);
                byte[] bArr2 = R;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                O(s3, s4, bArr2[c2], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c]);
                java.lang.Object[] objArr10 = objArr7;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                O((short) 984, (short) 696, (byte) 74, objArr11);
                java.lang.String str3 = (java.lang.String) objArr11[0];
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                O(s, (short) (i7 | 673), bArr2[378], objArr12);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr8);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                O(s3, s4, bArr2[378], objArr13);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                O((short) 978, (short) 695, (byte) (-bArr2[493]), objArr14);
                iArr[i6] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                i6++;
                objArr7 = objArr10;
                c = 0;
                c2 = 378;
            }
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                try {
                    r14 = 38;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (drVar.e(iArr[i8])) {
                    case -92:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE;
                    case -91:
                        drVar.e(30);
                        int i10 = drVar.e;
                        if (i10 == 85 || i10 != 91) {
                            i9 = 117;
                        } else {
                            i8 = 1;
                        }
                        break;
                    case com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants.PAST_90_DAYS /* -90 */:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
                    case -89:
                        drVar.e(30);
                        int i11 = drVar.e;
                        if (i11 != 50 && i11 == 64) {
                        }
                        i8 = 6;
                        break;
                    case -88:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                    case -87:
                        drVar.e(30);
                        int i12 = drVar.e;
                        i8 = (i12 == 19 || i12 != 37) ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE : 45;
                        break;
                    case -86:
                        i8 = 179;
                    case -85:
                        try {
                            drVar.e(30);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i8 < 119 && i8 < 123) {
                                i = 116;
                            } else if (i8 < 142 && i8 < 144) {
                                i = 134;
                            } else {
                                if (i8 >= 167 || i8 >= 169) {
                                    throw th;
                                }
                                i = 165;
                            }
                            i8 = i;
                            drVar.j = th;
                            drVar.e(35);
                        }
                        if (drVar.e != 0) {
                            i9 = 54;
                        } else {
                            i8 = 68;
                        }
                        break;
                    case -84:
                        i8 = 174;
                    case -83:
                        drVar.e(30);
                        i8 = drVar.e != 8 ? 144 : 13;
                    case -82:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                    case -81:
                        try {
                            drVar.e(30);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i8 < 119) {
                            }
                            if (i8 < 142) {
                            }
                            if (i8 >= 167) {
                            }
                            throw th;
                        }
                        if (drVar.e != 7) {
                            i8 = 135;
                        } else {
                            i8 = 38;
                        }
                        break;
                    case -80:
                        i8 = 90;
                    case -79:
                        i8 = 166;
                    case -78:
                        obj2 = null;
                        drVar.e(7);
                        if (drVar.e == 0) {
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                            i8 = i2;
                        }
                    case -77:
                        i8 = 10;
                    case -76:
                        i8 = 153;
                    case -75:
                        obj2 = null;
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i2 = 152;
                            i8 = i2;
                        }
                    case -74:
                        obj2 = null;
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        final com.facetec.sdk.aj ajVar = (com.facetec.sdk.aj) drVar.g;
                        drVar.e(3);
                        final java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) drVar.g;
                        runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facetec.sdk.aj.this.d(stackTraceElementArr);
                            }
                        };
                        drVar.j = runnable;
                        drVar.e(4);
                    case -73:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                    case -72:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
                    case -71:
                        obj2 = null;
                        drVar.e(7);
                        if (drVar.e == 0) {
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
                            i8 = i2;
                        }
                    case -70:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
                    case -69:
                        i8 = 192;
                    case -68:
                        obj2 = null;
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                            i8 = i2;
                        }
                    case -67:
                        drVar.e(46);
                        throw ((java.lang.Throwable) drVar.g);
                    case -66:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
                    case -65:
                        i8 = 197;
                    case -64:
                        obj2 = null;
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i2 = 115;
                            i8 = i2;
                        }
                    case -63:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(13);
                        N = drVar.e;
                    case -62:
                        obj2 = null;
                        i3 = J;
                        drVar.b = i3;
                        drVar.e(6);
                    case -61:
                        i8 = 95;
                    case -60:
                        i8 = 107;
                    case -59:
                        obj2 = null;
                        drVar.e(7);
                        if (drVar.e == 0) {
                            i2 = 106;
                            i8 = i2;
                        }
                    case -58:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(13);
                        J = drVar.e;
                    case -57:
                        obj2 = null;
                        i3 = N;
                        drVar.b = i3;
                        drVar.e(6);
                    case -56:
                        i8 = 108;
                    case -55:
                        i8 = 97;
                    case -54:
                        obj2 = null;
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.ai aiVar = (com.facetec.sdk.ai) drVar.g;
                        drVar.e(13);
                        aiVar.h = drVar.e != 0;
                    case -53:
                        i8 = 80;
                    case -52:
                        i8 = 72;
                    case -51:
                        obj2 = null;
                        drVar.e(7);
                        if (drVar.e == 0) {
                            i2 = 71;
                            i8 = i2;
                        }
                    case -50:
                        i8 = 154;
                    case -49:
                        obj2 = null;
                        drVar.b = 3;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) drVar.g;
                        drVar.e(3);
                        java.lang.Object obj6 = drVar.g;
                        drVar.e(13);
                        cnVar.b$6962e6(obj6, drVar.e);
                    case -48:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        i3 = ((com.facetec.sdk.aj) drVar.g).v;
                        drVar.b = i3;
                        drVar.e(6);
                    case -47:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj3 = drVar.g;
                        drVar.j = obj3;
                        drVar.e(4);
                    case -46:
                        i8 = 60;
                    case -45:
                        obj2 = null;
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i2 = 59;
                            i8 = i2;
                        }
                    case -44:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        i3 = ((com.facetec.sdk.bw) drVar.g).f3442o;
                        drVar.b = i3;
                        drVar.e(6);
                    case -43:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                    case -42:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
                    case -41:
                        obj2 = null;
                        drVar.e(5);
                        if (drVar.e == 0) {
                            i2 = 53;
                            i8 = i2;
                        }
                    case -40:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj3 = ((com.facetec.sdk.bl) drVar.g).z;
                        drVar.j = obj3;
                        drVar.e(4);
                    case -39:
                        i8 = 68;
                    case -38:
                        i8 = 49;
                    case -37:
                        obj2 = null;
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i2 = 48;
                            i8 = i2;
                        }
                    case -36:
                    case -35:
                        obj2 = null;
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj3 = com.facetec.sdk.dk.b((java.lang.Runnable) drVar.g);
                        drVar.j = obj3;
                        drVar.e(4);
                    case -34:
                        try {
                            obj2 = null;
                            drVar.b = 2;
                            drVar.e(2);
                            drVar.e(3);
                            final com.facetec.sdk.aj ajVar2 = (com.facetec.sdk.aj) drVar.g;
                            drVar.e(3);
                            final java.lang.StackTraceElement[] stackTraceElementArr2 = (java.lang.StackTraceElement[]) drVar.g;
                            runnable = new java.lang.Runnable() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.facetec.sdk.aj.this.d(stackTraceElementArr2);
                                }
                            };
                            drVar.j = runnable;
                            drVar.e(4);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i8 < 119) {
                            }
                            if (i8 < 142) {
                            }
                            if (i8 >= 167) {
                            }
                            throw th;
                        }
                        break;
                    case -33:
                        try {
                            drVar.b = 1;
                            drVar.e(2);
                            drVar.e(3);
                            obj5 = drVar.g;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            r14 = 0;
                            if (i8 < 119) {
                                break;
                            }
                            if (i8 < 142) {
                                break;
                            }
                            if (i8 >= 167) {
                                break;
                            }
                            throw th;
                        }
                        try {
                            byte[] bArr3 = R;
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                O(bArr3[402], (short) (P | 673), bArr3[378], objArr15);
                                try {
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                    try {
                                        short s5 = bArr3[47];
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        O(s5, (short) (s5 | 690), (byte) (bArr3[429] + 1), objArr16);
                                        try {
                                            obj2 = null;
                                            try {
                                                obj3 = cls4.getMethod((java.lang.String) objArr16[0], null).invoke(obj5, null);
                                                drVar.j = obj3;
                                                drVar.e(4);
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            cause = th.getCause();
                                            if (cause == null) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        cause = th.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                }
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                        }
                    case -32:
                        try {
                            byte[] bArr4 = R;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            O(bArr4[402], (short) (P | 673), bArr4[378], objArr17);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            O(bArr4[25], (short) 690, (byte) (-bArr4[437]), objArr18);
                            drVar.j = cls5.getMethod((java.lang.String) objArr18[0], null).invoke(null, null);
                            drVar.e(4);
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause2 = th12.getCause();
                            if (cause2 == null) {
                                throw th12;
                            }
                            throw cause2;
                        }
                    case -31:
                        i8 = 185;
                    case -30:
                        i8 = 187;
                    case -29:
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i4 = 37;
                            i8 = i4;
                        }
                    case -28:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj7 = drVar.g;
                        drVar.e(13);
                        try {
                            java.lang.Object[] objArr19 = {java.lang.Boolean.valueOf(drVar.e != 0)};
                            byte[] bArr5 = R;
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            O((short) 75, (short) 662, bArr5[378], objArr20);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            O((short) (bArr5[533] - 1), (short) 694, (byte) (bArr5[429] + 1), objArr21);
                            booleanValue = ((java.lang.Boolean) cls6.getMethod((java.lang.String) objArr21[0], java.lang.Boolean.TYPE).invoke(obj7, objArr19)).booleanValue();
                            drVar.b = booleanValue;
                            drVar.e(6);
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause3 = th13.getCause();
                            if (cause3 == null) {
                                throw th13;
                            }
                            throw cause3;
                        }
                    case -27:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj4 = ((com.facetec.sdk.aj) drVar.g).I;
                        drVar.j = obj4;
                        drVar.e(4);
                    case -26:
                        return;
                    case -25:
                        i8 = 31;
                    case -24:
                        i8 = 30;
                    case -23:
                        drVar.e(38);
                        if (drVar.e == 0) {
                            i4 = 29;
                            i8 = i4;
                        }
                    case -22:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj4 = ((com.facetec.sdk.bf) drVar.g).f3415a;
                        drVar.j = obj4;
                        drVar.e(4);
                    case -21:
                        i8 = 88;
                    case -20:
                        i8 = 25;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i8 = 24;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        drVar.e(38);
                        if (drVar.e == 0) {
                            i4 = 23;
                            i8 = i4;
                        }
                    case -17:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj4 = (com.facetec.sdk.bl) drVar.g;
                        drVar.j = obj4;
                        drVar.e(4);
                    case -16:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj8 = drVar.g;
                        short s6 = (short) 873;
                        short s7 = (short) 680;
                        try {
                            byte[] bArr6 = R;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            O(s6, s7, bArr6[378], objArr22);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            O((short) 851, (short) 700, (byte) (bArr6[429] + 1), objArr23);
                            obj4 = cls7.getMethod((java.lang.String) objArr23[0], null).invoke(obj8, null);
                            drVar.j = obj4;
                            drVar.e(4);
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 == null) {
                                throw th14;
                            }
                            throw cause4;
                        }
                    case -15:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj4 = ((com.facetec.sdk.aj) drVar.g).q;
                        drVar.j = obj4;
                        drVar.e(4);
                    case -14:
                        i();
                    case -13:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.ai aiVar2 = (com.facetec.sdk.ai) drVar.g;
                        drVar.e(13);
                        aiVar2.i = drVar.e != 0;
                    case -12:
                        i8 = 92;
                    case -11:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.bc.c((java.lang.String) drVar.g);
                    case -10:
                        obj4 = "CLFFT";
                        drVar.j = obj4;
                        drVar.e(4);
                    case -9:
                        i8 = 175;
                    case -8:
                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
                    case -7:
                        drVar.e(7);
                        if (drVar.e == 0) {
                            i4 = 9;
                            i8 = i4;
                        }
                    case -6:
                        booleanValue = f3384a;
                        drVar.b = booleanValue;
                        drVar.e(6);
                    case -5:
                    case -4:
                        i8 = 6;
                    case -3:
                        drVar.e(12);
                        i8 = drVar.e == 0 ? 5 : i9;
                    case -2:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        booleanValue = ((com.facetec.sdk.ai) drVar.g).h;
                        drVar.b = booleanValue;
                        drVar.e(6);
                    case -1:
                        i8 = 84;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th15) {
            java.lang.Throwable cause5 = th15.getCause();
            if (cause5 == null) {
                throw th15;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facetec.sdk.ai
    void a(boolean z) {
        java.lang.Object[] objArr;
        int i;
        java.lang.Object obj;
        int i2;
        int i3;
        int i4;
        com.facetec.sdk.dr drVar = new com.facetec.sdk.dr(this, z ? 1 : 0);
        short s = (short) 1389;
        byte[] bArr = R;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        O(s, (short) (s & 990), bArr[8], objArr2);
        char c = 0;
        java.lang.String str = (java.lang.String) objArr2[0];
        short s2 = (short) 1019;
        int i5 = P;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        O(s2, (short) (i5 | 688), bArr[47], objArr3);
        try {
            java.lang.Object[] objArr4 = {(java.lang.String) objArr3[0]};
            short s3 = (short) (i5 | 673);
            char c2 = 378;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            O(s2, s3, bArr[378], objArr5);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            O((short) 1004, (short) 698, bArr[1322], objArr6);
            java.lang.String str2 = (java.lang.String) objArr6[0];
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            O(s2, s3, bArr[378], objArr7);
            java.lang.Object[] objArr8 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i6 = 0;
            while (i6 < objArr8.length) {
                java.lang.Object[] objArr9 = {objArr8[i6]};
                short s4 = (short) 1000;
                int i7 = P;
                short s5 = (short) (i7 | 672);
                byte[] bArr2 = R;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                O(s4, s5, bArr2[c2], objArr10);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr10[c]);
                java.lang.Object[] objArr11 = objArr8;
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                O((short) 984, (short) 696, (byte) 74, objArr12);
                java.lang.String str3 = (java.lang.String) objArr12[0];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                O(s2, (short) (i7 | 673), bArr2[378], objArr13);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr13[0])).invoke(null, objArr9);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                O(s4, s5, bArr2[378], objArr14);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                O((short) 978, (short) 695, (byte) (-bArr2[493]), objArr15);
                iArr[i6] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr15[0], null).invoke(invoke, null)).intValue();
                i6++;
                objArr8 = objArr11;
                c = 0;
                c2 = 378;
            }
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                try {
                    i = 12;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (drVar.e(iArr[i8])) {
                    case -51:
                        i8 = 106;
                    case -50:
                        drVar.e(30);
                        if (drVar.e != 19) {
                            i8 = i;
                        } else {
                            i9 = 14;
                        }
                    case -49:
                        i8 = 101;
                    case -48:
                        drVar.e(30);
                        if (drVar.e != 0) {
                            i9 = 24;
                        } else {
                            i8 = 34;
                        }
                    case -47:
                        i8 = 96;
                    case -46:
                        drVar.e(30);
                        i8 = drVar.e != 9 ? 6 : 19;
                    case -45:
                        i8 = 66;
                    case -44:
                        i8 = 95;
                    case -43:
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i9 = 94;
                        }
                    case -42:
                        i8 = 1;
                    case -41:
                        i8 = 84;
                    case -40:
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i9 = 83;
                        }
                    case -39:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(13);
                        N = drVar.e;
                    case -38:
                        i4 = J;
                        drVar.b = i4;
                        i2 = 6;
                        drVar.e(i2);
                    case -37:
                        i8 = 16;
                    case -36:
                        i8 = 75;
                    case -35:
                        drVar.b = 4;
                        drVar.e(2);
                        drVar.e(3);
                        android.content.Context context = (android.content.Context) drVar.g;
                        drVar.e(3);
                        com.facetec.sdk.c cVar = (com.facetec.sdk.c) drVar.g;
                        drVar.e(3);
                        java.lang.String str4 = (java.lang.String) drVar.g;
                        drVar.e(3);
                        com.facetec.sdk.t.c(context, cVar, str4, (java.lang.Throwable) drVar.g);
                    case -34:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj = drVar.g.toString();
                        drVar.j = obj;
                        i2 = 4;
                        drVar.e(i2);
                    case -33:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj2 = drVar.g;
                        drVar.e(3);
                        try {
                            java.lang.Object[] objArr16 = {drVar.g};
                            byte[] bArr3 = R;
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            O((short) 849, (short) 680, bArr3[378], objArr17);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            O((short) com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, (short) 697, bArr3[1327], objArr18);
                            java.lang.String str5 = (java.lang.String) objArr18[0];
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            O(s2, (short) (P | 673), bArr3[378], objArr19);
                            obj = cls4.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr19[0])).invoke(obj2, objArr16);
                            drVar.j = obj;
                            i2 = 4;
                            drVar.e(i2);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    case -32:
                        try {
                            drVar.b = 1;
                            drVar.e(2);
                            drVar.e(3);
                            java.lang.Object obj3 = drVar.g;
                            short s6 = (short) 827;
                            short s7 = (short) 684;
                            try {
                                byte[] bArr4 = R;
                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                O(s6, s7, bArr4[378], objArr20);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                O((short) 809, (short) 693, (byte) (bArr4[429] + 1), objArr21);
                                try {
                                    obj = cls5.getMethod((java.lang.String) objArr21[0], null).invoke(obj3, null);
                                    drVar.j = obj;
                                    i2 = 4;
                                    drVar.e(i2);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            objArr = new java.lang.Object[1];
                            O((short) 795, (short) 684, R[378], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th) || i8 < 34 || i8 >= 49) {
                                throw th;
                            }
                            drVar.j = th;
                            drVar.e(35);
                            i8 = 49;
                        }
                        break;
                    case -31:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        try {
                            java.lang.Object[] objArr22 = {drVar.g};
                            byte[] bArr5 = R;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            O((short) 849, (short) 680, bArr5[378], objArr23);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            O(s2, (short) (P | 673), bArr5[378], objArr24);
                            obj = cls6.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr24[0])).newInstance(objArr22);
                            drVar.j = obj;
                            i2 = 4;
                            drVar.e(i2);
                        } catch (java.lang.Throwable th6) {
                            java.lang.Throwable cause3 = th6.getCause();
                            if (cause3 == null) {
                                throw th6;
                            }
                            throw cause3;
                        }
                    case -30:
                        obj = "EXCEPTION: startPreview failed -- ";
                        drVar.j = obj;
                        i2 = 4;
                        drVar.e(i2);
                    case -29:
                        obj = com.facetec.sdk.c.STARTPREVIEW_EXCEPTION;
                        drVar.j = obj;
                        i2 = 4;
                        drVar.e(i2);
                    case -28:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj = drVar.g;
                        drVar.j = obj;
                        i2 = 4;
                        drVar.e(i2);
                    case -27:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj4 = drVar.g;
                        short s8 = (short) 873;
                        short s9 = (short) 680;
                        try {
                            byte[] bArr6 = R;
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            O(s8, s9, bArr6[378], objArr25);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            O((short) 851, (short) 700, (byte) (bArr6[429] + 1), objArr26);
                            obj = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj4, null);
                            drVar.j = obj;
                            i2 = 4;
                            drVar.e(i2);
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause4 = th7.getCause();
                            if (cause4 == null) {
                                throw th7;
                            }
                            throw cause4;
                        }
                    case -26:
                        try {
                            drVar.b = 1;
                            drVar.e(2);
                            drVar.e(3);
                            obj = ((com.facetec.sdk.aj) drVar.g).q;
                            drVar.j = obj;
                            i2 = 4;
                            drVar.e(i2);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            objArr = new java.lang.Object[1];
                            O((short) 795, (short) 684, R[378], objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                break;
                            }
                            throw th;
                        }
                    case -25:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj5 = drVar.g;
                        short s10 = (short) 971;
                        short s11 = (short) 680;
                        try {
                            byte[] bArr7 = R;
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            O(s10, s11, bArr7[1327], objArr27);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                            try {
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                O((short) 884, (short) 691, bArr7[1322], objArr28);
                                cls8.getMethod((java.lang.String) objArr28[0], null).invoke(obj5, null);
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                java.lang.Throwable cause5 = th.getCause();
                                if (cause5 == null) {
                                    throw th;
                                }
                                throw cause5;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                        }
                    case -24:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj6 = drVar.g;
                        drVar.e(3);
                        try {
                            java.lang.Object[] objArr29 = {drVar.g};
                            byte[] bArr8 = R;
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            O((short) 971, (short) 680, bArr8[1327], objArr30);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            O((short) 939, (short) 685, bArr8[1322], objArr31);
                            java.lang.String str6 = (java.lang.String) objArr31[0];
                            short s12 = (short) 922;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            O(s12, (short) (s12 & 3836), bArr8[1327], objArr32);
                            cls9.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr32[0])).invoke(obj6, objArr29);
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause6 = th11.getCause();
                            if (cause6 == null) {
                                throw th11;
                            }
                            throw cause6;
                        }
                    case -23:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        final com.facetec.sdk.aj ajVar = (com.facetec.sdk.aj) drVar.g;
                        drVar.j = new android.hardware.Camera.PreviewCallback() { // from class: com.facetec.sdk.aj$$ExternalSyntheticLambda6
                            @Override // android.hardware.Camera.PreviewCallback
                            public final void onPreviewFrame(byte[] bArr9, android.hardware.Camera camera) {
                                com.facetec.sdk.aj.this.b(bArr9, camera);
                            }
                        };
                        i2 = 4;
                        drVar.e(i2);
                    case -22:
                        return;
                    case -21:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.ai aiVar = (com.facetec.sdk.ai) drVar.g;
                        drVar.e(13);
                        aiVar.f3385o = drVar.e != 0;
                    case -20:
                        drVar.b = 2;
                        drVar.e(2);
                        drVar.e(3);
                        com.facetec.sdk.aj ajVar2 = (com.facetec.sdk.aj) drVar.g;
                        drVar.e(13);
                        ajVar2.A = drVar.e != 0;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        java.lang.Object obj7 = drVar.g;
                        short s13 = (short) 971;
                        short s14 = (short) 680;
                        try {
                            byte[] bArr9 = R;
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            O(s13, s14, bArr9[1327], objArr33);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                            short s15 = (short) 949;
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            O(s15, (short) (s15 & 3838), bArr9[1322], objArr34);
                            cls10.getMethod((java.lang.String) objArr34[0], null).invoke(obj7, null);
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause7 = th12.getCause();
                            if (cause7 == null) {
                                throw th12;
                            }
                            throw cause7;
                        }
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i8 = 102;
                    case -17:
                        i8 = 104;
                    case -16:
                        drVar.e(12);
                        if (drVar.e == 0) {
                            i3 = 23;
                            i8 = i3;
                        }
                    case -15:
                        i8 = 73;
                    case -14:
                        i8 = 20;
                    case -13:
                    case -12:
                        drVar.e(11);
                        if (drVar.e == 0) {
                            i3 = 18;
                            i8 = i3;
                        }
                    case -11:
                        i8 = 70;
                    case -10:
                        i8 = 85;
                    case -9:
                        i8 = 107;
                    case -8:
                        i8 = 109;
                    case -7:
                        drVar.e(7);
                        i8 = drVar.e == 0 ? 11 : i9;
                    case -6:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        i4 = ((com.facetec.sdk.aj) drVar.g).A;
                        drVar.b = i4;
                        i2 = 6;
                        drVar.e(i2);
                    case -5:
                        i8 = 97;
                    case -4:
                        i8 = 99;
                    case -3:
                        i = 5;
                        drVar.e(5);
                        if (drVar.e == 0) {
                            i8 = i;
                        }
                    case -2:
                        drVar.b = 1;
                        drVar.e(2);
                        drVar.e(3);
                        obj = ((com.facetec.sdk.aj) drVar.g).p;
                        drVar.j = obj;
                        i2 = 4;
                        drVar.e(i2);
                    case -1:
                        i8 = 63;
                    default:
                }
            }
            throw th;
        } catch (java.lang.Throwable th13) {
            java.lang.Throwable cause8 = th13.getCause();
            if (cause8 == null) {
                throw th13;
            }
            throw cause8;
        }
    }
}
