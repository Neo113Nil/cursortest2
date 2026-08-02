package p000;

import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j00 extends bh0 implements h60 {

    /* JADX INFO: renamed from: l */
    public static final j00 f3761l;

    /* JADX INFO: renamed from: m */
    public static final j00 f3762m;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f3763k;

    static {
        int i = 1;
        f3761l = new j00(i, 0);
        f3762m = new j00(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j00(int i, int i2) {
        super(i);
        this.f3763k = i2;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        String strValueOf;
        switch (this.f3763k) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new g81(absolutePath);
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b : (byte[]) value) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return AbstractC0024an.m286i(new StringBuilder("  "), ((rw0) entry.getKey()).f6986a, " = ", strValueOf);
        }
    }
}
