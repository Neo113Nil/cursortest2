package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f9881a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f9882b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f9883c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f9884d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f9885e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9886f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9887g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i2);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f9882b = executor;
        this.f9883c = iExecutionPolicy;
        this.f9884d = exponentialBackoffPolicy;
        this.f9885e = underlyingNetworkTask;
        this.f9886f = list;
        this.f9887g = str;
    }

    private synchronized boolean a(int i2) {
        if (!a(i2)) {
            return false;
        }
        this.f9881a = i2;
        return true;
    }

    public String description() {
        return this.f9885e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f9883c;
    }

    public Executor getExecutor() {
        return this.f9882b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f9884d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f9885e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f9885e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f9885e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f9885e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f9885e;
    }

    public String getUrl() {
        return this.f9885e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f9887g;
    }

    public boolean isRemoved() {
        return this.f9881a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f9885e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a6 = a(4);
        if (a6) {
            this.f9885e.getFullUrlFormer().incrementAttemptNumber();
            this.f9885e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f9885e.onPerformRequest();
        }
        return a6;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z5;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z = this.f9885e.onRequestComplete();
                    if (z) {
                        this.f9881a = 5;
                    } else {
                        this.f9881a = 6;
                    }
                    z5 = true;
                } else {
                    z = false;
                    z5 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            this.f9885e.onPostRequestComplete(z);
        }
        return z;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f9885e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f9885e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a6 = a(2);
        if (a6) {
            this.f9885e.onTaskAdded();
        }
        return a6;
    }

    public void onTaskFinished() {
        int i2;
        boolean a6;
        synchronized (this) {
            i2 = this.f9881a;
            a6 = a(8);
        }
        if (a6) {
            this.f9885e.onTaskFinished();
            if (i2 == 5) {
                this.f9885e.onSuccessfulTaskFinished();
            } else if (i2 == 6 || i2 == 7) {
                this.f9885e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f9885e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z;
        int i2;
        try {
            hasMoreHosts = this.f9885e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f9885e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f9886f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z = false;
                    break;
                }
            }
            i2 = this.f9881a;
        } catch (Throwable th) {
            throw th;
        }
        return i2 != 9 && i2 != 8 && hasMoreHosts && z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:8:0x0077, B:10:0x0081, B:22:0x002a, B:33:0x003f, B:34:0x0042, B:36:0x0047, B:38:0x004c, B:40:0x0051, B:46:0x005d, B:47:0x0060, B:49:0x0065, B:51:0x006a, B:54:0x0071, B:13:0x0084), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        try {
            bool = Boolean.TRUE;
            int i2 = this.f9881a;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    boolean z = true;
                    switch (e.a(iArr[i3])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i2 != 1) {
                                z = false;
                            }
                            bool3 = Boolean.valueOf(z);
                            break;
                        case 2:
                            if (i2 == 2) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (i2 != 3 && i2 != 5 && i2 != 6) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 6:
                            if (i2 == 3) {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                            if (i2 == 2) {
                            }
                            break;
                        case 7:
                            if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 2 && i2 != 3 && i2 != 4) {
                                if (i2 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (i2 != 1) {
                                if (i2 == 9) {
                                    z = false;
                                }
                                bool3 = Boolean.valueOf(z);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(bool3)) {
                        i3++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
