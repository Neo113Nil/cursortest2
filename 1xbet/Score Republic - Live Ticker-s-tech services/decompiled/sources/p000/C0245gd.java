package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0245gd implements y11 {

    /* JADX INFO: renamed from: f */
    public static final o31 f2697f = new o31(14);

    /* JADX INFO: renamed from: g */
    public static final C0207fd f2698g = new C0207fd(0);

    /* JADX INFO: renamed from: a */
    public final Context f2699a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2700b;

    /* JADX INFO: renamed from: e */
    public final f50 f2703e;

    /* JADX INFO: renamed from: d */
    public final o31 f2702d = f2697f;

    /* JADX INFO: renamed from: c */
    public final C0207fd f2701c = f2698g;

    public C0245gd(Context context, ArrayList arrayList, InterfaceC0318ic interfaceC0318ic, nk0 nk0Var) {
        this.f2699a = context.getApplicationContext();
        this.f2700b = arrayList;
        this.f2703e = new f50(3, interfaceC0318ic, nk0Var);
    }

    /* JADX INFO: renamed from: d */
    public static int m2029d(i80 i80Var, int i, int i2) {
        int iMin = Math.min(i80Var.f3469g / i2, i80Var.f3468f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + i80Var.f3468f + "x" + i80Var.f3469g + "]");
        }
        return iMax;
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: a */
    public final v11 mo18a(Object obj, int i, int i2, uu0 uu0Var) {
        j80 j80Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C0207fd c0207fd = this.f2701c;
        synchronized (c0207fd) {
            try {
                j80 j80Var2 = (j80) c0207fd.f2378a.poll();
                if (j80Var2 == null) {
                    j80Var2 = new j80();
                }
                j80Var = j80Var2;
                j80Var.f3849b = null;
                Arrays.fill(j80Var.f3848a, (byte) 0);
                j80Var.f3850c = new i80();
                j80Var.f3851d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                j80Var.f3849b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                j80Var.f3849b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return m2030c(byteBuffer, i, i2, j80Var, uu0Var);
        } finally {
            this.f2701c.m1771a(j80Var);
        }
    }

    @Override // p000.y11
    /* JADX INFO: renamed from: b */
    public final boolean mo19b(Object obj, uu0 uu0Var) {
        return !((Boolean) uu0Var.m4955c(k80.f4300b)).booleanValue() && yd0.m5771j(this.f2700b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /* JADX INFO: renamed from: c */
    public final c80 m2030c(ByteBuffer byteBuffer, int i, int i2, j80 j80Var, uu0 uu0Var) {
        StringBuilder sb;
        int i3 = hk0.f3252b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            i80 i80VarM2827b = j80Var.m2827b();
            if (i80VarM2827b.f3465c > 0 && i80VarM2827b.f3464b == 0) {
                Bitmap.Config config = uu0Var.m4955c(k80.f4299a) == EnumC0034aq.f593k ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iM2029d = m2029d(i80VarM2827b, i, i2);
                o31 o31Var = this.f2702d;
                f50 f50Var = this.f2703e;
                o31Var.getClass();
                y91 y91Var = new y91(f50Var, i80VarM2827b, byteBuffer, iM2029d);
                y91Var.m5748c(config);
                y91Var.f9240k = (y91Var.f9240k + 1) % y91Var.f9241l.f3465c;
                Bitmap bitmapM5747b = y91Var.m5747b();
                if (bitmapM5747b == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(hk0.m2289a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                c80 c80Var = new c80(new b80(new a80(new h80(ComponentCallbacks2C0106a.m983a(this.f2699a), y91Var, i, i2, bitmapM5747b))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + hk0.m2289a(jElapsedRealtimeNanos));
                }
                return c80Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(hk0.m2289a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                throw th;
            }
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + hk0.m2289a(jElapsedRealtimeNanos));
            throw th;
        }
    }
}
