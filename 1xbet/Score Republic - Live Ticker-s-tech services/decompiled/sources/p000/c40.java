package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c40 implements Comparator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1086j;

    public /* synthetic */ c40(int i) {
        this.f1086j = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1086j) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                C0948ze c0948ze = (C0948ze) obj;
                C0948ze c0948ze2 = (C0948ze) obj2;
                if (c0948ze.m5883q() && !c0948ze2.m5883q()) {
                    return -1;
                }
                if (!c0948ze2.m5883q() || c0948ze.m5883q()) {
                    return Integer.compare(c0948ze.m5885s().m703o(), c0948ze2.m5885s().m703o());
                }
                return 1;
        }
    }
}
