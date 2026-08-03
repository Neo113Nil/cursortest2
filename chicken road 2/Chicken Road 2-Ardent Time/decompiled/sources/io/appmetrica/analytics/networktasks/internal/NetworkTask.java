package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f7407a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f7408b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy f7409c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy f7410d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask f7411e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.List f7412f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.String f7413g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i2);
    }

    public NetworkTask(java.util.concurrent.Executor executor, io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy iExecutionPolicy, io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy exponentialBackoffPolicy, io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask underlyingNetworkTask, java.util.List<io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition> list, java.lang.String str) {
        this.f7408b = executor;
        this.f7409c = iExecutionPolicy;
        this.f7410d = exponentialBackoffPolicy;
        this.f7411e = underlyingNetworkTask;
        this.f7412f = list;
        this.f7413g = str;
    }

    private synchronized boolean a(int i2) {
        if (!a(i2)) {
            return false;
        }
        this.f7407a = i2;
        return true;
    }

    public java.lang.String description() {
        return this.f7411e.description();
    }

    public io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f7409c;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.f7408b;
    }

    public io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f7410d;
    }

    public io.appmetrica.analytics.networktasks.internal.RequestDataHolder getRequestDataHolder() {
        return this.f7411e.getRequestDataHolder();
    }

    public io.appmetrica.analytics.networktasks.internal.ResponseDataHolder getResponseDataHolder() {
        return this.f7411e.getResponseDataHolder();
    }

    public io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig getRetryPolicyConfig() {
        return this.f7411e.getRetryPolicyConfig();
    }

    public javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.f7411e.getSslSocketFactory();
    }

    public io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask getUnderlyingTask() {
        return this.f7411e;
    }

    public java.lang.String getUrl() {
        return this.f7411e.getFullUrlFormer().getUrl();
    }

    public java.lang.String getUserAgent() {
        return this.f7413g;
    }

    public boolean isRemoved() {
        return this.f7407a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f7411e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a2 = a(4);
        if (a2) {
            this.f7411e.getFullUrlFormer().incrementAttemptNumber();
            this.f7411e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f7411e.onPerformRequest();
        }
        return a2;
    }

    public boolean onRequestComplete() {
        boolean z2;
        boolean z3;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z2 = this.f7411e.onRequestComplete();
                    if (z2) {
                        this.f7407a = 5;
                    } else {
                        this.f7407a = 6;
                    }
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.f7411e.onPostRequestComplete(z2);
        }
        return z2;
    }

    public void onRequestError(java.lang.Throwable th) {
        if (a(6)) {
            this.f7411e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f7411e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a2 = a(2);
        if (a2) {
            this.f7411e.onTaskAdded();
        }
        return a2;
    }

    public void onTaskFinished() {
        int i2;
        boolean a2;
        synchronized (this) {
            i2 = this.f7407a;
            a2 = a(8);
        }
        if (a2) {
            this.f7411e.onTaskFinished();
            if (i2 == 5) {
                this.f7411e.onSuccessfulTaskFinished();
            } else if (i2 == 6 || i2 == 7) {
                this.f7411e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f7411e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z2;
        int i2;
        try {
            hasMoreHosts = this.f7411e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f7411e.getResponseDataHolder().getResponseCode();
            java.util.Iterator it = this.f7412f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                if (!((io.appmetrica.analytics.networktasks.internal.NetworkTask.ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z2 = false;
                    break;
                }
            }
            i2 = this.f7407a;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return i2 != 9 && i2 != 8 && hasMoreHosts && z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:8:0x0077, B:10:0x0081, B:22:0x002a, B:33:0x003f, B:34:0x0042, B:36:0x0047, B:38:0x004c, B:40:0x0051, B:46:0x005d, B:47:0x0060, B:49:0x0065, B:51:0x006a, B:54:0x0071, B:13:0x0084), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(int... iArr) {
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.Boolean bool3;
        try {
            bool = java.lang.Boolean.TRUE;
            int i2 = this.f7407a;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    boolean z2 = true;
                    switch (io.appmetrica.analytics.networktasks.impl.e.a(iArr[i3])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i2 != 1) {
                                z2 = false;
                            }
                            bool3 = java.lang.Boolean.valueOf(z2);
                            break;
                        case 2:
                            if (i2 == 2) {
                                if (i2 == 9) {
                                    bool3 = java.lang.Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = java.lang.Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (i2 != 3 && i2 != 5 && i2 != 6) {
                                if (i2 == 9) {
                                    bool3 = java.lang.Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = java.lang.Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = java.lang.Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = java.lang.Boolean.TRUE;
                                break;
                            }
                        case 6:
                            if (i2 == 3) {
                                bool3 = java.lang.Boolean.TRUE;
                                break;
                            }
                            if (i2 == 2) {
                            }
                            break;
                        case 7:
                            if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 2 && i2 != 3 && i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = java.lang.Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = java.lang.Boolean.TRUE;
                        case 8:
                            if (i2 != 1) {
                                if (i2 == 9) {
                                    z2 = false;
                                }
                                bool3 = java.lang.Boolean.valueOf(z2);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = java.lang.Boolean.FALSE;
                            break;
                    }
                    if (java.lang.Boolean.TRUE.equals(bool3)) {
                        i3++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = java.lang.Boolean.TRUE;
            bool2.equals(bool);
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
