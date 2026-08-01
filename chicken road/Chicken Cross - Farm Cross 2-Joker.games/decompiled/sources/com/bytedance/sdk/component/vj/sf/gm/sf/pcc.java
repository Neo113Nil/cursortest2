package com.bytedance.sdk.component.vj.sf.gm.sf;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.component.vj.sf.gm.wh;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class pcc {

    /* renamed from: com.bytedance.sdk.component.vj.sf.gm.sf.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0132pcc {
        void pcc();

        void pcc(Drawable drawable);

        void pcc(byte[] bArr);
    }

    public void pcc(byte[] bArr, wh whVar, InterfaceC0132pcc interfaceC0132pcc) {
        if (Build.VERSION.SDK_INT <= 30) {
            pcc(bArr, interfaceC0132pcc, whVar);
        } else {
            pcc(bArr, interfaceC0132pcc);
        }
    }

    public void pcc(byte[] bArr, InterfaceC0132pcc interfaceC0132pcc) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0132pcc != null) {
                interfaceC0132pcc.pcc(bArr);
                return;
            }
            return;
        }
        try {
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(wrap));
            if (interfaceC0132pcc != null) {
                interfaceC0132pcc.pcc(decodeDrawable);
            }
        } catch (Throwable th) {
            lo.gm("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0132pcc != null) {
                interfaceC0132pcc.pcc();
            }
        }
    }

    private void pcc(final byte[] bArr, final InterfaceC0132pcc interfaceC0132pcc, final wh whVar) {
        try {
            whVar.kj().submit(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.sf.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.sf(bArr, whVar, interfaceC0132pcc);
                }
            });
        } catch (Throwable th) {
            lo.gm("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0132pcc != null) {
                interfaceC0132pcc.pcc();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(byte[] bArr, wh whVar, InterfaceC0132pcc interfaceC0132pcc) {
        FileOutputStream fileOutputStream = null;
        try {
            File pcc = qf.pcc(whVar.pcc(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(pcc);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0132pcc != null) {
                        interfaceC0132pcc.pcc(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(pcc));
                if (interfaceC0132pcc != null) {
                    interfaceC0132pcc.pcc(decodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    lo.pcc("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0132pcc != null) {
                        interfaceC0132pcc.pcc();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
