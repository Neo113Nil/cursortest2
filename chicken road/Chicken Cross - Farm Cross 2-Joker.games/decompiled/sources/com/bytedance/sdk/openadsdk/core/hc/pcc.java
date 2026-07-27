package com.bytedance.sdk.openadsdk.core.hc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.sf.gm.vj;
import com.bytedance.sdk.component.vj.sf.gm.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.adsdk.ugeno.pcc {

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0155pcc {
        void pcc(Drawable drawable);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc
    public void pcc(vh vhVar, String str, ImageView imageView, int i, int i2, pcc.InterfaceC0106pcc interfaceC0106pcc) {
        String pcc = oo.pcc(str);
        ork gm2 = com.bytedance.sdk.openadsdk.ork.oo.pcc(pcc).gm(1);
        pcc(vhVar, gm2, pcc);
        gm2.pcc(new gm(imageView, this, i, i2), 4);
    }

    private static class gm implements dax {
        private final int gm;
        private final int oo;
        private final WeakReference<ImageView> pcc;
        private final pcc sf;

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }

        public gm(ImageView imageView, pcc pccVar, int i, int i2) {
            this.pcc = new WeakReference<>(imageView);
            this.sf = pccVar;
            this.gm = i;
            this.oo = i2;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            try {
                final ImageView imageView = this.pcc.get();
                if (imageView == null) {
                    return;
                }
                final Object sf = vhVar.sf();
                if (sf instanceof Drawable) {
                    rnn.pcc((Runnable) new com.bytedance.sdk.component.kj.sf.gm("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.gm.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Object obj = sf;
                                if (obj instanceof AnimatedImageDrawable) {
                                    ((AnimatedImageDrawable) obj).start();
                                }
                            }
                            imageView.setImageDrawable((Drawable) sf);
                        }
                    });
                    return;
                }
                if (sf instanceof byte[]) {
                    if (vhVar.vj()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.sf.pcc((byte[]) sf, imageView);
                            return;
                        } else {
                            this.sf.pcc(imageView, (byte[]) sf, this.gm, this.oo);
                            return;
                        }
                    }
                    if (this.sf.pcc((byte[]) sf)) {
                        this.sf.pcc(imageView, (byte[]) sf, this.gm, this.oo);
                        return;
                    }
                    final Bitmap pcc = new com.bytedance.sdk.component.vj.sf.gm.sf.sf(this.gm, this.oo, imageView.getScaleType(), Bitmap.Config.RGB_565, this.gm, this.oo).pcc((byte[]) sf, new wh(lu.pcc(), new vj.pcc().pcc(com.bytedance.sdk.openadsdk.ork.oo.sf()).pcc()));
                    if (pcc != null) {
                        rnn.pcc((Runnable) new com.bytedance.sdk.component.kj.sf.gm("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.gm.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(pcc);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (sf instanceof Bitmap) {
                    rnn.pcc((Runnable) new com.bytedance.sdk.component.kj.sf.gm("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.gm.3
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) sf);
                        }
                    });
                }
            } catch (Throwable th) {
                lo.gm("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(wrap));
                if (decodeDrawable != null) {
                    rnn.pcc((Runnable) new com.bytedance.sdk.component.kj.sf.gm("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Drawable drawable = decodeDrawable;
                            if (drawable instanceof AnimatedImageDrawable) {
                                ((AnimatedImageDrawable) drawable).start();
                            }
                            imageView.setImageDrawable(decodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e) {
                lo.gm("ImageLoaderProvider", e.getMessage());
                return;
            }
        }
        sf(imageView, bArr, i, i2);
    }

    private void sf(final ImageView imageView, byte[] bArr, int i, int i2) {
        final Bitmap pcc = new com.bytedance.sdk.component.vj.sf.gm.sf.sf(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).pcc(bArr, new wh(lu.pcc(), new vj.pcc().pcc(com.bytedance.sdk.openadsdk.ork.oo.sf()).pcc()));
        if (pcc != null) {
            rnn.pcc((Runnable) new com.bytedance.sdk.component.kj.sf.gm("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(pcc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(byte[] bArr, final ImageView imageView) {
        try {
            pcc(bArr, new InterfaceC0155pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.3
                @Override // com.bytedance.sdk.openadsdk.core.hc.pcc.InterfaceC0155pcc
                public void pcc(final Drawable drawable) {
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (drawable2 instanceof AnimatedImageDrawable) {
                                    ((AnimatedImageDrawable) drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e) {
            lo.gm("ImageLoaderProvider", e.getMessage());
        }
    }

    private void pcc(final byte[] bArr, final InterfaceC0155pcc interfaceC0155pcc) {
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable sf2 = pcc.this.sf(bArr);
                InterfaceC0155pcc interfaceC0155pcc2 = interfaceC0155pcc;
                if (interfaceC0155pcc2 != null) {
                    interfaceC0155pcc2.pcc(sf2);
                }
            }
        });
    }

    public boolean pcc(byte[] bArr) {
        return com.bytedance.sdk.component.utils.vh.pcc(bArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable sf(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File pcc;
        try {
            pcc = qf.pcc(lu.pcc(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(pcc);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(pcc));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return decodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(lu.pcc().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th2) {
            th = th2;
            try {
                lo.pcc("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc
    public void pcc(vh vhVar, String str, pcc.InterfaceC0106pcc interfaceC0106pcc) {
        sf(vhVar, oo.pcc(str), interfaceC0106pcc);
    }

    public void sf(vh vhVar, String str, pcc.InterfaceC0106pcc interfaceC0106pcc) {
        ork gm2 = com.bytedance.sdk.openadsdk.ork.oo.pcc(str).gm(2);
        pcc(vhVar, gm2, str);
        gm2.pcc(new sf(interfaceC0106pcc), 4);
    }

    private static class sf implements dax {
        private final WeakReference<pcc.InterfaceC0106pcc> pcc;

        public sf(pcc.InterfaceC0106pcc interfaceC0106pcc) {
            this.pcc = new WeakReference<>(interfaceC0106pcc);
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            pcc.InterfaceC0106pcc interfaceC0106pcc = this.pcc.get();
            if (vhVar == null) {
                if (interfaceC0106pcc != null) {
                    interfaceC0106pcc.pcc(null);
                }
            } else if (interfaceC0106pcc != null) {
                Object sf = vhVar.sf();
                if (sf instanceof Bitmap) {
                    interfaceC0106pcc.pcc((Bitmap) sf);
                    return;
                }
                if (vhVar.sf() instanceof byte[]) {
                    try {
                        interfaceC0106pcc.pcc(BitmapFactory.decodeByteArray((byte[]) vhVar.sf(), 0, ((byte[]) vhVar.sf()).length));
                        return;
                    } catch (Throwable unused) {
                    }
                }
                interfaceC0106pcc.pcc(null);
            }
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
            pcc.InterfaceC0106pcc interfaceC0106pcc = this.pcc.get();
            if (interfaceC0106pcc != null) {
                interfaceC0106pcc.pcc(null);
            }
        }
    }

    private void pcc(vh vhVar, ork orkVar, String str) {
        Map<String, Object> sf2;
        if (vhVar == null || (sf2 = vhVar.sf()) == null) {
            return;
        }
        Object obj = sf2.get("image_info");
        if (obj instanceof Map) {
            orkVar.pcc((String) ((Map) obj).get(str));
        }
        String str2 = (String) sf2.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        orkVar.sf(str2);
    }
}
