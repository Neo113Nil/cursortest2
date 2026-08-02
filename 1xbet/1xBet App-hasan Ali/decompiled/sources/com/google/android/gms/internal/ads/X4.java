package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class X4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: l, reason: collision with root package name */
    public final Application f12147l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f12148m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12146k = 1;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12149n = false;

    public X4(Application application, ViewOnAttachStateChangeListenerC1143j5 viewOnAttachStateChangeListenerC1143j5) {
        this.f12148m = new WeakReference(viewOnAttachStateChangeListenerC1143j5);
        this.f12147l = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f12146k) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f12148m.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f12149n) {
                        this.f12147l.unregisterActivityLifecycleCallbacks(this);
                        this.f12149n = true;
                    }
                    break;
                } catch (Exception e3) {
                    U2.j.g("Error while dispatching lifecycle callback.", e3);
                    return;
                }
        }
    }

    public X4(Application application, M5 m5) {
        this.f12148m = new WeakReference(m5);
        this.f12147l = application;
    }
}
