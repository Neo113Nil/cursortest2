package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class os0 implements Serializable {

    /* JADX INFO: renamed from: j */
    public final Throwable f5852j;

    public os0(Throwable th) {
        this.f5852j = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof os0)) {
            return false;
        }
        Object obj2 = ((os0) obj).f5852j;
        Throwable th = this.f5852j;
        if (th != obj2) {
            return th != null && th.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f5852j.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f5852j + "]";
    }
}
