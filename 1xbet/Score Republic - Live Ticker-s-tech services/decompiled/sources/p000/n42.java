package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n42 implements f82 {

    /* JADX INFO: renamed from: j */
    public boolean f5297j;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.f82
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Object mo79c(e82 e82Var) throws IOException {
        p42 p42VarM3847a;
        InputStream inputStreamM3875t = p80.m3875t(e82Var);
        try {
            int i = 4096;
            if (this.f5297j) {
                if (inputStreamM3875t instanceof n82) {
                    long length = ((n82) inputStreamM3875t).mo3504a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                p42VarM3847a = p42.m3847a(AbstractC0860x0.m5486K(inputStreamM3875t, i), true);
            } else {
                p42VarM3847a = p42.m3847a(AbstractC0860x0.m5486K(inputStreamM3875t, 4096), false);
            }
            vk1.m5166a(inputStreamM3875t, null);
            return p42VarM3847a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vk1.m5166a(inputStreamM3875t, th);
                throw th2;
            }
        }
    }
}
