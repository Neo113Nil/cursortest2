package com.unity3d.player;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.view.Surface;
import android.view.WindowInsets;
import com.unity3d.player.a.AbstractC4890t;
import com.unity3d.player.a.C4877f;
import com.unity3d.player.a.EnumC4888q;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class UnityPlayerForActivityOrService extends UnityPlayer {
    private boolean mMainDisplayOverride;
    private com.unity3d.player.a.z mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private AbstractC4933t mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private T m_MainThread;

    private final native boolean nativeDone();

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeMemoryUsageChanged(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnApplyWindowInsets(WindowInsets windowInsets);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    final native void nativeConfigurationChanged(Configuration configuration);

    final native void nativeFocusChanged(boolean z);

    final native void nativeOrientationChanged(int i, int i2);

    final native boolean nativeRender();

    public void onTrimMemory(MemoryUsage memoryUsage) {
        if (com.unity3d.player.a.Q.e) {
            nativeMemoryUsageChanged(memoryUsage.value);
        }
    }

    public enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds = 2000;
        final int value;

        SynchronizationTimeout(int i) {
            this.value = i;
        }

        public void setTimeout(int i) {
            this.m_TimeoutMilliseconds = i;
        }

        public static void setTimeoutForAll(int i) {
            for (SynchronizationTimeout synchronizationTimeout : (SynchronizationTimeout[]) SynchronizationTimeout.class.getEnumConstants()) {
                synchronizationTimeout.setTimeout(i);
            }
        }

        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }
    }

    public enum MemoryUsage {
        Low(1),
        Medium(2),
        High(3),
        Critical(4);

        public final int value;

        MemoryUsage(int i) {
            this.value = i;
        }
    }

    public UnityPlayerForActivityOrService(Context context) {
        this(context, null);
    }

    public UnityPlayerForActivityOrService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        super(context, EnumC4888q.b, iUnityPlayerLifecycleEvents);
        T t = new T(this);
        this.m_MainThread = t;
        this.mMainDisplayOverride = false;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        t.start();
        com.unity3d.player.a.r rVar = new com.unity3d.player.a.r(context, this);
        rVar.setOnApplyWindowInsetsListener(new y0(this));
        initialize(rVar);
        T t2 = this.m_MainThread;
        t2.getClass();
        try {
            t2.b.await();
        } catch (InterruptedException e) {
            AbstractC4890t.Log(6, "UnityMainThread was interrupted:" + e.toString());
        }
    }

    public void setOnHandleFocusListener(com.unity3d.player.a.z zVar) {
        this.mOnHandleFocusListener = zVar;
    }

    @Override // com.unity3d.player.UnityPlayer
    public void configurationChanged(Configuration configuration) {
        super.configurationChanged(configuration);
        if (isNativeInitialized()) {
            invokeOnMainThread(new B0(this, new Configuration(configuration)));
        }
    }

    void sendSurfaceChangedEvent() {
        if (isNativeInitialized()) {
            Message.obtain(this.m_MainThread.c, new C0(this)).sendToTarget();
        }
    }

    void updateGLDisplay(int i, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i, surface);
    }

    private boolean updateDisplayInternal(int i, Surface surface) {
        if (!isNativeInitialized()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        D0 d0 = new D0(this, i, surface, semaphore);
        if (i != 0) {
            d0.run();
        } else if (surface == null) {
            T t = this.m_MainThread;
            Message.obtain(t.c, 2269, S.d).sendToTarget();
            Message.obtain(t.c, d0).sendToTarget();
        } else {
            T t2 = this.m_MainThread;
            Message.obtain(t2.c, d0).sendToTarget();
            Message.obtain(t2.c, 2269, S.e).sendToTarget();
        }
        if (surface != null || i != 0) {
            return true;
        }
        try {
            SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.SurfaceDetach;
            if (semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            AbstractC4890t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            AbstractC4890t.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    public boolean displayChanged(int i, Surface surface) {
        if (i == 0) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new E0(this));
        }
        return updateDisplayInternal(i, surface);
    }

    private void raiseFocusListener(boolean z) {
        com.unity3d.player.a.z zVar = this.mOnHandleFocusListener;
        if (zVar != null) {
            RunnableC4924o0 runnableC4924o0 = ((C4920m0) zVar).f11797a;
            runnableC4924o0.b = true;
            if (runnableC4924o0.f11800a) {
                runnableC4924o0.c.release();
            }
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    boolean handleFocus(boolean z) {
        AbstractC4933t abstractC4933t;
        T t;
        S s;
        if (this.mState.d && ((abstractC4933t = this.mSoftInput) == null || abstractC4933t.c())) {
            if (z) {
                t = this.m_MainThread;
                s = S.g;
            } else {
                t = this.m_MainThread;
                s = S.f;
            }
            Message.obtain(t.c, 2269, s).sendToTarget();
            raiseFocusListener(z);
            return true;
        }
        raiseFocusListener(z);
        return false;
    }

    @Override // com.unity3d.player.UnityPlayer
    void resumeUnity() {
        super.resumeUnity();
        invokeOnMainThread(new F0(this));
        T t = this.m_MainThread;
        Message.obtain(t.c, 2269, S.b).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    void hidePreservedContent() {
        runOnUiThread(new G0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    public void setMainSurfaceViewAspectRatio(float f) {
        runOnUiThread(new H0(this, f));
    }

    @Override // com.unity3d.player.UnityPlayer
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }

    protected void showSoftInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new J0(this, this, str, i, z, z2, z3, z4, str2, i2, z5, z6, semaphore));
        try {
            if (semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                return;
            }
            AbstractC4890t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
        } catch (InterruptedException unused) {
            AbstractC4890t.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }

    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * Math.max(1.0f, Settings.System.getFloat(this.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissSoftInput() {
        AbstractC4933t abstractC4933t = this.mSoftInput;
        if (abstractC4933t != null) {
            abstractC4933t.b();
            nativeReportKeyboardConfigChanged();
        }
    }

    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        reportSoftInputArea(new Rect());
        reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dismissSoftInput();
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        postOnUiThread(new RunnableC4924o0(this, semaphore, this));
        try {
            if (!semaphore.tryAcquire(getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                AbstractC4890t.Log(6, "Timeout (" + getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
            }
        } catch (InterruptedException unused) {
            AbstractC4890t.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
        } finally {
            this.mSoftInput = null;
        }
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC4926p0(this, str));
    }

    protected void setCharacterLimit(int i) {
        runOnUiThread(new RunnableC4928q0(this, i));
    }

    protected void setHideInputField(boolean z) {
        runOnUiThread(new RunnableC4930r0(this, z));
    }

    protected void setSelection(int i, int i2) {
        runOnUiThread(new RunnableC4932s0(this, i, i2));
    }

    protected void reportSoftInputStr(String str, int i, boolean z) {
        if (i == 1) {
            hideSoftInput();
        }
        invokeOnMainThread((Runnable) new C4934t0(this, z, str, i));
    }

    protected void reportSoftInputSelection(int i, int i2) {
        invokeOnMainThread((Runnable) new u0(this, i, i2));
    }

    protected void reportSoftInputArea(Rect rect) {
        invokeOnMainThread((Runnable) new v0(this, rect));
    }

    protected void reportSoftInputIsVisible(boolean z) {
        invokeOnMainThread((Runnable) new w0(this, z));
    }

    boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    @Override // com.unity3d.player.UnityPlayer
    void cleanupResourcesForDestroy() {
        Message.obtain(this.m_MainThread.c, 2269, S.c).sendToTarget();
        try {
            this.m_MainThread.join(SynchronizationTimeout.Destroy.getTimeout());
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (com.unity3d.player.a.Q.e) {
            getFrameLayout().removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        AbstractC4890t.Log(4, "Queue Destroy");
        runOnUiThread(new x0(this));
    }

    @Override // com.unity3d.player.UnityPlayer
    void pauseUnity() {
        Runnable a0;
        super.pauseUnity();
        reportSoftInputStr(null, 1, true);
        com.unity3d.player.a.Q q = this.mState;
        q.b = false;
        q.c = true;
        if (com.unity3d.player.a.Q.e) {
            Semaphore semaphore = new Semaphore(0);
            if (isFinishing()) {
                a0 = new z0(this, semaphore);
            } else {
                a0 = new A0(this, semaphore);
            }
            T t = this.m_MainThread;
            Message.obtain(t.c, 2269, S.f11727a).sendToTarget();
            Message.obtain(t.c, a0).sendToTarget();
            try {
                SynchronizationTimeout synchronizationTimeout = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire(synchronizationTimeout.getTimeout(), TimeUnit.MILLISECONDS)) {
                    AbstractC4890t.Log(5, "Timeout (" + synchronizationTimeout.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                AbstractC4890t.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    @Override // com.unity3d.player.UnityPlayer
    void shutdown() {
        this.mProcessKillRequested = nativeDone();
        super.shutdown();
    }

    @Override // com.unity3d.player.UnityPlayer
    void onOrientationChanged(int i, int i2) {
        T t = this.m_MainThread;
        t.h = this.mNaturalOrientation;
        t.i = i2;
        Message.obtain(t.c, 2269, S.i).sendToTarget();
    }

    @Override // com.unity3d.player.UnityPlayer
    public P getView() {
        return ((com.unity3d.player.a.r) getFrameLayout()).b;
    }

    @Override // com.unity3d.player.UnityPlayer
    public C4877f getSurfaceView() {
        return getView().f11721a;
    }
}
