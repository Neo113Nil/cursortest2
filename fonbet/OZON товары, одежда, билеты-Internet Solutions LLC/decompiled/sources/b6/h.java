package b6;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import c6.n;
import c6.o;
import c6.t;

/* loaded from: classes8.dex */
public final class h implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final t f55546a = t.a();

    /* renamed from: b, reason: collision with root package name */
    private final int f55547b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55548c;

    /* renamed from: d, reason: collision with root package name */
    private final T5.b f55549d;

    /* renamed from: e, reason: collision with root package name */
    private final n f55550e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f55551f;

    /* renamed from: g, reason: collision with root package name */
    private final T5.j f55552g;

    final class a implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public h(int i11, int i12, @NonNull T5.i iVar) {
        this.f55547b = i11;
        this.f55548c = i12;
        this.f55549d = (T5.b) iVar.a(o.f56570f);
        this.f55550e = (n) iVar.a(n.f56568h);
        T5.h<Boolean> hVar = o.f56574j;
        this.f55551f = iVar.a(hVar) != null && ((Boolean) iVar.a(hVar)).booleanValue();
        this.f55552g = (T5.j) iVar.a(o.f56571g);
    }

    public final void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        if (this.f55546a.c(this.f55547b, this.f55548c, this.f55551f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f55549d == T5.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i11 = this.f55547b;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getWidth();
        }
        int i12 = this.f55548c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = size.getHeight();
        }
        float b11 = this.f55550e.b(size.getWidth(), size.getHeight(), i11, i12);
        int round = Math.round(size.getWidth() * b11);
        int round2 = Math.round(size.getHeight() * b11);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b11);
        }
        imageDecoder.setTargetSize(round, round2);
        T5.j jVar = this.f55552g;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (jVar == T5.j.DISPLAY_P3) {
                colorSpace = imageInfo.getColorSpace();
                if (colorSpace != null) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2.isWideGamut()) {
                        named = ColorSpace.Named.DISPLAY_P3;
                        imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                    }
                }
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
