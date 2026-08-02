package com.instagram.common.viewpoint.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class SurfaceHolderCallbackC1736nI implements InterfaceC0426Fo, C8D, InterfaceC0376Dq, B3, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ C9V A00;

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACT(C1830or c1830or, C01775j c01775j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACU(long j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void ACV(Exception exc) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final /* synthetic */ void ACr(int i, long j) {
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final /* synthetic */ void AFF(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final /* synthetic */ void AFl(C1830or c1830or, C01775j c01775j) {
    }

    public SurfaceHolderCallbackC1736nI(C9V c9v) {
        this.A00 = c9v;
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACP(String str, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (hasNext) {
                ((C8D) it.next()).ACP(str, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACQ(C01745g c01745g) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACQ(c01745g);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACR(C01745g c01745g) {
        this.A00.A09 = c01745g;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACR(c01745g);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACS(C1830or c1830or) {
        this.A00.A07 = c1830or;
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACS(c1830or);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8D
    public final void ACY(int i, long j, long j2) {
        Iterator it = this.A00.A0H.iterator();
        while (it.hasNext()) {
            ((C8D) it.next()).ACY(i, j, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0376Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACv(C1779o0 c1779o0) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC01082s) it.next()).ACv(c1779o0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0376Dq
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ACw(List<C1781o2> list) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((InterfaceC01082s) it.next()).ACw(list);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AD7(int i, long j) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0426Fo) it.next()).AD7(i, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.B3
    public final void AEE(Metadata metadata, long j) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((B3) it.next()).AEE(metadata, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AEx(Object obj, long j) {
        if (this.A00.A03 == obj) {
            Iterator it = this.A00.A0L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0426Fo) it2.next()).AEx(obj, j);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AFd(String str, long j, long j2) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0426Fo) it.next()).AFd(str, j, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AFe(C01745g c01745g) {
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0426Fo) it.next()).AFe(c01745g);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AFf(C01745g c01745g) {
        this.A00.A0A = c01745g;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (hasNext) {
                ((InterfaceC0426Fo) it.next()).AFf(c01745g);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AFk(C1830or c1830or) {
        this.A00.A08 = c1830or;
        Iterator it = this.A00.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (hasNext) {
                ((InterfaceC0426Fo) it.next()).AFk(c1830or);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0426Fo
    public final void AFr(C1783o4 c1783o4) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((InterfaceC01514j) it.next()).AFq(c1783o4.A03, c1783o4.A01, c1783o4.A02, c1783o4.A00);
        }
        Iterator it2 = this.A00.A0K.iterator();
        while (it2.hasNext()) {
            InterfaceC0426Fo interfaceC0426Fo = (InterfaceC0426Fo) it2.next();
            String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            interfaceC0426Fo.AFr(c1783o4);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0F(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
