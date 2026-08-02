package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0272h3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3020a;

    /* JADX INFO: renamed from: b */
    public final Object f3021b;

    /* JADX INFO: renamed from: c */
    public boolean f3022c;

    public C0272h3() {
        this.f3020a = 2;
        this.f3021b = new Handler(Looper.getMainLooper(), new g21());
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2204a(v11 v11Var, boolean z) {
        try {
            if (this.f3022c || z) {
                ((Handler) this.f3021b).obtainMessage(1, v11Var).sendToTarget();
            } else {
                this.f3022c = true;
                v11Var.mo269e();
                this.f3022c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        switch (this.f3020a) {
            case 0:
                String str = (String) this.f3021b;
                boolean z = this.f3022c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0272h3(int i, String str, boolean z) {
        this.f3020a = i;
        this.f3021b = str;
        this.f3022c = z;
    }
}
