package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.view.C5306a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;

/* renamed from: androidx.core.view.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5325k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42299a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5327l f42300b;

    /* renamed from: c, reason: collision with root package name */
    private VelocityTracker f42301c;

    /* renamed from: d, reason: collision with root package name */
    private float f42302d;

    /* renamed from: e, reason: collision with root package name */
    private int f42303e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f42304f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f42305g = -1;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f42306h = {Integer.MAX_VALUE, 0};

    public C5325k(@NonNull Context context, @NonNull InterfaceC5327l interfaceC5327l) {
        this.f42299a = context;
        this.f42300b = interfaceC5327l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        if (r4 >= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        if (r10 >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NonNull MotionEvent motionEvent, int i11) {
        char c11;
        char c12;
        int i12;
        int i13;
        boolean z11;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i14 = this.f42304f;
        int[] iArr = this.f42306h;
        if (i14 == source && this.f42305g == deviceId && this.f42303e == i11) {
            z11 = false;
            c11 = 1;
            c12 = 0;
        } else {
            Context context = this.f42299a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i15 = Build.VERSION.SDK_INT;
            c11 = 1;
            c12 = 0;
            if (i15 >= 34) {
                i12 = C5306a0.c.b(viewConfiguration, deviceId2, i11, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i11, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i11 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i12 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i12 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i12 = Integer.MAX_VALUE;
            }
            iArr[0] = i12;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i15 >= 34) {
                i13 = C5306a0.c.a(viewConfiguration, deviceId3, i11, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i11, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i11 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i13 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i13 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i13 = LinearLayoutManager.INVALID_OFFSET;
            }
            iArr[1] = i13;
            this.f42304f = source;
            this.f42305g = deviceId;
            this.f42303e = i11;
            z11 = true;
        }
        if (iArr[c12] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f42301c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f42301c = null;
                return;
            }
            return;
        }
        if (this.f42301c == null) {
            this.f42301c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f42301c;
        Q.a(velocityTracker2, motionEvent);
        Q.b(velocityTracker2);
        float c13 = Q.c(velocityTracker2, i11);
        InterfaceC5327l interfaceC5327l = this.f42300b;
        float a11 = interfaceC5327l.a() * c13;
        float signum = Math.signum(a11);
        if (z11 || (signum != Math.signum(this.f42302d) && signum != 0.0f)) {
            interfaceC5327l.c();
        }
        if (Math.abs(a11) < iArr[c12]) {
            return;
        }
        float max = Math.max(-r1, Math.min(a11, iArr[c11]));
        this.f42302d = interfaceC5327l.b(max) ? max : 0.0f;
    }
}
