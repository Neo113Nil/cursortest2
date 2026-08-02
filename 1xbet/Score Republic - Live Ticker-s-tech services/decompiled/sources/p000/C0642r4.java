package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: r4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0642r4 extends Exception {

    /* JADX INFO: renamed from: j */
    public final Status f6704j;

    public C0642r4(Status status) {
        int i = status.f1341j;
        String str = status.f1342k;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f6704j = status;
    }
}
