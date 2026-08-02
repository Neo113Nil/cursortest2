package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: i4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0310i4 implements v11 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3424j;

    /* JADX INFO: renamed from: k */
    public final Object f3425k;

    public C0310i4(byte[] bArr) {
        this.f3424j = 1;
        o80.m3647h(bArr, "Argument must not be null");
        this.f3425k = bArr;
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: c */
    public final int mo267c() {
        int i = this.f3424j;
        Object obj = this.f3425k;
        switch (i) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return zg1.m5897h(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) obj).length;
            case 2:
                return 1;
            default:
                return zg1.m5896g((Bitmap) obj);
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: d */
    public final Class mo268d() {
        switch (this.f3424j) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f3425k).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: e */
    public final void mo269e() {
        switch (this.f3424j) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f3425k;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.v11
    public final Object get() {
        int i = this.f3424j;
        Object obj = this.f3425k;
        switch (i) {
            case 0:
                return (AnimatedImageDrawable) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (File) obj;
            default:
                return (Bitmap) obj;
        }
    }

    public /* synthetic */ C0310i4(int i, Object obj) {
        this.f3424j = i;
        this.f3425k = obj;
    }

    public C0310i4(File file) {
        this.f3424j = 2;
        o80.m3647h(file, "Argument must not be null");
        this.f3425k = file;
    }

    /* JADX INFO: renamed from: a */
    private final void m2527a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m2528b() {
    }

    /* JADX INFO: renamed from: f */
    private final void m2529f() {
    }
}
