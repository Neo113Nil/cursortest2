package p000;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g80 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2645b;

    public /* synthetic */ g80(int i, Object obj) {
        this.f2644a = i;
        this.f2645b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.f2644a) {
            case 0:
                h80 h80Var = (h80) this.f2645b;
                int i = message.what;
                if (i == 1) {
                    h80Var.m2227b((f80) message.obj);
                    return true;
                }
                if (i == 2) {
                    h80Var.f3084d.m3461d((f80) message.obj);
                }
                return false;
            case 1:
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                s62 s62Var = (s62) this.f2645b;
                synchronized (s62Var) {
                    try {
                        a82 a82Var = (a82) s62Var.f7043n.get(i2);
                        if (a82Var != null) {
                            s62Var.f7043n.remove(i2);
                            s62Var.m4488c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (a82Var.f69e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            a82Var.m101b(new p61("Invalid response to one way request", null));
                                        } else {
                                            a82Var.m102c(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        a82Var.m102c(bundle);
                                        break;
                                }
                            } else {
                                a82Var.m101b(new p61("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            default:
                int i3 = message.what;
                if (i3 == 0) {
                    j72 j72Var = (j72) this.f2645b;
                    synchronized (j72Var.f3842a) {
                        try {
                            k42 k42Var = (k42) message.obj;
                            o52 o52Var = (o52) j72Var.f3842a.get(k42Var);
                            if (o52Var != null && o52Var.f5630j.isEmpty()) {
                                if (o52Var.f5632l) {
                                    k42 k42Var2 = o52Var.f5634n;
                                    j72 j72Var2 = o52Var.f5636p;
                                    j72Var2.f3844c.removeMessages(1, k42Var2);
                                    j72Var2.f3845d.m625w(j72Var2.f3843b, o52Var);
                                    o52Var.f5632l = false;
                                    o52Var.f5631k = 2;
                                }
                                j72Var.f3842a.remove(k42Var);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return true;
                }
                if (i3 != 1) {
                    return false;
                }
                j72 j72Var3 = (j72) this.f2645b;
                synchronized (j72Var3.f3842a) {
                    try {
                        k42 k42Var3 = (k42) message.obj;
                        o52 o52Var2 = (o52) j72Var3.f3842a.get(k42Var3);
                        if (o52Var2 != null && o52Var2.f5631k == 3) {
                            String strValueOf = String.valueOf(k42Var3);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(strValueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName2 = o52Var2.f5635o;
                            if (componentName2 == null) {
                                k42Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = k42Var3.f4283b;
                                p80.m3863h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            o52Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return true;
        }
    }
}
