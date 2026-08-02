package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C0107a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: hd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0282hd implements InterfaceC0810vo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3164a;

    public /* synthetic */ C0282hd(int i) {
        this.f3164a = i;
    }

    @Override // p000.InterfaceC0810vo
    /* JADX INFO: renamed from: a */
    public final Class mo2255a() {
        switch (this.f3164a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC0810vo
    /* JADX INFO: renamed from: b */
    public final InterfaceC0847wo mo2256b(Object obj) {
        switch (this.f3164a) {
            case 0:
                return new C0319id((ByteBuffer) obj, 0);
            case 1:
                return new nu1(13, obj);
            default:
                return new C0107a((ParcelFileDescriptor) obj);
        }
    }
}
