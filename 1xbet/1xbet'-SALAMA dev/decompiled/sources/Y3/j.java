package Y3;

import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes2.dex */
public class j extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        D.f(str, "Detail message must not be empty");
    }
}
