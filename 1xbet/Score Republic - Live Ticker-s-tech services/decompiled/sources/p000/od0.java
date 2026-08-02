package p000;

import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class od0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5701a;

    static {
        int[] iArr = new int[MessageType.values().length];
        f5701a = iArr;
        try {
            iArr[MessageType.MODAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5701a[MessageType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5701a[MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5701a[MessageType.BANNER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
