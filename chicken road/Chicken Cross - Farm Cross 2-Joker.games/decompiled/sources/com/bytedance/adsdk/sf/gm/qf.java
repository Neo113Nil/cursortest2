package com.bytedance.adsdk.sf.gm;

import android.util.Pair;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class qf<T> {
    T pcc;
    T sf;

    public void pcc(T t, T t2) {
        this.pcc = t;
        this.sf = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return sf(pair.first, this.pcc) && sf(pair.second, this.sf);
    }

    private static boolean sf(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.pcc;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.sf;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.pcc + ServerSentEventKt.SPACE + this.sf + "}";
    }
}
